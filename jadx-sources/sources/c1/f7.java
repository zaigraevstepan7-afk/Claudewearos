package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f7 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2107a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2108b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2109c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2110d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f2111e;

    /* renamed from: f, reason: collision with root package name */
    public static final t.s0 f2112f;

    static {
        float f10 = e1.h0.f5422p;
        f2107a = f10;
        f2108b = e1.h0.f5432z;
        f2109c = e1.h0.f5429w;
        float f11 = e1.h0.f5426t;
        f2110d = f11;
        f2111e = (f11 - f10) / 2;
        f2112f = new t.s0(0);
    }

    public static final void a(final boolean z2, final ej.c cVar, v1.o oVar, boolean z10, c7 c7Var, f1.i0 i0Var, final int i10) {
        int i11;
        final v1.o oVar2;
        final boolean z11;
        final c7 c7Var2;
        c7 c7Var3;
        int i12;
        int i13;
        v1.o oVar3;
        boolean z12;
        z.k kVar;
        i0Var.c0(-263339167);
        if ((i10 & 6) == 0) {
            i11 = i10 | (i0Var.g(z2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(cVar) ? 32 : 16;
        }
        int i14 = i11 | 28032;
        if ((i10 & 196608) == 0) {
            i14 = 93568 | i11;
        }
        int i15 = 1572864 | i14;
        if (i0Var.T(i15 & 1, (599187 & i15) != 599186)) {
            i0Var.Y();
            int i16 = i10 & 1;
            v1.o oVarB = v1.l.f17564b;
            if (i16 == 0 || i0Var.C()) {
                w0 w0Var = (w0) i0Var.j(x0.f2845a);
                c7Var3 = w0Var.f2794e0;
                long j = w0Var.f2806p;
                if (c7Var3 == null) {
                    long jC = x0.c(w0Var, e1.h0.f5421o);
                    long jC2 = x0.c(w0Var, e1.h0.f5424r);
                    long j4 = c2.w.f3057g;
                    long jC3 = x0.c(w0Var, e1.h0.f5423q);
                    long jC4 = x0.c(w0Var, e1.h0.f5431y);
                    long jC5 = x0.c(w0Var, e1.h0.B);
                    long jC6 = x0.c(w0Var, e1.h0.f5430x);
                    long jC7 = x0.c(w0Var, e1.h0.A);
                    i12 = -458753;
                    long jK = c2.e0.k(c2.w.c(x0.c(w0Var, e1.h0.f5408a), e1.h0.f5409b), j);
                    long jC8 = x0.c(w0Var, e1.h0.f5412e);
                    float f10 = e1.h0.f5413f;
                    c7 c7Var4 = new c7(jC, jC2, j4, jC3, jC4, jC5, jC6, jC7, jK, c2.e0.k(c2.w.c(jC8, f10), j), j4, c2.e0.k(c2.w.c(x0.c(w0Var, e1.h0.f5410c), e1.h0.f5411d), j), c2.e0.k(c2.w.c(x0.c(w0Var, e1.h0.f5414g), e1.h0.f5415h), j), c2.e0.k(c2.w.c(x0.c(w0Var, e1.h0.f5417k), f10), j), c2.e0.k(c2.w.c(x0.c(w0Var, e1.h0.f5418l), f10), j), c2.e0.k(c2.w.c(x0.c(w0Var, e1.h0.f5416i), e1.h0.j), j));
                    w0Var.f2794e0 = c7Var4;
                    c7Var3 = c7Var4;
                } else {
                    i12 = -458753;
                }
                i13 = i15 & i12;
                oVar3 = oVarB;
                z12 = true;
            } else {
                i0Var.W();
                oVar3 = oVar;
                c7Var3 = c7Var;
                i13 = i15 & (-458753);
                z12 = z10;
            }
            i0Var.q();
            i0Var.b0(1768604058);
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = t.m1.p(i0Var);
            }
            z.k kVar2 = (z.k) objQ;
            i0Var.p(false);
            if (cVar != null) {
                t2.m mVar = g2.f2117a;
                kVar = kVar2;
                oVarB = i0.c.b(v2.f2762b, z2, kVar2, z12, new d3.j(2), cVar);
            } else {
                kVar = kVar2;
            }
            boolean z13 = z12;
            int i17 = i13 << 3;
            int i18 = (i17 & 112) | ((i13 >> 6) & 896) | (i17 & 57344);
            c7 c7Var5 = c7Var3;
            b(b0.t1.i(b0.t1.r(oVar3.c(oVarB)), f2109c, f2110d), z2, z13, c7Var5, kVar, p5.b(e1.h0.f5419m, i0Var), i0Var, i18);
            z11 = z13;
            c7Var2 = c7Var5;
            oVar2 = oVar3;
        } else {
            i0Var.W();
            oVar2 = oVar;
            z11 = z10;
            c7Var2 = c7Var;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: c1.d7
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f7.a(z2, cVar, oVar2, z11, c7Var2, (f1.i0) obj, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void b(final v1.o oVar, final boolean z2, final boolean z10, final c7 c7Var, final z.k kVar, final c2.w0 w0Var, f1.i0 i0Var, final int i10) {
        int i11;
        i0Var.c0(-670917213);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.g(z2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.f(c7Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= i0Var.f(kVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= i0Var.f(w0Var) ? 1048576 : 524288;
        }
        if (i0Var.T(i11 & 1, (599187 & i11) != 599186)) {
            long j = z10 ? z2 ? c7Var.f1983b : c7Var.f1987f : z2 ? c7Var.j : c7Var.f1994n;
            long j4 = z10 ? z2 ? c7Var.f1982a : c7Var.f1986e : z2 ? c7Var.f1990i : c7Var.f1993m;
            c2.w0 w0VarB = p5.b(e1.h0.f5428v, i0Var);
            v1.o oVarF = v.n.f(v.n.h(oVar, e1.h0.f5427u, z10 ? z2 ? c7Var.f1984c : c7Var.f1988g : z2 ? c7Var.f1991k : c7Var.f1995o, w0VarB), j, w0VarB);
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarF);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            v2.e eVar = v2.g.f17649f;
            f1.s.M(eVar, i0Var, q0VarD);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var, n1VarL);
            v2.e eVar3 = v2.g.f17650g;
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iHashCode))) {
                m6.a.l(iHashCode, i0Var, iHashCode, eVar3);
            }
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var, oVarC);
            v1.o oVarF2 = v.n.f(v.x0.a(b0.w.f1450a.b(v1.l.f17564b, v1.b.f17550d).c(new w7(kVar, z2, z4.l(e1.u.f5670b, i0Var))), kVar, a5.a(e1.h0.f5425s / 2, 4)), j4, w0Var);
            t2.q0 q0VarD2 = b0.r.d(v1.b.f17551e, false);
            int iHashCode2 = Long.hashCode(i0Var.T);
            f1.n1 n1VarL2 = i0Var.l();
            v1.o oVarC2 = v1.a.c(i0Var, oVarF2);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(eVar, i0Var, q0VarD2);
            f1.s.M(eVar2, i0Var, n1VarL2);
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iHashCode2))) {
                m6.a.l(iHashCode2, i0Var, iHashCode2, eVar3);
            }
            f1.s.M(eVar4, i0Var, oVarC2);
            i0Var.b0(1236071411);
            i0Var.p(false);
            i0Var.p(true);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: c1.e7
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f7.b(oVar, z2, z10, c7Var, kVar, w0Var, (f1.i0) obj, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }
}
