package com.google.android.material.carousel;

import ac.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.anonlab.voidlauncher.R;
import com.google.android.material.datepicker.x;
import f7.c;
import m6.a;
import q5.e;
import t6.e0;
import t6.f0;
import t6.k0;
import t6.p0;
import t6.q0;
import te.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class CarouselLayoutManager extends e0 implements p0 {

    /* renamed from: p, reason: collision with root package name */
    public final e f3832p;

    /* renamed from: q, reason: collision with root package name */
    public c f3833q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f3834r;

    public CarouselLayoutManager() {
        e eVar = new e(3);
        new b();
        this.f3834r = new View.OnLayoutChangeListener() { // from class: te.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
                    return;
                }
                view.post(new o(this.f16319a, 20));
            }
        };
        this.f3832p = eVar;
        m0();
        E0(0);
    }

    public final float B0(float f10, float f11) {
        return D0() ? f10 - f11 : f10 + f11;
    }

    public final boolean C0() {
        return this.f3833q.f6650a == 0;
    }

    public final boolean D0() {
        return C0() && C() == 1;
    }

    public final void E0(int i10) {
        te.c cVar;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(a.d(i10, "invalid orientation:"));
        }
        c(null);
        c cVar2 = this.f3833q;
        if (cVar2 == null || i10 != cVar2.f6650a) {
            if (i10 == 0) {
                cVar = new te.c(this, 1);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new te.c(this, 0);
            }
            this.f3833q = cVar;
            m0();
        }
    }

    @Override // t6.e0
    public final boolean L() {
        return true;
    }

    @Override // t6.e0
    public final void R(RecyclerView recyclerView) throws Resources.NotFoundException {
        Context context = recyclerView.getContext();
        e eVar = this.f3832p;
        float dimension = eVar.f13247a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        eVar.f13247a = dimension;
        float dimension2 = eVar.f13248b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        eVar.f13248b = dimension2;
        m0();
        recyclerView.addOnLayoutChangeListener(this.f3834r);
    }

    @Override // t6.e0
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f3834r);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // t6.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r4, int r5, t6.k0 r6, t6.q0 r7) {
        /*
            r3 = this;
            int r6 = r3.v()
            if (r6 != 0) goto L8
            goto L96
        L8:
            f7.c r6 = r3.f3833q
            int r6 = r6.f6650a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.D0()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.D0()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = t6.e0.H(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.u(r6)
            int r4 = t6.e0.H(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.B()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            f7.c r4 = r3.f3833q
            r4.e()
            r4 = 0
            throw r4
        L7a:
            boolean r4 = r3.D0()
            if (r4 == 0) goto L86
            int r4 = r3.v()
            int r6 = r4 + (-1)
        L86:
            android.view.View r4 = r3.u(r6)
            return r4
        L8b:
            int r4 = t6.e0.H(r4)
            int r5 = r3.B()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r4 = 0
            return r4
        L98:
            int r4 = r3.v()
            int r4 = r4 - r1
            android.view.View r4 = r3.u(r4)
            int r4 = t6.e0.H(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.B()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            f7.c r4 = r3.f3833q
            r4.e()
            r4 = 0
            throw r4
        Lb6:
            boolean r4 = r3.D0()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.v()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r4 = r3.u(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.T(android.view.View, int, t6.k0, t6.q0):android.view.View");
    }

    @Override // t6.e0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(e0.H(u(0)));
            accessibilityEvent.setToIndex(e0.H(u(v() - 1)));
        }
    }

    @Override // t6.e0
    public final void X(int i10, int i11) {
        B();
    }

    @Override // t6.e0
    public final void Y() {
        B();
    }

    @Override // t6.p0
    public final PointF a(int i10) {
        return null;
    }

    @Override // t6.e0
    public final void a0(int i10, int i11) {
        B();
    }

    @Override // t6.e0
    public final void c0(k0 k0Var, q0 q0Var) {
        if (q0Var.b() > 0) {
            if ((C0() ? this.f15881n : this.f15882o) > 0.0f) {
                D0();
                k0Var.d(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        h0(k0Var);
    }

    @Override // t6.e0
    public final boolean d() {
        return C0();
    }

    @Override // t6.e0
    public final void d0(q0 q0Var) {
        if (v() == 0) {
            return;
        }
        e0.H(u(0));
    }

    @Override // t6.e0
    public final boolean e() {
        return !C0();
    }

    @Override // t6.e0
    public final int j(q0 q0Var) {
        v();
        return 0;
    }

    @Override // t6.e0
    public final int k(q0 q0Var) {
        return 0;
    }

    @Override // t6.e0
    public final int l(q0 q0Var) {
        return 0;
    }

    @Override // t6.e0
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z10) {
        return false;
    }

    @Override // t6.e0
    public final int m(q0 q0Var) {
        v();
        return 0;
    }

    @Override // t6.e0
    public final int n(q0 q0Var) {
        return 0;
    }

    @Override // t6.e0
    public final int n0(int i10, k0 k0Var, q0 q0Var) {
        if (!C0() || v() == 0 || i10 == 0) {
            return 0;
        }
        k0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // t6.e0
    public final int o(q0 q0Var) {
        return 0;
    }

    @Override // t6.e0
    public final int p0(int i10, k0 k0Var, q0 q0Var) {
        if (!e() || v() == 0 || i10 == 0) {
            return 0;
        }
        k0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // t6.e0
    public final f0 r() {
        return new f0(-2, -2);
    }

    @Override // t6.e0
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // t6.e0
    public final void y0(RecyclerView recyclerView, int i10) {
        x xVar = new x(this, recyclerView.getContext());
        xVar.f16030a = i10;
        z0(xVar);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        new b();
        this.f3834r = new View.OnLayoutChangeListener() { // from class: te.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i102, int i112, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (i12 - i102 == i16 - i14 && i13 - i112 == i17 - i15) {
                    return;
                }
                view.post(new o(this.f16319a, 20));
            }
        };
        this.f3832p = new e(3);
        m0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, me.a.f11643b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m0();
            E0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // t6.e0
    public final void o0(int i10) {
    }
}
