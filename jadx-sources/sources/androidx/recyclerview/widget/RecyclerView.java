package androidx.recyclerview.widget;

import ag.i;
import ak.v;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import c1.u1;
import com.google.android.gms.common.api.f;
import d8.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import l5.d;
import p1.l;
import p4.g;
import q.p;
import q.p0;
import qh.c;
import s4.b;
import t4.d0;
import t4.j;
import t4.l0;
import t6.a;
import t6.a0;
import t6.b0;
import t6.c0;
import t6.e0;
import t6.e1;
import t6.f0;
import t6.g0;
import t6.h;
import t6.h0;
import t6.i0;
import t6.j0;
import t6.k;
import t6.k0;
import t6.m;
import t6.m0;
import t6.n0;
import t6.q0;
import t6.r0;
import t6.s0;
import t6.t;
import t6.t0;
import t6.v0;
import t6.x;
import t6.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] P0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] Q0;
    public static final d R0;
    public final Rect A;
    public boolean A0;
    public final Rect B;
    public final e B0;
    public final RectF C;
    public boolean C0;
    public x D;
    public v0 D0;
    public e0 E;
    public final int[] E0;
    public final ArrayList F;
    public j F0;
    public final ArrayList G;
    public final int[] G0;
    public final ArrayList H;
    public final int[] H0;
    public k I;
    public final int[] I0;
    public boolean J;
    public final ArrayList J0;
    public boolean K;
    public final ah.d K0;
    public boolean L;
    public boolean L0;
    public int M;
    public int M0;
    public boolean N;
    public int N0;
    public boolean O;
    public final i O0;
    public boolean P;
    public int Q;
    public final AccessibilityManager R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public a0 W;

    /* renamed from: a, reason: collision with root package name */
    public final m0 f1173a;

    /* renamed from: a0, reason: collision with root package name */
    public EdgeEffect f1174a0;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f1175b;

    /* renamed from: b0, reason: collision with root package name */
    public EdgeEffect f1176b0;

    /* renamed from: c, reason: collision with root package name */
    public n0 f1177c;

    /* renamed from: c0, reason: collision with root package name */
    public EdgeEffect f1178c0;

    /* renamed from: d, reason: collision with root package name */
    public final v f1179d;

    /* renamed from: d0, reason: collision with root package name */
    public EdgeEffect f1180d0;

    /* renamed from: e, reason: collision with root package name */
    public final l f1181e;

    /* renamed from: e0, reason: collision with root package name */
    public b0 f1182e0;

    /* renamed from: f, reason: collision with root package name */
    public final c f1183f;

    /* renamed from: f0, reason: collision with root package name */
    public int f1184f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f1185g0;

    /* renamed from: h0, reason: collision with root package name */
    public VelocityTracker f1186h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f1187i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f1188j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f1189k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f1190l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1191m0;

    /* renamed from: n0, reason: collision with root package name */
    public g0 f1192n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int f1193o0;

    /* renamed from: p0, reason: collision with root package name */
    public final int f1194p0;

    /* renamed from: q0, reason: collision with root package name */
    public final float f1195q0;

    /* renamed from: r0, reason: collision with root package name */
    public final float f1196r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f1197s0;

    /* renamed from: t0, reason: collision with root package name */
    public final s0 f1198t0;

    /* renamed from: u0, reason: collision with root package name */
    public m f1199u0;

    /* renamed from: v0, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f1200v0;
    public final q0 w0;
    public h0 x0;
    public ArrayList y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1201z;
    public boolean z0;

    static {
        Class cls = Integer.TYPE;
        Q0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        R0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.anonlab.voidlauncher.R.attr.recyclerViewStyle);
    }

    public static RecyclerView C(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewC = C(viewGroup.getChildAt(i10));
            if (recyclerViewC != null) {
                return recyclerViewC;
            }
        }
        return null;
    }

    public static t0 H(View view) {
        if (view == null) {
            return null;
        }
        return ((f0) view.getLayoutParams()).f15893a;
    }

    private j getScrollingChildHelper() {
        if (this.F0 == null) {
            this.F0 = new j(this);
        }
        return this.F0;
    }

    public static void i(t0 t0Var) {
        WeakReference weakReference = t0Var.f16047b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == t0Var.f16046a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            t0Var.f16047b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.H
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            t6.k r5 = (t6.k) r5
            int r6 = r5.f15943v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f15944w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f15937p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f15944w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f15934m = r6
        L55:
            r5.f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.I = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A(android.view.MotionEvent):boolean");
    }

    public final void B(int[] iArr) {
        int iR = this.f1181e.r();
        if (iR == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = f.API_PRIORITY_OTHER;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iR; i12++) {
            t0 t0VarH = H(this.f1181e.q(i12));
            if (!t0VarH.o()) {
                int iB = t0VarH.b();
                if (iB < i10) {
                    i10 = iB;
                }
                if (iB > i11) {
                    i11 = iB;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final t0 D(int i10) {
        t0 t0Var = null;
        if (this.S) {
            return null;
        }
        int iV = this.f1181e.v();
        for (int i11 = 0; i11 < iV; i11++) {
            t0 t0VarH = H(this.f1181e.u(i11));
            if (t0VarH != null && !t0VarH.h() && E(t0VarH) == i10) {
                if (!((ArrayList) this.f1181e.f12662d).contains(t0VarH.f16046a)) {
                    return t0VarH;
                }
                t0Var = t0VarH;
            }
        }
        return t0Var;
    }

    public final int E(t0 t0Var) {
        if ((t0Var.j & 524) == 0 && t0Var.e()) {
            int i10 = t0Var.f16048c;
            ArrayList arrayList = (ArrayList) this.f1179d.f731b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) arrayList.get(i11);
                int i12 = aVar.f15819a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = aVar.f15820b;
                        if (i13 <= i10) {
                            int i14 = aVar.f15821c;
                            if (i13 + i14 <= i10) {
                                i10 -= i14;
                            }
                        } else {
                            continue;
                        }
                    } else if (i12 == 8) {
                        int i15 = aVar.f15820b;
                        if (i15 == i10) {
                            i10 = aVar.f15821c;
                        } else {
                            if (i15 < i10) {
                                i10--;
                            }
                            if (aVar.f15821c <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (aVar.f15820b <= i10) {
                    i10 += aVar.f15821c;
                }
            }
            return i10;
        }
        return -1;
    }

    public final long F(t0 t0Var) {
        return this.D.f16077b ? t0Var.f16050e : t0Var.f16048c;
    }

    public final t0 G(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return H(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect I(View view) {
        f0 f0Var = (f0) view.getLayoutParams();
        boolean z2 = f0Var.f15895c;
        Rect rect = f0Var.f15894b;
        if (!z2 || (this.w0.f16002g && (f0Var.f15893a.k() || f0Var.f15893a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.A;
            rect2.set(0, 0, 0, 0);
            ((c0) arrayList.get(i10)).getClass();
            ((f0) view.getLayoutParams()).f15893a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        f0Var.f15895c = false;
        return rect;
    }

    public final boolean J() {
        return !this.L || this.S || this.f1179d.v();
    }

    public final boolean K() {
        return this.U > 0;
    }

    public final void L(int i10) {
        if (this.E == null) {
            return;
        }
        setScrollState(2);
        this.E.o0(i10);
        awakenScrollBars();
    }

    public final void M() {
        int iV = this.f1181e.v();
        for (int i10 = 0; i10 < iV; i10++) {
            ((f0) this.f1181e.u(i10).getLayoutParams()).f15895c = true;
        }
        ArrayList arrayList = this.f1175b.f15950c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f0 f0Var = (f0) ((t0) arrayList.get(i11)).f16046a.getLayoutParams();
            if (f0Var != null) {
                f0Var.f15895c = true;
            }
        }
    }

    public final void N(int i10, int i11, boolean z2) {
        int i12 = i10 + i11;
        int iV = this.f1181e.v();
        for (int i13 = 0; i13 < iV; i13++) {
            t0 t0VarH = H(this.f1181e.u(i13));
            if (t0VarH != null && !t0VarH.o()) {
                int i14 = t0VarH.f16048c;
                q0 q0Var = this.w0;
                if (i14 >= i12) {
                    t0VarH.l(-i11, z2);
                    q0Var.f16001f = true;
                } else if (i14 >= i10) {
                    t0VarH.a(8);
                    t0VarH.l(-i11, z2);
                    t0VarH.f16048c = i10 - 1;
                    q0Var.f16001f = true;
                }
            }
        }
        k0 k0Var = this.f1175b;
        ArrayList arrayList = k0Var.f15950c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t0 t0Var = (t0) arrayList.get(size);
            if (t0Var != null) {
                int i15 = t0Var.f16048c;
                if (i15 >= i12) {
                    t0Var.l(-i11, z2);
                } else if (i15 >= i10) {
                    t0Var.a(8);
                    k0Var.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void O() {
        this.U++;
    }

    public final void P(boolean z2) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.U - 1;
        this.U = i11;
        if (i11 < 1) {
            this.U = 0;
            if (z2) {
                int i12 = this.Q;
                this.Q = 0;
                if (i12 != 0 && (accessibilityManager = this.R) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i12);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.J0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    t0 t0Var = (t0) arrayList.get(size);
                    if (t0Var.f16046a.getParent() == this && !t0Var.o() && (i10 = t0Var.f16061q) != -1) {
                        View view = t0Var.f16046a;
                        Field field = l0.f15744a;
                        view.setImportantForAccessibility(i10);
                        t0Var.f16061q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void Q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1185g0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1185g0 = motionEvent.getPointerId(i10);
            int x2 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f1189k0 = x2;
            this.f1187i0 = x2;
            int y2 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f1190l0 = y2;
            this.f1188j0 = y2;
        }
    }

    public final void R() {
        if (this.C0 || !this.J) {
            return;
        }
        Field field = l0.f15744a;
        postOnAnimation(this.K0);
        this.C0 = true;
    }

    public final void S(boolean z2) {
        this.T = z2 | this.T;
        this.S = true;
        int iV = this.f1181e.v();
        for (int i10 = 0; i10 < iV; i10++) {
            t0 t0VarH = H(this.f1181e.u(i10));
            if (t0VarH != null && !t0VarH.o()) {
                t0VarH.a(6);
            }
        }
        M();
        k0 k0Var = this.f1175b;
        ArrayList arrayList = k0Var.f15950c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            t0 t0Var = (t0) arrayList.get(i11);
            if (t0Var != null) {
                t0Var.a(6);
                t0Var.a(1024);
            }
        }
        x xVar = k0Var.f15955h.D;
        if (xVar == null || !xVar.f16077b) {
            k0Var.e();
        }
    }

    public final void T(t0 t0Var, u1 u1Var) {
        t0Var.j &= -8193;
        boolean z2 = this.w0.f16003h;
        c cVar = this.f1183f;
        if (z2 && t0Var.k() && !t0Var.h() && !t0Var.o()) {
            ((p) cVar.f13508c).e(F(t0Var), t0Var);
        }
        p0 p0Var = (p0) cVar.f13507b;
        e1 e1VarA = (e1) p0Var.get(t0Var);
        if (e1VarA == null) {
            e1VarA = e1.a();
            p0Var.put(t0Var, e1VarA);
        }
        e1VarA.f15885b = u1Var;
        e1VarA.f15884a |= 4;
    }

    public final void U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.A;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof f0) {
            f0 f0Var = (f0) layoutParams;
            if (!f0Var.f15895c) {
                Rect rect2 = f0Var.f15894b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.E.l0(this, view, this.A, !this.L, view2 == null);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f1186h0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        c0(0);
        EdgeEffect edgeEffect = this.f1174a0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f1174a0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1176b0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f1176b0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1178c0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f1178c0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1180d0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f1180d0.isFinished();
        }
        if (zIsFinished) {
            Field field = l0.f15744a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean W(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.W(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void X(int[] iArr, int i10, int i11) {
        t0 t0Var;
        a0();
        O();
        int i12 = g.f12796a;
        Trace.beginSection("RV Scroll");
        q0 q0Var = this.w0;
        y(q0Var);
        k0 k0Var = this.f1175b;
        int iN0 = i10 != 0 ? this.E.n0(i10, k0Var, q0Var) : 0;
        int iP0 = i11 != 0 ? this.E.p0(i11, k0Var, q0Var) : 0;
        Trace.endSection();
        l lVar = this.f1181e;
        int iR = lVar.r();
        for (int i13 = 0; i13 < iR; i13++) {
            View viewQ = lVar.q(i13);
            t0 t0VarG = G(viewQ);
            if (t0VarG != null && (t0Var = t0VarG.f16054i) != null) {
                View view = t0Var.f16046a;
                int left = viewQ.getLeft();
                int top = viewQ.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        P(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = iN0;
            iArr[1] = iP0;
        }
    }

    public final void Y(int i10) {
        t tVar;
        if (this.O) {
            return;
        }
        setScrollState(0);
        s0 s0Var = this.f1198t0;
        s0Var.f16029z.removeCallbacks(s0Var);
        s0Var.f16025c.abortAnimation();
        e0 e0Var = this.E;
        if (e0Var != null && (tVar = e0Var.f15873e) != null) {
            tVar.i();
        }
        e0 e0Var2 = this.E;
        if (e0Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            e0Var2.o0(i10);
            awakenScrollBars();
        }
    }

    public final void Z(int i10, int i11, boolean z2) {
        e0 e0Var = this.E;
        if (e0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.O) {
            return;
        }
        if (!e0Var.d()) {
            i10 = 0;
        }
        if (!this.E.e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (z2) {
            int i12 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i12 |= 2;
            }
            getScrollingChildHelper().g(i12, 1);
        }
        this.f1198t0.b(i10, i11, Integer.MIN_VALUE, null);
    }

    public final void a0() {
        int i10 = this.M + 1;
        this.M = i10;
        if (i10 != 1 || this.O) {
            return;
        }
        this.N = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(boolean z2) {
        if (this.M < 1) {
            this.M = 1;
        }
        if (!z2 && !this.O) {
            this.N = false;
        }
        if (this.M == 1) {
            if (z2 && this.N && !this.O && this.E != null && this.D != null) {
                n();
            }
            if (!this.O) {
                this.N = false;
            }
        }
        this.M--;
    }

    public final void c0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f0) && this.E.f((f0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        e0 e0Var = this.E;
        if (e0Var != null && e0Var.d()) {
            return this.E.j(this.w0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        e0 e0Var = this.E;
        if (e0Var != null && e0Var.d()) {
            return this.E.k(this.w0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        e0 e0Var = this.E;
        if (e0Var != null && e0Var.d()) {
            return this.E.l(this.w0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        e0 e0Var = this.E;
        if (e0Var != null && e0Var.e()) {
            return this.E.m(this.w0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        e0 e0Var = this.E;
        if (e0Var != null && e0Var.e()) {
            return this.E.n(this.w0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        e0 e0Var = this.E;
        if (e0Var != null && e0Var.e()) {
            return this.E.o(this.w0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z2) {
        return getScrollingChildHelper().a(f10, f11, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) arrayList.get(i10)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1174a0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1201z ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1174a0;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f1176b0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1201z) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1176b0;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f1178c0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1201z ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1178c0;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f1180d0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1201z) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1180d0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z2 |= z10;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.f1182e0 == null || arrayList.size() <= 0 || !this.f1182e0.f()) ? z2 : true) {
            Field field = l0.f15744a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e(t0 t0Var) {
        View view = t0Var.f16046a;
        boolean z2 = view.getParent() == this;
        this.f1175b.k(G(view));
        if (t0Var.j()) {
            this.f1181e.d(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f1181e.c(view, -1, true);
            return;
        }
        l lVar = this.f1181e;
        int iIndexOfChild = ((RecyclerView) ((p7.k) lVar.f12660b).f12813b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((mc.e) lVar.f12661c).j(iIndexOfChild);
            lVar.y(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f(c0 c0Var) {
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.G;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(c0Var);
        M();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(h0 h0Var) {
        if (this.y0 == null) {
            this.y0 = new ArrayList();
        }
        this.y0.add(h0Var);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        e0 e0Var = this.E;
        if (e0Var != null) {
            return e0Var.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + x());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        e0 e0Var = this.E;
        if (e0Var != null) {
            return e0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + x());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public x getAdapter() {
        return this.D;
    }

    @Override // android.view.View
    public int getBaseline() {
        e0 e0Var = this.E;
        if (e0Var == null) {
            return super.getBaseline();
        }
        e0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1201z;
    }

    public v0 getCompatAccessibilityDelegate() {
        return this.D0;
    }

    public a0 getEdgeEffectFactory() {
        return this.W;
    }

    public b0 getItemAnimator() {
        return this.f1182e0;
    }

    public int getItemDecorationCount() {
        return this.G.size();
    }

    public e0 getLayoutManager() {
        return this.E;
    }

    public int getMaxFlingVelocity() {
        return this.f1194p0;
    }

    public int getMinFlingVelocity() {
        return this.f1193o0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public g0 getOnFlingListener() {
        return this.f1192n0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1197s0;
    }

    public j0 getRecycledViewPool() {
        return this.f1175b.c();
    }

    public int getScrollState() {
        return this.f1184f0;
    }

    public final void h(String str) {
        if (K()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + x());
        }
        if (this.V > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + x()));
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.J;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.O;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f15736d;
    }

    public final void j() {
        int iV = this.f1181e.v();
        for (int i10 = 0; i10 < iV; i10++) {
            t0 t0VarH = H(this.f1181e.u(i10));
            if (!t0VarH.o()) {
                t0VarH.f16049d = -1;
                t0VarH.f16052g = -1;
            }
        }
        k0 k0Var = this.f1175b;
        ArrayList arrayList = k0Var.f15948a;
        ArrayList arrayList2 = k0Var.f15950c;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            t0 t0Var = (t0) arrayList2.get(i11);
            t0Var.f16049d = -1;
            t0Var.f16052g = -1;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            t0 t0Var2 = (t0) arrayList.get(i12);
            t0Var2.f16049d = -1;
            t0Var2.f16052g = -1;
        }
        ArrayList arrayList3 = k0Var.f15949b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                t0 t0Var3 = (t0) k0Var.f15949b.get(i13);
                t0Var3.f16049d = -1;
                t0Var3.f16052g = -1;
            }
        }
    }

    public final void k(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f1174a0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f1174a0.onRelease();
            zIsFinished = this.f1174a0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1178c0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f1178c0.onRelease();
            zIsFinished |= this.f1178c0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1176b0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f1176b0.onRelease();
            zIsFinished |= this.f1176b0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1180d0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f1180d0.onRelease();
            zIsFinished |= this.f1180d0.isFinished();
        }
        if (zIsFinished) {
            Field field = l0.f15744a;
            postInvalidateOnAnimation();
        }
    }

    public final void l() {
        if (!this.L || this.S) {
            int i10 = g.f12796a;
            Trace.beginSection("RV FullInvalidate");
            n();
            Trace.endSection();
            return;
        }
        v vVar = this.f1179d;
        if (vVar.v()) {
            vVar.getClass();
            if (vVar.v()) {
                int i11 = g.f12796a;
                Trace.beginSection("RV FullInvalidate");
                n();
                Trace.endSection();
            }
        }
    }

    public final void m(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = l0.f15744a;
        setMeasuredDimension(e0.g(i10, paddingRight, getMinimumWidth()), e0.g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bf  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 1061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.U = r0
            r1 = 1
            r5.J = r1
            boolean r2 = r5.L
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.L = r2
            t6.e0 r2 = r5.E
            if (r2 == 0) goto L21
            r2.f15875g = r1
            r2.R(r5)
        L21:
            r5.C0 = r0
            java.lang.ThreadLocal r0 = t6.m.f15961e
            java.lang.Object r1 = r0.get()
            t6.m r1 = (t6.m) r1
            r5.f1199u0 = r1
            if (r1 != 0) goto L6b
            t6.m r1 = new t6.m
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f15963a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f15966d = r2
            r5.f1199u0 = r1
            java.lang.reflect.Field r1 = t4.l0.f15744a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            t6.m r2 = r5.f1199u0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f15965c = r3
            r0.set(r2)
        L6b:
            t6.m r0 = r5.f1199u0
            java.util.ArrayList r0 = r0.f15963a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t tVar;
        super.onDetachedFromWindow();
        b0 b0Var = this.f1182e0;
        if (b0Var != null) {
            b0Var.e();
        }
        setScrollState(0);
        s0 s0Var = this.f1198t0;
        s0Var.f16029z.removeCallbacks(s0Var);
        s0Var.f16025c.abortAnimation();
        e0 e0Var = this.E;
        if (e0Var != null && (tVar = e0Var.f15873e) != null) {
            tVar.i();
        }
        this.J = false;
        e0 e0Var2 = this.E;
        if (e0Var2 != null) {
            e0Var2.f15875g = false;
            e0Var2.S(this);
        }
        this.J0.clear();
        removeCallbacks(this.K0);
        this.f1183f.getClass();
        while (e1.f15883d.a() != null) {
        }
        m mVar = this.f1199u0;
        if (mVar != null) {
            mVar.f15963a.remove(this);
            this.f1199u0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) arrayList.get(i10)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (!this.O) {
            this.I = null;
            if (A(motionEvent)) {
                V();
                setScrollState(0);
                return true;
            }
            e0 e0Var = this.E;
            if (e0Var != null) {
                boolean zD = e0Var.d();
                boolean zE = this.E.e();
                if (this.f1186h0 == null) {
                    this.f1186h0 = VelocityTracker.obtain();
                }
                this.f1186h0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.P) {
                        this.P = false;
                    }
                    this.f1185g0 = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.f1189k0 = x2;
                    this.f1187i0 = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.f1190l0 = y2;
                    this.f1188j0 = y2;
                    if (this.f1184f0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        c0(1);
                    }
                    int[] iArr = this.H0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i10 = zD;
                    if (zE) {
                        i10 = (zD ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else if (actionMasked == 1) {
                    this.f1186h0.clear();
                    c0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1185g0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1185g0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x4 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f1184f0 != 1) {
                        int i11 = x4 - this.f1187i0;
                        int i12 = y10 - this.f1188j0;
                        if (zD == 0 || Math.abs(i11) <= this.f1191m0) {
                            z2 = false;
                        } else {
                            this.f1189k0 = x4;
                            z2 = true;
                        }
                        if (zE && Math.abs(i12) > this.f1191m0) {
                            this.f1190l0 = y10;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    V();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f1185g0 = motionEvent.getPointerId(actionIndex);
                    int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1189k0 = x10;
                    this.f1187i0 = x10;
                    int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f1190l0 = y11;
                    this.f1188j0 = y11;
                } else if (actionMasked == 6) {
                    Q(motionEvent);
                }
                if (this.f1184f0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        int i14 = g.f12796a;
        Trace.beginSection("RV OnLayout");
        n();
        Trace.endSection();
        this.L = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        e0 e0Var = this.E;
        if (e0Var == null) {
            m(i10, i11);
            return;
        }
        boolean zL = e0Var.L();
        boolean z2 = false;
        q0 q0Var = this.w0;
        if (!zL) {
            if (this.K) {
                this.E.f15870b.m(i10, i11);
                return;
            }
            if (q0Var.f16005k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            x xVar = this.D;
            if (xVar != null) {
                q0Var.f16000e = xVar.a();
            } else {
                q0Var.f16000e = 0;
            }
            a0();
            this.E.f15870b.m(i10, i11);
            b0(false);
            q0Var.f16002g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.E.f15870b.m(i10, i11);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z2 = true;
        }
        this.L0 = z2;
        if (z2 || this.D == null) {
            return;
        }
        if (q0Var.f15999d == 1) {
            o();
        }
        this.E.r0(i10, i11);
        q0Var.f16004i = true;
        p();
        this.E.t0(i10, i11);
        if (this.E.w0()) {
            this.E.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            q0Var.f16004i = true;
            p();
            this.E.t0(i10, i11);
        }
        this.M0 = getMeasuredWidth();
        this.N0 = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (K()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n0 n0Var = (n0) parcelable;
        this.f1177c = n0Var;
        super.onRestoreInstanceState(n0Var.f9454a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n0 n0Var = new n0(super.onSaveInstanceState());
        n0 n0Var2 = this.f1177c;
        if (n0Var2 != null) {
            n0Var.f15970c = n0Var2.f15970c;
            return n0Var;
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            n0Var.f15970c = e0Var.f0();
            return n0Var;
        }
        n0Var.f15970c = null;
        return n0Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.f1180d0 = null;
        this.f1176b0 = null;
        this.f1178c0 = null;
        this.f1174a0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8 A[PHI: r1
      0x01f8: PHI (r1v53 int) = (r1v38 int), (r1v57 int) binds: [B:90:0x01e1, B:94:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fb  */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 1193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        a0();
        O();
        q0 q0Var = this.w0;
        q0Var.a(6);
        this.f1179d.k();
        q0Var.f16000e = this.D.a();
        q0Var.f15998c = 0;
        if (this.f1177c != null) {
            x xVar = this.D;
            int iB = y3.e.b(xVar.f16078c);
            if (iB == 1 ? xVar.a() > 0 : iB != 2) {
                Parcelable parcelable = this.f1177c.f15970c;
                if (parcelable != null) {
                    this.E.e0(parcelable);
                }
                this.f1177c = null;
            }
        }
        q0Var.f16002g = false;
        this.E.c0(this.f1175b, q0Var);
        q0Var.f16001f = false;
        q0Var.j = q0Var.j && this.f1182e0 != null;
        q0Var.f15999d = 4;
        P(true);
        b0(false);
    }

    public final boolean q(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void r(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        t0 t0VarH = H(view);
        if (t0VarH != null) {
            if (t0VarH.j()) {
                t0VarH.j &= -257;
            } else if (!t0VarH.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + t0VarH + x());
            }
        }
        view.clearAnimation();
        H(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        t tVar = this.E.f15873e;
        if ((tVar == null || !tVar.f16034e) && !K() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.E.l0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) arrayList.get(i10)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.M != 0 || this.O) {
            this.N = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i10, int i11) {
        this.V++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        h0 h0Var = this.x0;
        if (h0Var != null) {
            h0Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.y0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((h0) this.y0.get(size)).b(this, i10, i11);
            }
        }
        this.V--;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        e0 e0Var = this.E;
        if (e0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.O) {
            return;
        }
        boolean zD = e0Var.d();
        boolean zE = this.E.e();
        if (zD || zE) {
            if (!zD) {
                i10 = 0;
            }
            if (!zE) {
                i11 = 0;
            }
            W(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!K()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.Q |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(v0 v0Var) {
        this.D0 = v0Var;
        l0.l(this, v0Var);
    }

    public void setAdapter(x xVar) {
        setLayoutFrozen(false);
        x xVar2 = this.D;
        m0 m0Var = this.f1173a;
        if (xVar2 != null) {
            xVar2.f16076a.unregisterObserver(m0Var);
            this.D.getClass();
        }
        b0 b0Var = this.f1182e0;
        if (b0Var != null) {
            b0Var.e();
        }
        e0 e0Var = this.E;
        k0 k0Var = this.f1175b;
        if (e0Var != null) {
            e0Var.h0(k0Var);
            this.E.i0(k0Var);
        }
        k0Var.f15948a.clear();
        k0Var.e();
        v vVar = this.f1179d;
        vVar.B((ArrayList) vVar.f731b);
        vVar.B((ArrayList) vVar.f732c);
        x xVar3 = this.D;
        this.D = xVar;
        if (xVar != null) {
            xVar.f16076a.registerObserver(m0Var);
        }
        e0 e0Var2 = this.E;
        if (e0Var2 != null) {
            e0Var2.Q();
        }
        x xVar4 = this.D;
        k0Var.f15948a.clear();
        k0Var.e();
        j0 j0VarC = k0Var.c();
        if (xVar3 != null) {
            j0VarC.f15922b--;
        }
        if (j0VarC.f15922b == 0) {
            SparseArray sparseArray = j0VarC.f15921a;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((i0) sparseArray.valueAt(i10)).f15915a.clear();
            }
        }
        if (xVar4 != null) {
            j0VarC.f15922b++;
        }
        this.w0.f16001f = true;
        S(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(z zVar) {
        if (zVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1201z) {
            this.f1180d0 = null;
            this.f1176b0 = null;
            this.f1178c0 = null;
            this.f1174a0 = null;
        }
        this.f1201z = z2;
        super.setClipToPadding(z2);
        if (this.L) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(a0 a0Var) {
        a0Var.getClass();
        this.W = a0Var;
        this.f1180d0 = null;
        this.f1176b0 = null;
        this.f1178c0 = null;
        this.f1174a0 = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.K = z2;
    }

    public void setItemAnimator(b0 b0Var) {
        b0 b0Var2 = this.f1182e0;
        if (b0Var2 != null) {
            b0Var2.e();
            this.f1182e0.f15832a = null;
        }
        this.f1182e0 = b0Var;
        if (b0Var != null) {
            b0Var.f15832a = this.B0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        k0 k0Var = this.f1175b;
        k0Var.f15952e = i10;
        k0Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(e0 e0Var) {
        t tVar;
        if (e0Var == this.E) {
            return;
        }
        setScrollState(0);
        s0 s0Var = this.f1198t0;
        s0Var.f16029z.removeCallbacks(s0Var);
        s0Var.f16025c.abortAnimation();
        e0 e0Var2 = this.E;
        if (e0Var2 != null && (tVar = e0Var2.f15873e) != null) {
            tVar.i();
        }
        e0 e0Var3 = this.E;
        k0 k0Var = this.f1175b;
        if (e0Var3 != null) {
            b0 b0Var = this.f1182e0;
            if (b0Var != null) {
                b0Var.e();
            }
            this.E.h0(k0Var);
            this.E.i0(k0Var);
            k0Var.f15948a.clear();
            k0Var.e();
            if (this.J) {
                e0 e0Var4 = this.E;
                e0Var4.f15875g = false;
                e0Var4.S(this);
            }
            this.E.u0(null);
            this.E = null;
        } else {
            k0Var.f15948a.clear();
            k0Var.e();
        }
        l lVar = this.f1181e;
        RecyclerView recyclerView = (RecyclerView) ((p7.k) lVar.f12660b).f12813b;
        ((mc.e) lVar.f12661c).i();
        ArrayList arrayList = (ArrayList) lVar.f12662d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t0 t0VarH = H((View) arrayList.get(size));
            if (t0VarH != null) {
                int i10 = t0VarH.f16060p;
                if (recyclerView.K()) {
                    t0VarH.f16061q = i10;
                    recyclerView.J0.add(t0VarH);
                } else {
                    View view = t0VarH.f16046a;
                    Field field = l0.f15744a;
                    view.setImportantForAccessibility(i10);
                }
                t0VarH.f16060p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            H(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.E = e0Var;
        if (e0Var != null) {
            if (e0Var.f15870b != null) {
                throw new IllegalArgumentException("LayoutManager " + e0Var + " is already attached to a RecyclerView:" + e0Var.f15870b.x());
            }
            e0Var.u0(this);
            if (this.J) {
                e0 e0Var5 = this.E;
                e0Var5.f15875g = true;
                e0Var5.R(this);
            }
        }
        k0Var.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        j scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f15736d) {
            ViewGroup viewGroup = scrollingChildHelper.f15735c;
            Field field = l0.f15744a;
            d0.j(viewGroup);
        }
        scrollingChildHelper.f15736d = z2;
    }

    public void setOnFlingListener(g0 g0Var) {
        this.f1192n0 = g0Var;
    }

    @Deprecated
    public void setOnScrollListener(h0 h0Var) {
        this.x0 = h0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1197s0 = z2;
    }

    public void setRecycledViewPool(j0 j0Var) {
        k0 k0Var = this.f1175b;
        if (k0Var.f15954g != null) {
            r1.f15922b--;
        }
        k0Var.f15954g = j0Var;
        if (j0Var == null || k0Var.f15955h.getAdapter() == null) {
            return;
        }
        k0Var.f15954g.f15922b++;
    }

    public void setScrollState(int i10) {
        t tVar;
        if (i10 == this.f1184f0) {
            return;
        }
        this.f1184f0 = i10;
        if (i10 != 2) {
            s0 s0Var = this.f1198t0;
            s0Var.f16029z.removeCallbacks(s0Var);
            s0Var.f16025c.abortAnimation();
            e0 e0Var = this.E;
            if (e0Var != null && (tVar = e0Var.f15873e) != null) {
                tVar.i();
            }
        }
        e0 e0Var2 = this.E;
        if (e0Var2 != null) {
            e0Var2.g0(i10);
        }
        h0 h0Var = this.x0;
        if (h0Var != null) {
            h0Var.a(i10);
        }
        ArrayList arrayList = this.y0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((h0) this.y0.get(size)).a(i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f1191m0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f1191m0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(r0 r0Var) {
        this.f1175b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        t tVar;
        if (z2 != this.O) {
            h("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.O = false;
                if (this.N && this.E != null && this.D != null) {
                    requestLayout();
                }
                this.N = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.O = true;
            this.P = true;
            setScrollState(0);
            s0 s0Var = this.f1198t0;
            s0Var.f16029z.removeCallbacks(s0Var);
            s0Var.f16025c.abortAnimation();
            e0 e0Var = this.E;
            if (e0Var == null || (tVar = e0Var.f15873e) == null) {
                return;
            }
            tVar.i();
        }
    }

    public final void t() {
        if (this.f1180d0 != null) {
            return;
        }
        this.W.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1180d0 = edgeEffect;
        if (this.f1201z) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void u() {
        if (this.f1174a0 != null) {
            return;
        }
        this.W.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1174a0 = edgeEffect;
        if (this.f1201z) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void v() {
        if (this.f1178c0 != null) {
            return;
        }
        this.W.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1178c0 = edgeEffect;
        if (this.f1201z) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.f1176b0 != null) {
            return;
        }
        this.W.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1176b0 = edgeEffect;
        if (this.f1201z) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String x() {
        return " " + super.toString() + ", adapter:" + this.D + ", layout:" + this.E + ", context:" + getContext();
    }

    public final void y(q0 q0Var) {
        if (getScrollState() != 2) {
            q0Var.getClass();
            return;
        }
        OverScroller overScroller = this.f1198t0.f16025c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        q0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View z(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        char c6;
        boolean z2;
        char c10;
        int i11;
        TypedArray typedArray;
        Constructor constructor;
        super(context, attributeSet, i10);
        this.f1173a = new m0(this);
        this.f1175b = new k0(this);
        this.f1183f = new c(8);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new RectF();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.M = 0;
        this.S = false;
        this.T = false;
        this.U = 0;
        this.V = 0;
        this.W = new a0();
        h hVar = new h();
        Object[] objArr = null;
        hVar.f15832a = null;
        hVar.f15833b = new ArrayList();
        hVar.f15834c = 120L;
        hVar.f15835d = 120L;
        hVar.f15836e = 250L;
        hVar.f15837f = 250L;
        hVar.f15903g = true;
        hVar.f15904h = new ArrayList();
        hVar.f15905i = new ArrayList();
        hVar.j = new ArrayList();
        hVar.f15906k = new ArrayList();
        hVar.f15907l = new ArrayList();
        hVar.f15908m = new ArrayList();
        hVar.f15909n = new ArrayList();
        hVar.f15910o = new ArrayList();
        hVar.f15911p = new ArrayList();
        hVar.f15912q = new ArrayList();
        hVar.f15913r = new ArrayList();
        this.f1182e0 = hVar;
        this.f1184f0 = 0;
        this.f1185g0 = -1;
        this.f1195q0 = Float.MIN_VALUE;
        this.f1196r0 = Float.MIN_VALUE;
        this.f1197s0 = true;
        this.f1198t0 = new s0(this);
        this.f1200v0 = new androidx.datastore.preferences.protobuf.k(4);
        q0 q0Var = new q0();
        q0Var.f15996a = -1;
        q0Var.f15997b = 0;
        q0Var.f15998c = 0;
        q0Var.f15999d = 1;
        q0Var.f16000e = 0;
        q0Var.f16001f = false;
        q0Var.f16002g = false;
        q0Var.f16003h = false;
        q0Var.f16004i = false;
        q0Var.j = false;
        q0Var.f16005k = false;
        this.w0 = q0Var;
        this.z0 = false;
        this.A0 = false;
        e eVar = new e(this);
        this.B0 = eVar;
        this.C0 = false;
        this.E0 = new int[2];
        this.G0 = new int[2];
        this.H0 = new int[2];
        this.I0 = new int[2];
        this.J0 = new ArrayList();
        this.K0 = new ah.d(this, 28);
        this.M0 = 0;
        this.N0 = 0;
        this.O0 = new i(this, 25);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1191m0 = viewConfiguration.getScaledTouchSlop();
        this.f1195q0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f1196r0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f1193o0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1194p0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1182e0.f15832a = eVar;
        yh.c cVar = new yh.c(this, 20);
        v vVar = new v();
        vVar.f730a = new b(30);
        vVar.f731b = new ArrayList();
        vVar.f732c = new ArrayList();
        vVar.f733d = cVar;
        vVar.f734e = new ld.i(vVar, 23);
        this.f1179d = vVar;
        this.f1181e = new l(new p7.k(this, 26));
        Field field = l0.f15744a;
        if (t4.f0.a(this) == 0) {
            t4.f0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.R = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new v0(this));
        int[] iArr = s6.a.f14764a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        l0.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1201z = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + x());
            }
            Resources resources = getContext().getResources();
            c10 = 2;
            z2 = 1;
            typedArray = typedArrayObtainStyledAttributes;
            i11 = i10;
            c6 = 3;
            new k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.anonlab.voidlauncher.R.dimen.fastscroll_margin));
        } else {
            c6 = 3;
            z2 = 1;
            c10 = 2;
            i11 = i10;
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(e0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(Q0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[z2] = attributeSet;
                        objArr2[c10] = Integer.valueOf(i11);
                        objArr2[c6] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                        }
                    }
                    constructor.setAccessible(z2);
                    setLayoutManager((e0) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e16);
                }
            }
        }
        int[] iArr2 = P0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i11, 0);
        l0.k(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i11);
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        e0 e0Var = this.E;
        if (e0Var != null) {
            return e0Var.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + x());
    }

    @Deprecated
    public void setRecyclerListener(t6.l0 l0Var) {
    }
}
