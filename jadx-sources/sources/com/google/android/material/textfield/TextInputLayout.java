package com.google.android.material.textfield;

import ac.d;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import ef.g;
import ef.i;
import ef.l;
import ef.m;
import hf.a0;
import hf.b0;
import hf.o;
import hf.q;
import hf.t;
import hf.u;
import hf.w;
import hf.x;
import hf.y;
import hf.z;
import i4.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import jf.a;
import l7.h;
import m.g0;
import m.n0;
import m.p;
import t4.l0;
import u6.v;
import yd.f;
import ze.b;
import ze.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] W0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public int A;
    public int A0;
    public int B;
    public Drawable B0;
    public int C;
    public ColorStateList C0;
    public final u D;
    public ColorStateList D0;
    public boolean E;
    public int E0;
    public int F;
    public int F0;
    public boolean G;
    public int G0;
    public a0 H;
    public ColorStateList H0;
    public g0 I;
    public int I0;
    public int J;
    public int J0;
    public int K;
    public int K0;
    public CharSequence L;
    public int L0;
    public boolean M;
    public int M0;
    public g0 N;
    public int N0;
    public ColorStateList O;
    public boolean O0;
    public int P;
    public final b P0;
    public h Q;
    public boolean Q0;
    public h R;
    public boolean R0;
    public ColorStateList S;
    public ValueAnimator S0;
    public ColorStateList T;
    public boolean T0;
    public ColorStateList U;
    public boolean U0;
    public ColorStateList V;
    public boolean V0;
    public boolean W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3947a;

    /* renamed from: a0, reason: collision with root package name */
    public CharSequence f3948a0;

    /* renamed from: b, reason: collision with root package name */
    public final w f3949b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3950b0;

    /* renamed from: c, reason: collision with root package name */
    public final q f3951c;

    /* renamed from: c0, reason: collision with root package name */
    public i f3952c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f3953d;

    /* renamed from: d0, reason: collision with root package name */
    public i f3954d0;

    /* renamed from: e, reason: collision with root package name */
    public EditText f3955e;

    /* renamed from: e0, reason: collision with root package name */
    public StateListDrawable f3956e0;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3957f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3958f0;

    /* renamed from: g0, reason: collision with root package name */
    public i f3959g0;

    /* renamed from: h0, reason: collision with root package name */
    public i f3960h0;

    /* renamed from: i0, reason: collision with root package name */
    public m f3961i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f3962j0;

    /* renamed from: k0, reason: collision with root package name */
    public final int f3963k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f3964l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f3965m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f3966n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f3967o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f3968p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f3969q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f3970r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Rect f3971s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Rect f3972t0;

    /* renamed from: u0, reason: collision with root package name */
    public final RectF f3973u0;

    /* renamed from: v0, reason: collision with root package name */
    public Typeface f3974v0;
    public ColorDrawable w0;
    public int x0;
    public final LinkedHashSet y0;

    /* renamed from: z, reason: collision with root package name */
    public int f3975z;
    public ColorDrawable z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(a.a(context, attributeSet, com.anonlab.voidlauncher.R.attr.textInputStyle, com.anonlab.voidlauncher.R.style.Widget_Design_TextInputLayout), attributeSet, com.anonlab.voidlauncher.R.attr.textInputStyle);
        this.f3975z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = new u(this);
        this.H = new b0.b(22);
        this.f3971s0 = new Rect();
        this.f3972t0 = new Rect();
        this.f3973u0 = new RectF();
        this.y0 = new LinkedHashSet();
        b bVar = new b(this);
        this.P0 = bVar;
        this.V0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f3947a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = ne.a.f12301a;
        bVar.R = linearInterpolator;
        bVar.j(false);
        bVar.Q = linearInterpolator;
        bVar.j(false);
        if (bVar.f20511g != 8388659) {
            bVar.f20511g = 8388659;
            bVar.j(false);
        }
        k.a(context2, attributeSet, com.anonlab.voidlauncher.R.attr.textInputStyle, com.anonlab.voidlauncher.R.style.Widget_Design_TextInputLayout);
        int[] iArr = me.a.f11666z;
        k.b(context2, attributeSet, iArr, com.anonlab.voidlauncher.R.attr.textInputStyle, com.anonlab.voidlauncher.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.anonlab.voidlauncher.R.attr.textInputStyle, com.anonlab.voidlauncher.R.style.Widget_Design_TextInputLayout);
        d dVar = new d(context2, typedArrayObtainStyledAttributes);
        w wVar = new w(this, dVar);
        this.f3949b = wVar;
        this.W = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.R0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.Q0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f3961i0 = m.b(context2, attributeSet, com.anonlab.voidlauncher.R.attr.textInputStyle, com.anonlab.voidlauncher.R.style.Widget_Design_TextInputLayout).a();
        this.f3963k0 = context2.getResources().getDimensionPixelOffset(com.anonlab.voidlauncher.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f3965m0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f3953d = getResources().getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f3967o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f3968p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f3966n0 = this.f3967o0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        l lVarF = this.f3961i0.f();
        if (dimension >= 0.0f) {
            lVarF.f6011e = new ef.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            lVarF.f6012f = new ef.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            lVarF.f6013g = new ef.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            lVarF.f6014h = new ef.a(dimension4);
        }
        this.f3961i0 = lVarF.a();
        ColorStateList colorStateListY = wd.a.y(context2, dVar, 7);
        if (colorStateListY != null) {
            int defaultColor = colorStateListY.getDefaultColor();
            this.I0 = defaultColor;
            this.f3970r0 = defaultColor;
            if (colorStateListY.isStateful()) {
                this.J0 = colorStateListY.getColorForState(new int[]{-16842910}, -1);
                this.K0 = colorStateListY.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.L0 = colorStateListY.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.K0 = this.I0;
                ColorStateList colorStateList = c.getColorStateList(context2, com.anonlab.voidlauncher.R.color.mtrl_filled_background_color);
                this.J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.L0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f3970r0 = 0;
            this.I0 = 0;
            this.J0 = 0;
            this.K0 = 0;
            this.L0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListI = dVar.i(1);
            this.D0 = colorStateListI;
            this.C0 = colorStateListI;
        }
        ColorStateList colorStateListY2 = wd.a.y(context2, dVar, 14);
        this.G0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.E0 = c.getColor(context2, com.anonlab.voidlauncher.R.color.mtrl_textinput_default_box_stroke_color);
        this.M0 = c.getColor(context2, com.anonlab.voidlauncher.R.color.mtrl_textinput_disabled_color);
        this.F0 = c.getColor(context2, com.anonlab.voidlauncher.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListY2 != null) {
            setBoxStrokeColorStateList(colorStateListY2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(wd.a.y(context2, dVar, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.U = dVar.i(24);
        this.V = dVar.i(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i10 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.K = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i10);
        setCounterOverflowTextAppearance(this.J);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.K);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(dVar.i(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(dVar.i(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(dVar.i(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(dVar.i(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(dVar.i(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(dVar.i(59));
        }
        q qVar = new q(this, dVar);
        this.f3951c = qVar;
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        dVar.I();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(wVar);
        frameLayout.addView(qVar);
        addView(frameLayout);
        setEnabled(z12);
        setHelperTextEnabled(z10);
        setErrorEnabled(z2);
        setCounterEnabled(z11);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f3955e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f3952c0;
        }
        int iJ = u2.b.j(this.f3955e, com.anonlab.voidlauncher.R.attr.colorControlHighlight);
        int i10 = this.f3964l0;
        int[][] iArr = W0;
        if (i10 != 2) {
            if (i10 != 1) {
                return null;
            }
            i iVar = this.f3952c0;
            int i11 = this.f3970r0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{u2.b.m(0.1f, iJ, i11), i11}), iVar, iVar);
        }
        Context context = getContext();
        i iVar2 = this.f3952c0;
        TypedValue typedValueO = uk.c.O(context, "TextInputLayout", com.anonlab.voidlauncher.R.attr.colorSurface);
        int i12 = typedValueO.resourceId;
        int color = i12 != 0 ? c.getColor(context, i12) : typedValueO.data;
        i iVar3 = new i(iVar2.f6000b.f5982a);
        int iM = u2.b.m(0.1f, iJ, color);
        iVar3.n(new ColorStateList(iArr, new int[]{iM, 0}));
        iVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM, color});
        i iVar4 = new i(iVar2.f6000b.f5982a);
        iVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, iVar3, iVar4), iVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f3956e0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f3956e0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f3956e0.addState(new int[0], h(false));
        }
        return this.f3956e0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f3954d0 == null) {
            this.f3954d0 = h(true);
        }
        return this.f3954d0;
    }

    public static void m(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f3955e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f3955e = editText;
        int i10 = this.f3975z;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.B);
        }
        int i11 = this.A;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.C);
        }
        this.f3958f0 = false;
        k();
        setTextInputAccessibilityDelegate(new z(this));
        Typeface typeface = this.f3955e.getTypeface();
        b bVar = this.P0;
        bVar.n(typeface);
        float textSize = this.f3955e.getTextSize();
        if (bVar.f20513h != textSize) {
            bVar.f20513h = textSize;
            bVar.j(false);
        }
        float letterSpacing = this.f3955e.getLetterSpacing();
        if (bVar.X != letterSpacing) {
            bVar.X = letterSpacing;
            bVar.j(false);
        }
        int gravity = this.f3955e.getGravity();
        int i12 = (gravity & (-113)) | 48;
        if (bVar.f20511g != i12) {
            bVar.f20511g = i12;
            bVar.j(false);
        }
        if (bVar.f20509f != gravity) {
            bVar.f20509f = gravity;
            bVar.j(false);
        }
        this.N0 = editText.getMinimumHeight();
        this.f3955e.addTextChangedListener(new x(this, editText));
        if (this.C0 == null) {
            this.C0 = this.f3955e.getHintTextColors();
        }
        if (this.W) {
            if (TextUtils.isEmpty(this.f3948a0)) {
                CharSequence hint = this.f3955e.getHint();
                this.f3957f = hint;
                setHint(hint);
                this.f3955e.setHint((CharSequence) null);
            }
            this.f3950b0 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.I != null) {
            p(this.f3955e.getText());
        }
        t();
        this.D.b();
        this.f3949b.bringToFront();
        q qVar = this.f3951c;
        qVar.bringToFront();
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(this);
        }
        qVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f3948a0)) {
            return;
        }
        this.f3948a0 = charSequence;
        b bVar = this.P0;
        if (charSequence == null || !TextUtils.equals(bVar.B, charSequence)) {
            bVar.B = charSequence;
            bVar.C = null;
            bVar.j(false);
        }
        if (this.O0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.M == z2) {
            return;
        }
        if (z2) {
            g0 g0Var = this.N;
            if (g0Var != null) {
                this.f3947a.addView(g0Var);
                this.N.setVisibility(0);
            }
        } else {
            g0 g0Var2 = this.N;
            if (g0Var2 != null) {
                g0Var2.setVisibility(8);
            }
            this.N = null;
        }
        this.M = z2;
    }

    public final void a() {
        if (this.f3955e == null || this.f3964l0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f3955e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.P0.f() + this.f3953d), this.f3955e.getPaddingEnd(), getResources().getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f3955e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f3955e.getPaddingEnd(), getResources().getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (wd.a.G(getContext())) {
            EditText editText3 = this.f3955e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f3955e.getPaddingEnd(), getResources().getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f3947a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f10) {
        b bVar = this.P0;
        if (bVar.f20501b == f10) {
            return;
        }
        int i10 = 0;
        if (this.S0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.S0 = valueAnimator;
            valueAnimator.setInterpolator(f.c0(getContext(), com.anonlab.voidlauncher.R.attr.motionEasingEmphasizedInterpolator, ne.a.f12302b));
            this.S0.setDuration(f.b0(getContext(), com.anonlab.voidlauncher.R.attr.motionDurationMedium4, 167));
            this.S0.addUpdateListener(new y(this, i10));
        }
        this.S0.setFloatValues(bVar.f20501b, f10);
        this.S0.start();
    }

    public final void c() {
        int i10;
        int i11;
        i iVar = this.f3952c0;
        if (iVar == null) {
            return;
        }
        m mVar = iVar.f6000b.f5982a;
        m mVar2 = this.f3961i0;
        if (mVar != mVar2) {
            iVar.setShapeAppearanceModel(mVar2);
        }
        if (this.f3964l0 == 2 && (i10 = this.f3966n0) > -1 && (i11 = this.f3969q0) != 0) {
            i iVar2 = this.f3952c0;
            iVar2.f6000b.f5991k = i10;
            iVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i11);
            g gVar = iVar2.f6000b;
            if (gVar.f5986e != colorStateListValueOf) {
                gVar.f5986e = colorStateListValueOf;
                iVar2.onStateChange(iVar2.getState());
            }
        }
        int iB = this.f3970r0;
        if (this.f3964l0 == 1) {
            iB = l4.a.b(this.f3970r0, u2.b.i(getContext(), com.anonlab.voidlauncher.R.attr.colorSurface, 0));
        }
        this.f3970r0 = iB;
        this.f3952c0.n(ColorStateList.valueOf(iB));
        i iVar3 = this.f3959g0;
        if (iVar3 != null && this.f3960h0 != null) {
            if (this.f3966n0 > -1 && this.f3969q0 != 0) {
                iVar3.n(this.f3955e.isFocused() ? ColorStateList.valueOf(this.E0) : ColorStateList.valueOf(this.f3969q0));
                this.f3960h0.n(ColorStateList.valueOf(this.f3969q0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f3955e == null) {
            throw new IllegalStateException();
        }
        boolean z2 = getLayoutDirection() == 1;
        int i10 = rect.bottom;
        Rect rect2 = this.f3972t0;
        rect2.bottom = i10;
        int i11 = this.f3964l0;
        if (i11 == 1) {
            rect2.left = i(rect.left, z2);
            rect2.top = rect.top + this.f3965m0;
            rect2.right = j(rect.right, z2);
            return rect2;
        }
        if (i11 != 2) {
            rect2.left = i(rect.left, z2);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z2);
            return rect2;
        }
        rect2.left = this.f3955e.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f3955e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f3955e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f3957f != null) {
            boolean z2 = this.f3950b0;
            this.f3950b0 = false;
            CharSequence hint = editText.getHint();
            this.f3955e.setHint(this.f3957f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f3955e.setHint(hint);
                this.f3950b0 = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f3947a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f3955e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.U0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.U0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        i iVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z2 = this.W;
        b bVar = this.P0;
        if (z2) {
            TextPaint textPaint = bVar.O;
            RectF rectF = bVar.f20507e;
            int iSave = canvas2.save();
            if (bVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(bVar.G);
                float f10 = bVar.f20525q;
                float f11 = bVar.f20526r;
                float f12 = bVar.F;
                if (f12 != 1.0f) {
                    canvas2.scale(f12, f12, f10, f11);
                }
                if ((bVar.f20508e0 > 1 || bVar.f20510f0 > 1) && !bVar.D && bVar.o()) {
                    float lineStart = bVar.f20525q - bVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f11);
                    float f13 = alpha;
                    textPaint.setAlpha((int) (bVar.f20504c0 * f13));
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 31) {
                        float f14 = bVar.H;
                        float f15 = bVar.I;
                        float f16 = bVar.J;
                        int i11 = bVar.K;
                        textPaint.setShadowLayer(f14, f15, f16, l4.a.d(i11, (textPaint.getAlpha() * Color.alpha(i11)) / 255));
                    }
                    bVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (bVar.f20502b0 * f13));
                    if (i10 >= 31) {
                        float f17 = bVar.H;
                        float f18 = bVar.I;
                        float f19 = bVar.J;
                        int i12 = bVar.K;
                        textPaint.setShadowLayer(f17, f18, f19, l4.a.d(i12, (Color.alpha(i12) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = bVar.Z.getLineBaseline(0);
                    CharSequence charSequence = bVar.f20506d0;
                    float f20 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f20, textPaint);
                    if (i10 >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                    }
                    String strTrim = bVar.f20506d0.toString().trim();
                    if (strTrim.endsWith("\u2026")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(bVar.Z.getLineEnd(0), str.length()), 0.0f, f20, (Paint) textPaint);
                } else {
                    canvas2.translate(f10, f11);
                    bVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f3960h0 == null || (iVar = this.f3959g0) == null) {
            return;
        }
        iVar.draw(canvas2);
        if (this.f3955e.isFocused()) {
            Rect bounds = this.f3960h0.getBounds();
            Rect bounds2 = this.f3959g0.getBounds();
            float f21 = bVar.f20501b;
            int iCenterX = bounds2.centerX();
            bounds.left = ne.a.c(f21, iCenterX, bounds2.left);
            bounds.right = ne.a.c(f21, iCenterX, bounds2.right);
            this.f3960h0.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.T0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.T0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            ze.b r3 = r4.P0
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.f20518k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.j(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f3955e
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.w(r0, r2)
        L45:
            r4.t()
            r4.z()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.T0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.W) {
            int i10 = this.f3964l0;
            b bVar = this.P0;
            if (i10 == 0) {
                return (int) bVar.f();
            }
            if (i10 == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (bVar.f() / 2.0f);
                }
                float f10 = bVar.f();
                TextPaint textPaint = bVar.P;
                textPaint.setTextSize(bVar.f20515i);
                textPaint.setTypeface(bVar.f20527s);
                textPaint.setLetterSpacing(bVar.W);
                return Math.max(0, (int) (f10 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.f10064c = f.b0(getContext(), com.anonlab.voidlauncher.R.attr.motionDurationShort2, 87);
        hVar.f10065d = f.c0(getContext(), com.anonlab.voidlauncher.R.attr.motionEasingLinearInterpolator, ne.a.f12301a);
        return hVar;
    }

    public final boolean g() {
        return this.W && !TextUtils.isEmpty(this.f3948a0) && (this.f3952c0 instanceof hf.g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3955e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public i getBoxBackground() {
        int i10 = this.f3964l0;
        if (i10 == 1 || i10 == 2) {
            return this.f3952c0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f3970r0;
    }

    public int getBoxBackgroundMode() {
        return this.f3964l0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f3965m0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f3973u0;
        return layoutDirection == 1 ? this.f3961i0.f6025h.a(rectF) : this.f3961i0.f6024g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f3973u0;
        return layoutDirection == 1 ? this.f3961i0.f6024g.a(rectF) : this.f3961i0.f6025h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f3973u0;
        return layoutDirection == 1 ? this.f3961i0.f6022e.a(rectF) : this.f3961i0.f6023f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f3973u0;
        return layoutDirection == 1 ? this.f3961i0.f6023f.a(rectF) : this.f3961i0.f6022e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.G0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.H0;
    }

    public int getBoxStrokeWidth() {
        return this.f3967o0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f3968p0;
    }

    public int getCounterMaxLength() {
        return this.F;
    }

    public CharSequence getCounterOverflowDescription() {
        g0 g0Var;
        if (this.E && this.G && (g0Var = this.I) != null) {
            return g0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.T;
    }

    public ColorStateList getCounterTextColor() {
        return this.S;
    }

    public ColorStateList getCursorColor() {
        return this.U;
    }

    public ColorStateList getCursorErrorColor() {
        return this.V;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.C0;
    }

    public EditText getEditText() {
        return this.f3955e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3951c.f7945z.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3951c.f7945z.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f3951c.F;
    }

    public int getEndIconMode() {
        return this.f3951c.B;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f3951c.G;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3951c.f7945z;
    }

    public CharSequence getError() {
        u uVar = this.D;
        if (uVar.f7971q) {
            return uVar.f7970p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.D.f7974t;
    }

    public CharSequence getErrorContentDescription() {
        return this.D.f7973s;
    }

    public int getErrorCurrentTextColors() {
        g0 g0Var = this.D.f7972r;
        if (g0Var != null) {
            return g0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f3951c.f7941c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.D;
        if (uVar.f7978x) {
            return uVar.f7977w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        g0 g0Var = this.D.f7979y;
        if (g0Var != null) {
            return g0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.W) {
            return this.f3948a0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.P0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.P0;
        return bVar.g(bVar.f20518k);
    }

    public int getHintMaxLines() {
        return this.P0.f20508e0;
    }

    public ColorStateList getHintTextColor() {
        return this.D0;
    }

    public a0 getLengthCounter() {
        return this.H;
    }

    public int getMaxEms() {
        return this.A;
    }

    public int getMaxWidth() {
        return this.C;
    }

    public int getMinEms() {
        return this.f3975z;
    }

    public int getMinWidth() {
        return this.B;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3951c.f7945z.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3951c.f7945z.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.M) {
            return this.L;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.P;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.O;
    }

    public CharSequence getPrefixText() {
        return this.f3949b.f7986c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3949b.f7985b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3949b.f7985b;
    }

    public m getShapeAppearanceModel() {
        return this.f3961i0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3949b.f7987d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3949b.f7987d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f3949b.f7990z;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f3949b.A;
    }

    public CharSequence getSuffixText() {
        return this.f3951c.I;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f3951c.J.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f3951c.J;
    }

    public Typeface getTypeface() {
        return this.f3974v0;
    }

    public final i h(boolean z2) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.anonlab.voidlauncher.R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z2 ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.anonlab.voidlauncher.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.anonlab.voidlauncher.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ef.k kVar = new ef.k();
        ef.k kVar2 = new ef.k();
        ef.k kVar3 = new ef.k();
        ef.k kVar4 = new ef.k();
        ef.f fVar = new ef.f();
        ef.f fVar2 = new ef.f();
        ef.f fVar3 = new ef.f();
        ef.f fVar4 = new ef.f();
        ef.a aVar = new ef.a(f10);
        ef.a aVar2 = new ef.a(f10);
        ef.a aVar3 = new ef.a(dimensionPixelOffset);
        ef.a aVar4 = new ef.a(dimensionPixelOffset);
        m mVar = new m();
        mVar.f6018a = kVar;
        mVar.f6019b = kVar2;
        mVar.f6020c = kVar3;
        mVar.f6021d = kVar4;
        mVar.f6022e = aVar;
        mVar.f6023f = aVar2;
        mVar.f6024g = aVar4;
        mVar.f6025h = aVar3;
        mVar.f6026i = fVar;
        mVar.j = fVar2;
        mVar.f6027k = fVar3;
        mVar.f6028l = fVar4;
        Context context = getContext();
        Paint paint = i.X;
        TypedValue typedValueO = uk.c.O(context, i.class.getSimpleName(), com.anonlab.voidlauncher.R.attr.colorSurface);
        int i10 = typedValueO.resourceId;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10 != 0 ? c.getColor(context, i10) : typedValueO.data);
        i iVar = new i();
        iVar.k(context);
        iVar.n(colorStateListValueOf);
        iVar.m(dimensionPixelOffset2);
        iVar.setShapeAppearanceModel(mVar);
        g gVar = iVar.f6000b;
        if (gVar.f5989h == null) {
            gVar.f5989h = new Rect();
        }
        iVar.f6000b.f5989h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        iVar.invalidateSelf();
        return iVar;
    }

    public final int i(int i10, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f3955e.getCompoundPaddingLeft() : this.f3951c.c() : this.f3949b.a()) + i10;
    }

    public final int j(int i10, boolean z2) {
        return i10 - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f3955e.getCompoundPaddingRight() : this.f3949b.a() : this.f3951c.c());
    }

    public final void k() throws Resources.NotFoundException {
        int i10 = this.f3964l0;
        if (i10 == 0) {
            this.f3952c0 = null;
            this.f3959g0 = null;
            this.f3960h0 = null;
        } else if (i10 == 1) {
            this.f3952c0 = new i(this.f3961i0);
            this.f3959g0 = new i();
            this.f3960h0 = new i();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(m6.a.h(new StringBuilder(), this.f3964l0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.W || (this.f3952c0 instanceof hf.g)) {
                this.f3952c0 = new i(this.f3961i0);
            } else {
                m mVar = this.f3961i0;
                int i11 = hf.g.f7911a0;
                if (mVar == null) {
                    mVar = new m();
                }
                hf.f fVar = new hf.f(mVar, new RectF());
                hf.g gVar = new hf.g(fVar);
                gVar.Z = fVar;
                this.f3952c0 = gVar;
            }
            this.f3959g0 = null;
            this.f3960h0 = null;
        }
        u();
        z();
        if (this.f3964l0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f3965m0 = getResources().getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (wd.a.G(getContext())) {
                this.f3965m0 = getResources().getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.f3964l0 != 0) {
            v();
        }
        EditText editText = this.f3955e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f3964l0;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void n(g0 g0Var, int i10) {
        try {
            g0Var.setTextAppearance(i10);
            if (g0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        g0Var.setTextAppearance(com.anonlab.voidlauncher.R.style.TextAppearance_AppCompat_Caption);
        g0Var.setTextColor(c.getColor(getContext(), com.anonlab.voidlauncher.R.color.design_error));
    }

    public final boolean o() {
        u uVar = this.D;
        return (uVar.f7969o != 1 || uVar.f7972r == null || TextUtils.isEmpty(uVar.f7970p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.P0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        q qVar = this.f3951c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.V0 = false;
        if (this.f3955e != null && this.f3955e.getMeasuredHeight() < (iMax = Math.max(qVar.getMeasuredHeight(), this.f3949b.getMeasuredHeight()))) {
            this.f3955e.setMinimumHeight(iMax);
            z2 = true;
        }
        boolean zS = s();
        if (z2 || zS) {
            this.f3955e.post(new ac.o(this, 12));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        float fDescent;
        int i14;
        int compoundPaddingTop;
        super.onLayout(z2, i10, i11, i12, i13);
        EditText editText = this.f3955e;
        if (editText != null) {
            Rect rect = this.f3971s0;
            ze.c.a(this, editText, rect);
            i iVar = this.f3959g0;
            if (iVar != null) {
                int i15 = rect.bottom;
                iVar.setBounds(rect.left, i15 - this.f3967o0, rect.right, i15);
            }
            i iVar2 = this.f3960h0;
            if (iVar2 != null) {
                int i16 = rect.bottom;
                iVar2.setBounds(rect.left, i16 - this.f3968p0, rect.right, i16);
            }
            if (this.W) {
                float textSize = this.f3955e.getTextSize();
                b bVar = this.P0;
                float f10 = bVar.f20513h;
                TextPaint textPaint = bVar.P;
                if (f10 != textSize) {
                    bVar.f20513h = textSize;
                    bVar.j(false);
                }
                int gravity = this.f3955e.getGravity();
                int i17 = (gravity & (-113)) | 48;
                if (bVar.f20511g != i17) {
                    bVar.f20511g = i17;
                    bVar.j(false);
                }
                if (bVar.f20509f != gravity) {
                    bVar.f20509f = gravity;
                    bVar.j(false);
                }
                Rect rectD = d(rect);
                int i18 = rectD.left;
                int i19 = rectD.top;
                int i20 = rectD.right;
                int i21 = rectD.bottom;
                Rect rect2 = bVar.f20505d;
                if (rect2.left != i18 || rect2.top != i19 || rect2.right != i20 || rect2.bottom != i21) {
                    rect2.set(i18, i19, i20, i21);
                    bVar.N = true;
                }
                if (this.f3955e == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(bVar.f20513h);
                    textPaint.setTypeface(bVar.f20530v);
                    textPaint.setLetterSpacing(bVar.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(bVar.f20513h);
                    textPaint.setTypeface(bVar.f20530v);
                    textPaint.setLetterSpacing(bVar.X);
                    fDescent = bVar.f20520l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f3955e.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f3972t0;
                rect3.left = compoundPaddingLeft;
                if (this.f3964l0 != 1 || this.f3955e.getMinLines() > 1) {
                    if (this.f3964l0 != 0 || getHintMaxLines() == 1) {
                        i14 = 0;
                    } else {
                        textPaint.setTextSize(bVar.f20513h);
                        textPaint.setTypeface(bVar.f20530v);
                        textPaint.setLetterSpacing(bVar.X);
                        i14 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f3955e.getCompoundPaddingTop() + rect.top) - i14;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f3955e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f3964l0 != 1 || this.f3955e.getMinLines() > 1) ? rect.bottom - this.f3955e.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i22 = rect3.left;
                int i23 = rect3.top;
                int i24 = rect3.right;
                Rect rect4 = bVar.f20503c;
                if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom || true != bVar.f20519k0) {
                    rect4.set(i22, i23, i24, compoundPaddingBottom);
                    bVar.N = true;
                    bVar.f20519k0 = true;
                }
                bVar.j(false);
                if (!g() || this.O0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        EditText editText;
        super.onMeasure(i10, i11);
        boolean z2 = this.V0;
        q qVar = this.f3951c;
        if (!z2) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.V0 = true;
        }
        if (this.N != null && (editText = this.f3955e) != null) {
            this.N.setGravity(editText.getGravity());
            this.N.setPadding(this.f3955e.getCompoundPaddingLeft(), this.f3955e.getCompoundPaddingTop(), this.f3955e.getCompoundPaddingRight(), this.f3955e.getCompoundPaddingBottom());
        }
        qVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f3955e.getMeasuredWidth() - this.f3955e.getCompoundPaddingLeft()) - this.f3955e.getCompoundPaddingRight();
        b bVar = this.P0;
        TextPaint textPaint = bVar.P;
        textPaint.setTextSize(bVar.f20515i);
        textPaint.setTypeface(bVar.f20527s);
        textPaint.setLetterSpacing(bVar.W);
        float f11 = measuredWidth;
        bVar.f20516i0 = bVar.e(bVar.f20510f0, textPaint, bVar.B, (bVar.f20515i / bVar.f20513h) * f11, bVar.D).getHeight();
        textPaint.setTextSize(bVar.f20513h);
        textPaint.setTypeface(bVar.f20530v);
        textPaint.setLetterSpacing(bVar.X);
        bVar.f20517j0 = bVar.e(bVar.f20508e0, textPaint, bVar.B, f11, bVar.D).getHeight();
        EditText editText2 = this.f3955e;
        Rect rect = this.f3971s0;
        ze.c.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i12 = rectD.left;
        int i13 = rectD.top;
        int i14 = rectD.right;
        int i15 = rectD.bottom;
        Rect rect2 = bVar.f20505d;
        if (rect2.left != i12 || rect2.top != i13 || rect2.right != i14 || rect2.bottom != i15) {
            rect2.set(i12, i13, i14, i15);
            bVar.N = true;
        }
        v();
        a();
        if (this.f3955e == null) {
            return;
        }
        int i16 = bVar.f20517j0;
        if (i16 != -1) {
            f10 = i16;
        } else {
            TextPaint textPaint2 = bVar.P;
            textPaint2.setTextSize(bVar.f20513h);
            textPaint2.setTypeface(bVar.f20530v);
            textPaint2.setLetterSpacing(bVar.X);
            f10 = -textPaint2.ascent();
        }
        if (this.L != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.N.getPaint());
            textPaint3.setTextSize(this.N.getTextSize());
            textPaint3.setTypeface(this.N.getTypeface());
            textPaint3.setLetterSpacing(this.N.getLetterSpacing());
            ze.g gVar = new ze.g(this.L, textPaint3, measuredWidth);
            gVar.f20546k = getLayoutDirection() == 1;
            gVar.j = true;
            float lineSpacingExtra = this.N.getLineSpacingExtra();
            float lineSpacingMultiplier = this.N.getLineSpacingMultiplier();
            gVar.f20543g = lineSpacingExtra;
            gVar.f20544h = lineSpacingMultiplier;
            gVar.f20548m = new ac.h(this, 11);
            f = (this.f3964l0 == 1 ? bVar.f() + this.f3965m0 + this.f3953d : 0.0f) + gVar.a().getHeight();
        }
        float fMax = Math.max(f10, f);
        if (this.f3955e.getMeasuredHeight() < fMax) {
            this.f3955e.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof b0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b0 b0Var = (b0) parcelable;
        super.onRestoreInstanceState(b0Var.f9454a);
        setError(b0Var.f7897c);
        if (b0Var.f7898d) {
            post(new ah.d(this, 8));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z2 = i10 == 1;
        if (z2 != this.f3962j0) {
            ef.d dVar = this.f3961i0.f6022e;
            RectF rectF = this.f3973u0;
            float fA = dVar.a(rectF);
            float fA2 = this.f3961i0.f6023f.a(rectF);
            float fA3 = this.f3961i0.f6025h.a(rectF);
            float fA4 = this.f3961i0.f6024g.a(rectF);
            m mVar = this.f3961i0;
            a.a aVar = mVar.f6018a;
            a.a aVar2 = mVar.f6019b;
            a.a aVar3 = mVar.f6021d;
            a.a aVar4 = mVar.f6020c;
            ef.f fVar = new ef.f();
            ef.f fVar2 = new ef.f();
            ef.f fVar3 = new ef.f();
            ef.f fVar4 = new ef.f();
            ef.a aVar5 = new ef.a(fA2);
            ef.a aVar6 = new ef.a(fA);
            ef.a aVar7 = new ef.a(fA4);
            ef.a aVar8 = new ef.a(fA3);
            m mVar2 = new m();
            mVar2.f6018a = aVar2;
            mVar2.f6019b = aVar;
            mVar2.f6020c = aVar3;
            mVar2.f6021d = aVar4;
            mVar2.f6022e = aVar5;
            mVar2.f6023f = aVar6;
            mVar2.f6024g = aVar8;
            mVar2.f6025h = aVar7;
            mVar2.f6026i = fVar;
            mVar2.j = fVar2;
            mVar2.f6027k = fVar3;
            mVar2.f6028l = fVar4;
            this.f3962j0 = z2;
            setShapeAppearanceModel(mVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b0 b0Var = new b0(super.onSaveInstanceState());
        if (o()) {
            b0Var.f7897c = getError();
        }
        q qVar = this.f3951c;
        b0Var.f7898d = qVar.B != 0 && qVar.f7945z.f3913d;
        return b0Var;
    }

    public final void p(Editable editable) throws Resources.NotFoundException {
        ((b0.b) this.H).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.G;
        int i10 = this.F;
        if (i10 == -1) {
            this.I.setText(String.valueOf(length));
            this.I.setContentDescription(null);
            this.G = false;
        } else {
            this.G = length > i10;
            Context context = getContext();
            this.I.setContentDescription(context.getString(this.G ? com.anonlab.voidlauncher.R.string.character_counter_overflowed_content_description : com.anonlab.voidlauncher.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.F)));
            if (z2 != this.G) {
                q();
            }
            String str = r4.b.f13707b;
            r4.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? r4.b.f13710e : r4.b.f13709d;
            g0 g0Var = this.I;
            String string = getContext().getString(com.anonlab.voidlauncher.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.F));
            bVar.getClass();
            g6.b bVar2 = r4.f.f13717a;
            g0Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f3955e == null || z2 == this.G) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        g0 g0Var = this.I;
        if (g0Var != null) {
            n(g0Var, this.G ? this.J : this.K);
            if (!this.G && (colorStateList2 = this.S) != null) {
                this.I.setTextColor(colorStateList2);
            }
            if (!this.G || (colorStateList = this.T) == null) {
                return;
            }
            this.I.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.U
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130903311(0x7f03010f, float:1.7413436E38)
            android.util.TypedValue r1 = uk.c.N(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = i4.c.getColorStateList(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f3955e
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = h3.b.f(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.f3955e
            android.graphics.drawable.Drawable r1 = h3.b.f(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.o()
            if (r2 != 0) goto L49
            m.g0 r2 = r4.I
            if (r2 == 0) goto L4e
            boolean r2 = r4.G
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.V
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            r1.setTintList(r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():boolean");
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f3970r0 != i10) {
            this.f3970r0 = i10;
            this.I0 = i10;
            this.K0 = i10;
            this.L0 = i10;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(c.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.I0 = defaultColor;
        this.f3970r0 = defaultColor;
        this.J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.K0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.L0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i10) throws Resources.NotFoundException {
        if (i10 == this.f3964l0) {
            return;
        }
        this.f3964l0 = i10;
        if (this.f3955e != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f3965m0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        l lVarF = this.f3961i0.f();
        ef.d dVar = this.f3961i0.f6022e;
        lVarF.f6007a = cg.b.B(i10);
        lVarF.f6011e = dVar;
        ef.d dVar2 = this.f3961i0.f6023f;
        lVarF.f6008b = cg.b.B(i10);
        lVarF.f6012f = dVar2;
        ef.d dVar3 = this.f3961i0.f6025h;
        lVarF.f6010d = cg.b.B(i10);
        lVarF.f6014h = dVar3;
        ef.d dVar4 = this.f3961i0.f6024g;
        lVarF.f6009c = cg.b.B(i10);
        lVarF.f6013g = dVar4;
        this.f3961i0 = lVarF.a();
        c();
    }

    public void setBoxStrokeColor(int i10) throws Resources.NotFoundException {
        if (this.G0 != i10) {
            this.G0 = i10;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.E0 = colorStateList.getDefaultColor();
            this.M0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.F0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.G0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.G0 != colorStateList.getDefaultColor()) {
            this.G0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i10) throws Resources.NotFoundException {
        this.f3967o0 = i10;
        z();
    }

    public void setBoxStrokeWidthFocused(int i10) throws Resources.NotFoundException {
        this.f3968p0 = i10;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z2) throws Resources.NotFoundException {
        if (this.E != z2) {
            u uVar = this.D;
            if (z2) {
                g0 g0Var = new g0(getContext(), null);
                this.I = g0Var;
                g0Var.setId(com.anonlab.voidlauncher.R.id.textinput_counter);
                Typeface typeface = this.f3974v0;
                if (typeface != null) {
                    this.I.setTypeface(typeface);
                }
                this.I.setMaxLines(1);
                uVar.a(this.I, 2);
                ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.anonlab.voidlauncher.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.I != null) {
                    EditText editText = this.f3955e;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.I, 2);
                this.I = null;
            }
            this.E = z2;
        }
    }

    public void setCounterMaxLength(int i10) throws Resources.NotFoundException {
        if (this.F != i10) {
            if (i10 > 0) {
                this.F = i10;
            } else {
                this.F = -1;
            }
            if (!this.E || this.I == null) {
                return;
            }
            EditText editText = this.f3955e;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.J != i10) {
            this.J = i10;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.K != i10) {
            this.K = i10;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (o() || (this.I != null && this.G)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.C0 = colorStateList;
        this.D0 = colorStateList;
        if (this.f3955e != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        m(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f3951c.f7945z.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f3951c.f7945z.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i10) {
        q qVar = this.f3951c;
        CharSequence text = i10 != 0 ? qVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = qVar.f7945z;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        q qVar = this.f3951c;
        Drawable drawableG = i10 != 0 ? v.G(qVar.getContext(), i10) : null;
        TextInputLayout textInputLayout = qVar.f7939a;
        CheckableImageButton checkableImageButton = qVar.f7945z;
        checkableImageButton.setImageDrawable(drawableG);
        if (drawableG != null) {
            x8.a.i(textInputLayout, checkableImageButton, qVar.D, qVar.E);
            x8.a.U(textInputLayout, checkableImageButton, qVar.D);
        }
    }

    public void setEndIconMinSize(int i10) {
        q qVar = this.f3951c;
        if (i10 < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != qVar.F) {
            qVar.F = i10;
            CheckableImageButton checkableImageButton = qVar.f7945z;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = qVar.f7941c;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.f3951c.g(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f3951c;
        CheckableImageButton checkableImageButton = qVar.f7945z;
        View.OnLongClickListener onLongClickListener = qVar.H;
        checkableImageButton.setOnClickListener(onClickListener);
        x8.a.V(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f3951c;
        qVar.H = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f7945z;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        x8.a.V(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f3951c;
        qVar.G = scaleType;
        qVar.f7945z.setScaleType(scaleType);
        qVar.f7941c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f3951c;
        if (qVar.D != colorStateList) {
            qVar.D = colorStateList;
            x8.a.i(qVar.f7939a, qVar.f7945z, colorStateList, qVar.E);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f3951c;
        if (qVar.E != mode) {
            qVar.E = mode;
            x8.a.i(qVar.f7939a, qVar.f7945z, qVar.D, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f3951c.h(z2);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        u uVar = this.D;
        if (!uVar.f7971q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            uVar.f();
            return;
        }
        uVar.c();
        uVar.f7970p = charSequence;
        uVar.f7972r.setText(charSequence);
        int i10 = uVar.f7968n;
        if (i10 != 1) {
            uVar.f7969o = 1;
        }
        uVar.i(i10, uVar.f7969o, uVar.h(uVar.f7972r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        u uVar = this.D;
        uVar.f7974t = i10;
        g0 g0Var = uVar.f7972r;
        if (g0Var != null) {
            g0Var.setAccessibilityLiveRegion(i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.D;
        uVar.f7973s = charSequence;
        g0 g0Var = uVar.f7972r;
        if (g0Var != null) {
            g0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) throws Resources.NotFoundException {
        u uVar = this.D;
        TextInputLayout textInputLayout = uVar.f7963h;
        if (uVar.f7971q == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            g0 g0Var = new g0(uVar.f7962g, null);
            uVar.f7972r = g0Var;
            g0Var.setId(com.anonlab.voidlauncher.R.id.textinput_error);
            uVar.f7972r.setTextAlignment(5);
            Typeface typeface = uVar.B;
            if (typeface != null) {
                uVar.f7972r.setTypeface(typeface);
            }
            int i10 = uVar.f7975u;
            uVar.f7975u = i10;
            g0 g0Var2 = uVar.f7972r;
            if (g0Var2 != null) {
                uVar.f7963h.n(g0Var2, i10);
            }
            ColorStateList colorStateList = uVar.f7976v;
            uVar.f7976v = colorStateList;
            g0 g0Var3 = uVar.f7972r;
            if (g0Var3 != null && colorStateList != null) {
                g0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f7973s;
            uVar.f7973s = charSequence;
            g0 g0Var4 = uVar.f7972r;
            if (g0Var4 != null) {
                g0Var4.setContentDescription(charSequence);
            }
            int i11 = uVar.f7974t;
            uVar.f7974t = i11;
            g0 g0Var5 = uVar.f7972r;
            if (g0Var5 != null) {
                g0Var5.setAccessibilityLiveRegion(i11);
            }
            uVar.f7972r.setVisibility(4);
            uVar.a(uVar.f7972r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f7972r, 0);
            uVar.f7972r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        uVar.f7971q = z2;
    }

    public void setErrorIconDrawable(int i10) {
        q qVar = this.f3951c;
        qVar.i(i10 != 0 ? v.G(qVar.getContext(), i10) : null);
        x8.a.U(qVar.f7939a, qVar.f7941c, qVar.f7942d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f3951c;
        CheckableImageButton checkableImageButton = qVar.f7941c;
        View.OnLongClickListener onLongClickListener = qVar.f7944f;
        checkableImageButton.setOnClickListener(onClickListener);
        x8.a.V(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f3951c;
        qVar.f7944f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f7941c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        x8.a.V(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f3951c;
        if (qVar.f7942d != colorStateList) {
            qVar.f7942d = colorStateList;
            x8.a.i(qVar.f7939a, qVar.f7941c, colorStateList, qVar.f7943e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f3951c;
        if (qVar.f7943e != mode) {
            qVar.f7943e = mode;
            x8.a.i(qVar.f7939a, qVar.f7941c, qVar.f7942d, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        u uVar = this.D;
        uVar.f7975u = i10;
        g0 g0Var = uVar.f7972r;
        if (g0Var != null) {
            uVar.f7963h.n(g0Var, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.D;
        uVar.f7976v = colorStateList;
        g0 g0Var = uVar.f7972r;
        if (g0Var == null || colorStateList == null) {
            return;
        }
        g0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.Q0 != z2) {
            this.Q0 = z2;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.D;
        if (zIsEmpty) {
            if (uVar.f7978x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f7978x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f7977w = charSequence;
        uVar.f7979y.setText(charSequence);
        int i10 = uVar.f7968n;
        if (i10 != 2) {
            uVar.f7969o = 2;
        }
        uVar.i(i10, uVar.f7969o, uVar.h(uVar.f7979y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.D;
        uVar.A = colorStateList;
        g0 g0Var = uVar.f7979y;
        if (g0Var == null || colorStateList == null) {
            return;
        }
        g0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) throws Resources.NotFoundException {
        u uVar = this.D;
        TextInputLayout textInputLayout = uVar.f7963h;
        if (uVar.f7978x == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            g0 g0Var = new g0(uVar.f7962g, null);
            uVar.f7979y = g0Var;
            g0Var.setId(com.anonlab.voidlauncher.R.id.textinput_helper_text);
            uVar.f7979y.setTextAlignment(5);
            Typeface typeface = uVar.B;
            if (typeface != null) {
                uVar.f7979y.setTypeface(typeface);
            }
            uVar.f7979y.setVisibility(4);
            uVar.f7979y.setAccessibilityLiveRegion(1);
            int i10 = uVar.f7980z;
            uVar.f7980z = i10;
            g0 g0Var2 = uVar.f7979y;
            if (g0Var2 != null) {
                g0Var2.setTextAppearance(i10);
            }
            ColorStateList colorStateList = uVar.A;
            uVar.A = colorStateList;
            g0 g0Var3 = uVar.f7979y;
            if (g0Var3 != null && colorStateList != null) {
                g0Var3.setTextColor(colorStateList);
            }
            uVar.a(uVar.f7979y, 1);
            uVar.f7979y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i11 = uVar.f7968n;
            if (i11 == 2) {
                uVar.f7969o = 0;
            }
            uVar.i(i11, uVar.f7969o, uVar.h(uVar.f7979y, ""));
            uVar.g(uVar.f7979y, 1);
            uVar.f7979y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        uVar.f7978x = z2;
    }

    public void setHelperTextTextAppearance(int i10) {
        u uVar = this.D;
        uVar.f7980z = i10;
        g0 g0Var = uVar.f7979y;
        if (g0Var != null) {
            g0Var.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.W) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.R0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.W) {
            this.W = z2;
            if (z2) {
                CharSequence hint = this.f3955e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f3948a0)) {
                        setHint(hint);
                    }
                    this.f3955e.setHint((CharSequence) null);
                }
                this.f3950b0 = true;
            } else {
                this.f3950b0 = false;
                if (!TextUtils.isEmpty(this.f3948a0) && TextUtils.isEmpty(this.f3955e.getHint())) {
                    this.f3955e.setHint(this.f3948a0);
                }
                setHintInternal(null);
            }
            if (this.f3955e != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i10) {
        b bVar = this.P0;
        if (i10 != bVar.f20510f0) {
            bVar.f20510f0 = i10;
            bVar.j(false);
        }
        if (i10 != bVar.f20508e0) {
            bVar.f20508e0 = i10;
            bVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i10) {
        b bVar = this.P0;
        TextInputLayout textInputLayout = bVar.f20499a;
        bf.d dVar = new bf.d(textInputLayout.getContext(), i10);
        ColorStateList colorStateList = dVar.f1767k;
        if (colorStateList != null) {
            bVar.f20518k = colorStateList;
        }
        float f10 = dVar.f1768l;
        if (f10 != 0.0f) {
            bVar.f20515i = f10;
        }
        ColorStateList colorStateList2 = dVar.f1758a;
        if (colorStateList2 != null) {
            bVar.V = colorStateList2;
        }
        bVar.T = dVar.f1763f;
        bVar.U = dVar.f1764g;
        bVar.S = dVar.f1765h;
        bVar.W = dVar.j;
        bf.a aVar = bVar.f20534z;
        if (aVar != null) {
            aVar.f1751d = true;
        }
        w5.a0 a0Var = new w5.a0(bVar);
        dVar.a();
        bVar.f20534z = new bf.a(a0Var, dVar.f1772p);
        dVar.b(textInputLayout.getContext(), bVar.f20534z);
        bVar.j(false);
        this.D0 = bVar.f20518k;
        if (this.f3955e != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            if (this.C0 == null) {
                b bVar = this.P0;
                if (bVar.f20518k != colorStateList) {
                    bVar.f20518k = colorStateList;
                    bVar.j(false);
                }
            }
            this.D0 = colorStateList;
            if (this.f3955e != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(a0 a0Var) {
        this.H = a0Var;
    }

    public void setMaxEms(int i10) {
        this.A = i10;
        EditText editText = this.f3955e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.C = i10;
        EditText editText = this.f3955e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f3975z = i10;
        EditText editText = this.f3955e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.B = i10;
        EditText editText = this.f3955e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        q qVar = this.f3951c;
        qVar.f7945z.setContentDescription(i10 != 0 ? qVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        q qVar = this.f3951c;
        qVar.f7945z.setImageDrawable(i10 != 0 ? v.G(qVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.f3951c;
        if (z2 && qVar.B != 1) {
            qVar.g(1);
        } else if (z2) {
            qVar.getClass();
        } else {
            qVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        q qVar = this.f3951c;
        qVar.D = colorStateList;
        x8.a.i(qVar.f7939a, qVar.f7945z, colorStateList, qVar.E);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f3951c;
        qVar.E = mode;
        x8.a.i(qVar.f7939a, qVar.f7945z, qVar.D, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.N == null) {
            g0 g0Var = new g0(getContext(), null);
            this.N = g0Var;
            g0Var.setId(com.anonlab.voidlauncher.R.id.textinput_placeholder);
            this.N.setImportantForAccessibility(1);
            this.N.setAccessibilityLiveRegion(1);
            h hVarF = f();
            this.Q = hVarF;
            hVarF.f10063b = 67L;
            this.R = f();
            setPlaceholderTextAppearance(this.P);
            setPlaceholderTextColor(this.O);
            l0.l(this.N, new com.google.android.material.datepicker.g(3));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.M) {
                setPlaceholderTextEnabled(true);
            }
            this.L = charSequence;
        }
        EditText editText = this.f3955e;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.P = i10;
        g0 g0Var = this.N;
        if (g0Var != null) {
            g0Var.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            g0 g0Var = this.N;
            if (g0Var == null || colorStateList == null) {
                return;
            }
            g0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        w wVar = this.f3949b;
        wVar.getClass();
        wVar.f7986c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        wVar.f7985b.setText(charSequence);
        wVar.e();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f3949b.f7985b.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3949b.f7985b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(m mVar) {
        i iVar = this.f3952c0;
        if (iVar == null || iVar.f6000b.f5982a == mVar) {
            return;
        }
        this.f3961i0 = mVar;
        c();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f3949b.f7987d.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? v.G(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        w wVar = this.f3949b;
        if (i10 < 0) {
            wVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != wVar.f7990z) {
            wVar.f7990z = i10;
            CheckableImageButton checkableImageButton = wVar.f7987d;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        w wVar = this.f3949b;
        CheckableImageButton checkableImageButton = wVar.f7987d;
        View.OnLongClickListener onLongClickListener = wVar.B;
        checkableImageButton.setOnClickListener(onClickListener);
        x8.a.V(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        w wVar = this.f3949b;
        wVar.B = onLongClickListener;
        CheckableImageButton checkableImageButton = wVar.f7987d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        x8.a.V(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        w wVar = this.f3949b;
        wVar.A = scaleType;
        wVar.f7987d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        w wVar = this.f3949b;
        if (wVar.f7988e != colorStateList) {
            wVar.f7988e = colorStateList;
            x8.a.i(wVar.f7984a, wVar.f7987d, colorStateList, wVar.f7989f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        w wVar = this.f3949b;
        if (wVar.f7989f != mode) {
            wVar.f7989f = mode;
            x8.a.i(wVar.f7984a, wVar.f7987d, wVar.f7988e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f3949b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f3951c;
        qVar.getClass();
        qVar.I = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.J.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f3951c.J.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f3951c.J.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(z zVar) {
        EditText editText = this.f3955e;
        if (editText != null) {
            l0.l(editText, zVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f3974v0) {
            this.f3974v0 = typeface;
            this.P0.n(typeface);
            u uVar = this.D;
            if (typeface != uVar.B) {
                uVar.B = typeface;
                g0 g0Var = uVar.f7972r;
                if (g0Var != null) {
                    g0Var.setTypeface(typeface);
                }
                g0 g0Var2 = uVar.f7979y;
                if (g0Var2 != null) {
                    g0Var2.setTypeface(typeface);
                }
            }
            g0 g0Var3 = this.I;
            if (g0Var3 != null) {
                g0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        g0 g0Var;
        EditText editText = this.f3955e;
        if (editText == null || this.f3964l0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = n0.f11141a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(p.b(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.G && (g0Var = this.I) != null) {
            drawableMutate.setColorFilter(p.b(g0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f3955e.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f3955e;
        if (editText == null || this.f3952c0 == null) {
            return;
        }
        if ((this.f3958f0 || editText.getBackground() == null) && this.f3964l0 != 0) {
            this.f3955e.setBackground(getEditTextBoxBackground());
            this.f3958f0 = true;
        }
    }

    public final void v() {
        if (this.f3964l0 != 1) {
            FrameLayout frameLayout = this.f3947a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z2, boolean z10) {
        ColorStateList colorStateList;
        g0 g0Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f3955e;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f3955e;
        boolean z12 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.C0;
        b bVar = this.P0;
        if (colorStateList2 != null) {
            bVar.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.C0;
            bVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.M0) : this.M0));
        } else if (o()) {
            g0 g0Var2 = this.D.f7972r;
            bVar.k(g0Var2 != null ? g0Var2.getTextColors() : null);
        } else if (this.G && (g0Var = this.I) != null) {
            bVar.k(g0Var.getTextColors());
        } else if (z12 && (colorStateList = this.D0) != null && bVar.f20518k != colorStateList) {
            bVar.f20518k = colorStateList;
            bVar.j(false);
        }
        q qVar = this.f3951c;
        w wVar = this.f3949b;
        if (z11 || !this.Q0 || (isEnabled() && z12)) {
            if (z10 || this.O0) {
                ValueAnimator valueAnimator = this.S0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.S0.cancel();
                }
                if (z2 && this.R0) {
                    b(1.0f);
                } else {
                    bVar.m(1.0f);
                }
                this.O0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f3955e;
                x(editText3 != null ? editText3.getText() : null);
                wVar.C = false;
                wVar.e();
                qVar.K = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z10 || !this.O0) {
            ValueAnimator valueAnimator2 = this.S0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.S0.cancel();
            }
            if (z2 && this.R0) {
                b(0.0f);
            } else {
                bVar.m(0.0f);
            }
            if (g() && !((hf.g) this.f3952c0).Z.f7910r.isEmpty() && g()) {
                ((hf.g) this.f3952c0).t(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.O0 = true;
            g0 g0Var3 = this.N;
            if (g0Var3 != null && this.M) {
                g0Var3.setText((CharSequence) null);
                l7.t.a(this.f3947a, this.R);
                this.N.setVisibility(4);
            }
            wVar.C = true;
            wVar.e();
            qVar.K = true;
            qVar.n();
        }
    }

    public final void x(Editable editable) {
        ((b0.b) this.H).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f3947a;
        if (length != 0 || this.O0) {
            g0 g0Var = this.N;
            if (g0Var == null || !this.M) {
                return;
            }
            g0Var.setText((CharSequence) null);
            l7.t.a(frameLayout, this.R);
            this.N.setVisibility(4);
            return;
        }
        if (this.N == null || !this.M || TextUtils.isEmpty(this.L)) {
            return;
        }
        this.N.setText(this.L);
        l7.t.a(frameLayout, this.Q);
        this.N.setVisibility(0);
        this.N.bringToFront();
    }

    public final void y(boolean z2, boolean z10) {
        int defaultColor = this.H0.getDefaultColor();
        int colorForState = this.H0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.H0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f3969q0 = colorForState2;
        } else if (z10) {
            this.f3969q0 = colorForState;
        } else {
            this.f3969q0 = defaultColor;
        }
    }

    public final void z() throws Resources.NotFoundException {
        g0 g0Var;
        EditText editText;
        EditText editText2;
        if (this.f3952c0 == null || this.f3964l0 == 0) {
            return;
        }
        boolean z2 = false;
        boolean z10 = isFocused() || ((editText2 = this.f3955e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f3955e) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f3969q0 = this.M0;
        } else if (o()) {
            if (this.H0 != null) {
                y(z10, z2);
            } else {
                this.f3969q0 = getErrorCurrentTextColors();
            }
        } else if (!this.G || (g0Var = this.I) == null) {
            if (z10) {
                this.f3969q0 = this.G0;
            } else if (z2) {
                this.f3969q0 = this.F0;
            } else {
                this.f3969q0 = this.E0;
            }
        } else if (this.H0 != null) {
            y(z10, z2);
        } else {
            this.f3969q0 = g0Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        q qVar = this.f3951c;
        TextInputLayout textInputLayout = qVar.f7939a;
        CheckableImageButton checkableImageButton = qVar.f7945z;
        TextInputLayout textInputLayout2 = qVar.f7939a;
        qVar.l();
        x8.a.U(textInputLayout2, qVar.f7941c, qVar.f7942d);
        x8.a.U(textInputLayout2, checkableImageButton, qVar.D);
        if (qVar.b() instanceof hf.m) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                x8.a.i(textInputLayout, checkableImageButton, qVar.D, qVar.E);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        w wVar = this.f3949b;
        x8.a.U(wVar.f7984a, wVar.f7987d, wVar.f7988e);
        if (this.f3964l0 == 2) {
            int i10 = this.f3966n0;
            if (z10 && isEnabled()) {
                this.f3966n0 = this.f3968p0;
            } else {
                this.f3966n0 = this.f3967o0;
            }
            if (this.f3966n0 != i10 && g() && !this.O0) {
                if (g()) {
                    ((hf.g) this.f3952c0).t(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.f3964l0 == 1) {
            if (!isEnabled()) {
                this.f3970r0 = this.J0;
            } else if (z2 && !z10) {
                this.f3970r0 = this.L0;
            } else if (z10) {
                this.f3970r0 = this.K0;
            } else {
                this.f3970r0 = this.I0;
            }
        }
        c();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3949b.f7987d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f3949b.b(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3951c.f7945z.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3951c.f7945z.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f3951c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3951c.f7945z;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f3951c;
        TextInputLayout textInputLayout = qVar.f7939a;
        CheckableImageButton checkableImageButton = qVar.f7945z;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            x8.a.i(textInputLayout, checkableImageButton, qVar.D, qVar.E);
            x8.a.U(textInputLayout, checkableImageButton, qVar.D);
        }
    }
}
