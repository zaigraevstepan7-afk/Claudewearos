package t1;

import f1.o1;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 implements List, gj.b {

    /* renamed from: a, reason: collision with root package name */
    public final q f15434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15435b;

    /* renamed from: c, reason: collision with root package name */
    public int f15436c;

    /* renamed from: d, reason: collision with root package name */
    public int f15437d;

    public f0(q qVar, int i10, int i11) {
        this.f15434a = qVar;
        this.f15435b = i10;
        this.f15436c = r.j(qVar);
        this.f15437d = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i10 = this.f15435b + this.f15437d;
        q qVar = this.f15434a;
        qVar.add(i10, obj);
        this.f15437d++;
        this.f15436c = r.j(qVar);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f15437d, collection);
    }

    public final void b() {
        if (r.j(this.f15434a) != this.f15436c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f15437d > 0) {
            b();
            int i10 = this.f15437d;
            int i11 = this.f15435b;
            q qVar = this.f15434a;
            qVar.w(i11, i10 + i11);
            this.f15437d = 0;
            this.f15436c = r.j(qVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List
    public final Object get(int i10) {
        b();
        r.a(i10, this.f15437d);
        return this.f15434a.get(this.f15435b + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i10 = this.f15437d;
        int i11 = this.f15435b;
        Iterator it = cg.b.T(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iNextInt = ((kj.g) it).nextInt();
            if (fj.l.b(obj, this.f15434a.get(iNextInt))) {
                return iNextInt - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f15437d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i10 = this.f15437d;
        int i11 = this.f15435b;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (fj.l.b(obj, this.f15434a.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z2) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        l1.c cVar;
        g gVarJ;
        boolean zB;
        b();
        q qVar = this.f15434a;
        int i11 = this.f15435b;
        int i12 = this.f15437d + i11;
        int size = qVar.size();
        do {
            synchronized (r.f15483a) {
                x xVar = qVar.f15482a;
                fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x xVar2 = (x) m.h(xVar);
                i10 = xVar2.f15515d;
                cVar = xVar2.f15514c;
            }
            fj.l.c(cVar);
            l1.f fVarX = cVar.x();
            fVarX.subList(i11, i12).retainAll(collection);
            l1.c cVarI = fVarX.i();
            if (fj.l.b(cVarI, cVar)) {
                break;
            }
            x xVar3 = qVar.f15482a;
            fj.l.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zB = r.b((x) m.w(xVar3, qVar, gVarJ), i10, cVarI, true);
            }
            m.n(gVarJ, qVar);
        } while (!zB);
        int size2 = size - qVar.size();
        if (size2 > 0) {
            this.f15436c = r.j(this.f15434a);
            this.f15437d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        r.a(i10, this.f15437d);
        b();
        int i11 = i10 + this.f15435b;
        q qVar = this.f15434a;
        Object obj2 = qVar.set(i11, obj);
        this.f15436c = r.j(qVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f15437d;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.f15437d)) {
            o1.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i12 = this.f15435b;
        return new f0(this.f15434a, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fj.k.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        b();
        fj.t tVar = new fj.t();
        tVar.f6805a = i10 - 1;
        return new qi.w(tVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return fj.k.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        b();
        int i11 = i10 + this.f15435b;
        q qVar = this.f15434a;
        boolean zAddAll = qVar.addAll(i11, collection);
        if (zAddAll) {
            this.f15437d = collection.size() + this.f15437d;
            this.f15436c = r.j(qVar);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        b();
        int i11 = this.f15435b + i10;
        q qVar = this.f15434a;
        Object objRemove = qVar.remove(i11);
        this.f15437d--;
        this.f15436c = r.j(qVar);
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        b();
        int i11 = this.f15435b + i10;
        q qVar = this.f15434a;
        qVar.add(i11, obj);
        this.f15437d++;
        this.f15436c = r.j(qVar);
    }
}
