package i1;

import f1.n;
import f1.n0;
import f1.o1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import q.b0;
import q.u;
import q.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final h f8136a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f8137b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8138c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f8139d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f8140e;

    /* renamed from: f, reason: collision with root package name */
    public v f8141f;

    /* renamed from: g, reason: collision with root package name */
    public int f8142g;

    /* renamed from: h, reason: collision with root package name */
    public int f8143h;

    /* renamed from: i, reason: collision with root package name */
    public int f8144i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f8145k;

    /* renamed from: l, reason: collision with root package name */
    public int f8146l;

    /* renamed from: m, reason: collision with root package name */
    public int f8147m;

    /* renamed from: n, reason: collision with root package name */
    public int f8148n;

    /* renamed from: o, reason: collision with root package name */
    public int f8149o;

    /* renamed from: p, reason: collision with root package name */
    public final n0 f8150p;

    /* renamed from: q, reason: collision with root package name */
    public final n0 f8151q;

    /* renamed from: r, reason: collision with root package name */
    public final n0 f8152r;

    /* renamed from: s, reason: collision with root package name */
    public v f8153s;

    /* renamed from: t, reason: collision with root package name */
    public int f8154t;

    /* renamed from: u, reason: collision with root package name */
    public int f8155u;

    /* renamed from: v, reason: collision with root package name */
    public int f8156v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8157w;

    /* renamed from: x, reason: collision with root package name */
    public u f8158x;

    public k(h hVar) {
        this.f8136a = hVar;
        int[] iArr = hVar.f8126a;
        this.f8137b = iArr;
        Object[] objArr = hVar.f8128c;
        this.f8138c = objArr;
        this.f8139d = hVar.B;
        this.f8140e = hVar.C;
        this.f8141f = hVar.D;
        int i10 = hVar.f8127b;
        this.f8142g = i10;
        this.f8143h = (iArr.length / 5) - i10;
        int i11 = hVar.f8129d;
        this.f8145k = i11;
        this.f8146l = objArr.length - i11;
        this.f8147m = i10;
        this.f8150p = new n0(0, false);
        this.f8151q = new n0(0, false);
        this.f8152r = new n0(0, false);
        this.f8155u = i10;
        this.f8156v = -1;
    }

    public static int i(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public static void z(k kVar) {
        int i10 = kVar.f8156v;
        int iR = kVar.r(i10);
        int[] iArr = kVar.f8137b;
        int i11 = (iR * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) != 0) {
            return;
        }
        int i13 = (i12 & (-134217729)) | 134217728;
        iArr[i11] = i13;
        if ((67108864 & i13) != 0) {
            return;
        }
        kVar.T(kVar.E(iArr, i10));
    }

    public final void A(h hVar, int i10) {
        if (this.f8148n <= 0) {
            n.a("Check failed");
        }
        if (i10 == 0 && this.f8154t == 0 && this.f8136a.f8127b == 0) {
            int[] iArr = hVar.f8126a;
            int i11 = iArr[(i10 * 5) + 3];
            int i12 = hVar.f8127b;
            if (i11 == i12) {
                int[] iArr2 = this.f8137b;
                Object[] objArr = this.f8138c;
                ArrayList arrayList = this.f8139d;
                HashMap map = this.f8140e;
                v vVar = this.f8141f;
                Object[] objArr2 = hVar.f8128c;
                int i13 = hVar.f8129d;
                HashMap map2 = hVar.C;
                v vVar2 = hVar.D;
                this.f8137b = iArr;
                this.f8138c = objArr2;
                this.f8139d = hVar.B;
                this.f8142g = i12;
                this.f8143h = (iArr.length / 5) - i12;
                this.f8145k = i13;
                this.f8146l = objArr2.length - i13;
                this.f8147m = i12;
                this.f8140e = map2;
                this.f8141f = vVar2;
                hVar.f8126a = iArr2;
                hVar.f8127b = 0;
                hVar.f8128c = objArr;
                hVar.f8129d = 0;
                hVar.B = arrayList;
                hVar.C = map;
                hVar.D = vVar;
                return;
            }
        }
        k kVarX = hVar.x();
        try {
            mk.b.B(kVarX, i10, this, true, true, false);
            kVarX.e(true);
        } catch (Throwable th2) {
            kVarX.e(false);
            throw th2;
        }
    }

    public final void B(int i10) {
        b bVar;
        int i11;
        b bVar2;
        int i12;
        int i13;
        int i14 = this.f8143h;
        int i15 = this.f8142g;
        if (i15 != i10) {
            if (!this.f8139d.isEmpty()) {
                int iO = o() - this.f8143h;
                if (i15 < i10) {
                    for (int iA = j.a(this.f8139d, i15, iO); iA < this.f8139d.size() && (i12 = (bVar2 = (b) this.f8139d.get(iA)).f8101a) < 0 && (i13 = i12 + iO) < i10; iA++) {
                        bVar2.f8101a = i13;
                    }
                } else {
                    for (int iA2 = j.a(this.f8139d, i10, iO); iA2 < this.f8139d.size() && (i11 = (bVar = (b) this.f8139d.get(iA2)).f8101a) >= 0; iA2++) {
                        bVar.f8101a = -(iO - i11);
                    }
                }
            }
            if (i14 > 0) {
                int[] iArr = this.f8137b;
                int i16 = i10 * 5;
                int i17 = i14 * 5;
                int i18 = i15 * 5;
                if (i10 < i15) {
                    qi.k.e0(i17 + i16, i16, i18, iArr, iArr);
                } else {
                    qi.k.e0(i18, i18 + i17, i16 + i17, iArr, iArr);
                }
            }
            if (i10 < i15) {
                i15 = i10 + i14;
            }
            int iO2 = o();
            if (i15 >= iO2) {
                n.a("Check failed");
            }
            while (i15 < iO2) {
                int i19 = (i15 * 5) + 2;
                int i20 = this.f8137b[i19];
                int iP = i20 > -2 ? i20 : (p() + i20) - (-2);
                if (iP >= i10) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i20) {
                    this.f8137b[i19] = iP;
                }
                i15++;
                if (i15 == i10) {
                    i15 += i14;
                }
            }
        }
        this.f8142g = i10;
    }

    public final void C(int i10, int i11) {
        int i12 = this.f8146l;
        int i13 = this.f8145k;
        int i14 = this.f8147m;
        if (i13 != i10) {
            Object[] objArr = this.f8138c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, p());
        if (i14 != iMin) {
            int length = this.f8138c.length - i12;
            if (iMin < i14) {
                int iR = r(iMin);
                int iR2 = r(i14);
                int i16 = this.f8142g;
                while (iR < iR2) {
                    int i17 = (iR * 5) + 4;
                    int i18 = this.f8137b[i17];
                    if (!(i18 >= 0)) {
                        n.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f8137b[i17] = -((length - i18) + 1);
                    iR++;
                    if (iR == i16) {
                        iR += this.f8143h;
                    }
                }
            } else {
                int iR3 = r(i14);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i19 = (iR3 * 5) + 4;
                    int i20 = this.f8137b[i19];
                    if (!(i20 < 0)) {
                        n.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f8137b[i19] = i20 + length + 1;
                    iR3++;
                    if (iR3 == this.f8142g) {
                        iR3 += this.f8143h;
                    }
                }
            }
            this.f8147m = iMin;
        }
        this.f8145k = i10;
    }

    public final Object D(int i10) {
        int iR = r(i10);
        int[] iArr = this.f8137b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.f8138c[h(g(iArr, iR))];
        }
        return null;
    }

    public final int E(int[] iArr, int i10) {
        int i11 = iArr[(r(i10) * 5) + 2];
        return i11 > -2 ? i11 : (p() + i11) - (-2);
    }

    public final Object F(Object obj) {
        if (this.f8148n > 0) {
            x(1, this.f8156v);
        }
        Object[] objArr = this.f8138c;
        int i10 = this.f8144i;
        this.f8144i = i10 + 1;
        Object obj2 = objArr[h(i10)];
        if (this.f8144i > this.j) {
            n.a("Writing to an invalid slot");
        }
        this.f8138c[h(this.f8144i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i10;
        u uVar = this.f8158x;
        if (uVar != null) {
            while (uVar.f13137b != 0) {
                int iP = hj.a.P(uVar);
                int iR = r(iP);
                int iU = iP + 1;
                int iU2 = u(iP) + iP;
                while (true) {
                    if (iU >= iU2) {
                        i10 = 0;
                        break;
                    } else {
                        if ((this.f8137b[(r(iU) * 5) + 1] & 201326592) != 0) {
                            i10 = 1;
                            break;
                        }
                        iU += u(iU);
                    }
                }
                int[] iArr = this.f8137b;
                int i11 = (iR * 5) + 1;
                int i12 = iArr[i11];
                if (((67108864 & i12) != 0 ? 1 : 0) != i10) {
                    iArr[i11] = (i10 << 26) | ((-67108865) & i12);
                    int iE = E(iArr, iP);
                    if (iE >= 0) {
                        hj.a.i(uVar, iE);
                    }
                }
            }
        }
    }

    public final boolean H() {
        if (!(this.f8148n == 0)) {
            n.a("Cannot remove group while inserting");
        }
        int i10 = this.f8154t;
        int i11 = this.f8144i;
        int iG = g(this.f8137b, r(i10));
        int iL = L();
        O(this.f8156v);
        u uVar = this.f8158x;
        if (uVar != null) {
            while (true) {
                int i12 = uVar.f13137b;
                if (i12 == 0) {
                    break;
                }
                if (i12 == 0) {
                    r.a.e("IntList is empty.");
                    throw null;
                }
                if (uVar.f13136a[0] < i10) {
                    break;
                }
                hj.a.P(uVar);
            }
        }
        boolean zI = I(i10, this.f8154t - i10);
        J(iG, this.f8144i - iG, i10 - 1);
        this.f8154t = i10;
        this.f8144i = i11;
        this.f8149o -= iL;
        return zI;
    }

    public final boolean I(int i10, int i11) {
        if (i11 > 0) {
            ArrayList arrayList = this.f8139d;
            B(i10);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f8140e;
                int i12 = i10 + i11;
                int iA = j.a(this.f8139d, i12, o() - this.f8143h);
                if (iA >= this.f8139d.size()) {
                    iA--;
                }
                int i13 = iA + 1;
                int i14 = 0;
                while (iA >= 0) {
                    b bVar = (b) this.f8139d.get(iA);
                    int iC = c(bVar);
                    if (iC < i10) {
                        break;
                    }
                    if (iC < i12) {
                        bVar.f8101a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i14 == 0) {
                            i14 = iA + 1;
                        }
                        i13 = iA;
                    }
                    iA--;
                }
                z = i13 < i14;
                if (z) {
                    this.f8139d.subList(i13, i14).clear();
                }
            }
            this.f8142g = i10;
            this.f8143h += i11;
            int i15 = this.f8147m;
            if (i15 > i10) {
                this.f8147m = Math.max(i10, i15 - i11);
            }
            int i16 = this.f8155u;
            if (i16 >= this.f8142g) {
                this.f8155u = i16 - i11;
            }
            int i17 = this.f8156v;
            if (i17 >= 0 && (this.f8137b[(r(i17) * 5) + 1] & 67108864) != 0) {
                T(i17);
            }
        }
        return z;
    }

    public final void J(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f8146l;
            int i14 = i10 + i11;
            C(i14, i12);
            this.f8145k = i10;
            this.f8146l = i13 + i11;
            qi.k.m0(i10, i14, null, this.f8138c);
            int i15 = this.j;
            if (i15 >= i10) {
                this.j = i15 - i11;
            }
        }
    }

    public final Object K(int i10, int i11, Object obj) {
        int iN = N(this.f8137b, r(i10));
        int iG = g(this.f8137b, r(i10 + 1));
        int i12 = iN + i11;
        if (i12 < iN || i12 >= iG) {
            n.a("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        int iH = h(i12);
        Object[] objArr = this.f8138c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int L() {
        int iR = r(this.f8154t);
        int i10 = this.f8154t;
        int[] iArr = this.f8137b;
        int i11 = iR * 5;
        int i12 = iArr[i11 + 3] + i10;
        this.f8154t = i12;
        this.f8144i = g(iArr, r(i12));
        int i13 = this.f8137b[i11 + 1];
        if ((1073741824 & i13) != 0) {
            return 1;
        }
        return i13 & 67108863;
    }

    public final void M() {
        int i10 = this.f8155u;
        this.f8154t = i10;
        this.f8144i = g(this.f8137b, r(i10));
    }

    public final int N(int[] iArr, int i10) {
        if (i10 >= o()) {
            return this.f8138c.length - this.f8146l;
        }
        int iB = j.b(iArr, i10);
        return iB < 0 ? (this.f8138c.length - this.f8146l) + iB + 1 : iB;
    }

    public final c O(int i10) {
        b bVarR;
        HashMap map = this.f8140e;
        if (map == null || (bVarR = R(i10)) == null) {
            return null;
        }
        return (c) map.get(bVarR);
    }

    public final void P() {
        if (this.f8148n != 0) {
            n.a("Key must be supplied when inserting");
        }
        f1.f fVar = f1.m.f6385a;
        Q(0, fVar, fVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int i10, Object obj, Object obj2, boolean z2) {
        int i11;
        int i12 = this.f8156v;
        Object[] objArr = this.f8148n > 0;
        this.f8152r.d(this.f8149o);
        f1.f fVar = f1.m.f6385a;
        if (objArr == true) {
            int i13 = this.f8154t;
            int iG = g(this.f8137b, r(i13));
            w(1);
            this.f8144i = iG;
            this.j = iG;
            int iR = r(i13);
            int i14 = obj != fVar ? 1 : 0;
            int i15 = (z2 || obj2 == fVar) ? 0 : 1;
            int i16 = i(iG, this.f8145k, this.f8146l, this.f8138c.length);
            if (i16 >= 0 && this.f8147m < i13) {
                i16 = -(((this.f8138c.length - this.f8146l) - i16) + 1);
            }
            int[] iArr = this.f8137b;
            int i17 = this.f8156v;
            int i18 = iR * 5;
            iArr[i18] = i10;
            iArr[i18 + 1] = ((z2 ? 1 : 0) << 30) | (i14 << 29) | (i15 << 28);
            iArr[i18 + 2] = i17;
            iArr[i18 + 3] = 0;
            iArr[i18 + 4] = i16;
            int i19 = (z2 ? 1 : 0) + i14 + i15;
            if (i19 > 0) {
                x(i19, i13);
                Object[] objArr2 = this.f8138c;
                int i20 = this.f8144i;
                if (z2) {
                    objArr2[i20] = obj2;
                    i20++;
                }
                if (i14 != 0) {
                    objArr2[i20] = obj;
                    i20++;
                }
                if (i15 != 0) {
                    objArr2[i20] = obj2;
                    i20++;
                }
                this.f8144i = i20;
            }
            this.f8149o = 0;
            i11 = i13 + 1;
            this.f8156v = i13;
            this.f8154t = i11;
            if (i12 >= 0) {
                O(i12);
            }
        } else {
            this.f8150p.d(i12);
            this.f8151q.d((o() - this.f8143h) - this.f8155u);
            int i21 = this.f8154t;
            int iR2 = r(i21);
            if (!fj.l.b(obj2, fVar)) {
                if (z2) {
                    U(this.f8154t, obj2);
                } else {
                    S(obj2);
                }
            }
            this.f8144i = N(this.f8137b, iR2);
            this.j = g(this.f8137b, r(this.f8154t + 1));
            int[] iArr2 = this.f8137b;
            int i22 = iR2 * 5;
            this.f8149o = iArr2[i22 + 1] & 67108863;
            this.f8156v = i21;
            this.f8154t = i21 + 1;
            i11 = i21 + iArr2[i22 + 3];
        }
        this.f8155u = i11;
    }

    public final b R(int i10) {
        ArrayList arrayList;
        int iE;
        if (i10 < 0 || i10 >= p() || (iE = j.e((arrayList = this.f8139d), i10, p())) < 0) {
            return null;
        }
        return (b) arrayList.get(iE);
    }

    public final void S(Object obj) {
        int iR = r(this.f8154t);
        int i10 = (iR * 5) + 1;
        if ((this.f8137b[i10] & 268435456) == 0) {
            n.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f8138c;
        int[] iArr = this.f8137b;
        objArr[h(Integer.bitCount(iArr[i10] >> 29) + g(iArr, iR))] = obj;
    }

    public final void T(int i10) {
        if (i10 >= 0) {
            u uVar = this.f8158x;
            if (uVar == null) {
                uVar = new u();
                this.f8158x = uVar;
            }
            hj.a.i(uVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.r(r5)
            int[] r1 = r4.f8137b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            f1.n.a(r5)
        L2e:
            java.lang.Object[] r5 = r4.f8138c
            int[] r1 = r4.f8137b
            int r0 = r4.g(r1, r0)
            int r0 = r4.h(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.k.U(int, java.lang.Object):void");
    }

    public final void a(int i10) {
        boolean z2 = false;
        if (!(i10 >= 0)) {
            n.a("Cannot seek backwards");
        }
        if (!(this.f8148n <= 0)) {
            o1.b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f8154t + i10;
        if (i11 >= this.f8156v && i11 <= this.f8155u) {
            z2 = true;
        }
        if (!z2) {
            n.a("Cannot seek outside the current group (" + this.f8156v + '-' + this.f8155u + ')');
        }
        this.f8154t = i11;
        int iG = g(this.f8137b, r(i11));
        this.f8144i = iG;
        this.j = iG;
    }

    public final b b(int i10) {
        ArrayList arrayList = this.f8139d;
        int iE = j.e(arrayList, i10, p());
        if (iE >= 0) {
            return (b) arrayList.get(iE);
        }
        if (i10 > this.f8142g) {
            i10 = -(p() - i10);
        }
        b bVar = new b(i10);
        arrayList.add(-(iE + 1), bVar);
        return bVar;
    }

    public final int c(b bVar) {
        int i10 = bVar.f8101a;
        return i10 < 0 ? p() + i10 : i10;
    }

    public final void d() {
        int i10 = this.f8148n;
        this.f8148n = i10 + 1;
        if (i10 == 0) {
            this.f8151q.d((o() - this.f8143h) - this.f8155u);
        }
    }

    public final void e(boolean z2) {
        this.f8157w = true;
        if (z2 && this.f8150p.f6400a == 0) {
            B(p());
            C(this.f8138c.length - this.f8146l, this.f8142g);
            int i10 = this.f8145k;
            Arrays.fill(this.f8138c, i10, this.f8146l + i10, (Object) null);
            G();
        }
        int[] iArr = this.f8137b;
        int i11 = this.f8142g;
        Object[] objArr = this.f8138c;
        int i12 = this.f8145k;
        ArrayList arrayList = this.f8139d;
        HashMap map = this.f8140e;
        v vVar = this.f8141f;
        h hVar = this.f8136a;
        if (!hVar.f8132z) {
            o1.a("Unexpected writer close()");
        }
        hVar.f8132z = false;
        hVar.f8126a = iArr;
        hVar.f8127b = i11;
        hVar.f8128c = objArr;
        hVar.f8129d = i12;
        hVar.B = arrayList;
        hVar.C = map;
        hVar.D = vVar;
    }

    public final int f(int i10) {
        return g(this.f8137b, r(i10));
    }

    public final int g(int[] iArr, int i10) {
        if (i10 >= o()) {
            return this.f8138c.length - this.f8146l;
        }
        int i11 = iArr[(i10 * 5) + 4];
        return i11 < 0 ? (this.f8138c.length - this.f8146l) + i11 + 1 : i11;
    }

    public final int h(int i10) {
        return (this.f8146l * (i10 < this.f8145k ? 0 : 1)) + i10;
    }

    public final void j() {
        b0 b0Var;
        boolean z2 = this.f8148n > 0;
        int i10 = this.f8154t;
        int i11 = this.f8155u;
        int i12 = this.f8156v;
        int iR = r(i12);
        int i13 = this.f8149o;
        int i14 = i10 - i12;
        int i15 = iR * 5;
        int i16 = i15 + 1;
        boolean z10 = (this.f8137b[i16] & 1073741824) != 0;
        n0 n0Var = this.f8152r;
        if (z2) {
            v vVar = this.f8153s;
            if (vVar != null && (b0Var = (b0) vVar.b(i12)) != null) {
                Object[] objArr = b0Var.f13033a;
                int i17 = b0Var.f13034b;
                for (int i18 = 0; i18 < i17; i18++) {
                    F(objArr[i18]);
                }
            }
            int[] iArr = this.f8137b;
            iArr[i15 + 3] = i14;
            j.c(iArr, iR, i13);
            int iC = n0Var.c();
            if (z10) {
                i13 = 1;
            }
            this.f8149o = iC + i13;
            int iE = E(this.f8137b, i12);
            this.f8156v = iE;
            int iP = iE < 0 ? p() : r(iE + 1);
            int iG = iP >= 0 ? g(this.f8137b, iP) : 0;
            this.f8144i = iG;
            this.j = iG;
            return;
        }
        if (i10 != i11) {
            n.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f8137b;
        int i19 = i15 + 3;
        int i20 = iArr2[i19];
        int i21 = iArr2[i16] & 67108863;
        iArr2[i19] = i14;
        j.c(iArr2, iR, i13);
        int iC2 = this.f8150p.c();
        this.f8155u = (o() - this.f8143h) - this.f8151q.c();
        this.f8156v = iC2;
        int iE2 = E(this.f8137b, i12);
        int iC3 = n0Var.c();
        this.f8149o = iC3;
        if (iE2 == iC2) {
            this.f8149o = iC3 + (z10 ? 0 : i13 - i21);
            return;
        }
        int i22 = i14 - i20;
        int i23 = z10 ? 0 : i13 - i21;
        if (i22 != 0 || i23 != 0) {
            while (iE2 != 0 && iE2 != iC2 && (i23 != 0 || i22 != 0)) {
                int iR2 = r(iE2);
                if (i22 != 0) {
                    int[] iArr3 = this.f8137b;
                    int i24 = (iR2 * 5) + 3;
                    iArr3[i24] = iArr3[i24] + i22;
                }
                if (i23 != 0) {
                    int[] iArr4 = this.f8137b;
                    j.c(iArr4, iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i23);
                }
                int[] iArr5 = this.f8137b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i23 = 0;
                }
                iE2 = E(iArr5, iE2);
            }
        }
        this.f8149o += i23;
    }

    public final void k() {
        if (this.f8148n <= 0) {
            o1.b("Unbalanced begin/end insert");
        }
        int i10 = this.f8148n - 1;
        this.f8148n = i10;
        if (i10 == 0) {
            if (this.f8152r.f6400a != this.f8150p.f6400a) {
                n.a("startGroup/endGroup mismatch while inserting");
            }
            this.f8155u = (o() - this.f8143h) - this.f8151q.c();
        }
    }

    public final void l(int i10) {
        boolean z2 = false;
        if (!(this.f8148n <= 0)) {
            n.a("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f8156v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f8155u) {
                z2 = true;
            }
            if (!z2) {
                n.a("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f8154t;
            int i13 = this.f8144i;
            int i14 = this.j;
            this.f8154t = i10;
            P();
            this.f8154t = i12;
            this.f8144i = i13;
            this.j = i14;
        }
    }

    public final void m(int i10, int i11, int i12) {
        if (i10 >= this.f8142g) {
            i10 = -((p() - i10) + 2);
        }
        while (i12 < i11) {
            this.f8137b[(r(i12) * 5) + 2] = i10;
            int i13 = this.f8137b[(r(i12) * 5) + 3] + i12;
            m(i12, i13, i12 + 1);
            i12 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        r.a.d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0138, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r21, ej.e r22) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.k.n(int, ej.e):void");
    }

    public final int o() {
        return this.f8137b.length / 5;
    }

    public final int p() {
        return o() - this.f8143h;
    }

    public final Object q(int i10) {
        int iR = r(i10);
        int[] iArr = this.f8137b;
        int i11 = (iR * 5) + 1;
        if ((iArr[i11] & 268435456) == 0) {
            return f1.m.f6385a;
        }
        return this.f8138c[Integer.bitCount(iArr[i11] >> 29) + g(iArr, iR)];
    }

    public final int r(int i10) {
        return (this.f8143h * (i10 < this.f8142g ? 0 : 1)) + i10;
    }

    public final int s(int i10) {
        return this.f8137b[r(i10) * 5];
    }

    public final Object t(int i10) {
        int iR = r(i10);
        int[] iArr = this.f8137b;
        int i11 = iR * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f8138c[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f8154t + " end=" + this.f8155u + " size = " + p() + " gap=" + this.f8142g + '-' + (this.f8142g + this.f8143h) + ')';
    }

    public final int u(int i10) {
        return this.f8137b[(r(i10) * 5) + 3];
    }

    public final boolean v(int i10, int i11) {
        int iO;
        int iU;
        if (i11 == this.f8156v) {
            iO = this.f8155u;
        } else {
            n0 n0Var = this.f8150p;
            if (i11 > n0Var.b(0)) {
                iU = u(i11);
            } else {
                int[] iArr = n0Var.f6401b;
                int iMin = Math.min(iArr.length, n0Var.f6400a);
                int i12 = 0;
                while (true) {
                    if (i12 >= iMin) {
                        i12 = -1;
                        break;
                    }
                    if (iArr[i12] == i11) {
                        break;
                    }
                    i12++;
                }
                if (i12 < 0) {
                    iU = u(i11);
                } else {
                    iO = (o() - this.f8143h) - this.f8151q.f6401b[i12];
                }
            }
            iO = iU + i11;
        }
        return i10 > i11 && i10 < iO;
    }

    public final void w(int i10) {
        if (i10 > 0) {
            int i11 = this.f8154t;
            B(i11);
            int i12 = this.f8142g;
            int i13 = this.f8143h;
            int[] iArr = this.f8137b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                qi.k.e0(0, 0, i12 * 5, iArr, iArr2);
                qi.k.e0((i12 + i15) * 5, (i13 + i12) * 5, length * 5, iArr, iArr2);
                this.f8137b = iArr2;
                i13 = i15;
            }
            int i16 = this.f8155u;
            if (i16 >= i12) {
                this.f8155u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f8142g = i17;
            this.f8143h = i13 - i10;
            int i18 = i(i14 > 0 ? f(i11 + i10) : 0, this.f8147m >= i12 ? this.f8145k : 0, this.f8146l, this.f8138c.length);
            for (int i19 = i12; i19 < i17; i19++) {
                this.f8137b[(i19 * 5) + 4] = i18;
            }
            int i20 = this.f8147m;
            if (i20 >= i12) {
                this.f8147m = i20 + i10;
            }
        }
    }

    public final void x(int i10, int i11) {
        if (i10 > 0) {
            C(this.f8144i, i11);
            int i12 = this.f8145k;
            int i13 = this.f8146l;
            if (i13 < i10) {
                Object[] objArr = this.f8138c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f8138c = objArr2;
                i13 = i16;
            }
            int i18 = this.j;
            if (i18 >= i12) {
                this.j = i18 + i10;
            }
            this.f8145k = i12 + i10;
            this.f8146l = i13 - i10;
        }
    }

    public final boolean y(int i10) {
        return (this.f8137b[(r(i10) * 5) + 1] & 1073741824) != 0;
    }
}
