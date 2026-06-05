package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q.g0 f1403a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final q.g0 f1404b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final q f1405c = q.f1397b;

    public static final void a(v1.o oVar, f1.i0 i0Var, int i10) {
        int i11;
        i0Var.c0(-211209833);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (i0Var.T(i11 & 1, (i11 & 3) != 2)) {
            int iHashCode = Long.hashCode(i0Var.T);
            v1.o oVarC = v1.a.c(i0Var, oVar);
            f1.n1 n1VarL = i0Var.l();
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, f1405c);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            f1.s.M(v2.g.f17650g, i0Var, Integer.valueOf(iHashCode));
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new p(oVar, i10);
        }
    }

    public static final void b(t2.e1 e1Var, t2.f1 f1Var, t2.p0 p0Var, s3.m mVar, int i10, int i11, v1.c cVar) {
        v1.g gVar;
        Object objC0 = p0Var.c0();
        o oVar = objC0 instanceof o ? (o) objC0 : null;
        t2.e1.C(e1Var, f1Var, ((oVar == null || (gVar = oVar.H) == null) ? cVar : gVar).a((f1Var.f15550a << 32) | (f1Var.f15551b & 4294967295L), (i10 << 32) | (i11 & 4294967295L), mVar));
    }

    public static final q.g0 c(boolean z2) {
        q.g0 g0Var = new q.g0(9);
        v1.g gVar = v1.b.f17547a;
        g0Var.m(gVar, new u(gVar, z2));
        v1.g gVar2 = v1.b.f17548b;
        g0Var.m(gVar2, new u(gVar2, z2));
        v1.g gVar3 = v1.b.f17549c;
        g0Var.m(gVar3, new u(gVar3, z2));
        v1.g gVar4 = v1.b.f17550d;
        g0Var.m(gVar4, new u(gVar4, z2));
        v1.g gVar5 = v1.b.f17551e;
        g0Var.m(gVar5, new u(gVar5, z2));
        v1.g gVar6 = v1.b.f17552f;
        g0Var.m(gVar6, new u(gVar6, z2));
        v1.g gVar7 = v1.b.f17553z;
        g0Var.m(gVar7, new u(gVar7, z2));
        v1.g gVar8 = v1.b.A;
        g0Var.m(gVar8, new u(gVar8, z2));
        v1.g gVar9 = v1.b.B;
        g0Var.m(gVar9, new u(gVar9, z2));
        return g0Var;
    }

    public static final t2.q0 d(v1.c cVar, boolean z2) {
        t2.q0 q0Var = (t2.q0) (z2 ? f1403a : f1404b).g(cVar);
        return q0Var == null ? new u(cVar, z2) : q0Var;
    }
}
