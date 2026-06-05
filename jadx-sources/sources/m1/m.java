package m1;

import f1.o1;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final m f11248e = new m(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f11249a;

    /* renamed from: b, reason: collision with root package name */
    public int f11250b;

    /* renamed from: c, reason: collision with root package name */
    public final o1.b f11251c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f11252d;

    public m(int i10, int i11, Object[] objArr, o1.b bVar) {
        this.f11249a = i10;
        this.f11250b = i11;
        this.f11251c = bVar;
        this.f11252d = objArr;
    }

    public static m j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, o1.b bVar) {
        if (i12 > 30) {
            return new m(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iF = uk.c.F(i10, i12);
        int iF2 = uk.c.F(i11, i12);
        if (iF != iF2) {
            return new m((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new m(0, 1 << iF, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i10, int i11, int i12, Object obj, Object obj2, int i13, o1.b bVar) {
        Object obj3 = this.f11252d[i10];
        m mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i10), i12, obj, obj2, i13 + 5, bVar);
        int iT = t(i11);
        int i14 = iT + 1;
        Object[] objArr = this.f11252d;
        Object[] objArr2 = new Object[objArr.length - 1];
        qi.k.k0(objArr, 0, objArr2, i10, 6);
        qi.k.i0(objArr, i10, objArr2, i10 + 2, i14);
        objArr2[iT - 1] = mVarJ;
        qi.k.i0(objArr, iT, objArr2, i14, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f11250b == 0) {
            return this.f11252d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f11249a);
        int length = this.f11252d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += s(i10).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        kj.f fVarO = cg.b.O(cg.b.T(0, this.f11252d.length));
        int i10 = fVarO.f9665a;
        int i11 = fVarO.f9666b;
        int i12 = fVarO.f9667c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!fj.l.b(obj, this.f11252d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i10, int i11, Object obj) {
        int iF = 1 << uk.c.F(i10, i11);
        if (h(iF)) {
            return fj.l.b(obj, this.f11252d[f(iF)]);
        }
        if (!i(iF)) {
            return false;
        }
        m mVarS = s(t(iF));
        return i11 == 30 ? mVarS.c(obj) : mVarS.d(i10, i11 + 5, obj);
    }

    public final boolean e(m mVar) {
        if (this == mVar) {
            return true;
        }
        if (this.f11250b == mVar.f11250b && this.f11249a == mVar.f11249a) {
            int length = this.f11252d.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f11252d[i10] == mVar.f11252d[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f11249a) * 2;
    }

    public final Object g(int i10, int i11, Object obj) {
        int iF = 1 << uk.c.F(i10, i11);
        if (h(iF)) {
            int iF2 = f(iF);
            if (fj.l.b(obj, this.f11252d[iF2])) {
                return x(iF2);
            }
            return null;
        }
        if (!i(iF)) {
            return null;
        }
        m mVarS = s(t(iF));
        if (i11 != 30) {
            return mVarS.g(i10, i11 + 5, obj);
        }
        kj.f fVarO = cg.b.O(cg.b.T(0, mVarS.f11252d.length));
        int i12 = fVarO.f9665a;
        int i13 = fVarO.f9666b;
        int i14 = fVarO.f9667c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return null;
        }
        while (!fj.l.b(obj, mVarS.f11252d[i12])) {
            if (i12 == i13) {
                return null;
            }
            i12 += i14;
        }
        return mVarS.x(i12);
    }

    public final boolean h(int i10) {
        return (i10 & this.f11249a) != 0;
    }

    public final boolean i(int i10) {
        return (i10 & this.f11250b) != 0;
    }

    public final m k(int i10, e eVar) {
        eVar.b(eVar.f11236f - 1);
        eVar.f11234d = x(i10);
        Object[] objArr = this.f11252d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f11251c != eVar.f11232b) {
            return new m(0, 0, uk.c.j(i10, objArr), eVar.f11232b);
        }
        this.f11252d = uk.c.j(i10, objArr);
        return this;
    }

    public final m l(int i10, Object obj, Object obj2, int i11, e eVar) {
        e eVar2;
        m mVarL;
        int iF = 1 << uk.c.F(i10, i11);
        boolean zH = h(iF);
        o1.b bVar = this.f11251c;
        if (zH) {
            int iF2 = f(iF);
            if (!fj.l.b(obj, this.f11252d[iF2])) {
                eVar.b(eVar.f11236f + 1);
                o1.b bVar2 = eVar.f11232b;
                if (bVar != bVar2) {
                    return new m(this.f11249a ^ iF, this.f11250b | iF, a(iF2, iF, i10, obj, obj2, i11, bVar2), bVar2);
                }
                this.f11252d = a(iF2, iF, i10, obj, obj2, i11, bVar2);
                this.f11249a ^= iF;
                this.f11250b |= iF;
                return this;
            }
            eVar.f11234d = x(iF2);
            if (x(iF2) == obj2) {
                return this;
            }
            if (bVar == eVar.f11232b) {
                this.f11252d[iF2 + 1] = obj2;
                return this;
            }
            eVar.f11235e++;
            Object[] objArr = this.f11252d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            fj.l.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF2 + 1] = obj2;
            return new m(this.f11249a, this.f11250b, objArrCopyOf, eVar.f11232b);
        }
        if (!i(iF)) {
            eVar.b(eVar.f11236f + 1);
            o1.b bVar3 = eVar.f11232b;
            int iF3 = f(iF);
            if (bVar != bVar3) {
                return new m(this.f11249a | iF, this.f11250b, uk.c.i(this.f11252d, iF3, obj, obj2), bVar3);
            }
            this.f11252d = uk.c.i(this.f11252d, iF3, obj, obj2);
            this.f11249a |= iF;
            return this;
        }
        int iT = t(iF);
        m mVarS = s(iT);
        if (i11 == 30) {
            kj.f fVarO = cg.b.O(cg.b.T(0, mVarS.f11252d.length));
            int i12 = fVarO.f9665a;
            int i13 = fVarO.f9666b;
            int i14 = fVarO.f9667c;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                eVar.b(eVar.f11236f + 1);
                mVarL = new m(0, 0, uk.c.i(mVarS.f11252d, 0, obj, obj2), eVar.f11232b);
                eVar2 = eVar;
            } else {
                while (!fj.l.b(obj, mVarS.f11252d[i12])) {
                    if (i12 == i13) {
                        eVar.b(eVar.f11236f + 1);
                        mVarL = new m(0, 0, uk.c.i(mVarS.f11252d, 0, obj, obj2), eVar.f11232b);
                        break;
                    }
                    i12 += i14;
                }
                eVar.f11234d = mVarS.x(i12);
                if (mVarS.f11251c == eVar.f11232b) {
                    mVarS.f11252d[i12 + 1] = obj2;
                    mVarL = mVarS;
                } else {
                    eVar.f11235e++;
                    Object[] objArr2 = mVarS.f11252d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    fj.l.e(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[i12 + 1] = obj2;
                    mVarL = new m(0, 0, objArrCopyOf2, eVar.f11232b);
                }
                eVar2 = eVar;
            }
        } else {
            eVar2 = eVar;
            mVarL = mVarS.l(i10, obj, obj2, i11 + 5, eVar2);
        }
        return mVarS == mVarL ? this : r(iT, mVarL, eVar2.f11232b);
    }

    public final m m(m mVar, int i10, o1.a aVar, e eVar) {
        Object[] objArr;
        m mVarJ;
        if (this == mVar) {
            aVar.f12369a += b();
            return this;
        }
        int i11 = 0;
        if (i10 > 30) {
            o1.b bVar = eVar.f11232b;
            int i12 = mVar.f11250b;
            Object[] objArr2 = this.f11252d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + mVar.f11252d.length);
            fj.l.e(objArrCopyOf, "copyOf(...)");
            int length = this.f11252d.length;
            kj.f fVarO = cg.b.O(cg.b.T(0, mVar.f11252d.length));
            int i13 = fVarO.f9665a;
            int i14 = fVarO.f9666b;
            int i15 = fVarO.f9667c;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (c(mVar.f11252d[i13])) {
                        aVar.f12369a++;
                    } else {
                        Object[] objArr3 = mVar.f11252d;
                        objArrCopyOf[length] = objArr3[i13];
                        objArrCopyOf[length + 1] = objArr3[i13 + 1];
                        length += 2;
                    }
                    if (i13 == i14) {
                        break;
                    }
                    i13 += i15;
                }
            }
            if (length != this.f11252d.length) {
                if (length == mVar.f11252d.length) {
                    return mVar;
                }
                if (length == objArrCopyOf.length) {
                    return new m(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                fj.l.e(objArrCopyOf2, "copyOf(...)");
                return new m(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i16 = this.f11250b | mVar.f11250b;
            int i17 = this.f11249a;
            int i18 = mVar.f11249a;
            int i19 = (i17 ^ i18) & (~i16);
            int i20 = i17 & i18;
            int i21 = i19;
            while (i20 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i20);
                if (fj.l.b(this.f11252d[f(iLowestOneBit)], mVar.f11252d[mVar.f(iLowestOneBit)])) {
                    i21 |= iLowestOneBit;
                } else {
                    i16 |= iLowestOneBit;
                }
                i20 ^= iLowestOneBit;
            }
            if ((i16 & i21) != 0) {
                o1.b("Check failed.");
            }
            m mVar2 = (fj.l.b(this.f11251c, eVar.f11232b) && this.f11249a == i21 && this.f11250b == i16) ? this : new m(i21, i16, new Object[Integer.bitCount(i16) + (Integer.bitCount(i21) * 2)], null);
            int i22 = i16;
            int i23 = 0;
            while (i22 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i22);
                Object[] objArr4 = mVar2.f11252d;
                int length2 = (objArr4.length - 1) - i23;
                if (i(iLowestOneBit2)) {
                    mVarJ = s(t(iLowestOneBit2));
                    if (mVar.i(iLowestOneBit2)) {
                        mVarJ = mVarJ.m(mVar.s(mVar.t(iLowestOneBit2)), i10 + 5, aVar, eVar);
                        objArr = objArr4;
                    } else if (mVar.h(iLowestOneBit2)) {
                        int iF = mVar.f(iLowestOneBit2);
                        Object obj = mVar.f11252d[iF];
                        Object objX = mVar.x(iF);
                        int i24 = eVar.f11236f;
                        objArr = objArr4;
                        mVarJ = mVarJ.l(obj != null ? obj.hashCode() : i11, obj, objX, i10 + 5, eVar);
                        if (eVar.f11236f == i24) {
                            aVar.f12369a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (mVar.i(iLowestOneBit2)) {
                        m mVarS = mVar.s(mVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f11252d[iF2];
                            int i25 = i10 + 5;
                            if (mVarS.d(obj2 != null ? obj2.hashCode() : 0, i25, obj2)) {
                                aVar.f12369a++;
                                mVarJ = mVarS;
                            } else {
                                mVarJ = mVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i25, eVar);
                            }
                        } else {
                            mVarJ = mVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f11252d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = mVar.f(iLowestOneBit2);
                        Object obj4 = mVar.f11252d[iF4];
                        mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, mVar.x(iF4), i10 + 5, eVar.f11232b);
                    }
                }
                objArr[length2] = mVarJ;
                i23++;
                i22 ^= iLowestOneBit2;
                i11 = 0;
            }
            int i26 = 0;
            while (i21 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i21);
                int i27 = i26 * 2;
                if (mVar.h(iLowestOneBit3)) {
                    int iF5 = mVar.f(iLowestOneBit3);
                    Object[] objArr5 = mVar2.f11252d;
                    objArr5[i27] = mVar.f11252d[iF5];
                    objArr5[i27 + 1] = mVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f12369a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = mVar2.f11252d;
                    objArr6[i27] = this.f11252d[iF6];
                    objArr6[i27 + 1] = x(iF6);
                }
                i26++;
                i21 ^= iLowestOneBit3;
            }
            if (!e(mVar2)) {
                return mVar.e(mVar2) ? mVar : mVar2;
            }
        }
        return this;
    }

    public final m n(int i10, Object obj, int i11, e eVar) {
        m mVarN;
        int iF = 1 << uk.c.F(i10, i11);
        if (h(iF)) {
            int iF2 = f(iF);
            if (fj.l.b(obj, this.f11252d[iF2])) {
                return p(iF2, iF, eVar);
            }
        } else if (i(iF)) {
            int iT = t(iF);
            m mVarS = s(iT);
            if (i11 == 30) {
                kj.f fVarO = cg.b.O(cg.b.T(0, mVarS.f11252d.length));
                int i12 = fVarO.f9665a;
                int i13 = fVarO.f9666b;
                int i14 = fVarO.f9667c;
                if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                    mVarN = mVarS;
                    break;
                }
                while (!fj.l.b(obj, mVarS.f11252d[i12])) {
                    if (i12 == i13) {
                        mVarN = mVarS;
                        break;
                    }
                    i12 += i14;
                }
                mVarN = mVarS.k(i12, eVar);
            } else {
                mVarN = mVarS.n(i10, obj, i11 + 5, eVar);
            }
            return q(mVarS, mVarN, iT, iF, eVar.f11232b);
        }
        return this;
    }

    public final m o(int i10, Object obj, Object obj2, int i11, e eVar) {
        m mVar;
        m mVarO;
        int iF = 1 << uk.c.F(i10, i11);
        if (h(iF)) {
            int iF2 = f(iF);
            if (fj.l.b(obj, this.f11252d[iF2]) && fj.l.b(obj2, x(iF2))) {
                return p(iF2, iF, eVar);
            }
        } else if (i(iF)) {
            int iT = t(iF);
            m mVarS = s(iT);
            if (i11 == 30) {
                kj.f fVarO = cg.b.O(cg.b.T(0, mVarS.f11252d.length));
                int i12 = fVarO.f9665a;
                int i13 = fVarO.f9666b;
                int i14 = fVarO.f9667c;
                if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                    mVarO = mVarS;
                    mVar = mVarS;
                } else {
                    while (true) {
                        if (!fj.l.b(obj, mVarS.f11252d[i12]) || !fj.l.b(obj2, mVarS.x(i12))) {
                            if (i12 == i13) {
                                break;
                            }
                            i12 += i14;
                        } else {
                            mVarO = mVarS.k(i12, eVar);
                            break;
                        }
                    }
                    mVarO = mVarS;
                    mVar = mVarS;
                }
            } else {
                mVar = mVarS;
                mVarO = mVar.o(i10, obj, obj2, i11 + 5, eVar);
            }
            return q(mVar, mVarO, iT, iF, eVar.f11232b);
        }
        return this;
    }

    public final m p(int i10, int i11, e eVar) {
        eVar.b(eVar.f11236f - 1);
        eVar.f11234d = x(i10);
        Object[] objArr = this.f11252d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f11251c != eVar.f11232b) {
            return new m(i11 ^ this.f11249a, this.f11250b, uk.c.j(i10, objArr), eVar.f11232b);
        }
        this.f11252d = uk.c.j(i10, objArr);
        this.f11249a ^= i11;
        return this;
    }

    public final m q(m mVar, m mVar2, int i10, int i11, o1.b bVar) {
        o1.b bVar2 = this.f11251c;
        if (mVar2 != null) {
            return (bVar2 == bVar || mVar != mVar2) ? r(i10, mVar2, bVar) : this;
        }
        Object[] objArr = this.f11252d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new m(this.f11249a, i11 ^ this.f11250b, uk.c.k(i10, objArr), bVar);
        }
        this.f11252d = uk.c.k(i10, objArr);
        this.f11250b ^= i11;
        return this;
    }

    public final m r(int i10, m mVar, o1.b bVar) {
        Object[] objArr = this.f11252d;
        if (objArr.length == 1 && mVar.f11252d.length == 2 && mVar.f11250b == 0) {
            mVar.f11249a = this.f11250b;
            return mVar;
        }
        if (this.f11251c == bVar) {
            objArr[i10] = mVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        fj.l.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = mVar;
        return new m(this.f11249a, this.f11250b, objArrCopyOf, bVar);
    }

    public final m s(int i10) {
        Object obj = this.f11252d[i10];
        fj.l.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (m) obj;
    }

    public final int t(int i10) {
        return (this.f11252d.length - 1) - Integer.bitCount((i10 - 1) & this.f11250b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        r14.f9421b = w(r12, r4, (m1.m) r14.f9421b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k4.d u(java.lang.Object r12, int r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.m.u(java.lang.Object, int, int, java.lang.Object):k4.d");
    }

    public final m v(int i10, int i11, Object obj) {
        m mVarV;
        int iF = 1 << uk.c.F(i10, i11);
        if (h(iF)) {
            int iF2 = f(iF);
            if (fj.l.b(obj, this.f11252d[iF2])) {
                Object[] objArr = this.f11252d;
                if (objArr.length != 2) {
                    return new m(this.f11249a ^ iF, this.f11250b, uk.c.j(iF2, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iF)) {
            int iT = t(iF);
            m mVarS = s(iT);
            if (i11 == 30) {
                kj.f fVarO = cg.b.O(cg.b.T(0, mVarS.f11252d.length));
                int i12 = fVarO.f9665a;
                int i13 = fVarO.f9666b;
                int i14 = fVarO.f9667c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!fj.l.b(obj, mVarS.f11252d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    Object[] objArr2 = mVarS.f11252d;
                    mVarV = objArr2.length == 2 ? null : new m(0, 0, uk.c.j(i12, objArr2), null);
                }
                mVarV = mVarS;
                break;
            }
            mVarV = mVarS.v(i10, i11 + 5, obj);
            if (mVarV == null) {
                Object[] objArr3 = this.f11252d;
                if (objArr3.length != 1) {
                    return new m(this.f11249a, iF ^ this.f11250b, uk.c.k(iT, objArr3), null);
                }
                return null;
            }
            if (mVarS != mVarV) {
                return w(iT, iF, mVarV);
            }
        }
        return this;
    }

    public final m w(int i10, int i11, m mVar) {
        Object[] objArr = mVar.f11252d;
        if (objArr.length != 2 || mVar.f11250b != 0) {
            Object[] objArr2 = this.f11252d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            fj.l.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = mVar;
            return new m(this.f11249a, this.f11250b, objArrCopyOf, null);
        }
        if (this.f11252d.length == 1) {
            mVar.f11249a = this.f11250b;
            return mVar;
        }
        int iF = f(i11);
        Object[] objArr3 = this.f11252d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        fj.l.e(objArrCopyOf2, "copyOf(...)");
        qi.k.i0(objArrCopyOf2, i10 + 2, objArrCopyOf2, i10 + 1, objArr3.length);
        qi.k.i0(objArrCopyOf2, iF + 2, objArrCopyOf2, iF, i10);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new m(this.f11249a ^ i11, i11 ^ this.f11250b, objArrCopyOf2, null);
    }

    public final Object x(int i10) {
        return this.f11252d[i10 + 1];
    }
}
