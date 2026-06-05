package gk;

import f1.n0;
import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p extends bk.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7490c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7491d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, t tVar) {
        super("OkHttp %s", new Object[]{qVar.f7496d});
        this.f7491d = qVar;
        this.f7492e = tVar;
    }

    @Override // bk.a
    public final void b() throws IOException {
        int i10;
        x[] xVarArr;
        long j;
        switch (this.f7490c) {
            case 0:
                x xVar = (x) this.f7492e;
                q qVar = (q) ((p) this.f7491d).f7491d;
                try {
                    qVar.f7494b.b(xVar);
                    return;
                } catch (IOException e10) {
                    hk.j.f8044a.m(4, "Http2Connection.Listener failure for " + qVar.f7496d, e10);
                    try {
                        xVar.c(e10, 2);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            case 1:
                p pVar = (p) this.f7491d;
                n0 n0Var = (n0) this.f7492e;
                synchronized (((q) pVar.f7491d).M) {
                    synchronized (((q) pVar.f7491d)) {
                        try {
                            int iA = ((q) pVar.f7491d).K.a();
                            n0 n0Var2 = ((q) pVar.f7491d).K;
                            n0Var2.getClass();
                            for (int i11 = 0; i11 < 10; i11++) {
                                boolean z2 = true;
                                if (((1 << i11) & n0Var.f6400a) == 0) {
                                    z2 = false;
                                }
                                if (z2) {
                                    n0Var2.h(i11, n0Var.f6401b[i11]);
                                }
                            }
                            int iA2 = ((q) pVar.f7491d).K.a();
                            xVarArr = null;
                            if (iA2 == -1 || iA2 == iA) {
                                j = 0;
                            } else {
                                j = iA2 - iA;
                                if (!((q) pVar.f7491d).f7495c.isEmpty()) {
                                    xVarArr = (x[]) ((q) pVar.f7491d).f7495c.values().toArray(new x[((q) pVar.f7491d).f7495c.size()]);
                                }
                            }
                        } finally {
                        }
                    }
                    try {
                        q qVar2 = (q) pVar.f7491d;
                        qVar2.M.b(qVar2.K);
                    } catch (IOException e11) {
                        ((q) pVar.f7491d).b(2, 2, e11);
                    }
                }
                if (xVarArr != null) {
                    for (x xVar2 : xVarArr) {
                        synchronized (xVar2) {
                            xVar2.f7531b += j;
                            if (j > 0) {
                                xVar2.notifyAll();
                            }
                        }
                    }
                }
                q.P.execute(new j(pVar, new Object[]{((q) pVar.f7491d).f7496d}));
                return;
            default:
                q qVar3 = (q) this.f7491d;
                t tVar = (t) this.f7492e;
                try {
                    tVar.g(this);
                    do {
                    } while (tVar.e(false, this));
                    qVar3.b(1, 6, null);
                } catch (IOException e12) {
                    qVar3.b(2, 2, e12);
                } catch (Throwable th2) {
                    qVar3.b(3, 3, null);
                    bk.d.c(tVar);
                    throw th2;
                }
                bk.d.c(tVar);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p pVar, Object[] objArr, x xVar) {
        super("OkHttp %s stream %d", objArr);
        this.f7491d = pVar;
        this.f7492e = xVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p pVar, Object[] objArr, n0 n0Var) {
        super("OkHttp %s ACK Settings", objArr);
        this.f7491d = pVar;
        this.f7492e = n0Var;
    }
}
