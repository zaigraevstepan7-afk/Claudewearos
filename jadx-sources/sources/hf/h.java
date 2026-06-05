package hf;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7913b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f7912a = i10;
        this.f7913b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7912a) {
            case 0:
                m mVar = (m) this.f7913b;
                mVar.getClass();
                mVar.f7949d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                sa.x xVar = (sa.x) this.f7913b;
                fj.l.f(valueAnimator, "animator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                fj.l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                xVar.W0 = ((Float) animatedValue).floatValue();
                xVar.invalidate();
                break;
        }
    }
}
