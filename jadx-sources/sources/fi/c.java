package fi;

import c1.p4;
import c2.e0;
import c2.l0;
import c2.m0;
import c2.n0;
import c2.u;
import fj.l;
import v1.o;
import v2.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final fa.a f6749a = new fa.a(5);

    /* renamed from: b, reason: collision with root package name */
    public static final fa.a f6750b = new fa.a(6);

    /* renamed from: c, reason: collision with root package name */
    public static final p4 f6751c = new p4(29);

    public static final void a(u uVar, e0 e0Var, c2.j jVar) {
        l.f(e0Var, "outline");
        if (e0Var instanceof m0) {
            u.d(uVar, ((m0) e0Var).f3018f);
            return;
        }
        if (!(e0Var instanceof n0)) {
            if (!(e0Var instanceof l0)) {
                throw new b3.e();
            }
            uVar.m(((l0) e0Var).f3016f);
        } else {
            l.c(jVar);
            jVar.k();
            c2.j.c(jVar, ((n0) e0Var).f3022f);
            uVar.m(jVar);
        }
    }

    public static o b(o oVar, a aVar, ej.a aVar2, ej.c cVar, ej.a aVar3, ej.a aVar4, ej.a aVar5, ej.c cVar2, gi.d dVar, ej.c cVar3, int i10) {
        ej.a aVar6 = (i10 & 8) != 0 ? f6749a : aVar3;
        ej.a aVar7 = (i10 & 16) != 0 ? f6750b : aVar4;
        ej.a aVar8 = (i10 & 32) != 0 ? null : aVar5;
        ej.c cVar4 = (i10 & 64) != 0 ? null : cVar2;
        gi.d dVar2 = (i10 & 128) != 0 ? null : dVar;
        ej.c cVar5 = (i10 & 1024) != 0 ? null : cVar3;
        l.f(oVar, "<this>");
        l.f(aVar, "backdrop");
        l.f(aVar2, "shape");
        l.f(cVar, "effects");
        k kVar = new k(aVar2);
        o bVar = v1.l.f17564b;
        o oVarC = oVar.c(cVar4 != null ? e0.q(bVar, cVar4) : bVar).c(aVar8 != null ? new ji.b(kVar, aVar8) : bVar).c(aVar7 != null ? new ji.g(kVar, aVar7) : bVar);
        if (aVar6 != null) {
            bVar = new ii.b(kVar, aVar6);
        }
        return oVarC.c(bVar).c(new b(aVar, kVar, cVar, cVar4, dVar2, f6751c, cVar5));
    }

    public static final void c(v2.j jVar, e2.d dVar, f2.b bVar, long j, ej.c cVar) {
        l.f(dVar, "$this$recordLayer");
        l.f(bVar, "layer");
        l.f(cVar, "block");
        dVar.n0(bVar, j, new h(n.y(jVar).R, cVar, 0));
    }
}
