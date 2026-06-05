package rg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f14382b = new b(new ug.e(null));

    /* renamed from: a, reason: collision with root package name */
    public final ug.e f14383a;

    public b(ug.e eVar) {
        this.f14383a = eVar;
    }

    public static zg.r w(h hVar, ug.e eVar, zg.r rVar) {
        zg.c cVar;
        Object obj = eVar.f17072a;
        if (obj != null) {
            return rVar.k(hVar, (zg.r) obj);
        }
        Iterator it = eVar.f17073b.iterator();
        zg.r rVar2 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            cVar = zg.c.f20591d;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            ug.e eVar2 = (ug.e) entry.getValue();
            zg.c cVar2 = (zg.c) entry.getKey();
            if (cVar2.equals(cVar)) {
                ug.l.b("Priority writes must always be leaf nodes", eVar2.f17072a != null);
                rVar2 = (zg.r) eVar2.f17072a;
            } else {
                rVar = w(hVar.i(cVar2), eVar2, rVar);
            }
        }
        return (rVar.l(hVar).isEmpty() || rVar2 == null) ? rVar : rVar.k(hVar.i(cVar), rVar2);
    }

    public static b y(HashMap map) {
        ug.e eVarZ = ug.e.f17071d;
        for (Map.Entry entry : map.entrySet()) {
            eVarZ = eVarZ.z((h) entry.getKey(), new ug.e((zg.r) entry.getValue()));
        }
        return new b(eVarZ);
    }

    public final HashMap A() {
        HashMap map = new HashMap();
        a aVar = new a(map);
        ug.e eVar = this.f14383a;
        eVar.getClass();
        eVar.e(h.f14414d, aVar, null);
        return map;
    }

    public final b b(h hVar, zg.r rVar) {
        if (hVar.isEmpty()) {
            return new b(new ug.e(rVar));
        }
        x9.b bVar = ug.i.f17079v;
        ug.e eVar = this.f14383a;
        h hVarB = eVar.b(hVar, bVar);
        if (hVarB == null) {
            return new b(eVar.z(hVar, new ug.e(rVar)));
        }
        h hVarB2 = h.B(hVarB, hVar);
        zg.r rVar2 = (zg.r) eVar.i(hVarB);
        zg.c cVarY = hVarB2.y();
        return (cVarY != null && cVarY.equals(zg.c.f20591d) && rVar2.l(hVarB2.A()).isEmpty()) ? this : new b(eVar.y(hVarB, rVar2.k(hVarB2, rVar)));
    }

    public final b e(h hVar, b bVar) {
        ug.e eVar = bVar.f14383a;
        ag.i iVar = new ag.i(hVar, 20);
        eVar.getClass();
        return (b) eVar.e(h.f14414d, iVar, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != b.class) {
            return false;
        }
        return ((b) obj).A().equals(A());
    }

    public final int hashCode() {
        return A().hashCode();
    }

    public final zg.r i(zg.r rVar) {
        return w(h.f14414d, this.f14383a, rVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14383a.iterator();
    }

    public final String toString() {
        return "CompoundWrite{" + A().toString() + "}";
    }

    public final b x(h hVar) {
        if (hVar.isEmpty()) {
            return this;
        }
        zg.r rVarZ = z(hVar);
        return rVarZ != null ? new b(new ug.e(rVarZ)) : new b(this.f14383a.A(hVar));
    }

    public final zg.r z(h hVar) {
        x9.b bVar = ug.i.f17079v;
        ug.e eVar = this.f14383a;
        h hVarB = eVar.b(hVar, bVar);
        if (hVarB != null) {
            return ((zg.r) eVar.i(hVarB)).l(h.B(hVarB, hVar));
        }
        return null;
    }
}
