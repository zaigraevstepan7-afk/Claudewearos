package ri;

import fj.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import qi.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends qi.f implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f14522a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14523b;

    /* renamed from: c, reason: collision with root package name */
    public int f14524c;

    /* renamed from: d, reason: collision with root package name */
    public final b f14525d;

    /* renamed from: e, reason: collision with root package name */
    public final c f14526e;

    public b(Object[] objArr, int i10, int i11, b bVar, c cVar) {
        l.f(objArr, "backing");
        l.f(cVar, "root");
        this.f14522a = objArr;
        this.f14523b = i10;
        this.f14524c = i11;
        this.f14525d = bVar;
        this.f14526e = cVar;
        ((AbstractList) this).modCount = ((AbstractList) cVar).modCount;
    }

    public final Object A(int i10) {
        Object objA;
        ((AbstractList) this).modCount++;
        b bVar = this.f14525d;
        if (bVar != null) {
            objA = bVar.A(i10);
        } else {
            c cVar = c.f14527d;
            objA = this.f14526e.A(i10);
        }
        this.f14524c--;
        return objA;
    }

    public final void B(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f14525d;
        if (bVar != null) {
            bVar.B(i10, i11);
        } else {
            c cVar = c.f14527d;
            this.f14526e.B(i10, i11);
        }
        this.f14524c -= i11;
    }

    public final int C(int i10, int i11, Collection collection, boolean z2) {
        int iC;
        b bVar = this.f14525d;
        if (bVar != null) {
            iC = bVar.C(i10, i11, collection, z2);
        } else {
            c cVar = c.f14527d;
            iC = this.f14526e.C(i10, i11, collection, z2);
        }
        if (iC > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f14524c -= iC;
        return iC;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        z();
        y();
        x(this.f14523b + this.f14524c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.f(collection, "elements");
        z();
        y();
        int size = collection.size();
        w(this.f14523b + this.f14524c, collection, size);
        return size > 0;
    }

    @Override // qi.f
    public final int b() {
        y();
        return this.f14524c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        z();
        y();
        B(this.f14523b, this.f14524c);
    }

    @Override // qi.f
    public final Object e(int i10) {
        z();
        y();
        int i11 = this.f14524c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
        return A(this.f14523b + i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        y();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f14522a;
            int i10 = this.f14524c;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (l.b(objArr[this.f14523b + i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        y();
        int i11 = this.f14524c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
        return this.f14522a[this.f14523b + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        y();
        Object[] objArr = this.f14522a;
        int i10 = this.f14524c;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[this.f14523b + i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        y();
        for (int i10 = 0; i10 < this.f14524c; i10++) {
            if (l.b(this.f14522a[this.f14523b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        y();
        return this.f14524c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        y();
        for (int i10 = this.f14524c - 1; i10 >= 0; i10--) {
            if (l.b(this.f14522a[this.f14523b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        z();
        y();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            e(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        l.f(collection, "elements");
        z();
        y();
        return C(this.f14523b, this.f14524c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l.f(collection, "elements");
        z();
        y();
        return C(this.f14523b, this.f14524c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        z();
        y();
        int i11 = this.f14524c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
        Object[] objArr = this.f14522a;
        int i12 = this.f14523b;
        Object obj2 = objArr[i12 + i10];
        objArr[i12 + i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        wd.a.q(i10, i11, this.f14524c);
        return new b(this.f14522a, this.f14523b + i10, i11 - i10, this, this.f14526e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        l.f(objArr, "array");
        y();
        int length = objArr.length;
        int i10 = this.f14524c;
        int i11 = this.f14523b;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f14522a, i11, i10 + i11, objArr.getClass());
            l.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        k.i0(this.f14522a, 0, objArr, i11, i10 + i11);
        int i12 = this.f14524c;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        y();
        return mk.b.h(this.f14522a, this.f14523b, this.f14524c, this);
    }

    public final void w(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        c cVar = this.f14526e;
        b bVar = this.f14525d;
        if (bVar != null) {
            bVar.w(i10, collection, i11);
        } else {
            c cVar2 = c.f14527d;
            cVar.w(i10, collection, i11);
        }
        this.f14522a = cVar.f14528a;
        this.f14524c += i11;
    }

    public final void x(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f14526e;
        b bVar = this.f14525d;
        if (bVar != null) {
            bVar.x(i10, obj);
        } else {
            c cVar2 = c.f14527d;
            cVar.x(i10, obj);
        }
        this.f14522a = cVar.f14528a;
        this.f14524c++;
    }

    public final void y() {
        if (((AbstractList) this.f14526e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void z() {
        if (this.f14526e.f14530c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        y();
        int i11 = this.f14524c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
        return new a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        z();
        y();
        int i11 = this.f14524c;
        if (i10 >= 0 && i10 <= i11) {
            x(this.f14523b + i10, obj);
            return;
        }
        throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        l.f(collection, "elements");
        z();
        y();
        int i11 = this.f14524c;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            w(this.f14523b + i10, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        y();
        Object[] objArr = this.f14522a;
        int i10 = this.f14524c;
        int i11 = this.f14523b;
        return k.l0(objArr, i11, i10 + i11);
    }
}
