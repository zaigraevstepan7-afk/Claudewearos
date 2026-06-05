package k3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final y f9376a;

    public f(y yVar) {
        this.f9376a = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && fj.l.b(this.f9376a, ((f) obj).f9376a);
    }

    public final int hashCode() {
        return this.f9376a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f9376a + ", loaderKey=null)";
    }
}
