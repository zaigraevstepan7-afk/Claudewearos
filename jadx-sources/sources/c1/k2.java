package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2320c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2321d;

    public /* synthetic */ k2(long j, e1.l0 l0Var, ej.e eVar, int i10) {
        this.f2318a = 0;
        this.f2319b = j;
        this.f2320c = l0Var;
        this.f2321d = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2318a) {
            case 0:
                ((Integer) obj2).getClass();
                o2.c(this.f2319b, (e1.l0) this.f2320c, (ej.e) this.f2321d, (f1.i0) obj, f1.s.O(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                k0.b.a((v0.m) this.f2320c, (v1.o) this.f2321d, this.f2319b, (f1.i0) obj, f1.s.O(1));
                break;
            case 2:
                f1.a1 a1Var = (f1.a1) this.f2320c;
                f1.a1 a1Var2 = (f1.a1) this.f2321d;
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b0.b0 b0VarA = b0.z.a(b0.j.g(8), v1.b.E, i0Var, 6);
                    int iHashCode = Long.hashCode(i0Var.T);
                    f1.n1 n1VarL = i0Var.l();
                    v1.o oVarC = v1.a.c(i0Var, v1.l.f17564b);
                    v2.h.f17668w.getClass();
                    v2.f fVar = v2.g.f17645b;
                    i0Var.e0();
                    if (i0Var.S) {
                        i0Var.k(fVar);
                    } else {
                        i0Var.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var, b0VarA);
                    f1.s.M(v2.g.f17648e, i0Var, n1VarL);
                    f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var);
                    f1.s.M(v2.g.f17647d, i0Var, oVarC);
                    v7.a("Enter the private dev update password.", null, this.f2319b, hj.a.x(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24966, 0, 262122);
                    String str = (String) a1Var.getValue();
                    boolean z2 = ((String) a1Var2.getValue()) != null;
                    Object objQ = i0Var.Q();
                    if (objQ == f1.m.f6385a) {
                        objQ = new lb.x3(a1Var, a1Var2, 0);
                        i0Var.l0(objQ);
                    }
                    n4.a(str, (ej.c) objQ, null, false, null, lb.c.f10186x, z2, null, null, null, true, 0, 0, null, null, i0Var, 1572912, 8249276);
                    f1.i0 i0Var2 = i0Var;
                    if (((String) a1Var2.getValue()) != null) {
                        i0Var2.b0(912147206);
                        String str2 = (String) a1Var2.getValue();
                        fj.l.c(str2);
                        v7.a(str2, null, c2.e0.d(4294916912L), hj.a.x(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 24960, 0, 262122);
                        i0Var2 = i0Var2;
                        i0Var2.p(false);
                    } else {
                        i0Var2.b0(912367120);
                        i0Var2.p(false);
                    }
                    i0Var2.p(true);
                } else {
                    i0Var.W();
                }
                return pi.o.f13011a;
            case 3:
                ej.a aVar = (ej.a) this.f2320c;
                f1.a1 a1Var3 = (f1.a1) this.f2321d;
                f1.i0 i0Var3 = (f1.i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (i0Var3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zF = i0Var3.f(aVar);
                    Object objQ2 = i0Var3.Q();
                    if (zF || objQ2 == f1.m.f6385a) {
                        objQ2 = new mb.f(aVar, a1Var3, 1);
                        i0Var3.l0(objQ2);
                    }
                    z4.i((ej.a) objQ2, null, false, null, null, null, p1.j.d(960615172, new ra.g1(this.f2319b, 1), i0Var3), i0Var3, 805306368, 510);
                } else {
                    i0Var3.W();
                }
                return pi.o.f13011a;
            default:
                ((Integer) obj2).getClass();
                u0.b.b((v1.o) this.f2320c, (za.e) this.f2321d, this.f2319b, (f1.i0) obj, f1.s.O(385));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ k2(long j, f1.a1 a1Var, f1.a1 a1Var2) {
        this.f2318a = 2;
        this.f2319b = j;
        this.f2320c = a1Var;
        this.f2321d = a1Var2;
    }

    public /* synthetic */ k2(ej.a aVar, f1.a1 a1Var, long j) {
        this.f2318a = 3;
        this.f2320c = aVar;
        this.f2321d = a1Var;
        this.f2319b = j;
    }

    public /* synthetic */ k2(Object obj, Object obj2, long j, int i10, int i11) {
        this.f2318a = i11;
        this.f2320c = obj;
        this.f2321d = obj2;
        this.f2319b = j;
    }
}
