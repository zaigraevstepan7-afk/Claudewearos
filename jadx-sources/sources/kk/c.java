package kk;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9677a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9678b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9679c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f9677a = i10;
        this.f9678b = obj;
        this.f9679c = obj2;
    }

    @Override // kk.b0
    public final void Y(long j, f fVar) throws IOException {
        switch (this.f9677a) {
            case 0:
                hj.a.n(fVar.f9695b, 0L, j);
                long j4 = j;
                while (true) {
                    long j10 = 0;
                    if (j4 <= 0) {
                        return;
                    }
                    y yVar = fVar.f9694a;
                    fj.l.c(yVar);
                    while (true) {
                        if (j10 < 65536) {
                            j10 += yVar.f9743c - yVar.f9742b;
                            if (j10 >= j4) {
                                j10 = j4;
                            } else {
                                yVar = yVar.f9746f;
                                fj.l.c(yVar);
                            }
                        }
                    }
                    lk.g gVar = (lk.g) this.f9678b;
                    c cVar = (c) this.f9679c;
                    gVar.h();
                    try {
                        try {
                            cVar.Y(j10, fVar);
                            if (gVar.i()) {
                                throw gVar.k(null);
                            }
                            j4 -= j10;
                        } catch (IOException e10) {
                            if (!gVar.i()) {
                                throw e10;
                            }
                            throw gVar.k(e10);
                        }
                    } catch (Throwable th2) {
                        gVar.i();
                        throw th2;
                    }
                }
            default:
                hj.a.n(fVar.f9695b, 0L, j);
                while (j > 0) {
                    ((e0) this.f9679c).f();
                    y yVar2 = fVar.f9694a;
                    fj.l.c(yVar2);
                    int iMin = (int) Math.min(j, yVar2.f9743c - yVar2.f9742b);
                    ((OutputStream) this.f9678b).write(yVar2.f9741a, yVar2.f9742b, iMin);
                    int i10 = yVar2.f9742b + iMin;
                    yVar2.f9742b = i10;
                    long j11 = iMin;
                    j -= j11;
                    fVar.f9695b -= j11;
                    if (i10 == yVar2.f9743c) {
                        fVar.f9694a = yVar2.a();
                        z.a(yVar2);
                    }
                }
                return;
        }
    }

    @Override // kk.b0
    public final e0 a() {
        switch (this.f9677a) {
            case 0:
                return (lk.g) this.f9678b;
            default:
                return (e0) this.f9679c;
        }
    }

    @Override // kk.b0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f9677a) {
            case 0:
                lk.g gVar = (lk.g) this.f9678b;
                c cVar = (c) this.f9679c;
                gVar.h();
                try {
                    cVar.close();
                    if (gVar.i()) {
                        throw gVar.k(null);
                    }
                    return;
                } catch (IOException e10) {
                    if (!gVar.i()) {
                        throw e10;
                    }
                    throw gVar.k(e10);
                } finally {
                    gVar.i();
                }
            default:
                ((OutputStream) this.f9678b).close();
                return;
        }
    }

    @Override // kk.b0, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f9677a) {
            case 0:
                lk.g gVar = (lk.g) this.f9678b;
                c cVar = (c) this.f9679c;
                gVar.h();
                try {
                    cVar.flush();
                    if (gVar.i()) {
                        throw gVar.k(null);
                    }
                    return;
                } catch (IOException e10) {
                    if (!gVar.i()) {
                        throw e10;
                    }
                    throw gVar.k(e10);
                } finally {
                    gVar.i();
                }
            default:
                ((OutputStream) this.f9678b).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f9677a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f9679c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f9678b) + ')';
        }
    }
}
