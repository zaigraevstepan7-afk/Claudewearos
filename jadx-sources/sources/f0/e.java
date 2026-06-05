package f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public d f6129b;

    /* renamed from: c, reason: collision with root package name */
    public qj.r f6130c;

    @Override // v2.x0
    public final v1.n d() {
        return new d(this);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // v2.x0
    public final /* bridge */ /* synthetic */ void g(v1.n nVar) {
    }

    public final Object h(vi.c cVar) throws Throwable {
        qj.r rVarA = this.f6130c;
        if (rVarA == null) {
            rVarA = qj.b0.a();
            this.f6130c = rVarA;
            d dVar = this.f6129b;
            if (dVar != null && dVar.G) {
                dVar.q1();
            }
        }
        Object objK = rVarA.k(cVar);
        return objK == ui.a.f17085a ? objK : pi.o.f13011a;
    }

    public final int hashCode() {
        return 234;
    }
}
