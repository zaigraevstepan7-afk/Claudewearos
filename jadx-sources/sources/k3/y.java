package k3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f9406a;

    /* renamed from: b, reason: collision with root package name */
    public final s f9407b;

    /* renamed from: c, reason: collision with root package name */
    public final r f9408c;

    public y(int i10, s sVar, r rVar) {
        this.f9406a = i10;
        this.f9407b = sVar;
        this.f9408c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f9406a == yVar.f9406a && fj.l.b(this.f9407b, yVar.f9407b) && this.f9408c.equals(yVar.f9408c);
    }

    public final int hashCode() {
        return this.f9408c.f9394a.hashCode() + gk.b.g(0, gk.b.g(0, ((this.f9406a * 31) + this.f9407b.f9401a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f9406a + ", weight=" + this.f9407b + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
