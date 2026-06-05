package w5;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final g f18639c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f18640d;

    public i(g gVar) {
        this.f18639c = gVar;
    }

    @Override // w5.r0
    public final void a(ViewGroup viewGroup) {
        fj.l.f(viewGroup, "container");
        AnimatorSet animatorSet = this.f18640d;
        g gVar = this.f18639c;
        if (animatorSet == null) {
            ((s0) gVar.f6149a).c(this);
            return;
        }
        s0 s0Var = (s0) gVar.f6149a;
        if (s0Var.f18747g) {
            k.f18674a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (i0.J(2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(s0Var);
            sb2.append(" has been canceled");
            sb2.append(s0Var.f18747g ? " with seeking." : ".");
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override // w5.r0
    public final void b(ViewGroup viewGroup) {
        fj.l.f(viewGroup, "container");
        s0 s0Var = (s0) this.f18639c.f6149a;
        AnimatorSet animatorSet = this.f18640d;
        if (animatorSet == null) {
            s0Var.c(this);
            return;
        }
        animatorSet.start();
        if (i0.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + s0Var + " has started.");
        }
    }

    @Override // w5.r0
    public final void c(c.a aVar, ViewGroup viewGroup) {
        fj.l.f(viewGroup, "container");
        s0 s0Var = (s0) this.f18639c.f6149a;
        AnimatorSet animatorSet = this.f18640d;
        if (animatorSet == null) {
            s0Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !s0Var.f18743c.F) {
            return;
        }
        if (i0.J(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + s0Var);
        }
        long jA = j.f18666a.a(animatorSet);
        long j = (long) (aVar.f1797c * jA);
        if (j == 0) {
            j = 1;
        }
        if (j == jA) {
            j = jA - 1;
        }
        if (i0.J(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + s0Var);
        }
        k.f18674a.b(animatorSet, j);
    }

    @Override // w5.r0
    public final void d(ViewGroup viewGroup) {
        i iVar;
        fj.l.f(viewGroup, "container");
        g gVar = this.f18639c;
        if (gVar.k()) {
            return;
        }
        Context context = viewGroup.getContext();
        fj.l.e(context, "context");
        q5.b bVarT = gVar.t(context);
        this.f18640d = bVarT != null ? (AnimatorSet) bVarT.f13236c : null;
        s0 s0Var = (s0) gVar.f6149a;
        t tVar = s0Var.f18743c;
        boolean z2 = s0Var.f18741a == 3;
        View view = tVar.Z;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f18640d;
        if (animatorSet != null) {
            iVar = this;
            animatorSet.addListener(new h(viewGroup, view, z2, s0Var, iVar));
        } else {
            iVar = this;
        }
        AnimatorSet animatorSet2 = iVar.f18640d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
