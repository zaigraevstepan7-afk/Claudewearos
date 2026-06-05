package li;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final c f10991f = new c(0.5286651f, 0.5555556f, 1.0732051f, 1.0732051f);

    /* renamed from: g, reason: collision with root package name */
    public static final c f10992g = new c(0.39649886f, 0.0f, 1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f10993a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10994b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10995c;

    /* renamed from: d, reason: collision with root package name */
    public final float f10996d;

    /* renamed from: e, reason: collision with root package name */
    public a f10997e;

    public c(float f10, float f11, float f12, float f13) {
        this.f10993a = f10;
        this.f10994b = f11;
        this.f10995c = f12;
        this.f10996d = f13;
    }

    public final a a() {
        a aVar = this.f10997e;
        if (aVar != null) {
            return aVar;
        }
        double d10 = (1.5707964f - (this.f10994b * 1.5707964f)) * 0.5f;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f10 = 1.0f / this.f10996d;
        double d11 = 2.0f;
        float fSqrt = 1.0f / ((float) Math.sqrt(d11));
        float fSqrt2 = (-1.0f) / ((float) Math.sqrt(d11));
        float f11 = 1.0f - f10;
        float f12 = (fSqrt * f11) + 0.0f + (fSin * f10);
        float f13 = (fSqrt2 * f11) + 1.0f + ((-fCos) * f10);
        d dVar = new d(f12, f13);
        float f14 = -this.f10993a;
        d dVar2 = new d(f14, 0.0f);
        float f15 = (1.0f * fSin) - (0.0f * fCos);
        float f16 = f12 - f14;
        float f17 = f13 - 0.0f;
        float f18 = (f16 * 0.0f) + ((-f17) * 1.0f);
        float f19 = ((-((f17 * fCos) - (f16 * fSin))) / f15) - ((((((this.f10995c * 1.5f) * f18) * f18) / f15) / f15) / f15);
        float f20 = (-f18) / f15;
        float f21 = 1.0f * f19;
        if (f21 < 0.0f) {
            f21 = 0.0f;
        }
        float f22 = f19 * 0.0f;
        if (f22 < 0.0f) {
            f22 = 0.0f;
        }
        d dVar3 = new d(f14 + f21, f22 + 0.0f);
        float f23 = fCos * f20;
        if (f23 < 0.0f) {
            f23 = 0.0f;
        }
        float f24 = f20 * fSin;
        a aVar2 = new a(dVar2, dVar3, new d(f12 - f23, f13 - (f24 >= 0.0f ? f24 : 0.0f)), dVar);
        this.f10997e = aVar2;
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f10993a, cVar.f10993a) == 0 && Float.compare(this.f10994b, cVar.f10994b) == 0 && Float.compare(this.f10995c, cVar.f10995c) == 0 && Float.compare(this.f10996d, cVar.f10996d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10996d) + gk.b.f(this.f10995c, gk.b.f(this.f10994b, Float.hashCode(this.f10993a) * 31, 31), 31);
    }

    public final String toString() {
        return "G2ContinuityProfile(extendedFraction=" + this.f10993a + ", arcFraction=" + this.f10994b + ", bezierCurvatureScale=" + this.f10995c + ", arcCurvatureScale=" + this.f10996d + ")";
    }
}
