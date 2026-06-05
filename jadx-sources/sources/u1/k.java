package u1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f16576a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f16577b;

    public k(int i10, Integer num) {
        this.f16576a = i10;
        this.f16577b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f16576a == kVar.f16576a && fj.l.b(this.f16577b, kVar.f16577b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f16576a) * 31;
        Integer num = this.f16577b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f16576a + ", dataOffset=" + this.f16577b + ')';
    }
}
