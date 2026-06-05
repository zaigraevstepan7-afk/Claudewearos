package s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends fj.m implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1.q f14598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f14600c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1.e f14601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t1.q qVar, Object obj, r rVar, p1.e eVar) {
        super(3);
        this.f14598a = qVar;
        this.f14599b = obj;
        this.f14600c = rVar;
        this.f14601d = eVar;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        b0 b0Var = (b0) obj;
        f1.i0 i0Var = (f1.i0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? i0Var.f(b0Var) : i0Var.h(b0Var) ? 4 : 2;
        }
        if (i0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            t1.q qVar = this.f14598a;
            boolean zF = i0Var.f(qVar);
            Object obj4 = this.f14599b;
            boolean zH = zF | i0Var.h(obj4);
            r rVar = this.f14600c;
            boolean zH2 = zH | i0Var.h(rVar);
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (zH2 || objQ == fVar) {
                objQ = new a2.n(qVar, obj4, rVar, 1);
                i0Var.l0(objQ);
            }
            f1.s.c(b0Var, (ej.c) objQ, i0Var);
            q.g0 g0Var = rVar.f14668c;
            fj.l.d(b0Var, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            g0Var.m(obj4, ((c0) b0Var).f14572a);
            Object objQ2 = i0Var.Q();
            if (objQ2 == fVar) {
                objQ2 = new m();
                i0Var.l0(objQ2);
            }
            this.f14601d.e((m) objQ2, obj4, i0Var, 0);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
