package t4;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f15753a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f15754b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f15755c;

    public o(View view, Runnable runnable) {
        this.f15753a = view;
        this.f15754b = view.getViewTreeObserver();
        this.f15755c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        o oVar = new o(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(oVar);
        view.addOnAttachStateChangeListener(oVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f15754b.isAlive();
        View view = this.f15753a;
        if (zIsAlive) {
            this.f15754b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f15755c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f15754b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f15754b.isAlive();
        View view2 = this.f15753a;
        if (zIsAlive) {
            this.f15754b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
