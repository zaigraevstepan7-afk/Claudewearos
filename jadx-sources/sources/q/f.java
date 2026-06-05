package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements Collection, Set, gj.b, gj.e {

    /* renamed from: a, reason: collision with root package name */
    public int[] f13064a = r.a.f13648a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f13065b = r.a.f13650c;

    /* renamed from: c, reason: collision with root package name */
    public int f13066c;

    public f(int i10) {
        if (i10 > 0) {
            q.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int iB;
        int i11 = this.f13066c;
        if (obj == null) {
            iB = q.b(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iB = q.b(this, obj, iHashCode);
        }
        if (iB >= 0) {
            return false;
        }
        int i12 = ~iB;
        int[] iArr = this.f13064a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f13065b;
            int[] iArr2 = new int[i13];
            this.f13064a = iArr2;
            this.f13065b = new Object[i13];
            if (i11 != this.f13066c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                qi.k.j0(0, iArr.length, 6, iArr, iArr2);
                qi.k.k0(objArr, 0, this.f13065b, objArr.length, 6);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f13064a;
            int i14 = i12 + 1;
            qi.k.e0(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.f13065b;
            qi.k.i0(objArr2, i14, objArr2, i12, i11);
        }
        int i15 = this.f13066c;
        if (i11 == i15) {
            int[] iArr4 = this.f13064a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f13065b[i12] = obj;
                this.f13066c = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        fj.l.f(collection, "elements");
        int size = collection.size() + this.f13066c;
        int i10 = this.f13066c;
        int[] iArr = this.f13064a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f13065b;
            int[] iArr2 = new int[size];
            this.f13064a = iArr2;
            this.f13065b = new Object[size];
            if (i10 > 0) {
                qi.k.j0(0, i10, 6, iArr, iArr2);
                qi.k.k0(objArr, 0, this.f13065b, this.f13066c, 6);
            }
        }
        if (this.f13066c != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i10) {
        int i11 = this.f13066c;
        Object[] objArr = this.f13065b;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i12 = i11 - 1;
        int[] iArr = this.f13064a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                qi.k.e0(i10, i13, i11, iArr, iArr);
                Object[] objArr2 = this.f13065b;
                qi.k.i0(objArr2, i10, objArr2, i13, i11);
            }
            this.f13065b[i12] = null;
        } else {
            int i14 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArr2 = new int[i14];
            this.f13064a = iArr2;
            this.f13065b = new Object[i14];
            if (i10 > 0) {
                qi.k.j0(0, i10, 6, iArr, iArr2);
                qi.k.k0(objArr, 0, this.f13065b, i10, 6);
            }
            if (i10 < i12) {
                int i15 = i10 + 1;
                qi.k.e0(i10, i15, i11, iArr, this.f13064a);
                qi.k.i0(objArr, i10, this.f13065b, i15, i11);
            }
        }
        if (i11 != this.f13066c) {
            throw new ConcurrentModificationException();
        }
        this.f13066c = i12;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f13066c != 0) {
            this.f13064a = r.a.f13648a;
            this.f13065b = r.a.f13650c;
            this.f13066c = 0;
        }
        if (this.f13066c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? q.b(this, null, 0) : q.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        fj.l.f(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f13066c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.f13066c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.f13065b[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f13064a;
        int i10 = this.f13066c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f13066c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB = obj == null ? q.b(this, null, 0) : q.b(this, obj, obj.hashCode());
        if (iB < 0) {
            return false;
        }
        b(iB);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        fj.l.f(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        fj.l.f(collection, "elements");
        boolean z2 = false;
        for (int i10 = this.f13066c - 1; -1 < i10; i10--) {
            if (!qi.l.w0(collection, this.f13065b[i10])) {
                b(i10);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f13066c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return qi.k.l0(this.f13065b, 0, this.f13066c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13066c * 14);
        sb2.append('{');
        int i10 = this.f13066c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f13065b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        fj.l.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        fj.l.f(objArr, "array");
        int i10 = this.f13066c;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        } else if (objArr.length > i10) {
            objArr[i10] = null;
        }
        qi.k.i0(this.f13065b, 0, objArr, 0, this.f13066c);
        return objArr;
    }
}
