package gk;

import f1.n0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class y implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final Logger f7541z = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final kk.g f7542a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7543b;

    /* renamed from: c, reason: collision with root package name */
    public final kk.f f7544c;

    /* renamed from: d, reason: collision with root package name */
    public int f7545d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7546e;

    /* renamed from: f, reason: collision with root package name */
    public final e f7547f;

    public y(kk.v vVar, boolean z2) {
        this.f7542a = vVar;
        this.f7543b = z2;
        kk.f fVar = new kk.f();
        this.f7544c = fVar;
        this.f7547f = new e(fVar);
        this.f7545d = 16384;
    }

    public final synchronized void C(int i10, long j) {
        if (this.f7546e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            g.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        g(i10, 4, (byte) 8, (byte) 0);
        this.f7542a.writeInt((int) j);
        this.f7542a.flush();
    }

    public final synchronized void b(n0 n0Var) {
        try {
            if (this.f7546e) {
                throw new IOException("closed");
            }
            int i10 = this.f7545d;
            int i11 = n0Var.f6400a;
            if ((i11 & 32) != 0) {
                i10 = n0Var.f6401b[5];
            }
            this.f7545d = i10;
            if (((i11 & 2) != 0 ? n0Var.f6401b[1] : -1) != -1) {
                e eVar = this.f7547f;
                int iMin = Math.min((i11 & 2) != 0 ? n0Var.f6401b[1] : -1, 16384);
                int i12 = eVar.f7459d;
                if (i12 != iMin) {
                    if (iMin < i12) {
                        eVar.f7457b = Math.min(eVar.f7457b, iMin);
                    }
                    eVar.f7458c = true;
                    eVar.f7459d = iMin;
                    int i13 = eVar.f7463h;
                    if (iMin < i13) {
                        if (iMin == 0) {
                            Arrays.fill(eVar.f7460e, (Object) null);
                            eVar.f7461f = eVar.f7460e.length - 1;
                            eVar.f7462g = 0;
                            eVar.f7463h = 0;
                        } else {
                            eVar.a(i13 - iMin);
                        }
                    }
                }
            }
            g(0, 0, (byte) 4, (byte) 1);
            this.f7542a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f7546e = true;
        this.f7542a.close();
    }

    public final synchronized void e(boolean z2, int i10, kk.f fVar, int i11) {
        if (this.f7546e) {
            throw new IOException("closed");
        }
        g(i10, i11, (byte) 0, z2 ? (byte) 1 : (byte) 0);
        if (i11 > 0) {
            this.f7542a.Y(i11, fVar);
        }
    }

    public final synchronized void flush() {
        if (this.f7546e) {
            throw new IOException("closed");
        }
        this.f7542a.flush();
    }

    public final void g(int i10, int i11, byte b10, byte b11) {
        Level level = Level.FINE;
        Logger logger = f7541z;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f7545d;
        if (i11 > i12) {
            g.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            throw null;
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            g.b("reserved bit set: %s", Integer.valueOf(i10));
            throw null;
        }
        kk.g gVar = this.f7542a;
        gVar.writeByte((i11 >>> 16) & 255);
        gVar.writeByte((i11 >>> 8) & 255);
        gVar.writeByte(i11 & 255);
        gVar.writeByte(b10 & 255);
        gVar.writeByte(b11 & 255);
        gVar.writeInt(i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final synchronized void l(int i10, byte[] bArr, int i11) {
        try {
            if (this.f7546e) {
                throw new IOException("closed");
            }
            if (b.c(i11) == -1) {
                g.b("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            g(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f7542a.writeInt(i10);
            this.f7542a.writeInt(b.c(i11));
            if (bArr.length > 0) {
                this.f7542a.write(bArr);
            }
            this.f7542a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void n(boolean z2, int i10, ArrayList arrayList) {
        if (this.f7546e) {
            throw new IOException("closed");
        }
        this.f7547f.d(arrayList);
        long j = this.f7544c.f9695b;
        int iMin = (int) Math.min(this.f7545d, j);
        long j4 = iMin;
        byte b10 = j == j4 ? (byte) 4 : (byte) 0;
        if (z2) {
            b10 = (byte) (b10 | 1);
        }
        g(i10, iMin, (byte) 1, b10);
        this.f7542a.Y(j4, this.f7544c);
        if (j > j4) {
            long j10 = j - j4;
            while (j10 > 0) {
                int iMin2 = (int) Math.min(this.f7545d, j10);
                long j11 = iMin2;
                j10 -= j11;
                g(i10, iMin2, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
                this.f7542a.Y(j11, this.f7544c);
            }
        }
    }

    public final synchronized void s(int i10, int i11, boolean z2) {
        if (this.f7546e) {
            throw new IOException("closed");
        }
        g(0, 8, (byte) 6, z2 ? (byte) 1 : (byte) 0);
        this.f7542a.writeInt(i10);
        this.f7542a.writeInt(i11);
        this.f7542a.flush();
    }

    public final synchronized void t(int i10, int i11) {
        if (this.f7546e) {
            throw new IOException("closed");
        }
        if (b.c(i11) == -1) {
            throw new IllegalArgumentException();
        }
        g(i10, 4, (byte) 3, (byte) 0);
        this.f7542a.writeInt(b.c(i11));
        this.f7542a.flush();
    }
}
