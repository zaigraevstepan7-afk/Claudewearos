package ug;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import og.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e implements Iterable {

    /* renamed from: c, reason: collision with root package name */
    public static final og.b f17070c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f17071d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f17072a;

    /* renamed from: b, reason: collision with root package name */
    public final og.c f17073b;

    static {
        og.b bVar = new og.b(o.f12530a);
        f17070c = bVar;
        f17071d = new e(null, bVar);
    }

    public e(Object obj, og.c cVar) {
        this.f17072a = obj;
        this.f17073b = cVar;
    }

    public final e A(rg.h hVar) {
        if (hVar.isEmpty()) {
            return this;
        }
        e eVar = (e) this.f17073b.e(hVar.z());
        return eVar != null ? eVar.A(hVar.C()) : f17071d;
    }

    public final rg.h b(rg.h hVar, i iVar) {
        rg.h hVarB;
        Object obj = this.f17072a;
        if (obj != null && iVar.h(obj)) {
            return rg.h.f14414d;
        }
        if (hVar.isEmpty()) {
            return null;
        }
        zg.c cVarZ = hVar.z();
        e eVar = (e) this.f17073b.e(cVarZ);
        if (eVar == null || (hVarB = eVar.b(hVar.C(), iVar)) == null) {
            return null;
        }
        return new rg.h(cVarZ).e(hVarB);
    }

    public final Object e(rg.h hVar, d dVar, Object obj) {
        for (Map.Entry entry : this.f17073b) {
            obj = ((e) entry.getValue()).e(hVar.i((zg.c) entry.getKey()), dVar, obj);
        }
        Object obj2 = this.f17072a;
        return obj2 != null ? dVar.i(hVar, obj2, obj) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Object obj2 = eVar.f17072a;
        og.c cVar = eVar.f17073b;
        og.c cVar2 = this.f17073b;
        if (cVar2 == null ? cVar != null : !cVar2.equals(cVar)) {
            return false;
        }
        Object obj3 = this.f17072a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f17072a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        og.c cVar = this.f17073b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final Object i(rg.h hVar) {
        if (hVar.isEmpty()) {
            return this.f17072a;
        }
        e eVar = (e) this.f17073b.e(hVar.z());
        if (eVar != null) {
            return eVar.i(hVar.C());
        }
        return null;
    }

    public final boolean isEmpty() {
        return this.f17072a == null && this.f17073b.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        e(rg.h.f14414d, new ag.i(arrayList, 28), null);
        return arrayList.iterator();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableTree { value=");
        sb2.append(this.f17072a);
        sb2.append(", children={");
        for (Map.Entry entry : this.f17073b) {
            sb2.append(((zg.c) entry.getKey()).f20592a);
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        sb2.append("} }");
        return sb2.toString();
    }

    public final e w(zg.c cVar) {
        e eVar = (e) this.f17073b.e(cVar);
        return eVar != null ? eVar : f17071d;
    }

    public final e x(rg.h hVar) {
        boolean zIsEmpty = hVar.isEmpty();
        og.c cVar = this.f17073b;
        if (!zIsEmpty) {
            zg.c cVarZ = hVar.z();
            e eVar = (e) cVar.e(cVarZ);
            if (eVar == null) {
                return this;
            }
            e eVarX = eVar.x(hVar.C());
            og.c cVarB = eVarX.isEmpty() ? cVar.B(cVarZ) : cVar.A(eVarX, cVarZ);
            Object obj = this.f17072a;
            if (obj != null || !cVarB.isEmpty()) {
                return new e(obj, cVarB);
            }
        } else if (!cVar.isEmpty()) {
            return new e(null, cVar);
        }
        return f17071d;
    }

    public final e y(rg.h hVar, Object obj) {
        boolean zIsEmpty = hVar.isEmpty();
        og.c cVar = this.f17073b;
        if (zIsEmpty) {
            return new e(obj, cVar);
        }
        zg.c cVarZ = hVar.z();
        e eVar = (e) cVar.e(cVarZ);
        if (eVar == null) {
            eVar = f17071d;
        }
        return new e(this.f17072a, cVar.A(eVar.y(hVar.C(), obj), cVarZ));
    }

    public final e z(rg.h hVar, e eVar) {
        if (hVar.isEmpty()) {
            return eVar;
        }
        zg.c cVarZ = hVar.z();
        og.c cVar = this.f17073b;
        e eVar2 = (e) cVar.e(cVarZ);
        if (eVar2 == null) {
            eVar2 = f17071d;
        }
        e eVarZ = eVar2.z(hVar.C(), eVar);
        return new e(this.f17072a, eVarZ.isEmpty() ? cVar.B(cVarZ) : cVar.A(eVarZ, cVarZ));
    }

    public e(Comparable comparable) {
        this(comparable, f17070c);
    }
}
