package wg;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import rg.h0;
import ug.l;
import zg.m;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final p9.a f19312b = new p9.a(16);

    /* renamed from: a, reason: collision with root package name */
    public final xg.b f19313a;

    public j(xg.b bVar) {
        this.f19313a = bVar;
    }

    public final q5.b a(q5.b bVar, rg.h hVar, rg.b bVar2, q5.b bVar3, r rVar, boolean z2, rg.a aVar) {
        q5.b bVarB;
        zg.c cVar;
        q5.b bVarB2 = bVar;
        rg.b bVarE = bVar2;
        a aVar2 = (a) bVarB2.f13236c;
        if (aVar2.f19286a.f20605a.isEmpty() && !aVar2.f19287b) {
            return bVarB2;
        }
        l.b("Can't have a merge that is an overwrite", ((r) bVarE.f14383a.f17072a) == null);
        if (!hVar.isEmpty()) {
            bVarE = rg.b.f14382b.e(hVar, bVarE);
        }
        r rVar2 = aVar2.f19286a.f20605a;
        bVarE.getClass();
        HashMap map = new HashMap();
        for (Map.Entry entry : bVarE.f14383a.f17073b) {
            map.put((zg.c) entry.getKey(), new rg.b((ug.e) entry.getValue()));
        }
        loop1: while (true) {
            bVarB = bVarB2;
            for (Map.Entry entry2 : map.entrySet()) {
                cVar = (zg.c) entry2.getKey();
                if (rVar2.h(cVar)) {
                    break;
                }
            }
            bVarB2 = b(bVarB, new rg.h(cVar), ((rg.b) entry2.getValue()).i(rVar2.t(cVar)), bVar3, rVar, z2, aVar);
        }
        for (Map.Entry entry3 : map.entrySet()) {
            zg.c cVar2 = (zg.c) entry3.getKey();
            boolean z10 = !aVar2.a(cVar2) && ((r) ((rg.b) entry3.getValue()).f14383a.f17072a) == null;
            if (!rVar2.h(cVar2) && !z10) {
                bVarB = b(bVarB, new rg.h(cVar2), ((rg.b) entry3.getValue()).i(rVar2.t(cVar2)), bVar3, rVar, z2, aVar);
            }
        }
        return bVarB;
    }

    public final q5.b b(q5.b bVar, rg.h hVar, r rVar, q5.b bVar2, r rVar2, boolean z2, rg.a aVar) {
        rg.h hVar2;
        zg.l lVarG;
        a aVar2 = (a) bVar.f13236c;
        zg.l lVar = aVar2.f19286a;
        xg.b bVarE = this.f19313a;
        if (!z2) {
            bVarE = bVarE.e();
        }
        xg.b bVar3 = bVarE;
        boolean z10 = true;
        if (hVar.isEmpty()) {
            lVarG = bVar3.i(lVar, new zg.l(rVar, bVar3.getIndex()), null);
        } else {
            if (!bVar3.f() || aVar2.f19288c) {
                zg.c cVarZ = hVar.z();
                hVar2 = hVar;
                if (!aVar2.b(hVar2) && hVar2.size() > 1) {
                    return bVar;
                }
                rg.h hVarC = hVar2.C();
                r rVarK = lVar.f20605a.t(cVarZ).k(hVarC, rVar);
                lVarG = cVarZ.equals(zg.c.f20591d) ? bVar3.g(lVar, rVarK) : bVar3.h(aVar2.f19286a, cVarZ, rVarK, hVarC, f19312b, null);
                if (!aVar2.f19287b && !hVar2.isEmpty()) {
                    z10 = false;
                }
                q5.b bVar4 = new q5.b(20, (a) bVar.f13235b, new a(lVarG, z10, bVar3.f()));
                return d(bVar4, hVar, bVar2, new p1.l(bVar2, bVar4, rVar2, 18), aVar);
            }
            l.b("An empty path should have been caught in the other branch", !hVar.isEmpty());
            zg.c cVarZ2 = hVar.z();
            lVarG = bVar3.i(lVar, lVar.i(cVarZ2, lVar.f20605a.t(cVarZ2).k(hVar.C(), rVar)), null);
        }
        hVar2 = hVar;
        if (!aVar2.f19287b) {
            z10 = false;
        }
        q5.b bVar42 = new q5.b(20, (a) bVar.f13235b, new a(lVarG, z10, bVar3.f()));
        return d(bVar42, hVar, bVar2, new p1.l(bVar2, bVar42, rVar2, 18), aVar);
    }

    public final q5.b c(q5.b bVar, rg.h hVar, r rVar, q5.b bVar2, r rVar2, rg.a aVar) {
        xg.b bVar3;
        a aVar2;
        r rVarF;
        r rVarK;
        r rVar3;
        a aVar3 = (a) bVar.f13235b;
        boolean z2 = aVar3.f19287b;
        zg.l lVar = aVar3.f19286a;
        p1.l lVar2 = new p1.l(bVar2, bVar, rVar2, 18);
        boolean zIsEmpty = hVar.isEmpty();
        xg.b bVar4 = this.f19313a;
        if (zIsEmpty) {
            return bVar.y(bVar4.i(lVar, new zg.l(rVar, bVar4.getIndex()), aVar), true, bVar4.f());
        }
        zg.c cVarZ = hVar.z();
        zg.c cVar = zg.c.f20591d;
        if (cVarZ.equals(cVar)) {
            return bVar.y(bVar4.g(lVar, rVar), z2, aVar3.f19288c);
        }
        rg.h hVarC = hVar.C();
        r rVarT = aVar3.f19286a.f20605a.t(cVarZ);
        if (hVarC.isEmpty()) {
            rVar3 = rVar;
            bVar3 = bVar4;
        } else {
            if (aVar3.a(cVarZ)) {
                rVarF = lVar.f20605a.t(cVarZ);
                bVar3 = bVar4;
            } else {
                if (rVar2 != null) {
                    bVar3 = bVar4;
                    aVar2 = new a(new zg.l(rVar2, m.f20608a), true, false);
                } else {
                    bVar3 = bVar4;
                    aVar2 = (a) bVar.f13236c;
                }
                rVarF = bVar2.f(cVarZ, aVar2);
            }
            if (rVarF == null) {
                rVarK = zg.j.f20603e;
            } else if (hVarC.y().equals(cVar) && rVarF.l(hVarC.A()).isEmpty()) {
                rVar3 = rVarF;
            } else {
                rVarK = rVarF.k(hVarC, rVar);
            }
            rVar3 = rVarK;
        }
        if (rVarT.equals(rVar3)) {
            return bVar;
        }
        return bVar.y(bVar3.h(aVar3.f19286a, cVarZ, rVar3, hVarC, lVar2, aVar), z2, bVar3.f());
    }

    public final q5.b d(q5.b bVar, rg.h hVar, q5.b bVar2, xg.a aVar, rg.a aVar2) {
        r rVarF;
        r rVarA;
        a aVar3 = (a) bVar.f13235b;
        zg.l lVarH = aVar3.f19286a;
        a aVar4 = (a) bVar.f13236c;
        zg.l lVar = aVar4.f19286a;
        if (bVar2.x(hVar) != null) {
            return bVar;
        }
        boolean zIsEmpty = hVar.isEmpty();
        xg.b bVar3 = this.f19313a;
        if (zIsEmpty) {
            l.b("If change path is empty, we must have complete server data", aVar4.f19287b);
            if (aVar4.f19288c) {
                r rVarN = bVar.n();
                if (!(rVarN instanceof zg.f)) {
                    rVarN = zg.j.f20603e;
                }
                rVarA = bVar2.g(rVarN);
            } else {
                rVarA = ((h0) bVar2.f13236c).a((rg.h) bVar2.f13235b, bVar.n(), Collections.EMPTY_LIST, false);
            }
            lVarH = bVar3.i(aVar3.f19286a, new zg.l(rVarA, bVar3.getIndex()), aVar2);
        } else {
            zg.c cVarZ = hVar.z();
            if (cVarZ.equals(zg.c.f20591d)) {
                l.b("Can't have a priority with additional path components", hVar.size() == 1);
                r rVarH = bVar2.h(hVar, lVarH.f20605a, lVar.f20605a);
                if (rVarH != null) {
                    lVarH = bVar3.g(lVarH, rVarH);
                }
            } else {
                rg.h hVarC = hVar.C();
                if (aVar3.a(cVarZ)) {
                    r rVar = lVar.f20605a;
                    r rVar2 = lVarH.f20605a;
                    r rVar3 = lVarH.f20605a;
                    r rVarH2 = bVar2.h(hVar, rVar2, rVar);
                    rVarF = rVarH2 != null ? rVar3.t(cVarZ).k(hVarC, rVarH2) : rVar3.t(cVarZ);
                } else {
                    rVarF = bVar2.f(cVarZ, aVar4);
                }
                r rVar4 = rVarF;
                if (rVar4 != null) {
                    lVarH = bVar3.h(aVar3.f19286a, cVarZ, rVar4, hVarC, aVar, aVar2);
                }
            }
        }
        return bVar.y(lVarH, aVar3.f19287b || hVar.isEmpty(), bVar3.f());
    }
}
