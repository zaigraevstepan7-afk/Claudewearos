package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class a2 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1277b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1278c;

    public a2(float f10, float f11) {
        this.f1277b = f10;
        this.f1278c = f11;
    }

    @Override // v2.x0
    public final v1.n d() {
        b2 b2Var = new b2();
        b2Var.H = this.f1277b;
        b2Var.I = this.f1278c;
        return b2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return s3.f.e(this.f1277b, a2Var.f1277b) && s3.f.e(this.f1278c, a2Var.f1278c);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        b2 b2Var = (b2) nVar;
        b2Var.H = this.f1277b;
        b2Var.I = this.f1278c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1278c) + (Float.hashCode(this.f1277b) * 31);
    }
}
