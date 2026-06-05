package s;

import t.g1;
import t.j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f14606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.c f14608c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f14609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1.q f14610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.e f14611f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j1 j1Var, Object obj, ej.c cVar, r rVar, t1.q qVar, p1.e eVar) {
        super(2);
        this.f14606a = j1Var;
        this.f14607b = obj;
        this.f14608c = cVar;
        this.f14609d = rVar;
        this.f14610e = qVar;
        this.f14611f = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objQ = i0Var.Q();
            ej.c cVar = this.f14608c;
            r rVar = this.f14609d;
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                objQ = (f0) cVar.invoke(rVar);
                i0Var.l0(objQ);
            }
            f0 f0Var = (f0) objQ;
            j1 j1Var = this.f14606a;
            g1 g1VarF = j1Var.f();
            f1.j1 j1Var2 = j1Var.f15203d;
            Object objC = g1VarF.c();
            Object obj3 = this.f14607b;
            boolean zG = i0Var.g(fj.l.b(objC, obj3));
            Object objQ2 = i0Var.Q();
            if (zG || objQ2 == fVar) {
                objQ2 = fj.l.b(j1Var.f().c(), obj3) ? t0.f14675b : ((f0) cVar.invoke(rVar)).f14595b;
                i0Var.l0(objQ2);
            }
            t0 t0Var = (t0) objQ2;
            Object objQ3 = i0Var.Q();
            if (objQ3 == fVar) {
                objQ3 = new n(fj.l.b(obj3, j1Var2.getValue()));
                i0Var.l0(objQ3);
            }
            n nVar = (n) objQ3;
            s0 s0Var = f0Var.f14594a;
            boolean zH = i0Var.h(f0Var);
            Object objQ4 = i0Var.Q();
            if (zH || objQ4 == fVar) {
                objQ4 = new e(f0Var);
                i0Var.l0(objQ4);
            }
            v1.o oVarK = t2.z.k(v1.l.f17564b, (ej.f) objQ4);
            nVar.f14646b.setValue(Boolean.valueOf(fj.l.b(obj3, j1Var2.getValue())));
            v1.o oVarC = oVarK.c(nVar);
            boolean zH2 = i0Var.h(obj3);
            Object objQ5 = i0Var.Q();
            if (zH2 || objQ5 == fVar) {
                objQ5 = new c2.x0(obj3, 12);
                i0Var.l0(objQ5);
            }
            ej.c cVar2 = (ej.c) objQ5;
            boolean zF = i0Var.f(t0Var);
            Object objQ6 = i0Var.Q();
            if (zF || objQ6 == fVar) {
                objQ6 = new f(t0Var, 0);
                i0Var.l0(objQ6);
            }
            a0.a(j1Var, cVar2, oVarC, s0Var, t0Var, (ej.e) objQ6, p1.j.d(-143346359, new g(this.f14610e, obj3, rVar, this.f14611f), i0Var), i0Var, 12582912);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
