package hf;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anonlab.voidlauncher.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import m.g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class w extends LinearLayout {
    public ImageView.ScaleType A;
    public View.OnLongClickListener B;
    public boolean C;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f7984a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f7985b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f7986c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f7987d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f7988e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f7989f;

    /* renamed from: z, reason: collision with root package name */
    public int f7990z;

    public w(TextInputLayout textInputLayout, ac.d dVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f7984a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f7987d = checkableImageButton;
        g0 g0Var = new g0(getContext(), null);
        this.f7985b = g0Var;
        if (wd.a.G(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.B;
        checkableImageButton.setOnClickListener(null);
        x8.a.V(checkableImageButton, onLongClickListener);
        this.B = null;
        checkableImageButton.setOnLongClickListener(null);
        x8.a.V(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) dVar.f374c;
        if (typedArray.hasValue(70)) {
            this.f7988e = wd.a.y(getContext(), dVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f7989f = ze.k.f(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(dVar.l(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f7990z) {
            this.f7990z = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeQ = x8.a.q(typedArray.getInt(69, -1));
            this.A = scaleTypeQ;
            checkableImageButton.setScaleType(scaleTypeQ);
        }
        g0Var.setVisibility(8);
        g0Var.setId(R.id.textinput_prefix_text);
        g0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        g0Var.setAccessibilityLiveRegion(1);
        g0Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            g0Var.setTextColor(dVar.i(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.f7986c = TextUtils.isEmpty(text2) ? null : text2;
        g0Var.setText(text2);
        e();
        addView(checkableImageButton);
        addView(g0Var);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f7987d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f7985b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f7987d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f7988e;
            PorterDuff.Mode mode = this.f7989f;
            TextInputLayout textInputLayout = this.f7984a;
            x8.a.i(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            x8.a.U(textInputLayout, checkableImageButton, this.f7988e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.B;
        checkableImageButton.setOnClickListener(null);
        x8.a.V(checkableImageButton, onLongClickListener);
        this.B = null;
        checkableImageButton.setOnLongClickListener(null);
        x8.a.V(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z2) {
        CheckableImageButton checkableImageButton = this.f7987d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f7984a.f3955e;
        if (editText == null) {
            return;
        }
        this.f7985b.setPaddingRelative(this.f7987d.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i10 = (this.f7986c == null || this.C) ? 8 : 0;
        setVisibility((this.f7987d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f7985b.setVisibility(i10);
        this.f7984a.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
