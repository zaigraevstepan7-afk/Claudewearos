package di;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final String f5137b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5138c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5139d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5140e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5141f;

    public c(String str, String str2, String str3, String str4, long j) {
        this.f5137b = str;
        this.f5138c = str2;
        this.f5139d = str3;
        this.f5140e = str4;
        this.f5141f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            c cVar = (c) ((e) obj);
            if (this.f5137b.equals(cVar.f5137b) && this.f5138c.equals(cVar.f5138c) && this.f5139d.equals(cVar.f5139d) && this.f5140e.equals(cVar.f5140e) && this.f5141f == cVar.f5141f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f5137b.hashCode() ^ 1000003) * 1000003) ^ this.f5138c.hashCode()) * 1000003) ^ this.f5139d.hashCode()) * 1000003) ^ this.f5140e.hashCode()) * 1000003;
        long j = this.f5141f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutId=" + this.f5137b + ", variantId=" + this.f5138c + ", parameterKey=" + this.f5139d + ", parameterValue=" + this.f5140e + ", templateVersion=" + this.f5141f + "}";
    }
}
