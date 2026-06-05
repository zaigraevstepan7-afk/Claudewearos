package db;

import b0.o1;
import b0.q1;
import b0.r;
import b0.w;
import c1.p4;
import f1.i0;
import f1.n1;
import f1.s;
import f1.t1;
import fj.l;
import ib.q0;
import ib.r0;
import ib.s0;
import ib.t0;
import mi.p;
import s.j;
import s.m;
import v1.o;
import v2.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.e f5057a = new p1.e(new p4(18), false, 919387400);

    /* renamed from: b, reason: collision with root package name */
    public static final p1.e f5058b = new p1.e(new p4(19), false, -1808678721);

    /* renamed from: c, reason: collision with root package name */
    public static final p1.e f5059c = new p1.e(new p4(20), false, 2099713572);

    public static final void a(int i10, ej.a aVar, final ej.c cVar, i0 i0Var, p pVar, o oVar, final boolean z2) {
        final ej.a aVar2;
        final p pVar2;
        l.f(cVar, "onAction");
        i0Var.c0(234762302);
        int i11 = i10 | (i0Var.f(pVar) ? 4 : 2) | (i0Var.g(z2) ? 32 : 16) | (i0Var.h(cVar) ? 2048 : 1024) | (i0Var.f(oVar) ? 16384 : 8192);
        if (i0Var.T(i11 & 1, (i11 & 9363) != 9362)) {
            aVar2 = aVar;
            pVar2 = pVar;
            j.a(i0Var.j(jb.f.f8822b), oVar, null, null, "topbar_mode", null, p1.j.d(-1145775913, new ej.g() { // from class: db.e
                @Override // ej.g
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    q0 q0Var = (q0) obj2;
                    i0 i0Var2 = (i0) obj3;
                    ((Integer) obj4).getClass();
                    l.f((m) obj, "$this$AnimatedContent");
                    l.f(q0Var, "it");
                    if (q0Var.equals(s0.f8456a)) {
                        i0Var2.b0(-1579022565);
                        i0Var2.p(false);
                    } else if (q0Var.equals(t0.f8458a)) {
                        i0Var2.b0(-1579020722);
                        a.b(0, aVar2, cVar, i0Var2, pVar2, null, z2);
                        i0Var2.p(false);
                    } else {
                        if (!q0Var.equals(r0.f8454a)) {
                            i0Var2.b0(-1579023924);
                            i0Var2.p(false);
                            throw new b3.e();
                        }
                        i0Var2.b0(-1579012805);
                        i0Var2.p(false);
                    }
                    return pi.o.f13011a;
                }
            }, i0Var), i0Var, ((i11 >> 9) & 112) | 1597440, 44);
        } else {
            aVar2 = aVar;
            pVar2 = pVar;
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new f(pVar2, z2, aVar2, cVar, oVar, i10);
        }
    }

    public static final void b(int i10, ej.a aVar, ej.c cVar, i0 i0Var, p pVar, o oVar, boolean z2) {
        o oVar2;
        ej.c cVar2 = cVar;
        i0 i0Var2 = i0Var;
        l.f(cVar2, "onAction");
        i0Var2.c0(1832010594);
        int i11 = i10 | 6 | (i0Var.f(pVar) ? 32 : 16) | (i0Var2.g(z2) ? 256 : 128) | (i0Var2.h(aVar) ? 2048 : 1024) | (i0Var2.h(cVar2) ? 16384 : 8192);
        if (i0Var2.T(i11 & 1, (i11 & 9363) != 9362)) {
            float f10 = 10;
            v1.l lVar = v1.l.f17564b;
            o oVarX = b0.d.x(b0.t1.c(1.0f, lVar), 0.0f, 20, 0.0f, 0.0f, 13);
            t2.q0 q0VarD = r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            o oVarC = v1.a.c(i0Var2, oVarX);
            h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            s.M(eVar, i0Var2, q0VarD);
            v2.e eVar2 = v2.g.f17648e;
            s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            s.M(eVar4, i0Var2, oVarC);
            o oVarV = b0.d.v(b0.t1.c(0.9f, lVar), f10, 0.0f, 2);
            t2.q0 q0VarD2 = r.d(v1.b.f17547a, false);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            o oVarC2 = v1.a.c(i0Var2, oVarV);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            s.M(eVar, i0Var2, q0VarD2);
            s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
            s.M(eVar4, i0Var2, oVarC2);
            v1.g gVar = v1.b.f17550d;
            w wVar = w.f1450a;
            o oVarB = wVar.b(lVar, gVar);
            q1 q1VarA = o1.a(b0.j.g(8), v1.b.C, i0Var2, 6);
            int iHashCode3 = Long.hashCode(i0Var2.T);
            n1 n1VarL3 = i0Var2.l();
            o oVarC3 = v1.a.c(i0Var2, oVarB);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            s.M(eVar, i0Var2, q1VarA);
            s.M(eVar2, i0Var2, n1VarL3);
            gk.b.t(iHashCode3, i0Var2, eVar3, i0Var2, dVar);
            s.M(eVar4, i0Var2, oVarC3);
            float f11 = 45;
            o oVarK = b0.t1.k(f11, lVar);
            int i12 = 57344 & i11;
            boolean z10 = i12 == 16384;
            Object objQ = i0Var2.Q();
            f1.f fVar2 = f1.m.f6385a;
            if (z10 || objQ == fVar2) {
                objQ = new g(cVar, 0);
                i0Var2.l0(objQ);
            }
            ej.a aVar2 = (ej.a) objQ;
            int i13 = (i11 << 9) & 458752;
            int i14 = (i11 << 15) & 3670016;
            int i15 = i13 | 27702 | i14;
            cVar2 = cVar;
            x8.a.d(oVarK, f5057a, null, 0.25f, false, z2, pVar, aVar2, i0Var2, i15, 4);
            i0Var2 = i0Var;
            x8.a.d(b0.t1.s(b0.t1.e(f11, lVar), 3), f5058b, null, 0.25f, false, z2, pVar, aVar, i0Var2, i15 | ((i11 << 12) & 29360128), 4);
            i0Var2.p(true);
            o oVarB2 = wVar.b(b0.t1.k(f11, lVar), v1.b.f17552f);
            boolean z11 = i12 == 16384;
            Object objQ2 = i0Var2.Q();
            if (z11 || objQ2 == fVar2) {
                objQ2 = new g(cVar2, 1);
                i0Var2.l0(objQ2);
            }
            x8.a.d(oVarB2, f5059c, null, 0.25f, false, z2, pVar, (ej.a) objQ2, i0Var2, i13 | 27696 | i14, 4);
            i0Var2.p(true);
            i0Var2.p(true);
            oVar2 = lVar;
        } else {
            i0Var2.W();
            oVar2 = oVar;
        }
        t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new f(oVar2, pVar, z2, aVar, cVar2, i10);
        }
    }
}
