package kj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends f implements e {

    /* renamed from: d, reason: collision with root package name */
    public static final h f9672d = new h(1, 0, 1);

    @Override // kj.e
    public final Comparable b() {
        return Integer.valueOf(this.f9665a);
    }

    @Override // kj.e
    public final Comparable e() {
        return Integer.valueOf(this.f9666b);
    }

    @Override // kj.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (isEmpty() && ((h) obj).isEmpty()) {
            return true;
        }
        h hVar = (h) obj;
        return this.f9665a == hVar.f9665a && this.f9666b == hVar.f9666b;
    }

    @Override // kj.f
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f9665a * 31) + this.f9666b;
    }

    @Override // kj.f, kj.e
    public final boolean isEmpty() {
        return this.f9665a > this.f9666b;
    }

    @Override // kj.f
    public final String toString() {
        return this.f9665a + ".." + this.f9666b;
    }
}
