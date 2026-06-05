package tb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f16278a;

    public j(h hVar) {
        this.f16278a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f16295a;
        if (obj2.equals(obj2)) {
            return this.f16278a.equals(((j) qVar).f16278a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f16295a.hashCode() ^ 1000003) * 1000003) ^ this.f16278a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f16295a + ", androidClientInfo=" + this.f16278a + "}";
    }
}
