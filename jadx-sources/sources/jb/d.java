package jb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8806a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8807b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8808c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8809d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8810e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8811f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8812g;

    /* renamed from: h, reason: collision with root package name */
    public final float f8813h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8814i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final float f8815k;

    /* renamed from: l, reason: collision with root package name */
    public final float f8816l;

    /* renamed from: m, reason: collision with root package name */
    public final float f8817m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f8818n;

    /* renamed from: o, reason: collision with root package name */
    public final float f8819o;

    public d(boolean z2, float f10, float f11, float f12, float f13, float f14, boolean z10, float f15, boolean z11, boolean z12, float f16, float f17, float f18, boolean z13, float f19) {
        this.f8806a = z2;
        this.f8807b = f10;
        this.f8808c = f11;
        this.f8809d = f12;
        this.f8810e = f13;
        this.f8811f = f14;
        this.f8812g = z10;
        this.f8813h = f15;
        this.f8814i = z11;
        this.j = z12;
        this.f8815k = f16;
        this.f8816l = f17;
        this.f8817m = f18;
        this.f8818n = z13;
        this.f8819o = f19;
    }

    public static d a(d dVar, float f10, float f11, boolean z2, float f12, float f13, float f14, int i10) {
        boolean z10 = dVar.f8806a;
        float f15 = dVar.f8807b;
        float f16 = (i10 & 4) != 0 ? dVar.f8808c : f10;
        return new d(z10, f15, f16, dVar.f8809d, dVar.f8810e, dVar.f8811f, dVar.f8812g, (i10 & 128) != 0 ? dVar.f8813h : f11, dVar.f8814i, (i10 & 512) != 0 ? dVar.j : z2, (i10 & 1024) != 0 ? dVar.f8815k : f12, (i10 & 2048) != 0 ? dVar.f8816l : f13, (i10 & 4096) != 0 ? dVar.f8817m : f14, dVar.f8818n, dVar.f8819o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f8806a == dVar.f8806a && Float.compare(this.f8807b, dVar.f8807b) == 0 && Float.compare(this.f8808c, dVar.f8808c) == 0 && Float.compare(this.f8809d, dVar.f8809d) == 0 && Float.compare(this.f8810e, dVar.f8810e) == 0 && Float.compare(this.f8811f, dVar.f8811f) == 0 && this.f8812g == dVar.f8812g && Float.compare(this.f8813h, dVar.f8813h) == 0 && this.f8814i == dVar.f8814i && this.j == dVar.j && Float.compare(this.f8815k, dVar.f8815k) == 0 && Float.compare(this.f8816l, dVar.f8816l) == 0 && Float.compare(this.f8817m, dVar.f8817m) == 0 && this.f8818n == dVar.f8818n && Float.compare(this.f8819o, dVar.f8819o) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8819o) + gk.b.i(gk.b.f(this.f8817m, gk.b.f(this.f8816l, gk.b.f(this.f8815k, gk.b.i(gk.b.i(gk.b.f(this.f8813h, gk.b.i(gk.b.f(this.f8811f, gk.b.f(this.f8810e, gk.b.f(this.f8809d, gk.b.f(this.f8808c, gk.b.f(this.f8807b, Boolean.hashCode(this.f8806a) * 31, 31), 31), 31), 31), 31), 31, this.f8812g), 31), 31, this.f8814i), 31, this.j), 31), 31), 31), 31, this.f8818n);
    }

    public final String toString() {
        return "DockSettings(useLiquidGlass=" + this.f8806a + ", cornerRadius=" + this.f8807b + ", blurRadius=" + this.f8808c + ", refractionHeight=" + this.f8809d + ", refractionAmount=" + this.f8810e + ", chromaticAberration=" + this.f8811f + ", noGlassEffect=" + this.f8812g + ", hazeBlurRadius=" + this.f8813h + ", velocitySquishEnabled=" + this.f8814i + ", noGlassThumb=" + this.j + ", horizontalPadding=" + this.f8815k + ", verticalPadding=" + this.f8816l + ", iconGap=" + this.f8817m + ", showBackground=" + this.f8818n + ", fillOpacity=" + this.f8819o + ")";
    }

    public /* synthetic */ d(boolean z2, float f10, float f11, float f12, float f13, float f14, boolean z10, float f15, boolean z11, boolean z12, float f16, float f17, float f18, boolean z13, float f19, int i10) {
        this((i10 & 1) != 0 ? false : z2, (i10 & 2) != 0 ? 27.0f : f10, (i10 & 4) != 0 ? 6.0f : f11, (i10 & 8) != 0 ? 0.55f : f12, (i10 & 16) != 0 ? 0.4f : f13, (i10 & 32) != 0 ? 0.5f : f14, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? 18.0f : f15, (i10 & 256) != 0 ? true : z11, (i10 & 512) == 0 ? z12 : false, (i10 & 1024) != 0 ? 17.0f : f16, (i10 & 2048) != 0 ? 13.0f : f17, (i10 & 4096) != 0 ? 31.0f : f18, (i10 & 8192) == 0 ? z13 : true, (i10 & 16384) != 0 ? 0.2f : f19);
    }
}
