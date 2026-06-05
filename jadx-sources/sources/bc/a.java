package bc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1722f = new a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f1723a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1724b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1725c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1726d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1727e;

    public a(long j, int i10, int i11, long j4, int i12) {
        this.f1723a = j;
        this.f1724b = i10;
        this.f1725c = i11;
        this.f1726d = j4;
        this.f1727e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f1723a == aVar.f1723a && this.f1724b == aVar.f1724b && this.f1725c == aVar.f1725c && this.f1726d == aVar.f1726d && this.f1727e == aVar.f1727e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f1723a;
        int i10 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f1724b) * 1000003) ^ this.f1725c) * 1000003;
        long j4 = this.f1726d;
        return ((i10 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f1727e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f1723a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f1724b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f1725c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f1726d);
        sb2.append(", maxBlobByteSizePerRow=");
        return m6.a.h(sb2, this.f1727e, "}");
    }
}
