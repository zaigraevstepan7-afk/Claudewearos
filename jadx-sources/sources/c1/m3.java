package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m3 implements ej.e {
    public final /* synthetic */ v1.o A;
    public final /* synthetic */ float B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ c2.w0 D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ ej.e H;
    public final /* synthetic */ ej.e I;
    public final /* synthetic */ p1.e J;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f2420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x5 f2421c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w3 f2422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t.c f2423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qj.z f2424f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ej.c f2425z;

    public m3(long j, ej.a aVar, x5 x5Var, w3 w3Var, t.c cVar, qj.z zVar, ej.c cVar2, v1.o oVar, float f10, boolean z2, c2.w0 w0Var, long j4, long j10, float f11, ej.e eVar, ej.e eVar2, p1.e eVar3) {
        this.f2419a = j;
        this.f2420b = aVar;
        this.f2421c = x5Var;
        this.f2422d = w3Var;
        this.f2423e = cVar;
        this.f2424f = zVar;
        this.f2425z = cVar2;
        this.A = oVar;
        this.B = f10;
        this.C = z2;
        this.D = w0Var;
        this.E = j4;
        this.F = j10;
        this.G = f11;
        this.H = eVar;
        this.I = eVar2;
        this.J = eVar3;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            v1.o oVarC = b0.d.C(b0.t1.f1433c, b0.d.f1296f);
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = new ab.d(13);
                i0Var.l0(objQ);
            }
            v1.o oVarA = d3.p.a(oVarC, false, (ej.c) objQ);
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iT = f1.s.t(i0Var);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC2 = v1.a.c(i0Var, oVarA);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            v2.e eVar = v2.g.f17650g;
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iT))) {
                m6.a.l(iT, i0Var, iT, eVar);
            }
            f1.s.M(v2.g.f17647d, i0Var, oVarC2);
            x5 x5Var = this.f2421c;
            boolean z2 = ((y5) x5Var.f2867d.f4561h.getValue()) != y5.f2911a;
            boolean z10 = this.f2422d.f2823c;
            long j = this.f2419a;
            ej.a aVar = this.f2420b;
            v3.c(j, aVar, z2, z10, i0Var, 0);
            v3.b(this.f2423e, this.f2424f, aVar, this.f2425z, this.A, x5Var, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, i0Var, 70);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
