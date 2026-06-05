package qj;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class k0 extends xj.i {

    /* renamed from: c, reason: collision with root package name */
    public int f13589c;

    public k0(int i10) {
        super(0L, false);
        this.f13589c = i10;
    }

    public abstract ti.c c();

    public Throwable d(Object obj) {
        t tVar = obj instanceof t ? (t) obj : null;
        if (tVar != null) {
            return tVar.f13622a;
        }
        return null;
    }

    public final void g(Throwable th2) {
        b0.q(new dj.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), c().getContext());
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ti.c cVarC = c();
            fj.l.d(cVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            vj.g gVar = (vj.g) cVarC;
            vi.c cVar = gVar.f18096e;
            Object obj = gVar.f18098z;
            ti.h context = cVar.getContext();
            Object objN = vj.b.n(context, obj);
            e1 e1Var = null;
            c2 c2VarF = objN != vj.b.f18086d ? b0.F(cVar, context, objN) : null;
            try {
                ti.h context2 = cVar.getContext();
                Object objH = h();
                Throwable thD = d(objH);
                if (thD == null) {
                    int i10 = this.f13589c;
                    boolean z2 = true;
                    if (i10 != 1 && i10 != 2) {
                        z2 = false;
                    }
                    if (z2) {
                        e1Var = (e1) context2.C(w.f13632b);
                    }
                }
                if (e1Var != null && !e1Var.b()) {
                    CancellationException cancellationExceptionT = e1Var.t();
                    b(cancellationExceptionT);
                    cVar.resumeWith(uk.c.r(cancellationExceptionT));
                } else if (thD != null) {
                    cVar.resumeWith(uk.c.r(thD));
                } else {
                    cVar.resumeWith(e(objH));
                }
                if (c2VarF == null || c2VarF.l0()) {
                    vj.b.g(context, objN);
                }
            } catch (Throwable th2) {
                if (c2VarF == null || c2VarF.l0()) {
                    vj.b.g(context, objN);
                }
                throw th2;
            }
        } catch (i0 e10) {
            b0.q(e10.f13584a, c().getContext());
        } catch (Throwable th3) {
            g(th3);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
