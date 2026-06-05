package kk;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a0 extends i {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f9674e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f9675f;

    public a0(byte[][] bArr, int[] iArr) {
        super(i.f9700d.f9701a);
        this.f9674e = bArr;
        this.f9675f = iArr;
    }

    @Override // kk.i
    public final i A(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = e();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(m6.a.e(i10, "beginIndex=", " < 0").toString());
        }
        if (i11 > e()) {
            StringBuilder sbP = gk.b.p(i11, "endIndex=", " > length(");
            sbP.append(e());
            sbP.append(')');
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(gk.b.l(i11, i10, "endIndex=", " < beginIndex=").toString());
        }
        if (i10 == 0 && i11 == e()) {
            return this;
        }
        if (i10 == i11) {
            return i.f9700d;
        }
        int iH = lk.b.h(this, i10);
        int iH2 = lk.b.h(this, i11 - 1);
        byte[][] bArr = this.f9674e;
        byte[][] bArr2 = (byte[][]) qi.k.l0(bArr, iH, iH2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f9675f;
        if (iH <= iH2) {
            int i13 = iH;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(iArr2[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr2.length] = iArr2[bArr.length + i13];
                if (i13 == iH2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iH != 0 ? iArr2[iH - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new a0(bArr2, iArr);
    }

    @Override // kk.i
    public final i C() {
        return G().C();
    }

    @Override // kk.i
    public final void E(f fVar, int i10) {
        int iH = lk.b.h(this, 0);
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr = this.f9675f;
            int i12 = iH == 0 ? 0 : iArr[iH - 1];
            int i13 = iArr[iH] - i12;
            byte[][] bArr = this.f9674e;
            int i14 = iArr[bArr.length + iH];
            int iMin = Math.min(i10, i13 + i12) - i11;
            int i15 = (i11 - i12) + i14;
            y yVar = new y(bArr[iH], i15, i15 + iMin, true);
            y yVar2 = fVar.f9694a;
            if (yVar2 == null) {
                yVar.f9747g = yVar;
                yVar.f9746f = yVar;
                fVar.f9694a = yVar;
            } else {
                y yVar3 = yVar2.f9747g;
                fj.l.c(yVar3);
                yVar3.b(yVar);
            }
            i11 += iMin;
            iH++;
        }
        fVar.f9695b += i10;
    }

    public final byte[] F() {
        byte[] bArr = new byte[e()];
        byte[][] bArr2 = this.f9674e;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f9675f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            qi.k.f0(bArr2[i10], i12, bArr, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public final i G() {
        return new i(F());
    }

    @Override // kk.i
    public final int e() {
        return this.f9675f[this.f9674e.length - 1];
    }

    @Override // kk.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.e() == e() && y(0, iVar, e())) {
                return true;
            }
        }
        return false;
    }

    @Override // kk.i
    public final String f() {
        return G().f();
    }

    @Override // kk.i
    public final int hashCode() {
        int i10 = this.f9702b;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f9674e;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f9675f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f9702b = i12;
        return i12;
    }

    @Override // kk.i
    public final int i(int i10, byte[] bArr) {
        fj.l.f(bArr, "other");
        return G().i(i10, bArr);
    }

    @Override // kk.i
    public final byte[] p() {
        return F();
    }

    @Override // kk.i
    public final byte r(int i10) {
        byte[][] bArr = this.f9674e;
        int length = bArr.length - 1;
        int[] iArr = this.f9675f;
        hj.a.n(iArr[length], i10, 1L);
        int iH = lk.b.h(this, i10);
        return bArr[iH][(i10 - (iH == 0 ? 0 : iArr[iH - 1])) + iArr[bArr.length + iH]];
    }

    @Override // kk.i
    public final String toString() {
        return G().toString();
    }

    @Override // kk.i
    public final int w(byte[] bArr) {
        fj.l.f(bArr, "other");
        return G().w(bArr);
    }

    @Override // kk.i
    public final boolean y(int i10, i iVar, int i11) {
        fj.l.f(iVar, "other");
        if (i10 >= 0 && i10 <= e() - i11) {
            int i12 = i11 + i10;
            int iH = lk.b.h(this, i10);
            int i13 = 0;
            while (i10 < i12) {
                int[] iArr = this.f9675f;
                int i14 = iH == 0 ? 0 : iArr[iH - 1];
                int i15 = iArr[iH] - i14;
                byte[][] bArr = this.f9674e;
                int i16 = iArr[bArr.length + iH];
                int iMin = Math.min(i12, i15 + i14) - i10;
                if (iVar.z(i13, bArr[iH], (i10 - i14) + i16, iMin)) {
                    i13 += iMin;
                    i10 += iMin;
                    iH++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // kk.i
    public final boolean z(int i10, byte[] bArr, int i11, int i12) {
        fj.l.f(bArr, "other");
        if (i10 < 0 || i10 > e() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iH = lk.b.h(this, i10);
        while (i10 < i13) {
            int[] iArr = this.f9675f;
            int i14 = iH == 0 ? 0 : iArr[iH - 1];
            int i15 = iArr[iH] - i14;
            byte[][] bArr2 = this.f9674e;
            int i16 = iArr[bArr2.length + iH];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!hj.a.k(bArr2[iH], (i10 - i14) + i16, bArr, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iH++;
        }
        return true;
    }
}
