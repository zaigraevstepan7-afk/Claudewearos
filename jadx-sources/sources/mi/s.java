package mi;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final s f11780d = new s(c2.w.f3058h, 3, null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f11781e = 3;

    /* renamed from: a, reason: collision with root package name */
    public final long f11782a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11783b;

    /* renamed from: c, reason: collision with root package name */
    public final c2.s f11784c;

    public s(long j, int i10, c2.s sVar) {
        this.f11782a = j;
        this.f11783b = i10;
        this.f11784c = sVar;
    }

    public final boolean a() {
        return (this.f11782a == 16 && this.f11784c == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return c2.w.d(this.f11782a, sVar.f11782a) && this.f11783b == sVar.f11783b && fj.l.b(this.f11784c, sVar.f11784c);
    }

    public final int hashCode() {
        int i10 = c2.w.f3059i;
        int iG = gk.b.g(this.f11783b, Long.hashCode(this.f11782a) * 31, 31);
        c2.s sVar = this.f11784c;
        return iG + (sVar == null ? 0 : sVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = m1.m("HazeTint(color=", c2.w.j(this.f11782a), ", blendMode=", c2.e0.I(this.f11783b), ", brush=");
        sbM.append(this.f11784c);
        sbM.append(")");
        return sbM.toString();
    }

    public s(long j) {
        this(j, f11781e, null);
    }
}
