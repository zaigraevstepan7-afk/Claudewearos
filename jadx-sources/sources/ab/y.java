package ab;

import c2.f0;
import f1.q2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f363c;

    public /* synthetic */ y(q2 q2Var, q2 q2Var2, int i10) {
        this.f361a = i10;
        this.f362b = q2Var;
        this.f363c = q2Var2;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        switch (this.f361a) {
            case 0:
                fj.l.f(f0Var, "$this$graphicsLayer");
                f0Var.m(((Number) this.f362b.getValue()).floatValue());
                q2 q2Var = this.f363c;
                f0Var.p(((Number) q2Var.getValue()).floatValue());
                f0Var.j(((Number) q2Var.getValue()).floatValue());
                f0Var.q(false);
                break;
            case 1:
                fj.l.f(f0Var, "$this$graphicsLayer");
                q2 q2Var2 = this.f362b;
                f0Var.p(((Number) q2Var2.getValue()).floatValue());
                f0Var.j(((Number) q2Var2.getValue()).floatValue());
                f0Var.s(((Number) this.f363c.getValue()).floatValue());
                break;
            default:
                fj.l.f(f0Var, "$this$graphicsLayer");
                q2 q2Var3 = this.f362b;
                f0Var.p(((Number) q2Var3.getValue()).floatValue());
                f0Var.j(((Number) q2Var3.getValue()).floatValue());
                f0Var.m(((Number) this.f363c.getValue()).floatValue());
                break;
        }
        return pi.o.f13011a;
    }
}
