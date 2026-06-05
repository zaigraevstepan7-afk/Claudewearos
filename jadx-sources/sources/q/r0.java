package q;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r0 implements Collection, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13124a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13125b;

    public r0() {
        int i10 = m0.f13106a;
        this.f13125b = new d0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f13124a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((d0) this.f13125b).a(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f13124a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f13124a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((d0) this.f13125b).b();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f13124a) {
            case 0:
                return ((g0) this.f13125b).d(obj);
            default:
                return ((d0) this.f13125b).c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f13124a) {
            case 0:
                fj.l.f(collection, "elements");
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!((g0) this.f13125b).d(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((d0) this.f13125b).c(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f13124a) {
            case 0:
                return ((g0) this.f13125b).i();
            default:
                return ((d0) this.f13125b).f13053g == 0;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f13124a) {
            case 0:
                return mk.b.y(new g1.g(this, null, 3));
            default:
                d0 d0Var = (d0) this.f13125b;
                d0Var.getClass();
                return new mj.e(new f0(d0Var));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f13124a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((d0) this.f13125b).g(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f13124a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((d0) this.f13125b).g(collection);
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f13124a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f13124a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((d0) this.f13125b).i(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f13124a) {
            case 0:
                return ((g0) this.f13125b).f13077e;
            default:
                return ((d0) this.f13125b).f13053g;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f13124a) {
        }
        return fj.k.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f13124a) {
            case 0:
                fj.l.f(objArr, "array");
                break;
        }
        return fj.k.b(this, objArr);
    }

    public r0(g0 g0Var) {
        fj.l.f(g0Var, "parent");
        this.f13125b = g0Var;
    }
}
