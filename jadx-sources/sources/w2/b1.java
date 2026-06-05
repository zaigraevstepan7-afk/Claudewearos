package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b1 extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18202a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f18203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f18204c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.e f18205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(t tVar, d1 d1Var, ej.e eVar) {
        super(2);
        this.f18204c = tVar;
        this.f18203b = d1Var;
        this.f18205d = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18202a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.b0(866651995);
                    f1.a(this.f18204c, this.f18203b.f18235k, this.f18205d, i0Var, 0);
                    i0Var.p(false);
                } else {
                    i0Var.W();
                }
                break;
            default:
                ((Number) obj2).intValue();
                this.f18203b.a(this.f18204c, this.f18205d, (f1.i0) obj, f1.s.O(1));
                break;
        }
        return pi.o.f13011a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(d1 d1Var, t tVar, ej.e eVar, int i10) {
        super(2);
        this.f18203b = d1Var;
        this.f18204c = tVar;
        this.f18205d = eVar;
    }
}
