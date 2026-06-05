package ze;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f20499a;

    /* renamed from: a0, reason: collision with root package name */
    public float f20500a0;

    /* renamed from: b, reason: collision with root package name */
    public float f20501b;

    /* renamed from: b0, reason: collision with root package name */
    public float f20502b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f20503c;

    /* renamed from: c0, reason: collision with root package name */
    public float f20504c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f20505d;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f20506d0;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f20507e;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f20518k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f20519k0;

    /* renamed from: l, reason: collision with root package name */
    public int f20520l;

    /* renamed from: m, reason: collision with root package name */
    public float f20521m;

    /* renamed from: n, reason: collision with root package name */
    public float f20522n;

    /* renamed from: o, reason: collision with root package name */
    public float f20523o;

    /* renamed from: p, reason: collision with root package name */
    public float f20524p;

    /* renamed from: q, reason: collision with root package name */
    public float f20525q;

    /* renamed from: r, reason: collision with root package name */
    public float f20526r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f20527s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f20528t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f20529u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f20530v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f20531w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f20532x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f20533y;

    /* renamed from: z, reason: collision with root package name */
    public bf.a f20534z;

    /* renamed from: f, reason: collision with root package name */
    public int f20509f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f20511g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f20513h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f20515i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* renamed from: e0, reason: collision with root package name */
    public int f20508e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public int f20510f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public final float f20512g0 = 1.0f;

    /* renamed from: h0, reason: collision with root package name */
    public final int f20514h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public int f20516i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public int f20517j0 = -1;

    public b(TextInputLayout textInputLayout) {
        this.f20499a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f20505d = new Rect();
        this.f20503c = new Rect();
        this.f20507e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float h(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return ne.a.a(f10, f11, f12);
    }

    public final void b() {
        float f10 = this.f20501b;
        float f11 = this.f20503c.left;
        Rect rect = this.f20505d;
        float fH = h(f11, rect.left, f10, this.Q);
        RectF rectF = this.f20507e;
        rectF.left = fH;
        rectF.top = h(this.f20521m, this.f20522n, f10, this.Q);
        rectF.right = h(r1.right, rect.right, f10, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f10, this.Q);
        this.f20525q = h(this.f20523o, this.f20524p, f10, this.Q);
        this.f20526r = h(this.f20521m, this.f20522n, f10, this.Q);
        d(f10, false);
        TextInputLayout textInputLayout = this.f20499a;
        textInputLayout.postInvalidateOnAnimation();
        a6.a aVar = ne.a.f12302b;
        this.f20502b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f10, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f20504c0 = h(1.0f, 0.0f, f10, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f20518k;
        ColorStateList colorStateList2 = this.j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f10, g(colorStateList2), g(this.f20518k)));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f12 = this.W;
        float f13 = this.X;
        if (f12 != f13) {
            textPaint.setLetterSpacing(h(f13, f12, f10, aVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.H = ne.a.a(0.0f, this.S, f10);
        this.I = ne.a.a(0.0f, this.T, f10);
        this.J = ne.a.a(0.0f, this.U, f10);
        int iA = a(f10, 0, g(this.V));
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z2 = this.f20499a.getLayoutDirection() == 1;
        if (this.E) {
            return (z2 ? r4.f.f13720d : r4.f.f13719c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void d(float f10, boolean z2) {
        float f11;
        Typeface typeface;
        float f12;
        if (this.B == null) {
            return;
        }
        float fWidth = this.f20505d.width();
        float fWidth2 = this.f20503c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = o() ? this.f20515i : this.f20513h;
            f12 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.f20513h, this.f20515i, f10, this.R) / this.f20513h;
            if (!o()) {
                fWidth = fWidth2;
            }
            typeface = this.f20527s;
            fWidth2 = fWidth;
        } else {
            f11 = this.f20513h;
            float f13 = this.X;
            typeface = this.f20530v;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f20513h, this.f20515i, f10, this.R) / this.f20513h;
            }
            float f14 = this.f20515i / this.f20513h;
            float f15 = fWidth2 * f14;
            if (!z2 && f15 > fWidth && o()) {
                fWidth2 = Math.min(fWidth / f14, fWidth2);
            }
            f12 = f13;
        }
        int i10 = f10 < 0.5f ? this.f20508e0 : this.f20510f0;
        TextPaint textPaint = this.O;
        if (fWidth2 > 0.0f) {
            boolean z10 = this.G != f11;
            boolean z11 = this.Y != f12;
            boolean z12 = this.f20533y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z13 = z10 || z11 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z12 || (this.L != i10) || this.N;
            this.G = f11;
            this.Y = f12;
            this.f20533y = typeface;
            this.N = false;
            this.L = i10;
            textPaint.setLinearText(this.F != 1.0f);
            z = z13;
        }
        if (this.C == null || z) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f20533y);
            textPaint.setLetterSpacing(this.Y);
            boolean zC = c(this.B);
            this.D = zC;
            StaticLayout staticLayoutE = e(((this.f20508e0 > 1 || this.f20510f0 > 1) && !zC) ? i10 : 1, textPaint, this.B, fWidth2 * (o() ? 1.0f : this.F), this.D);
            this.Z = staticLayoutE;
            this.C = staticLayoutE.getText();
        }
    }

    public final StaticLayout e(int i10, TextPaint textPaint, CharSequence charSequence, float f10, boolean z2) {
        Layout.Alignment alignment;
        if (i10 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f20509f, this.D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        g gVar = new g(charSequence, textPaint, (int) f10);
        gVar.f20547l = this.A;
        gVar.f20546k = z2;
        gVar.f20541e = alignment;
        gVar.j = false;
        gVar.f20542f = i10;
        float f11 = this.f20512g0;
        gVar.f20543g = 0.0f;
        gVar.f20544h = f11;
        gVar.f20545i = this.f20514h0;
        gVar.f20548m = null;
        StaticLayout staticLayoutA = gVar.a();
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final float f() {
        int i10 = this.f20516i0;
        if (i10 != -1) {
            return i10;
        }
        float f10 = this.f20515i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f10);
        textPaint.setTypeface(this.f20527s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f20529u;
            if (typeface != null) {
                this.f20528t = yd.f.M(configuration, typeface);
            }
            Typeface typeface2 = this.f20532x;
            if (typeface2 != null) {
                this.f20531w = yd.f.M(configuration, typeface2);
            }
            Typeface typeface3 = this.f20528t;
            if (typeface3 == null) {
                typeface3 = this.f20529u;
            }
            this.f20527s = typeface3;
            Typeface typeface4 = this.f20531w;
            if (typeface4 == null) {
                typeface4 = this.f20532x;
            }
            this.f20530v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z2) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f20499a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        d(1.0f, z2);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.f20506d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.f20506d0;
        if (charSequence2 != null) {
            this.f20500a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f20500a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f20511g, this.D ? 1 : 0);
        int i10 = absoluteGravity & 112;
        Rect rect = this.f20505d;
        if (i10 == 48) {
            this.f20522n = rect.top;
        } else if (i10 != 80) {
            this.f20522n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f20522n = textPaint.ascent() + rect.bottom;
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f20524p = rect.centerX() - (this.f20500a0 / 2.0f);
        } else if (i11 != 5) {
            this.f20524p = rect.left;
        } else {
            this.f20524p = rect.right - this.f20500a0;
        }
        if (this.f20500a0 <= rect.width()) {
            float f10 = this.f20524p;
            float fMax = Math.max(0.0f, rect.left - f10) + f10;
            this.f20524p = fMax;
            this.f20524p = Math.min(0.0f, rect.right - (this.f20500a0 + fMax)) + fMax;
        }
        float f11 = this.f20515i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f11);
        textPaint2.setTypeface(this.f20527s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f12 = this.f20522n;
            float fMax2 = Math.max(0.0f, rect.top - f12) + f12;
            this.f20522n = fMax2;
            this.f20522n = Math.min(0.0f, rect.bottom - (f() + fMax2)) + fMax2;
        }
        d(0.0f, z2);
        float height = this.Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.Z;
        if (staticLayout == null || this.f20508e0 <= 1) {
            CharSequence charSequence3 = this.C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.Z;
        this.f20520l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f20509f, this.D ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        Rect rect2 = this.f20503c;
        if (i12 == 48) {
            this.f20521m = rect2.top;
        } else if (i12 != 80) {
            this.f20521m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f20521m = (rect2.bottom - height) + (this.f20519k0 ? textPaint.descent() : 0.0f);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f20523o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i13 != 5) {
            this.f20523o = rect2.left;
        } else {
            this.f20523o = rect2.right - fMeasureText;
        }
        d(this.f20501b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f20518k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.f20518k = colorStateList;
        this.j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        bf.a aVar = this.f20534z;
        if (aVar != null) {
            aVar.f1751d = true;
        }
        if (this.f20529u == typeface) {
            return false;
        }
        this.f20529u = typeface;
        Typeface typefaceM = yd.f.M(this.f20499a.getContext().getResources().getConfiguration(), typeface);
        this.f20528t = typefaceM;
        if (typefaceM == null) {
            typefaceM = this.f20529u;
        }
        this.f20527s = typefaceM;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(float r3) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            float r0 = r2.f20501b
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L19
            r2.f20501b = r3
            r2.b()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.b.m(float):void");
    }

    public final void n(Typeface typeface) {
        boolean z2;
        boolean zL = l(typeface);
        if (this.f20532x != typeface) {
            this.f20532x = typeface;
            Typeface typefaceM = yd.f.M(this.f20499a.getContext().getResources().getConfiguration(), typeface);
            this.f20531w = typefaceM;
            if (typefaceM == null) {
                typefaceM = this.f20532x;
            }
            this.f20530v = typefaceM;
            z2 = true;
        } else {
            z2 = false;
        }
        if (zL || z2) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f20510f0 == 1;
    }
}
