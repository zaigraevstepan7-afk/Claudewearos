package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public float f15239a;

    /* renamed from: b, reason: collision with root package name */
    public float f15240b;

    /* renamed from: c, reason: collision with root package name */
    public float f15241c;

    /* renamed from: d, reason: collision with root package name */
    public float f15242d;

    public o(float f10, float f11, float f12, float f13) {
        this.f15239a = f10;
        this.f15240b = f11;
        this.f15241c = f12;
        this.f15242d = f13;
    }

    @Override // t.p
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f15239a;
        }
        if (i10 == 1) {
            return this.f15240b;
        }
        if (i10 == 2) {
            return this.f15241c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f15242d;
    }

    @Override // t.p
    public final int b() {
        return 4;
    }

    @Override // t.p
    public final p c() {
        return new o(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // t.p
    public final void d() {
        this.f15239a = 0.0f;
        this.f15240b = 0.0f;
        this.f15241c = 0.0f;
        this.f15242d = 0.0f;
    }

    @Override // t.p
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f15239a = f10;
            return;
        }
        if (i10 == 1) {
            this.f15240b = f10;
        } else if (i10 == 2) {
            this.f15241c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f15242d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f15239a == this.f15239a && oVar.f15240b == this.f15240b && oVar.f15241c == this.f15241c && oVar.f15242d == this.f15242d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15242d) + gk.b.f(this.f15241c, gk.b.f(this.f15240b, Float.hashCode(this.f15239a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f15239a + ", v2 = " + this.f15240b + ", v3 = " + this.f15241c + ", v4 = " + this.f15242d;
    }
}
