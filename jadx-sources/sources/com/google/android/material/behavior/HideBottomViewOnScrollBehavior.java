package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c2.e;
import com.anonlab.voidlauncher.R;
import f4.a;
import gk.b;
import hf.l;
import i4.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: b, reason: collision with root package name */
    public int f3767b;

    /* renamed from: c, reason: collision with root package name */
    public int f3768c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f3769d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f3770e;

    /* renamed from: g, reason: collision with root package name */
    public AccessibilityManager f3772g;

    /* renamed from: h, reason: collision with root package name */
    public pe.a f3773h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f3775k;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f3766a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f3771f = 0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3774i = true;
    public int j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // f4.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f3771f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f3767b = f.b0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f3768c = f.b0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f3769d = f.c0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, ne.a.f12304d);
        this.f3770e = f.c0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, ne.a.f12303c);
        if (this.f3772g == null) {
            this.f3772g = (AccessibilityManager) c.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f3772g;
        if (accessibilityManager == null || this.f3773h != null) {
            return false;
        }
        pe.a aVar = new pe.a(this, view, 0);
        this.f3773h = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        view.addOnAttachStateChangeListener(new e(this, 4));
        return false;
    }

    @Override // f4.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i10 <= 0) {
            if (i10 < 0) {
                r(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        if (this.f3774i && (accessibilityManager = this.f3772g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f3775k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 1;
        Iterator it = this.f3766a.iterator();
        if (it.hasNext()) {
            throw b.k(it);
        }
        this.f3775k = view.animate().translationY(this.f3771f).setInterpolator(this.f3770e).setDuration(this.f3768c).setListener(new l(this, 4));
    }

    @Override // f4.a
    public boolean o(View view, int i10, int i11) {
        return i10 == 2;
    }

    public final void r(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f3775k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.f3766a.iterator();
        if (it.hasNext()) {
            throw b.k(it);
        }
        this.f3775k = view.animate().translationY(0).setInterpolator(this.f3769d).setDuration(this.f3767b).setListener(new l(this, 4));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
