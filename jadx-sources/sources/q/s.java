package q;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s implements Map, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f13126a;

    /* renamed from: b, reason: collision with root package name */
    public h f13127b;

    /* renamed from: c, reason: collision with root package name */
    public h f13128c;

    /* renamed from: d, reason: collision with root package name */
    public r0 f13129d;

    public s(g0 g0Var) {
        fj.l.f(g0Var, "parent");
        this.f13126a = g0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f13126a.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f13126a.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.f13127b;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.f13126a, 0);
        this.f13127b = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        return fj.l.b(this.f13126a, ((s) obj).f13126a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f13126a.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f13126a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f13126a.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f13128c;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.f13126a, 1);
        this.f13128c = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f13126a.f13077e;
    }

    public final String toString() {
        return this.f13126a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        r0 r0Var = this.f13129d;
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0(this.f13126a);
        this.f13129d = r0Var2;
        return r0Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
