package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: a, reason: collision with root package name */
    public float f15223a;

    public l(float f10) {
        this.f15223a = f10;
    }

    @Override // t.p
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f15223a;
        }
        return 0.0f;
    }

    @Override // t.p
    public final int b() {
        return 1;
    }

    @Override // t.p
    public final p c() {
        return new l(0.0f);
    }

    @Override // t.p
    public final void d() {
        this.f15223a = 0.0f;
    }

    @Override // t.p
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f15223a = f10;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && ((l) obj).f15223a == this.f15223a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15223a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f15223a;
    }
}
