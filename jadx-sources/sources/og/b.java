package og;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f12509a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f12510b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparator f12511c;

    public b(Comparator comparator) {
        this.f12509a = new Object[0];
        this.f12510b = new Object[0];
        this.f12511c = comparator;
    }

    public static b C(List list, Map map, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i10 = 0;
        for (Object obj : list) {
            objArr[i10] = obj;
            objArr2[i10] = map.get(obj);
            i10++;
        }
        return new b(comparator, objArr, objArr2);
    }

    @Override // og.c
    public final c A(Iterable iterable, Object obj) {
        int iD = D(obj);
        Comparator comparator = this.f12511c;
        Object[] objArr = this.f12510b;
        Object[] objArr2 = this.f12509a;
        if (iD != -1) {
            if (objArr2[iD] == obj && objArr[iD] == iterable) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[iD] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[iD] = iterable;
            return new b(comparator, objArr3, objArr4);
        }
        if (objArr2.length > 25) {
            HashMap map = new HashMap(objArr2.length + 1);
            for (int i10 = 0; i10 < objArr2.length; i10++) {
                map.put(objArr2[i10], objArr[i10]);
            }
            map.put(obj, iterable);
            return a8.j.n(new ArrayList(map.keySet()), map, comparator);
        }
        int i11 = 0;
        while (i11 < objArr2.length && comparator.compare(objArr2[i11], obj) < 0) {
            i11++;
        }
        Object[] objArr5 = new Object[objArr2.length + 1];
        System.arraycopy(objArr2, 0, objArr5, 0, i11);
        objArr5[i11] = obj;
        int i12 = i11 + 1;
        System.arraycopy(objArr2, i11, objArr5, i12, (r1 - i11) - 1);
        Object[] objArr6 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr6, 0, i11);
        objArr6[i11] = iterable;
        System.arraycopy(objArr, i11, objArr6, i12, (r1 - i11) - 1);
        return new b(comparator, objArr5, objArr6);
    }

    @Override // og.c
    public final c B(Object obj) {
        int iD = D(obj);
        if (iD == -1) {
            return this;
        }
        Object[] objArr = this.f12509a;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, iD);
        int i10 = iD + 1;
        System.arraycopy(objArr, i10, objArr2, iD, length - iD);
        Object[] objArr3 = this.f12510b;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, iD);
        System.arraycopy(objArr3, i10, objArr4, iD, length2 - iD);
        return new b(this.f12511c, objArr2, objArr4);
    }

    public final int D(Object obj) {
        int i10 = 0;
        for (Object obj2 : this.f12509a) {
            if (this.f12511c.compare(obj, obj2) == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // og.c
    public final boolean b(Object obj) {
        return D(obj) != -1;
    }

    @Override // og.c
    public final Object e(zg.c cVar) {
        int iD = D(cVar);
        if (iD != -1) {
            return this.f12510b[iD];
        }
        return null;
    }

    @Override // og.c
    public final Comparator i() {
        return this.f12511c;
    }

    @Override // og.c
    public final boolean isEmpty() {
        return this.f12509a.length == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a(this, 0, false);
    }

    @Override // og.c
    public final int size() {
        return this.f12509a.length;
    }

    @Override // og.c
    public final Iterator u() {
        return new a(this, this.f12509a.length - 1, true);
    }

    @Override // og.c
    public final Object w() {
        Object[] objArr = this.f12509a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // og.c
    public final Object x() {
        Object[] objArr = this.f12509a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // og.c
    public final Object y(Object obj) {
        int iD = D(obj);
        if (iD == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (iD <= 0) {
            return null;
        }
        return this.f12509a[iD - 1];
    }

    @Override // og.c
    public final void z(x8.a aVar) {
        int i10 = 0;
        while (true) {
            Object[] objArr = this.f12509a;
            if (i10 >= objArr.length) {
                return;
            }
            aVar.Y(objArr[i10], this.f12510b[i10]);
            i10++;
        }
    }

    public b(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f12509a = objArr;
        this.f12510b = objArr2;
        this.f12511c = comparator;
    }
}
