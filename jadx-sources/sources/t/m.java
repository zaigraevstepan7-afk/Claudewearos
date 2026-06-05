package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: a, reason: collision with root package name */
    public float f15229a;

    /* renamed from: b, reason: collision with root package name */
    public float f15230b;

    public m(float f10, float f11) {
        this.f15229a = f10;
        this.f15230b = f11;
    }

    @Override // t.p
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f15229a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f15230b;
    }

    @Override // t.p
    public final int b() {
        return 2;
    }

    @Override // t.p
    public final p c() {
        return new m(0.0f, 0.0f);
    }

    @Override // t.p
    public final void d() {
        this.f15229a = 0.0f;
        this.f15230b = 0.0f;
    }

    @Override // t.p
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f15229a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f15230b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f15229a == this.f15229a && mVar.f15230b == this.f15230b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15230b) + (Float.hashCode(this.f15229a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f15229a + ", v2 = " + this.f15230b;
    }
}
