package l1;

import fj.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import qi.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: b, reason: collision with root package name */
    public static final i f9872b = new i(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9873a;

    public i(Object[] objArr) {
        this.f9873a = objArr;
    }

    @Override // l1.c
    public final c A(int i10, Object obj) {
        Object[] objArr = this.f9873a;
        cg.b.j(i10, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        l.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = obj;
        return new i(objArrCopyOf);
    }

    @Override // qi.a
    public final int b() {
        return this.f9873a.length;
    }

    @Override // l1.c
    public final c e(int i10, Object obj) {
        Object[] objArr = this.f9873a;
        cg.b.k(i10, objArr.length);
        if (i10 == objArr.length) {
            return i(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            k.k0(objArr, 0, objArr2, i10, 6);
            k.i0(objArr, i10 + 1, objArr2, i10, objArr.length);
            objArr2[i10] = obj;
            return new i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        l.e(objArrCopyOf, "copyOf(...)");
        k.i0(objArr, i10 + 1, objArrCopyOf, i10, objArr.length - 1);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        cg.b.j(i10, b());
        return this.f9873a[i10];
    }

    @Override // l1.c
    public final c i(Object obj) {
        Object[] objArr = this.f9873a;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        l.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new i(objArrCopyOf);
    }

    @Override // qi.d, java.util.List
    public final int indexOf(Object obj) {
        return k.r0(this.f9873a, obj);
    }

    @Override // qi.d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f9873a;
        l.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    @Override // qi.d, java.util.List
    public final ListIterator listIterator(int i10) {
        Object[] objArr = this.f9873a;
        cg.b.k(i10, objArr.length);
        return new d(objArr, i10, objArr.length);
    }

    @Override // l1.c
    public final c w(Collection collection) {
        Object[] objArr = this.f9873a;
        if (collection.size() + objArr.length > 32) {
            f fVarX = x();
            fVarX.addAll(collection);
            return fVarX.i();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        l.e(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new i(objArrCopyOf);
    }

    @Override // l1.c
    public final f x() {
        return new f(this, null, this.f9873a, 0);
    }

    @Override // l1.c
    public final c y(b bVar) {
        Object[] objArr = this.f9873a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z2 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z2) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    l.e(objArrCopyOf, "copyOf(...)");
                    z2 = true;
                    length = i10;
                }
            } else if (z2) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f9872b : new i(k.l0(objArrCopyOf, 0, length));
    }

    @Override // l1.c
    public final c z(int i10) {
        Object[] objArr = this.f9873a;
        cg.b.j(i10, objArr.length);
        if (objArr.length == 1) {
            return f9872b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        l.e(objArrCopyOf, "copyOf(...)");
        k.i0(objArr, i10, objArrCopyOf, i10 + 1, objArr.length);
        return new i(objArrCopyOf);
    }
}
