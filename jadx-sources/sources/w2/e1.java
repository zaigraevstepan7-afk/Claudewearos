package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e1 extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18250a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f18251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18252c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(v2.r1 r1Var, n0 n0Var, ej.e eVar, int i10) {
        super(2);
        this.f18252c = r1Var;
        this.f18253d = n0Var;
        this.f18251b = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18250a) {
            case 0:
                ((Number) obj2).intValue();
                f1.a((v2.r1) this.f18252c, (n0) this.f18253d, this.f18251b, (f1.i0) obj, f1.s.O(1));
                break;
            default:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Number) obj2).intValue();
                u2 u2Var = (u2) this.f18252c;
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t tVar = u2Var.f18431a;
                    boolean zH = i0Var.h(u2Var);
                    Object objQ = i0Var.Q();
                    ti.c cVar = null;
                    f1.f fVar = f1.m.f6385a;
                    if (zH || objQ == fVar) {
                        objQ = new t2(u2Var, cVar, 0);
                        i0Var.l0(objQ);
                    }
                    f1.s.f((ej.e) objQ, i0Var, tVar);
                    boolean zH2 = i0Var.h(u2Var);
                    Object objQ2 = i0Var.Q();
                    if (zH2 || objQ2 == fVar) {
                        objQ2 = new t2(u2Var, cVar, 1);
                        i0Var.l0(objQ2);
                    }
                    f1.s.f((ej.e) objQ2, i0Var, tVar);
                    ((d1) this.f18253d).a(tVar, this.f18251b, i0Var, 0);
                } else {
                    i0Var.W();
                }
                break;
        }
        return pi.o.f13011a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(u2 u2Var, d1 d1Var, ej.e eVar) {
        super(2);
        this.f18252c = u2Var;
        this.f18253d = d1Var;
        this.f18251b = eVar;
    }
}
