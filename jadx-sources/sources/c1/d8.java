package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d8 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t.j1 f2035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.e f2036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g8 f2037c;

    public d8(t.j1 j1Var, p1.e eVar, g8 g8Var) {
        this.f2035a = j1Var;
        this.f2036b = eVar;
        this.f2037c = g8Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            v1.j jVar = new v1.j(new f4(this.f2035a, 2));
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iT = f1.s.t(i0Var);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, jVar);
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
            this.f2036b.c(this.f2037c, i0Var, 6);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
