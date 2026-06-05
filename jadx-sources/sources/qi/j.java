package qi;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f13515d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f13516a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f13517b;

    /* renamed from: c, reason: collision with root package name */
    public int f13518c;

    public j() {
        this.f13517b = f13515d;
    }

    public final int A(int i10) {
        return i10 < 0 ? i10 + this.f13517b.length : i10;
    }

    public final void B(int i10, int i11) {
        if (i10 < i11) {
            k.m0(i10, i11, null, this.f13517b);
            return;
        }
        Object[] objArr = this.f13517b;
        k.m0(i10, objArr.length, null, objArr);
        k.m0(0, i11, null, this.f13517b);
    }

    public final int C(int i10) {
        Object[] objArr = this.f13517b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final void D() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int length;
        int i11 = this.f13518c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
        if (i10 == i11) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        D();
        w(this.f13518c + 1);
        int iC = C(this.f13516a + i10);
        int i12 = this.f13518c;
        if (i10 < ((i12 + 1) >> 1)) {
            if (iC == 0) {
                Object[] objArr = this.f13517b;
                fj.l.f(objArr, "<this>");
                iC = objArr.length;
            }
            int i13 = iC - 1;
            int i14 = this.f13516a;
            if (i14 == 0) {
                Object[] objArr2 = this.f13517b;
                fj.l.f(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f13516a;
            if (i13 >= i15) {
                Object[] objArr3 = this.f13517b;
                objArr3[length] = objArr3[i15];
                k.i0(objArr3, i15, objArr3, i15 + 1, i13 + 1);
            } else {
                Object[] objArr4 = this.f13517b;
                k.i0(objArr4, i15 - 1, objArr4, i15, objArr4.length);
                Object[] objArr5 = this.f13517b;
                objArr5[objArr5.length - 1] = objArr5[0];
                k.i0(objArr5, 0, objArr5, 1, i13 + 1);
            }
            this.f13517b[i13] = obj;
            this.f13516a = length;
        } else {
            int iC2 = C(i12 + this.f13516a);
            if (iC < iC2) {
                Object[] objArr6 = this.f13517b;
                k.i0(objArr6, iC + 1, objArr6, iC, iC2);
            } else {
                Object[] objArr7 = this.f13517b;
                k.i0(objArr7, 1, objArr7, 0, iC2);
                Object[] objArr8 = this.f13517b;
                objArr8[0] = objArr8[objArr8.length - 1];
                k.i0(objArr8, iC + 1, objArr8, iC, objArr8.length - 1);
            }
            this.f13517b[iC] = obj;
        }
        this.f13518c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        fj.l.f(collection, "elements");
        int i11 = this.f13518c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == this.f13518c) {
            return addAll(collection);
        }
        D();
        w(collection.size() + this.f13518c);
        int iC = C(this.f13518c + this.f13516a);
        int iC2 = C(this.f13516a + i10);
        int size = collection.size();
        if (i10 >= ((this.f13518c + 1) >> 1)) {
            int i12 = iC2 + size;
            if (iC2 < iC) {
                int i13 = size + iC;
                Object[] objArr = this.f13517b;
                if (i13 <= objArr.length) {
                    k.i0(objArr, i12, objArr, iC2, iC);
                } else if (i12 >= objArr.length) {
                    k.i0(objArr, i12 - objArr.length, objArr, iC2, iC);
                } else {
                    int length = iC - (i13 - objArr.length);
                    k.i0(objArr, 0, objArr, length, iC);
                    Object[] objArr2 = this.f13517b;
                    k.i0(objArr2, i12, objArr2, iC2, length);
                }
            } else {
                Object[] objArr3 = this.f13517b;
                k.i0(objArr3, size, objArr3, 0, iC);
                Object[] objArr4 = this.f13517b;
                if (i12 >= objArr4.length) {
                    k.i0(objArr4, i12 - objArr4.length, objArr4, iC2, objArr4.length);
                } else {
                    k.i0(objArr4, 0, objArr4, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f13517b;
                    k.i0(objArr5, i12, objArr5, iC2, objArr5.length - size);
                }
            }
            i(iC2, collection);
            return true;
        }
        int i14 = this.f13516a;
        int length2 = i14 - size;
        if (iC2 < i14) {
            Object[] objArr6 = this.f13517b;
            k.i0(objArr6, length2, objArr6, i14, objArr6.length);
            if (size >= iC2) {
                Object[] objArr7 = this.f13517b;
                k.i0(objArr7, objArr7.length - size, objArr7, 0, iC2);
            } else {
                Object[] objArr8 = this.f13517b;
                k.i0(objArr8, objArr8.length - size, objArr8, 0, size);
                Object[] objArr9 = this.f13517b;
                k.i0(objArr9, 0, objArr9, size, iC2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f13517b;
            k.i0(objArr10, length2, objArr10, i14, iC2);
        } else {
            Object[] objArr11 = this.f13517b;
            length2 += objArr11.length;
            int i15 = iC2 - i14;
            int length3 = objArr11.length - length2;
            if (length3 >= i15) {
                k.i0(objArr11, length2, objArr11, i14, iC2);
            } else {
                k.i0(objArr11, length2, objArr11, i14, i14 + length3);
                Object[] objArr12 = this.f13517b;
                k.i0(objArr12, 0, objArr12, this.f13516a + length3, iC2);
            }
        }
        this.f13516a = length2;
        i(A(iC2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        D();
        w(this.f13518c + 1);
        int length = this.f13516a;
        if (length == 0) {
            Object[] objArr = this.f13517b;
            fj.l.f(objArr, "<this>");
            length = objArr.length;
        }
        int i10 = length - 1;
        this.f13516a = i10;
        this.f13517b[i10] = obj;
        this.f13518c++;
    }

    public final void addLast(Object obj) {
        D();
        w(b() + 1);
        this.f13517b[C(b() + this.f13516a)] = obj;
        this.f13518c = b() + 1;
    }

    @Override // qi.f
    public final int b() {
        return this.f13518c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            D();
            B(this.f13516a, C(b() + this.f13516a));
        }
        this.f13516a = 0;
        this.f13518c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // qi.f
    public final Object e(int i10) {
        int i11 = this.f13518c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
        if (i10 == yd.f.B(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        D();
        int iC = C(this.f13516a + i10);
        Object[] objArr = this.f13517b;
        Object obj = objArr[iC];
        if (i10 < (this.f13518c >> 1)) {
            int i12 = this.f13516a;
            if (iC >= i12) {
                k.i0(objArr, i12 + 1, objArr, i12, iC);
            } else {
                k.i0(objArr, 1, objArr, 0, iC);
                Object[] objArr2 = this.f13517b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f13516a;
                k.i0(objArr2, i13 + 1, objArr2, i13, objArr2.length - 1);
            }
            Object[] objArr3 = this.f13517b;
            int i14 = this.f13516a;
            objArr3[i14] = null;
            this.f13516a = y(i14);
        } else {
            int iC2 = C(yd.f.B(this) + this.f13516a);
            if (iC <= iC2) {
                Object[] objArr4 = this.f13517b;
                k.i0(objArr4, iC, objArr4, iC + 1, iC2 + 1);
            } else {
                Object[] objArr5 = this.f13517b;
                k.i0(objArr5, iC, objArr5, iC + 1, objArr5.length);
                Object[] objArr6 = this.f13517b;
                objArr6[objArr6.length - 1] = objArr6[0];
                k.i0(objArr6, 0, objArr6, 1, iC2 + 1);
            }
            this.f13517b[iC2] = null;
        }
        this.f13518c--;
        return obj;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f13517b[this.f13516a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int iB = b();
        if (i10 < 0 || i10 >= iB) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, iB, "index: ", ", size: "));
        }
        return this.f13517b[C(this.f13516a + i10)];
    }

    public final void i(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f13517b.length;
        while (i10 < length && it.hasNext()) {
            this.f13517b[i10] = it.next();
            i10++;
        }
        int i11 = this.f13516a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f13517b[i12] = it.next();
        }
        this.f13518c = collection.size() + this.f13518c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iC = C(b() + this.f13516a);
        int length = this.f13516a;
        if (length < iC) {
            while (length < iC) {
                if (fj.l.b(obj, this.f13517b[length])) {
                    i10 = this.f13516a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f13516a) < iC) {
            return -1;
        }
        int length2 = this.f13517b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iC; i11++) {
                    if (fj.l.b(obj, this.f13517b[i11])) {
                        length = i11 + this.f13517b.length;
                        i10 = this.f13516a;
                    }
                }
                return -1;
            }
            if (fj.l.b(obj, this.f13517b[length])) {
                i10 = this.f13516a;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f13517b[C(yd.f.B(this) + this.f13516a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int iC = C(this.f13518c + this.f13516a);
        int i11 = this.f13516a;
        if (i11 < iC) {
            length = iC - 1;
            if (i11 <= length) {
                while (!fj.l.b(obj, this.f13517b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f13516a;
                return length - i10;
            }
            return -1;
        }
        if (!isEmpty() && this.f13516a >= iC) {
            int i12 = iC - 1;
            while (true) {
                if (-1 >= i12) {
                    Object[] objArr = this.f13517b;
                    fj.l.f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.f13516a;
                    if (i13 <= length) {
                        while (!fj.l.b(obj, this.f13517b[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i10 = this.f13516a;
                    }
                } else {
                    if (fj.l.b(obj, this.f13517b[i12])) {
                        length = i12 + this.f13517b.length;
                        i10 = this.f13516a;
                        break;
                    }
                    i12--;
                }
            }
            return length - i10;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        e(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iC;
        fj.l.f(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f13517b.length != 0) {
            int iC2 = C(b() + this.f13516a);
            int i10 = this.f13516a;
            if (i10 < iC2) {
                iC = i10;
                while (i10 < iC2) {
                    Object obj = this.f13517b[i10];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f13517b[iC] = obj;
                        iC++;
                    }
                    i10++;
                }
                k.m0(iC, iC2, null, this.f13517b);
            } else {
                int length = this.f13517b.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f13517b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f13517b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iC = C(i11);
                for (int i12 = 0; i12 < iC2; i12++) {
                    Object[] objArr2 = this.f13517b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f13517b[iC] = obj3;
                        iC = y(iC);
                    }
                }
                z2 = z10;
            }
            if (z2) {
                D();
                this.f13518c = A(iC - this.f13516a);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        D();
        Object[] objArr = this.f13517b;
        int i10 = this.f13516a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f13516a = y(i10);
        this.f13518c = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        D();
        int iC = C(yd.f.B(this) + this.f13516a);
        Object[] objArr = this.f13517b;
        Object obj = objArr[iC];
        objArr[iC] = null;
        this.f13518c = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        wd.a.q(i10, i11, this.f13518c);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f13518c) {
            clear();
            return;
        }
        if (i12 == 1) {
            e(i10);
            return;
        }
        D();
        if (i10 < this.f13518c - i11) {
            int iC = C(this.f13516a + (i10 - 1));
            int iC2 = C(this.f13516a + (i11 - 1));
            while (i10 > 0) {
                int i13 = iC + 1;
                int iMin = Math.min(i10, Math.min(i13, iC2 + 1));
                Object[] objArr = this.f13517b;
                int i14 = iC2 - iMin;
                int i15 = iC - iMin;
                k.i0(objArr, i14 + 1, objArr, i15 + 1, i13);
                iC = A(i15);
                iC2 = A(i14);
                i10 -= iMin;
            }
            int iC3 = C(this.f13516a + i12);
            B(this.f13516a, iC3);
            this.f13516a = iC3;
        } else {
            int iC4 = C(this.f13516a + i11);
            int iC5 = C(this.f13516a + i10);
            int i16 = this.f13518c;
            while (true) {
                i16 -= i11;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f13517b;
                i11 = Math.min(i16, Math.min(objArr2.length - iC4, objArr2.length - iC5));
                Object[] objArr3 = this.f13517b;
                int i17 = iC4 + i11;
                k.i0(objArr3, iC5, objArr3, iC4, i17);
                iC4 = C(i17);
                iC5 = C(iC5 + i11);
            }
            int iC6 = C(this.f13518c + this.f13516a);
            B(A(iC6 - i12), iC6);
        }
        this.f13518c -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iC;
        fj.l.f(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f13517b.length != 0) {
            int iC2 = C(b() + this.f13516a);
            int i10 = this.f13516a;
            if (i10 < iC2) {
                iC = i10;
                while (i10 < iC2) {
                    Object obj = this.f13517b[i10];
                    if (collection.contains(obj)) {
                        this.f13517b[iC] = obj;
                        iC++;
                    } else {
                        z2 = true;
                    }
                    i10++;
                }
                k.m0(iC, iC2, null, this.f13517b);
            } else {
                int length = this.f13517b.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f13517b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        this.f13517b[i11] = obj2;
                        i11++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                iC = C(i11);
                for (int i12 = 0; i12 < iC2; i12++) {
                    Object[] objArr2 = this.f13517b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        this.f13517b[iC] = obj3;
                        iC = y(iC);
                    } else {
                        z10 = true;
                    }
                }
                z2 = z10;
            }
            if (z2) {
                D();
                this.f13518c = A(iC - this.f13516a);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iB = b();
        if (i10 < 0 || i10 >= iB) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, iB, "index: ", ", size: "));
        }
        int iC = C(this.f13516a + i10);
        Object[] objArr = this.f13517b;
        Object obj2 = objArr[iC];
        objArr[iC] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    public final void w(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f13517b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f13515d) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f13517b = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        k.i0(objArr, 0, objArr2, this.f13516a, objArr.length);
        Object[] objArr3 = this.f13517b;
        int length2 = objArr3.length;
        int i12 = this.f13516a;
        k.i0(objArr3, length2 - i12, objArr2, 0, i12);
        this.f13516a = 0;
        this.f13517b = objArr2;
    }

    public final Object x() {
        if (isEmpty()) {
            return null;
        }
        return this.f13517b[this.f13516a];
    }

    public final int y(int i10) {
        fj.l.f(this.f13517b, "<this>");
        if (i10 == r0.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final Object z() {
        if (isEmpty()) {
            return null;
        }
        return this.f13517b[C(yd.f.B(this) + this.f13516a)];
    }

    public j(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f13515d;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException(m6.a.d(i10, "Illegal Capacity: "));
        }
        this.f13517b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        fj.l.f(objArr, "array");
        int length = objArr.length;
        int i10 = this.f13518c;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
            fj.l.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iC = C(this.f13518c + this.f13516a);
        int i11 = this.f13516a;
        if (i11 < iC) {
            k.k0(this.f13517b, i11, objArr, iC, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f13517b;
            k.i0(objArr2, 0, objArr, this.f13516a, objArr2.length);
            Object[] objArr3 = this.f13517b;
            k.i0(objArr3, objArr3.length - this.f13516a, objArr, 0, iC);
        }
        int i12 = this.f13518c;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    public j(x xVar) throws NegativeArraySizeException {
        Object[] objArrB = fj.k.b(xVar, new Object[0]);
        this.f13517b = objArrB;
        this.f13518c = objArrB.length;
        if (objArrB.length == 0) {
            this.f13517b = f13515d;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        fj.l.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        D();
        w(collection.size() + b());
        i(C(b() + this.f13516a), collection);
        return true;
    }
}
