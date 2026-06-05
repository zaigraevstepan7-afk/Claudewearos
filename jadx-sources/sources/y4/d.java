package y4;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import m.t0;
import t7.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {
    public static final int K = ViewConfiguration.getTapTimeout();
    public final int A;
    public final float[] B;
    public final float[] C;
    public final float[] D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final t0 J;

    /* renamed from: a, reason: collision with root package name */
    public final a f20212a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f20213b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f20214c;

    /* renamed from: d, reason: collision with root package name */
    public s f20215d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f20216e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f20217f;

    /* renamed from: z, reason: collision with root package name */
    public final int f20218z;

    public d(t0 t0Var) {
        a aVar = new a();
        aVar.f20207e = Long.MIN_VALUE;
        aVar.f20209g = -1L;
        aVar.f20208f = 0L;
        this.f20212a = aVar;
        this.f20213b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f20216e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f20217f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.B = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.C = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.D = fArr5;
        this.f20214c = t0Var;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f20218z = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.A = K;
        aVar.f20203a = 500;
        aVar.f20204b = 500;
        this.J = t0Var;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f20216e
            r0 = r0[r7]
            float[] r1 = r3.f20217f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f20213b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.B
            r0 = r0[r7]
            float[] r1 = r3.C
            r1 = r1[r7]
            float[] r2 = r3.D
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.d.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i10 = this.f20218z;
            if (i10 == 0 || i10 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.H && i10 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i10 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.F) {
            this.H = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f20212a;
        int i11 = (int) (jCurrentAnimationTimeMillis - aVar.f20207e);
        int i12 = aVar.f20204b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f20211i = i10;
        aVar.f20210h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f20209g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        t0 t0Var;
        int count;
        a aVar = this.f20212a;
        float f10 = aVar.f20206d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f20205c);
        if (iAbs != 0 && (count = (t0Var = this.J).getCount()) != 0) {
            int childCount = t0Var.getChildCount();
            int firstVisiblePosition = t0Var.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && t0Var.getChildAt(0).getTop() >= 0)) : !(i10 >= count && t0Var.getChildAt(childCount - 1).getBottom() <= t0Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.I
            r1 = 0
            if (r0 != 0) goto L7
            goto L7d
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7d
        L17:
            r7.d()
            return r1
        L1b:
            r7.G = r2
            r7.E = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            m.t0 r4 = r7.f20214c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            y4.a r9 = r7.f20212a
            r9.f20205c = r0
            r9.f20206d = r8
            boolean r8 = r7.H
            if (r8 != 0) goto L7d
            boolean r8 = r7.e()
            if (r8 == 0) goto L7d
            t7.s r8 = r7.f20215d
            if (r8 != 0) goto L61
            t7.s r8 = new t7.s
            r9 = 7
            r8.<init>(r7, r9)
            r7.f20215d = r8
        L61:
            r7.H = r2
            r7.F = r2
            boolean r8 = r7.E
            if (r8 != 0) goto L76
            int r8 = r7.A
            if (r8 <= 0) goto L76
            t7.s r9 = r7.f20215d
            long r5 = (long) r8
            java.lang.reflect.Field r8 = t4.l0.f15744a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L76:
            t7.s r8 = r7.f20215d
            r8.run()
        L7b:
            r7.E = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
