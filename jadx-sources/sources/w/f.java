package w;

import b0.b0;
import b0.c0;
import b0.j;
import b0.o1;
import b0.q1;
import b0.r;
import b0.v0;
import b0.y0;
import b0.z;
import c1.m0;
import c2.w;
import f1.i0;
import f1.n1;
import f1.s;
import f1.t1;
import f1.v;
import g3.n0;
import t2.q0;
import v.n;
import v1.l;
import v1.o;
import v2.g;
import w3.e0;
import w3.m;
import z1.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final c f18163a;

    static {
        e0 e0Var = e0.f18499a;
        v vVar = m.f18526a;
        e0 e0Var2 = e0.f18499a;
        e0 e0Var3 = e0.f18499a;
        long j = w.f3054d;
        long j4 = w.f3052b;
        f18163a = new c(j, j4, j4, w.c(j4, 0.38f), w.c(j4, 0.38f));
    }

    public static final void a(c cVar, o oVar, p1.e eVar, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(-527864079);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.f(oVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(eVar) ? 256 : 128;
        }
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            o oVarF = n.f(h.j(e.f18151d, 28, j0.e.a(e.f18152e), oVar), cVar.f18142a, c2.e0.f2986b);
            v0 v0Var = v0.f1446a;
            o oVarT = n.t(b0.d.v(b0.d.A(oVarF), 0.0f, e.f18156i, 1), n.s(i0Var), true);
            int i12 = (i11 << 3) & 7168;
            b0 b0VarA = z.a(j.f1361c, v1.b.E, i0Var, 0);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            o oVarC = v1.a.c(i0Var, oVarT);
            v2.h.f17668w.getClass();
            v2.f fVar = g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            s.M(g.f17649f, i0Var, b0VarA);
            s.M(g.f17648e, i0Var, n1VarL);
            s.M(g.f17650g, i0Var, Integer.valueOf(iHashCode));
            s.I(g.f17651h, i0Var);
            s.M(g.f17647d, i0Var, oVarC);
            eVar.c(c0.f1285a, i0Var, Integer.valueOf(((i12 >> 6) & 112) | 6));
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(cVar, oVar, eVar, i10, 12);
        }
    }

    public static final void b(o oVar, c cVar, ej.c cVar2, i0 i0Var, int i10, int i11) {
        int i12;
        int i13;
        i0Var.c0(-625529233);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else {
            i12 = (i0Var.f(oVar) ? 4 : 2) | i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i13 = i12 | 48;
        } else {
            i13 = i12 | (i0Var.f(cVar) ? 32 : 16);
        }
        int i16 = i13 | (i0Var.h(cVar2) ? 256 : 128);
        if (i0Var.T(i16 & 1, (i16 & 147) != 146)) {
            if (i14 != 0) {
                oVar = l.f17564b;
            }
            if (i15 != 0) {
                cVar = f18163a;
            }
            a(cVar, oVar, p1.j.d(-250345048, new ba.b(9, cVar2, cVar), i0Var), i0Var, ((i16 << 3) & 112) | ((i16 >> 3) & 14) | 384);
        } else {
            i0Var.W();
        }
        o oVar2 = oVar;
        c cVar3 = cVar;
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(oVar2, cVar3, cVar2, i10, i11);
        }
    }

    public static final void c(String str, boolean z2, c cVar, o oVar, ej.f fVar, ej.a aVar, i0 i0Var, int i10) {
        int i11;
        int i12;
        i0Var.c0(-2001167027);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.g(z2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.f(cVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.f(oVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var.h(fVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= i0Var.h(aVar) ? 131072 : 65536;
        }
        int i13 = 1;
        if (i0Var.T(i11 & 1, (74899 & i11) != 74898)) {
            v1.f fVar2 = e.f18153f;
            b0.c cVar2 = j.f1359a;
            float f10 = e.f18155h;
            b0.h hVarG = j.g(f10);
            boolean z10 = ((i11 & 112) == 32) | ((458752 & i11) == 131072);
            Object objQ = i0Var.Q();
            if (z10 || objQ == f1.m.f6385a) {
                objQ = new k0.w(z2, aVar, i13);
                i0Var.l0(objQ);
            }
            o oVarC = b0.t1.c(1.0f, n.l(oVar, z2, str, (ej.a) objQ, 12));
            float f11 = e.f18148a;
            float f12 = e.f18149b;
            float f13 = e.f18150c;
            o oVarV = b0.d.v(b0.t1.m(oVarC, f11, f13, f12, f13), f10, 0.0f, 2);
            q1 q1VarA = o1.a(hVarG, fVar2, i0Var, 54);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            o oVarC2 = v1.a.c(i0Var, oVarV);
            v2.h.f17668w.getClass();
            v2.f fVar3 = g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar3);
            } else {
                i0Var.o0();
            }
            v2.e eVar = g.f17649f;
            s.M(eVar, i0Var, q1VarA);
            v2.e eVar2 = g.f17648e;
            s.M(eVar2, i0Var, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = g.f17650g;
            s.M(eVar3, i0Var, numValueOf);
            v2.d dVar = g.f17651h;
            s.I(dVar, i0Var);
            v2.e eVar4 = g.f17647d;
            s.M(eVar4, i0Var, oVarC2);
            if (fVar == null) {
                i0Var.b0(-1597947094);
                i0Var.p(false);
                i12 = i11;
            } else {
                i0Var.b0(-1597947093);
                float f14 = e.j;
                o oVarJ = b0.t1.j(l.f17564b, f14, 0.0f, f14, f14, 2);
                i12 = i11;
                q0 q0VarD = r.d(v1.b.f17547a, false);
                int iHashCode2 = Long.hashCode(i0Var.T);
                n1 n1VarL2 = i0Var.l();
                o oVarC3 = v1.a.c(i0Var, oVarJ);
                i0Var.e0();
                if (i0Var.S) {
                    i0Var.k(fVar3);
                } else {
                    i0Var.o0();
                }
                s.M(eVar, i0Var, q0VarD);
                s.M(eVar2, i0Var, n1VarL2);
                s.M(eVar3, i0Var, Integer.valueOf(iHashCode2));
                s.I(dVar, i0Var);
                s.M(eVar4, i0Var, oVarC3);
                fVar.c(new w(z2 ? cVar.f18144c : cVar.f18146e), i0Var, 0);
                i0Var.p(true);
                i0Var.p(false);
            }
            n0 n0Var = new n0(z2 ? cVar.f18143b : cVar.f18145d, e.f18159m, e.f18160n, null, null, e.f18162p, null, e.f18154g, e.f18161o, null, 16613240);
            if (1.0f <= 0.0d) {
                c0.a.a("invalid weight; must be greater than zero");
            }
            k0.s.b(str, new y0(1.0f, true), n0Var, 0, false, 1, 0, i0Var, (i12 & 14) | 1572864, 952);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new m0(str, z2, cVar, oVar, fVar, aVar, i10);
        }
    }
}
