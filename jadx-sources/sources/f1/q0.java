package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f6420a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6421b;

    public q0(Integer num, Object obj) {
        this.f6420a = num;
        this.f6421b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f6420a.equals(q0Var.f6420a) && fj.l.b(this.f6421b, q0Var.f6421b);
    }

    public final int hashCode() {
        int iHashCode = this.f6420a.hashCode() * 31;
        Object obj = this.f6421b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f6420a + ", right=" + this.f6421b + ')';
    }
}
