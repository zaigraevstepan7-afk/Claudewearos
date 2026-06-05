package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7165a;

    public p0(String str) {
        this.f7165a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            return fj.l.b(this.f7165a, ((p0) obj).f7165a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7165a.hashCode();
    }

    public final String toString() {
        return m6.a.i(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f7165a, ')');
    }
}
