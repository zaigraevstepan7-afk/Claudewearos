package ri;

import fj.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import qi.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends qi.f implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final c f14527d;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f14528a;

    /* renamed from: b, reason: collision with root package name */
    public int f14529b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14530c;

    static {
        c cVar = new c(0);
        cVar.f14530c = true;
        f14527d = cVar;
    }

    public c(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f14528a = new Object[i10];
    }

    public final Object A(int i10) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f14528a;
        Object obj = objArr[i10];
        k.i0(objArr, i10, objArr, i10 + 1, this.f14529b);
        Object[] objArr2 = this.f14528a;
        int i11 = this.f14529b - 1;
        l.f(objArr2, "<this>");
        objArr2[i11] = null;
        this.f14529b--;
        return obj;
    }

    public final void B(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f14528a;
        k.i0(objArr, i10, objArr, i10 + i11, this.f14529b);
        Object[] objArr2 = this.f14528a;
        int i12 = this.f14529b;
        mk.b.C(objArr2, i12 - i11, i12);
        this.f14529b -= i11;
    }

    public final int C(int i10, int i11, Collection collection, boolean z2) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f14528a[i14]) == z2) {
                Object[] objArr = this.f14528a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f14528a;
        k.i0(objArr2, i10 + i13, objArr2, i11 + i10, this.f14529b);
        Object[] objArr3 = this.f14528a;
        int i16 = this.f14529b;
        mk.b.C(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f14529b -= i15;
        return i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        y();
        int i10 = this.f14529b;
        ((AbstractList) this).modCount++;
        z(i10, 1);
        this.f14528a[i10] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.f(collection, "elements");
        y();
        int size = collection.size();
        w(this.f14529b, collection, size);
        return size > 0;
    }

    @Override // qi.f
    public final int b() {
        return this.f14529b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        y();
        B(0, this.f14529b);
    }

    @Override // qi.f
    public final Object e(int i10) {
        y();
        int i11 = this.f14529b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
        return A(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f14528a;
            int i10 = this.f14529b;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (l.b(objArr[i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f14529b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
        return this.f14528a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f14528a;
        int i10 = this.f14529b;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f14529b; i10++) {
            if (l.b(this.f14528a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f14529b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f14529b - 1; i10 >= 0; i10--) {
            if (l.b(this.f14528a[i10], obj)) {
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
        y();
        return C(0, this.f14529b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l.f(collection, "elements");
        y();
        return C(0, this.f14529b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        y();
        int i11 = this.f14529b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
        Object[] objArr = this.f14528a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        wd.a.q(i10, i11, this.f14529b);
        return new b(this.f14528a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        l.f(objArr, "array");
        int length = objArr.length;
        int i10 = this.f14529b;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f14528a, 0, i10, objArr.getClass());
            l.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        k.i0(this.f14528a, 0, objArr, 0, i10);
        int i11 = this.f14529b;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return mk.b.h(this.f14528a, 0, this.f14529b, this);
    }

    public final void w(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        z(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f14528a[i10 + i12] = it.next();
        }
    }

    public final void x(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        z(i10, 1);
        this.f14528a[i10] = obj;
    }

    public final void y() {
        if (this.f14530c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void z(int i10, int i11) {
        int i12 = this.f14529b + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f14528a;
        if (i12 > objArr.length) {
            int length = objArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
            l.e(objArrCopyOf, "copyOf(...)");
            this.f14528a = objArrCopyOf;
        }
        Object[] objArr2 = this.f14528a;
        k.i0(objArr2, i10 + i11, objArr2, i10, this.f14529b);
        this.f14529b += i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        int i11 = this.f14529b;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
        return new a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        l.f(collection, "elements");
        y();
        int i11 = this.f14529b;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            w(i10, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        y();
        int i11 = this.f14529b;
        if (i10 >= 0 && i10 <= i11) {
            ((AbstractList) this).modCount++;
            z(i10, 1);
            this.f14528a[i10] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return k.l0(this.f14528a, 0, this.f14529b);
    }
}
