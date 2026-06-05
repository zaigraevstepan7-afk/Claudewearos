package c2;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static t0 f2985a;

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f2986b = new q0();

    /* renamed from: c, reason: collision with root package name */
    public static Method f2987c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f2988d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2989e;

    public static final BlendMode A(int i10) {
        return i10 == 0 ? BlendMode.CLEAR : i10 == 1 ? BlendMode.SRC : i10 == 2 ? BlendMode.DST : i10 == 3 ? BlendMode.SRC_OVER : i10 == 4 ? BlendMode.DST_OVER : i10 == 5 ? BlendMode.SRC_IN : i10 == 6 ? BlendMode.DST_IN : i10 == 7 ? BlendMode.SRC_OUT : i10 == 8 ? BlendMode.DST_OUT : i10 == 9 ? BlendMode.SRC_ATOP : i10 == 10 ? BlendMode.DST_ATOP : i10 == 11 ? BlendMode.XOR : i10 == 12 ? BlendMode.PLUS : i10 == 13 ? BlendMode.MODULATE : i10 == 14 ? BlendMode.SCREEN : i10 == 15 ? BlendMode.OVERLAY : i10 == 16 ? BlendMode.DARKEN : i10 == 17 ? BlendMode.LIGHTEN : i10 == 18 ? BlendMode.COLOR_DODGE : i10 == 19 ? BlendMode.COLOR_BURN : i10 == 20 ? BlendMode.HARD_LIGHT : i10 == 21 ? BlendMode.SOFT_LIGHT : i10 == 22 ? BlendMode.DIFFERENCE : i10 == 23 ? BlendMode.EXCLUSION : i10 == 24 ? BlendMode.MULTIPLY : i10 == 25 ? BlendMode.HUE : i10 == 26 ? BlendMode.SATURATION : i10 == 27 ? BlendMode.COLOR : i10 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Rect B(s3.k kVar) {
        return new Rect(kVar.f14747a, kVar.f14748b, kVar.f14749c, kVar.f14750d);
    }

    public static final RectF C(b2.c cVar) {
        return new RectF(cVar.f1502a, cVar.f1503b, cVar.f1504c, cVar.f1505d);
    }

    public static final Shader.TileMode D(int i10) {
        return i10 == 0 ? Shader.TileMode.CLAMP : i10 == 1 ? Shader.TileMode.REPEAT : i10 == 2 ? Shader.TileMode.MIRROR : i10 == 3 ? Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int E(long j) {
        float[] fArr = d2.d.f4630a;
        return (int) (w.b(j, d2.d.f4634e) >>> 32);
    }

    public static final Bitmap.Config F(int i10) {
        return i10 == 0 ? Bitmap.Config.ARGB_8888 : i10 == 1 ? Bitmap.Config.ALPHA_8 : i10 == 2 ? Bitmap.Config.RGB_565 : i10 == 3 ? Bitmap.Config.RGBA_F16 : i10 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final b2.c G(RectF rectF) {
        return new b2.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode H(int i10) {
        return i10 == 0 ? PorterDuff.Mode.CLEAR : i10 == 1 ? PorterDuff.Mode.SRC : i10 == 2 ? PorterDuff.Mode.DST : i10 == 3 ? PorterDuff.Mode.SRC_OVER : i10 == 4 ? PorterDuff.Mode.DST_OVER : i10 == 5 ? PorterDuff.Mode.SRC_IN : i10 == 6 ? PorterDuff.Mode.DST_IN : i10 == 7 ? PorterDuff.Mode.SRC_OUT : i10 == 8 ? PorterDuff.Mode.DST_OUT : i10 == 9 ? PorterDuff.Mode.SRC_ATOP : i10 == 10 ? PorterDuff.Mode.DST_ATOP : i10 == 11 ? PorterDuff.Mode.XOR : i10 == 12 ? PorterDuff.Mode.ADD : i10 == 14 ? PorterDuff.Mode.SCREEN : i10 == 15 ? PorterDuff.Mode.OVERLAY : i10 == 16 ? PorterDuff.Mode.DARKEN : i10 == 17 ? PorterDuff.Mode.LIGHTEN : i10 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String I(int i10) {
        return i10 == 0 ? "Clear" : i10 == 1 ? "Src" : i10 == 2 ? "Dst" : i10 == 3 ? "SrcOver" : i10 == 4 ? "DstOver" : i10 == 5 ? "SrcIn" : i10 == 6 ? "DstIn" : i10 == 7 ? "SrcOut" : i10 == 8 ? "DstOut" : i10 == 9 ? "SrcAtop" : i10 == 10 ? "DstAtop" : i10 == 11 ? "Xor" : i10 == 12 ? "Plus" : i10 == 13 ? "Modulate" : i10 == 14 ? "Screen" : i10 == 15 ? "Overlay" : i10 == 16 ? "Darken" : i10 == 17 ? "Lighten" : i10 == 18 ? "ColorDodge" : i10 == 19 ? "ColorBurn" : i10 == 20 ? "HardLight" : i10 == 21 ? "Softlight" : i10 == 22 ? "Difference" : i10 == 23 ? "Exclusion" : i10 == 24 ? "Multiply" : i10 == 25 ? "Hue" : i10 == 26 ? "Saturation" : i10 == 27 ? "Color" : i10 == 28 ? "Luminosity" : "Unknown";
    }

    public static String J(int i10) {
        return i10 == 0 ? "Clamp" : i10 == 1 ? "Repeated" : i10 == 2 ? "Mirror" : i10 == 3 ? "Decal" : "Unknown";
    }

    public static final void K(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final int L(float f10, float[] fArr, int i10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > 1.05E-6f) {
            f11 = Float.NaN;
        }
        fArr[i10] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }

    public static final b a(g gVar) {
        Canvas canvas = c.f2968a;
        b bVar = new b();
        bVar.f2965a = new Canvas(j(gVar));
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(float r21, float r22, float r23, float r24, d2.c r25) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.e0.b(float, float, float, float, d2.c):long");
    }

    public static final long c(int i10) {
        long j = i10 << 32;
        int i11 = w.f3059i;
        return j;
    }

    public static final long d(long j) {
        long j4 = j << 32;
        int i10 = w.f3059i;
        return j4;
    }

    public static long e(int i10, int i11, int i12) {
        return c(((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c2.g f(int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.e0.f(int, int, int):c2.g");
    }

    public static final h g() {
        return new h(new Paint(7));
    }

    public static final long h(float f10, float f11) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = a1.f2963c;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long i(float r17, float r18, float r19, float r20, d2.c r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.e0.i(float, float, float, float, d2.c):long");
    }

    public static final Bitmap j(g gVar) {
        if (gVar instanceof g) {
            return gVar.f2996a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long k(long j, long j4) {
        float f10;
        float f11;
        long jB = w.b(j, w.g(j4));
        float fE = w.e(j4);
        float fE2 = w.e(jB);
        float f12 = 1.0f - fE2;
        float f13 = (fE * f12) + fE2;
        float fI = w.i(jB);
        float fI2 = w.i(j4);
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fI2 * fE) * f12) + (fI * fE2)) / f13;
        }
        float fH = w.h(jB);
        float fH2 = w.h(j4);
        if (f13 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((fH2 * fE) * f12) + (fH * fE2)) / f13;
        }
        float f15 = w.f(jB);
        float f16 = w.f(j4);
        if (f13 != 0.0f) {
            f14 = (((f16 * fE) * f12) + (f15 * fE2)) / f13;
        }
        return i(f10, f11, f14, f13, w.g(j4));
    }

    public static final void l(u uVar, e0 e0Var, h hVar) {
        if (e0Var instanceof m0) {
            b2.c cVar = ((m0) e0Var).f3018f;
            uVar.getClass();
            uVar.k(cVar.f1502a, cVar.f1503b, cVar.f1504c, cVar.f1505d, hVar);
        } else {
            if (!(e0Var instanceof n0)) {
                if (!(e0Var instanceof l0)) {
                    throw new b3.e();
                }
                uVar.a(((l0) e0Var).f3016f, hVar);
                return;
            }
            n0 n0Var = (n0) e0Var;
            b2.d dVar = n0Var.f3022f;
            long j = dVar.f1513h;
            j jVar = n0Var.f3023g;
            if (jVar != null) {
                uVar.a(jVar, hVar);
            } else {
                uVar.l(dVar.f1506a, dVar.f1507b, dVar.f1508c, dVar.f1509d, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), hVar);
            }
        }
    }

    public static void m(e2.d dVar, e0 e0Var, long j) {
        boolean z2 = e0Var instanceof m0;
        e2.g gVar = e2.g.f5743a;
        if (z2) {
            b2.c cVar = ((m0) e0Var).f3018f;
            float f10 = cVar.f1502a;
            float f11 = cVar.f1503b;
            dVar.e0(j, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), z(cVar), 1.0f, gVar, 3);
            return;
        }
        if (!(e0Var instanceof n0)) {
            if (!(e0Var instanceof l0)) {
                throw new b3.e();
            }
            dVar.S0(((l0) e0Var).f3016f, j, gVar);
            return;
        }
        n0 n0Var = (n0) e0Var;
        j jVar = n0Var.f3023g;
        if (jVar != null) {
            dVar.S0(jVar, j, gVar);
            return;
        }
        b2.d dVar2 = n0Var.f3022f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.f1513h >> 32));
        float f12 = dVar2.f1506a;
        float f13 = dVar2.f1507b;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
        float fB = dVar2.b();
        float fA = dVar2.a();
        dVar.f0(j, jFloatToRawIntBits, (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), gVar);
    }

    public static void n(Canvas canvas, boolean z2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            if (z2) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f2989e) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f2987c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f2988d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f2987c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f2988d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f2987c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f2988d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f2989e = true;
        }
        if (z2) {
            try {
                Method method4 = f2987c;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z2 || (method = f2988d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final Paint p(h hVar) {
        if (!(hVar instanceof h)) {
            i0.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + fj.w.a(hVar.getClass()).b());
        }
        return hVar.f2999a;
    }

    public static final v1.o q(v1.o oVar, ej.c cVar) {
        return oVar.c(new o(cVar));
    }

    public static v1.o r(v1.o oVar, float f10, float f11, float f12, float f13, w0 w0Var, int i10) {
        float f14 = (i10 & 1) != 0 ? 1.0f : f10;
        float f15 = (i10 & 2) != 0 ? 1.0f : f11;
        float f16 = (i10 & 4) != 0 ? 1.0f : f12;
        float f17 = (i10 & 32) != 0 ? 0.0f : f13;
        long j = a1.f2962b;
        w0 w0Var2 = (i10 & 2048) != 0 ? f2986b : w0Var;
        long j4 = g0.f2997a;
        return oVar.c(new d0(f14, f15, f16, f17, j, w0Var2, false, j4, j4, 0, null));
    }

    public static v1.o s(v1.o oVar, float f10, float f11, float f12, w0 w0Var, n nVar, int i10) {
        float f13 = (i10 & 1) != 0 ? 1.0f : f10;
        float f14 = (i10 & 2) != 0 ? 1.0f : f11;
        float f15 = (i10 & 4) != 0 ? 1.0f : f12;
        long j = a1.f2962b;
        w0 w0Var2 = (i10 & 2048) != 0 ? f2986b : w0Var;
        boolean z2 = (i10 & 4096) == 0;
        long j4 = g0.f2997a;
        return oVar.c(new d0(f13, f14, f15, 0.0f, j, w0Var2, z2, j4, j4, (65536 & i10) != 0 ? 0 : 1, (i10 & 262144) != 0 ? null : nVar));
    }

    public static final boolean t(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final v0 u(v0 v0Var, v0 v0Var2, float f10) {
        long jV = v(v0Var.f3049a, v0Var2.f3049a, f10);
        long j = v0Var.f3050b;
        long j4 = v0Var2.f3050b;
        float fL = u3.c.l(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j4 >> 32)), f10);
        float fL2 = u3.c.l(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j4 & 4294967295L)), f10);
        return new v0(jV, (Float.floatToRawIntBits(fL) << 32) | (Float.floatToRawIntBits(fL2) & 4294967295L), u3.c.l(v0Var.f3051c, v0Var2.f3051c, f10));
    }

    public static final long v(long j, long j4, float f10) {
        d2.l lVar = d2.d.f4652x;
        long jB = w.b(j, lVar);
        long jB2 = w.b(j4, lVar);
        float fE = w.e(jB);
        float fI = w.i(jB);
        float fH = w.h(jB);
        float f11 = w.f(jB);
        float fE2 = w.e(jB2);
        float fI2 = w.i(jB2);
        float fH2 = w.h(jB2);
        float f12 = w.f(jB2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return w.b(i(u3.c.l(fI, fI2, f10), u3.c.l(fH, fH2, f10), u3.c.l(f11, f12, f10), u3.c.l(fE, fE2, f10), lVar), w.g(j4));
    }

    public static final float w(long j) {
        d2.c cVarG = w.g(j);
        if (!d2.b.a(cVarG.f4628b, d2.b.f4622a)) {
            i0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) d2.b.b(cVarG.f4628b)));
        }
        d2.m mVar = ((d2.q) cVarG).f4692p;
        double dB = mVar.b(w.i(j));
        float fB = (float) ((mVar.b(w.f(j)) * 0.0722d) + (mVar.b(w.h(j)) * 0.7152d) + (dB * 0.2126d));
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        if (fB > 1.0f) {
            return 1.0f;
        }
        return fB;
    }

    public static final void x(Matrix matrix, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f20;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f21;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
    }

    public static final void y(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public static final long z(b2.c cVar) {
        float f10 = cVar.f1504c - cVar.f1502a;
        float f11 = cVar.f1505d - cVar.f1503b;
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public abstract b2.c o();
}
