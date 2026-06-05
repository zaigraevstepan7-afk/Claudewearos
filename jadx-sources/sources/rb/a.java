package rb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14313a;

    /* renamed from: b, reason: collision with root package name */
    public final b f14314b;

    public a(Object obj, b bVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f14313a = obj;
        this.f14314b = bVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.f14314b;
            if (this.f14313a.equals(aVar.f14313a)) {
                Object obj2 = d.f14317a;
                if (obj2.equals(obj2) && ((bVar = this.f14314b) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f14313a.hashCode()) * 1000003) ^ d.f14317a.hashCode()) * 1000003;
        b bVar = this.f14314b;
        return (bVar == null ? 0 : bVar.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f14313a + ", priority=" + d.f14317a + ", productData=" + this.f14314b + "}";
    }
}
