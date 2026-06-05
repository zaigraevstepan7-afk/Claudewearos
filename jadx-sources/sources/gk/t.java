package gk;

import f1.n0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class t implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f7514e = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final kk.h f7515a;

    /* renamed from: b, reason: collision with root package name */
    public final s f7516b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7517c;

    /* renamed from: d, reason: collision with root package name */
    public final d f7518d;

    public t(kk.x xVar, boolean z2) {
        this.f7515a = xVar;
        this.f7517c = z2;
        s sVar = new s(xVar);
        this.f7516b = sVar;
        this.f7518d = new d(sVar);
    }

    public static int b(int i10, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        g.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
        throw null;
    }

    public static int t(kk.h hVar) {
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public final void C(p pVar, int i10, byte b10, int i11) throws IOException {
        if (i11 == 0) {
            g.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short s10 = (b10 & 8) != 0 ? (short) (this.f7515a.readByte() & 255) : (short) 0;
        int i12 = this.f7515a.readInt() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        ArrayList arrayListN = n(b(i10 - 4, b10, s10), s10, b10, i11);
        q qVar = (q) pVar.f7491d;
        synchronized (qVar) {
            try {
                if (qVar.O.contains(Integer.valueOf(i12))) {
                    qVar.D(i12, 2);
                    return;
                }
                qVar.O.add(Integer.valueOf(i12));
                try {
                    qVar.l(new k(qVar, new Object[]{qVar.f7496d, Integer.valueOf(i12)}, i12, arrayListN));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7515a.close();
    }

    public final boolean e(boolean z2, p pVar) throws IOException {
        int i10;
        int i11;
        x[] xVarArr;
        try {
            this.f7515a.b0(9L);
            int iT = t(this.f7515a);
            if (iT < 0 || iT > 16384) {
                g.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iT));
                throw null;
            }
            byte b10 = (byte) (this.f7515a.readByte() & 255);
            if (z2 && b10 != 4) {
                g.c("Expected a SETTINGS frame but was %s", Byte.valueOf(b10));
                throw null;
            }
            byte b11 = (byte) (this.f7515a.readByte() & 255);
            int i12 = this.f7515a.readInt();
            int i13 = Integer.MAX_VALUE & i12;
            Logger logger = f7514e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(true, i13, iT, b10, b11));
            }
            switch (b10) {
                case 0:
                    l(pVar, iT, b11, i13);
                    return true;
                case 1:
                    s(pVar, iT, b11, i13);
                    return true;
                case 2:
                    if (iT != 5) {
                        g.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iT));
                        throw null;
                    }
                    if (i13 == 0) {
                        g.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    kk.h hVar = this.f7515a;
                    hVar.readInt();
                    hVar.readByte();
                    return true;
                case 3:
                    if (iT != 4) {
                        g.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iT));
                        throw null;
                    }
                    if (i13 == 0) {
                        g.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int i14 = this.f7515a.readInt();
                    int[] iArrC = y3.e.c(11);
                    int length = iArrC.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length) {
                            i10 = iArrC[i15];
                            if (b.c(i10) != i14) {
                                i15++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    if (i10 == 0) {
                        g.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i14));
                        throw null;
                    }
                    q qVar = (q) pVar.f7491d;
                    if (i13 != 0 && (i12 & 1) == 0) {
                        i = 1;
                    }
                    if (i != 0) {
                        qVar.l(new k(qVar, new Object[]{qVar.f7496d, Integer.valueOf(i13)}, i13, i10));
                        return true;
                    }
                    x xVarN = qVar.n(i13);
                    if (xVarN != null) {
                        synchronized (xVarN) {
                            if (xVarN.f7539k == 0) {
                                xVarN.f7539k = i10;
                                xVarN.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                case 4:
                    kk.h hVar2 = this.f7515a;
                    if (i13 != 0) {
                        g.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((b11 & 1) != 0) {
                        if (iT != 0) {
                            g.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            throw null;
                        }
                        return true;
                    }
                    if (iT % 6 != 0) {
                        g.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iT));
                        throw null;
                    }
                    n0 n0Var = new n0(1, false);
                    for (int i16 = 0; i16 < iT; i16 += 6) {
                        int i17 = hVar2.readShort() & 65535;
                        int i18 = hVar2.readInt();
                        if (i17 == 2) {
                            if (i18 != 0 && i18 != 1) {
                                g.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                throw null;
                            }
                        } else if (i17 == 3) {
                            i17 = 4;
                        } else if (i17 != 4) {
                            if (i17 == 5 && (i18 < 16384 || i18 > 16777215)) {
                                g.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i18));
                                throw null;
                            }
                        } else {
                            if (i18 < 0) {
                                g.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                throw null;
                            }
                            i17 = 7;
                        }
                        n0Var.h(i17, i18);
                    }
                    q qVar2 = (q) pVar.f7491d;
                    qVar2.A.execute(new p(pVar, new Object[]{qVar2.f7496d}, n0Var));
                    return true;
                case 5:
                    C(pVar, iT, b11, i13);
                    return true;
                case 6:
                    if (iT != 8) {
                        g.c("TYPE_PING length != 8: %s", Integer.valueOf(iT));
                        throw null;
                    }
                    if (i13 != 0) {
                        g.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i19 = this.f7515a.readInt();
                    int i20 = this.f7515a.readInt();
                    if (((b11 & 1) != 0 ? 1 : 0) == 0) {
                        q qVar3 = (q) pVar.f7491d;
                        qVar3.A.execute(new o(qVar3, i19, i20));
                        return true;
                    }
                    synchronized (((q) pVar.f7491d)) {
                        try {
                            if (i19 == 1) {
                                ((q) pVar.f7491d).D++;
                            } else if (i19 == 2) {
                                ((q) pVar.f7491d).F++;
                            } else if (i19 == 3) {
                                ((q) pVar.f7491d).notifyAll();
                            }
                        } finally {
                        }
                    }
                    return true;
                case 7:
                    if (iT < 8) {
                        g.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iT));
                        throw null;
                    }
                    if (i13 != 0) {
                        g.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i21 = this.f7515a.readInt();
                    int i22 = this.f7515a.readInt();
                    int i23 = iT - 8;
                    int[] iArrC2 = y3.e.c(11);
                    int length2 = iArrC2.length;
                    int i24 = 0;
                    while (true) {
                        if (i24 < length2) {
                            i11 = iArrC2[i24];
                            if (b.c(i11) != i22) {
                                i24++;
                            }
                        } else {
                            i11 = 0;
                        }
                    }
                    if (i11 == 0) {
                        g.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i22));
                        throw null;
                    }
                    kk.i iVarH = kk.i.f9700d;
                    if (i23 > 0) {
                        iVarH = this.f7515a.h(i23);
                    }
                    iVarH.e();
                    synchronized (((q) pVar.f7491d)) {
                        xVarArr = (x[]) ((q) pVar.f7491d).f7495c.values().toArray(new x[((q) pVar.f7491d).f7495c.size()]);
                        ((q) pVar.f7491d).f7499z = true;
                    }
                    int length3 = xVarArr.length;
                    while (i < length3) {
                        x xVar = xVarArr[i];
                        if (xVar.f7532c > i21 && xVar.g()) {
                            synchronized (xVar) {
                                if (xVar.f7539k == 0) {
                                    xVar.f7539k = 5;
                                    xVar.notifyAll();
                                }
                            }
                            ((q) pVar.f7491d).n(xVar.f7532c);
                        }
                        i++;
                    }
                    return true;
                case 8:
                    if (iT != 4) {
                        g.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iT));
                        throw null;
                    }
                    long j = this.f7515a.readInt() & 2147483647L;
                    if (j == 0) {
                        g.c("windowSizeIncrement was 0", Long.valueOf(j));
                        throw null;
                    }
                    if (i13 == 0) {
                        synchronized (((q) pVar.f7491d)) {
                            q qVar4 = (q) pVar.f7491d;
                            qVar4.I += j;
                            qVar4.notifyAll();
                        }
                        return true;
                    }
                    x xVarE = ((q) pVar.f7491d).e(i13);
                    if (xVarE != null) {
                        synchronized (xVarE) {
                            xVarE.f7531b += j;
                            if (j > 0) {
                                xVarE.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                default:
                    this.f7515a.skip(iT);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void g(p pVar) {
        if (this.f7517c) {
            if (e(true, pVar)) {
                return;
            }
            g.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        kk.i iVar = g.f7466a;
        kk.i iVarH = this.f7515a.h(iVar.f9701a.length);
        Level level = Level.FINE;
        Logger logger = f7514e;
        if (logger.isLoggable(level)) {
            String strF = iVarH.f();
            byte[] bArr = bk.d.f1785a;
            Locale locale = Locale.US;
            logger.fine("<< CONNECTION " + strF);
        }
        if (iVar.equals(iVarH)) {
            return;
        }
        g.c("Expected a connection header but was %s", iVarH.D());
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x011d, code lost:
    
        if (r8 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011f, code lost:
    
        r3.i(bk.d.f1787c, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(gk.p r17, int r18, byte r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.t.l(gk.p, int, byte, int):void");
    }

    public final ArrayList n(int i10, short s10, byte b10, int i11) throws IOException {
        s sVar = this.f7516b;
        sVar.f7512e = i10;
        sVar.f7509b = i10;
        sVar.f7513f = s10;
        sVar.f7510c = b10;
        sVar.f7511d = i11;
        d dVar = this.f7518d;
        kk.x xVar = dVar.f7449b;
        ArrayList arrayList = dVar.f7448a;
        while (!xVar.b()) {
            byte b11 = xVar.readByte();
            int i12 = b11 & 255;
            if (i12 == 128) {
                throw new IOException("index == 0");
            }
            if ((b11 & 128) == 128) {
                int iE = dVar.e(i12, 127);
                int i13 = iE - 1;
                if (i13 >= 0) {
                    c[] cVarArr = f.f7464a;
                    if (i13 <= cVarArr.length - 1) {
                        arrayList.add(cVarArr[i13]);
                    }
                }
                int length = dVar.f7453f + 1 + (i13 - f.f7464a.length);
                if (length >= 0) {
                    c[] cVarArr2 = dVar.f7452e;
                    if (length < cVarArr2.length) {
                        arrayList.add(cVarArr2[length]);
                    }
                }
                throw new IOException(m6.a.d(iE, "Header index too large "));
            }
            if (i12 == 64) {
                kk.i iVarD = dVar.d();
                f.a(iVarD);
                dVar.c(new c(iVarD, dVar.d()));
            } else if ((b11 & 64) == 64) {
                dVar.c(new c(dVar.b(dVar.e(i12, 63) - 1), dVar.d()));
            } else if ((b11 & 32) == 32) {
                int iE2 = dVar.e(i12, 31);
                dVar.f7451d = iE2;
                if (iE2 < 0 || iE2 > dVar.f7450c) {
                    throw new IOException("Invalid dynamic table size update " + dVar.f7451d);
                }
                int i14 = dVar.f7455h;
                if (iE2 < i14) {
                    if (iE2 == 0) {
                        Arrays.fill(dVar.f7452e, (Object) null);
                        dVar.f7453f = dVar.f7452e.length - 1;
                        dVar.f7454g = 0;
                        dVar.f7455h = 0;
                    } else {
                        dVar.a(i14 - iE2);
                    }
                }
            } else if (i12 == 16 || i12 == 0) {
                kk.i iVarD2 = dVar.d();
                f.a(iVarD2);
                arrayList.add(new c(iVarD2, dVar.d()));
            } else {
                arrayList.add(new c(dVar.b(dVar.e(i12, 15) - 1), dVar.d()));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    public final void s(p pVar, int i10, byte b10, int i11) throws IOException {
        if (i11 == 0) {
            g.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z2 = (b10 & 1) != 0;
        short s10 = (b10 & 8) != 0 ? (short) (this.f7515a.readByte() & 255) : (short) 0;
        if ((b10 & 32) != 0) {
            kk.h hVar = this.f7515a;
            hVar.readInt();
            hVar.readByte();
            i10 -= 5;
        }
        ArrayList arrayListN = n(b(i10, b10, s10), s10, b10, i11);
        q qVar = (q) pVar.f7491d;
        if (i11 != 0 && (i11 & 1) == 0) {
            try {
                qVar.l(new k(qVar, new Object[]{qVar.f7496d, Integer.valueOf(i11)}, i11, arrayListN, z2));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (qVar) {
            try {
                x xVarE = ((q) pVar.f7491d).e(i11);
                if (xVarE != null) {
                    xVarE.i(bk.d.r(arrayListN), z2);
                    return;
                }
                q qVar2 = (q) pVar.f7491d;
                if (qVar2.f7499z) {
                    return;
                }
                if (i11 <= qVar2.f7497e) {
                    return;
                }
                if (i11 % 2 == qVar2.f7498f % 2) {
                    return;
                }
                x xVar = new x(i11, (q) pVar.f7491d, false, z2, bk.d.r(arrayListN));
                q qVar3 = (q) pVar.f7491d;
                qVar3.f7497e = i11;
                qVar3.f7495c.put(Integer.valueOf(i11), xVar);
                q.P.execute(new p(pVar, new Object[]{((q) pVar.f7491d).f7496d, Integer.valueOf(i11)}, xVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
