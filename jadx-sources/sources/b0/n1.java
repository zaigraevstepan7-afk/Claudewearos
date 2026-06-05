package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public float f1381a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1382b = true;

    /* renamed from: c, reason: collision with root package name */
    public f0 f1383c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Float.compare(this.f1381a, n1Var.f1381a) == 0 && this.f1382b == n1Var.f1382b && fj.l.b(this.f1383c, n1Var.f1383c);
    }

    public final int hashCode() {
        int i10 = gk.b.i(Float.hashCode(this.f1381a) * 31, 31, this.f1382b);
        f0 f0Var = this.f1383c;
        return (i10 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f1381a + ", fill=" + this.f1382b + ", crossAxisAlignment=" + this.f1383c + ", flowLayoutData=null)";
    }
}
