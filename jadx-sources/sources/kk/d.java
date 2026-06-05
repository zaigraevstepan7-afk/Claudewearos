package kk;

import java.io.IOException;
import java.io.InputStream;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9680a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9681b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9682c;

    public d(InputStream inputStream, e0 e0Var) {
        fj.l.f(inputStream, "input");
        this.f9681b = inputStream;
        this.f9682c = e0Var;
    }

    @Override // kk.c0
    public final long A(long j, f fVar) throws IOException {
        switch (this.f9680a) {
            case 0:
                fj.l.f(fVar, "sink");
                lk.g gVar = (lk.g) this.f9681b;
                d dVar = (d) this.f9682c;
                gVar.h();
                try {
                    long jA = dVar.A(j, fVar);
                    if (gVar.i()) {
                        throw gVar.k(null);
                    }
                    return jA;
                } catch (IOException e10) {
                    if (gVar.i()) {
                        throw gVar.k(e10);
                    }
                    throw e10;
                } finally {
                    gVar.i();
                }
            default:
                fj.l.f(fVar, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(m1.g(j, "byteCount < 0: ").toString());
                }
                try {
                    ((e0) this.f9682c).f();
                    y yVarP = fVar.P(1);
                    int i10 = ((InputStream) this.f9681b).read(yVarP.f9741a, yVarP.f9743c, (int) Math.min(j, 8192 - yVarP.f9743c));
                    if (i10 == -1) {
                        if (yVarP.f9742b == yVarP.f9743c) {
                            fVar.f9694a = yVarP.a();
                            z.a(yVarP);
                        }
                        return -1L;
                    }
                    yVarP.f9743c += i10;
                    long j4 = i10;
                    fVar.f9695b += j4;
                    return j4;
                } catch (AssertionError e11) {
                    if (lk.k.a(e11)) {
                        throw new IOException(e11);
                    }
                    throw e11;
                }
        }
    }

    @Override // kk.c0
    public final e0 a() {
        switch (this.f9680a) {
            case 0:
                return (lk.g) this.f9681b;
            default:
                return (e0) this.f9682c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f9680a) {
            case 0:
                lk.g gVar = (lk.g) this.f9681b;
                d dVar = (d) this.f9682c;
                gVar.h();
                try {
                    dVar.close();
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
                ((InputStream) this.f9681b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f9680a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f9682c) + ')';
            default:
                return "source(" + ((InputStream) this.f9681b) + ')';
        }
    }

    public d(lk.g gVar, d dVar) {
        this.f9681b = gVar;
        this.f9682c = dVar;
    }
}
