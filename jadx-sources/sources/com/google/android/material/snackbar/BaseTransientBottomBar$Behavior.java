package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import gf.c;
import gf.f;
import y9.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final a f3942h;

    public BaseTransientBottomBar$Behavior() {
        a aVar = new a();
        this.f3790e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f3791f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f3789d = 0;
        this.f3942h = aVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, f4.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f3942h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (f.f7405b == null) {
                    f.f7405b = new f();
                }
                synchronized (f.f7405b.f7406a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (f.f7405b == null) {
                f.f7405b = new f();
            }
            synchronized (f.f7405b.f7406a) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f3942h.getClass();
        return view instanceof c;
    }
}
