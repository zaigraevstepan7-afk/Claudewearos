package rg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f14491b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f14492c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f14493d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f14494e;

    /* renamed from: f, reason: collision with root package name */
    public final y f14495f;

    /* renamed from: g, reason: collision with root package name */
    public final tg.a f14496g;

    /* renamed from: h, reason: collision with root package name */
    public final p1.l f14497h;

    /* renamed from: i, reason: collision with root package name */
    public long f14498i = 1;

    /* renamed from: a, reason: collision with root package name */
    public ug.e f14490a = ug.e.f17071d;

    public z(e eVar, tg.a aVar, y yVar) {
        h0 h0Var = new h0();
        h0Var.f14419a = b.f14382b;
        h0Var.f14420b = new ArrayList();
        h0Var.f14421c = -1L;
        this.f14491b = h0Var;
        this.f14492c = new HashMap();
        this.f14493d = new HashMap();
        this.f14494e = new HashSet();
        this.f14495f = yVar;
        this.f14496g = aVar;
        this.f14497h = eVar.a("SyncTree");
    }

    public static ArrayList a(z zVar, r5.g gVar) {
        ug.e eVar = zVar.f14490a;
        h0 h0Var = zVar.f14491b;
        h hVar = h.f14414d;
        h0Var.getClass();
        return zVar.e(gVar, eVar, null, new q5.b(5, hVar, h0Var));
    }

    public static ArrayList b(z zVar, wg.h hVar, r5.g gVar) {
        zVar.getClass();
        h hVar2 = hVar.f19305a;
        o oVar = (o) zVar.f14490a.i(hVar2);
        ug.l.b("Missing sync point for query tag that we're tracking", oVar != null);
        h0 h0Var = zVar.f14491b;
        h0Var.getClass();
        return oVar.a(gVar, new q5.b(5, hVar2, h0Var), null);
    }

    public static void h(ug.e eVar, ArrayList arrayList) {
        o oVar = (o) eVar.f17072a;
        if (oVar != null && oVar.g()) {
            arrayList.add(oVar.d());
            return;
        }
        if (oVar != null) {
            arrayList.addAll(oVar.e());
        }
        Iterator it = eVar.f17073b.iterator();
        while (it.hasNext()) {
            h((ug.e) ((Map.Entry) it.next()).getValue(), arrayList);
        }
    }

    public static wg.h i(wg.h hVar) {
        return (!hVar.f19306b.d() || hVar.b()) ? hVar : wg.h.a(hVar.f19305a);
    }

    public final List c(f fVar, boolean z2) {
        return (List) this.f14496g.c(new q(this, fVar, z2));
    }

    public final ArrayList d(r5.g gVar, ug.e eVar, zg.r rVar, q5.b bVar) {
        o oVar = (o) eVar.f17072a;
        if (rVar == null && oVar != null) {
            rVar = oVar.c(h.f14414d);
        }
        zg.r rVar2 = rVar;
        ArrayList arrayList = new ArrayList();
        eVar.f17073b.z(new s(this, rVar2, bVar, gVar, arrayList));
        if (oVar != null) {
            arrayList.addAll(oVar.a(gVar, bVar, rVar2));
        }
        return arrayList;
    }

    public final ArrayList e(r5.g gVar, ug.e eVar, zg.r rVar, q5.b bVar) {
        h hVar = (h) gVar.f13732c;
        if (hVar.isEmpty()) {
            return d(gVar, eVar, rVar, bVar);
        }
        o oVar = (o) eVar.f17072a;
        if (rVar == null && oVar != null) {
            rVar = oVar.c(h.f14414d);
        }
        ArrayList arrayList = new ArrayList();
        zg.c cVarZ = hVar.z();
        r5.g gVarW = gVar.w(cVarZ);
        ug.e eVar2 = (ug.e) eVar.f17073b.e(cVarZ);
        if (eVar2 != null && gVarW != null) {
            arrayList.addAll(e(gVarW, eVar2, rVar != null ? rVar.t(cVarZ) : null, new q5.b(5, ((h) bVar.f13235b).i(cVarZ), (h0) bVar.f13236c)));
        }
        if (oVar != null) {
            arrayList.addAll(oVar.a(gVar, bVar, rVar));
        }
        return arrayList;
    }

    public final List f(h hVar, zg.r rVar) {
        return (List) this.f14496g.c(new w(this, hVar, rVar));
    }

    public final zg.r g(h hVar, ArrayList arrayList) {
        ug.e eVarW = this.f14490a;
        h hVarI = h.f14414d;
        zg.r rVarC = null;
        h hVarC = hVar;
        do {
            zg.c cVarZ = hVarC.z();
            hVarC = hVarC.C();
            hVarI = hVarI.i(cVarZ);
            h hVarB = h.B(hVarI, hVar);
            eVarW = cVarZ != null ? eVarW.w(cVarZ) : ug.e.f17071d;
            o oVar = (o) eVarW.f17072a;
            if (oVar != null) {
                rVarC = oVar.c(hVarB);
            }
            if (hVarC.isEmpty()) {
                break;
            }
        } while (rVarC == null);
        return this.f14491b.a(hVar, rVarC, arrayList, true);
    }

    public final List j(wg.h hVar, f fVar, mg.b bVar, boolean z2) {
        return (List) this.f14496g.c(new r(this, hVar, fVar, bVar, z2));
    }

    public final a0 k(wg.h hVar) {
        return (a0) this.f14493d.get(hVar);
    }
}
