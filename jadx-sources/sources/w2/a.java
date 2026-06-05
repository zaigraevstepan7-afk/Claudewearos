package w2;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.anonlab.voidlauncher.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public boolean A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f18188a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f18189b;

    /* renamed from: c, reason: collision with root package name */
    public u2 f18190c;

    /* renamed from: d, reason: collision with root package name */
    public f1.p f18191d;

    /* renamed from: e, reason: collision with root package name */
    public d1 f18192e;

    /* renamed from: f, reason: collision with root package name */
    public e5.e f18193f;

    /* renamed from: z, reason: collision with root package name */
    public boolean f18194z;

    public a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        c2.e eVar = new c2.e(this, 6);
        addOnAttachStateChangeListener(eVar);
        vf.j jVar = new vf.j(2);
        a.a.D(this).f8696a.add(jVar);
        this.f18193f = new e5.e(this, eVar, jVar, 2);
    }

    private final void setParentContext(f1.p pVar) {
        if (this.f18191d != pVar) {
            this.f18191d = pVar;
            if (pVar != null) {
                this.f18188a = null;
            }
            u2 u2Var = this.f18190c;
            if (u2Var != null) {
                u2Var.a();
                this.f18190c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f18189b != iBinder) {
            this.f18189b = iBinder;
            this.f18188a = null;
        }
    }

    public abstract void a(int i10, f1.i0 i0Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f18192e == null) {
                t tVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof t) {
                        tVar = (t) childAt;
                    }
                }
                if (tVar != null) {
                    tVar.setComposeViewContext(l(f0.h(this), tVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.A) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        d1 d1Var;
        View view;
        if (this.f18191d == null && !isAttachedToWindow() && ((d1Var = this.f18192e) == null || (view = d1Var.f18226a) == null || !view.isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void e() {
        View childAt = getChildAt(0);
        t tVar = childAt instanceof t ? (t) childAt : null;
        if (tVar != null && tVar.f18389c1) {
            tVar.getComposeViewContext().b();
            tVar.f18389c1 = false;
        }
        u2 u2Var = this.f18190c;
        if (u2Var != null) {
            u2Var.a();
        }
        this.f18190c = null;
        requestLayout();
    }

    public final void f() {
        if (this.f18190c == null) {
            try {
                this.A = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    d1 d1VarJ = this.f18192e;
                    if (d1VarJ == null) {
                        d1VarJ = j();
                    }
                    this.f18190c = w2.a(this, d1VarJ, new p1.e(new s.f(this, 3), true, 1003123809));
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } finally {
                this.A = false;
            }
        }
    }

    public void g(boolean z2, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m7getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        s0 s0Var = tag instanceof s0 ? (s0) tag : null;
        if (s0Var != null) {
            return s0Var.f18372a;
        }
        return 1;
    }

    public final d1 getComposeViewContext$ui() {
        return this.f18192e;
    }

    public final boolean getHasComposition() {
        return this.f18190c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f18194z;
    }

    public void h(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.B || super.isTransitionGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w2.d1 j() {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L1c
        L9:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof w2.t
            if (r2 == 0) goto L15
            w2.t r0 = (w2.t) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L7
            w2.d1 r0 = r0.getComposeViewContext()
        L1c:
            android.view.View r4 = w2.f0.h(r9)
            w2.d1 r2 = w2.f0.i(r4)
            if (r2 != 0) goto L80
            f1.p r5 = r9.k()
            androidx.lifecycle.t r2 = androidx.lifecycle.r0.e(r4)
            if (r2 != 0) goto L38
            if (r0 == 0) goto L35
            androidx.lifecycle.t r2 = r0.f18228c
            goto L36
        L35:
            r2 = r1
        L36:
            if (r2 == 0) goto L3a
        L38:
            r6 = r2
            goto L42
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            r0.<init>(r1)
            throw r0
        L42:
            a7.f r2 = uk.c.C(r4)
            if (r2 != 0) goto L50
            if (r0 == 0) goto L4d
            a7.f r2 = r0.f18229d
            goto L4e
        L4d:
            r2 = r1
        L4e:
            if (r2 == 0) goto L52
        L50:
            r7 = r2
            goto L5a
        L52:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            r0.<init>(r1)
            throw r0
        L5a:
            androidx.lifecycle.b1 r2 = androidx.lifecycle.r0.f(r4)
            if (r2 != 0) goto L66
            if (r0 == 0) goto L64
            androidx.lifecycle.b1 r1 = r0.f18230e
        L64:
            r8 = r1
            goto L67
        L66:
            r8 = r2
        L67:
            w2.d1 r2 = new w2.d1
            android.view.View r0 = w2.f0.h(r4)
            w2.d1 r3 = w2.f0.i(r0)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1 = 2131361876(0x7f0a0054, float:1.8343517E38)
            r4.setTag(r1, r0)
            return r2
        L80:
            w2.d1 r0 = r9.l(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.a.j():w2.d1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f1.p k() {
        f1.a2 a2Var;
        ti.h hVar;
        f1.e eVar;
        f1.p pVarA = this.f18191d;
        if (pVarA == null) {
            pVarA = s2.a(this);
            if (pVarA == null) {
                Object parent = getParent();
                while (pVarA == null && (parent instanceof View)) {
                    View view = (View) parent;
                    pVarA = s2.a(view);
                    parent = u3.a.f(view);
                }
            }
            if (pVarA != null) {
                f1.p pVar = (!(pVarA instanceof f1.a2) || ((f1.w1) ((f1.a2) pVarA).f6263u.getValue()).compareTo(f1.w1.f6472b) > 0) ? pVarA : null;
                if (pVar != null) {
                    this.f18188a = new WeakReference(pVar);
                }
            } else {
                pVarA = null;
            }
            if (pVarA == null) {
                WeakReference weakReference = this.f18188a;
                if (weakReference == null || (pVarA = (f1.p) weakReference.get()) == null || ((pVarA instanceof f1.a2) && ((f1.w1) ((f1.a2) pVarA).f6263u.getValue()).compareTo(f1.w1.f6472b) <= 0)) {
                    pVarA = null;
                }
                if (pVarA == null) {
                    if (!isAttachedToWindow()) {
                        s2.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object objF = u3.a.f(this);
                    View view2 = this;
                    while (objF instanceof View) {
                        View view3 = (View) objF;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        objF = view3.getParent();
                    }
                    f1.p pVarA2 = s2.a(view2);
                    if (pVarA2 == null) {
                        ((m2) n2.f18335a.get()).getClass();
                        ti.i iVar = ti.i.f16336a;
                        pi.m mVar = l0.F;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            hVar = (ti.h) l0.F.getValue();
                        } else {
                            hVar = (ti.h) l0.G.get();
                            if (hVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        ti.h hVarV = hVar.V(iVar);
                        f1.e eVar2 = (f1.e) hVarV.C(f1.f.f6289c);
                        if (eVar2 != null) {
                            f1.e eVar3 = new f1.e(eVar2);
                            f0.a1 a1Var = (f0.a1) eVar3.f6282c;
                            synchronized (a1Var.f6105b) {
                                a1Var.f6104a = false;
                                eVar = eVar3;
                            }
                        } else {
                            eVar = 0;
                        }
                        fj.v vVar = new fj.v();
                        ti.h w1Var = (v1.p) hVarV.C(v1.b.H);
                        if (w1Var == null) {
                            w1Var = new w1(view2.getContext().getApplicationContext());
                            vVar.f6807a = w1Var;
                        }
                        if (eVar != 0) {
                            iVar = eVar;
                        }
                        ti.h hVarV2 = hVarV.V(iVar).V(w1Var);
                        f1.a2 a2Var2 = new f1.a2(hVarV2);
                        synchronized (a2Var2.f6246c) {
                            a2Var2.f6262t = true;
                        }
                        vj.d dVarB = qj.b0.b(hVarV2);
                        androidx.lifecycle.t tVarE = androidx.lifecycle.r0.e(view2);
                        androidx.lifecycle.v vVarH = tVarE != null ? tVarE.h() : null;
                        if (vVarH == null) {
                            s2.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new b3.e();
                        }
                        view2.addOnAttachStateChangeListener(new o2(view2, a2Var2));
                        vVarH.a(new q2(dVarB, eVar, a2Var2, vVar));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, a2Var2);
                        qj.z0 z0Var = qj.z0.f13644a;
                        Handler handler = view2.getHandler();
                        int i10 = rj.e.f14556a;
                        view2.addOnAttachStateChangeListener(new c2.e(qj.b0.w(z0Var, new rj.d(handler, "windowRecomposer cleanup", false).f14555f, new t0.f(a2Var2, view2, cVar, 11), 2), 7));
                        a2Var = a2Var2;
                    } else {
                        if (!(pVarA2 instanceof f1.a2)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        a2Var = (f1.a2) pVarA2;
                    }
                    cVar = ((f1.w1) a2Var.f6263u.getValue()).compareTo(f1.w1.f6472b) > 0 ? a2Var : null;
                    if (cVar != null) {
                        this.f18188a = new WeakReference(cVar);
                    }
                    return a2Var;
                }
            }
        }
        return pVarA;
    }

    public final d1 l(View view, d1 d1Var) {
        f1.p pVarK = k();
        androidx.lifecycle.t tVarE = androidx.lifecycle.r0.e(view);
        androidx.lifecycle.b1 b1VarF = androidx.lifecycle.r0.f(view);
        a7.f fVarC = uk.c.C(view);
        f1.p pVar = d1Var.f18227b;
        a7.f fVar = d1Var.f18229d;
        androidx.lifecycle.t tVar = d1Var.f18228c;
        if (pVarK == pVar && tVarE == tVar && b1VarF == d1Var.f18230e && fVarC == fVar) {
            return d1Var;
        }
        if (pVarK.j() != d1Var.f18227b.j()) {
            e();
        }
        if (tVarE == null) {
            tVarE = tVar;
        }
        d1 d1Var2 = new d1(d1Var, view, pVarK, tVarE, fVarC == null ? fVar : fVarC, b1VarF);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(d1Var2));
        return d1Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        q.g0 g0Var = s2.f18375a;
        Object objF = u3.a.f(this);
        View view = this;
        while (objF instanceof View) {
            View view2 = (View) objF;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objF = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new ac.o(this, 21));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        g(z2, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        h(i10, i11);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m8setAutoClearFocusBehavior17tfJxM(int i10) {
        setTag(R.id.auto_clear_focus_behavior_tag, new s0(i10));
    }

    public final void setComposeViewContext$ui(d1 d1Var) {
        if (this.f18192e != d1Var) {
            if (d1Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                t tVar = childAt instanceof t ? (t) childAt : null;
                if (tVar != null) {
                    if (tVar.getCoroutineContext() != d1Var.f18227b.j()) {
                        e();
                    }
                    tVar.setComposeViewContext(d1Var);
                }
            }
            this.f18192e = d1Var;
        }
    }

    public final void setParentCompositionContext(f1.p pVar) {
        setParentContext(pVar);
    }

    public final void setShowLayoutBounds(boolean z2) {
        this.f18194z = z2;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((t) ((v2.r1) childAt)).setShowLayoutBounds(z2);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z2) {
        super.setTransitionGroup(z2);
        this.B = true;
    }

    public final void setViewCompositionStrategy(g2 g2Var) {
        e5.e eVar = this.f18193f;
        if (eVar != null) {
            eVar.a();
        }
        ((f0) g2Var).getClass();
        c2.e eVar2 = new c2.e(this, 6);
        addOnAttachStateChangeListener(eVar2);
        vf.j jVar = new vf.j(2);
        a.a.D(this).f8696a.add(jVar);
        this.f18193f = new e5.e(this, eVar2, jVar, 2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        c();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z2) {
        c();
        return super.addViewInLayout(view, i10, layoutParams, z2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        c();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i10, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
