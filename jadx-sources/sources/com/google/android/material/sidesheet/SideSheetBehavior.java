package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.common.api.internal.x;
import com.google.android.material.sidesheet.SideSheetBehavior;
import ef.i;
import ef.l;
import ef.m;
import f4.a;
import ff.d;
import gk.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l5.e;
import t4.d0;
import t4.l0;
import u4.c;
import u4.n;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public x8.a f3921a;

    /* renamed from: b, reason: collision with root package name */
    public final i f3922b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f3923c;

    /* renamed from: d, reason: collision with root package name */
    public final m f3924d;

    /* renamed from: e, reason: collision with root package name */
    public final x f3925e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3926f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3927g;

    /* renamed from: h, reason: collision with root package name */
    public int f3928h;

    /* renamed from: i, reason: collision with root package name */
    public e f3929i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final float f3930k;

    /* renamed from: l, reason: collision with root package name */
    public int f3931l;

    /* renamed from: m, reason: collision with root package name */
    public int f3932m;

    /* renamed from: n, reason: collision with root package name */
    public int f3933n;

    /* renamed from: o, reason: collision with root package name */
    public int f3934o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f3935p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f3936q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3937r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f3938s;

    /* renamed from: t, reason: collision with root package name */
    public int f3939t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f3940u;

    /* renamed from: v, reason: collision with root package name */
    public final d f3941v;

    public SideSheetBehavior() {
        this.f3925e = new x(this);
        this.f3927g = true;
        this.f3928h = 5;
        this.f3930k = 0.1f;
        this.f3937r = -1;
        this.f3940u = new LinkedHashSet();
        this.f3941v = new d(this, 0);
    }

    @Override // f4.a
    public final void c(f4.d dVar) {
        this.f3935p = null;
        this.f3929i = null;
    }

    @Override // f4.a
    public final void e() {
        this.f3935p = null;
        this.f3929i = null;
    }

    @Override // f4.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && l0.d(view) == null) || !this.f3927g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f3938s) != null) {
            velocityTracker.recycle();
            this.f3938s = null;
        }
        if (this.f3938s == null) {
            this.f3938s = VelocityTracker.obtain();
        }
        this.f3938s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f3939t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (eVar = this.f3929i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // f4.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) throws Resources.NotFoundException {
        View view2;
        View view3;
        int i11;
        View viewFindViewById;
        int i12 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f3935p;
        i iVar = this.f3922b;
        int iF = 0;
        if (weakReference == null) {
            this.f3935p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            f.b0(context, R.attr.motionDurationMedium2, 300);
            f.b0(context, R.attr.motionDurationShort3, 150);
            f.b0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (iVar != null) {
                view.setBackground(iVar);
                float elevation = this.f3926f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                iVar.m(elevation);
            } else {
                ColorStateList colorStateList = this.f3923c;
                if (colorStateList != null) {
                    Field field = l0.f15744a;
                    d0.g(view, colorStateList);
                }
            }
            int i13 = this.f3928h == 5 ? 4 : 0;
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (l0.d(view) == null) {
                l0.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i14 = Gravity.getAbsoluteGravity(((f4.d) view.getLayoutParams()).f6625c, i10) == 3 ? 1 : 0;
        x8.a aVar = this.f3921a;
        if (aVar == null || aVar.I() != i14) {
            f4.d dVar = null;
            m mVar = this.f3924d;
            if (i14 == 0) {
                this.f3921a = new ff.a(this, i12);
                if (mVar != null) {
                    WeakReference weakReference2 = this.f3935p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof f4.d)) {
                        dVar = (f4.d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        l lVarF = mVar.f();
                        lVarF.f6012f = new ef.a(0.0f);
                        lVarF.f6013g = new ef.a(0.0f);
                        m mVarA = lVarF.a();
                        if (iVar != null) {
                            iVar.setShapeAppearanceModel(mVarA);
                        }
                    }
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalArgumentException(m6.a.e(i14, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f3921a = new ff.a(this, iF);
                if (mVar != null) {
                    WeakReference weakReference3 = this.f3935p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof f4.d)) {
                        dVar = (f4.d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        l lVarF2 = mVar.f();
                        lVarF2.f6011e = new ef.a(0.0f);
                        lVarF2.f6014h = new ef.a(0.0f);
                        m mVarA2 = lVarF2.a();
                        if (iVar != null) {
                            iVar.setShapeAppearanceModel(mVarA2);
                        }
                    }
                }
            }
        }
        if (this.f3929i == null) {
            this.f3929i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f3941v);
        }
        int iF2 = this.f3921a.F(view);
        coordinatorLayout.q(view, i10);
        this.f3932m = coordinatorLayout.getWidth();
        this.f3933n = this.f3921a.G(coordinatorLayout);
        this.f3931l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f3934o = marginLayoutParams != null ? this.f3921a.l(marginLayoutParams) : 0;
        int i15 = this.f3928h;
        if (i15 == 1 || i15 == 2) {
            iF = iF2 - this.f3921a.F(view);
        } else if (i15 != 3) {
            if (i15 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f3928h);
            }
            iF = this.f3921a.B();
        }
        Field field2 = l0.f15744a;
        view.offsetLeftAndRight(iF);
        if (this.f3936q == null && (i11 = this.f3937r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.f3936q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f3940u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // f4.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // f4.a
    public final void m(View view, Parcelable parcelable) {
        int i10 = ((ff.e) parcelable).f6741c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f3928h = i10;
    }

    @Override // f4.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new ff.e(this);
    }

    @Override // f4.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3928h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.f3929i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f3938s) != null) {
            velocityTracker.recycle();
            this.f3938s = null;
        }
        if (this.f3938s == null) {
            this.f3938s = VelocityTracker.obtain();
        }
        this.f3938s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.j && s()) {
            float fAbs = Math.abs(this.f3939t - motionEvent.getX());
            e eVar = this.f3929i;
            if (fAbs > eVar.f9994b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void r(int i10) {
        View view;
        if (this.f3928h == i10) {
            return;
        }
        this.f3928h = i10;
        WeakReference weakReference = this.f3935p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = this.f3928h == 5 ? 4 : 0;
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
        Iterator it = this.f3940u.iterator();
        if (it.hasNext()) {
            throw b.k(it);
        }
        u();
    }

    public final boolean s() {
        if (this.f3929i != null) {
            return this.f3927g || this.f3928h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        r(2);
        r2.f3925e.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            x8.a r0 = r2.f3921a
            int r0 = r0.B()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = m6.a.d(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            x8.a r0 = r2.f3921a
            int r0 = r0.A()
        L1f:
            l5.e r1 = r2.f3929i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f10009r = r3
            r3 = -1
            r1.f9995c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f9993a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f10009r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f10009r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.r(r3)
            com.google.android.gms.common.api.internal.x r3 = r2.f3925e
            r3.b(r4)
            return
        L57:
            r2.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f3935p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        l0.i(view, 262144);
        l0.g(view, 0);
        l0.i(view, 1048576);
        l0.g(view, 0);
        final int i10 = 5;
        if (this.f3928h != 5) {
            l0.j(view, c.f16606l, new n() { // from class: ff.b
                @Override // u4.n
                public final boolean b(View view2) {
                    int i11 = i10;
                    if (i11 == 1 || i11 == 2) {
                        throw new IllegalArgumentException(m6.a.j(new StringBuilder("STATE_"), i11 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f6734a;
                    WeakReference weakReference2 = sideSheetBehavior.f3935p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i11);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f3935p.get();
                    c cVar = new c(i11, 0, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(cVar);
                        return true;
                    }
                    cVar.run();
                    return true;
                }
            });
        }
        final int i11 = 3;
        if (this.f3928h != 3) {
            l0.j(view, c.j, new n() { // from class: ff.b
                @Override // u4.n
                public final boolean b(View view2) {
                    int i112 = i11;
                    if (i112 == 1 || i112 == 2) {
                        throw new IllegalArgumentException(m6.a.j(new StringBuilder("STATE_"), i112 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f6734a;
                    WeakReference weakReference2 = sideSheetBehavior.f3935p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i112);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f3935p.get();
                    c cVar = new c(i112, 0, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(cVar);
                        return true;
                    }
                    cVar.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f3925e = new x(this);
        this.f3927g = true;
        this.f3928h = 5;
        this.f3930k = 0.1f;
        this.f3937r = -1;
        this.f3940u = new LinkedHashSet();
        this.f3941v = new d(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, me.a.f11662v);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f3923c = wd.a.z(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f3924d = m.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f3937r = resourceId;
            WeakReference weakReference = this.f3936q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f3936q = null;
            WeakReference weakReference2 = this.f3935p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        m mVar = this.f3924d;
        if (mVar != null) {
            i iVar = new i(mVar);
            this.f3922b = iVar;
            iVar.k(context);
            ColorStateList colorStateList = this.f3923c;
            if (colorStateList != null) {
                this.f3922b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3922b.setTint(typedValue.data);
            }
        }
        this.f3926f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f3927g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
