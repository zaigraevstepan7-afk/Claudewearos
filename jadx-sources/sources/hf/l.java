package hf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7918b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f7917a = i10;
        this.f7918b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f7917a) {
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f7918b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.B = false;
                break;
            case 3:
                pc.o oVar = (pc.o) this.f7918b;
                oVar.setEnabled(true);
                oVar.f12863a.setEnabled(true);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7917a) {
            case 0:
                m mVar = (m) this.f7918b;
                mVar.p();
                mVar.f7931r.start();
                break;
            case 1:
                ((l7.p) this.f7918b).m();
                animator.removeListener(this);
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f7918b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.B = false;
                break;
            case 3:
                pc.o oVar = (pc.o) this.f7918b;
                oVar.setEnabled(true);
                oVar.f12863a.setEnabled(true);
                break;
            case 4:
                ((HideBottomViewOnScrollBehavior) this.f7918b).f3775k = null;
                break;
            default:
                ((HideViewOnScrollBehavior) this.f7918b).f3785k = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f7917a) {
            case 3:
                pc.o oVar = (pc.o) this.f7918b;
                oVar.setEnabled(false);
                oVar.f12863a.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
