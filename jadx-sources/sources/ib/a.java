package ib;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final ta.m f8407a;

    public a(ta.m mVar) {
        fj.l.f(mVar, "action");
        this.f8407a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && fj.l.b(this.f8407a, ((a) obj).f8407a);
    }

    public final int hashCode() {
        return this.f8407a.hashCode();
    }

    public final String toString() {
        return "BottomBarAction(action=" + this.f8407a + ")";
    }
}
