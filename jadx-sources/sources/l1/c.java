package l1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c extends qi.d implements List, Collection, gj.a {
    public abstract c A(int i10, Object obj);

    @Override // qi.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // qi.a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract c e(int i10, Object obj);

    public abstract c i(Object obj);

    @Override // qi.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // qi.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // qi.d, java.util.List
    public final List subList(int i10, int i11) {
        return new k1.a(this, i10, i11);
    }

    public c w(Collection collection) {
        f fVarX = x();
        fVarX.addAll(collection);
        return fVarX.i();
    }

    public abstract f x();

    public abstract c y(b bVar);

    public abstract c z(int i10);
}
