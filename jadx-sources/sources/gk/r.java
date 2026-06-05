package gk;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kk.c0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class r implements ek.b {

    /* renamed from: g, reason: collision with root package name */
    public static final List f7500g = bk.d.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f7501h = bk.d.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final ek.e f7502a;

    /* renamed from: b, reason: collision with root package name */
    public final dk.e f7503b;

    /* renamed from: c, reason: collision with root package name */
    public final q f7504c;

    /* renamed from: d, reason: collision with root package name */
    public volatile x f7505d;

    /* renamed from: e, reason: collision with root package name */
    public final ak.s f7506e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f7507f;

    public r(ak.r rVar, dk.e eVar, ek.e eVar2, q qVar) {
        this.f7503b = eVar;
        this.f7502a = eVar2;
        this.f7504c = qVar;
        List list = rVar.f710b;
        ak.s sVar = ak.s.H2_PRIOR_KNOWLEDGE;
        this.f7506e = list.contains(sVar) ? sVar : ak.s.HTTP_2;
    }

    @Override // ek.b
    public final c0 a(ak.z zVar) {
        return this.f7505d.f7536g;
    }

    @Override // ek.b
    public final kk.b0 b(ak.w wVar, long j) {
        return this.f7505d.f();
    }

    @Override // ek.b
    public final void c() {
        this.f7505d.f().close();
    }

    @Override // ek.b
    public final void cancel() {
        this.f7507f = true;
        if (this.f7505d != null) {
            this.f7505d.e(6);
        }
    }

    @Override // ek.b
    public final long d(ak.z zVar) {
        return ek.d.a(zVar);
    }

    @Override // ek.b
    public final ak.y e(boolean z2) throws NumberFormatException, IOException {
        ak.l lVar;
        x xVar = this.f7505d;
        synchronized (xVar) {
            xVar.f7538i.h();
            while (xVar.f7534e.isEmpty() && xVar.f7539k == 0) {
                try {
                    try {
                        xVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th2) {
                    xVar.f7538i.k();
                    throw th2;
                }
            }
            xVar.f7538i.k();
            if (xVar.f7534e.isEmpty()) {
                IOException iOException = xVar.f7540l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new b0(xVar.f7539k);
            }
            lVar = (ak.l) xVar.f7534e.removeFirst();
        }
        ak.s sVar = this.f7506e;
        ArrayList arrayList = new ArrayList(20);
        int iF = lVar.f();
        ak.x xVarJ = null;
        for (int i10 = 0; i10 < iF; i10++) {
            String strD = lVar.d(i10);
            String strG = lVar.g(i10);
            if (strD.equals(":status")) {
                xVarJ = ak.x.j("HTTP/1.1 " + strG);
            } else if (!f7501h.contains(strD)) {
                ak.j.f658c.getClass();
                arrayList.add(strD);
                arrayList.add(strG.trim());
            }
        }
        if (xVarJ == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        ak.y yVar = new ak.y();
        yVar.f746b = sVar;
        yVar.f747c = xVarJ.f742b;
        yVar.f748d = (String) xVarJ.f744d;
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        yh.c cVar = new yh.c(2);
        Collections.addAll((ArrayList) cVar.f20314b, strArr);
        yVar.f750f = cVar;
        if (z2) {
            ak.j.f658c.getClass();
            if (yVar.f747c == 100) {
                return null;
            }
        }
        return yVar;
    }

    @Override // ek.b
    public final dk.e f() {
        return this.f7503b;
    }

    @Override // ek.b
    public final void g(ak.w wVar) throws IOException {
        int i10;
        x xVar;
        boolean z2;
        if (this.f7505d != null) {
            return;
        }
        boolean z10 = wVar.f738d != null;
        ak.l lVar = wVar.f737c;
        ArrayList arrayList = new ArrayList(lVar.f() + 4);
        arrayList.add(new c(c.f7441f, wVar.f736b));
        kk.i iVar = c.f7442g;
        ak.n nVar = wVar.f735a;
        String str = nVar.f681i;
        int iIndexOf = str.indexOf(47, nVar.f673a.length() + 3);
        String strSubstring = str.substring(iIndexOf, bk.d.g(iIndexOf, str.length(), str, "?#"));
        String strE = nVar.e();
        if (strE != null) {
            strSubstring = strSubstring + '?' + strE;
        }
        arrayList.add(new c(iVar, strSubstring));
        String strC = wVar.f737c.c("Host");
        if (strC != null) {
            arrayList.add(new c(c.f7444i, strC));
        }
        arrayList.add(new c(c.f7443h, nVar.f673a));
        int iF = lVar.f();
        for (int i11 = 0; i11 < iF; i11++) {
            String lowerCase = lVar.d(i11).toLowerCase(Locale.US);
            if (!f7500g.contains(lowerCase) || (lowerCase.equals("te") && lVar.g(i11).equals("trailers"))) {
                arrayList.add(new c(lowerCase, lVar.g(i11)));
            }
        }
        q qVar = this.f7504c;
        boolean z11 = !z10;
        synchronized (qVar.M) {
            synchronized (qVar) {
                try {
                    if (qVar.f7498f > 1073741823) {
                        qVar.s(5);
                    }
                    if (qVar.f7499z) {
                        throw new a();
                    }
                    i10 = qVar.f7498f;
                    qVar.f7498f = i10 + 2;
                    xVar = new x(i10, qVar, z11, false, null);
                    z2 = !z10 || qVar.I == 0 || xVar.f7531b == 0;
                    if (xVar.h()) {
                        qVar.f7495c.put(Integer.valueOf(i10), xVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qVar.M.n(z11, i10, arrayList);
        }
        if (z2) {
            qVar.M.flush();
        }
        this.f7505d = xVar;
        if (this.f7507f) {
            this.f7505d.e(6);
            throw new IOException("Canceled");
        }
        w wVar2 = this.f7505d.f7538i;
        long j = this.f7502a.f6092h;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wVar2.g(j);
        this.f7505d.j.g(this.f7502a.f6093i);
    }

    @Override // ek.b
    public final void h() {
        this.f7504c.flush();
    }
}
