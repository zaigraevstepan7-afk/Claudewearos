package rg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class q implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f14459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f14461c;

    public q(z zVar, f fVar, boolean z2) {
        this.f14461c = zVar;
        this.f14459a = fVar;
        this.f14460b = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z2;
        boolean z10;
        wg.a aVar;
        zg.r rVarC;
        f fVar = this.f14459a;
        wg.h hVarD = fVar.d();
        h hVar = hVarD.f19305a;
        wg.g gVar = hVarD.f19306b;
        z zVar = this.f14461c;
        ug.e eVarW = zVar.f14490a;
        HashMap map = zVar.f14493d;
        tg.a aVar2 = zVar.f14496g;
        h hVarC = hVar;
        boolean z11 = false;
        zg.r rVarC2 = null;
        while (true) {
            z2 = true;
            if (eVarW.isEmpty()) {
                break;
            }
            o oVar = (o) eVarW.f17072a;
            if (oVar != null) {
                if (rVarC2 == null) {
                    rVarC2 = oVar.c(hVarC);
                }
                z11 = z11 || oVar.g();
            }
            eVarW = eVarW.w(hVarC.isEmpty() ? zg.c.b("") : hVarC.z());
            hVarC = hVarC.C();
        }
        o oVar2 = (o) zVar.f14490a.i(hVar);
        if (oVar2 == null) {
            oVar2 = new o(aVar2);
            zVar.f14490a = zVar.f14490a.y(hVar, oVar2);
        } else {
            z11 = z11 || oVar2.g();
            if (rVarC2 == null) {
                rVarC2 = oVar2.c(h.f14414d);
            }
        }
        aVar2.e();
        if (rVarC2 != null) {
            aVar = new wg.a(new zg.l(rVarC2, gVar.f19304e), true, false);
            z10 = true;
        } else {
            wg.a aVarD = aVar2.d(hVarD);
            zg.j jVarD = zg.j.f20603e;
            for (Map.Entry entry : zVar.f14490a.A(hVar).f17073b) {
                boolean z12 = z2;
                o oVar3 = (o) ((ug.e) entry.getValue()).f17072a;
                if (oVar3 != null && (rVarC = oVar3.c(h.f14414d)) != null) {
                    jVarD = jVarD.d((zg.c) entry.getKey(), rVarC);
                }
                z2 = z12;
            }
            z10 = z2;
            for (zg.p pVar : aVarD.f19286a.f20605a) {
                if (!jVarD.h(pVar.f20614a)) {
                    jVarD = jVarD.d(pVar.f20614a, pVar.f20615b);
                }
            }
            aVar = new wg.a(new zg.l(jVarD, gVar.f19304e), false, false);
        }
        boolean z13 = oVar2.h(hVarD) != null ? z10 : false;
        if (!z13 && !gVar.d()) {
            ug.l.b("View does not exist but we have a tag", !map.containsKey(hVarD));
            long j = zVar.f14498i;
            zVar.f14498i = 1 + j;
            a0 a0Var = new a0(j);
            map.put(hVarD, a0Var);
            zVar.f14492c.put(a0Var, hVarD);
        }
        h0 h0Var = zVar.f14491b;
        h0Var.getClass();
        q5.b bVar = new q5.b(5, hVar, h0Var);
        HashMap map2 = oVar2.f14452a;
        wg.h hVarD2 = fVar.d();
        wg.i iVarF = oVar2.f(hVarD2, bVar, aVar);
        wg.g gVar2 = hVarD2.f19306b;
        if (!gVar2.d()) {
            HashSet hashSet = new HashSet();
            Iterator it = ((wg.a) iVarF.f19309c.f13235b).f19286a.f20605a.iterator();
            while (it.hasNext()) {
                hashSet.add(((zg.p) it.next()).f20614a);
            }
            oVar2.f14453b.e();
        }
        if (!map2.containsKey(gVar2)) {
            map2.put(gVar2, iVarF);
        }
        map2.put(gVar2, iVarF);
        iVarF.f19310d.add(fVar);
        wg.a aVar3 = (wg.a) iVarF.f19309c.f13235b;
        ArrayList arrayList = new ArrayList();
        zg.l lVar = aVar3.f19286a;
        for (Iterator it2 = lVar.f20605a.iterator(); it2.hasNext(); it2 = it2) {
            zg.p pVar2 = (zg.p) it2.next();
            arrayList.add(new wg.c(2, zg.l.e(pVar2.f20615b), pVar2.f20614a, null));
        }
        if (aVar3.f19287b) {
            arrayList.add(new wg.c(5, lVar, null, null));
        }
        ArrayList arrayListA = iVarF.a(arrayList, lVar, fVar);
        if (!z13 && !z11 && !this.f14460b) {
            wg.i iVarH = oVar2.h(hVarD);
            h hVar2 = hVarD.f19305a;
            a0 a0VarK = zVar.k(hVarD);
            h0 h0Var2 = new h0(zVar, iVarH);
            zVar.f14495f.m(z.i(hVarD), a0VarK, h0Var2, h0Var2);
            ug.e eVarA = zVar.f14490a.A(hVar2);
            if (a0VarK != null) {
                ug.l.b("If we're adding a query, it shouldn't be shadowed", !((o) eVarA.f17072a).g());
                return arrayListA;
            }
            d8.e eVar = new d8.e(zVar);
            eVarA.getClass();
            eVarA.e(h.f14414d, eVar, null);
        }
        return arrayListA;
    }
}
