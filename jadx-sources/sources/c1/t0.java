package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2695a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0.k1 f2696b;

    static {
        float f10 = 8;
        f2695a = f10;
        b0.d.b(f10, 2);
        f2696b = b0.d.b(f10, 2);
        b0.d.b(f10, 2);
    }

    public static final void a(final p1.e eVar, final g3.n0 n0Var, final long j, final long j4, final long j10, final float f10, final b0.i1 i1Var, f1.i0 i0Var, final int i10) {
        i0Var.c0(-2070754602);
        int i11 = i10 | (i0Var.h(eVar) ? 4 : 2) | (i0Var.f(n0Var) ? 32 : 16) | (i0Var.e(j) ? 256 : 128) | (i0Var.h(null) ? 2048 : 1024) | (i0Var.h(null) ? 16384 : 8192) | (i0Var.h(null) ? 131072 : 65536) | (i0Var.e(j4) ? 1048576 : 524288) | (i0Var.e(j10) ? 8388608 : 4194304) | (i0Var.c(f10) ? 67108864 : 33554432) | (i0Var.f(i1Var) ? 536870912 : 268435456);
        if (i0Var.T(i11 & 1, (306783379 & i11) != 306783378)) {
            f1.s.b(new f1.r1[]{g1.f2116a.a(new c2.w(j)), v7.f2781a.a(n0Var)}, p1.j.d(-668234218, new r0(f10, i1Var, j4, eVar, j10), i0Var), i0Var, 56);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(n0Var, j, j4, j10, f10, i1Var, i10) { // from class: c1.p0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g3.n0 f2571b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f2572c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f2573d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f2574e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f2575f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ b0.i1 f2576z;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(1);
                    t0.a(this.f2570a, this.f2571b, this.f2572c, this.f2573d, this.f2574e, this.f2575f, this.f2576z, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void b(final boolean z2, final ej.a aVar, final p1.e eVar, v1.o oVar, boolean z10, c2.w0 w0Var, k5 k5Var, m5 m5Var, v.u uVar, f1.i0 i0Var, final int i10) {
        final v1.o oVar2;
        final boolean z11;
        final c2.w0 w0Var2;
        final k5 k5Var2;
        final m5 m5Var2;
        final v.u uVar2;
        int i11;
        v1.o oVar3;
        boolean z12;
        i0Var.c0(-1385473344);
        int i12 = i10 | (i0Var.g(z2) ? 4 : 2) | (i0Var.h(aVar) ? 32 : 16) | 307981312;
        if (i0Var.T(i12 & 1, (306783379 & i12) != 306783378)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                float f10 = v1.f2761a;
                c2.w0 w0VarB = p5.b(e1.r.f5623b, i0Var);
                w0 w0Var3 = (w0) i0Var.j(x0.f2845a);
                k5Var2 = w0Var3.Y;
                if (k5Var2 == null) {
                    long j = c2.w.f3057g;
                    k5 k5Var3 = new k5(j, x0.c(w0Var3, e1.r.f5640t), x0.c(w0Var3, e1.r.f5644x), x0.c(w0Var3, e1.r.B), j, c2.w.c(x0.c(w0Var3, e1.r.f5624c), e1.r.f5625d), c2.w.c(x0.c(w0Var3, e1.r.f5641u), e1.r.f5642v), c2.w.c(x0.c(w0Var3, e1.r.f5645y), e1.r.f5646z), x0.c(w0Var3, e1.r.f5631k), c2.w.c(x0.c(w0Var3, e1.r.f5628g), e1.r.f5629h), x0.c(w0Var3, e1.r.f5639s), x0.c(w0Var3, e1.r.f5643w), x0.c(w0Var3, e1.r.A));
                    w0Var3.Y = k5Var3;
                    k5Var2 = k5Var3;
                }
                float f11 = e1.r.f5627f;
                m5 m5Var3 = new m5(f11, e1.r.f5635o, e1.r.f5632l, e1.r.f5633m, e1.r.f5626e, f11);
                int i13 = i12 & (-2143289345);
                long jD = x0.d(e1.r.f5636p, i0Var);
                long j4 = c2.w.f3057g;
                c2.w.c(x0.d(e1.r.f5630i, i0Var), e1.r.j);
                float f12 = e1.r.f5637q;
                float f13 = e1.r.f5634n;
                if (z2) {
                    jD = j4;
                }
                if (z2) {
                    f12 = f13;
                }
                v.u uVar3 = new v.u(f12, new c2.z0(jD));
                i11 = i13;
                oVar3 = v1.l.f17564b;
                uVar2 = uVar3;
                m5Var2 = m5Var3;
                w0Var2 = w0VarB;
                z12 = true;
            } else {
                i0Var.W();
                z12 = z10;
                w0Var2 = w0Var;
                k5Var2 = k5Var;
                m5Var2 = m5Var;
                uVar2 = uVar;
                i11 = i12 & (-2143289345);
                oVar3 = oVar;
            }
            i0Var.q();
            c(z2, oVar3, aVar, z12, eVar, p8.a(e1.r.f5638r, i0Var), w0Var2, k5Var2, m5Var2, uVar2, v1.f2761a, f2696b, i0Var, ((i11 << 3) & 896) | (i11 & 14) | 12582960 | 102263808, 224256);
            oVar2 = oVar3;
            z11 = z12;
        } else {
            i0Var.W();
            oVar2 = oVar;
            z11 = z10;
            w0Var2 = w0Var;
            k5Var2 = k5Var;
            m5Var2 = m5Var;
            uVar2 = uVar;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(z2, aVar, eVar, oVar2, z11, w0Var2, k5Var2, m5Var2, uVar2, i10) { // from class: c1.q0
                public final /* synthetic */ m5 A;
                public final /* synthetic */ v.u B;

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f2590a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ej.a f2591b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p1.e f2592c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ v1.o f2593d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f2594e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ c2.w0 f2595f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ k5 f2596z;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(385);
                    t0.b(this.f2590a, this.f2591b, this.f2592c, this.f2593d, this.f2594e, this.f2595f, this.f2596z, this.A, this.B, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    public static final void c(final boolean z2, final v1.o oVar, final ej.a aVar, final boolean z10, final p1.e eVar, final g3.n0 n0Var, final c2.w0 w0Var, final k5 k5Var, final m5 m5Var, final v.u uVar, final float f10, final b0.i1 i1Var, f1.i0 i0Var, final int i10, final int i11) {
        int i12;
        int i13;
        long j;
        z.k kVar;
        t.c cVar;
        Object obj;
        long j4;
        boolean z11;
        t.k kVar2;
        ?? r11;
        i0Var.c0(1786844928);
        if ((i10 & 6) == 0) {
            i12 = (i0Var.g(z2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= i0Var.f(oVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= i0Var.h(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= i0Var.g(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= i0Var.h(eVar) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= i0Var.f(n0Var) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= i0Var.h(null) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= i0Var.h(null) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= i0Var.h(null) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= i0Var.f(w0Var) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (i0Var.f(k5Var) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= i0Var.f(m5Var) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= i0Var.f(uVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= i0Var.c(f10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= i0Var.f(i1Var) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= i0Var.f(null) ? 131072 : 65536;
        }
        int i14 = i12;
        if (i0Var.T(i14 & 1, ((306783379 & i12) == 306783378 && (i13 & 74899) == 74898) ? false : true)) {
            i0Var.b0(73215547);
            Object objQ = i0Var.Q();
            Object obj2 = f1.m.f6385a;
            if (objQ == obj2) {
                objQ = t.m1.p(i0Var);
            }
            z.k kVar3 = (z.k) objQ;
            i0Var.p(false);
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj2) {
                objQ2 = new ab.d(9);
                i0Var.l0(objQ2);
            }
            v1.o oVarA = d3.p.a(oVar, false, (ej.c) objQ2);
            long j10 = !z10 ? z2 ? k5Var.j : k5Var.f2334e : !z2 ? k5Var.f2330a : k5Var.f2338i;
            if (m5Var == null) {
                i0Var.b0(73531126);
                i0Var.p(false);
                kVar = kVar3;
                obj = obj2;
                j4 = j10;
                r11 = 0;
                kVar2 = null;
            } else {
                i0Var.b0(-828912021);
                int i15 = ((i13 << 3) & 896) | ((i14 >> 9) & 14);
                Object objQ3 = i0Var.Q();
                if (objQ3 == obj2) {
                    objQ3 = new t1.q();
                    i0Var.l0(objQ3);
                }
                t1.q qVar = (t1.q) objQ3;
                Object objQ4 = i0Var.Q();
                if (objQ4 == obj2) {
                    objQ4 = f1.s.A(null);
                    i0Var.l0(objQ4);
                }
                f1.a1 a1Var = (f1.a1) objQ4;
                boolean zF = i0Var.f(kVar3);
                Object objQ5 = i0Var.Q();
                if (zF || objQ5 == obj2) {
                    j = j10;
                    objQ5 = new y(kVar3, qVar, null, 1);
                    i0Var.l0(objQ5);
                } else {
                    j = j10;
                }
                f1.s.f((ej.e) objQ5, i0Var, kVar3);
                z.j jVar = (z.j) qi.l.G0(qVar);
                float f11 = !z10 ? m5Var.f2438f : jVar instanceof z.m ? m5Var.f2434b : jVar instanceof z.h ? m5Var.f2436d : jVar instanceof z.d ? m5Var.f2435c : jVar instanceof z.b ? m5Var.f2437e : m5Var.f2433a;
                Object objQ6 = i0Var.Q();
                if (objQ6 == obj2) {
                    kVar = kVar3;
                    objQ6 = new t.c(new s3.f(f11), t.d.f15138l, null, 12);
                    i0Var.l0(objQ6);
                } else {
                    kVar = kVar3;
                }
                t.c cVar2 = (t.c) objQ6;
                s3.f fVar = new s3.f(f11);
                boolean zH = i0Var.h(cVar2) | i0Var.c(f11) | ((((i15 & 14) ^ 6) > 4 && i0Var.g(z10)) || (i15 & 6) == 4) | i0Var.h(jVar);
                Object objQ7 = i0Var.Q();
                if (zH || objQ7 == obj2) {
                    cVar = cVar2;
                    obj = obj2;
                    j4 = j;
                    z11 = false;
                    l5 l5Var = new l5(cVar, f11, z10, jVar, a1Var, null);
                    i0Var.l0(l5Var);
                    objQ7 = l5Var;
                } else {
                    obj = obj2;
                    cVar = cVar2;
                    j4 = j;
                    z11 = false;
                }
                f1.s.f((ej.e) objQ7, i0Var, fVar);
                kVar2 = cVar.f15109c;
                i0Var.p(z11);
                r11 = z11;
            }
            Object obj3 = obj;
            float f12 = kVar2 != null ? ((s3.f) kVar2.f15211b.getValue()).f14742a : (float) r11;
            p1.e eVarD = p1.j.d(-990050154, new s0(k5Var, z10, z2, eVar, n0Var, f10, i1Var), i0Var);
            f1.v vVar = b7.f1945a;
            long jB = x0.b(j4, i0Var);
            float f13 = (float) r11;
            if (kVar == null) {
                i0Var.b0(1528143336);
                Object objQ8 = i0Var.Q();
                if (objQ8 == obj3) {
                    objQ8 = t.m1.p(i0Var);
                }
                i0Var.p(r11);
                kVar = (z.k) objQ8;
            } else {
                i0Var.b0(-227800369);
                i0Var.p(r11);
            }
            f1.v vVar2 = b7.f1945a;
            float f14 = ((s3.f) i0Var.j(vVar2)).f14742a + f13;
            f1.s.b(new f1.r1[]{g1.f2116a.a(new c2.w(jB)), vVar2.a(new s3.f(f14))}, p1.j.d(1508735219, new a7(oVarA, w0Var, j4, f14, uVar, z2, kVar, z10, aVar, f12, eVarD), i0Var), i0Var, 56);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: c1.o0
                @Override // ej.e
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iO = f1.s.O(i10 | 1);
                    int iO2 = f1.s.O(i11);
                    t0.c(z2, oVar, aVar, z10, eVar, n0Var, w0Var, k5Var, m5Var, uVar, f10, i1Var, (f1.i0) obj4, iO, iO2);
                    return pi.o.f13011a;
                }
            };
        }
    }
}
