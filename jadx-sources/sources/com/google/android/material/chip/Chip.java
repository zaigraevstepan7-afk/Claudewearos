package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import ef.m;
import ef.x;
import java.lang.ref.WeakReference;
import java.util.Locale;
import jf.a;
import m.o;
import t4.l0;
import u6.v;
import ue.b;
import ue.d;
import ue.e;
import ue.f;
import uk.c;
import ze.i;
import ze.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class Chip extends o implements e, x, Checkable {
    public static final Rect P = new Rect();
    public static final int[] Q = {R.attr.state_selected};
    public static final int[] R = {R.attr.state_checkable};
    public View.OnClickListener A;
    public CompoundButton.OnCheckedChangeListener B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public CharSequence J;
    public final d K;
    public boolean L;
    public final Rect M;
    public final RectF N;
    public final b O;

    /* renamed from: e, reason: collision with root package name */
    public f f3835e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f3836f;

    /* renamed from: z, reason: collision with root package name */
    public RippleDrawable f3837z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a.a(context, attributeSet, com.anonlab.voidlauncher.R.attr.chipStyle, com.anonlab.voidlauncher.R.style.Widget_MaterialComponents_Chip_Action), attributeSet);
        this.M = new Rect();
        this.N = new RectF();
        this.O = new b(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f fVar = new f(context2, attributeSet);
        Context context3 = fVar.G0;
        int[] iArr = me.a.f11644c;
        TypedArray typedArrayE = k.e(context3, attributeSet, iArr, com.anonlab.voidlauncher.R.attr.chipStyle, com.anonlab.voidlauncher.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.f17016g1 = typedArrayE.hasValue(37);
        Context context4 = fVar.G0;
        ColorStateList colorStateListZ = wd.a.z(context4, typedArrayE, 24);
        if (fVar.Z != colorStateListZ) {
            fVar.Z = colorStateListZ;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateListZ2 = wd.a.z(context4, typedArrayE, 11);
        if (fVar.f17004a0 != colorStateListZ2) {
            fVar.f17004a0 = colorStateListZ2;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = typedArrayE.getDimension(19, 0.0f);
        if (fVar.f17005b0 != dimension) {
            fVar.f17005b0 = dimension;
            fVar.invalidateSelf();
            fVar.A();
        }
        if (typedArrayE.hasValue(12)) {
            fVar.G(typedArrayE.getDimension(12, 0.0f));
        }
        fVar.L(wd.a.z(context4, typedArrayE, 22));
        fVar.M(typedArrayE.getDimension(23, 0.0f));
        fVar.W(wd.a.z(context4, typedArrayE, 36));
        String text = typedArrayE.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.f17015g0, text)) {
            fVar.f17015g0 = text;
            fVar.M0.f20552d = true;
            fVar.invalidateSelf();
            fVar.A();
        }
        bf.d dVar = (!typedArrayE.hasValue(0) || (resourceId3 = typedArrayE.getResourceId(0, 0)) == 0) ? null : new bf.d(context4, resourceId3);
        dVar.f1768l = typedArrayE.getDimension(1, dVar.f1768l);
        fVar.X(dVar);
        int i10 = typedArrayE.getInt(3, 0);
        if (i10 == 1) {
            fVar.f17010d1 = TextUtils.TruncateAt.START;
        } else if (i10 == 2) {
            fVar.f17010d1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i10 == 3) {
            fVar.f17010d1 = TextUtils.TruncateAt.END;
        }
        fVar.K(typedArrayE.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.K(typedArrayE.getBoolean(15, false));
        }
        fVar.H(wd.a.A(context4, typedArrayE, 14));
        if (typedArrayE.hasValue(17)) {
            fVar.J(wd.a.z(context4, typedArrayE, 17));
        }
        fVar.I(typedArrayE.getDimension(16, -1.0f));
        fVar.T(typedArrayE.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.T(typedArrayE.getBoolean(26, false));
        }
        fVar.N(wd.a.A(context4, typedArrayE, 25));
        fVar.S(wd.a.z(context4, typedArrayE, 30));
        fVar.P(typedArrayE.getDimension(28, 0.0f));
        fVar.C(typedArrayE.getBoolean(6, false));
        fVar.F(typedArrayE.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.F(typedArrayE.getBoolean(8, false));
        }
        fVar.D(wd.a.A(context4, typedArrayE, 7));
        if (typedArrayE.hasValue(9)) {
            fVar.E(wd.a.z(context4, typedArrayE, 9));
        }
        fVar.w0 = (!typedArrayE.hasValue(39) || (resourceId2 = typedArrayE.getResourceId(39, 0)) == 0) ? null : ne.b.a(context4, resourceId2);
        fVar.x0 = (!typedArrayE.hasValue(33) || (resourceId = typedArrayE.getResourceId(33, 0)) == 0) ? null : ne.b.a(context4, resourceId);
        float dimension2 = typedArrayE.getDimension(21, 0.0f);
        if (fVar.y0 != dimension2) {
            fVar.y0 = dimension2;
            fVar.invalidateSelf();
            fVar.A();
        }
        fVar.V(typedArrayE.getDimension(35, 0.0f));
        fVar.U(typedArrayE.getDimension(34, 0.0f));
        float dimension3 = typedArrayE.getDimension(41, 0.0f);
        if (fVar.B0 != dimension3) {
            fVar.B0 = dimension3;
            fVar.invalidateSelf();
            fVar.A();
        }
        float dimension4 = typedArrayE.getDimension(40, 0.0f);
        if (fVar.C0 != dimension4) {
            fVar.C0 = dimension4;
            fVar.invalidateSelf();
            fVar.A();
        }
        fVar.Q(typedArrayE.getDimension(29, 0.0f));
        fVar.O(typedArrayE.getDimension(27, 0.0f));
        float dimension5 = typedArrayE.getDimension(13, 0.0f);
        if (fVar.F0 != dimension5) {
            fVar.F0 = dimension5;
            fVar.invalidateSelf();
            fVar.A();
        }
        fVar.f17014f1 = typedArrayE.getDimensionPixelSize(4, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        typedArrayE.recycle();
        k.a(context2, attributeSet, com.anonlab.voidlauncher.R.attr.chipStyle, com.anonlab.voidlauncher.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, com.anonlab.voidlauncher.R.attr.chipStyle, com.anonlab.voidlauncher.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.anonlab.voidlauncher.R.attr.chipStyle, com.anonlab.voidlauncher.R.style.Widget_MaterialComponents_Chip_Action);
        this.G = typedArrayObtainStyledAttributes.getBoolean(32, false);
        TypedValue typedValueN = c.N(context2, com.anonlab.voidlauncher.R.attr.minTouchTargetSize);
        this.I = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (int) ((typedValueN == null || typedValueN.type != 5) ? context2.getResources().getDimension(com.anonlab.voidlauncher.R.dimen.mtrl_min_touch_target_size) : typedValueN.getDimension(context2.getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.m(getElevation());
        k.a(context2, attributeSet, com.anonlab.voidlauncher.R.attr.chipStyle, com.anonlab.voidlauncher.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, com.anonlab.voidlauncher.R.attr.chipStyle, com.anonlab.voidlauncher.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.anonlab.voidlauncher.R.attr.chipStyle, com.anonlab.voidlauncher.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.K = new d(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new ue.c(this));
        }
        setChecked(this.C);
        setText(fVar.f17015g0);
        setEllipsize(fVar.f17010d1);
        g();
        if (!this.f3835e.f17012e1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.G) {
            setMinHeight(this.I);
        }
        this.H = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ue.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f16997a.B;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.N;
        rectF.setEmpty();
        if (c() && this.A != null) {
            f fVar = this.f3835e;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.a0()) {
                float f10 = fVar.F0 + fVar.E0 + fVar.f17026q0 + fVar.D0 + fVar.C0;
                if (fVar.getLayoutDirection() == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.M;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private bf.d getTextAppearance() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.M0.f20554f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.E != z2) {
            this.E = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.D != z2) {
            this.D = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i10) {
        this.I = i10;
        if (!this.G) {
            InsetDrawable insetDrawable = this.f3836f;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f3836f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i10 - ((int) this.f3835e.f17005b0));
        int iMax2 = Math.max(0, i10 - this.f3835e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f3836f;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f3836f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f3836f != null) {
            Rect rect = new Rect();
            this.f3836f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                e();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f3836f = new InsetDrawable((Drawable) this.f3835e, i11, i12, i11, i12);
        e();
    }

    public final boolean c() {
        f fVar = this.f3835e;
        if (fVar == null) {
            return false;
        }
        Object obj = fVar.f17023n0;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof m4.a) {
            obj = null;
        }
        return obj != null;
    }

    public final void d() {
        f fVar;
        if (!c() || (fVar = this.f3835e) == null || !fVar.f17022m0 || this.A == null) {
            l0.l(this, null);
            this.L = false;
        } else {
            l0.l(this, this.K);
            this.L = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.L
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchHoverEvent(r9)
            return r9
        L9:
            ue.d r0 = r8.K
            android.view.accessibility.AccessibilityManager r1 = r0.A
            boolean r2 = r1.isEnabled()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L6b
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6b
        L1c:
            int r1 = r9.getAction()
            r2 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L42
            r2 = 9
            if (r1 == r2) goto L42
            r2 = 10
            if (r1 == r2) goto L30
            goto L6b
        L30:
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L6b
            if (r1 != r2) goto L39
            goto L71
        L39:
            r0.F = r2
            r0.r(r2, r6)
            r0.r(r1, r5)
            return r4
        L42:
            float r1 = r9.getX()
            float r9 = r9.getY()
            com.google.android.material.chip.Chip r2 = r0.J
            boolean r7 = r2.c()
            if (r7 == 0) goto L5d
            android.graphics.RectF r2 = r2.getCloseIconTouchBounds()
            boolean r9 = r2.contains(r1, r9)
            if (r9 == 0) goto L5d
            r3 = r4
        L5d:
            int r9 = r0.F
            if (r9 != r3) goto L62
            goto L71
        L62:
            r0.F = r3
            r0.r(r3, r6)
            r0.r(r9, r5)
            return r4
        L6b:
            boolean r9 = super.dispatchHoverEvent(r9)
            if (r9 == 0) goto L72
        L71:
            return r4
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.L
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            ue.d r0 = r9.K
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            if (r1 == r4) goto L9d
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L87
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9d
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9d
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r4
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r4
            goto L4a
        L56:
            r2 = r7
            goto L9d
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9d
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9d
            int r1 = r0.E
            if (r1 == r3) goto L85
            com.google.android.material.chip.Chip r5 = r0.J
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r4) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.A
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.L
            if (r1 == 0) goto L85
            ue.d r1 = r5.K
            r1.r(r4, r4)
        L85:
            r2 = r4
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r4)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m(r4, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.E
            if (r0 == r3) goto La4
            return r4
        La4:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // m.o, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f3835e;
        boolean zR = false;
        int i10 = 0;
        zR = false;
        if (fVar != null && f.z(fVar.f17023n0)) {
            f fVar2 = this.f3835e;
            ?? IsEnabled = isEnabled();
            int i11 = IsEnabled;
            if (this.F) {
                i11 = IsEnabled + 1;
            }
            int i12 = i11;
            if (this.E) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.D) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            }
            if (this.F) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.E) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.D) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            zR = fVar2.R(iArr);
        }
        if (zR) {
            invalidate();
        }
    }

    public final void e() {
        this.f3837z = new RippleDrawable(cf.a.a(this.f3835e.f17013f0), getBackgroundDrawable(), null);
        this.f3835e.getClass();
        setBackground(this.f3837z);
        f();
    }

    public final void f() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f3835e) == null) {
            return;
        }
        int iW = (int) (fVar.w() + fVar.F0 + fVar.C0);
        f fVar2 = this.f3835e;
        int iV = (int) (fVar2.v() + fVar2.y0 + fVar2.B0);
        if (this.f3836f != null) {
            Rect rect = new Rect();
            this.f3836f.getPadding(rect);
            iV += rect.left;
            iW += rect.right;
        }
        setPaddingRelative(iV, getPaddingTop(), iW, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.f3835e;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        bf.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.O);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.J)) {
            return this.J;
        }
        f fVar = this.f3835e;
        if (fVar == null || !fVar.f17028s0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3836f;
        return insetDrawable == null ? this.f3835e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17030u0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17031v0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17004a0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return Math.max(0.0f, fVar.x());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3835e;
    }

    public float getChipEndPadding() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.F0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f3835e;
        if (fVar == null || (drawable = fVar.f17018i0) == 0) {
            return null;
        }
        if (!(drawable instanceof m4.a)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17020k0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17019j0;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17005b0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.y0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17009d0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17011e0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f3835e;
        if (fVar == null || (drawable = fVar.f17023n0) == 0) {
            return null;
        }
        if (!(drawable instanceof m4.a)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17027r0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.E0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17026q0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.D0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17025p0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17010d1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.L) {
            d dVar = this.K;
            if (dVar.E == 1 || dVar.D == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public ne.b getHideMotionSpec() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.x0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.A0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.z0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.f17013f0;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        return this.f3835e.f6000b.f5982a;
    }

    public ne.b getShowMotionSpec() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.w0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.C0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f3835e;
        if (fVar != null) {
            return fVar.B0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cg.b.N(this, this.f3835e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, Q);
        }
        f fVar = this.f3835e;
        if (fVar != null && fVar.f17028s0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, R);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i10, Rect rect) {
        super.onFocusChanged(z2, i10, rect);
        if (this.L) {
            d dVar = this.K;
            int i11 = dVar.E;
            if (i11 != Integer.MIN_VALUE) {
                dVar.j(i11);
            }
            if (z2) {
                dVar.m(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.f3835e;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f17028s0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.H != i10) {
            this.H = i10;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.D
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.D
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.A
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.L
            if (r0 == 0) goto L43
            ue.d r0 = r5.K
            r0.r(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.J = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3837z) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // m.o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3837z) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // m.o, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.C(z2);
        }
    }

    public void setCheckableResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.C(fVar.G0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        f fVar = this.f3835e;
        if (fVar == null) {
            this.C = z2;
        } else if (fVar.f17028s0) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.D(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.D(v.G(fVar.G0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.E(i4.c.getColorStateList(fVar.G0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.F(fVar.G0.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f3835e;
        if (fVar == null || fVar.f17004a0 == colorStateList) {
            return;
        }
        fVar.f17004a0 = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateList;
        f fVar = this.f3835e;
        if (fVar == null || fVar.f17004a0 == (colorStateList = i4.c.getColorStateList(fVar.G0, i10))) {
            return;
        }
        fVar.f17004a0 = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.G(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.G(fVar.G0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f3835e;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f17008c1 = new WeakReference(null);
            }
            this.f3835e = fVar;
            fVar.f17012e1 = false;
            fVar.f17008c1 = new WeakReference(this);
            b(this.I);
        }
    }

    public void setChipEndPadding(float f10) {
        f fVar = this.f3835e;
        if (fVar == null || fVar.F0 == f10) {
            return;
        }
        fVar.F0 = f10;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipEndPaddingResource(int i10) throws Resources.NotFoundException {
        f fVar = this.f3835e;
        if (fVar != null) {
            float dimension = fVar.G0.getResources().getDimension(i10);
            if (fVar.F0 != dimension) {
                fVar.F0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.H(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.H(v.G(fVar.G0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.I(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.I(fVar.G0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.J(i4.c.getColorStateList(fVar.G0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.K(fVar.G0.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f10) {
        f fVar = this.f3835e;
        if (fVar == null || fVar.f17005b0 == f10) {
            return;
        }
        fVar.f17005b0 = f10;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipMinHeightResource(int i10) throws Resources.NotFoundException {
        f fVar = this.f3835e;
        if (fVar != null) {
            float dimension = fVar.G0.getResources().getDimension(i10);
            if (fVar.f17005b0 != dimension) {
                fVar.f17005b0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        f fVar = this.f3835e;
        if (fVar == null || fVar.y0 == f10) {
            return;
        }
        fVar.y0 = f10;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipStartPaddingResource(int i10) throws Resources.NotFoundException {
        f fVar = this.f3835e;
        if (fVar != null) {
            float dimension = fVar.G0.getResources().getDimension(i10);
            if (fVar.y0 != dimension) {
                fVar.y0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.L(i4.c.getColorStateList(fVar.G0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.M(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.M(fVar.G0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.N(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f3835e;
        if (fVar == null || fVar.f17027r0 == charSequence) {
            return;
        }
        String str = r4.b.f13707b;
        r4.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? r4.b.f13710e : r4.b.f13709d;
        bVar.getClass();
        g6.b bVar2 = r4.f.f13717a;
        fVar.f17027r0 = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.O(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.O(fVar.G0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.N(v.G(fVar.G0, i10));
        }
        d();
    }

    public void setCloseIconSize(float f10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.P(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.P(fVar.G0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.Q(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.Q(fVar.G0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.S(i4.c.getColorStateList(fVar.G0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // m.o, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // m.o, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.m(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3835e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.f17010d1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.G = z2;
        b(this.I);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(ne.b bVar) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.x0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.x0 = ne.b.a(fVar.G0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.U(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.U(fVar.G0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.V(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.V(fVar.G0.getResources().getDimension(i10));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f3835e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.f17014f1 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.B = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.A = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.W(colorStateList);
        }
        this.f3835e.getClass();
        e();
    }

    public void setRippleColorResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.W(i4.c.getColorStateList(fVar.G0, i10));
            this.f3835e.getClass();
            e();
        }
    }

    @Override // ef.x
    public void setShapeAppearanceModel(m mVar) {
        this.f3835e.setShapeAppearanceModel(mVar);
    }

    public void setShowMotionSpec(ne.b bVar) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.w0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.w0 = ne.b.a(fVar.G0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f3835e;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.f17012e1 ? null : charSequence, bufferType);
        f fVar2 = this.f3835e;
        if (fVar2 == null || TextUtils.equals(fVar2.f17015g0, charSequence)) {
            return;
        }
        fVar2.f17015g0 = charSequence;
        fVar2.M0.f20552d = true;
        fVar2.invalidateSelf();
        fVar2.A();
    }

    public void setTextAppearance(bf.d dVar) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.X(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        f fVar = this.f3835e;
        if (fVar == null || fVar.C0 == f10) {
            return;
        }
        fVar.C0 = f10;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setTextEndPaddingResource(int i10) throws Resources.NotFoundException {
        f fVar = this.f3835e;
        if (fVar != null) {
            float dimension = fVar.G0.getResources().getDimension(i10);
            if (fVar.C0 != dimension) {
                fVar.C0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        f fVar = this.f3835e;
        if (fVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            i iVar = fVar.M0;
            bf.d dVar = iVar.f20554f;
            if (dVar != null) {
                dVar.f1768l = fApplyDimension;
                iVar.f20549a.setTextSize(fApplyDimension);
                fVar.A();
                fVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f10) {
        f fVar = this.f3835e;
        if (fVar == null || fVar.B0 == f10) {
            return;
        }
        fVar.B0 = f10;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setTextStartPaddingResource(int i10) throws Resources.NotFoundException {
        f fVar = this.f3835e;
        if (fVar != null) {
            float dimension = fVar.G0.getResources().getDimension(i10);
            if (fVar.B0 != dimension) {
                fVar.B0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.T(z2);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z2) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.F(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.K(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.X(new bf.d(fVar.G0, i10));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        f fVar = this.f3835e;
        if (fVar != null) {
            fVar.X(new bf.d(fVar.G0, i10));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(ze.e eVar) {
    }
}
