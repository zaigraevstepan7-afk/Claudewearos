package w2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.anonlab.voidlauncher.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends t4.b implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: g0, reason: collision with root package name */
    public static final q.u f18454g0;
    public long A;
    public List B;
    public final l5.a C;
    public int D;
    public int E;
    public u4.e F;
    public u4.e G;
    public boolean H;
    public final q.v I;
    public final q.v J;
    public final q.q0 K;
    public final q.q0 L;
    public int M;
    public Integer N;
    public final q.f O;
    public final sj.c P;
    public boolean Q;
    public u R;
    public q.v S;
    public final q.w T;
    public final q.t U;
    public final q.t V;
    public final String W;
    public final String X;
    public final ac.d Y;
    public final q.v Z;

    /* renamed from: a0, reason: collision with root package name */
    public c2 f18455a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f18456b0;

    /* renamed from: c0, reason: collision with root package name */
    public final q.t f18457c0;

    /* renamed from: d, reason: collision with root package name */
    public final t f18458d;

    /* renamed from: d0, reason: collision with root package name */
    public final ac.o f18459d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ArrayList f18461e0;

    /* renamed from: f0, reason: collision with root package name */
    public final x f18463f0;

    /* renamed from: z, reason: collision with root package name */
    public final AccessibilityManager f18464z;

    /* renamed from: e, reason: collision with root package name */
    public int f18460e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public final x f18462f = new x(this, 0);

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        q.u uVar = q.j.f13093a;
        q.u uVar2 = new q.u(32);
        int i10 = uVar2.f13137b;
        if (i10 < 0) {
            r.a.d("");
            throw null;
        }
        int i11 = i10 + 32;
        uVar2.b(i11);
        int[] iArr2 = uVar2.f13136a;
        int i12 = uVar2.f13137b;
        if (i10 != i12) {
            qi.k.e0(i11, i10, i12, iArr2, iArr2);
        }
        qi.k.j0(i10, 0, 12, iArr, iArr2);
        uVar2.f13137b += 32;
        f18454g0 = uVar2;
    }

    public y(t tVar) {
        this.f18458d = tVar;
        Object systemService = tVar.getContext().getSystemService("accessibility");
        fj.l.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f18464z = (AccessibilityManager) systemService;
        this.A = 100L;
        new Handler(Looper.getMainLooper());
        int i10 = 1;
        this.C = new l5.a(this, i10);
        this.D = Integer.MIN_VALUE;
        this.E = Integer.MIN_VALUE;
        this.I = new q.v();
        this.J = new q.v();
        this.K = new q.q0(0);
        this.L = new q.q0(0);
        this.M = -1;
        this.O = new q.f(0);
        this.P = u6.v.a(1, 6, null);
        this.Q = true;
        q.v vVar = q.l.f13102a;
        fj.l.d(vVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.S = vVar;
        this.T = new q.w();
        this.U = new q.t();
        this.V = new q.t();
        this.W = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.X = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.Y = new ac.d(26);
        this.Z = new q.v();
        d3.r rVarA = tVar.getSemanticsOwner().a();
        fj.l.d(vVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f18455a0 = new c2(rVarA, vVar);
        int i11 = q.i.f13086a;
        this.f18457c0 = new q.t();
        tVar.addOnAttachStateChangeListener(this);
        this.f18459d0 = new ac.o(this, 22);
        this.f18461e0 = new ArrayList();
        this.f18463f0 = new x(this, i10);
    }

    public static /* synthetic */ void E(y yVar, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        yVar.D(i10, i11, num, null);
    }

    public static Rect L(c2.e0 e0Var, float f10, float f11) {
        if (!(e0Var instanceof c2.m0) && !(e0Var instanceof c2.n0)) {
            return null;
        }
        b2.c cVarO = e0Var.o();
        return new Rect((int) (cVarO.f1502a + f10), (int) (cVarO.f1503b + f11), (int) (cVarO.f1504c + f10), (int) (cVarO.f1505d + f11));
    }

    public static float[] N(c2.e0 e0Var) {
        if (!(e0Var instanceof c2.n0)) {
            return null;
        }
        b2.d dVar = ((c2.n0) e0Var).f3022f;
        long j = dVar.f1513h;
        long j4 = dVar.f1512g;
        long j10 = dVar.f1511f;
        long j11 = dVar.f1510e;
        return new float[]{Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(c2.e0 e0Var, float f10, float f11) {
        if (!(e0Var instanceof c2.l0)) {
            return null;
        }
        c2.l0 l0Var = (c2.l0) e0Var;
        b2.c cVarH = l0Var.o().h(f10, f11);
        Region region = new Region(new Rect((int) (cVarH.f1502a + 0.0f), (int) (cVarH.f1503b + 0.0f), (int) (cVarH.f1504c + 0.0f), (int) (cVarH.f1505d + 0.0f)));
        Region region2 = new Region();
        c2.j jVar = l0Var.f3016f;
        if (!(jVar instanceof c2.j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = jVar.f3006a;
        path.offset(f10, f11);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i10 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i10 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
                fj.l.d(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(d3.r rVar) {
        g3.f fVar;
        if (rVar != null) {
            d3.n nVar = rVar.f4766d;
            q.g0 g0Var = nVar.f4758a;
            d3.y yVar = d3.v.f4776a;
            if (g0Var.c(yVar)) {
                return u3.b.a((List) nVar.i(yVar), ",", null, 62);
            }
            d3.y yVar2 = d3.v.G;
            if (g0Var.c(yVar2)) {
                Object objG = g0Var.g(yVar2);
                if (objG == null) {
                    objG = null;
                }
                g3.f fVar2 = (g3.f) objG;
                if (fVar2 != null) {
                    return fVar2.f7081b;
                }
            } else {
                Object objG2 = g0Var.g(d3.v.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (fVar = (g3.f) qi.l.A0(list)) != null) {
                    return fVar.f7081b;
                }
            }
        }
        return null;
    }

    public static final boolean x(d3.k kVar, float f10) {
        ej.a aVar = kVar.f4724a;
        if (f10 >= 0.0f || ((Number) aVar.a()).floatValue() <= 0.0f) {
            return f10 > 0.0f && ((Number) aVar.a()).floatValue() < ((Number) kVar.f4725b.a()).floatValue();
        }
        return true;
    }

    public static final boolean y(d3.k kVar) {
        ej.a aVar = kVar.f4724a;
        if (((Number) aVar.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) aVar.a()).floatValue();
        ((Number) kVar.f4725b.a()).floatValue();
        return false;
    }

    public static final boolean z(d3.k kVar) {
        ej.a aVar = kVar.f4724a;
        if (((Number) aVar.a()).floatValue() < ((Number) kVar.f4725b.a()).floatValue()) {
            return true;
        }
        ((Number) aVar.a()).floatValue();
        return false;
    }

    public final int A(int i10) {
        if (i10 == this.f18458d.getSemanticsOwner().a().f4768f) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(d3.r r20, w2.c2 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = q.m.f13105a
            q.w r3 = new q.w
            r3.<init>()
            r4 = 4
            java.util.List r5 = d3.r.j(r4, r1)
            v2.f0 r6 = r1.f4765c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            d3.r r10 = (d3.r) r10
            q.k r11 = r0.s()
            int r10 = r10.f4768f
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L3d
            q.w r11 = r2.f18219b
            boolean r11 = r11.c(r10)
            if (r11 != 0) goto L3a
            r0.w(r6)
            return
        L3a:
            r3.a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            q.w r2 = r2.f18219b
            int[] r5 = r2.f13140b
            long[] r2 = r2.f13139a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.c(r15)
            if (r15 != 0) goto L80
            r0.w(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = d3.r.j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            d3.r r3 = (d3.r) r3
            q.v r4 = r0.Z
            int r5 = r3.f4768f
            java.lang.Object r4 = r4.b(r5)
            w2.c2 r4 = (w2.c2) r4
            if (r4 == 0) goto Lb6
            q.k r5 = r0.s()
            int r6 = r3.f4768f
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb6
            r0.B(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.y.B(d3.r, w2.c2):void");
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.H = true;
        }
        try {
            return ((Boolean) this.f18462f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.H = false;
        }
    }

    public final boolean D(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i10, i11);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(u3.b.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i10), 32);
        accessibilityEventO.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i10) {
        u uVar = this.R;
        if (uVar != null) {
            d3.r rVar = uVar.f18419a;
            if (i10 != rVar.f4768f) {
                return;
            }
            if (SystemClock.uptimeMillis() - uVar.f18424f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(rVar.f4768f), 131072);
                accessibilityEventO.setFromIndex(uVar.f18422d);
                accessibilityEventO.setToIndex(uVar.f18423e);
                accessibilityEventO.setAction(uVar.f18420b);
                accessibilityEventO.setMovementGranularity(uVar.f18421c);
                accessibilityEventO.getText().add(t(rVar));
                C(accessibilityEventO);
            }
        }
        this.R = null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void H(q.k r57) {
        /*
            Method dump skipped, instructions count: 1680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.y.H(q.k):void");
    }

    public final void I(v2.f0 f0Var, q.w wVar) {
        d3.n nVarW;
        if (f0Var.G() && !this.f18458d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(f0Var)) {
            v2.f0 f0Var2 = null;
            if (!f0Var.Y.d(8)) {
                f0Var = f0Var.u();
                while (true) {
                    if (f0Var == null) {
                        f0Var = null;
                        break;
                    } else if (f0Var.Y.d(8)) {
                        break;
                    } else {
                        f0Var = f0Var.u();
                    }
                }
            }
            if (f0Var == null || (nVarW = f0Var.w()) == null) {
                return;
            }
            if (!nVarW.f4760c) {
                v2.f0 f0VarU = f0Var.u();
                while (true) {
                    if (f0VarU != null) {
                        d3.n nVarW2 = f0VarU.w();
                        if (nVarW2 != null && nVarW2.f4760c) {
                            f0Var2 = f0VarU;
                            break;
                        }
                        f0VarU = f0VarU.u();
                    } else {
                        break;
                    }
                }
                if (f0Var2 != null) {
                    f0Var = f0Var2;
                }
            }
            int i10 = f0Var.f17624b;
            if (wVar.a(i10)) {
                E(this, A(i10), 2048, 1, 8);
            }
        }
    }

    public final void J(v2.f0 f0Var) {
        if (f0Var.G() && !this.f18458d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(f0Var)) {
            int i10 = f0Var.f17624b;
            d3.k kVar = (d3.k) this.I.b(i10);
            d3.k kVar2 = (d3.k) this.J.b(i10);
            if (kVar == null && kVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i10, 4096);
            if (kVar != null) {
                accessibilityEventO.setScrollX((int) ((Number) kVar.f4724a.a()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) kVar.f4725b.a()).floatValue());
            }
            if (kVar2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) kVar2.f4724a.a()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) kVar2.f4725b.a()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(d3.r rVar, int i10, int i11, boolean z2) {
        String strT;
        d3.n nVar = rVar.f4766d;
        int i12 = rVar.f4768f;
        d3.y yVar = d3.m.j;
        if (nVar.f4758a.c(yVar) && f0.b(rVar)) {
            ej.f fVar = (ej.f) ((d3.a) rVar.f4766d.i(yVar)).f4704b;
            if (fVar != null) {
                return ((Boolean) fVar.c(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z2))).booleanValue();
            }
        } else if ((i10 != i11 || i11 != this.M) && (strT = t(rVar)) != null) {
            if (i10 < 0 || i10 != i11 || i11 > strT.length()) {
                i10 = -1;
            }
            this.M = i10;
            boolean z10 = strT.length() > 0;
            C(p(A(i12), z10 ? Integer.valueOf(this.M) : null, z10 ? Integer.valueOf(this.M) : null, z10 ? Integer.valueOf(strT.length()) : null, strT));
            G(i12);
            return true;
        }
        return false;
    }

    public final Rect M(float f10, float f11, float f12, float f13) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        t tVar = this.f18458d;
        long jW = tVar.w(jFloatToRawIntBits);
        long jW2 = tVar.w((Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32));
        int i10 = (int) (jW >> 32);
        int i11 = (int) (jW2 >> 32);
        int i12 = (int) (jW & 4294967295L);
        int i13 = (int) (jW2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), (int) Math.floor(Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.y.Q():void");
    }

    @Override // t4.b
    public final d8.e b(View view) {
        return this.C;
    }

    public final void j(int i10, u4.e eVar, String str, Bundle bundle) {
        d3.r rVar;
        t tVar;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16615a;
        d3.s sVar = (d3.s) s().b(i10);
        if (sVar == null || (rVar = sVar.f4769a) == null) {
            return;
        }
        v2.f0 f0Var = rVar.f4765c;
        d3.n nVar = rVar.f4766d;
        q.g0 g0Var = nVar.f4758a;
        String strT = t(rVar);
        if (fj.l.b(str, this.W)) {
            int iD = this.U.d(i10, -1);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (fj.l.b(str, this.X)) {
            int iD2 = this.V.d(i10, -1);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = g0Var.c(d3.m.f4733a);
        t tVar2 = this.f18458d;
        boolean z2 = false;
        if (zC && bundle != null && fj.l.b(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i12 > 0 && i11 >= 0) {
                if (i11 < (strT != null ? strT.length() : com.google.android.gms.common.api.f.API_PRIORITY_OTHER)) {
                    g3.k0 k0VarN = f0.n(nVar);
                    if (k0VarN == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    while (i13 < i12) {
                        int i14 = i11 + i13;
                        if (i14 >= k0VarN.f7128a.f7117a.f7081b.length()) {
                            arrayList.add(z2);
                            tVar = tVar2;
                        } else {
                            b2.c cVarB = k0VarN.b(i14);
                            v2.i1 i1VarD = rVar.d();
                            long jQ0 = 0;
                            if (i1VarD != null) {
                                if (!i1VarD.w1().G) {
                                    i1VarD = null;
                                }
                                if (i1VarD != null) {
                                    jQ0 = i1VarD.q0(0L);
                                }
                            }
                            b2.c cVarI = cVarB.i(jQ0);
                            b2.c cVarG = rVar.g();
                            if ((cVarI.g(cVarG) ? cVarI.e(cVarG) : null) != null) {
                                long jW = tVar2.w((Float.floatToRawIntBits(r9.f1503b) & 4294967295L) | (Float.floatToRawIntBits(r9.f1502a) << 32));
                                long jW2 = tVar2.w((Float.floatToRawIntBits(r9.f1504c) << 32) | (Float.floatToRawIntBits(r9.f1505d) & 4294967295L));
                                tVar = tVar2;
                                int i15 = (int) (jW >> 32);
                                int i16 = (int) (jW2 >> 32);
                                float fMin = Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16));
                                int i17 = (int) (jW & 4294967295L);
                                int i18 = (int) (jW2 & 4294967295L);
                                rectF = new RectF(fMin, Math.min(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)), Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.max(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)));
                            } else {
                                tVar = tVar2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i13++;
                        tVar2 = tVar;
                        z2 = false;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        d3.y yVar = d3.v.A;
        if (g0Var.c(yVar) && bundle != null && fj.l.b(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = g0Var.g(yVar);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (fj.l.b(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, rVar.f4768f);
            return;
        }
        if (fj.l.b(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = g0Var.g(d3.v.Q);
            c2.w0 w0Var = (c2.w0) (objG2 == null ? null : objG2);
            if (w0Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                b2.c cVarU = u(rVar, rect, w0Var);
                float f10 = cVarU.f1503b;
                float f11 = cVarU.f1502a;
                c2.e0 e0VarB = w0Var.b(cVarU.c(), f0Var.S, tVar2.getDensity());
                if (e0VarB instanceof c2.m0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(e0VarB, f11, f10));
                    return;
                } else if (e0VarB instanceof c2.n0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(e0VarB, f11, f10));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(e0VarB));
                    return;
                } else {
                    if (!(e0VarB instanceof c2.l0)) {
                        throw new b3.e();
                    }
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(e0VarB, f11, f10));
                    return;
                }
            }
            return;
        }
        if (fj.l.b(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = g0Var.g(d3.v.Q);
            c2.w0 w0Var2 = (c2.w0) (objG3 == null ? null : objG3);
            if (w0Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                b2.c cVarU2 = u(rVar, rect2, w0Var2);
                Rect rectL = L(w0Var2.b(cVarU2.c(), f0Var.S, tVar2.getDensity()), cVarU2.f1502a, cVarU2.f1503b);
                if (rectL != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                    return;
                }
                return;
            }
            return;
        }
        if (fj.l.b(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = g0Var.g(d3.v.Q);
            c2.w0 w0Var3 = (c2.w0) (objG4 == null ? null : objG4);
            if (w0Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrN = N(w0Var3.b(u(rVar, rect3, w0Var3).c(), f0Var.S, tVar2.getDensity()));
                if (fArrN != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                    return;
                }
                return;
            }
            return;
        }
        if (fj.l.b(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = g0Var.g(d3.v.Q);
            c2.w0 w0Var4 = (c2.w0) (objG5 == null ? null : objG5);
            if (w0Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                b2.c cVarU3 = u(rVar, rect4, w0Var4);
                Region regionO = O(w0Var4.b(cVarU3.c(), f0Var.S, tVar2.getDensity()), cVarU3.f1502a, cVarU3.f1503b);
                if (regionO != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
                }
            }
        }
    }

    public final Rect k(d3.s sVar) {
        s3.k kVar = sVar.f4770b;
        return M(kVar.f14747a, kVar.f14748b, kVar.f14749c, kVar.f14750d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (qj.b0.i(r7, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0057, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:34:0x007e, B:35:0x008d, B:38:0x009c, B:39:0x00a3, B:20:0x0041, B:23:0x0048), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00bc -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(vi.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof w2.v
            if (r0 == 0) goto L13
            r0 = r11
            w2.v r0 = (w2.v) r0
            int r1 = r0.f18440e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18440e = r1
            goto L18
        L13:
            w2.v r0 = new w2.v
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f18438c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f18440e
            r3 = 2
            q.f r4 = r10.O
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 != r3) goto L35
            sj.b r2 = r0.f18437b
            q.w r6 = r0.f18436a
            uk.c.R(r11)     // Catch: java.lang.Throwable -> L32
        L2f:
            r11 = r6
            r6 = r2
            goto L57
        L32:
            r11 = move-exception
            goto Lc5
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3d:
            sj.b r2 = r0.f18437b
            q.w r6 = r0.f18436a
            uk.c.R(r11)     // Catch: java.lang.Throwable -> L32
            goto L68
        L45:
            uk.c.R(r11)
            q.w r11 = new q.w     // Catch: java.lang.Throwable -> L32
            r11.<init>()     // Catch: java.lang.Throwable -> L32
            sj.c r2 = r10.P     // Catch: java.lang.Throwable -> L32
            r2.getClass()     // Catch: java.lang.Throwable -> L32
            sj.b r6 = new sj.b     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L32
        L57:
            r0.f18436a = r11     // Catch: java.lang.Throwable -> L32
            r0.f18437b = r6     // Catch: java.lang.Throwable -> L32
            r0.f18440e = r5     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L32
            if (r2 != r1) goto L64
            goto Lbe
        L64:
            r9 = r6
            r6 = r11
            r11 = r2
            r2 = r9
        L68:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L32
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto Lbf
            r2.c()     // Catch: java.lang.Throwable -> L32
            boolean r11 = r10.v()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto La3
            int r11 = r4.f13066c     // Catch: java.lang.Throwable -> L32
            r7 = 0
        L7c:
            if (r7 >= r11) goto L8d
            java.lang.Object[] r8 = r4.f13065b     // Catch: java.lang.Throwable -> L32
            r8 = r8[r7]     // Catch: java.lang.Throwable -> L32
            v2.f0 r8 = (v2.f0) r8     // Catch: java.lang.Throwable -> L32
            r10.I(r8, r6)     // Catch: java.lang.Throwable -> L32
            r10.J(r8)     // Catch: java.lang.Throwable -> L32
            int r7 = r7 + 1
            goto L7c
        L8d:
            r6.b()     // Catch: java.lang.Throwable -> L32
            w2.t r11 = r10.f18458d     // Catch: java.lang.Throwable -> L32
            android.os.Handler r11 = r11.getHandler()     // Catch: java.lang.Throwable -> L32
            boolean r7 = r10.f18456b0     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto La3
            if (r11 == 0) goto La3
            r10.f18456b0 = r5     // Catch: java.lang.Throwable -> L32
            ac.o r7 = r10.f18459d0     // Catch: java.lang.Throwable -> L32
            r11.post(r7)     // Catch: java.lang.Throwable -> L32
        La3:
            r4.clear()     // Catch: java.lang.Throwable -> L32
            q.v r11 = r10.I     // Catch: java.lang.Throwable -> L32
            r11.c()     // Catch: java.lang.Throwable -> L32
            q.v r11 = r10.J     // Catch: java.lang.Throwable -> L32
            r11.c()     // Catch: java.lang.Throwable -> L32
            long r7 = r10.A     // Catch: java.lang.Throwable -> L32
            r0.f18436a = r6     // Catch: java.lang.Throwable -> L32
            r0.f18437b = r2     // Catch: java.lang.Throwable -> L32
            r0.f18440e = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r11 = qj.b0.i(r7, r0)     // Catch: java.lang.Throwable -> L32
            if (r11 != r1) goto L2f
        Lbe:
            return r1
        Lbf:
            r4.clear()
            pi.o r11 = pi.o.f13011a
            return r11
        Lc5:
            r4.clear()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.y.l(vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(long r23, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.y.m(long, int, boolean):boolean");
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.f18458d.getSemanticsOwner().a(), this.f18455a0);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i10, int i11) {
        d3.s sVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        t tVar = this.f18458d;
        accessibilityEventObtain.setPackageName(tVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(tVar, i10);
        if (v() && (sVar = (d3.s) s().b(i10)) != null) {
            d3.r rVar = sVar.f4769a;
            accessibilityEventObtain.setPassword(rVar.f4766d.f4758a.c(d3.v.L));
            Object objG = rVar.f4766d.f4758a.g(d3.v.f4789o);
            if (objG == null) {
                objG = null;
            }
            boolean zB = fj.l.b(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                t4.v.i(accessibilityEventObtain, zB);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        this.B = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        this.B = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f18464z;
        if (accessibilityManager.isEnabled()) {
            this.B = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f18458d.getHandler();
        fj.l.c(handler);
        handler.removeCallbacks(this.f18459d0);
        AccessibilityManager accessibilityManager = this.f18464z;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i10, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(d3.r rVar) {
        d3.n nVar = rVar.f4766d;
        d3.n nVar2 = rVar.f4766d;
        d3.y yVar = d3.v.f4776a;
        if (!nVar.f4758a.c(d3.v.f4776a)) {
            d3.y yVar2 = d3.v.H;
            if (nVar2.f4758a.c(yVar2)) {
                return (int) (((g3.m0) nVar2.i(yVar2)).f7145a & 4294967295L);
            }
        }
        return this.M;
    }

    public final int r(d3.r rVar) {
        d3.n nVar = rVar.f4766d;
        d3.n nVar2 = rVar.f4766d;
        d3.y yVar = d3.v.f4776a;
        if (!nVar.f4758a.c(d3.v.f4776a)) {
            d3.y yVar2 = d3.v.H;
            if (nVar2.f4758a.c(yVar2)) {
                return (int) (((g3.m0) nVar2.i(yVar2)).f7145a >> 32);
            }
        }
        return this.M;
    }

    public final q.k s() {
        if (this.Q) {
            this.Q = false;
            t tVar = this.f18458d;
            this.S = d3.u.b(tVar.getSemanticsOwner(), o.f18337c);
            if (v()) {
                q.v vVar = this.S;
                Resources resources = tVar.getContext().getResources();
                q.t tVar2 = this.U;
                tVar2.a();
                q.t tVar3 = this.V;
                tVar3.a();
                d3.s sVar = (d3.s) vVar.b(-1);
                d3.r rVar = sVar != null ? sVar.f4769a : null;
                fj.l.c(rVar);
                ArrayList arrayListB = d3.c0.b(rVar, new c2.x0(vVar, 21), new c2.x0(resources, 22), yd.f.K(rVar));
                int iB = yd.f.B(arrayListB);
                int i10 = 1;
                if (1 <= iB) {
                    while (true) {
                        int i11 = ((d3.r) arrayListB.get(i10 - 1)).f4768f;
                        int i12 = ((d3.r) arrayListB.get(i10)).f4768f;
                        tVar2.f(i11, i12);
                        tVar3.f(i12, i11);
                        if (i10 == iB) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return this.S;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b2.c u(d3.r r10, android.graphics.Rect r11, c2.w0 r12) {
        /*
            r9 = this;
            w2.w r0 = new w2.w
            r0.<init>(r12)
            v2.f0 r10 = r10.f4765c
            v2.b1 r12 = r10.Y
            v1.n r12 = r12.f17586f
            int r1 = r12.f17568d
            r1 = r1 & 8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L76
        L14:
            if (r12 == 0) goto L76
            int r1 = r12.f17567c
            r1 = r1 & 8
            if (r1 == 0) goto L6d
            r1 = r12
            r5 = r2
        L1e:
            if (r1 == 0) goto L6d
            boolean r6 = r1 instanceof v2.z1
            if (r6 == 0) goto L30
            r6 = r1
            v2.z1 r6 = (v2.z1) r6
            r6.u0(r0)
            boolean r6 = r0.f18444a
            if (r6 == 0) goto L68
            r2 = r1
            goto L76
        L30:
            int r6 = r1.f17567c
            r6 = r6 & 8
            if (r6 == 0) goto L68
            boolean r6 = r1 instanceof v2.k
            if (r6 == 0) goto L68
            r6 = r1
            v2.k r6 = (v2.k) r6
            v1.n r6 = r6.I
            r7 = r4
        L40:
            if (r6 == 0) goto L65
            int r8 = r6.f17567c
            r8 = r8 & 8
            if (r8 == 0) goto L62
            int r7 = r7 + 1
            if (r7 != r3) goto L4e
            r1 = r6
            goto L62
        L4e:
            if (r5 != 0) goto L59
            g1.e r5 = new g1.e
            r8 = 16
            v1.n[] r8 = new v1.n[r8]
            r5.<init>(r8)
        L59:
            if (r1 == 0) goto L5f
            r5.b(r1)
            r1 = r2
        L5f:
            r5.b(r6)
        L62:
            v1.n r6 = r6.f17570f
            goto L40
        L65:
            if (r7 != r3) goto L68
            goto L1e
        L68:
            v1.n r1 = v2.n.e(r5)
            goto L1e
        L6d:
            int r1 = r12.f17568d
            r1 = r1 & 8
            if (r1 == 0) goto L76
            v1.n r12 = r12.f17570f
            goto L14
        L76:
            v2.z1 r2 = (v2.z1) r2
            if (r2 == 0) goto Lb9
            r12 = r2
            v1.n r12 = (v1.n) r12
            v1.n r12 = r12.f17565a
            boolean r12 = r12.G
            if (r12 != r3) goto Lb9
            v2.i1 r10 = v2.n.x(r2)
            t2.w r12 = t2.z.h(r10)
            b2.c r10 = r12.z(r10, r4)
            float r12 = r10.f1502a
            float r0 = r10.f1503b
            float r1 = r10.f1504c
            float r10 = r10.f1505d
            android.graphics.Rect r10 = r9.M(r12, r0, r1, r10)
            int r12 = r10.left
            int r0 = r11.left
            int r12 = r12 - r0
            float r12 = (float) r12
            int r0 = r10.top
            int r11 = r11.top
            int r0 = r0 - r11
            float r11 = (float) r0
            b2.c r0 = new b2.c
            int r1 = r10.width()
            float r1 = (float) r1
            float r1 = r1 + r12
            int r10 = r10.height()
            float r10 = (float) r10
            float r10 = r10 + r11
            r0.<init>(r12, r11, r1, r10)
            return r0
        Lb9:
            v2.b1 r10 = r10.Y
            v2.i1 r10 = r10.f17584d
            b2.c r10 = t2.z.f(r10, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.y.u(d3.r, android.graphics.Rect, c2.w0):b2.c");
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.f18464z;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.B;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.B = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(v2.f0 f0Var) {
        if (this.O.add(f0Var)) {
            this.P.h(pi.o.f13011a);
        }
    }
}
