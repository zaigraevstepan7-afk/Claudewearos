package lb;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import c1.v7;
import c1.z4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class q2 implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10593c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.q2 f10595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10596f;

    public /* synthetic */ q2(ja.k kVar, f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3, f1.a1 a1Var4, int i10) {
        this.f10591a = i10;
        this.f10592b = kVar;
        this.f10593c = a1Var;
        this.f10594d = a1Var2;
        this.f10595e = a1Var3;
        this.f10596f = a1Var4;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        f1.i0 i0Var;
        switch (this.f10591a) {
            case 0:
                ja.k kVar = (ja.k) this.f10592b;
                f1.a1 a1Var = (f1.a1) this.f10595e;
                f1.i0 i0Var2 = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f((d0.c) obj, "$this$item");
                if (i0Var2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q3.l("PASSCODE", i0Var2, 6);
                    q3.j(0L, p1.j.d(557405445, new q2(kVar, this.f10593c, this.f10594d, a1Var, this.f10596f, 1), i0Var2), i0Var2, 48);
                    b0.d.e(i0Var2, b0.t1.e(24, v1.l.f17564b));
                } else {
                    i0Var2.W();
                }
                break;
            case 1:
                ja.k kVar2 = (ja.k) this.f10592b;
                f1.a1 a1Var2 = (f1.a1) this.f10595e;
                f1.i0 i0Var3 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$MSCard");
                if (i0Var3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    float f10 = 16;
                    v1.l lVar = v1.l.f17564b;
                    v1.o oVarT = b0.d.t(f10, lVar);
                    b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var3, 0);
                    int iHashCode = Long.hashCode(i0Var3.T);
                    f1.n1 n1VarL = i0Var3.l();
                    v1.o oVarC = v1.a.c(i0Var3, oVarT);
                    v2.h.f17668w.getClass();
                    v2.f fVar = v2.g.f17645b;
                    i0Var3.e0();
                    if (i0Var3.S) {
                        i0Var3.k(fVar);
                    } else {
                        i0Var3.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var3, b0VarA);
                    f1.s.M(v2.g.f17648e, i0Var3, n1VarL);
                    f1.s.w(i0Var3, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var3);
                    f1.s.M(v2.g.f17647d, i0Var3, oVarC);
                    f1.a1 a1Var3 = this.f10593c;
                    boolean zBooleanValue = ((Boolean) a1Var3.getValue()).booleanValue();
                    f1.f fVar2 = f1.m.f6385a;
                    if (zBooleanValue) {
                        i0Var3.b0(-1556569379);
                        v7.a("Passcode is set", null, q3.f10599c, hj.a.x(16), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 1597830, 0, 262058);
                        b0.d.e(i0Var3, b0.t1.e(8, lVar));
                        v7.a("You can use this passcode to lock folders", null, q3.f10600d, hj.a.x(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 24966, 0, 262122);
                        i0Var = i0Var3;
                        b0.d.e(i0Var, b0.t1.e(f10, lVar));
                        boolean zH = i0Var.h(kVar2);
                        Object objQ = i0Var.Q();
                        if (zH || objQ == fVar2) {
                            objQ = new c1.s3(15, kVar2, a1Var3);
                            i0Var.l0(objQ);
                        }
                        z4.i((ej.a) objQ, null, false, null, null, null, c.f10168e, i0Var, 805306368, 510);
                        i0Var.p(false);
                    } else {
                        i0Var3.b0(-1555502328);
                        v7.a("No passcode set", null, q3.f10599c, hj.a.x(16), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 1597830, 0, 262058);
                        b0.d.e(i0Var3, b0.t1.e(8, lVar));
                        v7.a("Set up a passcode to protect your folders", null, q3.f10600d, hj.a.x(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 24966, 0, 262122);
                        i0Var = i0Var3;
                        b0.d.e(i0Var, b0.t1.e(f10, lVar));
                        Object objQ2 = i0Var.Q();
                        if (objQ2 == fVar2) {
                            objQ2 = new h1(this.f10594d, a1Var2, this.f10596f, 5);
                            i0Var.l0(objQ2);
                        }
                        z4.i((ej.a) objQ2, null, false, null, null, null, c.f10169f, i0Var, 805306374, 510);
                        i0Var.p(false);
                    }
                    i0Var.p(true);
                } else {
                    i0Var3.W();
                }
                break;
            default:
                g gVar = (g) this.f10592b;
                f1.f1 f1Var = (f1.f1) this.f10596f;
                b0.y yVar = (b0.y) obj;
                f1.i0 i0Var4 = (f1.i0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                fj.l.f(yVar, "$this$BoxWithConstraints");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= i0Var4.f(yVar) ? 4 : 2;
                }
                if (i0Var4.T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    float f11 = ((s3.f) cg.b.t(new s3.f(yVar.c() - 70), new s3.f(236), new s3.f(330))).f14742a;
                    Bitmap bitmap = (Bitmap) this.f10595e.getValue();
                    c2.g gVar2 = bitmap != null ? new c2.g(bitmap) : null;
                    float fG = f1Var.g();
                    boolean zBooleanValue2 = ((Boolean) this.f10593c.getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) this.f10594d.getValue()).booleanValue();
                    int iM = gVar.m();
                    SharedPreferences sharedPreferences = gVar.f10289a;
                    mb.a.f(gVar2, fG, zBooleanValue2, zBooleanValue3, iM, new jb.d(false, gVar.d(), 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, false, sharedPreferences.getFloat("dock_horizontal_padding", 15.0f), sharedPreferences.getFloat("dock_vertical_padding", 15.0f), gVar.f(), false, 0.0f, 25597), b0.w.f1450a.b(b0.t1.o(f11, v1.l.f17564b), v1.b.f17551e), i0Var4, 0);
                } else {
                    i0Var4.W();
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ q2(g gVar, f1.a1 a1Var, f1.f1 f1Var, f1.a1 a1Var2, f1.a1 a1Var3) {
        this.f10591a = 2;
        this.f10592b = gVar;
        this.f10595e = a1Var;
        this.f10596f = f1Var;
        this.f10593c = a1Var2;
        this.f10594d = a1Var3;
    }
}
