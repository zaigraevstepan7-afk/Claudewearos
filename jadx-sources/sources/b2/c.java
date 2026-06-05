package b2;

import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f1501e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f1502a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1503b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1504c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1505d;

    public c(float f10, float f11, float f12, float f13) {
        this.f1502a = f10;
        this.f1503b = f11;
        this.f1504c = f12;
        this.f1505d = f13;
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f1502a) & (fIntBitsToFloat < this.f1504c) & (fIntBitsToFloat2 >= this.f1503b) & (fIntBitsToFloat2 < this.f1505d);
    }

    public final long b() {
        float f10 = this.f1504c;
        float f11 = this.f1502a;
        float f12 = ((f10 - f11) / 2.0f) + f11;
        float f13 = this.f1505d;
        float f14 = this.f1503b;
        return (Float.floatToRawIntBits(((f13 - f14) / 2.0f) + f14) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    public final long c() {
        float f10 = this.f1504c - this.f1502a;
        float f11 = this.f1505d - this.f1503b;
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public final long d() {
        return (Float.floatToRawIntBits(this.f1502a) << 32) | (Float.floatToRawIntBits(this.f1503b) & 4294967295L);
    }

    public final c e(c cVar) {
        return new c(Math.max(this.f1502a, cVar.f1502a), Math.max(this.f1503b, cVar.f1503b), Math.min(this.f1504c, cVar.f1504c), Math.min(this.f1505d, cVar.f1505d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f1502a, cVar.f1502a) == 0 && Float.compare(this.f1503b, cVar.f1503b) == 0 && Float.compare(this.f1504c, cVar.f1504c) == 0 && Float.compare(this.f1505d, cVar.f1505d) == 0;
    }

    public final boolean f() {
        return (this.f1502a >= this.f1504c) | (this.f1503b >= this.f1505d);
    }

    public final boolean g(c cVar) {
        return (this.f1502a < cVar.f1504c) & (cVar.f1502a < this.f1504c) & (this.f1503b < cVar.f1505d) & (cVar.f1503b < this.f1505d);
    }

    public final c h(float f10, float f11) {
        return new c(this.f1502a + f10, this.f1503b + f11, this.f1504c + f10, this.f1505d + f11);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1505d) + gk.b.f(this.f1504c, gk.b.f(this.f1503b, Float.hashCode(this.f1502a) * 31, 31), 31);
    }

    public final c i(long j) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        return new c(Float.intBitsToFloat(i10) + this.f1502a, Float.intBitsToFloat(i11) + this.f1503b, Float.intBitsToFloat(i10) + this.f1504c, Float.intBitsToFloat(i11) + this.f1505d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + v.j0(this.f1502a) + ", " + v.j0(this.f1503b) + ", " + v.j0(this.f1504c) + ", " + v.j0(this.f1505d) + ')';
    }
}
