package rb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f14316a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f14316a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f14316a.equals(((c) obj).f14316a);
    }

    public final int hashCode() {
        return this.f14316a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return m6.a.j(new StringBuilder("Encoding{name=\""), this.f14316a, "\"}");
    }
}
