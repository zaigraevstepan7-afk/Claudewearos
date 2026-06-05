package v2;

import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class i1 extends n0 implements t2.p0, t2.w, s1 {

    /* renamed from: f0, reason: collision with root package name */
    public static final c2.t0 f17679f0 = new c2.t0();

    /* renamed from: g0, reason: collision with root package name */
    public static final u f17680g0 = new u();

    /* renamed from: h0, reason: collision with root package name */
    public static final float[] f17681h0 = c2.k0.a();

    /* renamed from: i0, reason: collision with root package name */
    public static final c1 f17682i0 = new c1();

    /* renamed from: j0, reason: collision with root package name */
    public static final d1 f17683j0 = new d1();
    public final f0 H;
    public i1 I;
    public i1 J;
    public boolean K;
    public boolean L;
    public ej.c M;
    public s3.c N;
    public s3.m O;
    public t2.r0 Q;
    public q.a0 R;
    public float T;
    public b2.a U;
    public u V;
    public boolean X;
    public boolean Y;
    public f2.b Z;

    /* renamed from: a0, reason: collision with root package name */
    public c2.u f17684a0;

    /* renamed from: b0, reason: collision with root package name */
    public t2.l0 f17685b0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f17687d0;

    /* renamed from: e0, reason: collision with root package name */
    public q1 f17688e0;
    public float P = 0.8f;
    public long S = 0;
    public c2.w0 W = c2.e0.f2986b;

    /* renamed from: c0, reason: collision with root package name */
    public final f1 f17686c0 = new f1(this, 1);

    public i1(f0 f0Var) {
        this.H = f0Var;
        this.N = f0Var.R;
        this.O = f0Var.S;
    }

    public static i1 R1(t2.w wVar) {
        i1 i1Var;
        t2.o0 o0Var = wVar instanceof t2.o0 ? (t2.o0) wVar : null;
        if (o0Var != null && (i1Var = o0Var.f15613a.H) != null) {
            return i1Var;
        }
        fj.l.d(wVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (i1) wVar;
    }

    public final void A1(v1.n nVar, e1 e1Var, long j, q qVar, int i10, boolean z2, float f10) {
        if (nVar == null) {
            C1(e1Var, j, qVar, i10, z2);
            return;
        }
        if (!e1Var.d(nVar)) {
            A1(n.d(nVar, e1Var.a()), e1Var, j, qVar, i10, z2, f10);
            return;
        }
        int i11 = qVar.f17745c;
        q.b0 b0Var = qVar.f17743a;
        qVar.e(i11 + 1, b0Var.f13034b);
        qVar.f17745c++;
        b0Var.a(nVar);
        qVar.f17744b.a(n.a(f10, z2, false));
        K1(n.d(nVar, e1Var.a()), e1Var, j, qVar, i10, z2, f10, true);
        qVar.f17745c = i11;
    }

    public final void B1(e1 e1Var, long j, q qVar, int i10, boolean z2) {
        boolean z10;
        boolean z11;
        v1.n nVarX1 = x1(e1Var.a());
        if (!X1(j)) {
            if (i10 == 1) {
                float fO1 = o1(j, v1());
                if ((Float.floatToRawIntBits(fO1) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040) {
                    if (qVar.f17745c != yd.f.B(qVar)) {
                        if (n.g(qVar.b(), n.a(fO1, false, false)) <= 0) {
                            return;
                        }
                    }
                    A1(nVarX1, e1Var, j, qVar, i10, false, fO1);
                    return;
                }
                return;
            }
            return;
        }
        if (nVarX1 == null) {
            C1(e1Var, j, qVar, i10, z2);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < z0() && fIntBitsToFloat2 < y0()) {
            z1(nVarX1, e1Var, j, qVar, i10, z2);
            return;
        }
        float fO12 = i10 == 1 ? o1(j, v1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fO12) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040) {
            if (qVar.f17745c != yd.f.B(qVar)) {
                z10 = z2;
                if (n.g(qVar.b(), n.a(fO12, z10, false)) > 0) {
                }
                K1(nVarX1, e1Var, j, qVar, i10, z10, fO12, z11);
            }
            z10 = z2;
            z11 = true;
            K1(nVarX1, e1Var, j, qVar, i10, z10, fO12, z11);
        }
        z10 = z2;
        z11 = false;
        K1(nVarX1, e1Var, j, qVar, i10, z10, fO12, z11);
    }

    @Override // t2.w
    public final long C(t2.w wVar, long j) {
        if (wVar instanceof t2.o0) {
            t2.o0 o0Var = (t2.o0) wVar;
            o0Var.f15613a.H.F1();
            return o0Var.C(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        i1 i1VarR1 = R1(wVar);
        i1VarR1.F1();
        i1 i1VarS1 = s1(i1VarR1);
        while (i1VarR1 != i1VarS1) {
            q1 q1Var = i1VarR1.f17688e0;
            if (q1Var != null) {
                j = ((w2.l1) q1Var).c(j, false);
            }
            j = yd.f.X(j, i1VarR1.S);
            i1VarR1 = i1VarR1.J;
            fj.l.c(i1VarR1);
        }
        return m1(i1VarS1, j);
    }

    public void C1(e1 e1Var, long j, q qVar, int i10, boolean z2) {
        i1 i1Var = this.I;
        if (i1Var != null) {
            i1Var.B1(e1Var, i1Var.t1(j), qVar, i10, z2);
        }
    }

    public final void D1() {
        q1 q1Var = this.f17688e0;
        if (q1Var != null) {
            q1Var.invalidate();
            return;
        }
        i1 i1Var = this.J;
        if (i1Var != null) {
            i1Var.D1();
        }
    }

    @Override // t2.w
    public final boolean E() {
        return w1().G;
    }

    public final boolean E1() {
        if (this.f17688e0 != null && this.P <= 0.0f) {
            return true;
        }
        i1 i1Var = this.J;
        if (i1Var != null) {
            return i1Var.E1();
        }
        return false;
    }

    public final void F1() {
        this.H.Z.b();
    }

    @Override // t2.w
    public final void G(float[] fArr) {
        r1 r1VarA = i0.a(this.H);
        i1 i1VarR1 = R1(t2.z.h(this));
        U1(i1VarR1, fArr);
        if (r1VarA instanceof p2.i) {
            ((w2.t) ((p2.i) r1VarA)).v(fArr);
            return;
        }
        long jX = i1VarR1.X(0L);
        if ((9223372034707292159L & jX) != 9205357640488583168L) {
            c2.k0.f(fArr, Float.intBitsToFloat((int) (jX >> 32)), Float.intBitsToFloat((int) (jX & 4294967295L)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r7v7, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void G1() {
        v1.n nVarW1;
        boolean zG = j1.g(128);
        v1.n nVarY1 = y1(zG);
        if (nVarY1 == null || (nVarY1.f17565a.f17568d & 128) == 0) {
            return;
        }
        t1.g gVarF = t1.r.f();
        ej.c cVarE = gVarF != null ? gVarF.e() : null;
        t1.g gVarK = t1.r.k(gVarF);
        try {
            if (!zG) {
                nVarW1 = w1().f17569e;
                if (nVarW1 == null) {
                }
            }
            nVarW1 = w1();
            for (v1.n nVarY12 = y1(zG); nVarY12 != null; nVarY12 = nVarY12.f17570f) {
                if ((nVarY12.f17568d & 128) == 0) {
                    break;
                }
                if ((nVarY12.f17567c & 128) != 0) {
                    k kVarE = nVarY12;
                    ?? eVar = 0;
                    while (kVarE != 0) {
                        if (kVarE instanceof w0) {
                            ((w0) kVarE).f(this.f15552c);
                        } else if ((kVarE.f17567c & 128) != 0 && (kVarE instanceof k)) {
                            v1.n nVar = kVarE.I;
                            int i10 = 0;
                            kVarE = kVarE;
                            eVar = eVar;
                            while (nVar != null) {
                                if ((nVar.f17567c & 128) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        kVarE = nVar;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new g1.e(new v1.n[16]);
                                        }
                                        if (kVarE != 0) {
                                            eVar.b(kVarE);
                                            kVarE = 0;
                                        }
                                        eVar.b(nVar);
                                    }
                                }
                                nVar = nVar.f17570f;
                                kVarE = kVarE;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        kVarE = n.e(eVar);
                    }
                }
                if (nVarY12 == nVarW1) {
                    break;
                }
            }
        } finally {
            t1.r.n(gVarF, gVarK, cVarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void H1() {
        boolean zG = j1.g(4194304);
        v1.n nVarW1 = w1();
        if (!zG && (nVarW1 = nVarW1.f17569e) == null) {
            return;
        }
        for (v1.n nVarY1 = y1(zG); nVarY1 != null && (nVarY1.f17568d & 4194304) != 0; nVarY1 = nVarY1.f17570f) {
            if ((nVarY1.f17567c & 4194304) != 0) {
                k kVarE = nVarY1;
                ?? eVar = 0;
                while (kVarE != 0) {
                    if (kVarE instanceof v) {
                        ((v) kVarE).o0(this);
                    } else if ((kVarE.f17567c & 4194304) != 0 && (kVarE instanceof k)) {
                        v1.n nVar = kVarE.I;
                        int i10 = 0;
                        kVarE = kVarE;
                        eVar = eVar;
                        while (nVar != null) {
                            if ((nVar.f17567c & 4194304) != 0) {
                                i10++;
                                eVar = eVar;
                                if (i10 == 1) {
                                    kVarE = nVar;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new g1.e(new v1.n[16]);
                                    }
                                    if (kVarE != 0) {
                                        eVar.b(kVarE);
                                        kVarE = 0;
                                    }
                                    eVar.b(nVar);
                                }
                            }
                            nVar = nVar.f17570f;
                            kVarE = kVarE;
                            eVar = eVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    kVarE = n.e(eVar);
                }
            }
            if (nVarY1 == nVarW1) {
                return;
            }
        }
    }

    @Override // t2.w
    public final long I() {
        return this.f15552c;
    }

    public final void I1() {
        this.K = true;
        this.f17686c0.a();
        O1();
        if (s3.j.a(this.S, 0L)) {
            return;
        }
        this.H.N(this);
    }

    public final void J1() {
        boolean zG = j1.g(1048576);
        v1.n nVarY1 = y1(zG);
        if (nVarY1 == null || (nVarY1.f17565a.f17568d & 1048576) == 0) {
            return;
        }
        v1.n nVarW1 = w1();
        if (!zG && (nVarW1 = nVarW1.f17569e) == null) {
            return;
        }
        for (v1.n nVarY12 = y1(zG); nVarY12 != null && (nVarY12.f17568d & 1048576) != 0; nVarY12 = nVarY12.f17570f) {
            if ((nVarY12.f17567c & 1048576) != 0) {
                v1.n nVarE = nVarY12;
                g1.e eVar = null;
                while (nVarE != null) {
                    if ((nVarE.f17567c & 1048576) != 0 && (nVarE instanceof k)) {
                        int i10 = 0;
                        for (v1.n nVar = ((k) nVarE).I; nVar != null; nVar = nVar.f17570f) {
                            if ((nVar.f17567c & 1048576) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    nVarE = nVar;
                                } else {
                                    if (eVar == null) {
                                        eVar = new g1.e(new v1.n[16]);
                                    }
                                    if (nVarE != null) {
                                        eVar.b(nVarE);
                                        nVarE = null;
                                    }
                                    eVar.b(nVar);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                    nVarE = n.e(eVar);
                }
            }
            if (nVarY12 == nVarW1) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ac A[PHI: r4
      0x01ac: PHI (r4v10 g1.e) = (r4v1 g1.e), (r4v1 g1.e), (r4v12 g1.e) binds: [B:57:0x0179, B:59:0x017d, B:73:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [v1.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K1(v1.n r17, v2.e1 r18, long r19, v2.q r21, int r22, boolean r23, float r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.i1.K1(v1.n, v2.e1, long, v2.q, int, boolean, float, boolean):void");
    }

    public abstract void L1(c2.u uVar, f2.b bVar);

    @Override // v2.s1
    public final boolean M() {
        return (this.f17688e0 == null || this.K || !this.H.G()) ? false : true;
    }

    public final void M1(long j, float f10, ej.c cVar) {
        V1(cVar, false);
        boolean zA = s3.j.a(this.S, j);
        f0 f0Var = this.H;
        if (!zA) {
            ((w2.t) i0.a(f0Var)).Q(-4.0f);
            this.S = j;
            q1 q1Var = this.f17688e0;
            if (q1Var != null) {
                ((w2.l1) q1Var).d(j);
            } else {
                i1 i1Var = this.J;
                if (i1Var != null) {
                    i1Var.D1();
                }
            }
            f0Var.N(this);
            n0.i1(this);
            r1 r1Var = f0Var.G;
            if (r1Var != null) {
                ((w2.t) r1Var).C(f0Var);
            }
        }
        this.T = f10;
        if (this == f0Var.Y.f17584d) {
            ((w2.t) i0.a(f0Var)).getRectManager().e(f0Var);
        }
        if (this.D) {
            return;
        }
        U0(e1());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N1(b2.a r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.i1.N1(b2.a, boolean, boolean):void");
    }

    public final void O1() {
        if (this.f17688e0 != null) {
            V1(null, false);
            this.H.U(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [g1.e] */
    public final void P1(t2.r0 r0Var) {
        i1 i1Var;
        t2.r0 r0Var2 = this.Q;
        if (r0Var != r0Var2) {
            this.Q = r0Var;
            f0 f0Var = this.H;
            int i10 = 0;
            if (r0Var2 == null || r0Var.getWidth() != r0Var2.getWidth() || r0Var.getHeight() != r0Var2.getHeight()) {
                int width = r0Var.getWidth();
                int height = r0Var.getHeight();
                q1 q1Var = this.f17688e0;
                if (q1Var != null) {
                    ((w2.l1) q1Var).e((width << 32) | (height & 4294967295L));
                } else if (f0Var.H() && (i1Var = this.J) != null) {
                    i1Var.D1();
                }
                M0((height & 4294967295L) | (width << 32));
                if (this.M != null) {
                    W1(false);
                }
                boolean zG = j1.g(4);
                v1.n nVarW1 = w1();
                if (zG || (nVarW1 = nVarW1.f17569e) != null) {
                    for (v1.n nVarY1 = y1(zG); nVarY1 != null && (nVarY1.f17568d & 4) != 0; nVarY1 = nVarY1.f17570f) {
                        if ((nVarY1.f17567c & 4) != 0) {
                            k kVarE = nVarY1;
                            ?? eVar = 0;
                            while (kVarE != 0) {
                                if (kVarE instanceof m) {
                                    ((m) kVarE).d0();
                                } else if ((kVarE.f17567c & 4) != 0 && (kVarE instanceof k)) {
                                    v1.n nVar = kVarE.I;
                                    int i11 = 0;
                                    kVarE = kVarE;
                                    eVar = eVar;
                                    while (nVar != null) {
                                        if ((nVar.f17567c & 4) != 0) {
                                            i11++;
                                            eVar = eVar;
                                            if (i11 == 1) {
                                                kVarE = nVar;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new g1.e(new v1.n[16]);
                                                }
                                                if (kVarE != 0) {
                                                    eVar.b(kVarE);
                                                    kVarE = 0;
                                                }
                                                eVar.b(nVar);
                                            }
                                        }
                                        nVar = nVar.f17570f;
                                        kVarE = kVarE;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                kVarE = n.e(eVar);
                            }
                        }
                        if (nVarY1 == nVarW1) {
                            break;
                        }
                    }
                }
                r1 r1Var = f0Var.G;
                if (r1Var != null) {
                    ((w2.t) r1Var).C(f0Var);
                }
                f0Var.N(this);
            }
            q.a0 a0Var = this.R;
            if ((a0Var == null || a0Var.f13030e == 0) && r0Var.f().isEmpty()) {
                return;
            }
            q.a0 a0Var2 = this.R;
            Map mapF = r0Var.f();
            if (a0Var2 != null && a0Var2.f13030e == mapF.size()) {
                Object[] objArr = a0Var2.f13027b;
                int[] iArr = a0Var2.f13028c;
                long[] jArr = a0Var2.f13026a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i12 = 0;
                loop0: while (true) {
                    long j = jArr[i12];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = i10; i14 < i13; i14++) {
                            if ((255 & j) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr[i15];
                                int i16 = iArr[i15];
                                Integer num = (Integer) mapF.get((t2.a) obj);
                                if (num == null || num.intValue() != i16) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i13 != 8) {
                            return;
                        }
                    }
                    if (i12 == length) {
                        return;
                    }
                    i12++;
                    i10 = 0;
                }
            }
            f0Var.Z.f17703p.Q.f();
            q.a0 a0Var3 = this.R;
            if (a0Var3 == null) {
                q.a0 a0Var4 = q.k0.f13101a;
                a0Var3 = new q.a0();
                this.R = a0Var3;
            }
            a0Var3.a();
            for (Map.Entry entry : r0Var.f().entrySet()) {
                a0Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void Q1(v1.n nVar, e1 e1Var, long j, q qVar, int i10, boolean z2, float f10) {
        int i11;
        if (nVar == null) {
            C1(e1Var, j, qVar, i10, z2);
            return;
        }
        if (!e1Var.d(nVar)) {
            Q1(n.d(nVar, e1Var.a()), e1Var, j, qVar, i10, z2, f10);
            return;
        }
        if (!e1Var.e(nVar)) {
            K1(n.d(nVar, e1Var.a()), e1Var, j, qVar, i10, z2, f10, false);
            return;
        }
        h1 h1Var = new h1(this, nVar, e1Var, j, qVar, i10, z2, f10);
        q.x xVar = qVar.f17744b;
        q.b0 b0Var = qVar.f17743a;
        if (qVar.f17745c != yd.f.B(qVar)) {
            long jB = qVar.b();
            int i12 = qVar.f17745c;
            int iB = yd.f.B(qVar);
            qVar.f17745c = iB;
            qVar.e(iB + 1, b0Var.f13034b);
            qVar.f17745c++;
            b0Var.a(nVar);
            xVar.a(n.a(f10, z2, false));
            h1Var.a();
            qVar.f17745c = iB;
            long jB2 = qVar.b();
            if (qVar.f17745c + 1 >= yd.f.B(qVar) || n.g(jB, jB2) <= 0) {
                qVar.e(qVar.f17745c + 1, b0Var.f13034b);
            } else {
                qVar.e(i12 + 1, n.p(jB2) ? qVar.f17745c + 2 : qVar.f17745c + 1);
            }
            qVar.f17745c = i12;
            return;
        }
        int i13 = qVar.f17745c;
        int i14 = i13 + 1;
        qVar.e(i14, b0Var.f13034b);
        qVar.f17745c++;
        b0Var.a(nVar);
        xVar.a(n.a(f10, z2, false));
        h1Var.a();
        qVar.f17745c = i13;
        if (i14 == yd.f.B(qVar) || n.p(qVar.b())) {
            int i15 = qVar.f17745c;
            int i16 = i15 + 1;
            b0Var.k(i16);
            if (i16 < 0 || i16 >= (i11 = xVar.f13145b)) {
                r.a.d("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = xVar.f13144a;
            long j4 = jArr[i16];
            if (i16 != i11 - 1) {
                qi.k.h0(jArr, jArr, i16, i15 + 2, i11);
            }
            xVar.f13145b--;
        }
    }

    public final b2.c S1() {
        if (w1().G) {
            t2.w wVarH = t2.z.h(this);
            b2.a aVar = this.U;
            if (aVar == null) {
                aVar = new b2.a();
                this.U = aVar;
            }
            long jN1 = n1(v1());
            int i10 = (int) (jN1 >> 32);
            aVar.f1496a = -Float.intBitsToFloat(i10);
            int i11 = (int) (jN1 & 4294967295L);
            aVar.f1497b = -Float.intBitsToFloat(i11);
            aVar.f1498c = Float.intBitsToFloat(i10) + z0();
            aVar.f1499d = Float.intBitsToFloat(i11) + y0();
            i1 i1Var = this;
            while (i1Var != wVarH) {
                i1Var.N1(aVar, false, true);
                if (!aVar.b()) {
                    i1Var = i1Var.J;
                    fj.l.c(i1Var);
                }
            }
            return new b2.c(aVar.f1496a, aVar.f1497b, aVar.f1498c, aVar.f1499d);
        }
        return b2.c.f1501e;
    }

    public final void T1(i1 i1Var, float[] fArr) {
        float[] fArrA;
        if (fj.l.b(i1Var, this)) {
            return;
        }
        i1 i1Var2 = this.J;
        fj.l.c(i1Var2);
        i1Var2.T1(i1Var, fArr);
        if (!s3.j.a(this.S, 0L)) {
            float[] fArr2 = f17681h0;
            c2.k0.d(fArr2);
            long j = this.S;
            c2.k0.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            c2.k0.e(fArr, fArr2);
        }
        q1 q1Var = this.f17688e0;
        if (q1Var == null || (fArrA = ((w2.l1) q1Var).a()) == null) {
            return;
        }
        c2.k0.e(fArr, fArrA);
    }

    public final void U1(i1 i1Var, float[] fArr) {
        i1 i1Var2 = this;
        while (!i1Var2.equals(i1Var)) {
            q1 q1Var = i1Var2.f17688e0;
            if (q1Var != null) {
                c2.k0.e(fArr, ((w2.l1) q1Var).b());
            }
            if (!s3.j.a(i1Var2.S, 0L)) {
                float[] fArr2 = f17681h0;
                c2.k0.d(fArr2);
                c2.k0.f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                c2.k0.e(fArr, fArr2);
            }
            i1Var2 = i1Var2.J;
            fj.l.c(i1Var2);
        }
    }

    public final void V1(ej.c cVar, boolean z2) {
        r1 r1Var;
        g1.e eVar;
        Reference referencePoll;
        t2.l0 l0Var;
        g1.e eVar2;
        Reference referencePoll2;
        Object obj;
        f0 f0Var = this.H;
        boolean z10 = (!z2 && this.M == cVar && fj.l.b(this.N, f0Var.R) && this.O == f0Var.S) ? false : true;
        this.N = f0Var.R;
        this.O = f0Var.S;
        boolean zG = f0Var.G();
        f1 f1Var = this.f17686c0;
        if (!zG || cVar == null) {
            this.M = null;
            q1 q1Var = this.f17688e0;
            if (q1Var != null) {
                w2.l1 l1Var = (w2.l1) q1Var;
                w2.t tVar = l1Var.f18318c;
                if (!c2.e0.t(l1Var.b())) {
                    f0Var.N(this);
                }
                l1Var.f18319d = null;
                l1Var.f18320e = null;
                l1Var.f18322z = true;
                if (l1Var.C) {
                    l1Var.C = false;
                    tVar.A(l1Var, false);
                }
                c2.b0 b0Var = l1Var.f18317b;
                if (b0Var != null) {
                    b0Var.a(l1Var.f18316a);
                    q5.b bVar = tVar.R0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) bVar.f13236c;
                        eVar = (g1.e) bVar.f13235b;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            eVar.k(referencePoll);
                        }
                    } while (referencePoll != null);
                    eVar.b(new WeakReference(l1Var, (ReferenceQueue) bVar.f13236c));
                    tVar.f18383a0.j(l1Var);
                }
                this.f17688e0 = null;
                f0Var.f17627c0 = true;
                f1Var.a();
                if (w1().G && f0Var.H() && (r1Var = f0Var.G) != null) {
                    ((w2.t) r1Var).C(f0Var);
                }
            }
            this.f17687d0 = false;
            return;
        }
        this.M = cVar;
        if (this.f17688e0 != null) {
            if (z10) {
                W1(true);
                return;
            }
            return;
        }
        r1 r1VarA = i0.a(f0Var);
        t2.l0 l0Var2 = this.f17685b0;
        if (l0Var2 == null) {
            t2.l0 l0Var3 = new t2.l0(1, this, new f1(this, 0));
            this.f17685b0 = l0Var3;
            l0Var = l0Var3;
        } else {
            l0Var = l0Var2;
        }
        w2.t tVar2 = (w2.t) r1VarA;
        q5.b bVar2 = tVar2.R0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) bVar2.f13236c;
            eVar2 = (g1.e) bVar2.f13235b;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                eVar2.k(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i10 = eVar2.f7026c;
            if (i10 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) eVar2.l(i10 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        q1 l1Var2 = (q1) obj;
        if (l1Var2 != null) {
            w2.l1 l1Var3 = (w2.l1) l1Var2;
            c2.b0 b0Var2 = l1Var3.f18317b;
            if (b0Var2 == null) {
                throw t.m1.e("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!l1Var3.f18316a.f6531s) {
                s2.a.a("layer should have been released before reuse");
            }
            l1Var3.f18316a = b0Var2.b();
            l1Var3.f18322z = false;
            l1Var3.f18319d = l0Var;
            l1Var3.f18320e = f1Var;
            l1Var3.J = false;
            l1Var3.K = false;
            l1Var3.L = true;
            c2.k0.d(l1Var3.A);
            float[] fArr = l1Var3.B;
            if (fArr != null) {
                c2.k0.d(fArr);
            }
            l1Var3.H = c2.a1.f2962b;
            l1Var3.M = false;
            long j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            l1Var3.f18321f = (j & 4294967295L) | (j << 32);
            l1Var3.I = null;
            l1Var3.G = 0;
        } else {
            l1Var2 = new w2.l1(tVar2.getGraphicsContext().b(), tVar2.getGraphicsContext(), tVar2, l0Var, f1Var);
        }
        w2.l1 l1Var4 = (w2.l1) l1Var2;
        l1Var4.e(this.f15552c);
        l1Var4.d(this.S);
        this.f17688e0 = l1Var2;
        W1(true);
        f0Var.f17627c0 = true;
        f1Var.a();
    }

    public final void W1(boolean z2) {
        char c6;
        w2.t tVar;
        boolean z10;
        w2.t tVar2;
        r1 r1Var;
        ej.a aVar;
        int i10;
        ej.a aVar2;
        q1 q1Var = this.f17688e0;
        if (q1Var == null) {
            if (this.M == null) {
                return;
            }
            s2.a.b("null layer with a non-null layerBlock");
            return;
        }
        ej.c cVar = this.M;
        if (cVar == null) {
            throw t.m1.e("updateLayerParameters requires a non-null layerBlock");
        }
        c2.t0 t0Var = f17679f0;
        t0Var.f();
        f0 f0Var = this.H;
        t0Var.L = f0Var.R;
        t0Var.M = f0Var.S;
        t0Var.K = cg.b.S(this.f15552c);
        ((w2.t) i0.a(f0Var)).getSnapshotObserver().f17770a.c(this, d.f17598e, new a2.d0(15, cVar, this));
        u uVar = this.V;
        if (uVar == null) {
            uVar = new u();
            this.V = uVar;
        }
        u uVar2 = f17680g0;
        uVar2.getClass();
        uVar2.f17778a = uVar.f17778a;
        uVar2.f17779b = uVar.f17779b;
        uVar2.f17780c = uVar.f17780c;
        uVar2.f17781d = uVar.f17781d;
        uVar2.f17782e = uVar.f17782e;
        uVar2.f17783f = uVar.f17783f;
        uVar2.f17784g = uVar.f17784g;
        uVar2.f17785h = uVar.f17785h;
        uVar2.f17786i = uVar.f17786i;
        float f10 = t0Var.f3039b;
        uVar.f17778a = f10;
        uVar.f17779b = t0Var.f3040c;
        uVar.f17780c = t0Var.f3042e;
        uVar.f17781d = t0Var.f3043f;
        uVar.f17782e = t0Var.C;
        uVar.f17783f = t0Var.D;
        uVar.f17784g = t0Var.E;
        uVar.f17785h = t0Var.F;
        long j = t0Var.G;
        uVar.f17786i = j;
        w2.l1 l1Var = (w2.l1) q1Var;
        w2.t tVar3 = l1Var.f18318c;
        int i11 = t0Var.f3038a | l1Var.G;
        l1Var.E = t0Var.M;
        l1Var.D = t0Var.L;
        int i12 = i11 & 4096;
        if (i12 != 0) {
            l1Var.H = j;
        }
        if ((i11 & 1) != 0) {
            f2.d dVar = l1Var.f18316a.f6514a;
            if (dVar.c() != f10) {
                dVar.p(f10);
            }
        }
        if ((i11 & 2) != 0) {
            f2.b bVar = l1Var.f18316a;
            float f11 = t0Var.f3040c;
            f2.d dVar2 = bVar.f6514a;
            if (dVar2.v() != f11) {
                dVar2.j(f11);
            }
        }
        if ((i11 & 4) != 0) {
            l1Var.f18316a.f(t0Var.f3041d);
        }
        if ((i11 & 8) != 0) {
            f2.b bVar2 = l1Var.f18316a;
            float f12 = t0Var.f3042e;
            f2.d dVar3 = bVar2.f6514a;
            if (dVar3.L() != f12) {
                dVar3.s(f12);
            }
        }
        if ((i11 & 16) != 0) {
            f2.b bVar3 = l1Var.f18316a;
            float f13 = t0Var.f3043f;
            f2.d dVar4 = bVar3.f6514a;
            if (dVar4.H() != f13) {
                dVar4.h(f13);
            }
        }
        if ((i11 & 32) != 0) {
            f2.b bVar4 = l1Var.f18316a;
            float f14 = t0Var.f3044z;
            f2.d dVar5 = bVar4.f6514a;
            if (dVar5.P() != f14) {
                dVar5.d(f14);
                bVar4.f6520g = true;
                bVar4.a();
            }
            if (t0Var.f3044z > 0.0f && !l1Var.M && (aVar2 = l1Var.f18320e) != null) {
                aVar2.a();
            }
        }
        if ((i11 & 64) != 0) {
            f2.b bVar5 = l1Var.f18316a;
            long j4 = t0Var.A;
            f2.d dVar6 = bVar5.f6514a;
            if (!c2.w.d(j4, dVar6.F())) {
                dVar6.n(j4);
            }
        }
        if ((i11 & 128) != 0) {
            f2.b bVar6 = l1Var.f18316a;
            long j10 = t0Var.B;
            f2.d dVar7 = bVar6.f6514a;
            if (!c2.w.d(j10, dVar7.I())) {
                dVar7.t(j10);
            }
        }
        if ((i11 & 1024) != 0) {
            f2.b bVar7 = l1Var.f18316a;
            float f15 = t0Var.E;
            f2.d dVar8 = bVar7.f6514a;
            if (dVar8.D() != f15) {
                dVar8.g(f15);
            }
        }
        if ((i11 & 256) != 0) {
            f2.b bVar8 = l1Var.f18316a;
            float f16 = t0Var.C;
            f2.d dVar9 = bVar8.f6514a;
            if (dVar9.M() != f16) {
                dVar9.w(f16);
            }
        }
        if ((i11 & 512) != 0) {
            f2.b bVar9 = l1Var.f18316a;
            float f17 = t0Var.D;
            f2.d dVar10 = bVar9.f6514a;
            if (dVar10.B() != f17) {
                dVar10.b(f17);
            }
        }
        if ((i11 & 2048) != 0) {
            f2.b bVar10 = l1Var.f18316a;
            float f18 = t0Var.F;
            f2.d dVar11 = bVar10.f6514a;
            if (dVar11.K() != f18) {
                dVar11.u(f18);
            }
        }
        if (i12 != 0) {
            c6 = ' ';
            if (c2.a1.a(l1Var.H, c2.a1.f2962b)) {
                f2.b bVar11 = l1Var.f18316a;
                if (!b2.b.c(bVar11.f6534v, 9205357640488583168L)) {
                    bVar11.f6534v = 9205357640488583168L;
                    bVar11.f6514a.E(9205357640488583168L);
                }
            } else {
                f2.b bVar12 = l1Var.f18316a;
                long jFloatToRawIntBits = (Float.floatToRawIntBits(c2.a1.b(l1Var.H) * ((int) (l1Var.f18321f >> 32))) << 32) | (Float.floatToRawIntBits(c2.a1.c(l1Var.H) * ((int) (l1Var.f18321f & 4294967295L))) & 4294967295L);
                if (!b2.b.c(bVar12.f6534v, jFloatToRawIntBits)) {
                    bVar12.f6534v = jFloatToRawIntBits;
                    bVar12.f6514a.E(jFloatToRawIntBits);
                }
            }
        } else {
            c6 = ' ';
        }
        if ((i11 & 16384) != 0) {
            l1Var.f18316a.g(t0Var.I);
        }
        if ((131072 & i11) != 0) {
            l1Var.f18316a.h(t0Var.N);
        }
        if ((262144 & i11) != 0) {
            f2.b bVar13 = l1Var.f18316a;
            c2.n nVar = t0Var.O;
            f2.d dVar12 = bVar13.f6514a;
            if (!fj.l.b(dVar12.A(), nVar)) {
                dVar12.o(nVar);
            }
        }
        if ((524288 & i11) != 0) {
            f2.b bVar14 = l1Var.f18316a;
            int i13 = t0Var.P;
            f2.d dVar13 = bVar14.f6514a;
            if (dVar13.f() != i13) {
                dVar13.i(i13);
            }
        }
        if ((32768 & i11) != 0) {
            f2.b bVar15 = l1Var.f18316a;
            int i14 = t0Var.J;
            if (i14 == 0) {
                i10 = 0;
            } else if (i14 == 1) {
                i10 = 1;
            } else {
                i10 = 2;
                if (i14 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            f2.d dVar14 = bVar15.f6514a;
            if (dVar14.z() != i10) {
                dVar14.N(i10);
            }
        }
        if ((i11 & 7963) != 0) {
            l1Var.J = true;
            l1Var.K = true;
        }
        if (fj.l.b(l1Var.I, t0Var.Q)) {
            tVar = tVar3;
            z10 = false;
        } else {
            c2.e0 e0Var = t0Var.Q;
            l1Var.I = e0Var;
            if (e0Var == null) {
                tVar = tVar3;
            } else {
                f2.b bVar16 = l1Var.f18316a;
                if (e0Var instanceof c2.m0) {
                    b2.c cVar2 = ((c2.m0) e0Var).f3018f;
                    float f19 = cVar2.f1502a;
                    float f20 = cVar2.f1503b;
                    tVar = tVar3;
                    bVar16.i((Float.floatToRawIntBits(f19) << c6) | (Float.floatToRawIntBits(f20) & 4294967295L), (Float.floatToRawIntBits(cVar2.f1504c - f19) << c6) | (Float.floatToRawIntBits(cVar2.f1505d - f20) & 4294967295L), 0.0f);
                } else {
                    tVar = tVar3;
                    if (e0Var instanceof c2.l0) {
                        c2.j jVar = ((c2.l0) e0Var).f3016f;
                        bVar16.f6523k = null;
                        bVar16.f6522i = 9205357640488583168L;
                        bVar16.f6521h = 0L;
                        bVar16.j = 0.0f;
                        bVar16.f6520g = true;
                        bVar16.f6526n = false;
                        bVar16.f6524l = jVar;
                        bVar16.a();
                    } else {
                        if (!(e0Var instanceof c2.n0)) {
                            throw new b3.e();
                        }
                        c2.n0 n0Var = (c2.n0) e0Var;
                        c2.j jVar2 = n0Var.f3023g;
                        if (jVar2 != null) {
                            bVar16.f6523k = null;
                            bVar16.f6522i = 9205357640488583168L;
                            bVar16.f6521h = 0L;
                            bVar16.j = 0.0f;
                            bVar16.f6520g = true;
                            bVar16.f6526n = false;
                            bVar16.f6524l = jVar2;
                            bVar16.a();
                        } else {
                            bVar16.i((Float.floatToRawIntBits(r8.f1506a) << c6) | (Float.floatToRawIntBits(r8.f1507b) & 4294967295L), (Float.floatToRawIntBits(r8.b()) << c6) | (Float.floatToRawIntBits(r8.a()) & 4294967295L), Float.intBitsToFloat((int) (n0Var.f3022f.f1513h >> c6)));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((e0Var instanceof c2.l0) || ((e0Var instanceof c2.n0) && !wd.a.J(((c2.n0) e0Var).f3022f))) && (aVar = l1Var.f18320e) != null)) {
                    aVar.a();
                }
            }
            z10 = true;
        }
        l1Var.G = t0Var.f3038a;
        if (i11 != 0 || z10) {
            ViewParent parent = tVar.getParent();
            if (parent != null) {
                tVar2 = tVar;
                parent.onDescendantInvalidated(tVar2, tVar2);
            } else {
                tVar2 = tVar;
            }
            if (w2.t.r()) {
                tVar2.Q(0.0f);
            }
        }
        boolean z11 = this.L;
        this.L = t0Var.I;
        this.P = t0Var.f3041d;
        boolean z12 = uVar2.f17778a == uVar.f17778a && uVar2.f17779b == uVar.f17779b && uVar2.f17780c == uVar.f17780c && uVar2.f17781d == uVar.f17781d && uVar2.f17782e == uVar.f17782e && uVar2.f17783f == uVar.f17783f && uVar2.f17784g == uVar.f17784g && uVar2.f17785h == uVar.f17785h && c2.a1.a(uVar2.f17786i, uVar.f17786i);
        if (z2 && ((!z12 || z11 != this.L) && (r1Var = f0Var.G) != null)) {
            ((w2.t) r1Var).C(f0Var);
        }
        if (z12) {
            return;
        }
        f0Var.N(this);
        if (f0Var.f17636i0 > 0) {
            w2.t tVar4 = (w2.t) i0.a(f0Var);
            q5.b bVar17 = tVar4.f18411s0.f17765e;
            bVar17.getClass();
            if (f0Var.f17636i0 > 0) {
                ((g1.e) bVar17.f13235b).b(f0Var);
                f0Var.f17635h0 = true;
            }
            tVar4.J(null);
        }
    }

    @Override // t2.w
    public final long X(long j) {
        if (!w1().G) {
            s2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((w2.t) i0.a(this.H)).w(q0(j));
    }

    @Override // v2.n0
    public final n0 X0() {
        return this.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean X1(long r26) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.i1.X1(long):boolean");
    }

    @Override // t2.w
    public final long a0(long j) {
        if (!w1().G) {
            s2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        t2.w wVarH = t2.z.h(this);
        w2.t tVar = (w2.t) i0.a(this.H);
        tVar.G();
        return C(wVarH, b2.b.e(c2.k0.b(j, tVar.x0), wVarH.q0(0L)));
    }

    @Override // v2.n0
    public final boolean b1() {
        return this.Q != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // t2.f1, t2.p0
    public final Object c0() {
        f0 f0Var = this.H;
        if (!f0Var.Y.d(64)) {
            return null;
        }
        w1();
        Object objY0 = null;
        for (v1.n nVar = f0Var.Y.f17585e; nVar != null; nVar = nVar.f17569e) {
            if ((nVar.f17567c & 64) != 0) {
                k kVarE = nVar;
                ?? eVar = 0;
                while (kVarE != 0) {
                    if (kVarE instanceof u1) {
                        objY0 = ((u1) kVarE).y0(f0Var.R, objY0);
                    } else if ((kVarE.f17567c & 64) != 0 && (kVarE instanceof k)) {
                        v1.n nVar2 = kVarE.I;
                        int i10 = 0;
                        kVarE = kVarE;
                        eVar = eVar;
                        while (nVar2 != null) {
                            if ((nVar2.f17567c & 64) != 0) {
                                i10++;
                                eVar = eVar;
                                if (i10 == 1) {
                                    kVarE = nVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new g1.e(new v1.n[16]);
                                    }
                                    if (kVarE != 0) {
                                        eVar.b(kVarE);
                                        kVarE = 0;
                                    }
                                    eVar.b(nVar2);
                                }
                            }
                            nVar2 = nVar2.f17570f;
                            kVarE = kVarE;
                            eVar = eVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    kVarE = n.e(eVar);
                }
            }
        }
        return objY0;
    }

    @Override // t2.w
    public final t2.w d0() {
        boolean z2 = w1().G;
        f0 f0Var = this.H;
        if (!z2) {
            StringBuilder sb2 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (f0 f0VarU = f0Var; f0VarU != null; f0VarU = f0VarU.u()) {
                sb2.append("\n|");
                sb2.append(f0VarU);
                sb2.append(" isAttached=");
                sb2.append(f0VarU.G());
                sb2.append(" modifier=");
                sb2.append(f0VarU.f17629d0);
                sb2.append(" tail=");
                sb2.append(w1());
            }
            s2.a.b(sb2.toString());
        }
        F1();
        return f0Var.Y.f17584d.J;
    }

    @Override // v2.n0
    public final f0 d1() {
        return this.H;
    }

    @Override // s3.c
    public final float e() {
        return this.H.R.e();
    }

    @Override // v2.n0
    public final t2.r0 e1() {
        t2.r0 r0Var = this.Q;
        if (r0Var != null) {
            return r0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // v2.n0
    public final n0 f1() {
        return this.J;
    }

    @Override // v2.n0
    public final long g1() {
        return this.S;
    }

    @Override // t2.r
    public final s3.m getLayoutDirection() {
        return this.H.S;
    }

    @Override // t2.w
    public final long i0(t2.w wVar, long j) {
        return C(wVar, j);
    }

    @Override // v2.n0
    public final void k1() {
        G0(this.S, this.T, this.M);
    }

    public final void l1(i1 i1Var, b2.a aVar, boolean z2) {
        if (i1Var == this) {
            return;
        }
        i1 i1Var2 = this.J;
        if (i1Var2 != null) {
            i1Var2.l1(i1Var, aVar, z2);
        }
        long j = this.S;
        float f10 = (int) (j >> 32);
        aVar.f1496a -= f10;
        aVar.f1498c -= f10;
        float f11 = (int) (j & 4294967295L);
        aVar.f1497b -= f11;
        aVar.f1499d -= f11;
        q1 q1Var = this.f17688e0;
        if (q1Var != null) {
            w2.l1 l1Var = (w2.l1) q1Var;
            float[] fArrA = l1Var.a();
            if (!l1Var.L) {
                if (fArrA == null) {
                    aVar.f1496a = 0.0f;
                    aVar.f1497b = 0.0f;
                    aVar.f1498c = 0.0f;
                    aVar.f1499d = 0.0f;
                } else {
                    c2.k0.c(fArrA, aVar);
                }
            }
            if (this.L && z2) {
                long j4 = this.f15552c;
                aVar.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
            }
        }
    }

    public final long m1(i1 i1Var, long j) {
        if (i1Var == this) {
            return j;
        }
        i1 i1Var2 = this.J;
        return (i1Var2 == null || fj.l.b(i1Var, i1Var2)) ? t1(j) : t1(i1Var2.m1(i1Var, j));
    }

    public final long n1(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - z0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - y0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    @Override // t2.w
    public final long o0(long j) {
        if (!w1().G) {
            s2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return C(t2.z.h(this), ((w2.t) i0.a(this.H)).K(j));
    }

    public final float o1(long j, long j4) {
        if (z0() >= Float.intBitsToFloat((int) (j4 >> 32)) && y0() >= Float.intBitsToFloat((int) (j4 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jN1 = n1(j4);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jN1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jN1 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - z0());
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - y0())) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i10 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i10) <= fIntBitsToFloat) {
                int i11 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i11) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i10);
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i11);
                    return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat4 * fIntBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // t2.w
    public final void p0(t2.w wVar, float[] fArr) {
        i1 i1VarR1 = R1(wVar);
        i1VarR1.F1();
        i1 i1VarS1 = s1(i1VarR1);
        c2.k0.d(fArr);
        i1VarR1.U1(i1VarS1, fArr);
        T1(i1VarS1, fArr);
    }

    public final void p1(c2.u uVar, f2.b bVar) {
        q1 q1Var = this.f17688e0;
        if (q1Var == null) {
            long j = this.S;
            float f10 = (int) (j >> 32);
            float f11 = (int) (j & 4294967295L);
            uVar.p(f10, f11);
            q1(uVar, bVar);
            uVar.p(-f10, -f11);
            return;
        }
        w2.l1 l1Var = (w2.l1) q1Var;
        e2.b bVar2 = l1Var.F;
        l1Var.f();
        l1Var.M = l1Var.f18316a.f6514a.P() > 0.0f;
        ac.d dVar = bVar2.f5738b;
        dVar.N(uVar);
        dVar.f374c = bVar;
        u6.v.C(bVar2, l1Var.f18316a);
    }

    @Override // t2.w
    public final long q0(long j) {
        if (!w1().G) {
            s2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        F1();
        for (i1 i1Var = this; i1Var != null; i1Var = i1Var.J) {
            f0 f0Var = i1Var.H;
            if (i1Var == f0Var.Y.f17584d && !f0Var.f17626c) {
                long jB = ((w2.t) i0.a(f0Var)).getRectManager().b(f0Var);
                if (!s3.j.a(jB, 9223372034707292159L)) {
                    return yd.f.X(j, jB);
                }
            }
            q1 q1Var = i1Var.f17688e0;
            if (q1Var != null) {
                j = ((w2.l1) q1Var).c(j, false);
            }
            j = yd.f.X(j, i1Var.S);
        }
        return j;
    }

    public final void q1(c2.u uVar, f2.b bVar) {
        c2.u uVar2;
        f2.b bVar2;
        v1.n nVarX1 = x1(4);
        if (nVarX1 == null) {
            L1(uVar, bVar);
            return;
        }
        f0 f0Var = this.H;
        f0Var.getClass();
        h0 sharedDrawScope = ((w2.t) i0.a(f0Var)).getSharedDrawScope();
        long jS = cg.b.S(this.f15552c);
        sharedDrawScope.getClass();
        g1.e eVar = null;
        while (nVarX1 != null) {
            if (nVarX1 instanceof m) {
                uVar2 = uVar;
                bVar2 = bVar;
                sharedDrawScope.l(uVar2, jS, this, (m) nVarX1, bVar2);
            } else {
                uVar2 = uVar;
                bVar2 = bVar;
                if ((nVarX1.f17567c & 4) != 0 && (nVarX1 instanceof k)) {
                    int i10 = 0;
                    for (v1.n nVar = ((k) nVarX1).I; nVar != null; nVar = nVar.f17570f) {
                        if ((nVar.f17567c & 4) != 0) {
                            i10++;
                            if (i10 == 1) {
                                nVarX1 = nVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new g1.e(new v1.n[16]);
                                }
                                if (nVarX1 != null) {
                                    eVar.b(nVarX1);
                                    nVarX1 = null;
                                }
                                eVar.b(nVar);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
                uVar = uVar2;
                bVar = bVar2;
            }
            nVarX1 = n.e(eVar);
            uVar = uVar2;
            bVar = bVar2;
        }
    }

    @Override // s3.c
    public final float r0() {
        return this.H.R.r0();
    }

    public abstract void r1();

    public final i1 s1(i1 i1Var) {
        f0 f0VarU = i1Var.H;
        f0 f0Var = this.H;
        if (f0VarU == f0Var) {
            v1.n nVarW1 = i1Var.w1();
            v1.n nVarW12 = w1();
            if (!nVarW12.f17565a.G) {
                s2.a.b("visitLocalAncestors called on an unattached node");
            }
            for (v1.n nVar = nVarW12.f17565a.f17569e; nVar != null; nVar = nVar.f17569e) {
                if ((nVar.f17567c & 2) != 0 && nVar == nVarW1) {
                    return i1Var;
                }
            }
            return this;
        }
        while (f0VarU.I > f0Var.I) {
            f0VarU = f0VarU.u();
            fj.l.c(f0VarU);
        }
        f0 f0VarU2 = f0Var;
        while (f0VarU2.I > f0VarU.I) {
            f0VarU2 = f0VarU2.u();
            fj.l.c(f0VarU2);
        }
        while (f0VarU != f0VarU2) {
            f0VarU = f0VarU.u();
            f0VarU2 = f0VarU2.u();
            if (f0VarU == null || f0VarU2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (f0VarU2 != f0Var) {
            if (f0VarU != i1Var.H) {
                return f0VarU.Y.f17583c;
            }
            return i1Var;
        }
        return this;
    }

    public final long t1(long j) {
        long j4 = this.S;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j4 >> 32));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j4 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        q1 q1Var = this.f17688e0;
        return q1Var != null ? ((w2.l1) q1Var).c(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    public abstract o0 u1();

    public final long v1() {
        return this.N.Q0(this.H.T.d());
    }

    public abstract v1.n w1();

    @Override // t2.w
    public final long x(long j) {
        long jQ0 = q0(j);
        w2.t tVar = (w2.t) i0.a(this.H);
        tVar.G();
        return c2.k0.b(jQ0, tVar.w0);
    }

    public final v1.n x1(int i10) {
        boolean zG = j1.g(i10);
        v1.n nVarW1 = w1();
        if (!zG && (nVarW1 = nVarW1.f17569e) == null) {
            return null;
        }
        for (v1.n nVarY1 = y1(zG); nVarY1 != null && (nVarY1.f17568d & i10) != 0; nVarY1 = nVarY1.f17570f) {
            if ((nVarY1.f17567c & i10) != 0) {
                return nVarY1;
            }
            if (nVarY1 == nVarW1) {
                return null;
            }
        }
        return null;
    }

    public final v1.n y1(boolean z2) {
        v1.n nVarW1;
        b1 b1Var = this.H.Y;
        if (b1Var.f17584d == this) {
            return b1Var.f17586f;
        }
        if (!z2) {
            i1 i1Var = this.J;
            if (i1Var != null) {
                return i1Var.w1();
            }
            return null;
        }
        i1 i1Var2 = this.J;
        if (i1Var2 == null || (nVarW1 = i1Var2.w1()) == null) {
            return null;
        }
        return nVarW1.f17570f;
    }

    @Override // t2.w
    public final b2.c z(t2.w wVar, boolean z2) {
        if (!w1().G) {
            s2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!wVar.E()) {
            s2.a.b("LayoutCoordinates " + wVar + " is not attached!");
        }
        i1 i1VarR1 = R1(wVar);
        i1VarR1.F1();
        i1 i1VarS1 = s1(i1VarR1);
        b2.a aVar = this.U;
        if (aVar == null) {
            aVar = new b2.a();
            this.U = aVar;
        }
        aVar.f1496a = 0.0f;
        aVar.f1497b = 0.0f;
        aVar.f1498c = (int) (wVar.I() >> 32);
        aVar.f1499d = (int) (wVar.I() & 4294967295L);
        while (i1VarR1 != i1VarS1) {
            i1VarR1.N1(aVar, z2, false);
            if (aVar.b()) {
                return b2.c.f1501e;
            }
            i1VarR1 = i1VarR1.J;
            fj.l.c(i1VarR1);
        }
        l1(i1VarS1, aVar, z2);
        return new b2.c(aVar.f1496a, aVar.f1497b, aVar.f1498c, aVar.f1499d);
    }

    public final void z1(v1.n nVar, e1 e1Var, long j, q qVar, int i10, boolean z2) {
        if (nVar == null) {
            C1(e1Var, j, qVar, i10, z2);
            return;
        }
        if (!e1Var.d(nVar)) {
            z1(n.d(nVar, e1Var.a()), e1Var, j, qVar, i10, z2);
            return;
        }
        int i11 = qVar.f17745c;
        q.b0 b0Var = qVar.f17743a;
        qVar.e(i11 + 1, b0Var.f13034b);
        qVar.f17745c++;
        b0Var.a(nVar);
        qVar.f17744b.a(n.a(-1.0f, z2, false));
        z1(n.d(nVar, e1Var.a()), e1Var, j, qVar, i10, z2);
        qVar.f17745c = i11;
    }

    @Override // v2.n0
    public final t2.w Z0() {
        return this;
    }
}
