package q2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f13180a;

    /* renamed from: b, reason: collision with root package name */
    public float f13181b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13180a == aVar.f13180a && Float.compare(this.f13181b, aVar.f13181b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13181b) + (Long.hashCode(this.f13180a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f13180a);
        sb2.append(", dataPoint=");
        return gk.b.o(sb2, this.f13181b, ')');
    }
}
