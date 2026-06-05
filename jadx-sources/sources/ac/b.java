package ac;

import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final dc.a f367a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f368b;

    public b(dc.a aVar, HashMap map) {
        this.f367a = aVar;
        this.f368b = map;
    }

    public final long a(rb.d dVar, long j, int i10) {
        long jA = j - this.f367a.a();
        c cVar = (c) this.f368b.get(dVar);
        long j4 = cVar.f369a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * j4 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j4 > 1 ? j4 : 2L) * r12))), jA), cVar.f370b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f367a.equals(bVar.f367a) && this.f368b.equals(bVar.f368b);
    }

    public final int hashCode() {
        return ((this.f367a.hashCode() ^ 1000003) * 1000003) ^ this.f368b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f367a + ", values=" + this.f368b + "}";
    }
}
