package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final r3.j f17476a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17477b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17478c;

    public t(r3.j jVar, int i10, long j) {
        this.f17476a = jVar;
        this.f17477b = i10;
        this.f17478c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f17476a == tVar.f17476a && this.f17477b == tVar.f17477b && this.f17478c == tVar.f17478c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17478c) + gk.b.g(this.f17477b, this.f17476a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f17476a + ", offset=" + this.f17477b + ", selectableId=" + this.f17478c + ')';
    }
}
