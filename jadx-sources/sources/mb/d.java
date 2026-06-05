package mb;

import c2.f0;
import f1.q2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f11446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f11447c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q2 f11448d;

    public /* synthetic */ d(q2 q2Var, q2 q2Var2, q2 q2Var3, int i10) {
        this.f11445a = i10;
        this.f11446b = q2Var;
        this.f11447c = q2Var2;
        this.f11448d = q2Var3;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        switch (this.f11445a) {
            case 0:
                fj.l.f(f0Var, "$this$graphicsLayer");
                q2 q2Var = this.f11446b;
                f0Var.p(((Number) q2Var.getValue()).floatValue());
                f0Var.j(((Number) q2Var.getValue()).floatValue());
                f0Var.s(((Number) this.f11447c.getValue()).floatValue());
                f0Var.h(((Number) this.f11448d.getValue()).floatValue());
                break;
            default:
                fj.l.f(f0Var, "$this$graphicsLayer");
                q2 q2Var2 = this.f11446b;
                f0Var.p(((Number) q2Var2.getValue()).floatValue());
                f0Var.j(((Number) q2Var2.getValue()).floatValue());
                f0Var.s(((Number) this.f11447c.getValue()).floatValue());
                f0Var.h(((Number) this.f11448d.getValue()).floatValue());
                break;
        }
        return pi.o.f13011a;
    }
}
