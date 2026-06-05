package q;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f13115a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f13116b;

    /* renamed from: c, reason: collision with root package name */
    public int f13117c;

    public p0(int i10) {
        this.f13115a = i10 == 0 ? r.a.f13648a : new int[i10];
        this.f13116b = i10 == 0 ? r.a.f13650c : new Object[i10 << 1];
    }

    public final int a(Object obj) {
        int i10 = this.f13117c * 2;
        Object[] objArr = this.f13116b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i10) {
        int i11 = this.f13117c;
        int[] iArr = this.f13115a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            fj.l.e(iArrCopyOf, "copyOf(...)");
            this.f13115a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13116b, i10 * 2);
            fj.l.e(objArrCopyOf, "copyOf(...)");
            this.f13116b = objArrCopyOf;
        }
        if (this.f13117c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f13117c;
        if (i11 == 0) {
            return -1;
        }
        int iA = r.a.a(this.f13115a, i11, i10);
        if (iA < 0 || fj.l.b(obj, this.f13116b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f13115a[i12] == i10) {
            if (fj.l.b(obj, this.f13116b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f13115a[i13] == i10; i13--) {
            if (fj.l.b(obj, this.f13116b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final void clear() {
        if (this.f13117c > 0) {
            this.f13115a = r.a.f13648a;
            this.f13116b = r.a.f13650c;
            this.f13117c = 0;
        }
        if (this.f13117c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i10 = this.f13117c;
        if (i10 == 0) {
            return -1;
        }
        int iA = r.a.a(this.f13115a, i10, 0);
        if (iA < 0 || this.f13116b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f13115a[i11] == 0) {
            if (this.f13116b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f13115a[i12] == 0; i12--) {
            if (this.f13116b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof p0) {
                int i10 = this.f13117c;
                if (i10 != ((p0) obj).f13117c) {
                    return false;
                }
                p0 p0Var = (p0) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objF = f(i11);
                    Object objI = i(i11);
                    Object obj2 = p0Var.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !p0Var.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f13117c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f13117c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objF2 = f(i13);
                Object objI2 = i(i13);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i10) {
        boolean z2 = false;
        if (i10 >= 0 && i10 < this.f13117c) {
            z2 = true;
        }
        if (z2) {
            return this.f13116b[i10 << 1];
        }
        r.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final Object g(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f13117c)) {
            r.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.f13116b;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f13115a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                qi.k.e0(i10, i14, i11, iArr, iArr);
                Object[] objArr2 = this.f13116b;
                qi.k.i0(objArr2, i12, objArr2, i14 << 1, i11 << 1);
            }
            Object[] objArr3 = this.f13116b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            fj.l.e(iArrCopyOf, "copyOf(...)");
            this.f13115a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13116b, i16 << 1);
            fj.l.e(objArrCopyOf, "copyOf(...)");
            this.f13116b = objArrCopyOf;
            if (i11 != this.f13117c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                qi.k.e0(0, 0, i10, iArr, this.f13115a);
                qi.k.i0(objArr, 0, this.f13116b, 0, i12);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                qi.k.e0(i10, i17, i11, iArr, this.f13115a);
                qi.k.i0(objArr, i12, this.f13116b, i17 << 1, i11 << 1);
            }
        }
        if (i11 != this.f13117c) {
            throw new ConcurrentModificationException();
        }
        this.f13117c = i13;
        return obj;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f13116b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f13116b[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i10, Object obj) {
        boolean z2 = false;
        if (i10 >= 0 && i10 < this.f13117c) {
            z2 = true;
        }
        if (!z2) {
            r.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f13116b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f13115a;
        Object[] objArr = this.f13116b;
        int i10 = this.f13117c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i10) {
        boolean z2 = false;
        if (i10 >= 0 && i10 < this.f13117c) {
            z2 = true;
        }
        if (z2) {
            return this.f13116b[(i10 << 1) + 1];
        }
        r.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f13117c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.f13117c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f13116b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f13115a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            fj.l.e(iArrCopyOf, "copyOf(...)");
            this.f13115a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13116b, i13 << 1);
            fj.l.e(objArrCopyOf, "copyOf(...)");
            this.f13116b = objArrCopyOf;
            if (i10 != this.f13117c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f13115a;
            int i14 = i12 + 1;
            qi.k.e0(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f13116b;
            qi.k.i0(objArr2, i14 << 1, objArr2, i12 << 1, this.f13117c << 1);
        }
        int i15 = this.f13117c;
        if (i10 == i15) {
            int[] iArr3 = this.f13115a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f13116b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f13117c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f13117c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13117c * 28);
        sb2.append('{');
        int i10 = this.f13117c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objF = f(i11);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objI = i(i11);
            if (objI != sb2) {
                sb2.append(objI);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        fj.l.e(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !fj.l.b(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !fj.l.b(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(p0 p0Var) {
        this(0);
        if (p0Var != null) {
            int i10 = p0Var.f13117c;
            b(this.f13117c + i10);
            if (this.f13117c != 0) {
                for (int i11 = 0; i11 < i10; i11++) {
                    put(p0Var.f(i11), p0Var.i(i11));
                }
            } else if (i10 > 0) {
                qi.k.e0(0, 0, i10, p0Var.f13115a, this.f13115a);
                qi.k.i0(p0Var.f13116b, 0, this.f13116b, 0, i10 << 1);
                this.f13117c = i10;
            }
        }
    }
}
