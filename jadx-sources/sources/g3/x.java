package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final w f7191a;

    /* renamed from: b, reason: collision with root package name */
    public final v f7192b;

    public x(w wVar, v vVar) {
        this.f7191a = wVar;
        this.f7192b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return fj.l.b(this.f7192b, xVar.f7192b) && fj.l.b(this.f7191a, xVar.f7191a);
    }

    public final int hashCode() {
        w wVar = this.f7191a;
        int iHashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        v vVar = this.f7192b;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f7191a + ", paragraphSyle=" + this.f7192b + ')';
    }

    public x() {
        this(null, new v());
    }
}
