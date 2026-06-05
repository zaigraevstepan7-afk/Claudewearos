package c2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 extends e0 {

    /* renamed from: f, reason: collision with root package name */
    public final b2.c f3018f;

    public m0(b2.c cVar) {
        this.f3018f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            return fj.l.b(this.f3018f, ((m0) obj).f3018f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3018f.hashCode();
    }

    @Override // c2.e0
    public final b2.c o() {
        return this.f3018f;
    }
}
