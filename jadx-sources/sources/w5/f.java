package w5;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final g f18627c;

    public f(g gVar) {
        this.f18627c = gVar;
    }

    @Override // w5.r0
    public final void a(ViewGroup viewGroup) {
        fj.l.f(viewGroup, "container");
        g gVar = this.f18627c;
        s0 s0Var = (s0) gVar.f6149a;
        View view = s0Var.f18743c.Z;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((s0) gVar.f6149a).c(this);
        if (i0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + s0Var + " has been cancelled.");
        }
    }

    @Override // w5.r0
    public final void b(ViewGroup viewGroup) {
        fj.l.f(viewGroup, "container");
        g gVar = this.f18627c;
        s0 s0Var = (s0) gVar.f6149a;
        if (gVar.k()) {
            s0Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = s0Var.f18743c.Z;
        fj.l.e(context, "context");
        q5.b bVarT = gVar.t(context);
        if (bVarT == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) bVarT.f13235b;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (s0Var.f18741a != 1) {
            view.startAnimation(animation);
            s0Var.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        x xVar = new x(animation, viewGroup, view);
        xVar.setAnimationListener(new e(s0Var, viewGroup, view, this));
        view.startAnimation(xVar);
        if (i0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + s0Var + " has started.");
        }
    }
}
