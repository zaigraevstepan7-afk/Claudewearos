package w2;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.internal.ads.zzbch;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t extends ViewGroup implements v2.r1, v2.y1, p2.i, androidx.lifecycle.e, v2.p1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, a2.k {

    /* renamed from: g1, reason: collision with root package name */
    public static Class f18376g1;

    /* renamed from: h1, reason: collision with root package name */
    public static Method f18377h1;

    /* renamed from: i1, reason: collision with root package name */
    public static Method f18378i1;

    /* renamed from: j1, reason: collision with root package name */
    public static final q.b0 f18379j1 = new q.b0();

    /* renamed from: k1, reason: collision with root package name */
    public static ac.a f18380k1;

    /* renamed from: l1, reason: collision with root package name */
    public static Method f18381l1;
    public q1.d A;
    public long A0;
    public final qi.j B;
    public final f1.j1 B0;
    public final j C;
    public final f1.y C0;
    public final f1.j1 D;
    public ej.c D0;
    public final View E;
    public l3.w E0;
    public final a2.q F;
    public l3.u F0;
    public ti.h G;
    public final AtomicReference G0;
    public final y1.b H;
    public g1 H0;
    public final r1 I;
    public final k3.h I0;
    public final f1.j1 J;
    public final f1.a1 J0;
    public final f1.y K;
    public final f1.j1 K0;
    public final c2.v L;
    public final k2.a L0;
    public final o0 M;
    public final l2.c M0;
    public final t2.q N;
    public final u2.c N0;
    public final v2.f0 O;
    public final j0 O0;
    public final q.v P;
    public MotionEvent P0;
    public final e3.b Q;
    public long Q0;
    public final d3.t R;
    public final q5.b R0;
    public final y S;
    public final q.b0 S0;
    public x1.e T;
    public float T0;
    public final g U;
    public float U0;
    public final c2.f V;
    public final t7.s V0;
    public final w1.j W;
    public final j W0;
    public boolean X0;
    public final com.google.android.gms.common.api.internal.x Y0;
    public final n Z0;

    /* renamed from: a, reason: collision with root package name */
    public final f1.j1 f18382a;

    /* renamed from: a0, reason: collision with root package name */
    public final q.b0 f18383a0;
    public final t0 a1;

    /* renamed from: b, reason: collision with root package name */
    public long f18384b;

    /* renamed from: b0, reason: collision with root package name */
    public q.b0 f18385b0;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f18386b1;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18387c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f18388c0;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f18389c1;

    /* renamed from: d, reason: collision with root package name */
    public m2.a f18390d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f18391d0;

    /* renamed from: d1, reason: collision with root package name */
    public final ag.i f18392d1;

    /* renamed from: e, reason: collision with root package name */
    public final v2.h0 f18393e;

    /* renamed from: e0, reason: collision with root package name */
    public final p2.k f18394e0;

    /* renamed from: e1, reason: collision with root package name */
    public View f18395e1;

    /* renamed from: f, reason: collision with root package name */
    public t1 f18396f;

    /* renamed from: f0, reason: collision with root package name */
    public final b1.i f18397f0;

    /* renamed from: f1, reason: collision with root package name */
    public final q f18398f1;

    /* renamed from: g0, reason: collision with root package name */
    public final f1.j1 f18399g0;

    /* renamed from: h0, reason: collision with root package name */
    public final f1.y f18400h0;

    /* renamed from: i0, reason: collision with root package name */
    public final wh.s f18401i0;

    /* renamed from: j0, reason: collision with root package name */
    public final w1.c f18402j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f18403k0;

    /* renamed from: l0, reason: collision with root package name */
    public final i f18404l0;

    /* renamed from: m0, reason: collision with root package name */
    public final h f18405m0;

    /* renamed from: n0, reason: collision with root package name */
    public final v2.t1 f18406n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f18407o0;

    /* renamed from: p0, reason: collision with root package name */
    public p0 f18408p0;

    /* renamed from: q0, reason: collision with root package name */
    public s3.a f18409q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f18410r0;

    /* renamed from: s0, reason: collision with root package name */
    public final v2.t0 f18411s0;

    /* renamed from: t0, reason: collision with root package name */
    public long f18412t0;

    /* renamed from: u0, reason: collision with root package name */
    public final int[] f18413u0;

    /* renamed from: v0, reason: collision with root package name */
    public final float[] f18414v0;
    public final float[] w0;
    public final float[] x0;
    public long y0;

    /* renamed from: z, reason: collision with root package name */
    public u1 f18415z;
    public boolean z0;

    public t(Context context, d1 d1Var) {
        super(context);
        this.f18382a = f1.s.A(d1Var);
        this.f18384b = 9205357640488583168L;
        int i10 = 1;
        this.f18387c = true;
        this.f18393e = d1Var.f18242r;
        this.A = q1.a.f13174a;
        this.B = new qi.j();
        int i11 = 0;
        this.C = new j(this, i11);
        this.D = new f1.j1(u6.v.b(context), f1.f.f6291e);
        this.F = new a2.q(this, this);
        this.G = d1Var.f18227b.j();
        this.H = new y1.b();
        this.I = new r1();
        this.J = f1.s.A(Boolean.FALSE);
        this.K = f1.s.q(new n(this, i11));
        this.L = d1Var.f18244t;
        this.M = d1Var.f18241q;
        this.N = new t2.q();
        int i12 = 3;
        v2.f0 f0Var = new v2.f0(3);
        f0Var.c0(t2.i1.f15578b);
        f0Var.Z(getDensity());
        f0Var.e0(getViewConfiguration());
        f0Var.d0(new r(this).c(((a2.q) getFocusOwner()).f48e).c(m15getDragAndDropManager().f20159c));
        this.O = f0Var;
        q.v vVar = q.l.f13102a;
        this.P = new q.v();
        getLayoutNodes();
        this.Q = new e3.b(this);
        this.R = new d3.t(getRoot(), new d3.f(), getLayoutNodes());
        y yVar = new y(this);
        this.S = yVar;
        this.T = new x1.e(this, new a2.i(0, this, f0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 12));
        this.U = d1Var.j;
        this.V = new c2.f(this);
        this.W = new w1.j();
        this.f18383a0 = new q.b0();
        this.f18394e0 = new p2.k();
        v2.f0 root = getRoot();
        b1.i iVar = new b1.i();
        iVar.f1488b = root;
        iVar.f1489c = new p2.d(root.Y.f17583c);
        int i13 = 15;
        iVar.f1490d = new ag.i(15);
        iVar.f1491e = new v2.q();
        this.f18397f0 = iVar;
        this.f18399g0 = f1.s.A(new Configuration(context.getResources().getConfiguration()));
        this.f18400h0 = f1.s.q(new n(this, i10));
        w1.j autofillTree = getAutofillTree();
        wh.s sVar = new wh.s();
        sVar.f19379a = this;
        sVar.f19380b = autofillTree;
        AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        sVar.f19381c = autofillManager;
        setImportantForAutofill(1);
        AutofillId autofillId = getAutofillId();
        if (autofillId == null) {
            throw t.m1.e("Required value was null.");
        }
        sVar.f19382d = autofillId;
        this.f18401i0 = sVar;
        AutofillManager autofillManager2 = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager2 == null) {
            throw t.m1.e("Autofill service could not be located.");
        }
        this.f18402j0 = new w1.c(new yh.c(autofillManager2, 22), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f18404l0 = d1Var.f18236l;
        this.f18405m0 = d1Var.f18237m;
        this.f18406n0 = new v2.t1(new p(this, i10));
        this.f18411s0 = new v2.t0(getRoot());
        long j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f18412t0 = (j & 4294967295L) | (j << 32);
        this.f18413u0 = new int[]{0, 0};
        float[] fArrA = c2.k0.a();
        this.f18414v0 = fArrA;
        this.w0 = c2.k0.a();
        this.x0 = c2.k0.a();
        this.y0 = -1L;
        this.A0 = 9187343241974906880L;
        this.B0 = f1.s.A(null);
        this.C0 = f1.s.q(new n(this, i12));
        this.G0 = new AtomicReference(null);
        this.I0 = d1Var.f18238n;
        this.J0 = d1Var.f18239o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = a2.h.f23a;
        s3.m mVar = layoutDirection != 0 ? layoutDirection != 1 ? null : s3.m.f14753b : s3.m.f14752a;
        this.K0 = f1.s.A(mVar == null ? s3.m.f14752a : mVar);
        this.L0 = d1Var.f18240p;
        int i14 = 2;
        this.M0 = new l2.c(isInTouchMode() ? 1 : 2);
        u2.c cVar = new u2.c();
        new g1.e(new v2.b[16]);
        new g1.e(new u2.b[16]);
        new g1.e(new v2.f0[16]);
        new g1.e(new u2.b[16]);
        this.N0 = cVar;
        j0 j0Var = new j0();
        new x9.b(new a2.f0(j0Var, i13));
        f2[] f2VarArr = f2.f18278a;
        this.O0 = j0Var;
        this.R0 = new q5.b(16);
        this.S0 = new q.b0();
        this.V0 = new t7.s(this, i10);
        this.W0 = new j(this, i10);
        this.Y0 = new com.google.android.gms.common.api.internal.x(context, new p(this, i11));
        this.Z0 = new n(this, i14);
        int i15 = Build.VERSION.SDK_INT;
        this.a1 = i15 < 29 ? new k4.i(fArrA) : new u0();
        addOnAttachStateChangeListener(this.T);
        setWillNotDraw(false);
        setFocusable(true);
        e0.f18249a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        t4.l0.l(this, yVar);
        setOnDragListener(m15getDragAndDropManager());
        getRoot().d(this);
        if (i15 >= 29) {
            a0.f18195a.a(this);
        }
        if (r()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.E = view;
            addView(view, -1);
        }
        this.f18392d1 = i15 >= 31 ? new ag.i(3) : null;
        this.f18398f1 = new q(this);
    }

    public static final void c(t tVar, int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        y yVar = tVar.S;
        if (fj.l.b(str, yVar.W)) {
            int iD2 = yVar.U.d(i10, -1);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!fj.l.b(str, yVar.X) || (iD = yVar.V.d(i10, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.K.getValue()).booleanValue();
    }

    private final l3.w getLegacyTextInputServiceAndroid() {
        l3.w wVar = this.E0;
        if (wVar != null) {
            return wVar;
        }
        l3.w wVar2 = new l3.w(getView(), this);
        this.E0 = wVar2;
        return wVar2;
    }

    private final d1 get_composeViewContext() {
        return (d1) this.f18382a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l get_viewTreeOwners() {
        m6.a.q(this.B0.getValue());
        return null;
    }

    public static void i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof t) {
                ((t) childAt).B();
            } else if (childAt instanceof ViewGroup) {
                i((ViewGroup) childAt);
            }
        }
    }

    public static long j(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static View k(View view, int i10) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (fj.l.b(declaredMethod.invoke(view, null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View viewK = k(viewGroup.getChildAt(i11), i10);
                    if (viewK != null) {
                        return viewK;
                    }
                }
            }
        }
        return null;
    }

    public static void p(v2.f0 f0Var) {
        f0Var.C();
        g1.e eVarY = f0Var.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            p((v2.f0) objArr[i11]);
        }
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean s(MotionEvent motionEvent) {
        boolean z2 = (Float.floatToRawIntBits(motionEvent.getX()) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040;
        if (!z2) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                z2 = (Float.floatToRawIntBits(motionEvent.getX(i10)) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i10)) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !x1.f18453a.a(motionEvent, i10));
                if (z2) {
                    break;
                }
            }
        }
        return z2;
    }

    private final void setAttached(boolean z2) {
        this.J.setValue(Boolean.valueOf(z2));
    }

    private void setDensity(s3.c cVar) {
        this.D.setValue(cVar);
    }

    private void setFontFamilyResolver(k3.i iVar) {
        this.J0.setValue(iVar);
    }

    private void setLayoutDirection(s3.m mVar) {
        this.K0.setValue(mVar);
    }

    private final void set_composeViewContext(d1 d1Var) {
        this.f18382a.setValue(d1Var);
    }

    private final void set_viewTreeOwners(l lVar) {
        this.B0.setValue(lVar);
    }

    public final void A(v2.q1 q1Var, boolean z2) {
        q.b0 b0Var = this.f18383a0;
        if (!z2) {
            if (this.f18388c0) {
                return;
            }
            b0Var.j(q1Var);
            q.b0 b0Var2 = this.f18385b0;
            if (b0Var2 != null) {
                b0Var2.j(q1Var);
                return;
            }
            return;
        }
        if (!this.f18388c0) {
            b0Var.a(q1Var);
            return;
        }
        q.b0 b0Var3 = this.f18385b0;
        if (b0Var3 == null) {
            b0Var3 = new q.b0();
            this.f18385b0 = b0Var3;
        }
        b0Var3.a(q1Var);
    }

    public final void B() {
        if (this.f18403k0) {
            t1.v vVar = getSnapshotObserver().f17770a;
            synchronized (vVar.f15510g) {
                try {
                    g1.e eVar = vVar.f15509f;
                    int i10 = eVar.f7026c;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        t1.u uVar = (t1.u) eVar.f7024a[i12];
                        uVar.d();
                        if (!uVar.f15497f.j()) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr = eVar.f7024a;
                            objArr[i12 - i11] = objArr[i12];
                        }
                    }
                    int i13 = i10 - i11;
                    Arrays.fill(eVar.f7024a, i13, i10, (Object) null);
                    eVar.f7026c = i13;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f18403k0 = false;
        }
        p0 p0Var = this.f18408p0;
        if (p0Var != null) {
            i(p0Var);
        }
        w1.c cVar = this.f18402j0;
        if (cVar != null) {
            q.w wVar = cVar.A;
            if (wVar.f13142d == 0 && cVar.B) {
                ((AutofillManager) cVar.f18168a.f20314b).commit();
                cVar.B = false;
            }
            if (wVar.f13142d != 0) {
                cVar.B = true;
            }
        }
        while (this.S0.i() && this.S0.f(0) != null) {
            int i14 = this.S0.f13034b;
            for (int i15 = 0; i15 < i14; i15++) {
                ej.a aVar = (ej.a) this.S0.f(i15);
                this.S0.n(i15, null);
                if (aVar != null) {
                    aVar.a();
                }
            }
            this.S0.l(0, i14);
        }
    }

    public final void C(v2.f0 f0Var) {
        y yVar = this.S;
        yVar.Q = true;
        if (yVar.v()) {
            yVar.w(f0Var);
        }
        x1.e eVar = this.T;
        eVar.f19795z = true;
        if (eVar.h()) {
            eVar.A.h(pi.o.f13011a);
        }
    }

    public final void D(v2.f0 f0Var, boolean z2, boolean z10, boolean z11) {
        v2.f0 f0VarU;
        v2.f0 f0VarU2;
        v2.t0 t0Var = this.f18411s0;
        if (!z2) {
            if (t0Var.r(f0Var, z10) && z11) {
                J(f0Var);
                return;
            }
            return;
        }
        p1.l lVar = t0Var.f17762b;
        v2.f0 f0Var2 = f0Var.A;
        v2.j0 j0Var = f0Var.Z;
        if (f0Var2 == null) {
            s2.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = j0Var.f17692d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new b3.e();
                }
                if (!j0Var.f17693e || z10) {
                    j0Var.f17693e = true;
                    j0Var.f17703p.N = true;
                    if (f0Var.f17637j0) {
                        return;
                    }
                    if ((fj.l.b(f0Var.I(), Boolean.TRUE) || v2.t0.i(f0Var)) && ((f0VarU = f0Var.u()) == null || !f0VarU.Z.f17693e)) {
                        lVar.b(f0Var, v2.t.f17756a);
                    } else if ((f0Var.H() || v2.t0.j(f0Var)) && ((f0VarU2 = f0Var.u()) == null || !f0VarU2.q())) {
                        lVar.b(f0Var, v2.t.f17758c);
                    }
                    if (t0Var.f17764d || !z11) {
                        return;
                    }
                    J(f0Var);
                    return;
                }
                return;
            }
        }
        t0Var.f17768h.b(new v2.s0(f0Var, true, z10));
    }

    public final void E(v2.f0 f0Var, boolean z2, boolean z10) {
        v2.j0 j0Var = f0Var.Z;
        v2.t0 t0Var = this.f18411s0;
        if (!z2) {
            t0Var.getClass();
            int iOrdinal = j0Var.f17692d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new b3.e();
            }
            v2.f0 f0VarU = f0Var.u();
            boolean z11 = f0VarU == null || f0VarU.H();
            if (!z10) {
                if (f0Var.q()) {
                    return;
                }
                if (f0Var.p() && f0Var.H() == z11 && f0Var.H() == j0Var.f17703p.M) {
                    return;
                }
            }
            v2.v0 v0Var = j0Var.f17703p;
            v0Var.O = true;
            v0Var.P = true;
            if (!f0Var.f17637j0 && v0Var.M && z11) {
                if ((f0VarU == null || !f0VarU.p()) && (f0VarU == null || !f0VarU.q())) {
                    t0Var.f17762b.b(f0Var, v2.t.f17759d);
                }
                if (t0Var.f17764d) {
                    return;
                }
                J(null);
                return;
            }
            return;
        }
        p1.l lVar = t0Var.f17762b;
        int iOrdinal2 = j0Var.f17692d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new b3.e();
                }
            }
        }
        if ((j0Var.f17693e || j0Var.f17694f) && !z10) {
            return;
        }
        j0Var.f17694f = true;
        j0Var.f17695g = true;
        v2.v0 v0Var2 = j0Var.f17703p;
        v0Var2.O = true;
        v0Var2.P = true;
        if (f0Var.f17637j0) {
            return;
        }
        v2.f0 f0VarU2 = f0Var.u();
        if (fj.l.b(f0Var.I(), Boolean.TRUE) && ((f0VarU2 == null || !f0VarU2.Z.f17693e) && (f0VarU2 == null || !f0VarU2.Z.f17694f))) {
            lVar.b(f0Var, v2.t.f17757b);
        } else if (f0Var.H() && ((f0VarU2 == null || !f0VarU2.p()) && (f0VarU2 == null || !f0VarU2.q()))) {
            lVar.b(f0Var, v2.t.f17759d);
        }
        if (t0Var.f17764d) {
            return;
        }
        J(null);
    }

    public final void F() {
        y yVar = this.S;
        yVar.Q = true;
        Handler handler = yVar.f18458d.getHandler();
        if (yVar.v() && !yVar.f18456b0 && handler != null) {
            yVar.f18456b0 = true;
            handler.post(yVar.f18459d0);
        }
        x1.e eVar = this.T;
        eVar.f19795z = true;
        Handler handler2 = eVar.f19789a.getHandler();
        if (!eVar.h() || eVar.F || handler2 == null) {
            return;
        }
        eVar.F = true;
        handler2.post(eVar.G);
    }

    public final void G() {
        if (this.z0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.y0) {
            this.y0 = jCurrentAnimationTimeMillis;
            t0 t0Var = this.a1;
            float[] fArr = this.w0;
            t0Var.a(this, fArr);
            f0.o(fArr, this.x0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f18413u0;
            view.getLocationOnScreen(iArr);
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            float f12 = iArr[0];
            float f13 = f11 - iArr[1];
            this.A0 = (Float.floatToRawIntBits(f10 - f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
        }
    }

    public final void H(MotionEvent motionEvent) {
        this.y0 = AnimationUtils.currentAnimationTimeMillis();
        t0 t0Var = this.a1;
        float[] fArr = this.w0;
        t0Var.a(this, fArr);
        f0.o(fArr, this.x0);
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        long jB = c2.k0.b((Float.floatToRawIntBits(x2) << 32) | (Float.floatToRawIntBits(y2) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.A0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean I() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void J(v2.f0 f0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (f0Var != null) {
            while (f0Var != null && f0Var.r() == v2.d0.f17602a) {
                if (!this.f18410r0) {
                    v2.f0 f0VarU = f0Var.u();
                    if (f0VarU == null) {
                        break;
                    }
                    long j = f0VarU.Y.f17583c.f15553d;
                    if (s3.a.f(j) && s3.a.e(j)) {
                        break;
                    }
                }
                f0Var = f0Var.u();
            }
            if (f0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long K(long j) {
        G();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.A0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.A0 & 4294967295L));
        return c2.k0.b((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.x0);
    }

    public final int L(MotionEvent motionEvent) {
        Object obj;
        if (this.f18386b1) {
            this.f18386b1 = false;
            r1 r1Var = getComposeViewContext().f18243s;
            int metaState = motionEvent.getMetaState();
            r1Var.getClass();
            l2.f18323a.setValue(new p2.f0(metaState));
        }
        p2.k kVar = this.f18394e0;
        mh.g gVarC = kVar.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        b1.i iVar = this.f18397f0;
        if (gVarC == null) {
            if (!iVar.f1487a) {
                ((q.p) ((ag.i) iVar.f1490d).f449b).a();
                ((p2.d) iVar.f1489c).c();
            }
            return 0;
        }
        List list = (List) gVarC.f11707b;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                obj = list.get(size);
                if (((p2.y) obj).f12783e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
            obj = null;
        } else {
            obj = null;
        }
        p2.y yVar = (p2.y) obj;
        if (yVar != null) {
            this.f18384b = yVar.f12782d;
        }
        int iA = iVar.a(gVarC, this, t(motionEvent));
        gVarC.f11708c = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iA & 1) != 0) {
            return iA;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        kVar.f12709c.delete(pointerId);
        kVar.f12708b.delete(pointerId);
        return iA;
    }

    public final void M(MotionEvent motionEvent, int i10, long j, boolean z2) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            float f10 = pointerCoords.x;
            long jW = w((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jW >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jW & 4294967295L));
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z2 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        mh.g gVarC = this.f18394e0.c(motionEventObtain, this);
        fj.l.c(gVarC);
        this.f18397f0.a(gVarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(ej.e r6, vi.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof w2.s
            if (r0 == 0) goto L13
            r0 = r7
            w2.s r0 = (w2.s) r0
            int r1 = r0.f18371c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18371c = r1
            goto L18
        L13:
            w2.s r0 = new w2.s
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18369a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f18371c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            uk.c.R(r7)
            goto L49
        L2f:
            uk.c.R(r7)
            w2.p r7 = new w2.p
            r2 = 2
            r7.<init>(r5, r2)
            r0.f18371c = r3
            ab.q r2 = new ab.q
            r3 = 0
            java.util.concurrent.atomic.AtomicReference r4 = r5.G0
            r2.<init>(r7, r4, r6, r3)
            java.lang.Object r6 = qj.b0.h(r2, r0)
            if (r6 != r1) goto L49
            return
        L49:
            b3.e r6 = new b3.e
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.t.N(ej.e, vi.c):void");
    }

    public final void O(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (fj.l.b(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(u6.v.b(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.I.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.t.P():void");
    }

    public final void Q(float f10) {
        if (r()) {
            if (f10 > 0.0f) {
                if (Float.isNaN(this.T0) || f10 > this.T0) {
                    this.T0 = f10;
                    return;
                }
                return;
            }
            if (f10 < 0.0f) {
                if (Float.isNaN(this.U0) || f10 < this.U0) {
                    this.U0 = f10;
                }
            }
        }
    }

    @Override // a2.k
    public final void a(a2.e0 e0Var, a2.e0 e0Var2) {
        v2.b1 b1Var;
        boolean z2;
        v2.b1 b1Var2;
        boolean z10;
        if (e0Var != null) {
            a2.e0 e0Var3 = e0Var;
            if (!e0Var3.f17565a.G) {
                s2.a.b("visitAncestors called on an unattached node");
            }
            v1.n nVar = e0Var3.f17565a;
            v2.f0 f0VarY = v2.n.y(e0Var);
            q.h0 h0Var = null;
            ArrayList arrayList = null;
            while (f0VarY != null) {
                if ((f0VarY.Y.f17586f.f17568d & 2097152) != 0) {
                    while (nVar != null) {
                        if ((nVar.f17567c & 2097152) != 0) {
                            v1.n nVarE = nVar;
                            g1.e eVar = null;
                            while (nVarE != null) {
                                if (nVarE instanceof m2.c) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nVarE);
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (z10 && (nVarE.f17567c & 2097152) != 0 && (nVarE instanceof v2.k)) {
                                    int i10 = 0;
                                    for (v1.n nVar2 = ((v2.k) nVarE).I; nVar2 != null; nVar2 = nVar2.f17570f) {
                                        if ((nVar2.f17567c & 2097152) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                nVarE = nVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new g1.e(new v1.n[16]);
                                                }
                                                if (nVarE != null) {
                                                    eVar.b(nVarE);
                                                    nVarE = null;
                                                }
                                                eVar.b(nVar2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                nVarE = v2.n.e(eVar);
                            }
                        }
                        nVar = nVar.f17569e;
                    }
                }
                f0VarY = f0VarY.u();
                nVar = (f0VarY == null || (b1Var2 = f0VarY.Y) == null) ? null : b1Var2.f17585e;
            }
            if (arrayList == null) {
                return;
            }
            if (e0Var2 != null) {
                if (!e0Var2.f17565a.G) {
                    s2.a.b("visitAncestors called on an unattached node");
                }
                v1.n nVar3 = e0Var2.f17565a;
                v2.f0 f0VarY2 = v2.n.y(e0Var2);
                q.h0 h0Var2 = null;
                while (f0VarY2 != null) {
                    if ((f0VarY2.Y.f17586f.f17568d & 2097152) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f17567c & 2097152) != 0) {
                                v1.n nVarE2 = nVar3;
                                g1.e eVar2 = null;
                                while (nVarE2 != null) {
                                    if (nVarE2 instanceof m2.c) {
                                        if (h0Var2 == null) {
                                            q.h0 h0Var3 = q.o0.f13110a;
                                            h0Var2 = new q.h0();
                                        }
                                        h0Var2.a(nVarE2);
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    if (z2 && (nVarE2.f17567c & 2097152) != 0 && (nVarE2 instanceof v2.k)) {
                                        int i11 = 0;
                                        for (v1.n nVar4 = ((v2.k) nVarE2).I; nVar4 != null; nVar4 = nVar4.f17570f) {
                                            if ((nVar4.f17567c & 2097152) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    nVarE2 = nVar4;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new g1.e(new v1.n[16]);
                                                    }
                                                    if (nVarE2 != null) {
                                                        eVar2.b(nVarE2);
                                                        nVarE2 = null;
                                                    }
                                                    eVar2.b(nVar4);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    nVarE2 = v2.n.e(eVar2);
                                }
                            }
                            nVar3 = nVar3.f17569e;
                        }
                    }
                    f0VarY2 = f0VarY2.u();
                    nVar3 = (f0VarY2 == null || (b1Var = f0VarY2.Y) == null) ? null : b1Var.f17585e;
                }
                h0Var = h0Var2;
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                m2.c cVar = (m2.c) arrayList.get(i12);
                if (!(h0Var != null ? h0Var.c(cVar) : false)) {
                    cVar.z0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        a2.e0 e0Var = ((a2.q) getFocusOwner()).f46c;
        if (!e0Var.G) {
            return;
        }
        if (!e0Var.f17565a.G) {
            s2.a.b("visitSubtreeIf called on an unattached node");
        }
        g1.e eVar = new g1.e(new v1.n[16]);
        v1.n nVar = e0Var.f17565a;
        v1.n nVar2 = nVar.f17570f;
        if (nVar2 == null) {
            v2.n.b(eVar, nVar);
        } else {
            eVar.b(nVar2);
        }
        while (true) {
            int i12 = eVar.f7026c;
            if (i12 == 0) {
                return;
            }
            v1.n nVar3 = (v1.n) eVar.l(i12 - 1);
            if ((nVar3.f17568d & 1024) != 0) {
                for (v1.n nVar4 = nVar3; nVar4 != null && nVar4.G; nVar4 = nVar4.f17570f) {
                    if ((nVar4.f17567c & 1024) != 0) {
                        v1.n nVarE = nVar4;
                        g1.e eVar2 = null;
                        while (nVarE != null) {
                            int i13 = 0;
                            if (nVarE instanceof a2.e0) {
                                a2.e0 e0Var2 = (a2.e0) nVarE;
                                if (e0Var2.G && e0Var2.s1().f56a) {
                                    super.addFocusables(arrayList, i10, i11);
                                    a2.e0 e0Var3 = ((a2.q) getFocusOwner()).f46c;
                                    if (e0Var3.G) {
                                        if (!e0Var3.f17565a.G) {
                                            s2.a.b("visitSubtreeIf called on an unattached node");
                                        }
                                        g1.e eVar3 = new g1.e(new v1.n[16]);
                                        v1.n nVar5 = e0Var3.f17565a;
                                        v1.n nVar6 = nVar5.f17570f;
                                        if (nVar6 == null) {
                                            v2.n.b(eVar3, nVar5);
                                        } else {
                                            eVar3.b(nVar6);
                                        }
                                        while (true) {
                                            int i14 = eVar3.f7026c;
                                            if (i14 == 0) {
                                                break;
                                            }
                                            v1.n nVar7 = (v1.n) eVar3.l(i14 - 1);
                                            if ((nVar7.f17568d & 1024) != 0) {
                                                for (v1.n nVar8 = nVar7; nVar8 != null && nVar8.G; nVar8 = nVar8.f17570f) {
                                                    if ((nVar8.f17567c & 1024) != 0) {
                                                        v1.n nVarE2 = nVar8;
                                                        g1.e eVar4 = null;
                                                        while (nVarE2 != null) {
                                                            if (nVarE2 instanceof a2.e0) {
                                                                a2.e0 e0Var4 = (a2.e0) nVarE2;
                                                                if (e0Var4.G) {
                                                                    a2.u uVarS1 = e0Var4.s1();
                                                                    if (e0Var4.G && !e0Var4.H && uVarS1.f56a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((nVarE2.f17567c & 1024) != 0 && (nVarE2 instanceof v2.k)) {
                                                                int i15 = 0;
                                                                for (v1.n nVar9 = ((v2.k) nVarE2).I; nVar9 != null; nVar9 = nVar9.f17570f) {
                                                                    if ((nVar9.f17567c & 1024) != 0) {
                                                                        i15++;
                                                                        if (i15 == 1) {
                                                                            nVarE2 = nVar9;
                                                                        } else {
                                                                            if (eVar4 == null) {
                                                                                eVar4 = new g1.e(new v1.n[16]);
                                                                            }
                                                                            if (nVarE2 != null) {
                                                                                eVar4.b(nVarE2);
                                                                                nVarE2 = null;
                                                                            }
                                                                            eVar4.b(nVar9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i15 == 1) {
                                                                }
                                                            }
                                                            nVarE2 = v2.n.e(eVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            v2.n.b(eVar3, nVar7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((nVarE.f17567c & 1024) != 0 && (nVarE instanceof v2.k)) {
                                for (v1.n nVar10 = ((v2.k) nVarE).I; nVar10 != null; nVar10 = nVar10.f17570f) {
                                    if ((nVar10.f17567c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            nVarE = nVar10;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new g1.e(new v1.n[16]);
                                            }
                                            if (nVarE != null) {
                                                eVar2.b(nVarE);
                                                nVarE = null;
                                            }
                                            eVar2.b(nVar10);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            nVarE = v2.n.e(eVar2);
                        }
                    }
                }
            }
            v2.n.b(eVar, nVar3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        d3.n nVarW;
        ej.c cVar;
        ej.c cVar2;
        w1.c cVar3 = this.f18402j0;
        if (cVar3 != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                v2.f0 f0Var = (v2.f0) cVar3.f18169b.f4773c.b(iKeyAt);
                if (f0Var != null && (nVarW = f0Var.w()) != null) {
                    q.g0 g0Var = nVarW.f4758a;
                    Object objG = g0Var.g(d3.m.f4739g);
                    if (objG == null) {
                        objG = null;
                    }
                    d3.a aVar = (d3.a) objG;
                    if (aVar != null && (cVar2 = (ej.c) aVar.f4704b) != null) {
                    }
                    Object objG2 = g0Var.g(d3.m.f4740h);
                    d3.a aVar2 = (d3.a) (objG2 != null ? objG2 : null);
                    if (aVar2 != null && (cVar = (ej.c) aVar2.f4704b) != null) {
                    }
                }
            }
        }
        wh.s sVar = this.f18401i0;
        if (sVar != null) {
            w1.j jVar = (w1.j) sVar.f19380b;
            if (jVar.f18179a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i11 = 0; i11 < size2; i11++) {
                int iKeyAt2 = sparseArray.keyAt(i11);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (jVar.f18179a.get(Integer.valueOf(iKeyAt2)) != null) {
                        throw new ClassCastException();
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new pi.g("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new pi.g("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new pi.g("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.e
    public final void b(androidx.lifecycle.t tVar) {
        f1.g gVarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(f0.m());
        }
        u1 u1Var = this.f18415z;
        if (u1Var != null) {
            t1 t1Var = this.f18396f;
            fj.l.c(t1Var);
            s1 s1Var = u1Var.f18427a;
            q1.c cVar = (q1.c) s1Var.f18374b;
            if (!cVar.f13176a || cVar.f13178c) {
                return;
            }
            try {
                gVarS = ((v2) t1Var).f18443a.s(new a2.f0(u1Var, 17));
            } catch (CancellationException unused) {
                q1.c cVar2 = (q1.c) s1Var.f18374b;
                if (!cVar2.f13177b) {
                    if (cVar2.f13178c) {
                        r1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar2.a();
                    cVar2.f13178c = true;
                }
                gVarS = null;
            }
            f1.g gVar = u1Var.f18430d;
            if (gVar != null) {
                gVar.cancel();
            }
            u1Var.f18430d = gVarS;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.S.m(this.f18384b, i10, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.S.m(this.f18384b, i10, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        q.b0 b0Var = this.f18383a0;
        if (!isAttachedToWindow()) {
            p(getRoot());
        }
        x(true);
        t1.m.j().m();
        this.f18388c0 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            c2.v vVar = this.L;
            c2.b bVar = vVar.f3047a;
            Canvas canvas2 = bVar.f2965a;
            bVar.f2965a = canvas;
            getRoot().i(bVar, null);
            vVar.f3047a.f2965a = canvas2;
            if (b0Var.i()) {
                int i10 = b0Var.f13034b;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((l1) ((v2.q1) b0Var.f(i11))).f();
                }
            }
            int i12 = i2.f18301a;
            b0Var.d();
            this.f18388c0 = false;
            Trace.endSection();
            q.b0 b0Var2 = this.f18385b0;
            if (b0Var2 != null) {
                b0Var.c(b0Var2);
                b0Var2.d();
            }
            if (r()) {
                r0.a(this, this.T0);
                View view = this.E;
                if (view != null) {
                    r0.a(view, this.U0);
                    if (!Float.isNaN(this.U0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.T0 = Float.NaN;
                this.U0 = Float.NaN;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04e7 A[PHI: r6
      0x04e7: PHI (r6v50 g1.e) = (r6v73 g1.e), (r6v74 g1.e), (r6v75 g1.e) binds: [B:302:0x04a9, B:304:0x04ad, B:319:0x04e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x06c3 A[PHI: r5
      0x06c3: PHI (r5v37 g1.e) = (r5v92 g1.e), (r5v93 g1.e), (r5v94 g1.e) binds: [B:437:0x0689, B:439:0x068d, B:454:0x06be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r5v84 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instructions count: 1983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.t.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0158  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.t.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((a2.q) getFocusOwner()).d(keyEvent, new a2.d0(17, this, keyEvent));
        }
        r1 r1Var = getComposeViewContext().f18243s;
        int metaState = keyEvent.getMetaState();
        r1Var.getClass();
        l2.f18323a.setValue(new p2.f0(metaState));
        return ((a2.q) getFocusOwner()).d(keyEvent, a2.l.f36a) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        v2.b1 b1Var;
        if (isFocused()) {
            a2.q qVar = (a2.q) getFocusOwner();
            if (qVar.f47d.f35e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                a2.e0 e0VarF = a2.d.f(qVar.f46c);
                if (e0VarF != null) {
                    if (!e0VarF.f17565a.G) {
                        s2.a.b("visitAncestors called on an unattached node");
                    }
                    v1.n nVar = e0VarF.f17565a;
                    v2.f0 f0VarY = v2.n.y(e0VarF);
                    while (f0VarY != null) {
                        if ((f0VarY.Y.f17586f.f17568d & 131072) != 0) {
                            while (nVar != null) {
                                if ((nVar.f17567c & 131072) != 0) {
                                    v1.n nVarE = nVar;
                                    g1.e eVar = null;
                                    while (nVarE != null) {
                                        if ((nVarE.f17567c & 131072) != 0 && (nVarE instanceof v2.k)) {
                                            int i10 = 0;
                                            for (v1.n nVar2 = ((v2.k) nVarE).I; nVar2 != null; nVar2 = nVar2.f17570f) {
                                                if ((nVar2.f17567c & 131072) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        nVarE = nVar2;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new g1.e(new v1.n[16]);
                                                        }
                                                        if (nVarE != null) {
                                                            eVar.b(nVarE);
                                                            nVarE = null;
                                                        }
                                                        eVar.b(nVar2);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        nVarE = v2.n.e(eVar);
                                    }
                                }
                                nVar = nVar.f17569e;
                            }
                        }
                        f0VarY = f0VarY.u();
                        nVar = (f0VarY == null || (b1Var = f0VarY.Y) == null) ? null : b1Var.f17585e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            z.f18468a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object s0Var;
        a2.e0 e0VarF;
        if (this.X0) {
            j jVar = this.W0;
            removeCallbacks(jVar);
            MotionEvent motionEvent2 = this.P0;
            fj.l.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.X0 = false;
            } else {
                jVar.run();
            }
        }
        if (!s(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || u(motionEvent))) {
            int iO = o(motionEvent);
            if ((iO & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z2 = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z10 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z2 && z10) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (s0Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    s0Var = new s0(1);
                }
                if (s0Var.equals(new s0(1)) && (e0VarF = ((a2.q) getFocusOwner()).f()) != null) {
                    v2.i1 i1VarX = v2.n.x(e0VarF);
                    if (!t2.z.h(i1VarX).z(i1VarX, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        ((a2.q) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((iO & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return k(this, i10);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        b2.c cVarA;
        if (view == null || this.f18411s0.f17763c) {
            return super.focusSearch(view, i10);
        }
        View rootView = getRootView();
        fj.l.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i10);
        if (viewFindNextFocus == null || !f0.a(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            a2.e0 e0VarF = a2.d.f(((a2.q) getFocusOwner()).f46c);
            cVarA = e0VarF != null ? a2.d.i(e0VarF) : null;
            if (cVarA == null) {
                cVarA = a2.h.a(view, this);
            }
        } else {
            cVarA = a2.h.a(view, this);
        }
        a2.f fVarD = a2.h.d(i10);
        int i11 = fVarD != null ? fVarD.f19a : 6;
        fj.v vVar = new fj.v();
        if (((a2.q) getFocusOwner()).e(i11, cVarA, new o2.j(vVar, 2)) == null) {
            return view;
        }
        Object obj = vVar.f6807a;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i10);
            }
        } else if (viewFindNextFocus == null || i11 == 1 || i11 == 2 || a2.d.o(a2.d.i((a2.e0) obj), a2.h.a(viewFindNextFocus, this), cVarA, i11)) {
            return this;
        }
        return viewFindNextFocus;
    }

    @Override // androidx.lifecycle.e
    public final void g(androidx.lifecycle.t tVar) {
        u1 u1Var = this.f18415z;
        if (u1Var != null) {
            q1.c cVar = (q1.c) u1Var.f18427a.f18374b;
            if (cVar.f13176a && !cVar.f13178c) {
                f1.g gVar = u1Var.f18430d;
                if (gVar != null) {
                    gVar.cancel();
                }
                u1Var.f18430d = null;
                return;
            }
            if (cVar.f13177b) {
                return;
            }
            if (!cVar.f13178c) {
                r1.a.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!cVar.f13179d.i()) {
                r1.a.a("Attempted to start retaining exited values with pending exited values");
            }
            cVar.f13178c = false;
        }
    }

    public final p0 getAndroidViewsHandler$ui() {
        if (this.f18408p0 == null) {
            p0 p0Var = new p0(getContext());
            this.f18408p0 = p0Var;
            addView(p0Var, -1);
            requestLayout();
        }
        p0 p0Var2 = this.f18408p0;
        fj.l.c(p0Var2);
        return p0Var2;
    }

    public w1.g getAutofill() {
        return this.f18401i0;
    }

    public w1.i getAutofillManager() {
        return this.f18402j0;
    }

    public w1.j getAutofillTree() {
        return this.W;
    }

    public final d1 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.f18389c1;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.f18399g0.getValue();
    }

    public final x1.e getContentCaptureManager$ui() {
        return this.T;
    }

    public ti.h getCoroutineContext() {
        return this.G;
    }

    public s3.c getDensity() {
        return (s3.c) this.D.getValue();
    }

    public b2.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            a2.e0 e0VarF = a2.d.f(((a2.q) getFocusOwner()).f46c);
            if (e0VarF != null) {
                return a2.d.i(e0VarF);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return a2.h.a(viewFindFocus, this);
        }
        return null;
    }

    public a2.m getFocusOwner() {
        return this.F;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        b2.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f1502a);
            rect.top = Math.round(embeddedViewFocusRect.f1503b);
            rect.right = Math.round(embeddedViewFocusRect.f1504c);
            rect.bottom = Math.round(embeddedViewFocusRect.f1505d);
            return;
        }
        if (fj.l.b(((a2.q) getFocusOwner()).e(6, null, o.f18336b), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public k3.i getFontFamilyResolver() {
        return (k3.i) this.J0.getValue();
    }

    public k3.h getFontLoader() {
        return this.I0;
    }

    public final t1 getFrameEndScheduler$ui() {
        return this.f18396f;
    }

    public c2.b0 getGraphicsContext() {
        return this.V;
    }

    public k2.a getHapticFeedBack() {
        return this.L0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f18411s0.f17762b.z() || !this.B.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public l2.b getInputModeManager() {
        return this.M0;
    }

    public final t2.q getInsetsListener() {
        return this.N;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.y0;
    }

    @Override // android.view.View, android.view.ViewParent
    public s3.m getLayoutDirection() {
        return (s3.m) this.K0.getValue();
    }

    public n3.b getLocaleList() {
        return (n3.b) this.f18400h0.getValue();
    }

    public long getMeasureIteration() {
        v2.t0 t0Var = this.f18411s0;
        if (!t0Var.f17763c) {
            s2.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return t0Var.f17767g;
    }

    public u2.c getModifierLocalManager() {
        return this.N0;
    }

    public t2.e1 getPlacementScope() {
        int i10 = t2.h1.f15575b;
        return new t2.n0(this, 1);
    }

    public p2.u getPointerIconService() {
        return this.f18398f1;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final m2.a m10getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f18390d;
    }

    public e3.b getRectManager() {
        return this.Q;
    }

    public q1.d getRetainedValuesStore() {
        return this.A;
    }

    public v2.f0 getRoot() {
        return this.O;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        ag.i iVar;
        if (Build.VERSION.SDK_INT < 31 || (iVar = this.f18392d1) == null) {
            return false;
        }
        return ((Boolean) ((f1.j1) iVar.f449b).getValue()).booleanValue();
    }

    public d3.t getSemanticsOwner() {
        return this.R;
    }

    public v2.h0 getSharedDrawScope() {
        return this.f18393e;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? q0.f18360a.a(this) : this.f18407o0;
    }

    public v2.t1 getSnapshotObserver() {
        return this.f18406n0;
    }

    public d2 getSoftwareKeyboardController() {
        g1 g1Var = this.H0;
        if (g1Var != null) {
            return g1Var;
        }
        g1 g1Var2 = new g1(getTextInputService());
        this.H0 = g1Var2;
        return g1Var2;
    }

    public l3.u getTextInputService() {
        l3.u uVar = this.F0;
        if (uVar != null) {
            return uVar;
        }
        l3.u uVar2 = new l3.u(getLegacyTextInputServiceAndroid());
        this.F0 = uVar2;
        return uVar2;
    }

    public e2 getTextToolbar() {
        return this.O0;
    }

    public final v2.x1 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public h2 getViewConfiguration() {
        return this.M;
    }

    public final l getViewTreeOwners() {
        m6.a.q(this.C0.getValue());
        return null;
    }

    public k2 getWindowInfo() {
        return getComposeViewContext().f18243s;
    }

    public final w1.c get_autofillManager$ui() {
        return this.f18402j0;
    }

    public final void m(v2.f0 f0Var, boolean z2) {
        this.f18411s0.g(f0Var, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.t.o(android.view.MotionEvent):int");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        q1.d dVar;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            setShowLayoutBounds(f0.m());
        }
        this.N.onViewAttachedToWindow(this);
        int i11 = 2;
        if (i10 > 28) {
            if (f18380k1 == null) {
                ac.a aVar = new ac.a(i11);
                f18380k1 = aVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f18376g1 == null) {
                        f18376g1 = Class.forName("android.os.SystemProperties");
                    }
                    if (f18378i1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f18376g1;
                        f18378i1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f18378i1;
                    if (method != null) {
                        method.invoke(null, aVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            q.b0 b0Var = f18379j1;
            synchronized (b0Var) {
                b0Var.a(this);
            }
        }
        if (!this.f18389c1) {
            getComposeViewContext().c();
        }
        int i12 = 0;
        this.f18389c1 = false;
        q(getRoot());
        p(getRoot());
        getSnapshotObserver().f17770a.d();
        wh.s sVar = this.f18401i0;
        if (sVar != null) {
            w1.h hVar = w1.h.f18178a;
            hVar.getClass();
            ((AutofillManager) sVar.f19381c).registerCallback(hVar);
        }
        androidx.lifecycle.t tVar = getComposeViewContext().f18228c;
        androidx.lifecycle.b1 b1Var = getComposeViewContext().f18230e;
        t1 t1Var = this.f18396f;
        if (tVar == null || b1Var == null || t1Var == null) {
            dVar = null;
        } else {
            androidx.lifecycle.a1 a1VarE = b1Var.e();
            h9.a aVar2 = new h9.a(3);
            d6.a aVar3 = d6.a.f4976b;
            fj.l.f(a1VarE, "store");
            fj.l.f(aVar3, "extras");
            wh.s sVar2 = new wh.s(a1VarE, aVar2, aVar3);
            fj.f fVarA = fj.w.a(v1.class);
            String strB = fVarA.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            v1 v1Var = (v1) sVar2.j(fVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            Object parent = getParent();
            fj.l.d(parent, "null cannot be cast to non-null type android.view.View");
            int id2 = ((View) parent).getId();
            q.v vVar = v1Var.f18442b;
            Object objB = vVar.b(id2);
            if (objB == null) {
                objB = new q.b0(1);
                vVar.i(id2, objB);
            }
            q.b0 b0Var2 = (q.b0) objB;
            Object[] objArr = b0Var2.f13033a;
            int i13 = b0Var2.f13034b;
            while (true) {
                if (i12 >= i13) {
                    obj = null;
                    break;
                }
                obj = objArr[i12];
                if (!((u1) obj).f18429c) {
                    break;
                } else {
                    i12++;
                }
            }
            u1 u1Var = (u1) obj;
            if (u1Var == null) {
                u1Var = new u1();
                b0Var2.a(u1Var);
            }
            u1Var.f18429c = true;
            this.f18415z = u1Var;
            dVar = u1Var.f18428b;
        }
        if (dVar == null) {
            dVar = q1.a.f13174a;
        }
        this.A = dVar;
        ej.c cVar = this.D0;
        if (cVar != null) {
            cVar.invoke(getComposeViewContext());
            this.D0 = null;
        }
        androidx.lifecycle.v vVarH = getComposeViewContext().f18228c.h();
        vVarH.a(this);
        vVarH.a(this.T);
        this.M0.f9878a.setValue(new l2.a(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            c0.f18216a.b(this);
        }
        w1.c cVar2 = this.f18402j0;
        if (cVar2 != null) {
            ((a2.q) getFocusOwner()).f50g.a(cVar2);
            getSemanticsOwner().f4774d.a(cVar2);
        }
        ((a2.q) getFocusOwner()).f50g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        v1.q qVar = (v1.q) this.G0.get();
        i0 i0Var = (i0) (qVar != null ? qVar.f17573b : null);
        if (i0Var == null) {
            return getLegacyTextInputServiceAndroid().f9950d;
        }
        v1.q qVar2 = (v1.q) i0Var.f18298d.get();
        o1 o1Var = (o1) (qVar2 != null ? qVar2.f17573b : null);
        return o1Var != null && (o1Var.f18346e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        O(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        v1.q qVar = (v1.q) this.G0.get();
        i0 i0Var = (i0) (qVar != null ? qVar.f17573b : null);
        if (i0Var == null) {
            l3.w legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.f9950d) {
                l3.j jVar = legacyTextInputServiceAndroid.f9954h;
                l3.t tVar = legacyTextInputServiceAndroid.f9953g;
                int i11 = jVar.f9918e;
                boolean z2 = jVar.f9914a;
                if (i11 == 1) {
                    i10 = z2 ? 6 : 0;
                } else if (i11 == 0) {
                    i10 = 1;
                } else if (i11 == 2) {
                    i10 = 2;
                } else if (i11 == 6) {
                    i10 = 5;
                } else if (i11 == 5) {
                    i10 = 7;
                } else if (i11 == 3) {
                    i10 = 3;
                } else if (i11 == 4) {
                    i10 = 4;
                } else {
                    if (i11 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
                editorInfo.imeOptions = i10;
                int i12 = jVar.f9917d;
                if (i12 == 1) {
                    editorInfo.inputType = 1;
                } else if (i12 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i10;
                } else if (i12 == 3) {
                    editorInfo.inputType = 2;
                } else if (i12 == 4) {
                    editorInfo.inputType = 3;
                } else if (i12 == 5) {
                    editorInfo.inputType = 17;
                } else if (i12 == 6) {
                    editorInfo.inputType = 33;
                } else if (i12 == 7) {
                    editorInfo.inputType = 129;
                } else if (i12 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i12 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z2) {
                    int i13 = editorInfo.inputType;
                    if ((i13 & 1) == 1) {
                        editorInfo.inputType = i13 | 131072;
                        if (i11 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i14 = editorInfo.inputType;
                if ((i14 & 1) == 1) {
                    int i15 = jVar.f9915b;
                    if (i15 == 1) {
                        editorInfo.inputType = i14 | 4096;
                    } else if (i15 == 2) {
                        editorInfo.inputType = i14 | 8192;
                    } else if (i15 == 3) {
                        editorInfo.inputType = i14 | 16384;
                    }
                    if (jVar.f9916c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j = tVar.f9938b;
                int i16 = g3.m0.f7144c;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                u3.c.o(editorInfo, tVar.f9937a.f7081b);
                editorInfo.imeOptions |= 33554432;
                if (r5.k.d()) {
                    r5.k.a().i(editorInfo);
                }
                l3.p pVar = new l3.p(legacyTextInputServiceAndroid.f9953g, new d8.e(legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.f9954h.f9916c);
                legacyTextInputServiceAndroid.f9955i.add(new WeakReference(pVar));
                return pVar;
            }
        } else {
            v1.q qVar2 = (v1.q) i0Var.f18298d.get();
            o1 o1Var = (o1) (qVar2 != null ? qVar2.f17573b : null);
            if (o1Var != null) {
                synchronized (o1Var.f18344c) {
                    if (o1Var.f18346e) {
                        return null;
                    }
                    t0.r rVarA = o1Var.f18342a.a(editorInfo);
                    c2.x0 x0Var = new c2.x0(o1Var, 26);
                    InputConnection lVar = Build.VERSION.SDK_INT >= 34 ? new l3.l(rVarA, x0Var) : new l3.k(rVarA, x0Var);
                    o1Var.f18345d.b(new v2.g2(lVar));
                    return lVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        d3.r rVar;
        String strA;
        x1.e eVar = this.T;
        eVar.getClass();
        for (long j : jArr) {
            d3.s sVar = (d3.s) eVar.f().b((int) j);
            if (sVar != null && (rVar = sVar.f4769a) != null) {
                x1.b.d();
                ViewTranslationRequest.Builder builderT = l4.e.t(eVar.f19789a.getAutofillId(), rVar.f4768f);
                Object objG = rVar.f4766d.f4758a.g(d3.v.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (strA = u3.b.a(list, "\n", null, 62)) != null) {
                    builderT.setValue("android:text", TranslationRequestValue.forText(new g3.f(strA)));
                    consumer.accept(builderT.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.N.onViewDetachedFromWindow(this);
        View view = this.E;
        if (r() && view != null) {
            removeView(view);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28) {
            q.b0 b0Var = f18379j1;
            synchronized (b0Var) {
                b0Var.j(this);
            }
        }
        getComposeViewContext().b();
        t1.v vVar = getSnapshotObserver().f17770a;
        t1.f fVar = vVar.f15511h;
        if (fVar != null) {
            fVar.a();
        }
        vVar.a();
        androidx.lifecycle.v vVarH = getComposeViewContext().f18228c.h();
        vVarH.f(this.T);
        vVarH.f(this);
        wh.s sVar = this.f18401i0;
        if (sVar != null) {
            w1.h hVar = w1.h.f18178a;
            hVar.getClass();
            ((AutofillManager) sVar.f19381c).unregisterCallback(hVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        u1 u1Var = this.f18415z;
        if (u1Var != null) {
            u1Var.f18429c = false;
        }
        this.f18415z = null;
        if (i10 >= 31) {
            c0.f18216a.a(this);
        }
        w1.c cVar = this.f18402j0;
        if (cVar != null) {
            getSemanticsOwner().f4774d.j(cVar);
            ((a2.q) getFocusOwner()).f50g.j(cVar);
        }
        e3.b rectManager = getRectManager();
        rectManager.f5756f = rectManager.f5753c.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        e3.b rectManager2 = getRectManager();
        p0.c cVar2 = rectManager2.f5758h;
        if (cVar2 != null) {
            rectManager2.f5751a.removeCallbacks(cVar2);
            rectManager2.f5758h = null;
        }
        ((a2.q) getFocusOwner()).f50g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z2, int i10, Rect rect) {
        super.onFocusChanged(z2, i10, rect);
        if (z2 || hasFocus()) {
            return;
        }
        a2.q qVar = (a2.q) getFocusOwner();
        a2.d.d(qVar.f46c, true);
        if (qVar.f() != null) {
            a2.e0 e0VarF = qVar.f();
            qVar.i(null);
            if (e0VarF != null) {
                e0VarF.r1(a2.b0.f10a, a2.b0.f12c);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.y0 = 0L;
        P();
        int i10 = Build.VERSION.SDK_INT;
        if (32 > i10 || i10 >= 34) {
            return;
        }
        O(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.y0 = 0L;
            this.f18411s0.l(this.Z0);
            this.f18409q0 = null;
            P();
            if (this.f18408p0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i12 - i10, i13 - i11);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        v2.t0 t0Var = this.f18411s0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                q(getRoot());
            }
            long j = j(i10);
            long j4 = j(i11);
            long jA = uk.c.A((int) (j >>> 32), (int) (j & 4294967295L), (int) (j4 >>> 32), (int) (4294967295L & j4));
            s3.a aVar = this.f18409q0;
            if (aVar == null) {
                this.f18409q0 = new s3.a(jA);
                this.f18410r0 = false;
            } else if (!s3.a.b(aVar.f14736a, jA)) {
                this.f18410r0 = true;
            }
            t0Var.s(jA);
            t0Var.n();
            setMeasuredDimension(getRoot().Z.f17703p.f15550a, getRoot().Z.f17703p.f15551b);
            if (this.f18408p0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().Z.f17703p.f15550a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().Z.f17703p.f15551b, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.t.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        p2.t tVar;
        int toolType = motionEvent.getToolType(i10);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (tVar = ((q) getPointerIconService()).f18358a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i10);
        }
        Context context = getContext();
        return tVar instanceof p2.a ? PointerIcon.getSystemIcon(context, ((p2.a) tVar).f12667b) : PointerIcon.getSystemIcon(context, zzbch.zzq.zzf);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (this.f18387c) {
            int[] iArr = a2.h.f23a;
            s3.m mVar = i10 != 0 ? i10 != 1 ? null : s3.m.f14753b : s3.m.f14752a;
            if (mVar == null) {
                mVar = s3.m.f14752a;
            }
            setLayoutDirection(mVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        ag.i iVar;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.f18392d1) != null) {
            d3.t semanticsOwner = getSemanticsOwner();
            ti.h coroutineContext = getCoroutineContext();
            g1.e eVar = new g1.e(new c3.j[16]);
            cg.b.U(semanticsOwner.a(), 0, new c3.i(1, 8, g1.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
            eVar.o(new d3.a0(new ej.c[]{c3.b.f3074c, c3.b.f3075d}, 2));
            int i10 = eVar.f7026c;
            c3.j jVar = (c3.j) (i10 == 0 ? null : eVar.f7024a[i10 - 1]);
            if (jVar != null) {
                s3.k kVar = jVar.f3096c;
                c3.c cVar = new c3.c(jVar.f3094a, kVar, qj.b0.b(coroutineContext), iVar, this);
                v2.i1 i1Var = jVar.f3097d;
                b2.c cVarZ = t2.z.h(i1Var).z(i1Var, true);
                long jB = kVar.b();
                ScrollCaptureTarget scrollCaptureTargetN = c2.s0.n(this, c2.e0.B(a.a.S(cVarZ)), new Point((int) (jB >> 32), (int) (jB & 4294967295L)), cVar);
                scrollCaptureTargetN.setScrollBounds(c2.e0.B(kVar));
                consumer.accept(scrollCaptureTargetN);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        P();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z2) {
        this.M0.f9878a.setValue(new l2.a(z2 ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        x1.e eVar = this.T;
        eVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (fj.l.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            u1.d.e(eVar, longSparseArray);
        } else {
            eVar.f19789a.post(new ac.e(22, eVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        boolean zM;
        this.f18386b1 = true;
        super.onWindowFocusChanged(z2);
        if (!z2 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zM = f0.m())) {
            return;
        }
        setShowLayoutBounds(zM);
        p(getRoot());
    }

    public final void q(v2.f0 f0Var) {
        this.f18411s0.r(f0Var, false);
        g1.e eVarY = f0Var.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            q((v2.f0) objArr[i11]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (!isFocused()) {
            a2.f fVarD = a2.h.d(i10);
            int i11 = fVarD != null ? fVarD.f19a : 7;
            Boolean boolE = ((a2.q) getFocusOwner()).e(i11, rect != null ? new b2.c(rect.left, rect.top, rect.right, rect.bottom) : null, new a2.p(i11, 3));
            Boolean bool = Boolean.TRUE;
            if (!fj.l.b(boolE, bool)) {
                if (!fj.l.b(((a2.q) getFocusOwner()).e(i11, null, new a2.p(i11, 4)), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i11 == 1 || i11 == 2) {
                        return ((a2.q) getFocusOwner()).h(i11);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.S.A = j;
    }

    public final void setComposeViewContext(d1 d1Var) {
        if (getCoroutineContext() != d1Var.f18227b.j() && !((g1.b) getRoot().n()).isEmpty()) {
            s2.a.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        t1.g gVarF = t1.r.f();
        ej.c cVarE = gVarF != null ? gVarF.e() : null;
        t1.g gVarK = t1.r.k(gVarF);
        try {
            d1 d1Var2 = get_composeViewContext();
            t1.r.n(gVarF, gVarK, cVarE);
            if (d1Var.equals(d1Var2)) {
                return;
            }
            if (isAttachedToWindow()) {
                d1Var2.b();
                d1Var.c();
            }
            set_composeViewContext(d1Var);
            setCoroutineContext(d1Var.f18227b.j());
        } catch (Throwable th2) {
            t1.r.n(gVarF, gVarK, cVarE);
            throw th2;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z2) {
        this.f18389c1 = z2;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f18399g0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(x1.e eVar) {
        this.T = eVar;
    }

    public void setCoroutineContext(ti.h hVar) {
        this.G = hVar;
    }

    public final void setFrameEndScheduler$ui(t1 t1Var) {
        this.f18396f = t1Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.y0 = j;
    }

    public final void setOnReadyForComposition(ej.c cVar) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.f18389c1) {
            cVar.invoke(getComposeViewContext());
        } else {
            this.D0 = cVar;
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m11setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(m2.a aVar) {
        this.f18390d = aVar;
    }

    public void setShowLayoutBounds(boolean z2) {
        this.f18407o0 = z2;
    }

    public void setUncaughtExceptionHandler(v2.x1 x1Var) {
        this.f18411s0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        return 0.0f <= x2 && x2 <= ((float) getWidth()) && 0.0f <= y2 && y2 <= ((float) getHeight());
    }

    public final boolean u(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.P0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void v(float[] fArr) {
        G();
        c2.k0.e(fArr, this.w0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.A0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.A0 & 4294967295L));
        float[] fArr2 = this.f18414v0;
        c2.k0.d(fArr2);
        c2.k0.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        f0.r(fArr, fArr2);
    }

    public final long w(long j) {
        G();
        long jB = c2.k0.b(j, this.w0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.A0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.A0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void x(boolean z2) {
        n nVar;
        v2.t0 t0Var = this.f18411s0;
        if (t0Var.f17762b.z() || ((g1.e) t0Var.f17765e.f13235b).f7026c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z2) {
                try {
                    nVar = this.Z0;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                nVar = null;
            }
            if (t0Var.l(nVar)) {
                requestLayout();
            }
            t0Var.b(false);
            getRectManager().a();
            if (this.f18391d0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f18391d0 = false;
            }
            Trace.endSection();
        }
    }

    public final void y(v2.f0 f0Var, long j) {
        v2.t0 t0Var = this.f18411s0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            t0Var.m(f0Var, j);
            if (!t0Var.f17762b.z()) {
                t0Var.b(false);
                getRectManager().a();
                if (this.f18391d0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f18391d0 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean z(int i10) {
        if (i10 == 7 || i10 == 8) {
            return false;
        }
        Integer numC = a2.h.c(i10);
        if (numC == null) {
            throw t.m1.e("Invalid focus direction");
        }
        int iIntValue = numC.intValue();
        a2.e0 e0VarF = ((a2.q) getFocusOwner()).f();
        if (e0VarF == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer numC2 = a2.h.c(i10);
        if (numC2 == null) {
            throw t.m1.e("Invalid focus direction");
        }
        int iIntValue2 = numC2.intValue();
        v3.w wVar = v2.n.y(e0VarF).H;
        View interopView = wVar != null ? wVar.getInteropView() : null;
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        fj.l.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
        if (viewFindNextFocus == null || interopView == null || !f0.a(interopView, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            return a2.h.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        fj.l.c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i10, layoutParams, true);
    }

    public g getAccessibilityManager() {
        return this.U;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public h m13getClipboard() {
        return this.f18405m0;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public i m14getClipboardManager() {
        return this.f18404l0;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public y1.b m15getDragAndDropManager() {
        return this.H;
    }

    public q.v getLayoutNodes() {
        return this.P;
    }

    public t getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @pi.a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m9getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @pi.a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public v2.y1 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(v2.x1 x1Var) {
    }
}
