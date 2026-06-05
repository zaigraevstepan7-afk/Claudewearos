package l7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f10043a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10044b = false;

    public g(View view) {
        this.f10043a = view;
    }

    @Override // l7.m
    public final void a() {
        View view = this.f10043a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? x.f10082a.y(view) : 0.0f));
    }

    @Override // l7.m
    public final void e() {
        this.f10043a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        x.f10082a.M(this.f10043a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f10043a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f10044b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z10 = this.f10044b;
        View view = this.f10043a;
        if (z10) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        z zVar = x.f10082a;
        zVar.M(view, 1.0f);
        zVar.getClass();
    }

    @Override // l7.m
    public final void b(p pVar) {
    }

    @Override // l7.m
    public final void c(p pVar) {
    }

    @Override // l7.m
    public final void d(p pVar) {
    }

    @Override // l7.m
    public final void f(p pVar) {
    }
}
