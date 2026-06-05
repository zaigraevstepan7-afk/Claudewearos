package hf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f7900b;

    public /* synthetic */ c(d dVar, int i10) {
        this.f7899a = i10;
        this.f7900b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f7899a) {
            case 1:
                this.f7900b.f7947b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f7899a) {
            case 0:
                this.f7900b.f7947b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
