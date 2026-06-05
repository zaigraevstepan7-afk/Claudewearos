package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o1 extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f15615b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(p1 p1Var, int i10) {
        super(2);
        this.f15614a = i10;
        this.f15615b = p1Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15614a) {
            case 0:
                this.f15615b.a().f15601b = (f1.p) obj2;
                break;
            case 1:
                m0 m0VarA = this.f15615b.a();
                ((v2.f0) obj).c0(new i0(m0VarA, (ej.e) obj2, m0VarA.I));
                break;
            default:
                v2.f0 f0Var = (v2.f0) obj;
                p1 p1Var = this.f15615b;
                r1 r1Var = p1Var.f15622a;
                m0 m0Var = f0Var.f17623a0;
                if (m0Var == null) {
                    m0Var = new m0(f0Var, r1Var);
                    f0Var.f17623a0 = m0Var;
                }
                p1Var.f15623b = m0Var;
                p1Var.a().h();
                m0 m0VarA2 = p1Var.a();
                if (m0VarA2.f15602c != r1Var) {
                    m0VarA2.f15602c = r1Var;
                    m0VarA2.i(false);
                    v2.f0.V(m0VarA2.f15600a, false, 7);
                }
                break;
        }
        return pi.o.f13011a;
    }
}
