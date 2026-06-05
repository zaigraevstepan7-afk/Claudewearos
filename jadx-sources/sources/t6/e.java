package t6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f15866c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f15867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f15868e;

    public /* synthetic */ e(h hVar, f fVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f15864a = i10;
        this.f15868e = hVar;
        this.f15865b = fVar;
        this.f15866c = viewPropertyAnimator;
        this.f15867d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15864a) {
            case 0:
                this.f15866c.setListener(null);
                View view = this.f15867d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                f fVar = this.f15865b;
                t0 t0Var = fVar.f15887a;
                h hVar = this.f15868e;
                hVar.c(t0Var);
                hVar.f15913r.remove(fVar.f15887a);
                hVar.i();
                break;
            default:
                this.f15866c.setListener(null);
                View view2 = this.f15867d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                f fVar2 = this.f15865b;
                t0 t0Var2 = fVar2.f15888b;
                h hVar2 = this.f15868e;
                hVar2.c(t0Var2);
                hVar2.f15913r.remove(fVar2.f15888b);
                hVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f15864a) {
            case 0:
                t0 t0Var = this.f15865b.f15887a;
                this.f15868e.getClass();
                break;
            default:
                t0 t0Var2 = this.f15865b.f15888b;
                this.f15868e.getClass();
                break;
        }
    }
}
