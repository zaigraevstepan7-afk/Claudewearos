package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f17316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d3.j f17318c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.a f17319d;

    public w(a1 a1Var, boolean z2, d3.j jVar, ej.a aVar) {
        this.f17316a = a1Var;
        this.f17317b = z2;
        this.f17318c = jVar;
        this.f17319d = aVar;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        f1.i0 i0Var = (f1.i0) obj2;
        ((Number) obj3).intValue();
        i0Var.b0(-1525724089);
        Object objQ = i0Var.Q();
        if (objQ == f1.m.f6385a) {
            objQ = t.m1.p(i0Var);
        }
        z.k kVar = (z.k) objQ;
        v1.o oVarC = x0.a(v1.l.f17564b, kVar, this.f17316a).c(new v(kVar, null, false, this.f17317b, null, this.f17318c, this.f17319d));
        i0Var.p(false);
        return oVarC;
    }
}
