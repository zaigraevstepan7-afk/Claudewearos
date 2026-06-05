package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class k extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1367b;

    public k(float f10) {
        this.f1367b = f10;
        if (f10 > 0.0f) {
            return;
        }
        c0.a.a("aspectRatio " + f10 + " must be > 0");
    }

    @Override // v2.x0
    public final v1.n d() {
        m mVar = new m();
        mVar.H = this.f1367b;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        k kVar = obj instanceof k ? (k) obj : null;
        if (kVar == null || this.f1367b != kVar.f1367b) {
            return false;
        }
        ((k) obj).getClass();
        return true;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((m) nVar).H = this.f1367b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.f1367b) * 31);
    }
}
