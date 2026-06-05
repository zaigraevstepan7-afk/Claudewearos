package ph;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f12967a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12968b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12969c;

    public a(String str, long j, long j4) {
        this.f12967a = str;
        this.f12968b = j;
        this.f12969c = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f12967a.equals(aVar.f12967a) && this.f12968b == aVar.f12968b && this.f12969c == aVar.f12969c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f12967a.hashCode() ^ 1000003) * 1000003;
        long j = this.f12968b;
        long j4 = this.f12969c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f12967a + ", tokenExpirationTimestamp=" + this.f12968b + ", tokenCreationTimestamp=" + this.f12969c + "}";
    }
}
