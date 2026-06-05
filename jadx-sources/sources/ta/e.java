package ta;

import f1.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.e f16162b;

    public /* synthetic */ e(p1.e eVar, int i10) {
        this.f16161a = i10;
        this.f16162b = eVar;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i10 = this.f16161a;
        b0.v vVar = (b0.v) obj;
        i0 i0Var = (i0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                fj.l.f(vVar, "$this$GlassyBox");
                if (i0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    this.f16162b.invoke(i0Var, 6);
                } else {
                    i0Var.W();
                }
                break;
            default:
                fj.l.f(vVar, "$this$GlassyBox");
                if (i0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    this.f16162b.invoke(i0Var, 6);
                } else {
                    i0Var.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
