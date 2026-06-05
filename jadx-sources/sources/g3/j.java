package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public final String f7115a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f7116b;

    public j(String str, l0 l0Var) {
        this.f7115a = str;
        this.f7116b = l0Var;
    }

    @Override // g3.l
    public final l0 a() {
        return this.f7116b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return fj.l.b(this.f7115a, jVar.f7115a) && fj.l.b(this.f7116b, jVar.f7116b);
    }

    public final int hashCode() {
        int iHashCode = this.f7115a.hashCode() * 31;
        l0 l0Var = this.f7116b;
        return (iHashCode + (l0Var != null ? l0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return m6.a.i(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f7115a, ')');
    }
}
