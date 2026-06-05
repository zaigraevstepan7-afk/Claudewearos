package t6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public p1.l f15869a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f15870b;

    /* renamed from: c, reason: collision with root package name */
    public final q5.b f15871c;

    /* renamed from: d, reason: collision with root package name */
    public final q5.b f15872d;

    /* renamed from: e, reason: collision with root package name */
    public t f15873e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15874f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15875g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15876h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15877i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15878k;

    /* renamed from: l, reason: collision with root package name */
    public int f15879l;

    /* renamed from: m, reason: collision with root package name */
    public int f15880m;

    /* renamed from: n, reason: collision with root package name */
    public int f15881n;

    /* renamed from: o, reason: collision with root package name */
    public int f15882o;

    public e0() {
        ld.i iVar = new ld.i(this, 24);
        ag.i iVar2 = new ag.i(this, 26);
        this.f15871c = new q5.b(iVar);
        this.f15872d = new q5.b(iVar2);
        this.f15874f = false;
        this.f15875g = false;
        this.f15876h = true;
        this.f15877i = true;
    }

    public static int A(View view) {
        Rect rect = ((f0) view.getLayoutParams()).f15894b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((f0) view.getLayoutParams()).f15893a.b();
    }

    public static d0 I(Context context, AttributeSet attributeSet, int i10, int i11) {
        d0 d0Var = new d0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s6.a.f14764a, i10, i11);
        d0Var.f15860a = typedArrayObtainStyledAttributes.getInt(0, 1);
        d0Var.f15861b = typedArrayObtainStyledAttributes.getInt(10, 1);
        d0Var.f15862c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        d0Var.f15863d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return d0Var;
    }

    public static boolean M(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    public static void N(View view, int i10, int i11, int i12, int i13) {
        f0 f0Var = (f0) view.getLayoutParams();
        Rect rect = f0Var.f15894b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) f0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) f0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) f0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) f0Var).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.e0.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((f0) view.getLayoutParams()).f15894b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.f15870b;
        x adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f15870b;
        Field field = t4.l0.f15744a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f15870b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f15870b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f15870b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f15870b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(k0 k0Var, q0 q0Var) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((f0) view.getLayoutParams()).f15894b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f15870b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f15870b.C;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i10) {
        RecyclerView recyclerView = this.f15870b;
        if (recyclerView != null) {
            int iR = recyclerView.f1181e.r();
            for (int i11 = 0; i11 < iR; i11++) {
                recyclerView.f1181e.q(i11).offsetLeftAndRight(i10);
            }
        }
    }

    public void P(int i10) {
        RecyclerView recyclerView = this.f15870b;
        if (recyclerView != null) {
            int iR = recyclerView.f1181e.r();
            for (int i11 = 0; i11 < iR; i11++) {
                recyclerView.f1181e.q(i11).offsetTopAndBottom(i10);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i10, k0 k0Var, q0 q0Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f15870b;
        k0 k0Var = recyclerView.f1175b;
        q0 q0Var = recyclerView.w0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f15870b.canScrollVertically(-1) && !this.f15870b.canScrollHorizontally(-1) && !this.f15870b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        x xVar = this.f15870b.D;
        if (xVar != null) {
            accessibilityEvent.setItemCount(xVar.a());
        }
    }

    public final void V(View view, u4.e eVar) {
        t0 t0VarH = RecyclerView.H(view);
        if (t0VarH == null || t0VarH.h()) {
            return;
        }
        p1.l lVar = this.f15869a;
        if (((ArrayList) lVar.f12662d).contains(t0VarH.f16046a)) {
            return;
        }
        RecyclerView recyclerView = this.f15870b;
        W(recyclerView.f1175b, recyclerView.w0, view, eVar);
    }

    public final void b(View view, int i10, boolean z2) {
        t0 t0VarH = RecyclerView.H(view);
        if (z2 || t0VarH.h()) {
            q.p0 p0Var = (q.p0) this.f15870b.f1183f.f13507b;
            e1 e1VarA = (e1) p0Var.get(t0VarH);
            if (e1VarA == null) {
                e1VarA = e1.a();
                p0Var.put(t0VarH, e1VarA);
            }
            e1VarA.f15884a |= 1;
        } else {
            this.f15870b.f1183f.M(t0VarH);
        }
        f0 f0Var = (f0) view.getLayoutParams();
        if (t0VarH.p() || t0VarH.i()) {
            if (t0VarH.i()) {
                t0VarH.f16058n.k(t0VarH);
            } else {
                t0VarH.j &= -33;
            }
            this.f15869a.d(view, i10, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f15870b) {
                p1.l lVar = this.f15869a;
                mc.e eVar = (mc.e) lVar.f12661c;
                int iIndexOfChild = ((RecyclerView) ((p7.k) lVar.f12660b).f12813b).indexOfChild(view);
                int iB = (iIndexOfChild == -1 || eVar.d(iIndexOfChild)) ? -1 : iIndexOfChild - eVar.b(iIndexOfChild);
                if (i10 == -1) {
                    i10 = this.f15869a.r();
                }
                if (iB == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f15870b.indexOfChild(view) + this.f15870b.x());
                }
                if (iB != i10) {
                    e0 e0Var = this.f15870b.E;
                    View viewU = e0Var.u(iB);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + e0Var.f15870b.toString());
                    }
                    e0Var.u(iB);
                    e0Var.f15869a.n(iB);
                    f0 f0Var2 = (f0) viewU.getLayoutParams();
                    t0 t0VarH2 = RecyclerView.H(viewU);
                    if (t0VarH2.h()) {
                        q.p0 p0Var2 = (q.p0) e0Var.f15870b.f1183f.f13507b;
                        e1 e1VarA2 = (e1) p0Var2.get(t0VarH2);
                        if (e1VarA2 == null) {
                            e1VarA2 = e1.a();
                            p0Var2.put(t0VarH2, e1VarA2);
                        }
                        e1VarA2.f15884a = 1 | e1VarA2.f15884a;
                    } else {
                        e0Var.f15870b.f1183f.M(t0VarH2);
                    }
                    e0Var.f15869a.d(viewU, i10, f0Var2, t0VarH2.h());
                }
            } else {
                this.f15869a.c(view, i10, false);
                f0Var.f15895c = true;
                t tVar = this.f15873e;
                if (tVar != null && tVar.f16034e) {
                    tVar.f16031b.getClass();
                    t0 t0VarH3 = RecyclerView.H(view);
                    if ((t0VarH3 != null ? t0VarH3.b() : -1) == tVar.f16030a) {
                        tVar.f16035f = view;
                    }
                }
            }
        }
        if (f0Var.f15896d) {
            t0VarH.f16046a.invalidate();
            f0Var.f15896d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f15870b;
        if (recyclerView != null) {
            recyclerView.h(str);
        }
    }

    public abstract void c0(k0 k0Var, q0 q0Var);

    public abstract boolean d();

    public abstract void d0(q0 q0Var);

    public abstract boolean e();

    public boolean f(f0 f0Var) {
        return f0Var != null;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(k0 k0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.H(u(iV)).o()) {
                View viewU = u(iV);
                k0(iV);
                k0Var.g(viewU);
            }
        }
    }

    public final void i0(k0 k0Var) {
        ArrayList arrayList = k0Var.f15948a;
        int size = arrayList.size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((t0) arrayList.get(i10)).f16046a;
            t0 t0VarH = RecyclerView.H(view);
            if (!t0VarH.o()) {
                t0VarH.n(false);
                if (t0VarH.j()) {
                    this.f15870b.removeDetachedView(view, false);
                }
                b0 b0Var = this.f15870b.f1182e0;
                if (b0Var != null) {
                    b0Var.d(t0VarH);
                }
                t0VarH.n(true);
                t0 t0VarH2 = RecyclerView.H(view);
                t0VarH2.f16058n = null;
                t0VarH2.f16059o = false;
                t0VarH2.j &= -33;
                k0Var.h(t0VarH2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = k0Var.f15949b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f15870b.invalidate();
        }
    }

    public abstract int j(q0 q0Var);

    public final void j0(View view, k0 k0Var) {
        p1.l lVar = this.f15869a;
        p7.k kVar = (p7.k) lVar.f12660b;
        int iIndexOfChild = ((RecyclerView) kVar.f12813b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((mc.e) lVar.f12661c).h(iIndexOfChild)) {
                lVar.H(view);
            }
            kVar.l(iIndexOfChild);
        }
        k0Var.g(view);
    }

    public abstract int k(q0 q0Var);

    public final void k0(int i10) {
        if (u(i10) != null) {
            p1.l lVar = this.f15869a;
            int iS = lVar.s(i10);
            p7.k kVar = (p7.k) lVar.f12660b;
            View childAt = ((RecyclerView) kVar.f12813b).getChildAt(iS);
            if (childAt == null) {
                return;
            }
            if (((mc.e) lVar.f12661c).h(iS)) {
                lVar.H(childAt);
            }
            kVar.l(iS);
        }
    }

    public abstract int l(q0 q0Var);

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.f15881n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.f15882o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.f15881n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.f15882o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f15870b
            android.graphics.Rect r5 = r5.A
            r8.y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.Z(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.e0.l0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int m(q0 q0Var);

    public final void m0() {
        RecyclerView recyclerView = this.f15870b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(q0 q0Var);

    public abstract int n0(int i10, k0 k0Var, q0 q0Var);

    public abstract int o(q0 q0Var);

    public abstract void o0(int i10);

    public final void p(k0 k0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            t0 t0VarH = RecyclerView.H(viewU);
            if (!t0VarH.o()) {
                if (!t0VarH.f() || t0VarH.h() || this.f15870b.D.f16077b) {
                    u(iV);
                    this.f15869a.n(iV);
                    k0Var.i(viewU);
                    this.f15870b.f1183f.M(t0VarH);
                } else {
                    k0(iV);
                    k0Var.h(t0VarH);
                }
            }
        }
    }

    public abstract int p0(int i10, k0 k0Var, q0 q0Var);

    public View q(int i10) {
        int iV = v();
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = u(i11);
            t0 t0VarH = RecyclerView.H(viewU);
            if (t0VarH != null && t0VarH.b() == i10 && !t0VarH.o() && (this.f15870b.w0.f16002g || !t0VarH.h())) {
                return viewU;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract f0 r();

    public final void r0(int i10, int i11) {
        this.f15881n = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f15879l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.P0;
        }
        this.f15882o = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f15880m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.P0;
        }
    }

    public f0 s(Context context, AttributeSet attributeSet) {
        return new f0(context, attributeSet);
    }

    public void s0(Rect rect, int i10, int i11) {
        int iF = F() + E() + rect.width();
        int iD = D() + G() + rect.height();
        RecyclerView recyclerView = this.f15870b;
        Field field = t4.l0.f15744a;
        this.f15870b.setMeasuredDimension(g(i10, iF, recyclerView.getMinimumWidth()), g(i11, iD, this.f15870b.getMinimumHeight()));
    }

    public f0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f0 ? new f0((f0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f0((ViewGroup.MarginLayoutParams) layoutParams) : new f0(layoutParams);
    }

    public final void t0(int i10, int i11) {
        int iV = v();
        if (iV == 0) {
            this.f15870b.m(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < iV; i16++) {
            View viewU = u(i16);
            Rect rect = this.f15870b.A;
            y(viewU, rect);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.f15870b.A.set(i15, i13, i12, i14);
        s0(this.f15870b.A, i10, i11);
    }

    public final View u(int i10) {
        p1.l lVar = this.f15869a;
        if (lVar != null) {
            return lVar.q(i10);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f15870b = null;
            this.f15869a = null;
            this.f15881n = 0;
            this.f15882o = 0;
        } else {
            this.f15870b = recyclerView;
            this.f15869a = recyclerView.f1181e;
            this.f15881n = recyclerView.getWidth();
            this.f15882o = recyclerView.getHeight();
        }
        this.f15879l = 1073741824;
        this.f15880m = 1073741824;
    }

    public final int v() {
        p1.l lVar = this.f15869a;
        if (lVar != null) {
            return lVar.r();
        }
        return 0;
    }

    public final boolean v0(View view, int i10, int i11, f0 f0Var) {
        return (!view.isLayoutRequested() && this.f15876h && M(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) f0Var).width) && M(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) f0Var).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(k0 k0Var, q0 q0Var) {
        return -1;
    }

    public final boolean x0(View view, int i10, int i11, f0 f0Var) {
        return (this.f15876h && M(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) f0Var).width) && M(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) f0Var).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.P0;
        f0 f0Var = (f0) view.getLayoutParams();
        Rect rect2 = f0Var.f15894b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) f0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) f0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) f0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) f0Var).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i10);

    public final void z0(t tVar) {
        t tVar2 = this.f15873e;
        if (tVar2 != null && tVar != tVar2 && tVar2.f16034e) {
            tVar2.i();
        }
        this.f15873e = tVar;
        RecyclerView recyclerView = this.f15870b;
        s0 s0Var = recyclerView.f1198t0;
        s0Var.f16029z.removeCallbacks(s0Var);
        s0Var.f16025c.abortAnimation();
        if (tVar.f16037h) {
            Log.w("RecyclerView", "An instance of " + tVar.getClass().getSimpleName() + " was started more than once. Each instance of" + tVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        tVar.f16031b = recyclerView;
        tVar.f16032c = this;
        int i10 = tVar.f16030a;
        if (i10 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.w0.f15996a = i10;
        tVar.f16034e = true;
        tVar.f16033d = true;
        tVar.f16035f = recyclerView.E.q(i10);
        tVar.f16031b.f1198t0.a();
        tVar.f16037h = true;
    }

    public void Q() {
    }

    public void Y() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public void e0(Parcelable parcelable) {
    }

    public void g0(int i10) {
    }

    public void X(int i10, int i11) {
    }

    public void Z(int i10, int i11) {
    }

    public void a0(int i10, int i11) {
    }

    public void b0(int i10, int i11) {
    }

    public void i(int i10, androidx.datastore.preferences.protobuf.k kVar) {
    }

    public void W(k0 k0Var, q0 q0Var, View view, u4.e eVar) {
    }

    public void h(int i10, int i11, q0 q0Var, androidx.datastore.preferences.protobuf.k kVar) {
    }
}
