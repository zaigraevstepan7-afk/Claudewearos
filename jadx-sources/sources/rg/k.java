package rg;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final l f14431a;

    /* renamed from: b, reason: collision with root package name */
    public final ug.f f14432b;

    /* renamed from: c, reason: collision with root package name */
    public pg.q f14433c;

    /* renamed from: d, reason: collision with root package name */
    public yh.c f14434d;

    /* renamed from: e, reason: collision with root package name */
    public p9.a f14435e;

    /* renamed from: f, reason: collision with root package name */
    public p1.l f14436f;

    /* renamed from: g, reason: collision with root package name */
    public final qh.c f14437g;

    /* renamed from: h, reason: collision with root package name */
    public final e f14438h;

    /* renamed from: i, reason: collision with root package name */
    public final p1.l f14439i;
    public final p1.l j;

    /* renamed from: k, reason: collision with root package name */
    public final p1.l f14440k;

    /* renamed from: l, reason: collision with root package name */
    public long f14441l;

    /* renamed from: m, reason: collision with root package name */
    public z f14442m;

    /* renamed from: n, reason: collision with root package name */
    public z f14443n;

    public k(e eVar, l lVar) {
        new p9.a(14);
        ug.f fVar = new ug.f();
        fVar.f17074a = 0L;
        this.f14432b = fVar;
        this.f14441l = 1L;
        this.f14431a = lVar;
        this.f14438h = eVar;
        this.f14439i = eVar.a("RepoOperation");
        this.j = eVar.a("Transaction");
        this.f14440k = eVar.a("DataOperation");
        this.f14437g = new qh.c(eVar);
        j(new ah.d(this, 25));
    }

    public static void b(k kVar, String str, h hVar, mg.b bVar) {
        int i10;
        kVar.getClass();
        if (bVar == null || (i10 = bVar.f11671a) == -1 || i10 == -25) {
            return;
        }
        kVar.f14439i.J(str + " at " + hVar.toString() + " failed: " + bVar.toString());
    }

    public static void c(k kVar, long j, h hVar, mg.b bVar) {
        kVar.getClass();
        if (bVar == null || bVar.f11671a != -25) {
            boolean z2 = bVar == null;
            z zVar = kVar.f14443n;
            List list = (List) zVar.f14496g.c(new v(zVar, j, !z2, kVar.f14432b));
            if (list.size() > 0) {
                kVar.i(hVar);
            }
            kVar.g(list);
        }
    }

    public static void d(ArrayList arrayList, p1.l lVar) {
        ((ug.j) lVar.f12662d).getClass();
        for (Object obj : ((ug.j) lVar.f12662d).f17080a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            d(arrayList, new p1.l((zg.c) entry.getKey(), lVar, (ug.j) entry.getValue(), 12));
        }
    }

    public final void a(p1.l lVar) {
        ((ug.j) lVar.f12662d).getClass();
        new ArrayList();
    }

    public final p1.l e(h hVar) {
        p1.l lVarF = this.f14436f;
        while (!hVar.isEmpty()) {
            ((ug.j) lVarF.f12662d).getClass();
            lVarF = lVarF.F(new h(hVar.z()));
            hVar = hVar.C();
        }
        return lVarF;
    }

    public final void f(wg.h hVar, boolean z2) {
        h hVar2 = hVar.f19305a;
        ug.l.c(hVar2.isEmpty() || !hVar2.z().equals(c.f14384a));
        z zVar = this.f14443n;
        HashSet hashSet = zVar.f14494e;
        if (z2 && !hashSet.contains(hVar)) {
            zVar.c(new x(hVar), true);
            hashSet.add(hVar);
        } else {
            if (z2 || !hashSet.contains(hVar)) {
                return;
            }
            x xVar = new x(hVar);
            zVar.j(xVar.f14489d, xVar, null, true);
            hashSet.remove(hVar);
        }
    }

    public final void g(List list) {
        if (list.isEmpty()) {
            return;
        }
        qh.c cVar = this.f14437g;
        p1.l lVar = (p1.l) cVar.f13508c;
        if (lVar.A()) {
            lVar.l(null, "Raising " + list.size() + " event(s)", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(list);
        ((Handler) ((d8.e) cVar.f13507b).f5001a).post(new a8.e(29, cVar, arrayList));
    }

    public final void h(p1.l lVar) {
        ((ug.j) lVar.f12662d).getClass();
        for (Object obj : ((ug.j) lVar.f12662d).f17080a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            h(new p1.l((zg.c) entry.getKey(), lVar, (ug.j) entry.getValue(), 12));
        }
    }

    public final h i(h hVar) {
        p1.l lVarE = e(hVar);
        h hVarT = lVarE.t();
        ArrayList arrayList = new ArrayList();
        d(arrayList, lVarE);
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            return hVarT;
        }
        ArrayList arrayList2 = new ArrayList();
        new ArrayList();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw gk.b.k(it);
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            throw gk.b.k(it2);
        }
        h(this.f14436f);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((Handler) this.f14438h.f14396b.f5001a).post((Runnable) arrayList2.get(i10));
        }
        p1.l lVar = this.f14436f;
        h(lVar);
        k(lVar);
        return hVarT;
    }

    public final void j(Runnable runnable) {
        ((ug.b) this.f14438h.f14399e.f373b).execute(runnable);
    }

    public final void k(p1.l lVar) {
        ug.j jVar = (ug.j) lVar.f12662d;
        jVar.getClass();
        if (jVar.f17080a.isEmpty()) {
            return;
        }
        for (Object obj : ((ug.j) lVar.f12662d).f17080a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            k(new p1.l((zg.c) entry.getKey(), lVar, (ug.j) entry.getValue(), 12));
        }
    }

    public final void l(zg.c cVar, Object obj) {
        if (cVar.equals(c.f14385b)) {
            this.f14432b.f17074a = ((Long) obj).longValue();
        }
        h hVar = new h(c.f14384a, cVar);
        try {
            zg.r rVarB = u0.c.b(obj, zg.j.f20603e);
            yh.c cVar2 = this.f14434d;
            cVar2.f20314b = ((zg.r) cVar2.f20314b).k(hVar, rVarB);
            g(this.f14442m.f(hVar, rVarB));
        } catch (mg.c e10) {
            this.f14439i.o("Failed to parse info update", e10);
        }
    }

    public final String toString() {
        return this.f14431a.toString();
    }
}
