package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c2 extends vj.q {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f13562e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public c2(ti.c cVar, ti.h hVar) {
        d2 d2Var = d2.f13567a;
        super(cVar, hVar.C(d2Var) == null ? hVar.V(d2Var) : hVar);
        this.f13562e = new ThreadLocal();
        if (cVar.getContext().C(ti.d.f16335a) instanceof v) {
            return;
        }
        Object objN = vj.b.n(hVar, null);
        vj.b.g(hVar, objN);
        n0(hVar, objN);
    }

    @Override // vj.q, qj.l1
    public final void j(Object obj) {
        m0();
        Object objY = b0.y(obj);
        ti.c cVar = this.f18119d;
        ti.h context = cVar.getContext();
        Object objN = vj.b.n(context, null);
        c2 c2VarF = objN != vj.b.f18086d ? b0.F(cVar, context, objN) : null;
        try {
            cVar.resumeWith(objY);
            if (c2VarF == null || c2VarF.l0()) {
                vj.b.g(context, objN);
            }
        } catch (Throwable th2) {
            if (c2VarF == null || c2VarF.l0()) {
                vj.b.g(context, objN);
            }
            throw th2;
        }
    }

    @Override // vj.q
    public final void k0() {
        m0();
    }

    public final boolean l0() {
        boolean z2 = this.threadLocalIsSet && this.f13562e.get() == null;
        this.f13562e.remove();
        return !z2;
    }

    public final void m0() {
        if (this.threadLocalIsSet) {
            pi.h hVar = (pi.h) this.f13562e.get();
            if (hVar != null) {
                vj.b.g((ti.h) hVar.f13000a, hVar.f13001b);
            }
            this.f13562e.remove();
        }
    }

    public final void n0(ti.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f13562e.set(new pi.h(hVar, obj));
    }
}
