package v3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.r0;
import c1.u1;
import c2.x0;
import com.anonlab.voidlauncher.R;
import f1.g0;
import p2.e0;
import p2.m0;
import qj.b0;
import t2.z;
import t4.d0;
import t4.j1;
import t4.l0;
import t4.m1;
import v2.f0;
import v2.r1;
import v2.s1;
import v2.t1;
import w2.s2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class h extends ViewGroup implements t4.l, f1.i, s1, t4.m {
    public v1.o A;
    public ej.c B;
    public s3.c C;
    public ej.c D;
    public androidx.lifecycle.t E;
    public a7.f F;
    public final int[] G;
    public long H;
    public m1 I;
    public ej.c J;
    public final g K;
    public final g L;
    public ej.c M;
    public final int[] N;
    public int O;
    public int P;
    public final u1 Q;
    public boolean R;
    public final f0 S;

    /* renamed from: a, reason: collision with root package name */
    public final o2.d f17828a;

    /* renamed from: b, reason: collision with root package name */
    public final View f17829b;

    /* renamed from: c, reason: collision with root package name */
    public final r1 f17830c;

    /* renamed from: d, reason: collision with root package name */
    public ej.a f17831d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17832e;

    /* renamed from: f, reason: collision with root package name */
    public ej.a f17833f;

    /* renamed from: z, reason: collision with root package name */
    public ej.a f17834z;

    public h(Context context, g0 g0Var, int i10, o2.d dVar, View view, r1 r1Var) {
        super(context);
        this.f17828a = dVar;
        this.f17829b = view;
        this.f17830c = r1Var;
        q.g0 g0Var2 = s2.f18375a;
        setTag(R.id.androidx_compose_ui_view_composition_context, g0Var);
        int i11 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        w wVar = (w) this;
        l0.n(this, new a(wVar, i11));
        d0.i(this, this);
        this.f17831d = f.f17824d;
        this.f17833f = f.f17823c;
        this.f17834z = f.f17822b;
        v1.l lVar = v1.l.f17564b;
        this.A = lVar;
        this.C = wd.a.c();
        int i12 = 2;
        this.G = new int[2];
        this.H = 0L;
        this.K = new g(wVar, 1);
        this.L = new g(wVar, i11);
        this.N = new int[2];
        this.O = Integer.MIN_VALUE;
        this.P = Integer.MIN_VALUE;
        this.Q = new u1();
        f0 f0Var = new f0(3);
        f0Var.H = wVar;
        v1.o oVarA = d3.p.a(o2.f.a(lVar, j.f17835a, dVar), true, b.f17810d);
        p2.d0 d0Var = new p2.d0();
        d0Var.f12688b = new e0(wVar, 0);
        f1.d dVar2 = new f1.d();
        f1.d dVar3 = d0Var.f12689c;
        if (dVar3 != null) {
            dVar3.f6278b = null;
        }
        d0Var.f12689c = dVar2;
        dVar2.f6278b = d0Var;
        setOnRequestDisallowInterceptTouchEvent$ui(dVar2);
        v1.o oVarC = z.m(z1.h.e(oVarA.c(d0Var), new a2.n(wVar, f0Var, wVar, 5)), new c(wVar, f0Var, i12)).c(new n(new e0(wVar, 2)));
        f0Var.d0(this.A.c(oVarC));
        this.B = new c2.p(7, f0Var, oVarC);
        f0Var.Z(this.C);
        this.D = new x0(f0Var, 17);
        f0Var.f17633f0 = new c(wVar, f0Var, i11);
        f0Var.f17634g0 = new e0(wVar, 1);
        f0Var.c0(new d(wVar, f0Var));
        this.S = f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            s2.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((w2.t) this.f17830c).getSnapshotObserver();
    }

    public static final int k(w wVar, int i10, int i11, int i12) {
        return (i12 >= 0 || i10 == i11) ? View.MeasureSpec.makeMeasureSpec(cg.b.p(i12, i10, i11), 1073741824) : (i12 != -2 || i11 == Integer.MAX_VALUE) ? (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    public static l4.b l(l4.b bVar, int i10, int i11, int i12, int i13) {
        int i14 = bVar.f9967a - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = bVar.f9968b - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = bVar.f9969c - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = bVar.f9970d - i13;
        return l4.b.c(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    @Override // v2.s1
    public final boolean M() {
        return isAttachedToWindow();
    }

    @Override // f1.i
    public final void a() {
        this.f17834z.a();
    }

    @Override // f1.i
    public final void b() {
        this.f17833f.a();
        removeAllViewsInLayout();
    }

    @Override // t4.l
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f17829b.isNestedScrollingEnabled()) {
            float f10 = -1;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i10 * f10) << 32) | (Float.floatToRawIntBits(i11 * f10) & 4294967295L);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(i13 * f10) & 4294967295L) | (Float.floatToRawIntBits(i12 * f10) << 32);
            int i15 = i14 == 0 ? 1 : 2;
            o2.i iVar = this.f17828a.f12377a;
            o2.i iVarR1 = iVar != null ? iVar.r1() : null;
            long jG0 = iVarR1 != null ? iVarR1.G0(i15, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = hj.a.H(Float.intBitsToFloat((int) (jG0 >> 32))) * (-1);
            iArr[1] = hj.a.H(Float.intBitsToFloat((int) (jG0 & 4294967295L))) * (-1);
        }
    }

    @Override // t4.k
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        if (this.f17829b.isNestedScrollingEnabled()) {
            float f10 = -1;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i10 * f10) << 32) | (Float.floatToRawIntBits(i11 * f10) & 4294967295L);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(i12 * f10) << 32) | (Float.floatToRawIntBits(i13 * f10) & 4294967295L);
            int i15 = i14 == 0 ? 1 : 2;
            o2.i iVar = this.f17828a.f12377a;
            o2.i iVarR1 = iVar != null ? iVar.r1() : null;
            if (iVarR1 != null) {
                iVarR1.G0(i15, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // t4.k
    public final boolean e(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // t4.k
    public final void f(View view, View view2, int i10, int i11) {
        u1 u1Var = this.Q;
        if (i11 == 1) {
            u1Var.f2737b = i10;
        } else {
            u1Var.f2736a = i10;
        }
    }

    @Override // t4.k
    public final void g(View view, int i10) {
        u1 u1Var = this.Q;
        if (i10 == 1) {
            u1Var.f2737b = 0;
        } else {
            u1Var.f2736a = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.N;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final s3.c getDensity() {
        return this.C;
    }

    public final View getInteropView() {
        return this.f17829b;
    }

    public final f0 getLayoutNode() {
        return this.S;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f17829b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final androidx.lifecycle.t getLifecycleOwner() {
        return this.E;
    }

    public final v1.o getModifier() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        u1 u1Var = this.Q;
        return u1Var.f2737b | u1Var.f2736a;
    }

    public final ej.c getOnDensityChanged$ui() {
        return this.D;
    }

    public final ej.c getOnModifierChanged$ui() {
        return this.B;
    }

    public final ej.c getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.M;
    }

    public final ej.a getRelease() {
        return this.f17834z;
    }

    public final ej.a getReset() {
        return this.f17833f;
    }

    public final a7.f getSavedStateRegistryOwner() {
        return this.F;
    }

    public final ej.a getUpdate() {
        return this.f17831d;
    }

    public final View getView() {
        return this.f17829b;
    }

    @Override // t4.k
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        if (this.f17829b.isNestedScrollingEnabled()) {
            float f10 = -1;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i10 * f10) << 32) | (Float.floatToRawIntBits(i11 * f10) & 4294967295L);
            int i13 = i12 == 0 ? 1 : 2;
            o2.i iVar = this.f17828a.f12377a;
            o2.i iVarR1 = iVar != null ? iVar.r1() : null;
            long jC0 = iVarR1 != null ? iVarR1.c0(i13, jFloatToRawIntBits) : 0L;
            iArr[0] = hj.a.H(Float.intBitsToFloat((int) (jC0 >> 32))) * (-1);
            iArr[1] = hj.a.H(Float.intBitsToFloat((int) (jC0 & 4294967295L))) * (-1);
        }
    }

    @Override // t4.m
    public final m1 i(View view, m1 m1Var) {
        this.I = new m1(m1Var);
        return m(m1Var);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.R) {
            this.S.B();
            return null;
        }
        this.f17829b.postOnAnimation(new p0.c(1, this.L));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f17829b.isNestedScrollingEnabled();
    }

    public final m1 m(m1 m1Var) {
        j1 j1Var = m1Var.f15751a;
        l4.b bVarG = j1Var.g(-1);
        l4.b bVar = l4.b.f9966e;
        if (!bVarG.equals(bVar) || !j1Var.h(-9).equals(bVar) || j1Var.f() != null) {
            v2.s sVar = this.S.Y.f17583c;
            if (sVar.f17751k0.G) {
                long jD0 = yd.f.d0(sVar.q0(0L));
                int i10 = (int) (jD0 >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (jD0 & 4294967295L);
                if (i11 < 0) {
                    i11 = 0;
                }
                long jI = z.h(sVar).I();
                int i12 = (int) (jI >> 32);
                int i13 = (int) (jI & 4294967295L);
                long j = sVar.f15552c;
                long jD02 = yd.f.d0(sVar.q0((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i14 = i12 - ((int) (jD02 >> 32));
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i13 - ((int) (4294967295L & jD02));
                int i16 = i15 >= 0 ? i15 : 0;
                if (i10 != 0 || i11 != 0 || i14 != 0 || i16 != 0) {
                    return m1Var.f15751a.n(i10, i11, i14, i16);
                }
            }
        }
        return m1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.R) {
            this.S.B();
        } else {
            this.f17829b.postOnAnimation(new p0.c(1, this.L));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetachedFromWindow() {
        /*
            r22 = this;
            r1 = r22
            super.onDetachedFromWindow()
            v2.t1 r0 = r1.getSnapshotObserver()
            t1.v r0 = r0.f17770a
            java.lang.Object r2 = r0.f15510g
            monitor-enter(r2)
            g1.e r0 = r0.f15509f     // Catch: java.lang.Throwable -> L96
            int r3 = r0.f7026c     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r6 = 0
        L14:
            if (r5 >= r3) goto L9c
            java.lang.Object[] r7 = r0.f7024a     // Catch: java.lang.Throwable -> L96
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L96
            t1.u r7 = (t1.u) r7     // Catch: java.lang.Throwable -> L96
            q.g0 r8 = r7.f15497f     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = r8.k(r1)     // Catch: java.lang.Throwable -> L96
            q.a0 r8 = (q.a0) r8     // Catch: java.lang.Throwable -> L96
            if (r8 != 0) goto L29
        L26:
            r16 = r5
            goto L80
        L29:
            java.lang.Object[] r9 = r8.f13027b     // Catch: java.lang.Throwable -> L96
            int[] r10 = r8.f13028c     // Catch: java.lang.Throwable -> L96
            long[] r8 = r8.f13026a     // Catch: java.lang.Throwable -> L96
            int r11 = r8.length     // Catch: java.lang.Throwable -> L96
            int r11 = r11 + (-2)
            if (r11 < 0) goto L26
            r12 = 0
        L35:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> L96
            r16 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L96
            r17 = 7
            long r4 = r4 << r17
            long r4 = r4 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r17
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L79
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L96
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r15 = 0
        L54:
            if (r15 >= r4) goto L77
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r13 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L6e
            int r18 = r12 << 3
            int r18 = r18 + r15
            r19 = r5
            r5 = r9[r18]     // Catch: java.lang.Throwable -> L96
            r18 = r10[r18]     // Catch: java.lang.Throwable -> L96
            r7.c(r1, r5)     // Catch: java.lang.Throwable -> L96
            goto L70
        L6e:
            r19 = r5
        L70:
            long r13 = r13 >> r19
            int r15 = r15 + 1
            r5 = r19
            goto L54
        L77:
            if (r4 != r5) goto L80
        L79:
            if (r12 == r11) goto L80
            int r12 = r12 + 1
            r5 = r16
            goto L35
        L80:
            q.g0 r4 = r7.f15497f     // Catch: java.lang.Throwable -> L96
            boolean r4 = r4.j()     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L8b
            int r6 = r6 + 1
            goto L98
        L8b:
            if (r6 <= 0) goto L98
            java.lang.Object[] r4 = r0.f7024a     // Catch: java.lang.Throwable -> L96
            int r5 = r16 - r6
            r7 = r4[r16]     // Catch: java.lang.Throwable -> L96
            r4[r5] = r7     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r0 = move-exception
            goto La8
        L98:
            int r5 = r16 + 1
            goto L14
        L9c:
            java.lang.Object[] r4 = r0.f7024a     // Catch: java.lang.Throwable -> L96
            int r5 = r3 - r6
            r6 = 0
            qi.k.m0(r5, r3, r6, r4)     // Catch: java.lang.Throwable -> L96
            r0.f7026c = r5     // Catch: java.lang.Throwable -> L96
            monitor-exit(r2)
            return
        La8:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.h.onDetachedFromWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        this.f17829b.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f17829b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.O = i10;
        this.P = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z2) {
        if (!this.f17829b.isNestedScrollingEnabled()) {
            return false;
        }
        b0.w(this.f17828a.c(), null, new e(z2, this, mk.b.f(f10 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        if (!this.f17829b.isNestedScrollingEnabled()) {
            return false;
        }
        b0.w(this.f17828a.c(), null, new m0(this, mk.b.f(f10 * (-1.0f), f11 * (-1.0f)), (ti.c) null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        ej.c cVar = this.J;
        if (cVar == null) {
            return true;
        }
        cVar.invoke(rect != null ? new b2.c(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ej.c cVar = this.M;
        if (cVar != null) {
            cVar.invoke(Boolean.valueOf(z2));
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void setDensity(s3.c cVar) {
        if (cVar != this.C) {
            this.C = cVar;
            ej.c cVar2 = this.D;
            if (cVar2 != null) {
                cVar2.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(androidx.lifecycle.t tVar) {
        if (tVar != this.E) {
            this.E = tVar;
            r0.i(this, tVar);
        }
    }

    public final void setModifier(v1.o oVar) {
        if (oVar != this.A) {
            this.A = oVar;
            ej.c cVar = this.B;
            if (cVar != null) {
                cVar.invoke(oVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(ej.c cVar) {
        this.D = cVar;
    }

    public final void setOnModifierChanged$ui(ej.c cVar) {
        this.B = cVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(ej.c cVar) {
        this.M = cVar;
    }

    public final void setRelease(ej.a aVar) {
        this.f17834z = aVar;
    }

    public final void setReset(ej.a aVar) {
        this.f17833f = aVar;
    }

    public final void setSavedStateRegistryOwner(a7.f fVar) {
        if (fVar != this.F) {
            this.F = fVar;
            uk.c.P(this, fVar);
        }
    }

    public final void setUpdate(ej.a aVar) {
        this.f17831d = aVar;
        this.f17832e = true;
        this.K.a();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
