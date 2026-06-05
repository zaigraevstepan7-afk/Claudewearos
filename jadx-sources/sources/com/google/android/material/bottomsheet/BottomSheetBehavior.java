package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.common.api.internal.x;
import ef.g;
import ef.i;
import ef.m;
import f4.a;
import ff.d;
import hf.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import l5.e;
import t4.b;
import t4.d0;
import t4.l0;
import u4.c;
import yd.f;
import ze.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends a {
    public final x A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public e O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f3793a;

    /* renamed from: a0, reason: collision with root package name */
    public int f3794a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3795b;

    /* renamed from: b0, reason: collision with root package name */
    public int f3796b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f3797c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3798c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f3799d;

    /* renamed from: d0, reason: collision with root package name */
    public HashMap f3800d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3801e;

    /* renamed from: e0, reason: collision with root package name */
    public final SparseIntArray f3802e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3803f;

    /* renamed from: f0, reason: collision with root package name */
    public final d f3804f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3805g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3806h;

    /* renamed from: i, reason: collision with root package name */
    public final i f3807i;
    public final ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3808k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3809l;

    /* renamed from: m, reason: collision with root package name */
    public int f3810m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3811n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3812o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3813p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3814q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3815r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f3816s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f3817t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f3818u;

    /* renamed from: v, reason: collision with root package name */
    public int f3819v;

    /* renamed from: w, reason: collision with root package name */
    public int f3820w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f3821x;

    /* renamed from: y, reason: collision with root package name */
    public final m f3822y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3823z;

    public BottomSheetBehavior() {
        this.f3793a = 0;
        this.f3795b = true;
        this.f3808k = -1;
        this.f3809l = -1;
        this.A = new x(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f3796b0 = -1;
        this.f3802e0 = new SparseIntArray();
        this.f3804f0 = new d(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewV = v(viewGroup.getChildAt(i10));
            if (viewV != null) {
                return viewV;
            }
        }
        return null;
    }

    public static int w(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public final void A(int i10) {
        if (i10 == -1) {
            if (this.f3803f) {
                return;
            } else {
                this.f3803f = true;
            }
        } else {
            if (!this.f3803f && this.f3801e == i10) {
                return;
            }
            this.f3803f = false;
            this.f3801e = Math.max(0, i10);
        }
        I();
    }

    public final void B(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(m6.a.j(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f3795b && y(i10) <= this.D) ? 3 : i10;
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            C(i10);
            return;
        }
        View view = (View) this.W.get();
        b8.e eVar = new b8.e(this, view, i11);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(eVar);
        } else {
            eVar.run();
        }
    }

    public final void C(int i10) throws Resources.NotFoundException {
        if (this.N == i10) {
            return;
        }
        this.N = i10;
        if (i10 != 4 && i10 != 3 && i10 != 6) {
            boolean z2 = this.I;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            H(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            H(false);
        }
        G(i10, true);
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f10 * this.S) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.A.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            l5.e r1 = r2.O
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f10009r = r3
            r3 = -1
            r1.f9995c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f9993a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f10009r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f10009r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            com.google.android.gms.common.api.internal.x r3 = r2.A
            r3.b(r4)
            return
        L40:
            r2.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        l0.i(view, 524288);
        l0.g(view, 0);
        l0.i(view, 262144);
        l0.g(view, 0);
        l0.i(view, 1048576);
        l0.g(view, 0);
        SparseIntArray sparseIntArray = this.f3802e0;
        int i10 = sparseIntArray.get(0, -1);
        if (i10 != -1) {
            l0.i(view, i10);
            l0.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f3795b && this.N != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            k4.d dVar = new k4.d(this, i);
            ArrayList arrayListE = l0.e(view);
            int i11 = 0;
            while (true) {
                if (i11 >= arrayListE.size()) {
                    int i12 = 0;
                    int i13 = -1;
                    while (true) {
                        int[] iArr = l0.f15746c;
                        if (i12 >= 32 || i13 != -1) {
                            break;
                        }
                        int i14 = iArr[i12];
                        boolean z2 = true;
                        for (int i15 = 0; i15 < arrayListE.size(); i15++) {
                            z2 &= ((c) arrayListE.get(i15)).a() != i14;
                        }
                        if (z2) {
                            i13 = i14;
                        }
                        i12++;
                    }
                    iA = i13;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((c) arrayListE.get(i11)).f16611a).getLabel())) {
                        iA = ((c) arrayListE.get(i11)).a();
                        break;
                    }
                    i11++;
                }
            }
            if (iA != -1) {
                c cVar = new c(null, iA, string, dVar, null);
                View.AccessibilityDelegate accessibilityDelegateC = l0.c(view);
                b bVar = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof t4.a ? ((t4.a) accessibilityDelegateC).f15691a : new b(accessibilityDelegateC);
                if (bVar == null) {
                    bVar = new b();
                }
                l0.l(view, bVar);
                l0.i(view, cVar.a());
                l0.e(view).add(cVar);
                l0.g(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i16 = 5;
            if (this.N != 5) {
                l0.j(view, c.f16606l, new k4.d(this, i16));
            }
        }
        int i17 = this.N;
        int i18 = 4;
        int i19 = 3;
        if (i17 == 3) {
            l0.j(view, c.f16605k, new k4.d(this, this.f3795b ? 4 : 6));
            return;
        }
        if (i17 == 4) {
            l0.j(view, c.j, new k4.d(this, this.f3795b ? 3 : 6));
        } else {
            if (i17 != 6) {
                return;
            }
            l0.j(view, c.f16605k, new k4.d(this, i18));
            l0.j(view, c.j, new k4.d(this, i19));
        }
    }

    public final void G(int i10, boolean z2) {
        i iVar;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.N == 3 && (this.f3821x || z());
        if (this.f3823z == z10 || (iVar = this.f3807i) == null) {
            return;
        }
        this.f3823z = z10;
        ValueAnimator valueAnimator = this.B;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(iVar.f6000b.j, z10 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fS = this.f3823z ? s() : 1.0f;
        g gVar = iVar.f6000b;
        if (gVar.j != fS) {
            gVar.j = fS;
            iVar.f6004f = true;
            iVar.f6005z = true;
            iVar.invalidateSelf();
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f3800d0 != null) {
                    return;
                } else {
                    this.f3800d0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.W.get() && z2) {
                    this.f3800d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f3800d0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.W != null) {
            r();
            if (this.N != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // f4.a
    public final void c(f4.d dVar) {
        this.W = null;
        this.O = null;
    }

    @Override // f4.a
    public final void e() {
        this.W = null;
        this.O = null;
    }

    @Override // f4.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        e eVar;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3794a0 = -1;
            this.f3796b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            this.f3796b0 = y2;
            if (this.N != 2) {
                WeakReference weakReference = this.X;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, y2)) {
                    this.f3794a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f3798c0 = true;
                }
            }
            this.P = this.f3794a0 == -1 && !coordinatorLayout.o(view, x2, this.f3796b0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3798c0 = false;
            this.f3794a0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (eVar = this.O) == null || !eVar.p(motionEvent)) {
            WeakReference weakReference2 = this.X;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i10 = this.f3796b0) == -1 || Math.abs(i10 - motionEvent.getY()) <= this.O.f9994b) {
                return false;
            }
        }
        return true;
    }

    @Override // f4.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) throws Resources.NotFoundException {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f3805g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z2 = (Build.VERSION.SDK_INT < 29 || this.f3811n || this.f3803f) ? false : true;
            if (this.f3812o || this.f3813p || this.f3814q || this.f3816s || this.f3817t || this.f3818u || z2) {
                g6.b bVar = new g6.b(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                yd.c cVar = new yd.c();
                cVar.f20278a = paddingStart;
                cVar.f20279b = paddingEnd;
                cVar.f20280c = paddingBottom;
                qh.c cVar2 = new qh.c(20, bVar, cVar);
                Field field = l0.f15744a;
                d0.i(view, cVar2);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new l());
                }
            }
            l0.n(view, new re.b(view));
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            f.b0(context, R.attr.motionDurationMedium2, 300);
            f.b0(context, R.attr.motionDurationShort3, 150);
            f.b0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            i iVar = this.f3807i;
            if (iVar != null) {
                view.setBackground(iVar);
                float elevation = this.H;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                iVar.m(elevation);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    d0.g(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f3804f0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i10);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int iMin = this.V;
        int i11 = iMin - height;
        int i12 = this.f3820w;
        if (i11 < i12) {
            boolean z10 = this.f3815r;
            int i13 = this.f3809l;
            if (z10) {
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i12;
                if (i13 != -1) {
                    iMin2 = Math.min(iMin2, i13);
                }
                this.T = iMin2;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        r();
        int i14 = this.N;
        if (i14 == 3) {
            int iX = x();
            Field field2 = l0.f15744a;
            view.offsetTopAndBottom(iX);
        } else if (i14 == 6) {
            int i15 = this.E;
            Field field3 = l0.f15744a;
            view.offsetTopAndBottom(i15);
        } else if (this.I && i14 == 5) {
            int i16 = this.V;
            Field field4 = l0.f15744a;
            view.offsetTopAndBottom(i16);
        } else if (i14 == 4) {
            int i17 = this.G;
            Field field5 = l0.f15744a;
            view.offsetTopAndBottom(i17);
        } else if (i14 == 1 || i14 == 2) {
            int top2 = top - view.getTop();
            Field field6 = l0.f15744a;
            view.offsetTopAndBottom(top2);
        }
        G(this.N, false);
        this.X = new WeakReference(v(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // f4.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f3808k, marginLayoutParams.width), w(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f3809l, marginLayoutParams.height));
        return true;
    }

    @Override // f4.a
    public final boolean i(View view) {
        WeakReference weakReference = this.X;
        return (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) ? false : true;
    }

    @Override // f4.a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) throws Resources.NotFoundException {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.X;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i13 = top - i11;
        boolean z2 = this.K;
        boolean z10 = this.L;
        if (i11 > 0) {
            if (!this.R && !z10 && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i13 < x()) {
                int iX = top - x();
                iArr[1] = iX;
                Field field = l0.f15744a;
                view.offsetTopAndBottom(-iX);
                C(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i11;
                Field field2 = l0.f15744a;
                view.offsetTopAndBottom(-i11);
                C(1);
            }
        } else if (i11 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.R && !z10 && view2 == view3 && zCanScrollVertically) {
                this.M = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i14 = this.G;
                if (i13 > i14 && !this.I) {
                    int i15 = top - i14;
                    iArr[1] = i15;
                    Field field3 = l0.f15744a;
                    view.offsetTopAndBottom(-i15);
                    C(4);
                } else {
                    if (!z2) {
                        return;
                    }
                    iArr[1] = i11;
                    Field field4 = l0.f15744a;
                    view.offsetTopAndBottom(-i11);
                    C(1);
                }
            }
        }
        u(view.getTop());
        this.Q = i11;
        this.R = true;
        this.M = false;
    }

    @Override // f4.a
    public final void m(View view, Parcelable parcelable) {
        re.a aVar = (re.a) parcelable;
        int i10 = this.f3793a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f3801e = aVar.f14370d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f3795b = aVar.f14371e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.I = aVar.f14372f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.J = aVar.f14373z;
            }
        }
        int i11 = aVar.f14369c;
        if (i11 == 1 || i11 == 2) {
            this.N = 4;
        } else {
            this.N = i11;
        }
    }

    @Override // f4.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new re.a(this);
    }

    @Override // f4.a
    public final boolean o(View view, int i10, int i11) {
        this.Q = 0;
        this.R = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // f4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.View r4, android.view.View r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.X
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.R
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.Q
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f3795b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.Z
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f3797c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.Z
            int r0 = r3.f3794a0
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.Q
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f3795b
            if (r2 == 0) goto L74
            int r6 = r3.D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.E
            if (r5 >= r2) goto L83
            int r0 = r3.G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f3795b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.R = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    @Override // f4.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.N;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.O;
        if (eVar != null && (this.K || i10 == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f3794a0 = -1;
            this.f3796b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float fAbs = Math.abs(this.f3796b0 - motionEvent.getY());
            e eVar2 = this.O;
            if (fAbs > eVar2.f9994b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void r() {
        int iT = t();
        if (this.f3795b) {
            this.G = Math.max(this.V - iT, this.D);
        } else {
            this.G = this.V - iT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float s() {
        /*
            r5 = this;
            ef.i r0 = r5.f3807i
            r1 = 0
            if (r0 == 0) goto L89
            java.lang.ref.WeakReference r0 = r5.W
            if (r0 == 0) goto L89
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L89
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L89
            java.lang.ref.WeakReference r0 = r5.W
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L89
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L89
            ef.i r2 = r5.f3807i
            float[] r3 = r2.U
            if (r3 == 0) goto L33
            r2 = 3
            r2 = r3[r2]
            goto L41
        L33:
            ef.g r3 = r2.f6000b
            ef.m r3 = r3.f5982a
            ef.d r3 = r3.f6022e
            android.graphics.RectF r2 = r2.g()
            float r2 = r3.a(r2)
        L41:
            android.view.RoundedCorner r3 = l4.e.q(r0)
            if (r3 == 0) goto L56
            int r3 = l4.e.c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L56
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L56
            float r3 = r3 / r2
            goto L57
        L56:
            r3 = r1
        L57:
            ef.i r2 = r5.f3807i
            float[] r4 = r2.U
            if (r4 == 0) goto L61
            r2 = 0
            r2 = r4[r2]
            goto L6f
        L61:
            ef.g r4 = r2.f6000b
            ef.m r4 = r4.f5982a
            ef.d r4 = r4.f6023f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
        L6f:
            android.view.RoundedCorner r0 = l4.e.D(r0)
            if (r0 == 0) goto L84
            int r0 = l4.e.c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L84
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L84
            float r1 = r0 / r2
        L84:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    public final int t() {
        int i10;
        return this.f3803f ? Math.min(Math.max(this.f3805g, this.V - ((this.U * 9) / 16)), this.T) + this.f3819v : (this.f3811n || this.f3812o || (i10 = this.f3810m) <= 0) ? this.f3801e + this.f3819v : Math.max(this.f3801e, i10 + this.f3806h);
    }

    public final void u(int i10) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (arrayList.isEmpty()) {
                return;
            }
            int i11 = this.G;
            if (i10 <= i11 && i11 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int x() {
        if (this.f3795b) {
            return this.D;
        }
        return Math.max(this.C, this.f3815r ? 0 : this.f3820w);
    }

    public final int y(int i10) {
        if (i10 == 3) {
            return x();
        }
        if (i10 == 4) {
            return this.G;
        }
        if (i10 == 5) {
            return this.V;
        }
        if (i10 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(m6.a.d(i10, "Invalid state to get top offset: "));
    }

    public final boolean z() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i10;
        this.f3793a = 0;
        int i11 = 1;
        this.f3795b = true;
        this.f3808k = -1;
        this.f3809l = -1;
        this.A = new x(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f3796b0 = -1;
        this.f3802e0 = new SparseIntArray();
        this.f3804f0 = new d(this, i11);
        this.f3806h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, me.a.f11642a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.j = wd.a.z(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.f3822y = m.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        m mVar = this.f3822y;
        if (mVar != null) {
            i iVar = new i(mVar);
            this.f3807i = iVar;
            iVar.k(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.f3807i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3807i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new y(this, i11));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f3808k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f3809l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            A(i10);
        } else {
            A(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (this.I != z2) {
            this.I = z2;
            if (!z2 && this.N == 5) {
                B(4);
            }
            F();
        }
        this.f3811n = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.f3795b != z10) {
            this.f3795b = z10;
            if (this.W != null) {
                r();
            }
            C((this.f3795b && this.N == 6) ? 3 : this.N);
            G(this.N, true);
            F();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f3793a = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.F = f10;
            if (this.W != null) {
                this.E = (int) ((1.0f - f10) * this.V);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i12 = typedValuePeekValue2.data;
                if (i12 >= 0) {
                    this.C = i12;
                    G(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    G(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f3799d = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.f3812o = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f3813p = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f3814q = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.f3815r = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.f3816s = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f3817t = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f3818u = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f3821x = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f3797c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // f4.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }
}
