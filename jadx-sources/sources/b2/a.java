package b2;

import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f1496a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f1497b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f1498c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f1499d = 0.0f;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f1496a = Math.max(f10, this.f1496a);
        this.f1497b = Math.max(f11, this.f1497b);
        this.f1498c = Math.min(f12, this.f1498c);
        this.f1499d = Math.min(f13, this.f1499d);
    }

    public final boolean b() {
        return (this.f1496a >= this.f1498c) | (this.f1497b >= this.f1499d);
    }

    public final void c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f1496a += fIntBitsToFloat;
        this.f1497b += fIntBitsToFloat2;
        this.f1498c += fIntBitsToFloat;
        this.f1499d += fIntBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + v.j0(this.f1496a) + ", " + v.j0(this.f1497b) + ", " + v.j0(this.f1498c) + ", " + v.j0(this.f1499d) + ')';
    }
}
