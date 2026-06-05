package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public float f15288a;

    /* renamed from: b, reason: collision with root package name */
    public double f15289b;

    /* renamed from: c, reason: collision with root package name */
    public float f15290c;

    public final long a(float f10, float f11, long j) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f12 = f10 - this.f15288a;
        double d10 = j / 1000.0d;
        float f13 = this.f15290c;
        double d11 = f13 * f13;
        double d12 = this.f15289b;
        double d13 = (-f13) * d12;
        if (f13 > 1.0f) {
            double dSqrt = Math.sqrt(d11 - 1) * d12;
            double d14 = d13 + dSqrt;
            double d15 = d13 - dSqrt;
            double d16 = f12;
            double d17 = ((d15 * d16) - f11) / (d15 - d14);
            double d18 = d16 - d17;
            double d19 = d15 * d10;
            double d20 = d10 * d14;
            dSin = (Math.exp(d20) * d17) + (Math.exp(d19) * d18);
            dExp = Math.exp(d19) * d18 * d15;
            dExp2 = Math.exp(d20) * d17 * d14;
        } else {
            if (f13 != 1.0f) {
                double d21 = 1;
                double dSqrt2 = Math.sqrt(d21 - d11) * d12;
                double d22 = f12;
                double d23 = (((-d13) * d22) + f11) * (d21 / dSqrt2);
                double d24 = dSqrt2 * d10;
                double d25 = d10 * d13;
                dSin = ((Math.sin(d24) * d23) + (Math.cos(d24) * d22)) * Math.exp(d25);
                dCos = (((Math.cos(d24) * dSqrt2 * d23) + (Math.sin(d24) * (-dSqrt2) * d22)) * Math.exp(d25)) + (d13 * dSin);
                float f14 = (float) dCos;
                return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + this.f15288a)) << 32);
            }
            double d26 = f12;
            double d27 = (d12 * d26) + f11;
            double d28 = (-d12) * d10;
            double d29 = (d10 * d27) + d26;
            dSin = Math.exp(d28) * d29;
            dExp = Math.exp(d28) * d29 * (-this.f15289b);
            dExp2 = Math.exp(d28) * d27;
        }
        dCos = dExp2 + dExp;
        float f142 = (float) dCos;
        return (Float.floatToRawIntBits(f142) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + this.f15288a)) << 32);
    }
}
