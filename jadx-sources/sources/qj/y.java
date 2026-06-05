package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class y extends ti.a {

    /* renamed from: c, reason: collision with root package name */
    public static final w f13640c = new w();

    /* renamed from: b, reason: collision with root package name */
    public final String f13641b;

    public y() {
        super(f13640c);
        this.f13641b = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && fj.l.b(this.f13641b, ((y) obj).f13641b);
    }

    public final int hashCode() {
        return this.f13641b.hashCode();
    }

    public final String toString() {
        return m6.a.i(new StringBuilder("CoroutineName("), this.f13641b, ')');
    }
}
