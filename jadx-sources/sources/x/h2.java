package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h2 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l2 f19551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f19552b;

    public h2(l2 l2Var, j2 j2Var) {
        this.f19551a = l2Var;
        this.f19552b = j2Var;
    }

    @Override // x.s1
    public final float a(float f10) {
        float fAbs = Math.abs(f10);
        l2 l2Var = this.f19551a;
        if (fAbs != 0.0f && !((Boolean) l2Var.f19620h.a()).booleanValue()) {
            throw new v.g1("The fling animation was cancelled", 0);
        }
        return l2Var.d(l2Var.g(this.f19552b.a(2, l2Var.e(l2Var.h(f10)))));
    }
}
