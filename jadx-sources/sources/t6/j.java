package t6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15919a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f15920b;

    public j(k kVar) {
        this.f15920b = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f15919a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f15919a) {
            this.f15919a = false;
            return;
        }
        k kVar = this.f15920b;
        if (((Float) kVar.f15947z.getAnimatedValue()).floatValue() == 0.0f) {
            kVar.A = 0;
            kVar.f(0);
        } else {
            kVar.A = 2;
            kVar.f15940s.invalidate();
        }
    }
}
