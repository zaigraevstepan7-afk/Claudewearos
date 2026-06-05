package ab;

import c2.f0;
import f1.q2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f365b;

    public /* synthetic */ z(q2 q2Var, int i10) {
        this.f364a = i10;
        this.f365b = q2Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f364a) {
            case 0:
                f0 f0Var = (f0) obj;
                fj.l.f(f0Var, "$this$graphicsLayer");
                q2 q2Var = this.f365b;
                f0Var.p(((Number) q2Var.getValue()).floatValue());
                f0Var.j(((Number) q2Var.getValue()).floatValue());
                break;
            case 1:
                f0 f0Var2 = (f0) obj;
                fj.l.f(f0Var2, "$this$graphicsLayer");
                f0Var2.g(((Number) this.f365b.getValue()).floatValue());
                break;
            case 2:
                e2.d dVar = (e2.d) obj;
                long j = ((c2.w) this.f365b.getValue()).f3060a;
                if (!c2.w.d(j, c2.w.f3058h)) {
                    e2.d.c1(dVar, j, 0L, 0L, 0.0f, null, 0, 126);
                }
                return pi.o.f13011a;
            case 3:
                ((f0) obj).m(((Number) this.f365b.getValue()).floatValue());
                break;
            case 4:
                f0 f0Var3 = (f0) obj;
                fj.l.f(f0Var3, "$this$graphicsLayer");
                f0Var3.s(hj.a.d(this.f365b));
                break;
            case 5:
                f0 f0Var4 = (f0) obj;
                fj.l.f(f0Var4, "$this$graphicsLayer");
                f0Var4.s(hj.a.d(this.f365b));
                break;
            case 6:
                f0 f0Var5 = (f0) obj;
                fj.l.f(f0Var5, "$this$graphicsLayer");
                f0Var5.h(((Number) this.f365b.getValue()).floatValue());
                break;
            case 7:
                f0 f0Var6 = (f0) obj;
                fj.l.f(f0Var6, "$this$graphicsLayer");
                q2 q2Var2 = this.f365b;
                f0Var6.p(((Number) q2Var2.getValue()).floatValue());
                f0Var6.j(((Number) q2Var2.getValue()).floatValue());
                break;
            case 8:
                f0 f0Var7 = (f0) obj;
                fj.l.f(f0Var7, "$this$graphicsLayer");
                q2 q2Var3 = this.f365b;
                f0Var7.p(((Number) q2Var3.getValue()).floatValue());
                f0Var7.j(((Number) q2Var3.getValue()).floatValue());
                break;
            case 9:
                f0 f0Var8 = (f0) obj;
                fj.l.f(f0Var8, "$this$graphicsLayer");
                q2 q2Var4 = this.f365b;
                f0Var8.p(((Number) q2Var4.getValue()).floatValue());
                f0Var8.j(((Number) q2Var4.getValue()).floatValue());
                break;
            default:
                f0 f0Var9 = (f0) obj;
                fj.l.f(f0Var9, "$this$graphicsLayer");
                q2 q2Var5 = this.f365b;
                f0Var9.p(((Number) q2Var5.getValue()).floatValue());
                f0Var9.j(((Number) q2Var5.getValue()).floatValue());
                break;
        }
        return pi.o.f13011a;
    }
}
