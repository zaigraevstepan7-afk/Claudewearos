package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f9094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f9095c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f9096d;

    public /* synthetic */ g(ej.c cVar, f1.a1 a1Var, f1.a1 a1Var2, int i10) {
        this.f9093a = i10;
        this.f9094b = cVar;
        this.f9095c = a1Var;
        this.f9096d = a1Var2;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f9093a) {
            case 0:
                l3.t tVar = (l3.t) obj;
                this.f9095c.setValue(tVar);
                f1.a1 a1Var = this.f9096d;
                boolean zB = fj.l.b((String) a1Var.getValue(), tVar.f9937a.f7081b);
                g3.f fVar = tVar.f9937a;
                a1Var.setValue(fVar.f7081b);
                if (!zB) {
                    this.f9094b.invoke(fVar.f7081b);
                }
                break;
            default:
                ta.m mVar = (ta.m) obj;
                fj.l.f(mVar, "action");
                boolean z2 = mVar instanceof ta.h;
                f1.a1 a1Var2 = this.f9095c;
                f1.a1 a1Var3 = this.f9096d;
                if (z2) {
                    a1Var2.setValue(Boolean.TRUE);
                    a1Var3.setValue(null);
                } else if (mVar instanceof ta.g) {
                    a1Var2.setValue(Boolean.FALSE);
                    a1Var3.setValue(null);
                } else {
                    this.f9094b.invoke(new ib.a(mVar));
                }
                break;
        }
        return pi.o.f13011a;
    }
}
