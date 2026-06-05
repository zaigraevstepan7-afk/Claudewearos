package bc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f1728a;

    /* renamed from: b, reason: collision with root package name */
    public final ub.i f1729b;

    /* renamed from: c, reason: collision with root package name */
    public final ub.h f1730c;

    public b(long j, ub.i iVar, ub.h hVar) {
        this.f1728a = j;
        this.f1729b = iVar;
        this.f1730c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f1728a == bVar.f1728a && this.f1729b.equals(bVar.f1729b) && this.f1730c.equals(bVar.f1730c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f1728a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f1729b.hashCode()) * 1000003) ^ this.f1730c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f1728a + ", transportContext=" + this.f1729b + ", event=" + this.f1730c + "}";
    }
}
