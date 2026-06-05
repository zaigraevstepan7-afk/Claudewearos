package x;

import c1.w6;
import c1.x6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19425c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f19423a = i10;
        this.f19424b = obj;
        this.f19425c = obj2;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10 = this.f19423a;
        pi.o oVar = pi.o.f13011a;
        Object obj2 = this.f19425c;
        Object obj3 = this.f19424b;
        switch (i10) {
            case 0:
                ((g1.e) ((yh.c) obj3).f20314b).k((g) obj2);
                break;
            case 1:
                w6 w6Var = (w6) obj3;
                q0 q0Var = (q0) obj2;
                long j = ((u) obj).f19729a;
                long jG = q0Var.f19686h0 ? b2.b.g(j, -1.0f) : b2.b.g(j, 1.0f);
                o1 o1Var = q0Var.f19682d0;
                o0 o0Var = p0.f19671a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (o1Var == o1.f19664a ? jG & 4294967295L : jG >> 32));
                switch (w6Var.f2838a) {
                    case 0:
                        ((x6) w6Var.f2839b).b(fIntBitsToFloat);
                        break;
                    case 1:
                        d1.q qVar = (d1.q) w6Var.f2839b;
                        d1.n.a(qVar.f4566n, qVar.e(fIntBitsToFloat));
                        break;
                    default:
                        ((k) w6Var.f2839b).f19584a.invoke(Float.valueOf(fIntBitsToFloat));
                        break;
                }
            case 2:
                j2 j2Var = (j2) obj3;
                l2 l2Var = (l2) obj2;
                u uVar = (u) obj;
                float f10 = uVar.f19730b ? -1.0f : 1.0f;
                long j4 = uVar.f19729a;
                j2Var.a(1, b2.b.g(l2Var.f19616d == o1.f19665b ? b2.b.a(0.0f, 1, j4) : b2.b.a(0.0f, 2, j4), f10));
                break;
            default:
                d3 d3Var = (d3) obj3;
                ((Long) obj).longValue();
                float f11 = d3Var.f19497e;
                d3Var.f19497e = 0.0f;
                ((ej.c) obj2).invoke(Float.valueOf(f11));
                break;
        }
        return oVar;
    }
}
