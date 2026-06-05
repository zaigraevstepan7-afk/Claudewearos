package s;

import t.g1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f14665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(r0 r0Var, int i10) {
        super(1);
        this.f14664a = i10;
        this.f14665b = r0Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f14664a) {
            case 0:
                g1 g1Var = (g1) obj;
                g0 g0Var = g0.f14602a;
                g0 g0Var2 = g0.f14603b;
                boolean zA = g1Var.a(g0Var, g0Var2);
                t.u0 u0Var = null;
                r0 r0Var = this.f14665b;
                if (zA) {
                    e0 e0Var = r0Var.L.f14672a.f14584c;
                    if (e0Var != null) {
                        u0Var = e0Var.f14591c;
                    }
                } else if (g1Var.a(g0Var2, g0.f14604c)) {
                    e0 e0Var2 = r0Var.M.f14677a.f14584c;
                    if (e0Var2 != null) {
                        u0Var = e0Var2.f14591c;
                    }
                } else {
                    u0Var = n0.f14650d;
                }
                return u0Var == null ? n0.f14650d : u0Var;
            default:
                g1 g1Var2 = (g1) obj;
                g0 g0Var3 = g0.f14602a;
                g0 g0Var4 = g0.f14603b;
                boolean zA2 = g1Var2.a(g0Var3, g0Var4);
                r0 r0Var2 = this.f14665b;
                if (zA2) {
                    b1 b1Var = r0Var2.L.f14672a.f14583b;
                    return b1Var != null ? b1Var.f14564b : n0.f14649c;
                }
                if (!g1Var2.a(g0Var4, g0.f14604c)) {
                    return n0.f14649c;
                }
                b1 b1Var2 = r0Var2.M.f14677a.f14583b;
                return b1Var2 != null ? b1Var2.f14564b : n0.f14649c;
        }
    }
}
