package f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class v extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final y f6196b;

    public v(y yVar) {
        this.f6196b = yVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        w wVar = new w();
        wVar.H = this.f6196b;
        return wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && fj.l.b(this.f6196b, ((v) obj).f6196b);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        w wVar = (w) nVar;
        y yVar = wVar.H;
        y yVar2 = this.f6196b;
        if (fj.l.b(yVar, yVar2) || !wVar.f17565a.G) {
            return;
        }
        y yVar3 = wVar.H;
        yVar3.d();
        yVar3.f6207b = null;
        wVar.H = yVar2;
    }

    public final int hashCode() {
        return this.f6196b.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f6196b + ')';
    }
}
