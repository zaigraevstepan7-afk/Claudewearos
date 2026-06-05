package l7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f10016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10017b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f10018c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10020e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10021f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10019d = true;

    public b0(View view, int i10) {
        this.f10016a = view;
        this.f10017b = i10;
        this.f10018c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // l7.m
    public final void a() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        g(false);
        if (this.f10021f) {
            return;
        }
        x.b(this.f10016a, this.f10017b);
    }

    @Override // l7.m
    public final void e() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        g(true);
        if (this.f10021f) {
            return;
        }
        x.b(this.f10016a, 0);
    }

    @Override // l7.m
    public final void f(p pVar) {
        pVar.z(this);
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f10019d || this.f10020e == z2 || (viewGroup = this.f10018c) == null) {
            return;
        }
        this.f10020e = z2;
        cg.b.P(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f10021f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f10021f) {
            x.b(this.f10016a, this.f10017b);
            ViewGroup viewGroup = this.f10018c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z2) {
            x.b(this.f10016a, 0);
            ViewGroup viewGroup = this.f10018c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z2) {
            return;
        }
        if (!this.f10021f) {
            x.b(this.f10016a, this.f10017b);
            ViewGroup viewGroup = this.f10018c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // l7.m
    public final void b(p pVar) {
    }

    @Override // l7.m
    public final void c(p pVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
