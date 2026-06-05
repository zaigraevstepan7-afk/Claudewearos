package g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final float f6929a;

    public k(float f10) {
        this.f6929a = f10;
    }

    @Override // g0.l
    public final int a(f0.g0 g0Var, int i10) {
        return g0Var.f6142b.I0(this.f6929a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return s3.f.e(this.f6929a, ((k) obj).f6929a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6929a);
    }
}
