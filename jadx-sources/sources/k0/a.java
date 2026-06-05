package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9027a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1.o f9029c;

    public /* synthetic */ a(long j, v1.o oVar) {
        this.f9028b = j;
        this.f9029c = oVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        Integer num = (Integer) obj2;
        switch (this.f9027a) {
            case 0:
                int iIntValue = num.intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j = this.f9028b;
                    v1.o oVar = this.f9029c;
                    if (j != 9205357640488583168L) {
                        i0Var.b0(-1244013944);
                        v1.o oVarJ = b0.t1.j(oVar, s3.h.b(j), s3.h.a(j), 0.0f, 0.0f, 12);
                        t2.q0 q0VarD = b0.r.d(v1.b.f17548b, false);
                        int iHashCode = Long.hashCode(i0Var.T);
                        f1.n1 n1VarL = i0Var.l();
                        v1.o oVarC = v1.a.c(i0Var, oVarJ);
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
                        f1.s.M(v2.g.f17650g, i0Var, Integer.valueOf(iHashCode));
                        f1.s.I(v2.g.f17651h, i0Var);
                        f1.s.M(v2.g.f17647d, i0Var, oVarC);
                        b.b(null, i0Var, 0, 1);
                        i0Var.p(true);
                        i0Var.p(false);
                    } else {
                        i0Var.b0(-1243644858);
                        b.b(oVar, i0Var, 0, 0);
                        i0Var.p(false);
                    }
                } else {
                    i0Var.W();
                }
                break;
            default:
                num.getClass();
                wd.a.e(this.f9028b, this.f9029c, i0Var, f1.s.O(49));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ a(long j, v1.o oVar, int i10) {
        this.f9028b = j;
        this.f9029c = oVar;
    }
}
