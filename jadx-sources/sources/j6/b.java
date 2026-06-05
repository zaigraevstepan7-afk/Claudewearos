package j6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f8697a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8698b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8699c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8700d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8701e;

    public b(int i10, float f10, float f11, float f12, long j) {
        this.f8697a = i10;
        this.f8698b = f10;
        this.f8699c = f11;
        this.f8700d = f12;
        this.f8701e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f8699c == bVar.f8699c && this.f8700d == bVar.f8700d && this.f8698b == bVar.f8698b && this.f8697a == bVar.f8697a && this.f8701e == bVar.f8701e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8701e) + gk.b.g(this.f8697a, gk.b.f(this.f8698b, gk.b.f(this.f8700d, Float.hashCode(this.f8699c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f8699c + ", touchY=" + this.f8700d + ", progress=" + this.f8698b + ", swipeEdge=" + this.f8697a + ", frameTimeMillis=" + this.f8701e + ')';
    }
}
