package hf;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import m.g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f7956a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7957b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7958c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f7959d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f7960e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f7961f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f7962g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f7963h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f7964i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f7965k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f7966l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7967m;

    /* renamed from: n, reason: collision with root package name */
    public int f7968n;

    /* renamed from: o, reason: collision with root package name */
    public int f7969o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f7970p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7971q;

    /* renamed from: r, reason: collision with root package name */
    public g0 f7972r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f7973s;

    /* renamed from: t, reason: collision with root package name */
    public int f7974t;

    /* renamed from: u, reason: collision with root package name */
    public int f7975u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f7976v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f7977w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7978x;

    /* renamed from: y, reason: collision with root package name */
    public g0 f7979y;

    /* renamed from: z, reason: collision with root package name */
    public int f7980z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f7962g = context;
        this.f7963h = textInputLayout;
        this.f7967m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f7956a = yd.f.b0(context, R.attr.motionDurationShort4, 217);
        this.f7957b = yd.f.b0(context, R.attr.motionDurationMedium4, 167);
        this.f7958c = yd.f.b0(context, R.attr.motionDurationShort4, 167);
        this.f7959d = yd.f.c0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, ne.a.f12304d);
        LinearInterpolator linearInterpolator = ne.a.f12301a;
        this.f7960e = yd.f.c0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f7961f = yd.f.c0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(g0 g0Var, int i10) {
        if (this.f7964i == null && this.f7965k == null) {
            Context context = this.f7962g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f7964i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f7964i;
            TextInputLayout textInputLayout = this.f7963h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f7965k = new FrameLayout(context);
            this.f7964i.addView(this.f7965k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f7965k.setVisibility(0);
            this.f7965k.addView(g0Var);
        } else {
            this.f7964i.addView(g0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f7964i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.f7964i != null) {
            TextInputLayout textInputLayout = this.f7963h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f7962g;
                boolean zG = wd.a.G(context);
                LinearLayout linearLayout = this.f7964i;
                int paddingStart = editText.getPaddingStart();
                if (zG) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zG) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zG) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f7966l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, g0 g0Var, int i10, int i11, int i12) {
        if (g0Var == null || !z2) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            boolean z10 = i12 == i10;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(g0Var, (Property<g0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i13 = this.f7958c;
            objectAnimatorOfFloat.setDuration(z10 ? this.f7957b : i13);
            objectAnimatorOfFloat.setInterpolator(z10 ? this.f7960e : this.f7961f);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorOfFloat.setStartDelay(i13);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(g0Var, (Property<g0, Float>) View.TRANSLATION_Y, -this.f7967m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f7956a);
            objectAnimatorOfFloat2.setInterpolator(this.f7959d);
            objectAnimatorOfFloat2.setStartDelay(i13);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f7972r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f7979y;
    }

    public final void f() {
        this.f7970p = null;
        c();
        if (this.f7968n == 1) {
            if (!this.f7978x || TextUtils.isEmpty(this.f7977w)) {
                this.f7969o = 0;
            } else {
                this.f7969o = 2;
            }
        }
        i(this.f7968n, this.f7969o, h(this.f7972r, ""));
    }

    public final void g(g0 g0Var, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f7964i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f7965k) != null) {
            frameLayout.removeView(g0Var);
        } else {
            linearLayout.removeView(g0Var);
        }
        int i11 = this.j - 1;
        this.j = i11;
        LinearLayout linearLayout2 = this.f7964i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(g0 g0Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f7963h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f7969o == this.f7968n && g0Var != null && TextUtils.equals(g0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z2) {
        TextView textViewE;
        TextView textViewE2;
        u uVar = this;
        if (i10 == i11) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            uVar.f7966l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar.d(arrayList, uVar.f7978x, uVar.f7979y, 2, i10, i11);
            uVar.d(arrayList, uVar.f7971q, uVar.f7972r, 1, i10, i11);
            int size = arrayList.size();
            long jMax = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Animator animator = (Animator) arrayList.get(i12);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            s sVar = new s(this, i11, e(i10), i10, uVar.e(i11));
            uVar = this;
            animatorSet.addListener(sVar);
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewE2 = uVar.e(i11)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewE = e(i10)) != null) {
                textViewE.setVisibility(4);
                if (i10 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            uVar.f7968n = i11;
        }
        TextInputLayout textInputLayout = uVar.f7963h;
        textInputLayout.t();
        textInputLayout.w(z2, false);
        textInputLayout.z();
    }
}
