package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f4.a;
import l5.e;
import pe.c;
import t4.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public e f3786a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3787b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3788c;

    /* renamed from: d, reason: collision with root package name */
    public int f3789d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f3790e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f3791f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final c f3792g = new c(this);

    @Override // f4.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f3787b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3787b = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3787b = false;
        }
        if (zO) {
            if (this.f3786a == null) {
                this.f3786a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f3792g);
            }
            if (!this.f3788c && this.f3786a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // f4.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            l0.i(view, 1048576);
            l0.g(view, 0);
            if (r(view)) {
                l0.j(view, u4.c.f16606l, new d8.e(this));
            }
        }
        return false;
    }

    @Override // f4.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f3786a == null) {
            return false;
        }
        if (this.f3788c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f3786a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
