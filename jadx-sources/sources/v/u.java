package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final float f17289a;

    /* renamed from: b, reason: collision with root package name */
    public final c2.z0 f17290b;

    public u(float f10, c2.z0 z0Var) {
        this.f17289a = f10;
        this.f17290b = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return s3.f.e(this.f17289a, uVar.f17289a) && this.f17290b.equals(uVar.f17290b);
    }

    public final int hashCode() {
        return this.f17290b.hashCode() + (Float.hashCode(this.f17289a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) s3.f.f(this.f17289a)) + ", brush=" + this.f17290b + ')';
    }
}
