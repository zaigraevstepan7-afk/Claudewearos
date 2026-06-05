package w5;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f18780a;

    /* renamed from: b, reason: collision with root package name */
    public final View f18781b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18782c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18783d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18784e;

    public x(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f18784e = true;
        this.f18780a = viewGroup;
        this.f18781b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f18784e = true;
        if (this.f18782c) {
            return !this.f18783d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f18782c = true;
            t4.o.a(this.f18780a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f18782c;
        ViewGroup viewGroup = this.f18780a;
        if (z2 || !this.f18784e) {
            viewGroup.endViewTransition(this.f18781b);
            this.f18783d = true;
        } else {
            this.f18784e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f10) {
        this.f18784e = true;
        if (this.f18782c) {
            return !this.f18783d;
        }
        if (!super.getTransformation(j, transformation, f10)) {
            this.f18782c = true;
            t4.o.a(this.f18780a, this);
        }
        return true;
    }
}
