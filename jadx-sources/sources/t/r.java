package t;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final float f15251a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15252b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15253c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15254d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15255e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15256f;

    /* renamed from: g, reason: collision with root package name */
    public final float f15257g;

    /* renamed from: h, reason: collision with root package name */
    public float f15258h;

    /* renamed from: i, reason: collision with root package name */
    public float f15259i;
    public final float[] j;

    /* renamed from: k, reason: collision with root package name */
    public final float f15260k;

    /* renamed from: l, reason: collision with root package name */
    public final float f15261l;

    /* renamed from: m, reason: collision with root package name */
    public final float f15262m;

    /* renamed from: n, reason: collision with root package name */
    public final float f15263n;

    /* renamed from: o, reason: collision with root package name */
    public final float f15264o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f15265p;

    /* renamed from: q, reason: collision with root package name */
    public final float f15266q;

    /* renamed from: r, reason: collision with root package name */
    public final float f15267r;

    public r(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z2;
        int i11;
        float f16;
        float f17;
        this.f15251a = f10;
        this.f15252b = f11;
        this.f15253c = f12;
        this.f15254d = f13;
        this.f15255e = f14;
        this.f15256f = f15;
        float f18 = f14 - f12;
        float f19 = f15 - f13;
        float f20 = 0.0f;
        int i12 = 1;
        boolean z10 = i10 == 1 || (i10 == 4 ? f19 > 0.0f : !(i10 != 5 || f19 >= 0.0f));
        float f21 = z10 ? -1.0f : 1.0f;
        this.f15262m = f21;
        float f22 = 1 / (f11 - f10);
        this.f15260k = f22;
        float[] fArr = new float[101];
        this.j = fArr;
        boolean z11 = i10 == 3;
        if (z11 || Math.abs(f18) < 0.001f || Math.abs(f19) < 0.001f) {
            float fHypot = (float) Math.hypot(f19, f18);
            this.f15257g = fHypot;
            this.f15261l = fHypot * f22;
            this.f15266q = f18 * f22;
            this.f15267r = f19 * f22;
            this.f15263n = Float.NaN;
            this.f15264o = Float.NaN;
            z2 = true;
        } else {
            this.f15263n = f18 * f21;
            this.f15264o = f19 * (-f21);
            this.f15266q = z10 ? f14 : f12;
            this.f15267r = z10 ? f13 : f15;
            float f23 = f14 - f12;
            float f24 = f13 - f15;
            float[] fArr2 = d.f15136i;
            int i13 = 90;
            float f25 = 90;
            float f26 = f24;
            float fHypot2 = 0.0f;
            float f27 = 0.0f;
            int i14 = 1;
            while (true) {
                i11 = i12;
                f16 = f20;
                double d10 = (float) (((i14 * 90.0d) / i13) * 0.017453292519943295d);
                float fSin = ((float) Math.sin(d10)) * f23;
                float fCos = ((float) Math.cos(d10)) * f24;
                float f28 = fSin - f27;
                f17 = f25;
                fHypot2 += (float) Math.hypot(f28, fCos - f26);
                fArr2[i14] = fHypot2;
                i13 = 90;
                if (i14 == 90) {
                    break;
                }
                i14++;
                f26 = fCos;
                f25 = f17;
                f20 = f16;
                f27 = fSin;
                i12 = i11;
            }
            this.f15257g = fHypot2;
            int i15 = i11;
            while (true) {
                fArr2[i15] = fArr2[i15] / fHypot2;
                if (i15 == 90) {
                    break;
                } else {
                    i15++;
                }
            }
            int length = fArr.length;
            for (int i16 = 0; i16 < length; i16++) {
                float f29 = i16 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f29);
                if (iBinarySearch >= 0) {
                    fArr[i16] = iBinarySearch / f17;
                } else if (iBinarySearch == -1) {
                    fArr[i16] = f16;
                } else {
                    int i17 = -iBinarySearch;
                    int i18 = i17 - 2;
                    float f30 = i18;
                    float f31 = fArr2[i18];
                    fArr[i16] = (((f29 - f31) / (fArr2[i17 - 1] - f31)) + f30) / f17;
                }
            }
            this.f15261l = this.f15257g * this.f15260k;
            z2 = z11;
        }
        this.f15265p = z2;
    }

    public final float a() {
        float f10 = this.f15263n * this.f15259i;
        return f10 * this.f15262m * (this.f15261l / ((float) Math.hypot(f10, (-this.f15264o) * this.f15258h)));
    }

    public final float b() {
        float f10 = this.f15263n * this.f15259i;
        float f11 = (-this.f15264o) * this.f15258h;
        return f11 * this.f15262m * (this.f15261l / ((float) Math.hypot(f10, f11)));
    }

    public final void c(float f10) {
        float f11 = (this.f15262m == -1.0f ? this.f15252b - f10 : f10 - this.f15251a) * this.f15260k;
        float fE = 0.0f;
        if (f11 > 0.0f) {
            fE = 1.0f;
            if (f11 < 1.0f) {
                float f12 = f11 * 100;
                int i10 = (int) f12;
                float[] fArr = this.j;
                float f13 = fArr[i10];
                fE = gk.b.e(fArr[i10 + 1], f13, f12 - i10, f13);
            }
        }
        double d10 = fE * 1.5707964f;
        this.f15258h = (float) Math.sin(d10);
        this.f15259i = (float) Math.cos(d10);
    }
}
