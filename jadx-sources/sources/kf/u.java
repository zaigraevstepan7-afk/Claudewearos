package kf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f9598a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9599b;

    public u(int i10, long j) {
        this.f9598a = i10;
        this.f9599b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f9598a == uVar.f9598a && this.f9599b == uVar.f9599b;
    }

    public final int hashCode() {
        long j = this.f9599b;
        return ((int) ((j >>> 32) ^ j)) ^ ((this.f9598a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f9598a + ", eventTimestamp=" + this.f9599b + "}";
    }
}
