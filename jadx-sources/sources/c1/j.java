package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2253a = 280;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2254b = 560;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2255c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2256d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static final b0.k1 f2257e;

    /* renamed from: f, reason: collision with root package name */
    public static final b0.k1 f2258f;

    /* renamed from: g, reason: collision with root package name */
    public static final b0.k1 f2259g;

    /* renamed from: h, reason: collision with root package name */
    public static final f1.v f2260h;

    static {
        float f10 = 24;
        f2257e = new b0.k1(f10, f10, f10, f10);
        float f11 = 16;
        b0.d.d(0.0f, 0.0f, f11, 7);
        f2258f = b0.d.d(0.0f, 0.0f, f11, 7);
        f2259g = b0.d.d(0.0f, 0.0f, f10, 7);
        f2260h = new f1.v(new b6.j(2));
    }

    public static final void a(final p1.e eVar, v1.o oVar, final ej.e eVar2, final ej.e eVar3, final c2.w0 w0Var, final long j, final float f10, final long j4, final long j10, final long j11, final long j12, f1.i0 i0Var, final int i10) {
        final v1.o oVar2;
        i0Var.c0(1378716401);
        int i11 = i10 | 48 | (i0Var.h(null) ? 256 : 128) | (i0Var.h(eVar2) ? 2048 : 1024) | (i0Var.h(eVar3) ? 16384 : 8192) | (i0Var.f(w0Var) ? 131072 : 65536) | (i0Var.e(j) ? 1048576 : 524288) | (i0Var.c(f10) ? 8388608 : 4194304) | (i0Var.e(j4) ? 67108864 : 33554432) | (i0Var.e(j10) ? 536870912 : 268435456);
        if (i0Var.T(i11 & 1, ((i11 & 306783379) == 306783378 && (((i0Var.e(j11) ? (char) 4 : (char) 2) | (i0Var.e(j12) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            p1.e eVarD = p1.j.d(-652798794, new f(eVar2, eVar3, j10, j11, j12, j4, eVar), i0Var);
            int i12 = i11 >> 12;
            int i13 = (i12 & 896) | (i12 & 112) | 12582918 | ((i11 >> 9) & 57344);
            v1.l lVar = v1.l.f17564b;
            b7.a(lVar, w0Var, j, 0L, f10, 0.0f, eVarD, i0Var, i13, 104);
            oVar2 = lVar;
        } else {
            i0Var.W();
            oVar2 = oVar;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(oVar2, eVar2, eVar3, w0Var, j, f10, j4, j10, j11, j12, i10) { // from class: c1.c
                public final /* synthetic */ long A;
                public final /* synthetic */ long B;
                public final /* synthetic */ long C;
                public final /* synthetic */ long D;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v1.o f1949b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ej.e f1950c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ej.e f1951d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ c2.w0 f1952e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f1953f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ float f1954z;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(7);
                    j.a(this.f1948a, this.f1949b, this.f1950c, this.f1951d, this.f1952e, this.f1953f, this.f1954z, this.A, this.B, this.C, this.D, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void b(p1.e eVar, f1.i0 i0Var, int i10) {
        i0Var.c0(-917637668);
        if (i0Var.T(i10 & 1, (i10 & 147) != 146)) {
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = new g();
                i0Var.l0(objQ);
            }
            t2.q0 q0Var = (t2.q0) objQ;
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, v1.l.f17564b);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0Var);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            v2.e eVar2 = v2.g.f17650g;
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iHashCode))) {
                m6.a.l(iHashCode, i0Var, iHashCode, eVar2);
            }
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            eVar.invoke(i0Var, 6);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d(eVar, i10);
        }
    }

    public static final void c(final ej.a aVar, final p1.e eVar, final v1.o oVar, final ej.e eVar2, final ej.e eVar3, final ej.e eVar4, final c2.w0 w0Var, final long j, final long j4, final long j10, final long j11, final float f10, final w3.u uVar, f1.i0 i0Var, final int i10, final int i11) {
        int i12;
        p1.e eVar5;
        ej.e eVar6;
        int i13;
        i0Var.c0(-867616355);
        if ((i10 & 6) == 0) {
            i12 = (i0Var.h(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            eVar5 = eVar;
            i12 |= i0Var.h(eVar5) ? 32 : 16;
        } else {
            eVar5 = eVar;
        }
        if ((i10 & 384) == 0) {
            i12 |= i0Var.f(oVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            eVar6 = eVar2;
            i12 |= i0Var.h(eVar6) ? 2048 : 1024;
        } else {
            eVar6 = eVar2;
        }
        if ((i10 & 24576) == 0) {
            i12 |= i0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= i0Var.h(eVar3) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= i0Var.h(eVar4) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= i0Var.f(w0Var) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= i0Var.e(j) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= i0Var.e(j4) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (i0Var.e(j10) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= i0Var.e(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= i0Var.c(f10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= i0Var.f(uVar) ? 2048 : 1024;
        }
        int i14 = i13;
        if (i0Var.T(i12 & 1, ((i12 & 306783379) == 306783378 && (i14 & 1171) == 1170) ? false : true)) {
            d(aVar, oVar, uVar, p1.j.d(527420759, new i(eVar3, eVar4, w0Var, j, f10, j4, j10, j11, eVar6, eVar5), i0Var), i0Var, (i12 & 14) | 3072 | ((i12 >> 3) & 112) | ((i14 >> 3) & 896));
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: c1.b
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(i10 | 1);
                    int iO2 = f1.s.O(i11);
                    j.c(aVar, eVar, oVar, eVar2, eVar3, eVar4, w0Var, j, j4, j10, j11, f10, uVar, (f1.i0) obj, iO, iO2);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void d(ej.a aVar, v1.o oVar, w3.u uVar, p1.e eVar, f1.i0 i0Var, int i10) {
        int i11;
        i0Var.c0(24925658);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.f(oVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.f(uVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.h(eVar) ? 2048 : 1024;
        }
        if (i0Var.T(i11 & 1, (i11 & 1171) != 1170)) {
            ((h1) i0Var.j(f2260h)).a(new wh.s(aVar, oVar, uVar, eVar), i0Var, 0);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.d(aVar, oVar, uVar, eVar, i10, 1);
        }
    }
}
