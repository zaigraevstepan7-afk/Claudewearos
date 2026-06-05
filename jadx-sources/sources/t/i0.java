package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Float f15189a;

    /* renamed from: b, reason: collision with root package name */
    public w f15190b;

    public i0(Float f10, w wVar) {
        this.f15189a = f10;
        this.f15190b = wVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return i0Var.f15189a.equals(this.f15189a) && fj.l.b(i0Var.f15190b, this.f15190b);
    }

    public final int hashCode() {
        return this.f15190b.hashCode() + gk.b.g(0, this.f15189a.hashCode() * 31, 31);
    }
}
