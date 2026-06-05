package w5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f18634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18635c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f18636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f18637e;

    public h(ViewGroup viewGroup, View view, boolean z2, s0 s0Var, i iVar) {
        this.f18633a = viewGroup;
        this.f18634b = view;
        this.f18635c = z2;
        this.f18636d = s0Var;
        this.f18637e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fj.l.f(animator, "anim");
        ViewGroup viewGroup = this.f18633a;
        View view = this.f18634b;
        viewGroup.endViewTransition(view);
        boolean z2 = this.f18635c;
        s0 s0Var = this.f18636d;
        if (z2 || s0Var.f18741a == 3) {
            int i10 = s0Var.f18741a;
            fj.l.e(view, "viewToAnimate");
            m1.a(i10, view, viewGroup);
        }
        i iVar = this.f18637e;
        ((s0) iVar.f18639c.f6149a).c(iVar);
        if (i0.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + s0Var + " has ended.");
        }
    }
}
