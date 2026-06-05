package t6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f15854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f15856c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f15858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f15859f;

    public d(h hVar, t0 t0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f15859f = hVar;
        this.f15854a = t0Var;
        this.f15855b = i10;
        this.f15856c = view;
        this.f15857d = i11;
        this.f15858e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f15855b;
        View view = this.f15856c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f15857d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15858e.setListener(null);
        h hVar = this.f15859f;
        t0 t0Var = this.f15854a;
        hVar.c(t0Var);
        hVar.f15911p.remove(t0Var);
        hVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f15859f.getClass();
    }
}
