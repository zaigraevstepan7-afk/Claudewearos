package lb;

import c1.b8;
import c1.v7;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ej.f {
    public final /* synthetic */ f1.q2 A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10305a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f10306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10307c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10310f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f10311z;

    public /* synthetic */ h(String str, ej.a aVar, f1.a1 a1Var, String str2, f1.a1 a1Var2, f1.a1 a1Var3, f1.q2 q2Var) {
        this.f10310f = str;
        this.f10306b = aVar;
        this.f10307c = a1Var;
        this.f10311z = str2;
        this.f10308d = a1Var2;
        this.f10309e = a1Var3;
        this.A = q2Var;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f10305a) {
            case 0:
                g gVar = (g) this.f10310f;
                ej.a aVar = (ej.a) this.f10311z;
                f1.g1 g1Var = (f1.g1) this.A;
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$SettingsCard");
                if (i0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zH = i0Var.h(gVar);
                    ej.a aVar2 = this.f10306b;
                    boolean zF = zH | i0Var.f(aVar2) | i0Var.f(aVar);
                    Object objQ = i0Var.Q();
                    f1.a1 a1Var = this.f10307c;
                    f1.a1 a1Var2 = this.f10308d;
                    f1.a1 a1Var3 = this.f10309e;
                    Object obj4 = f1.m.f6385a;
                    if (zF || objQ == obj4) {
                        objQ = new j(gVar, aVar2, aVar, a1Var, a1Var2, a1Var3, g1Var);
                        i0Var.l0(objQ);
                    }
                    r.d("Transition effects", 0L, (ej.a) objQ, i0Var, 6, 2);
                    r.c(0, i0Var);
                    r.d("Set default screen", 0L, null, i0Var, 6, 6);
                    r.c(0, i0Var);
                    String str = ((Boolean) a1Var.getValue()).booleanValue() ? "On" : "Off";
                    Object objQ2 = i0Var.Q();
                    if (objQ2 == obj4) {
                        objQ2 = t.m1.p(i0Var);
                    }
                    z.k kVar = (z.k) objQ2;
                    Object objQ3 = i0Var.Q();
                    if (objQ3 == obj4) {
                        objQ3 = new b8(a1Var, 7);
                        i0Var.l0(objQ3);
                    }
                    r.f("Don't show text", str, v.n.k(v1.l.f17564b, kVar, null, false, null, (ej.a) objQ3, 28), i0Var, 6);
                    r.c(0, i0Var);
                    boolean zBooleanValue = ((Boolean) a1Var2.getValue()).booleanValue();
                    Object objQ4 = i0Var.Q();
                    if (objQ4 == obj4) {
                        objQ4 = new ab.i(a1Var2, 10);
                        i0Var.l0(objQ4);
                    }
                    r.e("Fill cells of uninstalled apps", zBooleanValue, (ej.c) objQ4, i0Var, 390);
                    r.c(0, i0Var);
                    boolean zBooleanValue2 = ((Boolean) a1Var3.getValue()).booleanValue();
                    Object objQ5 = i0Var.Q();
                    if (objQ5 == obj4) {
                        objQ5 = new ab.i(a1Var3, 11);
                        i0Var.l0(objQ5);
                    }
                    r.e("Lock Home screen layout", zBooleanValue2, (ej.c) objQ5, i0Var, 390);
                } else {
                    i0Var.W();
                }
                break;
            default:
                String str2 = (String) this.f10310f;
                String str3 = (String) this.f10311z;
                f1.i0 i0Var2 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f((d0.c) obj, "$this$item");
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    v1.f fVar = v1.b.D;
                    float f10 = 8;
                    v1.l lVar = v1.l.f17564b;
                    v1.o oVarU = b0.d.u(lVar, f10, f10);
                    b0.q1 q1VarA = b0.o1.a(b0.j.f1359a, fVar, i0Var2, 48);
                    int iHashCode = Long.hashCode(i0Var2.T);
                    f1.n1 n1VarL = i0Var2.l();
                    v1.o oVarC = v1.a.c(i0Var2, oVarU);
                    v2.h.f17668w.getClass();
                    v2.f fVar2 = v2.g.f17645b;
                    i0Var2.e0();
                    if (i0Var2.S) {
                        i0Var2.k(fVar2);
                    } else {
                        i0Var2.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var2, q1VarA);
                    f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
                    f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var2);
                    f1.s.M(v2.g.f17647d, i0Var2, oVarC);
                    i2.f fVarH = u2.b.h();
                    long j = q3.f10601e;
                    v1.o oVarC2 = y8.f.c(10, b0.t1.k(36, lVar));
                    Object objQ6 = i0Var2.Q();
                    Object obj5 = f1.m.f6385a;
                    if (objQ6 == obj5) {
                        objQ6 = t.m1.p(i0Var2);
                    }
                    z.k kVar2 = (z.k) objQ6;
                    ej.a aVar3 = this.f10306b;
                    boolean zF2 = i0Var2.f(aVar3);
                    Object objQ7 = i0Var2.Q();
                    if (zF2 || objQ7 == obj5) {
                        w1 w1Var = new w1(aVar3, this.f10307c, str3, this.f10308d, this.f10309e, this.A, 1);
                        i0Var2.l0(w1Var);
                        objQ7 = w1Var;
                    }
                    c1.a2.b(fVarH, "Back", b0.d.t(6, v.n.k(oVarC2, kVar2, null, false, null, (ej.a) objQ7, 28)), j, i0Var2, 3120, 0);
                    i0Var2.p(true);
                    v7.a(str2, b0.d.u(lVar, 20, 4), q3.f10599c, hj.a.x(34), k3.s.B, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1597872, 0, 262056);
                } else {
                    i0Var2.W();
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ h(g gVar, ej.a aVar, ej.a aVar2, f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3, f1.g1 g1Var) {
        this.f10310f = gVar;
        this.f10306b = aVar;
        this.f10311z = aVar2;
        this.f10307c = a1Var;
        this.f10308d = a1Var2;
        this.f10309e = a1Var3;
        this.A = g1Var;
    }
}
