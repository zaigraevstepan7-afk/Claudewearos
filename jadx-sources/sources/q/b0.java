package q;

import c2.x0;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f13033a;

    /* renamed from: b, reason: collision with root package name */
    public int f13034b;

    /* renamed from: c, reason: collision with root package name */
    public g1.b f13035c;

    public b0(int i10) {
        this.f13033a = i10 == 0 ? l0.f13103a : new Object[i10];
    }

    public final void a(Object obj) {
        int i10 = this.f13034b + 1;
        Object[] objArr = this.f13033a;
        if (objArr.length < i10) {
            m(i10, objArr);
        }
        Object[] objArr2 = this.f13033a;
        int i11 = this.f13034b;
        objArr2[i11] = obj;
        this.f13034b = i11 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i10 = this.f13034b;
        int size = list.size() + i10;
        Object[] objArr = this.f13033a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.f13033a;
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = list.get(i11);
        }
        this.f13034b = list.size() + this.f13034b;
    }

    public final void c(b0 b0Var) {
        fj.l.f(b0Var, "elements");
        if (b0Var.h()) {
            return;
        }
        int i10 = this.f13034b + b0Var.f13034b;
        Object[] objArr = this.f13033a;
        if (objArr.length < i10) {
            m(i10, objArr);
        }
        qi.k.i0(b0Var.f13033a, this.f13034b, this.f13033a, 0, b0Var.f13034b);
        this.f13034b += b0Var.f13034b;
    }

    public final void d() {
        qi.k.m0(0, this.f13034b, null, this.f13033a);
        this.f13034b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.f13033a[0];
        }
        r.a.e("ObjectList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            int i10 = b0Var.f13034b;
            int i11 = this.f13034b;
            if (i10 == i11) {
                Object[] objArr = this.f13033a;
                Object[] objArr2 = b0Var.f13033a;
                kj.h hVarT = cg.b.T(0, i11);
                int i12 = hVarT.f9665a;
                int i13 = hVarT.f9666b;
                if (i12 > i13) {
                    return true;
                }
                while (fj.l.b(objArr[i12], objArr2[i12])) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f(int i10) {
        if (i10 >= 0 && i10 < this.f13034b) {
            return this.f13033a[i10];
        }
        o(i10);
        throw null;
    }

    public final int g(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f13033a;
            int i11 = this.f13034b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f13033a;
        int i12 = this.f13034b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean h() {
        return this.f13034b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f13033a;
        int i10 = this.f13034b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i() {
        return this.f13034b != 0;
    }

    public final boolean j(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        k(iG);
        return true;
    }

    public final Object k(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f13034b)) {
            o(i10);
            throw null;
        }
        Object[] objArr = this.f13033a;
        Object obj = objArr[i10];
        if (i10 != i11 - 1) {
            qi.k.i0(objArr, i10, objArr, i10 + 1, i11);
        }
        int i12 = this.f13034b - 1;
        this.f13034b = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void l(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f13034b) || i11 < 0 || i11 > i12) {
            StringBuilder sbQ = gk.b.q("Start (", i10, ") and end (", i11, ") must be in 0..");
            sbQ.append(this.f13034b);
            r.a.d(sbQ.toString());
            throw null;
        }
        if (i11 < i10) {
            r.a.c("Start (" + i10 + ") is more than end (" + i11 + ')');
            throw null;
        }
        if (i11 != i10) {
            if (i11 < i12) {
                Object[] objArr = this.f13033a;
                qi.k.i0(objArr, i10, objArr, i11, i12);
            }
            int i13 = this.f13034b;
            int i14 = i13 - (i11 - i10);
            qi.k.m0(i14, i13, null, this.f13033a);
            this.f13034b = i14;
        }
    }

    public final void m(int i10, Object[] objArr) {
        fj.l.f(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, (length * 3) / 2)];
        qi.k.i0(objArr, 0, objArr2, 0, length);
        this.f13033a = objArr2;
    }

    public final Object n(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f13034b) {
            o(i10);
            throw null;
        }
        Object[] objArr = this.f13033a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final void o(int i10) {
        StringBuilder sbP = gk.b.p(i10, "Index ", " must be in 0..");
        sbP.append(this.f13034b - 1);
        r.a.d(sbP.toString());
        throw null;
    }

    public final String toString() {
        x0 x0Var = new x0(this, 9);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f13033a;
        int i10 = this.f13034b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) x0Var.invoke(obj));
            i11++;
        }
        String string = sb2.toString();
        fj.l.e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ b0() {
        this(16);
    }
}
