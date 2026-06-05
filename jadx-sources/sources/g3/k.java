package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final String f7126a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f7127b;

    public k(String str, l0 l0Var) {
        this.f7126a = str;
        this.f7127b = l0Var;
    }

    @Override // g3.l
    public final l0 a() {
        return this.f7127b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return fj.l.b(this.f7126a, kVar.f7126a) && fj.l.b(this.f7127b, kVar.f7127b);
    }

    public final int hashCode() {
        int iHashCode = this.f7126a.hashCode() * 31;
        l0 l0Var = this.f7127b;
        return (iHashCode + (l0Var != null ? l0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return m6.a.i(new StringBuilder("LinkAnnotation.Url(url="), this.f7126a, ')');
    }
}
