package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y0 implements ej.f {

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f2894b = new y0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final y0 f2895c = new y0(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2896a;

    public /* synthetic */ y0(int i10) {
        this.f2896a = i10;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i10 = this.f2896a;
        v1.l lVar = v1.l.f17564b;
        f1.f fVar = f1.m.f6385a;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!i0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    i0Var.W();
                    break;
                }
                break;
            case 1:
                e2.d dVar = (e2.d) obj;
                long j = ((b2.b) obj2).f1500a;
                long j4 = ((c2.w) obj3).f3060a;
                h6 h6Var = h6.f2196a;
                e2.d.V0(dVar, j4, dVar.w0(h6.f2198c) / 2.0f, j, null, 120);
                break;
            case 2:
                f1.i0 i0Var2 = (f1.i0) obj2;
                ((Number) obj3).intValue();
                float f10 = t0.f2695a;
                i0Var2.b0(1575618259);
                i0Var2.p(false);
                Object objQ = i0Var2.Q();
                if (objQ == fVar) {
                    objQ = f1.s.A(null);
                    i0Var2.l0(objQ);
                }
                f1.a1 a1Var = (f1.a1) objQ;
                t2.q0 q0VarD = b0.r.d(v1.b.f17551e, false);
                int iT = f1.s.t(i0Var2);
                f1.n1 n1VarL = i0Var2.l();
                v1.o oVarC = v1.a.c(i0Var2, lVar);
                v2.h.f17668w.getClass();
                v2.f fVar2 = v2.g.f17645b;
                i0Var2.e0();
                if (i0Var2.S) {
                    i0Var2.k(fVar2);
                } else {
                    i0Var2.o0();
                }
                f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
                f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
                v2.e eVar = v2.g.f17650g;
                if (i0Var2.S || !fj.l.b(i0Var2.Q(), Integer.valueOf(iT))) {
                    m6.a.l(iT, i0Var2, iT, eVar);
                }
                f1.s.M(v2.g.f17647d, i0Var2, oVarC);
                ej.e eVar2 = (ej.e) a1Var.getValue();
                if (eVar2 == null) {
                    i0Var2.b0(-1538103400);
                } else {
                    i0Var2.b0(-326710903);
                    eVar2.invoke(i0Var2, 0);
                }
                i0Var2.p(false);
                i0Var2.p(true);
                break;
            default:
                f1.i0 i0Var3 = (f1.i0) obj2;
                ((Number) obj3).intValue();
                float f11 = t0.f2695a;
                i0Var3.b0(-1218863531);
                i0Var3.p(false);
                Object objQ2 = i0Var3.Q();
                if (objQ2 == fVar) {
                    objQ2 = f1.s.A(null);
                    i0Var3.l0(objQ2);
                }
                f1.a1 a1Var2 = (f1.a1) objQ2;
                t2.q0 q0VarD2 = b0.r.d(v1.b.f17551e, false);
                int iT2 = f1.s.t(i0Var3);
                f1.n1 n1VarL2 = i0Var3.l();
                v1.o oVarC2 = v1.a.c(i0Var3, lVar);
                v2.h.f17668w.getClass();
                v2.f fVar3 = v2.g.f17645b;
                i0Var3.e0();
                if (i0Var3.S) {
                    i0Var3.k(fVar3);
                } else {
                    i0Var3.o0();
                }
                f1.s.M(v2.g.f17649f, i0Var3, q0VarD2);
                f1.s.M(v2.g.f17648e, i0Var3, n1VarL2);
                v2.e eVar3 = v2.g.f17650g;
                if (i0Var3.S || !fj.l.b(i0Var3.Q(), Integer.valueOf(iT2))) {
                    m6.a.l(iT2, i0Var3, iT2, eVar3);
                }
                f1.s.M(v2.g.f17647d, i0Var3, oVarC2);
                ej.e eVar4 = (ej.e) a1Var2.getValue();
                if (eVar4 == null) {
                    i0Var3.b0(-2101783313);
                } else {
                    i0Var3.b0(-344894126);
                    eVar4.invoke(i0Var3, 0);
                }
                i0Var3.p(false);
                i0Var3.p(true);
                break;
        }
        return oVar;
    }
}
