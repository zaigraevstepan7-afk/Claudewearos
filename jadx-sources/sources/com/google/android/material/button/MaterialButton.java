package com.google.android.material.button;

import ac.h;
import ac.o;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import ef.b0;
import ef.i;
import ef.l;
import ef.m;
import ef.x;
import ef.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.n;
import q5.f;
import q5.g;
import se.a;
import se.b;
import se.d;
import se.e;
import u6.v;
import uk.c;
import ze.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class MaterialButton extends n implements Checkable, x {

    /* renamed from: b0, reason: collision with root package name */
    public static final int[] f3824b0 = {R.attr.state_checkable};

    /* renamed from: c0, reason: collision with root package name */
    public static final int[] f3825c0 = {R.attr.state_checked};

    /* renamed from: d0, reason: collision with root package name */
    public static final a f3826d0 = new a();
    public ColorStateList A;
    public Drawable B;
    public String C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public float L;
    public int M;
    public int N;
    public LinearLayout.LayoutParams O;
    public boolean P;
    public int Q;
    public boolean R;
    public int S;
    public b0 T;
    public int U;
    public float V;
    public float W;

    /* renamed from: a0, reason: collision with root package name */
    public f f3827a0;

    /* renamed from: d, reason: collision with root package name */
    public final e f3828d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f3829e;

    /* renamed from: f, reason: collision with root package name */
    public b f3830f;

    /* renamed from: z, reason: collision with root package name */
    public PorterDuff.Mode f3831z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(jf.a.b(context, attributeSet, com.anonlab.voidlauncher.R.attr.materialButtonStyle, com.anonlab.voidlauncher.R.style.Widget_MaterialComponents_Button, new int[]{com.anonlab.voidlauncher.R.attr.materialSizeOverlay}), attributeSet);
        this.f3829e = new LinkedHashSet();
        this.H = false;
        this.I = false;
        this.K = -1;
        this.L = -1.0f;
        this.M = -1;
        this.N = -1;
        this.S = -1;
        Context context2 = getContext();
        TypedArray typedArrayE = k.e(context2, attributeSet, me.a.f11650i, com.anonlab.voidlauncher.R.attr.materialButtonStyle, com.anonlab.voidlauncher.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.G = typedArrayE.getDimensionPixelSize(13, 0);
        int i10 = typedArrayE.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f3831z = k.f(i10, mode);
        this.A = wd.a.z(getContext(), typedArrayE, 15);
        this.B = wd.a.A(getContext(), typedArrayE, 11);
        this.J = typedArrayE.getInteger(12, 1);
        this.D = typedArrayE.getDimensionPixelSize(14, 0);
        z zVarB = z.b(context2, typedArrayE, 19);
        m mVarC = zVarB != null ? zVarB.c() : m.b(context2, attributeSet, com.anonlab.voidlauncher.R.attr.materialButtonStyle, com.anonlab.voidlauncher.R.style.Widget_MaterialComponents_Button).a();
        boolean z2 = typedArrayE.getBoolean(17, false);
        e eVar = new e(this, mVarC);
        this.f3828d = eVar;
        eVar.f15007f = typedArrayE.getDimensionPixelOffset(2, 0);
        eVar.f15008g = typedArrayE.getDimensionPixelOffset(3, 0);
        eVar.f15009h = typedArrayE.getDimensionPixelOffset(4, 0);
        eVar.f15010i = typedArrayE.getDimensionPixelOffset(5, 0);
        if (typedArrayE.hasValue(9)) {
            int dimensionPixelSize = typedArrayE.getDimensionPixelSize(9, -1);
            eVar.j = dimensionPixelSize;
            float f10 = dimensionPixelSize;
            l lVarF = eVar.f15003b.f();
            lVarF.f6011e = new ef.a(f10);
            lVarF.f6012f = new ef.a(f10);
            lVarF.f6013g = new ef.a(f10);
            lVarF.f6014h = new ef.a(f10);
            eVar.f15003b = lVarF.a();
            eVar.f15004c = null;
            eVar.d();
            eVar.f15019s = true;
        }
        eVar.f15011k = typedArrayE.getDimensionPixelSize(22, 0);
        eVar.f15012l = k.f(typedArrayE.getInt(8, -1), mode);
        eVar.f15013m = wd.a.z(getContext(), typedArrayE, 7);
        eVar.f15014n = wd.a.z(getContext(), typedArrayE, 21);
        eVar.f15015o = wd.a.z(getContext(), typedArrayE, 18);
        eVar.f15020t = typedArrayE.getBoolean(6, false);
        eVar.f15023w = typedArrayE.getDimensionPixelSize(10, 0);
        eVar.f15021u = typedArrayE.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayE.hasValue(0)) {
            eVar.f15018r = true;
            setSupportBackgroundTintList(eVar.f15013m);
            setSupportBackgroundTintMode(eVar.f15012l);
        } else {
            eVar.c();
        }
        setPaddingRelative(paddingStart + eVar.f15007f, paddingTop + eVar.f15009h, paddingEnd + eVar.f15008g, paddingBottom + eVar.f15010i);
        setCheckedInternal(typedArrayE.getBoolean(1, false));
        if (zVarB != null) {
            eVar.f15005d = d();
            if (eVar.f15004c != null) {
                eVar.d();
            }
            eVar.f15004c = zVarB;
            eVar.d();
        }
        setOpticalCenterEnabled(z2);
        typedArrayE.recycle();
        setCompoundDrawablePadding(this.G);
        h(this.B != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.Q = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.V;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        i iVarA;
        if (this.P && this.R && (iVarA = this.f3828d.a(false)) != null) {
            return (int) (iVarA.h() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z2) {
        e eVar = this.f3828d;
        if (eVar == null || !eVar.f15020t || this.H == z2) {
            return;
        }
        this.H = z2;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z10 = this.H;
            if (!materialButtonToggleGroup.E) {
                materialButtonToggleGroup.f(getId(), z10);
            }
        }
        if (this.I) {
            return;
        }
        this.I = true;
        Iterator it = this.f3829e.iterator();
        if (it.hasNext()) {
            throw gk.b.k(it);
        }
        this.I = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f10) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.V != f10) {
            this.V = f10;
            j();
            invalidate();
            if (getParent() instanceof d) {
                d dVar = (d) getParent();
                int i10 = (int) this.V;
                int iIndexOfChild = dVar.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i11 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i11 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (dVar.c(i11)) {
                            materialButton2 = (MaterialButton) dVar.getChildAt(i11);
                            break;
                        }
                        i11--;
                    }
                }
                int childCount = dVar.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (dVar.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) dVar.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i10);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i10);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i10 / 2);
                materialButton.setDisplayedWidthDecrease((i10 + 1) / 2);
            }
        }
    }

    public final g d() {
        Context context = getContext();
        TypedValue typedValueN = c.N(context, com.anonlab.voidlauncher.R.attr.motionSpringFastSpatial);
        int[] iArr = me.a.f11656p;
        TypedArray typedArrayObtainStyledAttributes = typedValueN == null ? context.obtainStyledAttributes(null, iArr, 0, com.anonlab.voidlauncher.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueN.resourceId, iArr);
        g gVar = new g();
        try {
            float f10 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f10 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f11 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f11 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            gVar.b(f10);
            gVar.a(f11);
            return gVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        e eVar = this.f3828d;
        return (eVar == null || eVar.f15018r) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r9) {
        /*
            r8 = this;
            ef.b0 r0 = r8.T
            if (r0 != 0) goto L6
            goto L85
        L6:
            q5.f r0 = r8.f3827a0
            if (r0 != 0) goto L19
            q5.f r0 = new q5.f
            se.a r1 = com.google.android.material.button.MaterialButton.f3826d0
            r0.<init>(r8, r1)
            r8.f3827a0 = r0
            q5.g r1 = r8.d()
            r0.f13266m = r1
        L19:
            boolean r0 = r8.R
            if (r0 == 0) goto L85
            int r0 = r8.U
            ef.b0 r1 = r8.T
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.f5978c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.f5976a
            r7 = -1
            if (r5 >= r6) goto L3a
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r5 = r5 + 1
            goto L29
        L3a:
            r5 = r7
        L3b:
            if (r5 >= 0) goto L54
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.f5978c
            r5 = r4
        L42:
            int r6 = r1.f5976a
            if (r5 >= r6) goto L53
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L50
            r7 = r5
            goto L53
        L50:
            int r5 = r5 + 1
            goto L42
        L53:
            r5 = r7
        L54:
            if (r5 >= 0) goto L59
            yh.c r1 = r1.f5977b
            goto L5d
        L59:
            yh.c[] r1 = r1.f5979d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.f20314b
            ef.a0 r1 = (ef.a0) r1
            int r2 = r8.getWidth()
            float r3 = r1.f5973b
            int r1 = r1.f5972a
            r5 = 1
            if (r1 != r5) goto L70
            float r1 = (float) r2
            float r3 = r3 * r1
        L6e:
            int r4 = (int) r3
            goto L74
        L70:
            r2 = 2
            if (r1 != r2) goto L74
            goto L6e
        L74:
            int r0 = java.lang.Math.min(r0, r4)
            q5.f r1 = r8.f3827a0
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L85
            q5.f r9 = r8.f3827a0
            r9.d()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i10 = this.J;
        if (i10 == 1 || i10 == 2) {
            setCompoundDrawablesRelative(this.B, null, null, null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            setCompoundDrawablesRelative(null, null, this.B, null);
        } else if (i10 == 16 || i10 == 32) {
            setCompoundDrawablesRelative(null, this.B, null, null);
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.C)) {
            return this.C;
        }
        e eVar = this.f3828d;
        return ((eVar == null || !eVar.f15020t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.S;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f3828d.j;
        }
        return 0;
    }

    public g getCornerSpringForce() {
        return this.f3828d.f15005d;
    }

    public Drawable getIcon() {
        return this.B;
    }

    public int getIconGravity() {
        return this.J;
    }

    public int getIconPadding() {
        return this.G;
    }

    public int getIconSize() {
        return this.D;
    }

    public ColorStateList getIconTint() {
        return this.A;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3831z;
    }

    public int getInsetBottom() {
        return this.f3828d.f15010i;
    }

    public int getInsetTop() {
        return this.f3828d.f15009h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f3828d.f15015o;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        if (e()) {
            return this.f3828d.f15003b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public z getStateListShapeAppearanceModel() {
        if (e()) {
            return this.f3828d.f15004c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f3828d.f15014n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f3828d.f15011k;
        }
        return 0;
    }

    @Override // m.n
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f3828d.f15013m : super.getSupportBackgroundTintList();
    }

    @Override // m.n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f3828d.f15012l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z2) {
        Drawable drawable = this.B;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.B = drawableMutate;
            drawableMutate.setTintList(this.A);
            PorterDuff.Mode mode = this.f3831z;
            if (mode != null) {
                this.B.setTintMode(mode);
            }
            int intrinsicWidth = this.D;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.B.getIntrinsicWidth();
            }
            int intrinsicHeight = this.D;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.B.getIntrinsicHeight();
            }
            Drawable drawable2 = this.B;
            int i10 = this.E;
            int i11 = this.F;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.B.setVisible(true, z2);
        }
        if (z2) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i12 = this.J;
        if (((i12 == 1 || i12 == 2) && drawable3 != this.B) || (((i12 == 3 || i12 == 4) && drawable5 != this.B) || ((i12 == 16 || i12 == 32) && drawable4 != this.B))) {
            g();
        }
    }

    public final void i(int i10, int i11) {
        if (this.B == null || getLayout() == null) {
            return;
        }
        int i12 = this.J;
        if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
            if (i12 == 16 || i12 == 32) {
                this.E = 0;
                if (i12 == 16) {
                    this.F = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.D;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.B.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.G) - getPaddingBottom()) / 2);
                if (this.F != iMax) {
                    this.F = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.F = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.J;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.E = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.D;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.B.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.G) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.J == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.E != textLayoutWidth) {
            this.E = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.H;
    }

    public final void j() {
        int i10 = (int) (this.V - this.W);
        int i11 = (i10 / 2) + this.Q;
        getLayoutParams().width = (int) (this.L + i10);
        setPaddingRelative(this.M + i11, getPaddingTop(), (this.N + i10) - i11, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            cg.b.N(this, this.f3828d.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        e eVar = this.f3828d;
        if (eVar != null && eVar.f15020t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3824b0);
        }
        if (this.H) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3825c0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // m.n, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.H);
    }

    @Override // m.n, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        e eVar = this.f3828d;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f15020t);
        accessibilityNodeInfo.setChecked(this.H);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // m.n, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z2, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i15 = getResources().getConfiguration().orientation;
        if (this.K != i15) {
            this.K = i15;
            this.L = -1.0f;
        }
        if (this.L == -1.0f) {
            this.L = getMeasuredWidth();
            if (this.O == null && (getParent() instanceof d) && ((d) getParent()).getButtonSizeChange() != null) {
                this.O = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.O);
                layoutParams.width = (int) this.L;
                setLayoutParams(layoutParams);
            }
        }
        boolean z10 = false;
        if (this.S == -1) {
            if (this.B == null) {
                i14 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.D;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.B.getIntrinsicWidth();
                }
                i14 = iconPadding + intrinsicWidth;
            }
            this.S = (getMeasuredWidth() - getTextLayoutWidth()) - i14;
        }
        if (this.M == -1) {
            this.M = getPaddingStart();
        }
        if (this.N == -1) {
            this.N = getPaddingEnd();
        }
        if ((getParent() instanceof d) && ((d) getParent()).getOrientation() == 0) {
            z10 = true;
        }
        this.R = z10;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof se.c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        se.c cVar = (se.c) parcelable;
        super.onRestoreInstanceState(cVar.f9454a);
        setChecked(cVar.f14994c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        se.c cVar = new se.c(super.onSaveInstanceState());
        cVar.f14994c = this.H;
        return cVar;
    }

    @Override // m.n, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.f3828d.f15021u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.B != null) {
            if (this.B.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.C = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (!e()) {
            super.setBackgroundColor(i10);
            return;
        }
        e eVar = this.f3828d;
        if (eVar.a(false) != null) {
            eVar.a(false).setTint(i10);
        }
    }

    @Override // m.n, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        e eVar = this.f3828d;
        eVar.f15018r = true;
        MaterialButton materialButton = eVar.f15002a;
        materialButton.setSupportBackgroundTintList(eVar.f15013m);
        materialButton.setSupportBackgroundTintMode(eVar.f15012l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // m.n, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? v.G(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (e()) {
            this.f3828d.f15020t = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedInternal(z2);
    }

    public void setCornerRadius(int i10) {
        if (e()) {
            e eVar = this.f3828d;
            if (eVar.f15019s && eVar.j == i10) {
                return;
            }
            eVar.j = i10;
            eVar.f15019s = true;
            float f10 = i10;
            l lVarF = eVar.f15003b.f();
            lVarF.f6011e = new ef.a(f10);
            lVarF.f6012f = new ef.a(f10);
            lVarF.f6013g = new ef.a(f10);
            lVarF.f6014h = new ef.a(f10);
            eVar.f15003b = lVarF.a();
            eVar.f15004c = null;
            eVar.d();
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCornerSpringForce(g gVar) {
        e eVar = this.f3828d;
        eVar.f15005d = gVar;
        if (eVar.f15004c != null) {
            eVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i10) {
        this.W = Math.min(i10, this.S);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (e()) {
            this.f3828d.a(false).m(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.B != drawable) {
            this.B = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.J != i10) {
            this.J = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.G != i10) {
            this.G = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? v.G(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.D != i10) {
            this.D = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3831z != mode) {
            this.f3831z = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(i4.c.getColorStateList(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        e eVar = this.f3828d;
        eVar.b(eVar.f15009h, i10);
    }

    public void setInsetTop(int i10) {
        e eVar = this.f3828d;
        eVar.b(i10, eVar.f15010i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f3830f = bVar;
    }

    public void setOpticalCenterEnabled(boolean z2) {
        if (this.P != z2) {
            this.P = z2;
            e eVar = this.f3828d;
            if (z2) {
                h hVar = new h(this, 29);
                eVar.f15006e = hVar;
                i iVarA = eVar.a(false);
                if (iVarA != null) {
                    iVarA.W = hVar;
                }
            } else {
                eVar.f15006e = null;
                i iVarA2 = eVar.a(false);
                if (iVarA2 != null) {
                    iVarA2.W = null;
                }
            }
            post(new o(this, 19));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        b bVar = this.f3830f;
        if (bVar != null) {
            ((MaterialButtonToggleGroup) ((ag.i) bVar).f449b).invalidate();
        }
        super.setPressed(z2);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            e eVar = this.f3828d;
            MaterialButton materialButton = eVar.f15002a;
            if (eVar.f15015o != colorStateList) {
                eVar.f15015o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(cf.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (e()) {
            setRippleColor(i4.c.getColorStateList(getContext(), i10));
        }
    }

    @Override // ef.x
    public void setShapeAppearanceModel(m mVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        e eVar = this.f3828d;
        eVar.f15003b = mVar;
        eVar.f15004c = null;
        eVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (e()) {
            e eVar = this.f3828d;
            eVar.f15017q = z2;
            eVar.e();
        }
    }

    public void setSizeChange(b0 b0Var) {
        if (this.T != b0Var) {
            this.T = b0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(z zVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        e eVar = this.f3828d;
        if (eVar.f15005d == null && zVar.d()) {
            eVar.f15005d = d();
            if (eVar.f15004c != null) {
                eVar.d();
            }
        }
        eVar.f15004c = zVar;
        eVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            e eVar = this.f3828d;
            if (eVar.f15014n != colorStateList) {
                eVar.f15014n = colorStateList;
                eVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (e()) {
            setStrokeColor(i4.c.getColorStateList(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (e()) {
            e eVar = this.f3828d;
            if (eVar.f15011k != i10) {
                eVar.f15011k = i10;
                eVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // m.n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        e eVar = this.f3828d;
        if (eVar.f15013m != colorStateList) {
            eVar.f15013m = colorStateList;
            if (eVar.a(false) != null) {
                eVar.a(false).setTintList(eVar.f15013m);
            }
        }
    }

    @Override // m.n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        e eVar = this.f3828d;
        if (eVar.f15012l != mode) {
            eVar.f15012l = mode;
            if (eVar.a(false) == null || eVar.f15012l == null) {
                return;
            }
            eVar.a(false).setTintMode(eVar.f15012l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f3828d.f15021u = z2;
    }

    @Override // android.widget.TextView
    public void setWidth(int i10) {
        this.L = -1.0f;
        super.setWidth(i10);
    }

    public void setWidthChangeMax(int i10) {
        if (this.U != i10) {
            this.U = i10;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.H);
    }
}
