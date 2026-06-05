package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c2.e;
import com.anonlab.voidlauncher.R;
import f4.a;
import f4.d;
import gk.b;
import hf.l;
import i4.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public a.a f3776a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f3777b;

    /* renamed from: c, reason: collision with root package name */
    public pe.a f3778c;

    /* renamed from: e, reason: collision with root package name */
    public int f3780e;

    /* renamed from: f, reason: collision with root package name */
    public int f3781f;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f3782g;

    /* renamed from: h, reason: collision with root package name */
    public TimeInterpolator f3783h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f3785k;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f3779d = new LinkedHashSet();

    /* renamed from: i, reason: collision with root package name */
    public int f3784i = 0;
    public int j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // f4.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (this.f3777b == null) {
            this.f3777b = (AccessibilityManager) c.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f3777b;
        if (accessibilityManager != null && this.f3778c == null) {
            pe.a aVar = new pe.a(this, view, 1);
            this.f3778c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new e(this, 5));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = ((d) view.getLayoutParams()).f6625c;
        if (i11 == 80 || i11 == 81) {
            r(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i11, i10);
            r((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.f3784i = this.f3776a.E(view, marginLayoutParams);
        this.f3780e = f.b0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f3781f = f.b0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f3782g = f.c0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, ne.a.f12304d);
        this.f3783h = f.c0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, ne.a.f12303c);
        return false;
    }

    @Override // f4.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        if (i10 <= 0) {
            if (i10 < 0) {
                s(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f3777b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f3785k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.j = 1;
            Iterator it = this.f3779d.iterator();
            if (it.hasNext()) {
                throw b.k(it);
            }
            this.f3785k = this.f3776a.H(view, this.f3784i).setInterpolator(this.f3783h).setDuration(this.f3781f).setListener(new l(this, 5));
        }
    }

    @Override // f4.a
    public final boolean o(View view, int i10, int i11) {
        return i10 == 2;
    }

    public final void r(int i10) {
        a.a aVar = this.f3776a;
        if (aVar == null || aVar.G() != i10) {
            if (i10 == 0) {
                this.f3776a = new pe.b(2);
            } else if (i10 == 1) {
                this.f3776a = new pe.b(0);
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException(m6.a.e(i10, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                this.f3776a = new pe.b(1);
            }
        }
    }

    public final void s(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f3785k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.f3779d.iterator();
        if (it.hasNext()) {
            throw b.k(it);
        }
        this.f3776a.getClass();
        this.f3785k = this.f3776a.H(view, 0).setInterpolator(this.f3782g).setDuration(this.f3780e).setListener(new l(this, 5));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
