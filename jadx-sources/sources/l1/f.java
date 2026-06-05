package l1;

import f1.o1;
import fj.l;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import qi.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends qi.f implements Collection, gj.b {
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public c f9859a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f9860b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f9861c;

    /* renamed from: d, reason: collision with root package name */
    public int f9862d;

    /* renamed from: e, reason: collision with root package name */
    public o1.b f9863e = new o1.b();

    /* renamed from: f, reason: collision with root package name */
    public Object[] f9864f;

    /* renamed from: z, reason: collision with root package name */
    public Object[] f9865z;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f9859a = cVar;
        this.f9860b = objArr;
        this.f9861c = objArr2;
        this.f9862d = i10;
        this.f9864f = objArr;
        this.f9865z = objArr2;
        this.A = cVar.b();
    }

    public static void w(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final void A(Object obj, Object[] objArr, int i10) {
        int iX = X();
        Object[] objArrD = D(this.f9865z);
        if (iX < 32) {
            k.i0(this.f9865z, i10 + 1, objArrD, i10, iX);
            objArrD[i10] = obj;
            this.f9864f = objArr;
            this.f9865z = objArrD;
            this.A++;
            return;
        }
        Object[] objArr2 = this.f9865z;
        Object obj2 = objArr2[31];
        k.i0(objArr2, i10 + 1, objArrD, i10, 31);
        objArrD[i10] = obj;
        M(objArr, objArrD, G(obj2));
    }

    public final boolean B(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f9863e;
    }

    public final a C(int i10) {
        Object[] objArr = this.f9864f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iU = U() >> 5;
        cg.b.k(i10, iU);
        int i11 = this.f9862d;
        return i11 == 0 ? new d(objArr, i10) : new j(objArr, i10, iU, i11 / 5);
    }

    public final Object[] D(Object[] objArr) {
        if (objArr == null) {
            return F();
        }
        if (B(objArr)) {
            return objArr;
        }
        Object[] objArrF = F();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        k.k0(objArr, 0, objArrF, length, 6);
        return objArrF;
    }

    public final Object[] E(int i10, Object[] objArr) {
        if (B(objArr)) {
            k.i0(objArr, i10, objArr, 0, 32 - i10);
            return objArr;
        }
        Object[] objArrF = F();
        k.i0(objArr, i10, objArrF, 0, 32 - i10);
        return objArrF;
    }

    public final Object[] F() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f9863e;
        return objArr;
    }

    public final Object[] G(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f9863e;
        return objArr;
    }

    public final Object[] H(Object[] objArr, int i10, int i11) {
        if (i11 < 0) {
            o1.a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iF = wd.a.F(i10, i11);
        Object obj = objArr[iF];
        l.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objH = H((Object[]) obj, i10, i11 - 5);
        if (iF < 31) {
            int i12 = iF + 1;
            if (objArr[i12] != null) {
                if (B(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] objArrF = F();
                k.i0(objArr, 0, objArrF, 0, i12);
                objArr = objArrF;
            }
        }
        if (objH == objArr[iF]) {
            return objArr;
        }
        Object[] objArrD = D(objArr);
        objArrD[iF] = objH;
        return objArrD;
    }

    public final Object[] I(Object[] objArr, int i10, int i11, gf.f fVar) {
        Object[] objArrI;
        int iF = wd.a.F(i11 - 1, i10);
        if (i10 == 5) {
            fVar.f7406a = objArr[iF];
            objArrI = null;
        } else {
            Object obj = objArr[iF];
            l.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrI = I((Object[]) obj, i10 - 5, i11, fVar);
        }
        if (objArrI == null && iF == 0) {
            return null;
        }
        Object[] objArrD = D(objArr);
        objArrD[iF] = objArrI;
        return objArrD;
    }

    public final void J(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f9864f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f9865z = objArr;
            this.A = i10;
            this.f9862d = i11;
            return;
        }
        gf.f fVar = new gf.f(null);
        l.c(objArr);
        Object[] objArrI = I(objArr, i11, i10, fVar);
        l.c(objArrI);
        Object obj = fVar.f7406a;
        l.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f9865z = (Object[]) obj;
        this.A = i10;
        if (objArrI[1] == null) {
            this.f9864f = (Object[]) objArrI[0];
            this.f9862d = i11 - 5;
        } else {
            this.f9864f = objArrI;
            this.f9862d = i11;
        }
    }

    public final Object[] K(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            o1.a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            o1.a("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrD = D(objArr);
        int iF = wd.a.F(i10, i11);
        int i12 = i11 - 5;
        objArrD[iF] = K((Object[]) objArrD[iF], i10, i12, it);
        while (true) {
            iF++;
            if (iF >= 32 || !it.hasNext()) {
                break;
            }
            objArrD[iF] = K((Object[]) objArrD[iF], 0, i12, it);
        }
        return objArrD;
    }

    public final Object[] L(Object[] objArr, int i10, Object[][] objArr2) {
        fj.b bVar = new fj.b(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f9862d;
        Object[] objArrK = i11 < (1 << i12) ? K(objArr, i10, i12, bVar) : D(objArr);
        while (bVar.hasNext()) {
            this.f9862d += 5;
            objArrK = G(objArrK);
            int i13 = this.f9862d;
            K(objArrK, 1 << i13, i13, bVar);
        }
        return objArrK;
    }

    public final void M(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.A;
        int i11 = i10 >> 5;
        int i12 = this.f9862d;
        if (i11 > (1 << i12)) {
            this.f9864f = N(this.f9862d + 5, G(objArr), objArr2);
            this.f9865z = objArr3;
            this.f9862d += 5;
            this.A++;
            return;
        }
        if (objArr == null) {
            this.f9864f = objArr2;
            this.f9865z = objArr3;
            this.A = i10 + 1;
        } else {
            this.f9864f = N(i12, objArr, objArr2);
            this.f9865z = objArr3;
            this.A++;
        }
    }

    public final Object[] N(int i10, Object[] objArr, Object[] objArr2) {
        int iF = wd.a.F(b() - 1, i10);
        Object[] objArrD = D(objArr);
        if (i10 == 5) {
            objArrD[iF] = objArr2;
            return objArrD;
        }
        objArrD[iF] = N(i10 - 5, (Object[]) objArrD[iF], objArr2);
        return objArrD;
    }

    public final int O(ej.c cVar, Object[] objArr, int i10, int i11, gf.f fVar, ArrayList arrayList, ArrayList arrayList2) {
        if (B(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = fVar.f7406a;
        l.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrF = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) cVar.invoke(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrF = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : F();
                    i11 = 0;
                }
                objArrF[i11] = obj2;
                i11++;
            }
        }
        fVar.f7406a = objArrF;
        if (objArr2 != objArrF) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int P(ej.c cVar, Object[] objArr, int i10, gf.f fVar) {
        Object[] objArrD = objArr;
        int i11 = i10;
        boolean z2 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                if (!z2) {
                    objArrD = D(objArr);
                    z2 = true;
                    i11 = i12;
                }
            } else if (z2) {
                objArrD[i11] = obj;
                i11++;
            }
        }
        fVar.f7406a = objArrD;
        return i11;
    }

    public final int Q(ej.c cVar, int i10, gf.f fVar) {
        int iP = P(cVar, this.f9865z, i10, fVar);
        if (iP == i10) {
            return i10;
        }
        Object obj = fVar.f7406a;
        l.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iP, i10, (Object) null);
        this.f9865z = objArr;
        this.A -= i10 - iP;
        return iP;
    }

    public final boolean R(ej.c cVar) {
        Object[] objArrK;
        int i10;
        ej.c cVar2 = cVar;
        int iX = X();
        Object[] objArrH = null;
        gf.f fVar = new gf.f(null);
        boolean z2 = false;
        if (this.f9864f != null) {
            a aVarC = C(0);
            int iP = 32;
            while (iP == 32 && aVarC.hasNext()) {
                iP = P(cVar2, (Object[]) aVarC.next(), 32, fVar);
            }
            if (iP == 32) {
                int iQ = Q(cVar2, iX, fVar);
                if (iQ == 0) {
                    J(this.f9864f, this.A, this.f9862d);
                }
                if (iQ != iX) {
                }
            } else {
                int i11 = (aVarC.f9849a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iO = iP;
                while (aVarC.hasNext()) {
                    iO = O(cVar2, (Object[]) aVarC.next(), 32, iO, fVar, arrayList2, arrayList);
                    cVar2 = cVar;
                }
                int iO2 = O(cVar, this.f9865z, iX, iO, fVar, arrayList2, arrayList);
                Object obj = fVar.f7406a;
                l.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iO2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrK = this.f9864f;
                    l.c(objArrK);
                } else {
                    objArrK = K(this.f9864f, i11, this.f9862d, arrayList.iterator());
                }
                int size = i11 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    o1.a("invalid size");
                }
                if (size == 0) {
                    this.f9862d = 0;
                } else {
                    int i12 = size - 1;
                    while (true) {
                        i10 = this.f9862d;
                        if ((i12 >> i10) != 0) {
                            break;
                        }
                        this.f9862d = i10 - 5;
                        Object[] objArr2 = objArrK[0];
                        l.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrK = objArr2;
                    }
                    objArrH = H(objArrK, i12, i10);
                }
                this.f9864f = objArrH;
                this.f9865z = objArr;
                this.A = size + iO2;
            }
            z2 = true;
        } else if (Q(cVar2, iX, fVar) != iX) {
            z2 = true;
        }
        if (z2) {
            ((AbstractList) this).modCount++;
        }
        return z2;
    }

    public final Object[] S(Object[] objArr, int i10, int i11, gf.f fVar) {
        int iF = wd.a.F(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iF];
            Object[] objArrD = D(objArr);
            k.i0(objArr, iF, objArrD, iF + 1, 32);
            objArrD[31] = fVar.f7406a;
            fVar.f7406a = obj;
            return objArrD;
        }
        int iF2 = objArr[31] == null ? wd.a.F(U() - 1, i10) : 31;
        Object[] objArrD2 = D(objArr);
        int i12 = i10 - 5;
        int i13 = iF + 1;
        if (i13 <= iF2) {
            while (true) {
                Object obj2 = objArrD2[iF2];
                l.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrD2[iF2] = S((Object[]) obj2, i12, 0, fVar);
                if (iF2 == i13) {
                    break;
                }
                iF2--;
            }
        }
        Object obj3 = objArrD2[iF];
        l.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrD2[iF] = S((Object[]) obj3, i12, i11, fVar);
        return objArrD2;
    }

    public final Object T(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.A - i10;
        if (i13 == 1) {
            Object obj = this.f9865z[0];
            J(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f9865z;
        Object obj2 = objArr2[i12];
        Object[] objArrD = D(objArr2);
        k.i0(objArr2, i12, objArrD, i12 + 1, i13);
        objArrD[i13 - 1] = null;
        this.f9864f = objArr;
        this.f9865z = objArrD;
        this.A = (i10 + i13) - 1;
        this.f9862d = i11;
        return obj2;
    }

    public final int U() {
        int i10 = this.A;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    public final Object[] V(Object[] objArr, int i10, int i11, Object obj, gf.f fVar) {
        int iF = wd.a.F(i11, i10);
        Object[] objArrD = D(objArr);
        if (i10 != 0) {
            Object obj2 = objArrD[iF];
            l.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrD[iF] = V((Object[]) obj2, i10 - 5, i11, obj, fVar);
            return objArrD;
        }
        if (objArrD != objArr) {
            ((AbstractList) this).modCount++;
        }
        fVar.f7406a = objArrD[iF];
        objArrD[iF] = obj;
        return objArrD;
    }

    public final void W(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrF;
        if (i12 < 1) {
            o1.a("requires at least one nullBuffer");
        }
        Object[] objArrD = D(objArr);
        objArr2[0] = objArrD;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            k.i0(objArrD, size + 1, objArr3, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrF = objArrD;
            } else {
                objArrF = F();
                i12--;
                objArr2[i12] = objArrF;
            }
            int i16 = i11 - i15;
            k.i0(objArrD, 0, objArr3, i16, i11);
            k.i0(objArrD, size + 1, objArrF, i13, i16);
            objArr3 = objArrF;
        }
        Iterator it = collection.iterator();
        w(objArrD, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrF2 = F();
            w(objArrF2, 0, it);
            objArr2[i17] = objArrF2;
        }
        w(objArr3, 0, it);
    }

    public final int X() {
        int i10 = this.A;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        cg.b.k(i10, b());
        if (i10 == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iU = U();
        if (i10 >= iU) {
            A(obj, this.f9864f, i10 - iU);
            return;
        }
        gf.f fVar = new gf.f(null);
        Object[] objArr = this.f9864f;
        l.c(objArr);
        A(fVar.f7406a, z(objArr, this.f9862d, i10, obj, fVar), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] objArrF;
        cg.b.k(i10, this.A);
        if (i10 == this.A) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.A - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f9865z;
            Object[] objArrD = D(objArr);
            k.i0(objArr, size2 + 1, objArrD, i12, X());
            w(objArrD, i12, collection.iterator());
            this.f9865z = objArrD;
            this.A = collection.size() + this.A;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iX = X();
        int size3 = collection.size() + this.A;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= U()) {
            objArrF = F();
            collection2 = collection;
            W(collection2, i10, this.f9865z, iX, objArr2, size, objArrF);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > iX) {
                int i13 = size3 - iX;
                Object[] objArrE = E(i13, fVar.f9865z);
                fVar.y(collection2, i10, i13, objArr2, size, objArrE);
                objArr2 = objArr2;
                objArrF = objArrE;
            } else {
                Object[] objArr3 = fVar.f9865z;
                objArrF = F();
                int i14 = iX - size3;
                k.i0(objArr3, 0, objArrF, i14, iX);
                int i15 = 32 - i14;
                Object[] objArrE2 = E(i15, fVar.f9865z);
                int i16 = size - 1;
                objArr2[i16] = objArrE2;
                fVar.y(collection2, i10, i15, objArr2, i16, objArrE2);
                collection2 = collection2;
            }
        }
        fVar.f9864f = L(fVar.f9864f, i11, objArr2);
        fVar.f9865z = objArrF;
        fVar.A = collection2.size() + fVar.A;
        return true;
    }

    @Override // qi.f
    public final int b() {
        return this.A;
    }

    @Override // qi.f
    public final Object e(int i10) {
        cg.b.j(i10, b());
        ((AbstractList) this).modCount++;
        int iU = U();
        if (i10 >= iU) {
            return T(this.f9864f, iU, this.f9862d, i10 - iU);
        }
        gf.f fVar = new gf.f(this.f9865z[0]);
        Object[] objArr = this.f9864f;
        l.c(objArr);
        T(S(objArr, this.f9862d, i10, fVar), iU, this.f9862d, 0);
        return fVar.f7406a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        cg.b.j(i10, b());
        if (U() <= i10) {
            objArr = this.f9865z;
        } else {
            objArr = this.f9864f;
            l.c(objArr);
            for (int i11 = this.f9862d; i11 > 0; i11 -= 5) {
                Object obj = objArr[wd.a.F(i10, i11)];
                l.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    public final c i() {
        c eVar;
        Object[] objArr = this.f9864f;
        if (objArr == this.f9860b && this.f9865z == this.f9861c) {
            eVar = this.f9859a;
        } else {
            this.f9863e = new o1.b();
            this.f9860b = objArr;
            Object[] objArr2 = this.f9865z;
            this.f9861c = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.A, this.f9862d);
            } else if (objArr2.length == 0) {
                eVar = i.f9872b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.A);
                l.e(objArrCopyOf, "copyOf(...)");
                eVar = new i(objArrCopyOf);
            }
        }
        this.f9859a = eVar;
        return eVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        cg.b.k(i10, this.A);
        return new h(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return R(new b(1, collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        cg.b.j(i10, b());
        if (U() > i10) {
            gf.f fVar = new gf.f(null);
            Object[] objArr = this.f9864f;
            l.c(objArr);
            this.f9864f = V(objArr, this.f9862d, i10, obj, fVar);
            return fVar.f7406a;
        }
        Object[] objArrD = D(this.f9865z);
        if (objArrD != this.f9865z) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrD[i11];
        objArrD[i11] = obj;
        this.f9865z = objArrD;
        return obj2;
    }

    public final int x() {
        return ((AbstractList) this).modCount;
    }

    public final void y(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f9864f == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        a aVarC = C(U() >> 5);
        int i14 = i12;
        Object[] objArrE = objArr2;
        while (aVarC.f9849a - 1 != i13) {
            Object[] objArr3 = (Object[]) aVarC.previous();
            k.i0(objArr3, 0, objArrE, 32 - i11, 32);
            objArrE = E(i11, objArr3);
            i14--;
            objArr[i14] = objArrE;
        }
        Object[] objArr4 = (Object[]) aVarC.previous();
        int iU = i12 - (((U() >> 5) - 1) - i13);
        if (iU < i12) {
            objArr2 = objArr[iU];
            l.c(objArr2);
        }
        W(collection, i10, objArr4, 32, objArr, iU, objArr2);
    }

    public final Object[] z(Object[] objArr, int i10, int i11, Object obj, gf.f fVar) {
        Object obj2;
        int iF = wd.a.F(i11, i10);
        if (i10 == 0) {
            fVar.f7406a = objArr[31];
            Object[] objArrD = D(objArr);
            k.i0(objArr, iF + 1, objArrD, iF, 31);
            objArrD[iF] = obj;
            return objArrD;
        }
        Object[] objArrD2 = D(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrD2[iF];
        l.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrD2[iF] = z((Object[]) obj3, i12, i11, obj, fVar);
        while (true) {
            iF++;
            if (iF >= 32 || (obj2 = objArrD2[iF]) == null) {
                break;
            }
            objArrD2[iF] = z((Object[]) obj2, i12, 0, fVar.f7406a, fVar);
        }
        return objArrD2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iX = X();
        if (iX < 32) {
            Object[] objArrD = D(this.f9865z);
            objArrD[iX] = obj;
            this.f9865z = objArrD;
            this.A = b() + 1;
        } else {
            M(this.f9864f, this.f9865z, G(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iX = X();
        Iterator it = collection.iterator();
        if (32 - iX >= collection.size()) {
            Object[] objArrD = D(this.f9865z);
            w(objArrD, iX, it);
            this.f9865z = objArrD;
            this.A = collection.size() + this.A;
            return true;
        }
        int size = ((collection.size() + iX) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrD2 = D(this.f9865z);
        w(objArrD2, iX, it);
        objArr[0] = objArrD2;
        for (int i10 = 1; i10 < size; i10++) {
            Object[] objArrF = F();
            w(objArrF, 0, it);
            objArr[i10] = objArrF;
        }
        this.f9864f = L(this.f9864f, U(), objArr);
        Object[] objArrF2 = F();
        w(objArrF2, 0, it);
        this.f9865z = objArrF2;
        this.A = collection.size() + this.A;
        return true;
    }
}
