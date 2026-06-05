package k4;

import android.graphics.Color;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f9409a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9410b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9411c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9412d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9413e;

    /* renamed from: f, reason: collision with root package name */
    public final float f9414f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f9409a = f10;
        this.f9410b = f11;
        this.f9411c = f12;
        this.f9412d = f13;
        this.f9413e = f14;
        this.f9414f = f15;
    }

    public static a a(int i10) {
        m mVar = m.f9443k;
        float fE = b.e(Color.red(i10));
        float fE2 = b.e(Color.green(i10));
        float fE3 = b.e(Color.blue(i10));
        float[][] fArr = b.f9418d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * fE3) + (fArr2[1] * fE2) + (fArr2[0] * fE);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * fE3) + (fArr3[1] * fE2) + (fArr3[0] * fE);
        float[] fArr4 = fArr[2];
        float f12 = (fE3 * fArr4[2]) + (fE2 * fArr4[1]) + (fE * fArr4[0]);
        float[][] fArr5 = b.f9415a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = mVar.f9450g;
        float f16 = mVar.f9452i;
        float f17 = mVar.f9447d;
        float f18 = mVar.f9444a;
        float f19 = fArr9[0] * f13;
        float f20 = fArr9[1] * f14;
        float f21 = fArr9[2] * f15;
        float f22 = mVar.f9451h;
        float fPow = (float) Math.pow((Math.abs(f19) * f22) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f20) * f22) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f21) * f22) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f19) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f20) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f21) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f23 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d10)) / 11.0f;
        float f24 = ((float) ((fSignum + fSignum2) - (d10 * 2.0d))) / 9.0f;
        float f25 = fSignum2 * 20.0f;
        float f26 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f25)) / 20.0f;
        float f27 = (((fSignum * 40.0f) + f25) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f24, f23)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f28 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f27 * mVar.f9445b) / f18, mVar.j * f17)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f29 = f18 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f9449f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f9448e) * mVar.f9446c) * ((float) Math.sqrt((f24 * f24) + (f23 * f23)))) / (f26 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        Math.sqrt((r0 * f17) / f29);
        float f30 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f16 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f28;
        return new a(fAtan2, fPow5, fPow4, f30, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    public static a b(float f10, float f11, float f12) {
        m mVar = m.f9443k;
        float f13 = mVar.f9447d;
        Math.sqrt(f10 / 100.0d);
        float f14 = mVar.f9444a + 4.0f;
        float f15 = mVar.f9452i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * mVar.f9447d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((f15 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f16, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(k4.m r20) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.a.c(k4.m):int");
    }
}
