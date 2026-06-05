package l7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import t4.q0;
import t4.v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10045a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10047c;

    public i(View view, v0 v0Var) {
        this.f10046b = v0Var;
        this.f10047c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10045a) {
            case 0:
                ((q.e) this.f10046b).remove(animator);
                ((p) this.f10047c).G.remove(animator);
                break;
            default:
                v0 v0Var = (v0) this.f10046b;
                v0Var.f15784a.e(1.0f);
                q0.f((View) this.f10047c, v0Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f10045a) {
            case 0:
                ((p) this.f10047c).G.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public i(p pVar, q.e eVar) {
        this.f10047c = pVar;
        this.f10046b = eVar;
    }
}
