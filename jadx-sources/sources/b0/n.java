package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class n extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final v1.g f1377b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1378c;

    public n(v1.g gVar, boolean z2) {
        this.f1377b = gVar;
        this.f1378c = z2;
    }

    @Override // v2.x0
    public final v1.n d() {
        o oVar = new o();
        oVar.H = this.f1377b;
        oVar.I = this.f1378c;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        n nVar = obj instanceof n ? (n) obj : null;
        return nVar != null && this.f1377b.equals(nVar.f1377b) && this.f1378c == nVar.f1378c;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        o oVar = (o) nVar;
        oVar.H = this.f1377b;
        oVar.I = this.f1378c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1378c) + (this.f1377b.hashCode() * 31);
    }
}
