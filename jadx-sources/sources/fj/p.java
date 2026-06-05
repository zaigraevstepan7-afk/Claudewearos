package fj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Class f6801a;

    public p(Class cls) {
        this.f6801a = cls;
    }

    @Override // fj.e
    public final Class a() {
        return this.f6801a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return l.b(this.f6801a, ((p) obj).f6801a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6801a.hashCode();
    }

    public final String toString() {
        return this.f6801a.toString() + " (Kotlin reflection is not available)";
    }
}
