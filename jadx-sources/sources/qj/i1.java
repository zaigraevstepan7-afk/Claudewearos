package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i1 extends l {
    public final l1 B;

    public i1(ti.c cVar, l1 l1Var) {
        super(1, cVar);
        this.B = l1Var;
    }

    @Override // qj.l
    public final Throwable n(l1 l1Var) {
        Throwable thD;
        l1 l1Var2 = this.B;
        l1Var2.getClass();
        Object obj = l1.f13598a.get(l1Var2);
        return (!(obj instanceof k1) || (thD = ((k1) obj).d()) == null) ? obj instanceof t ? ((t) obj).f13622a : l1Var.t() : thD;
    }

    @Override // qj.l
    public final String y() {
        return "AwaitContinuation";
    }
}
