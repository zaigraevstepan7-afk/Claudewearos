package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c8 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f1997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.e f1999c;

    public c8(float f10, long j, p1.e eVar) {
        this.f1997a = f10;
        this.f1998b = j;
        this.f1999c = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            v1.o oVarS = b0.d.s(b0.t1.n(v1.l.f17564b, e8.f2073c, this.f1997a, 8), e8.f2074d);
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iT = f1.s.t(i0Var);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarS);
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
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            f1.s.b(new f1.r1[]{g1.f2116a.a(new c2.w(this.f1998b)), v7.f2781a.a(p8.a(e1.y.f5731d, i0Var))}, this.f1999c, i0Var, 8);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
