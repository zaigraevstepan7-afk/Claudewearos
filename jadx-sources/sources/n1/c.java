package n1;

import fj.l;
import java.util.Collection;
import java.util.Iterator;
import m1.e;
import qi.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends g implements Collection, gj.b {

    /* renamed from: a, reason: collision with root package name */
    public b f11860a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11861b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11862c;

    /* renamed from: d, reason: collision with root package name */
    public final e f11863d;

    public c(b bVar) {
        this.f11860a = bVar;
        this.f11861b = bVar.f11857a;
        this.f11862c = bVar.f11858b;
        this.f11863d = bVar.f11859c.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        e eVar = this.f11863d;
        if (eVar.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f11861b = obj;
            this.f11862c = obj;
            eVar.put(obj, new a());
            return true;
        }
        V v9 = eVar.get(this.f11862c);
        l.c(v9);
        eVar.put(this.f11862c, new a(((a) v9).f11854a, obj));
        eVar.put(obj, new a(this.f11862c));
        this.f11862c = obj;
        return true;
    }

    @Override // qi.g
    public final int b() {
        e eVar = this.f11863d;
        eVar.getClass();
        return eVar.f11236f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f11863d.clear();
        o1.b bVar = o1.b.f12370a;
        this.f11861b = bVar;
        this.f11862c = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f11863d.containsKey(obj);
    }

    public final b e() {
        m1.c cVarBuild = this.f11863d.build();
        b bVar = this.f11860a;
        if (cVarBuild != bVar.f11859c) {
            bVar = new b(this.f11861b, this.f11862c, cVarBuild);
        }
        this.f11860a = bVar;
        return bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        e eVar = this.f11863d;
        a aVar = (a) eVar.remove(obj);
        if (aVar == null) {
            return false;
        }
        Object obj2 = aVar.f11855b;
        Object obj3 = aVar.f11854a;
        o1.b bVar = o1.b.f12370a;
        if (obj3 != bVar) {
            V v9 = eVar.get(obj3);
            l.c(v9);
            eVar.put(obj3, new a(((a) v9).f11854a, obj2));
        } else {
            this.f11861b = obj2;
        }
        if (obj2 == bVar) {
            this.f11862c = obj3;
            return true;
        }
        V v10 = eVar.get(obj2);
        l.c(v10);
        eVar.put(obj2, new a(obj3, ((a) v10).f11855b));
        return true;
    }
}
