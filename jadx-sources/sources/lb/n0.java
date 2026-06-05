package lb;

import android.content.Context;
import c1.x5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements ej.f {
    public final /* synthetic */ Object A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10497f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f10498z;

    public /* synthetic */ n0(Object obj, boolean z2, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f10492a = i10;
        this.f10494c = obj;
        this.f10493b = z2;
        this.f10495d = obj2;
        this.f10496e = obj3;
        this.f10497f = obj4;
        this.f10498z = obj5;
        this.A = obj6;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        f1.f fVar;
        String str;
        switch (this.f10492a) {
            case 0:
                v1.o oVar = (v1.o) this.f10494c;
                p1.e eVar = (p1.e) this.f10495d;
                qj.z zVar = (qj.z) this.f10496e;
                x5 x5Var = (x5) this.f10497f;
                ej.a aVar = (ej.a) this.f10498z;
                t.c cVar = (t.c) this.A;
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$ModalBottomSheet");
                if (i0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var, 0);
                    int iHashCode = Long.hashCode(i0Var.T);
                    f1.n1 n1VarL = i0Var.l();
                    v1.o oVarC = v1.a.c(i0Var, oVar);
                    v2.h.f17668w.getClass();
                    v2.f fVar2 = v2.g.f17645b;
                    i0Var.e0();
                    if (i0Var.S) {
                        i0Var.k(fVar2);
                    } else {
                        i0Var.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var, b0VarA);
                    f1.s.M(v2.g.f17648e, i0Var, n1VarL);
                    f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var);
                    f1.s.M(v2.g.f17647d, i0Var, oVarC);
                    boolean z2 = this.f10493b;
                    b0.c0 c0Var = b0.c0.f1285a;
                    if (z2) {
                        i0Var.b0(-733771132);
                        float f10 = 10;
                        b0.r.a(v.n.f(y8.f.c(f10, c0Var.a(b0.t1.l(b0.d.x(v1.l.f17564b, 0.0f, f10, 0.0f, 2, 5), 36, 4), v1.b.F)), c2.e0.d(4291940822L), c2.e0.f2986b), i0Var, 0);
                        i0Var.p(false);
                    } else {
                        i0Var.b0(-733366551);
                        i0Var.p(false);
                    }
                    boolean zH = i0Var.h(zVar) | i0Var.f(x5Var) | i0Var.f(aVar);
                    Object objQ = i0Var.Q();
                    f1.f fVar3 = f1.m.f6385a;
                    if (zH || objQ == fVar3) {
                        objQ = new h0.f(x5Var, aVar, zVar);
                        i0Var.l0(objQ);
                    }
                    fj.j jVar = (fj.j) objQ;
                    boolean zH2 = i0Var.h(cVar);
                    Object objQ2 = i0Var.Q();
                    if (zH2 || objQ2 == fVar3) {
                        objQ2 = new p0(cVar, 1);
                        i0Var.l0(objQ2);
                    }
                    eVar.g(c0Var, jVar, (fj.j) objQ2, i0Var, 6);
                    i0Var.p(true);
                } else {
                    i0Var.W();
                }
                break;
            default:
                String str2 = (String) this.f10494c;
                String str3 = (String) this.f10495d;
                f1.a1 a1Var = (f1.a1) this.f10496e;
                Context context = (Context) this.f10497f;
                f1.a1 a1Var2 = (f1.a1) this.f10498z;
                f1.a1 a1Var3 = (f1.a1) this.A;
                f1.i0 i0Var2 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$MSCard");
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q3.i("VoidLauncher", t.m1.i("Version ", str2), 0L, 0L, null, i0Var2, 6, 28);
                    q3.k(0, i0Var2);
                    boolean z10 = this.f10493b;
                    f1.f fVar4 = f1.m.f6385a;
                    if (z10) {
                        fVar = fVar4;
                        i0Var2.b0(1449306881);
                        i0Var2.p(false);
                    } else {
                        i0Var2.b0(1448450630);
                        ig.l lVar = (ig.l) a1Var2.getValue();
                        if (lVar == null || (str = ((jg.d) lVar).f8873b.f8924e) == null) {
                            str = "Not signed in";
                        }
                        boolean zF = i0Var2.f(str3) | i0Var2.f(a1Var) | i0Var2.h(context);
                        Object objQ3 = i0Var2.Q();
                        if (zF || objQ3 == fVar4) {
                            c1.h3 h3Var = new c1.h3(str3, context, a1Var, a1Var3, 3);
                            i0Var2.l0(h3Var);
                            objQ3 = h3Var;
                        }
                        String str4 = str;
                        fVar = fVar4;
                        q3.i("Account", str4, 0L, 0L, (ej.a) objQ3, i0Var2, 6, 12);
                        q3.k(0, i0Var2);
                        i0Var2.p(false);
                    }
                    boolean zH3 = i0Var2.h(context);
                    Object objQ4 = i0Var2.Q();
                    if (zH3 || objQ4 == fVar) {
                        objQ4 = new g1(context, 2);
                        i0Var2.l0(objQ4);
                    }
                    q3.i("Updates", "Check for new versions", 0L, 0L, (ej.a) objQ4, i0Var2, 54, 12);
                } else {
                    i0Var2.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
