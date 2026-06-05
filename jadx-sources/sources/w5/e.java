package w5;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f18621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f18623c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f18624d;

    public e(s0 s0Var, ViewGroup viewGroup, View view, f fVar) {
        this.f18621a = s0Var;
        this.f18622b = viewGroup;
        this.f18623c = view;
        this.f18624d = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        fj.l.f(animation, "animation");
        ViewGroup viewGroup = this.f18622b;
        viewGroup.post(new p0.g(viewGroup, this.f18623c, this.f18624d, 2));
        if (i0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f18621a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        fj.l.f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        fj.l.f(animation, "animation");
        if (i0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f18621a + " has reached onAnimationStart.");
        }
    }
}
