package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s implements w {

    /* renamed from: a, reason: collision with root package name */
    public final float f15273a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15274b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15275c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15276d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15277e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15278f;

    public s(float f10, float f11, float f12, float f13) {
        int iL;
        this.f15273a = f10;
        this.f15274b = f11;
        this.f15275c = f12;
        this.f15276d = f13;
        if (!((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true)) {
            q0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        float[] fArr = new float[5];
        float f14 = (f11 - 0.0f) * 3.0f;
        float f15 = (f13 - f11) * 3.0f;
        float f16 = (1.0f - f13) * 3.0f;
        double d10 = f14;
        double d11 = f15;
        double d12 = f16;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            iL = d11 == d12 ? 0 : c2.e0.L((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int iL2 = c2.e0.L((float) ((-(d15 + d16)) / d14), fArr, 0);
            int iL3 = c2.e0.L((float) ((d15 - d16) / d14), fArr, iL2) + iL2;
            if (iL3 > 1) {
                float f17 = fArr[0];
                float f18 = fArr[1];
                if (f17 > f18) {
                    fArr[0] = f18;
                    fArr[1] = f17;
                } else if (f17 == f18) {
                    iL = iL3 - 1;
                }
                iL = iL3;
            } else {
                iL = iL3;
            }
        }
        float f19 = (f15 - f14) * 2.0f;
        int iL4 = c2.e0.L((-f19) / (((f16 - f15) * 2.0f) - f19), fArr, iL) + iL;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i10 = 0; i10 < iL4; i10++) {
            float f20 = fArr[i10];
            float f21 = (((((((((f11 - f13) * 3.0f) + 1.0f) - 0.0f) * f20) + (((f13 - (f11 * 2.0f)) + 0.0f) * 3.0f)) * f20) + f14) * f20) + 0.0f;
            fMin = Math.min(fMin, f21);
            fMax = Math.max(fMax, f21);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
        this.f15277e = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f15278f = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r3
      0x0092: PHI (r3v28 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v32 float), (r3v37 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[PHI: r12
      0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // t.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c(float r27) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.s.c(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f15273a == sVar.f15273a && this.f15274b == sVar.f15274b && this.f15275c == sVar.f15275c && this.f15276d == sVar.f15276d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15276d) + gk.b.f(this.f15275c, gk.b.f(this.f15274b, Float.hashCode(this.f15273a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.f15273a);
        sb2.append(", b=");
        sb2.append(this.f15274b);
        sb2.append(", c=");
        sb2.append(this.f15275c);
        sb2.append(", d=");
        return gk.b.o(sb2, this.f15276d, ')');
    }
}
