package hf;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.anonlab.voidlauncher.R;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f7901e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7902f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f7903g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f7904h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f7905i;
    public final com.google.android.material.datepicker.n j;

    /* renamed from: k, reason: collision with root package name */
    public final a f7906k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f7907l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f7908m;

    public d(q qVar) {
        super(qVar);
        this.j = new com.google.android.material.datepicker.n(this, 1);
        this.f7906k = new a(this, 0);
        this.f7901e = yd.f.b0(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f7902f = yd.f.b0(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f7903g = yd.f.c0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, ne.a.f12301a);
        this.f7904h = yd.f.c0(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, ne.a.f12304d);
    }

    @Override // hf.r
    public final void a() {
        if (this.f7947b.I != null) {
            return;
        }
        s(t());
    }

    @Override // hf.r
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // hf.r
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // hf.r
    public final View.OnFocusChangeListener e() {
        return this.f7906k;
    }

    @Override // hf.r
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // hf.r
    public final View.OnFocusChangeListener g() {
        return this.f7906k;
    }

    @Override // hf.r
    public final void l(EditText editText) {
        this.f7905i = editText;
        this.f7946a.setEndIconVisible(t());
    }

    @Override // hf.r
    public final void o(boolean z2) {
        if (this.f7947b.I == null) {
            return;
        }
        s(z2);
    }

    @Override // hf.r
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f7904h);
        valueAnimatorOfFloat.setDuration(this.f7902f);
        final int i10 = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: hf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f7896b;

            {
                this.f7896b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        d dVar = this.f7896b;
                        dVar.getClass();
                        dVar.f7949d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f7896b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f7949d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f7903g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f7901e;
        valueAnimatorOfFloat2.setDuration(i11);
        final int i12 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: hf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f7896b;

            {
                this.f7896b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        d dVar = this.f7896b;
                        dVar.getClass();
                        dVar.f7949d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f7896b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f7949d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7907l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f7907l.addListener(new c(this, i12));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i11);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: hf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f7896b;

            {
                this.f7896b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        d dVar = this.f7896b;
                        dVar.getClass();
                        dVar.f7949d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f7896b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f7949d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f7908m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, i10));
    }

    @Override // hf.r
    public final void r() {
        EditText editText = this.f7905i;
        if (editText != null) {
            editText.post(new ac.o(this, 10));
        }
    }

    public final void s(boolean z2) {
        boolean z10 = this.f7947b.d() == z2;
        if (z2 && !this.f7907l.isRunning()) {
            this.f7908m.cancel();
            this.f7907l.start();
            if (z10) {
                this.f7907l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f7907l.cancel();
        this.f7908m.start();
        if (z10) {
            this.f7908m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.f7905i;
        if (editText != null) {
            return (editText.hasFocus() || this.f7949d.hasFocus()) && this.f7905i.getText().length() > 0;
        }
        return false;
    }
}
