package l1;

import f1.o1;
import fj.l;
import java.util.Arrays;
import java.util.ListIterator;
import qi.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9855a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f9856b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9857c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9858d;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f9855a = objArr;
        this.f9856b = objArr2;
        this.f9857c = i10;
        this.f9858d = i11;
        if (!(b() > 32)) {
            o1.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] B(Object[] objArr, int i10, int i11, Object obj, gf.f fVar) {
        Object[] objArrCopyOf;
        int iF = wd.a.F(i11, i10);
        if (i10 == 0) {
            if (iF == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                l.e(objArrCopyOf, "copyOf(...)");
            }
            k.i0(objArr, iF + 1, objArrCopyOf, iF, 31);
            fVar.f7406a = objArr[31];
            objArrCopyOf[iF] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        l.e(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iF];
        l.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iF] = B((Object[]) obj2, i12, i11, obj, fVar);
        while (true) {
            iF++;
            if (iF >= 32 || objArrCopyOf2[iF] == null) {
                break;
            }
            Object obj3 = objArr[iF];
            l.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iF] = B((Object[]) obj3, i12, 0, fVar.f7406a, fVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] D(Object[] objArr, int i10, int i11, gf.f fVar) {
        Object[] objArrD;
        int iF = wd.a.F(i11, i10);
        if (i10 == 5) {
            fVar.f7406a = objArr[iF];
            objArrD = null;
        } else {
            Object obj = objArr[iF];
            l.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrD = D((Object[]) obj, i10 - 5, i11, fVar);
        }
        if (objArrD == null && iF == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        l.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iF] = objArrD;
        return objArrCopyOf;
    }

    public static Object[] J(int i10, int i11, Object obj, Object[] objArr) {
        int iF = wd.a.F(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        l.e(objArrCopyOf, "copyOf(...)");
        if (i10 == 0) {
            objArrCopyOf[iF] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iF];
        l.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iF] = J(i10 - 5, i11, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // l1.c
    public final c A(int i10, Object obj) {
        int i11 = this.f9857c;
        cg.b.j(i10, i11);
        int I = I();
        Object[] objArr = this.f9855a;
        Object[] objArr2 = this.f9856b;
        int i12 = this.f9858d;
        if (I > i10) {
            return new e(J(i12, i10, obj, objArr), objArr2, i11, i12);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 & 31] = obj;
        return new e(objArr, objArrCopyOf, i11, i12);
    }

    public final e C(Object obj, Object[] objArr, int i10) {
        int I = I();
        int i11 = this.f9857c;
        int i12 = i11 - I;
        Object[] objArr2 = this.f9856b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.e(objArrCopyOf, "copyOf(...)");
        if (i12 < 32) {
            k.i0(objArr2, i10 + 1, objArrCopyOf, i10, i12);
            objArrCopyOf[i10] = obj;
            return new e(objArr, objArrCopyOf, i11 + 1, this.f9858d);
        }
        Object obj2 = objArr2[31];
        k.i0(objArr2, i10 + 1, objArrCopyOf, i10, i12 - 1);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return E(objArr, objArrCopyOf, objArr3);
    }

    public final e E(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f9857c;
        int i11 = i10 >> 5;
        int i12 = this.f9858d;
        if (i11 <= (1 << i12)) {
            return new e(F(i12, objArr, objArr2), objArr3, i10 + 1, i12);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i13 = i12 + 5;
        return new e(F(i13, objArr4, objArr2), objArr3, i10 + 1, i13);
    }

    public final Object[] F(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iF = wd.a.F(b() - 1, i10);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            l.e(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[iF] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iF] = F(i10 - 5, (Object[]) objArrCopyOf[iF], objArr2);
        return objArrCopyOf;
    }

    public final Object[] G(Object[] objArr, int i10, int i11, gf.f fVar) {
        Object[] objArrCopyOf;
        int iF = wd.a.F(i11, i10);
        if (i10 == 0) {
            if (iF == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                l.e(objArrCopyOf, "copyOf(...)");
            }
            k.i0(objArr, iF, objArrCopyOf, iF + 1, 32);
            objArrCopyOf[31] = fVar.f7406a;
            fVar.f7406a = objArr[iF];
            return objArrCopyOf;
        }
        int iF2 = objArr[31] == null ? wd.a.F(I() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        l.e(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        int i13 = iF + 1;
        if (i13 <= iF2) {
            while (true) {
                Object obj = objArrCopyOf2[iF2];
                l.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iF2] = G((Object[]) obj, i12, 0, fVar);
                if (iF2 == i13) {
                    break;
                }
                iF2--;
            }
        }
        Object obj2 = objArrCopyOf2[iF];
        l.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iF] = G((Object[]) obj2, i12, i11, fVar);
        return objArrCopyOf2;
    }

    public final c H(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f9857c - i10;
        if (i13 != 1) {
            Object[] objArr2 = this.f9856b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            l.e(objArrCopyOf, "copyOf(...)");
            int i14 = i13 - 1;
            if (i12 < i14) {
                k.i0(objArr2, i12, objArrCopyOf, i12 + 1, i13);
            }
            objArrCopyOf[i14] = null;
            return new e(objArr, objArrCopyOf, (i10 + i13) - 1, i11);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                l.e(objArr, "copyOf(...)");
            }
            return new i(objArr);
        }
        gf.f fVar = new gf.f(null);
        Object[] objArrD = D(objArr, i11, i10 - 1, fVar);
        l.c(objArrD);
        Object obj = fVar.f7406a;
        l.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrD[1] != null) {
            return new e(objArrD, objArr3, i10, i11);
        }
        Object obj2 = objArrD[0];
        l.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj2, objArr3, i10, i11 - 5);
    }

    public final int I() {
        return (this.f9857c - 1) & (-32);
    }

    @Override // qi.a
    public final int b() {
        return this.f9857c;
    }

    @Override // l1.c
    public final c e(int i10, Object obj) {
        int i11 = this.f9857c;
        cg.b.k(i10, i11);
        if (i10 == i11) {
            return i(obj);
        }
        int I = I();
        Object[] objArr = this.f9855a;
        if (i10 >= I) {
            return C(obj, objArr, i10 - I);
        }
        gf.f fVar = new gf.f(null);
        return C(fVar.f7406a, B(objArr, this.f9858d, i10, obj, fVar), 0);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        cg.b.j(i10, b());
        if (I() <= i10) {
            objArr = this.f9856b;
        } else {
            objArr = this.f9855a;
            for (int i11 = this.f9858d; i11 > 0; i11 -= 5) {
                Object obj = objArr[wd.a.F(i10, i11)];
                l.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // l1.c
    public final c i(Object obj) {
        int I = I();
        int i10 = this.f9857c;
        int i11 = i10 - I;
        Object[] objArr = this.f9855a;
        Object[] objArr2 = this.f9856b;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return E(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i11] = obj;
        return new e(objArr, objArrCopyOf, i10 + 1, this.f9858d);
    }

    @Override // qi.d, java.util.List
    public final ListIterator listIterator(int i10) {
        cg.b.k(i10, this.f9857c);
        return new g(this.f9855a, i10, this.f9856b, this.f9857c, (this.f9858d / 5) + 1);
    }

    @Override // l1.c
    public final f x() {
        return new f(this, this.f9855a, this.f9856b, this.f9858d);
    }

    @Override // l1.c
    public final c y(b bVar) {
        f fVar = new f(this, this.f9855a, this.f9856b, this.f9858d);
        fVar.R(bVar);
        return fVar.i();
    }

    @Override // l1.c
    public final c z(int i10) {
        cg.b.j(i10, this.f9857c);
        int I = I();
        Object[] objArr = this.f9855a;
        int i11 = this.f9858d;
        return i10 >= I ? H(objArr, I, i11, i10 - I) : H(G(objArr, i11, i10, new gf.f(this.f9856b[0])), I, i11, 0);
    }
}
