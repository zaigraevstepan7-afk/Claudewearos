package t6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15844a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f15845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f15846c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f15847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f15848e;

    public c(h hVar, t0 t0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f15848e = hVar;
        this.f15845b = t0Var;
        this.f15847d = viewPropertyAnimator;
        this.f15846c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f15844a) {
            case 1:
                this.f15846c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15844a) {
            case 0:
                this.f15847d.setListener(null);
                this.f15846c.setAlpha(1.0f);
                h hVar = this.f15848e;
                t0 t0Var = this.f15845b;
                hVar.c(t0Var);
                hVar.f15912q.remove(t0Var);
                hVar.i();
                break;
            default:
                this.f15847d.setListener(null);
                h hVar2 = this.f15848e;
                t0 t0Var2 = this.f15845b;
                hVar2.c(t0Var2);
                hVar2.f15910o.remove(t0Var2);
                hVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f15844a) {
            case 0:
                this.f15848e.getClass();
                break;
            default:
                this.f15848e.getClass();
                break;
        }
    }

    public c(h hVar, t0 t0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f15848e = hVar;
        this.f15845b = t0Var;
        this.f15846c = view;
        this.f15847d = viewPropertyAnimator;
    }
}
