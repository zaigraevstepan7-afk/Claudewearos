package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class e8 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2071a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2072b = 24;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2073c = 40;

    /* renamed from: d, reason: collision with root package name */
    public static final b0.k1 f2074d;

    static {
        float f10 = 4;
        f2071a = f10;
        float f11 = 8;
        f2074d = new b0.k1(f11, f10, f11, f10);
    }

    public static final void a(final g8 g8Var, v1.o oVar, float f10, c2.w0 w0Var, long j, long j4, float f11, float f12, final p1.e eVar, f1.i0 i0Var, final int i10) {
        int i11;
        v1.o oVar2;
        final float f13;
        final c2.w0 w0Var2;
        final long j10;
        final long j11;
        final float f14;
        final float f15;
        float f16;
        long jD;
        int i12;
        long j12;
        float f17;
        c2.w0 w0Var3;
        float f18;
        i0Var.c0(-343758958);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? i0Var.f(g8Var) : i0Var.h(g8Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i11 | 3504;
        if ((i10 & 24576) == 0) {
            i13 = i11 | 11696;
        }
        if ((196608 & i10) == 0) {
            i13 |= 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= 524288;
        }
        int i14 = 113246208 | i13;
        if ((805306368 & i10) == 0) {
            i14 |= i0Var.h(eVar) ? 536870912 : 268435456;
        }
        if (i0Var.T(i14 & 1, (306783379 & i14) != 306783378)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                f16 = z7.f2960a;
                c2.w0 w0VarB = p5.b(e1.y.f5729b, i0Var);
                jD = x0.d(e1.y.f5730c, i0Var);
                long jD2 = x0.d(e1.y.f5728a, i0Var);
                i12 = i14 & (-4186113);
                oVar2 = v1.l.f17564b;
                j12 = jD2;
                f17 = 0;
                w0Var3 = w0VarB;
                f18 = 0;
            } else {
                i0Var.W();
                i12 = i14 & (-4186113);
                oVar2 = oVar;
                f16 = f10;
                w0Var3 = w0Var;
                jD = j;
                j12 = j4;
                f17 = f11;
                f18 = f12;
            }
            i0Var.q();
            i0Var.b0(-1719831991);
            i0Var.p(false);
            int i15 = i12 >> 9;
            b7.a(oVar2, w0Var3, j12, 0L, f17, f18, p1.j.d(-1573998995, new c8(f16, jD, eVar), i0Var), i0Var, (57344 & i15) | 12582912 | (i15 & 458752), 72);
            f13 = f16;
            j10 = jD;
            w0Var2 = w0Var3;
            j11 = j12;
            f14 = f17;
            f15 = f18;
        } else {
            i0Var.W();
            oVar2 = oVar;
            f13 = f10;
            w0Var2 = w0Var;
            j10 = j;
            j11 = j4;
            f14 = f11;
            f15 = f12;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            final v1.o oVar3 = oVar2;
            t1VarU.f6456d = new ej.e() { // from class: c1.a8
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e8.a(g8Var, oVar3, f13, w0Var2, j10, j11, f14, f15, eVar, (f1.i0) obj, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void b(w3.c0 c0Var, p1.e eVar, j8 j8Var, v1.o oVar, boolean z2, p1.e eVar2, f1.i0 i0Var, int i10) {
        w3.c0 c0Var2;
        int i11;
        v1.o oVar2;
        boolean z10;
        i0Var.c0(-293753984);
        if ((i10 & 6) == 0) {
            c0Var2 = c0Var;
            i11 = (i0Var.f(c0Var2) ? 4 : 2) | i10;
        } else {
            c0Var2 = c0Var;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? i0Var.f(j8Var) : i0Var.h(j8Var) ? 256 : 128;
        }
        int i12 = i11 | 14380032;
        if ((100663296 & i10) == 0) {
            i12 |= i0Var.h(eVar2) ? 67108864 : 33554432;
        }
        if (i0Var.T(i12 & 1, (38347923 & i12) != 38347922)) {
            t.l0 l0Var = j8Var.f2301b;
            boolean zF = i0Var.f(l0Var);
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (zF || objQ == obj) {
                t1.g gVarF = t1.r.f();
                ej.c cVarE = gVarF != null ? gVarF.e() : null;
                t1.g gVarK = t1.r.k(gVarF);
                try {
                    Object j1Var = new t.j1(l0Var, null, "tooltip transition");
                    t1.r.n(gVarF, gVarK, cVarE);
                    i0Var.l0(j1Var);
                    objQ = j1Var;
                } catch (Throwable th2) {
                    t1.r.n(gVarF, gVarK, cVarE);
                    throw th2;
                }
            }
            t.j1 j1Var2 = (t.j1) objQ;
            i0Var.b0(-1356604288);
            j1Var2.a(l0Var.f15226c.getValue(), i0Var, 0);
            i0Var.p(false);
            boolean zF2 = i0Var.f(j1Var2);
            Object objQ2 = i0Var.Q();
            if (zF2 || objQ2 == obj) {
                objQ2 = new t.l1(j1Var2, 0);
                i0Var.l0(objQ2);
            }
            f1.s.c(j1Var2, (ej.c) objQ2, i0Var);
            Object objQ3 = i0Var.Q();
            if (objQ3 == obj) {
                objQ3 = f1.s.A(null);
                i0Var.l0(objQ3);
            }
            f1.a1 a1Var = (f1.a1) objQ3;
            Object objQ4 = i0Var.Q();
            if (objQ4 == obj) {
                new b8(a1Var, 0);
                objQ4 = new g8();
                i0Var.l0(objQ4);
            }
            w3.c0 c0Var3 = c0Var2;
            d1.i.a(c0Var3, p1.j.d(-527401546, new d8(j1Var2, eVar, (g8) objQ4), i0Var), j8Var, p1.j.d(-23901870, new c0(3, a1Var, eVar2), i0Var), i0Var, (i12 & 29360128) | (i12 & 14) | 100663344 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12));
            oVar2 = v1.l.f17564b;
            z10 = true;
        } else {
            i0Var.W();
            oVar2 = oVar;
            z10 = z2;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new m0(c0Var, eVar, j8Var, oVar2, z10, eVar2, i10);
        }
    }
}
