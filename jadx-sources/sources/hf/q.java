package hf;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anonlab.voidlauncher.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class q extends LinearLayout {
    public final p A;
    public int B;
    public final LinkedHashSet C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public int F;
    public ImageView.ScaleType G;
    public View.OnLongClickListener H;
    public CharSequence I;
    public final g0 J;
    public boolean K;
    public EditText L;
    public final AccessibilityManager M;
    public AccessibilityManager.TouchExplorationStateChangeListener N;
    public final n O;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f7939a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f7940b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f7941c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f7942d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f7943e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f7944f;

    /* renamed from: z, reason: collision with root package name */
    public final CheckableImageButton f7945z;

    public q(TextInputLayout textInputLayout, ac.d dVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.B = 0;
        this.C = new LinkedHashSet();
        this.O = new n(this);
        o oVar = new o(this);
        this.M = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f7939a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f7940b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f7941c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f7945z = checkableImageButtonA2;
        this.A = new p(this, dVar);
        g0 g0Var = new g0(getContext(), null);
        this.J = g0Var;
        TypedArray typedArray = (TypedArray) dVar.f374c;
        if (typedArray.hasValue(38)) {
            this.f7942d = wd.a.y(getContext(), dVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f7943e = ze.k.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(dVar.l(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.D = wd.a.y(getContext(), dVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.E = ze.k.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.D = wd.a.y(getContext(), dVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.E = ze.k.f(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.F) {
            this.F = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeQ = x8.a.q(typedArray.getInt(31, -1));
            this.G = scaleTypeQ;
            checkableImageButtonA2.setScaleType(scaleTypeQ);
            checkableImageButtonA.setScaleType(scaleTypeQ);
        }
        g0Var.setVisibility(8);
        g0Var.setId(R.id.textinput_suffix_text);
        g0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        g0Var.setAccessibilityLiveRegion(1);
        g0Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            g0Var.setTextColor(dVar.i(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.I = TextUtils.isEmpty(text3) ? null : text3;
        g0Var.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(g0Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.y0.add(oVar);
        if (textInputLayout.f3955e != null) {
            oVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new c2.e(this, 1));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (wd.a.G(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final r b() {
        r eVar;
        int i10 = this.B;
        p pVar = this.A;
        SparseArray sparseArray = (SparseArray) pVar.f7937d;
        r rVar = (r) sparseArray.get(i10);
        if (rVar != null) {
            return rVar;
        }
        q qVar = (q) pVar.f7938e;
        if (i10 == -1) {
            eVar = new e(qVar, 0);
        } else if (i10 == 0) {
            eVar = new e(qVar, 1);
        } else if (i10 == 1) {
            eVar = new v(qVar, pVar.f7936c);
        } else if (i10 == 2) {
            eVar = new d(qVar);
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(m6.a.d(i10, "Invalid end icon mode: "));
            }
            eVar = new m(qVar);
        }
        sparseArray.append(i10, eVar);
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f7945z;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.J.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f7940b.getVisibility() == 0 && this.f7945z.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f7941c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z10;
        boolean zIsActivated;
        boolean z11;
        r rVarB = b();
        boolean zJ = rVarB.j();
        CheckableImageButton checkableImageButton = this.f7945z;
        boolean z12 = true;
        if (!zJ || (z11 = checkableImageButton.f3913d) == rVarB.k()) {
            z10 = false;
        } else {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        }
        if (!(rVarB instanceof m) || (zIsActivated = checkableImageButton.isActivated()) == ((m) rVarB).f7925l) {
            z12 = z10;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z2 || z12) {
            x8.a.U(this.f7939a, checkableImageButton, this.D);
        }
    }

    public final void g(int i10) {
        if (this.B == i10) {
            return;
        }
        r rVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.N;
        AccessibilityManager accessibilityManager = this.M;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.N = null;
        rVarB.r();
        this.B = i10;
        Iterator it = this.C.iterator();
        if (it.hasNext()) {
            throw gk.b.k(it);
        }
        h(i10 != 0);
        r rVarB2 = b();
        int iD = this.A.f7935b;
        if (iD == 0) {
            iD = rVarB2.d();
        }
        Drawable drawableG = iD != 0 ? u6.v.G(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f7945z;
        checkableImageButton.setImageDrawable(drawableG);
        TextInputLayout textInputLayout = this.f7939a;
        if (drawableG != null) {
            x8.a.i(textInputLayout, checkableImageButton, this.D, this.E);
            x8.a.U(textInputLayout, checkableImageButton, this.D);
        }
        int iC = rVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(rVarB2.j());
        if (!rVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        rVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = rVarB2.h();
        this.N = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.N);
        }
        View.OnClickListener onClickListenerF = rVarB2.f();
        View.OnLongClickListener onLongClickListener = this.H;
        checkableImageButton.setOnClickListener(onClickListenerF);
        x8.a.V(checkableImageButton, onLongClickListener);
        EditText editText = this.L;
        if (editText != null) {
            rVarB2.l(editText);
            j(rVarB2);
        }
        x8.a.i(textInputLayout, checkableImageButton, this.D, this.E);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f7945z.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f7939a.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f7941c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        x8.a.i(this.f7939a, checkableImageButton, this.f7942d, this.f7943e);
    }

    public final void j(r rVar) {
        if (this.L == null) {
            return;
        }
        if (rVar.e() != null) {
            this.L.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f7945z.setOnFocusChangeListener(rVar.g());
        }
    }

    public final void k() {
        this.f7940b.setVisibility((this.f7945z.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.I == null || this.K) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f7941c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f7939a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.D.f7971q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.B != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f7939a;
        if (textInputLayout.f3955e == null) {
            return;
        }
        this.J.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f3955e.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f3955e.getPaddingEnd(), textInputLayout.f3955e.getPaddingBottom());
    }

    public final void n() {
        g0 g0Var = this.J;
        int visibility = g0Var.getVisibility();
        int i10 = (this.I == null || this.K) ? 8 : 0;
        if (visibility != i10) {
            b().o(i10 == 0);
        }
        k();
        g0Var.setVisibility(i10);
        this.f7939a.s();
    }
}
