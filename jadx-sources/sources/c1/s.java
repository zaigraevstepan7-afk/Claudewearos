package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f2657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f2658b;

    public s(float f10, float f11) {
        this.f2657a = f10;
        this.f2658b = f11;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            b0.r.a(b0.t1.l(v1.l.f17564b, this.f2657a, this.f2658b), i0Var, 0);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
