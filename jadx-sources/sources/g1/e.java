package g1;

import fj.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f7024a;

    /* renamed from: b, reason: collision with root package name */
    public b f7025b;

    /* renamed from: c, reason: collision with root package name */
    public int f7026c = 0;

    public e(Object[] objArr) {
        this.f7024a = objArr;
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f7026c + 1;
        if (this.f7024a.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f7024a;
        int i12 = this.f7026c;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i12 - i10);
        }
        objArr[i10] = obj;
        this.f7026c++;
    }

    public final void b(Object obj) {
        int i10 = this.f7026c + 1;
        if (this.f7024a.length < i10) {
            n(i10);
        }
        Object[] objArr = this.f7024a;
        int i11 = this.f7026c;
        objArr[i11] = obj;
        this.f7026c = i11 + 1;
    }

    public final void c(int i10, e eVar) {
        int i11 = eVar.f7026c;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f7026c + i11;
        if (this.f7024a.length < i12) {
            n(i12);
        }
        Object[] objArr = this.f7024a;
        int i13 = this.f7026c;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(eVar.f7024a, 0, objArr, i10, i11);
        this.f7026c += i11;
    }

    public final void d(int i10, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i11 = this.f7026c + size;
        if (this.f7024a.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f7024a;
        int i12 = this.f7026c;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.f7026c += size;
    }

    public final boolean e(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f7026c + size;
        if (this.f7024a.length < i12) {
            n(i12);
        }
        Object[] objArr = this.f7024a;
        int i13 = this.f7026c;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i13 - i10);
        }
        for (Object obj : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                yd.f.i0();
                throw null;
            }
            objArr[i11 + i10] = obj;
            i11 = i14;
        }
        this.f7026c += size;
        return true;
    }

    public final List g() {
        b bVar = this.f7025b;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 0);
        this.f7025b = bVar2;
        return bVar2;
    }

    public final void h() {
        Object[] objArr = this.f7024a;
        int i10 = this.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f7026c = 0;
    }

    public final boolean i(Object obj) {
        int i10 = this.f7026c - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !l.b(this.f7024a[i11], obj); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        Object[] objArr = this.f7024a;
        int i10 = this.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (l.b(obj, objArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return false;
        }
        l(iJ);
        return true;
    }

    public final Object l(int i10) {
        Object[] objArr = this.f7024a;
        Object obj = objArr[i10];
        int i11 = this.f7026c;
        if (i10 != i11 - 1) {
            int i12 = i10 + 1;
            System.arraycopy(objArr, i12, objArr, i10, i11 - i12);
        }
        int i13 = this.f7026c - 1;
        this.f7026c = i13;
        objArr[i13] = null;
        return obj;
    }

    public final void m(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f7026c;
            if (i11 < i12) {
                Object[] objArr = this.f7024a;
                System.arraycopy(objArr, i11, objArr, i10, i12 - i11);
            }
            int i13 = this.f7026c;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f7024a[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f7026c = i14;
        }
    }

    public final void n(int i10) {
        Object[] objArr = this.f7024a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f7024a = objArr2;
    }

    public final void o(Comparator comparator) {
        Arrays.sort(this.f7024a, 0, this.f7026c, comparator);
    }
}
