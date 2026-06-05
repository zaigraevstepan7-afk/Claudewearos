package gf;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anonlab.voidlauncher.R;
import ef.i;
import ef.m;
import ze.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class c extends FrameLayout {
    public static final b B = new b();
    public PorterDuff.Mode A;

    /* renamed from: a, reason: collision with root package name */
    public final m f7395a;

    /* renamed from: b, reason: collision with root package name */
    public int f7396b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7397c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7398d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7399e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7400f;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f7401z;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(jf.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, me.a.f11663w);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f7396b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f7395a = m.b(context2, attributeSet, 0, 0).a();
        }
        this.f7397c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(wd.a.z(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(k.f(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f7398d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f7399e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f7400f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(B);
        setFocusable(true);
        if (getBackground() == null) {
            int iM = u2.b.m(getBackgroundOverlayColorAlpha(), u2.b.j(this, R.attr.colorSurface), u2.b.j(this, R.attr.colorOnSurface));
            m mVar = this.f7395a;
            if (mVar != null) {
                int i10 = d.f7402a;
                i iVar = new i(mVar);
                iVar.n(ColorStateList.valueOf(iM));
                gradientDrawable = iVar;
            } else {
                Resources resources = getResources();
                int i11 = d.f7402a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iM);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f7401z;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f7398d;
    }

    public int getAnimationMode() {
        return this.f7396b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f7397c;
    }

    public int getMaxInlineActionWidth() {
        return this.f7400f;
    }

    public int getMaxWidth() {
        return this.f7399e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        super.onLayout(z2, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f7399e;
        if (i12 <= 0 || getMeasuredWidth() <= i12) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
    }

    public void setAnimationMode(int i10) {
        this.f7396b = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f7401z != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f7401z);
            drawable.setTintMode(this.A);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f7401z = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.A);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.A = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : B);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
