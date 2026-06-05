package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f9344b;

    public /* synthetic */ z(t0 t0Var, int i10) {
        this.f9343a = i10;
        this.f9344b = t0Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f9343a) {
            case 0:
                t2.w wVar = (t2.w) obj;
                s1 s1VarD = this.f9344b.d();
                if (s1VarD != null) {
                    s1VarD.f9256c = wVar;
                }
                return pi.o.f13011a;
            case 1:
                t0 t0Var = this.f9344b;
                f1.j1 j1Var = t0Var.f9282t;
                l3.t tVar = (l3.t) obj;
                String str = tVar.f9937a.f7081b;
                g3.f fVar = t0Var.j;
                if (!fj.l.b(str, fVar != null ? fVar.f7081b : null)) {
                    t0Var.f9273k.setValue(k0.f9150a);
                    if (((Boolean) j1Var.getValue()).booleanValue()) {
                        j1Var.setValue(Boolean.FALSE);
                    } else {
                        t0Var.f9281s.setValue(Boolean.FALSE);
                    }
                }
                long j = g3.m0.f7143b;
                t0Var.f(j);
                t0Var.e(j);
                t0Var.f9283u.invoke(tVar);
                f1.t1 t1Var = t0Var.f9265b;
                f1.r rVar = t1Var.f6453a;
                if (rVar != null) {
                    rVar.s(t1Var, null);
                }
                return pi.o.f13011a;
            case 2:
                this.f9344b.f9280r.L(((l3.i) obj).f9912a);
                return pi.o.f13011a;
            case 3:
                return Boolean.valueOf(this.f9344b.f9280r.L(((l3.i) obj).f9912a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f9344b.f9279q.setValue(bool);
                return pi.o.f13011a;
        }
    }
}
