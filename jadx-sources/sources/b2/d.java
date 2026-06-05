package b2;

import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f1506a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1507b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1508c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1509d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1510e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1511f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1512g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1513h;

    static {
        wd.a.h(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f10, float f11, float f12, float f13, long j, long j4, long j10, long j11) {
        this.f1506a = f10;
        this.f1507b = f11;
        this.f1508c = f12;
        this.f1509d = f13;
        this.f1510e = j;
        this.f1511f = j4;
        this.f1512g = j10;
        this.f1513h = j11;
    }

    public final float a() {
        return this.f1509d - this.f1507b;
    }

    public final float b() {
        return this.f1508c - this.f1506a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f1506a, dVar.f1506a) == 0 && Float.compare(this.f1507b, dVar.f1507b) == 0 && Float.compare(this.f1508c, dVar.f1508c) == 0 && Float.compare(this.f1509d, dVar.f1509d) == 0 && mk.b.q(this.f1510e, dVar.f1510e) && mk.b.q(this.f1511f, dVar.f1511f) && mk.b.q(this.f1512g, dVar.f1512g) && mk.b.q(this.f1513h, dVar.f1513h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1513h) + gk.b.j(gk.b.j(gk.b.j(gk.b.f(this.f1509d, gk.b.f(this.f1508c, gk.b.f(this.f1507b, Float.hashCode(this.f1506a) * 31, 31), 31), 31), this.f1510e, 31), this.f1511f, 31), this.f1512g, 31);
    }

    public final String toString() {
        String str = v.j0(this.f1506a) + ", " + v.j0(this.f1507b) + ", " + v.j0(this.f1508c) + ", " + v.j0(this.f1509d);
        long j = this.f1510e;
        long j4 = this.f1511f;
        boolean zQ = mk.b.q(j, j4);
        long j10 = this.f1512g;
        long j11 = this.f1513h;
        if (!zQ || !mk.b.q(j4, j10) || !mk.b.q(j10, j11)) {
            StringBuilder sbK = m6.a.k("RoundRect(rect=", str, ", topLeft=");
            sbK.append((Object) mk.b.H(j));
            sbK.append(", topRight=");
            sbK.append((Object) mk.b.H(j4));
            sbK.append(", bottomRight=");
            sbK.append((Object) mk.b.H(j10));
            sbK.append(", bottomLeft=");
            sbK.append((Object) mk.b.H(j11));
            sbK.append(')');
            return sbK.toString();
        }
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            StringBuilder sbK2 = m6.a.k("RoundRect(rect=", str, ", radius=");
            sbK2.append(v.j0(Float.intBitsToFloat(i10)));
            sbK2.append(')');
            return sbK2.toString();
        }
        StringBuilder sbK3 = m6.a.k("RoundRect(rect=", str, ", x=");
        sbK3.append(v.j0(Float.intBitsToFloat(i10)));
        sbK3.append(", y=");
        sbK3.append(v.j0(Float.intBitsToFloat(i11)));
        sbK3.append(')');
        return sbK3.toString();
    }
}
