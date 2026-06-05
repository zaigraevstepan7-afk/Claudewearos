package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7162a;

    public o0(String str) {
        this.f7162a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            return fj.l.b(this.f7162a, ((o0) obj).f7162a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7162a.hashCode();
    }

    public final String toString() {
        return m6.a.i(new StringBuilder("UrlAnnotation(url="), this.f7162a, ')');
    }
}
