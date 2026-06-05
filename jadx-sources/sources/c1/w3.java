package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w3 {

    /* renamed from: a, reason: collision with root package name */
    public final w3.e0 f2821a = w3.e0.f18499a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2822b = true;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2823c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return this.f2821a == w3Var.f2821a && this.f2823c == w3Var.f2823c && this.f2822b == w3Var.f2822b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2823c) + gk.b.i(this.f2821a.hashCode() * 31, 29791, this.f2822b);
    }
}
