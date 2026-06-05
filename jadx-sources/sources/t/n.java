package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: a, reason: collision with root package name */
    public float f15233a;

    /* renamed from: b, reason: collision with root package name */
    public float f15234b;

    /* renamed from: c, reason: collision with root package name */
    public float f15235c;

    public n(float f10, float f11, float f12) {
        this.f15233a = f10;
        this.f15234b = f11;
        this.f15235c = f12;
    }

    @Override // t.p
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f15233a;
        }
        if (i10 == 1) {
            return this.f15234b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f15235c;
    }

    @Override // t.p
    public final int b() {
        return 3;
    }

    @Override // t.p
    public final p c() {
        return new n(0.0f, 0.0f, 0.0f);
    }

    @Override // t.p
    public final void d() {
        this.f15233a = 0.0f;
        this.f15234b = 0.0f;
        this.f15235c = 0.0f;
    }

    @Override // t.p
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f15233a = f10;
        } else if (i10 == 1) {
            this.f15234b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f15235c = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f15233a == this.f15233a && nVar.f15234b == this.f15234b && nVar.f15235c == this.f15235c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15235c) + gk.b.f(this.f15234b, Float.hashCode(this.f15233a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f15233a + ", v2 = " + this.f15234b + ", v3 = " + this.f15235c;
    }
}
