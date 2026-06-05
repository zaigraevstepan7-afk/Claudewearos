package ue;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import ef.g;
import ef.i;
import ef.l;
import ef.m;
import ef.o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p7.k;
import ze.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f extends i implements Drawable.Callback, h {

    /* renamed from: h1, reason: collision with root package name */
    public static final int[] f17002h1 = {R.attr.state_enabled};

    /* renamed from: i1, reason: collision with root package name */
    public static final ShapeDrawable f17003i1 = new ShapeDrawable(new OvalShape());
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public float E0;
    public float F0;
    public final Context G0;
    public final Paint H0;
    public final Paint.FontMetrics I0;
    public final RectF J0;
    public final PointF K0;
    public final Path L0;
    public final ze.i M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public boolean T0;
    public int U0;
    public int V0;
    public ColorFilter W0;
    public PorterDuffColorFilter X0;
    public ColorStateList Y0;
    public ColorStateList Z;
    public PorterDuff.Mode Z0;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f17004a0;
    public int[] a1;

    /* renamed from: b0, reason: collision with root package name */
    public float f17005b0;

    /* renamed from: b1, reason: collision with root package name */
    public ColorStateList f17006b1;

    /* renamed from: c0, reason: collision with root package name */
    public float f17007c0;

    /* renamed from: c1, reason: collision with root package name */
    public WeakReference f17008c1;

    /* renamed from: d0, reason: collision with root package name */
    public ColorStateList f17009d0;

    /* renamed from: d1, reason: collision with root package name */
    public TextUtils.TruncateAt f17010d1;

    /* renamed from: e0, reason: collision with root package name */
    public float f17011e0;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f17012e1;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f17013f0;

    /* renamed from: f1, reason: collision with root package name */
    public int f17014f1;

    /* renamed from: g0, reason: collision with root package name */
    public CharSequence f17015g0;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f17016g1;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f17017h0;

    /* renamed from: i0, reason: collision with root package name */
    public Drawable f17018i0;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f17019j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f17020k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f17021l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f17022m0;

    /* renamed from: n0, reason: collision with root package name */
    public Drawable f17023n0;

    /* renamed from: o0, reason: collision with root package name */
    public RippleDrawable f17024o0;

    /* renamed from: p0, reason: collision with root package name */
    public ColorStateList f17025p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f17026q0;

    /* renamed from: r0, reason: collision with root package name */
    public SpannableStringBuilder f17027r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f17028s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f17029t0;

    /* renamed from: u0, reason: collision with root package name */
    public Drawable f17030u0;

    /* renamed from: v0, reason: collision with root package name */
    public ColorStateList f17031v0;
    public ne.b w0;
    public ne.b x0;
    public float y0;
    public float z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.anonlab.voidlauncher.R.attr.chipStyle, com.anonlab.voidlauncher.R.style.Widget_MaterialComponents_Chip_Action);
        this.f17007c0 = -1.0f;
        this.H0 = new Paint(1);
        this.I0 = new Paint.FontMetrics();
        this.J0 = new RectF();
        this.K0 = new PointF();
        this.L0 = new Path();
        this.V0 = 255;
        this.Z0 = PorterDuff.Mode.SRC_IN;
        this.f17008c1 = new WeakReference(null);
        k(context);
        this.G0 = context;
        ze.i iVar = new ze.i(this);
        this.M0 = iVar;
        this.f17015g0 = "";
        iVar.f20549a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f17002h1;
        setState(iArr);
        R(iArr);
        this.f17012e1 = true;
        f17003i1.setTint(-1);
    }

    public static void b0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean y(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean z(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A() {
        e eVar = (e) this.f17008c1.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.I);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.f.B(int[], int[]):boolean");
    }

    public final void C(boolean z2) {
        if (this.f17028s0 != z2) {
            this.f17028s0 = z2;
            float fV = v();
            if (!z2 && this.T0) {
                this.T0 = false;
            }
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void D(Drawable drawable) {
        if (this.f17030u0 != drawable) {
            float fV = v();
            this.f17030u0 = drawable;
            float fV2 = v();
            b0(this.f17030u0);
            t(this.f17030u0);
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f17031v0 != colorStateList) {
            this.f17031v0 = colorStateList;
            if (this.f17029t0 && (drawable = this.f17030u0) != null && this.f17028s0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z2) {
        if (this.f17029t0 != z2) {
            boolean zY = Y();
            this.f17029t0 = z2;
            boolean zY2 = Y();
            if (zY != zY2) {
                if (zY2) {
                    t(this.f17030u0);
                } else {
                    b0(this.f17030u0);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void G(float f10) {
        if (this.f17007c0 != f10) {
            this.f17007c0 = f10;
            l lVarF = this.f6000b.f5982a.f();
            lVarF.f6011e = new ef.a(f10);
            lVarF.f6012f = new ef.a(f10);
            lVarF.f6013g = new ef.a(f10);
            lVarF.f6014h = new ef.a(f10);
            setShapeAppearanceModel(lVarF.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f17018i0;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof m4.a;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fV = v();
            this.f17018i0 = drawable != null ? drawable.mutate() : null;
            float fV2 = v();
            b0(drawable2);
            if (Z()) {
                t(this.f17018i0);
            }
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void I(float f10) {
        if (this.f17020k0 != f10) {
            float fV = v();
            this.f17020k0 = f10;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        this.f17021l0 = true;
        if (this.f17019j0 != colorStateList) {
            this.f17019j0 = colorStateList;
            if (Z()) {
                this.f17018i0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z2) {
        if (this.f17017h0 != z2) {
            boolean Z = Z();
            this.f17017h0 = z2;
            boolean Z2 = Z();
            if (Z != Z2) {
                if (Z2) {
                    t(this.f17018i0);
                } else {
                    b0(this.f17018i0);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f17009d0 != colorStateList) {
            this.f17009d0 = colorStateList;
            if (this.f17016g1) {
                g gVar = this.f6000b;
                if (gVar.f5986e != colorStateList) {
                    gVar.f5986e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void M(float f10) {
        if (this.f17011e0 != f10) {
            this.f17011e0 = f10;
            this.H0.setStrokeWidth(f10);
            if (this.f17016g1) {
                this.f6000b.f5991k = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f17023n0;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof m4.a;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fW = w();
            this.f17023n0 = drawable != null ? drawable.mutate() : null;
            this.f17024o0 = new RippleDrawable(cf.a.a(this.f17013f0), this.f17023n0, f17003i1);
            float fW2 = w();
            b0(drawable2);
            if (a0()) {
                t(this.f17023n0);
            }
            invalidateSelf();
            if (fW != fW2) {
                A();
            }
        }
    }

    public final void O(float f10) {
        if (this.E0 != f10) {
            this.E0 = f10;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void P(float f10) {
        if (this.f17026q0 != f10) {
            this.f17026q0 = f10;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void Q(float f10) {
        if (this.D0 != f10) {
            this.D0 = f10;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final boolean R(int[] iArr) {
        if (Arrays.equals(this.a1, iArr)) {
            return false;
        }
        this.a1 = iArr;
        if (a0()) {
            return B(getState(), iArr);
        }
        return false;
    }

    public final void S(ColorStateList colorStateList) {
        if (this.f17025p0 != colorStateList) {
            this.f17025p0 = colorStateList;
            if (a0()) {
                this.f17023n0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z2) {
        if (this.f17022m0 != z2) {
            boolean zA0 = a0();
            this.f17022m0 = z2;
            boolean zA02 = a0();
            if (zA0 != zA02) {
                if (zA02) {
                    t(this.f17023n0);
                } else {
                    b0(this.f17023n0);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void U(float f10) {
        if (this.A0 != f10) {
            float fV = v();
            this.A0 = f10;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void V(float f10) {
        if (this.z0 != f10) {
            float fV = v();
            this.z0 = f10;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void W(ColorStateList colorStateList) {
        if (this.f17013f0 != colorStateList) {
            this.f17013f0 = colorStateList;
            this.f17006b1 = null;
            onStateChange(getState());
        }
    }

    public final void X(bf.d dVar) {
        ze.i iVar = this.M0;
        b bVar = iVar.f20550b;
        TextPaint textPaint = iVar.f20549a;
        if (iVar.f20554f != dVar) {
            iVar.f20554f = dVar;
            if (dVar != null) {
                Context context = this.G0;
                dVar.e(context, textPaint, bVar);
                h hVar = (h) iVar.f20553e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                iVar.f20552d = true;
            }
            h hVar2 = (h) iVar.f20553e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.A();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean Y() {
        return this.f17029t0 && this.f17030u0 != null && this.T0;
    }

    public final boolean Z() {
        return this.f17017h0 && this.f17018i0 != null;
    }

    public final boolean a0() {
        return this.f17022m0 && this.f17023n0 != null;
    }

    @Override // ef.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f10;
        int i11;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i10 = this.V0) == 0) {
            return;
        }
        if (i10 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z2 = this.f17016g1;
        Paint paint = this.H0;
        RectF rectF = this.J0;
        if (!z2) {
            paint.setColor(this.N0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, x(), x(), paint);
        }
        if (!this.f17016g1) {
            paint.setColor(this.O0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.W0;
            if (colorFilter == null) {
                colorFilter = this.X0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, x(), x(), paint);
        }
        if (this.f17016g1) {
            super.draw(canvas);
        }
        if (this.f17011e0 > 0.0f && !this.f17016g1) {
            paint.setColor(this.Q0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f17016g1) {
                ColorFilter colorFilter2 = this.W0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.X0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f11 = bounds.left;
            float f12 = this.f17011e0 / 2.0f;
            rectF.set(f11 + f12, bounds.top + f12, bounds.right - f12, bounds.bottom - f12);
            float f13 = this.f17007c0 - (this.f17011e0 / 2.0f);
            canvas2.drawRoundRect(rectF, f13, f13, paint);
        }
        paint.setColor(this.R0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f17016g1) {
            RectF rectF2 = new RectF(bounds);
            g gVar = this.f6000b;
            m mVar = gVar.f5982a;
            float[] fArr = this.U;
            float f14 = gVar.j;
            k kVar = this.K;
            o oVar = this.L;
            f10 = 2.0f;
            Path path = this.L0;
            oVar.a(mVar, fArr, f14, rectF2, kVar, path);
            e(canvas2, paint, path, this.f6000b.f5982a, this.U, g());
        } else {
            canvas2.drawRoundRect(rectF, x(), x(), paint);
            f10 = 2.0f;
        }
        if (Z()) {
            u(bounds, rectF);
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.f17018i0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f17018i0.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (Y()) {
            u(bounds, rectF);
            float f17 = rectF.left;
            float f18 = rectF.top;
            canvas2.translate(f17, f18);
            this.f17030u0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f17030u0.draw(canvas2);
            canvas2.translate(-f17, -f18);
        }
        if (this.f17012e1 && this.f17015g0 != null) {
            PointF pointF = this.K0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f17015g0;
            ze.i iVar = this.M0;
            if (charSequence != null) {
                float fV = v() + this.y0 + this.B0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fV;
                } else {
                    pointF.x = bounds.right - fV;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = iVar.f20549a;
                Paint.FontMetrics fontMetrics = this.I0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f10);
            }
            rectF.setEmpty();
            if (this.f17015g0 != null) {
                float fV2 = v() + this.y0 + this.B0;
                float fW = w() + this.F0 + this.C0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fV2;
                    rectF.right = bounds.right - fW;
                } else {
                    rectF.left = bounds.left + fW;
                    rectF.right = bounds.right - fV2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            bf.d dVar = iVar.f20554f;
            TextPaint textPaint2 = iVar.f20549a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f20554f.d(this.G0, textPaint2, iVar.f20550b);
            }
            textPaint2.setTextAlign(align);
            boolean z10 = Math.round(iVar.a(this.f17015g0.toString())) > Math.round(rectF.width());
            if (z10) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i11 = iSave;
            } else {
                i11 = 0;
            }
            CharSequence charSequenceEllipsize = this.f17015g0;
            if (z10 && this.f17010d1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f17010d1);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z10) {
                canvas2.restoreToCount(i11);
            }
        }
        if (a0()) {
            rectF.setEmpty();
            if (a0()) {
                float f19 = this.F0 + this.E0;
                if (getLayoutDirection() == 0) {
                    float f20 = bounds.right - f19;
                    rectF.right = f20;
                    rectF.left = f20 - this.f17026q0;
                } else {
                    float f21 = bounds.left + f19;
                    rectF.left = f21;
                    rectF.right = f21 + this.f17026q0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f22 = this.f17026q0;
                float f23 = fExactCenterY - (f22 / f10);
                rectF.top = f23;
                rectF.bottom = f23 + f22;
            }
            float f24 = rectF.left;
            float f25 = rectF.top;
            canvas2.translate(f24, f25);
            this.f17023n0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f17024o0.setBounds(this.f17023n0.getBounds());
            this.f17024o0.jumpToCurrentState();
            this.f17024o0.draw(canvas2);
            canvas2.translate(-f24, -f25);
        }
        if (this.V0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // ef.i, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.V0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.W0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f17005b0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(w() + this.M0.a(this.f17015g0.toString()) + v() + this.y0 + this.B0 + this.C0 + this.F0), this.f17014f1);
    }

    @Override // ef.i, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // ef.i, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f17016g1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f17005b0, this.f17007c0);
        } else {
            outline.setRoundRect(bounds, this.f17007c0);
            outline2 = outline;
        }
        outline2.setAlpha(this.V0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // ef.i, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (y(this.Z) || y(this.f17004a0) || y(this.f17009d0)) {
            return true;
        }
        bf.d dVar = this.M0.f20554f;
        if (dVar == null || (colorStateList = dVar.f1767k) == null || !colorStateList.isStateful()) {
            return (this.f17029t0 && this.f17030u0 != null && this.f17028s0) || z(this.f17018i0) || z(this.f17030u0) || y(this.Y0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (Z()) {
            zOnLayoutDirectionChanged |= this.f17018i0.setLayoutDirection(i10);
        }
        if (Y()) {
            zOnLayoutDirectionChanged |= this.f17030u0.setLayoutDirection(i10);
        }
        if (a0()) {
            zOnLayoutDirectionChanged |= this.f17023n0.setLayoutDirection(i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (Z()) {
            zOnLevelChange |= this.f17018i0.setLevel(i10);
        }
        if (Y()) {
            zOnLevelChange |= this.f17030u0.setLevel(i10);
        }
        if (a0()) {
            zOnLevelChange |= this.f17023n0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // ef.i, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f17016g1) {
            super.onStateChange(iArr);
        }
        return B(iArr, this.a1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // ef.i, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.V0 != i10) {
            this.V0 = i10;
            invalidateSelf();
        }
    }

    @Override // ef.i, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.W0 != colorFilter) {
            this.W0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // ef.i, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.Y0 != colorStateList) {
            this.Y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // ef.i, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.Z0 != mode) {
            this.Z0 = mode;
            ColorStateList colorStateList = this.Y0;
            this.X0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        boolean visible = super.setVisible(z2, z10);
        if (Z()) {
            visible |= this.f17018i0.setVisible(z2, z10);
        }
        if (Y()) {
            visible |= this.f17030u0.setVisible(z2, z10);
        }
        if (a0()) {
            visible |= this.f17023n0.setVisible(z2, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f17023n0) {
            if (drawable.isStateful()) {
                drawable.setState(this.a1);
            }
            drawable.setTintList(this.f17025p0);
            return;
        }
        Drawable drawable2 = this.f17018i0;
        if (drawable == drawable2 && this.f17021l0) {
            drawable2.setTintList(this.f17019j0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void u(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Z() || Y()) {
            float f10 = this.y0 + this.z0;
            Drawable drawable = this.T0 ? this.f17030u0 : this.f17018i0;
            float intrinsicWidth = this.f17020k0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.T0 ? this.f17030u0 : this.f17018i0;
            float fCeil = this.f17020k0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.G0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        if (!Z() && !Y()) {
            return 0.0f;
        }
        float f10 = this.z0;
        Drawable drawable = this.T0 ? this.f17030u0 : this.f17018i0;
        float intrinsicWidth = this.f17020k0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.A0;
    }

    public final float w() {
        if (a0()) {
            return this.D0 + this.f17026q0 + this.E0;
        }
        return 0.0f;
    }

    public final float x() {
        if (!this.f17016g1) {
            return this.f17007c0;
        }
        float[] fArr = this.U;
        return fArr != null ? fArr[3] : this.f6000b.f5982a.f6022e.a(g());
    }
}
