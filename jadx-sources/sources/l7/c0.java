package l7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.anonlab.voidlauncher.R;
import t4.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f10022a;

    /* renamed from: b, reason: collision with root package name */
    public final View f10023b;

    /* renamed from: c, reason: collision with root package name */
    public final View f10024c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10025d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f10026e;

    public c0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f10026e = hVar;
        this.f10022a = viewGroup;
        this.f10023b = view;
        this.f10024c = view2;
    }

    @Override // l7.m
    public final void b(p pVar) {
        if (this.f10025d) {
            g();
        }
    }

    @Override // l7.m
    public final void f(p pVar) {
        pVar.z(this);
    }

    public final void g() {
        this.f10024c.setTag(R.id.save_overlay_view, null);
        this.f10022a.getOverlay().remove(this.f10023b);
        this.f10025d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f10022a.getOverlay().remove(this.f10023b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f10023b;
        if (view.getParent() == null) {
            l0.a(this.f10022a, view);
        } else {
            this.f10026e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f10024c;
            View view2 = this.f10023b;
            view.setTag(R.id.save_overlay_view, view2);
            l0.a(this.f10022a, view2);
            this.f10025d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        g();
    }

    @Override // l7.m
    public final void a() {
    }

    @Override // l7.m
    public final void e() {
    }

    @Override // l7.m
    public final void c(p pVar) {
    }
}
