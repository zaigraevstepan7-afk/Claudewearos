package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends j {
    public int A;
    public int B;
    public int C = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: c, reason: collision with root package name */
    public final FileInputStream f942c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f943d;

    /* renamed from: e, reason: collision with root package name */
    public int f944e;

    /* renamed from: f, reason: collision with root package name */
    public int f945f;

    /* renamed from: z, reason: collision with root package name */
    public int f946z;

    public i(FileInputStream fileInputStream) {
        Charset charset = y.f1035a;
        this.f942c = fileInputStream;
        this.f943d = new byte[4096];
        this.f944e = 0;
        this.f946z = 0;
        this.B = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long A() {
        return S();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int B() {
        return P();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long C() {
        return Q();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int D() {
        int iR = R();
        return (-(iR & 1)) ^ (iR >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long E() {
        long jS = S();
        return (-(jS & 1)) ^ (jS >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String F() throws a0 {
        int iR = R();
        byte[] bArr = this.f943d;
        if (iR > 0) {
            int i10 = this.f944e;
            int i11 = this.f946z;
            if (iR <= i10 - i11) {
                String str = new String(bArr, i11, iR, y.f1035a);
                this.f946z += iR;
                return str;
            }
        }
        if (iR == 0) {
            return "";
        }
        if (iR < 0) {
            throw a0.d();
        }
        if (iR > this.f944e) {
            return new String(M(iR), y.f1035a);
        }
        V(iR);
        String str2 = new String(bArr, this.f946z, iR, y.f1035a);
        this.f946z += iR;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String G() throws IOException {
        int iR = R();
        int i10 = this.f946z;
        int i11 = this.f944e;
        int i12 = i11 - i10;
        byte[] bArrM = this.f943d;
        if (iR <= i12 && iR > 0) {
            this.f946z = i10 + iR;
        } else {
            if (iR == 0) {
                return "";
            }
            if (iR < 0) {
                throw a0.d();
            }
            i10 = 0;
            if (iR <= i11) {
                V(iR);
                this.f946z = iR;
            } else {
                bArrM = M(iR);
            }
        }
        return n1.f976a.t(i10, bArrM, iR);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int H() throws a0 {
        if (g()) {
            this.A = 0;
            return 0;
        }
        int iR = R();
        this.A = iR;
        if ((iR >>> 3) != 0) {
            return iR;
        }
        throw new a0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int I() {
        return R();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long J() {
        return S();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean K(int i10) throws a0 {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                W(8);
                return true;
            }
            if (i11 == 2) {
                W(R());
                return true;
            }
            if (i11 == 3) {
                L();
                b(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw a0.b();
            }
            W(4);
            return true;
        }
        int i13 = this.f944e - this.f946z;
        byte[] bArr = this.f943d;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f946z;
                this.f946z = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw a0.c();
        }
        while (i12 < 10) {
            if (this.f946z == this.f944e) {
                V(1);
            }
            int i15 = this.f946z;
            this.f946z = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw a0.c();
        return true;
    }

    public final byte[] M(int i10) throws IOException {
        byte[] bArrN = N(i10);
        if (bArrN != null) {
            return bArrN;
        }
        int i11 = this.f946z;
        int i12 = this.f944e;
        int length = i12 - i11;
        this.B += i12;
        this.f946z = 0;
        this.f944e = 0;
        ArrayList arrayListO = O(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f943d, i11, bArr, 0, length);
        int size = arrayListO.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayListO.get(i13);
            i13++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] N(int i10) throws IOException {
        if (i10 == 0) {
            return y.f1036b;
        }
        if (i10 < 0) {
            throw a0.d();
        }
        int i11 = this.B;
        int i12 = this.f946z;
        int i13 = i11 + i12 + i10;
        if (i13 - com.google.android.gms.common.api.f.API_PRIORITY_OTHER > 0) {
            throw new a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.C;
        if (i13 > i14) {
            W((i14 - i11) - i12);
            throw a0.e();
        }
        int i15 = this.f944e - i12;
        int i16 = i10 - i15;
        FileInputStream fileInputStream = this.f942c;
        if (i16 >= 4096) {
            try {
                if (i16 > fileInputStream.available()) {
                    return null;
                }
            } catch (a0 e10) {
                e10.f891a = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f943d, this.f946z, bArr, 0, i15);
        this.B += this.f944e;
        this.f946z = 0;
        this.f944e = 0;
        while (i15 < i10) {
            try {
                int i17 = fileInputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw a0.e();
                }
                this.B += i17;
                i15 += i17;
            } catch (a0 e11) {
                e11.f891a = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList O(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f942c.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw a0.e();
                }
                this.B += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int P() throws a0 {
        int i10 = this.f946z;
        if (this.f944e - i10 < 4) {
            V(4);
            i10 = this.f946z;
        }
        this.f946z = i10 + 4;
        byte[] bArr = this.f943d;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long Q() throws a0 {
        int i10 = this.f946z;
        if (this.f944e - i10 < 8) {
            V(8);
            i10 = this.f946z;
        }
        this.f946z = i10 + 8;
        byte[] bArr = this.f943d;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final int R() {
        int i10;
        int i11 = this.f946z;
        int i12 = this.f944e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f943d;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f946z = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f946z = i14;
                return i10;
            }
        }
        return (int) T();
    }

    public final long S() {
        long j;
        long j4;
        long j10;
        long j11;
        int i10 = this.f946z;
        int i11 = this.f944e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f943d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f946z = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j11 = (-2080896) ^ i18;
                        } else {
                            long j12 = i18;
                            i13 = i10 + 5;
                            long j13 = j12 ^ (bArr[i17] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j14 = j13 ^ (bArr[i13] << 35);
                                if (j14 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j13 = j14 ^ (bArr[i17] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j14 = j13 ^ (bArr[i13] << 49);
                                        if (j14 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j15 = (j14 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j = j15;
                                        }
                                    }
                                }
                                j11 = j4 ^ j14;
                            }
                            j = j10 ^ j13;
                        }
                        i13 = i17;
                        j = j11;
                    }
                }
                this.f946z = i13;
                return j;
            }
        }
        return T();
    }

    public final long T() throws a0 {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f946z == this.f944e) {
                V(1);
            }
            int i11 = this.f946z;
            this.f946z = i11 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i10;
            if ((this.f943d[i11] & 128) == 0) {
                return j;
            }
        }
        throw a0.c();
    }

    public final void U() {
        int i10 = this.f944e + this.f945f;
        this.f944e = i10;
        int i11 = this.B + i10;
        int i12 = this.C;
        if (i11 <= i12) {
            this.f945f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f945f = i13;
        this.f944e = i10 - i13;
    }

    public final void V(int i10) throws a0 {
        if (X(i10)) {
            return;
        }
        if (i10 <= (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.B) - this.f946z) {
            throw a0.e();
        }
        throw new a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void W(int i10) throws a0 {
        int i11 = this.f944e;
        int i12 = this.f946z;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f946z = i12 + i10;
            return;
        }
        FileInputStream fileInputStream = this.f942c;
        if (i10 < 0) {
            throw a0.d();
        }
        int i14 = this.B;
        int i15 = i14 + i12;
        int i16 = i15 + i10;
        int i17 = this.C;
        if (i16 > i17) {
            W((i17 - i14) - i12);
            throw a0.e();
        }
        this.B = i15;
        this.f944e = 0;
        this.f946z = 0;
        while (i13 < i10) {
            long j = i10 - i13;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (a0 e10) {
                    e10.f891a = true;
                    throw e10;
                }
            } catch (Throwable th2) {
                this.B += i13;
                U();
                throw th2;
            }
        }
        this.B += i13;
        U();
        if (i13 >= i10) {
            return;
        }
        int i18 = this.f944e;
        int i19 = i18 - this.f946z;
        this.f946z = i18;
        V(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f944e;
            if (i20 <= i21) {
                this.f946z = i20;
                return;
            } else {
                i19 += i21;
                this.f946z = i21;
                V(1);
            }
        }
    }

    public final boolean X(int i10) throws IOException {
        FileInputStream fileInputStream = this.f942c;
        int i11 = this.f946z;
        int i12 = i11 + i10;
        int i13 = this.f944e;
        if (i12 <= i13) {
            throw new IllegalStateException(m6.a.e(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.B;
        if (i10 <= (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i14) - i11 && i14 + i11 + i10 <= this.C) {
            byte[] bArr = this.f943d;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.B += i11;
                this.f944e -= i11;
                this.f946z = 0;
            }
            int i15 = this.f944e;
            try {
                int i16 = fileInputStream.read(bArr, i15, Math.min(bArr.length - i15, (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.B) - i15));
                if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
                }
                if (i16 > 0) {
                    this.f944e += i16;
                    U();
                    if (this.f944e >= i10) {
                        return true;
                    }
                    return X(i10);
                }
            } catch (a0 e10) {
                e10.f891a = true;
                throw e10;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void b(int i10) throws a0 {
        if (this.A != i10) {
            throw new a0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int f() {
        return this.B + this.f946z;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean g() {
        return this.f946z == this.f944e && !X(1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void o(int i10) {
        this.C = i10;
        U();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int q(int i10) throws a0 {
        if (i10 < 0) {
            throw a0.d();
        }
        int i11 = this.B + this.f946z + i10;
        if (i11 < 0) {
            throw new a0("Failed to parse the message.");
        }
        int i12 = this.C;
        if (i11 > i12) {
            throw a0.e();
        }
        this.C = i11;
        U();
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean r() {
        return S() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final g s() throws IOException {
        int iR = R();
        int i10 = this.f944e;
        int i11 = this.f946z;
        int i12 = i10 - i11;
        byte[] bArr = this.f943d;
        if (iR <= i12 && iR > 0) {
            g gVarI = g.i(i11, bArr, iR);
            this.f946z += iR;
            return gVarI;
        }
        if (iR == 0) {
            return g.f927c;
        }
        if (iR < 0) {
            throw a0.d();
        }
        byte[] bArrN = N(iR);
        if (bArrN != null) {
            return g.i(0, bArrN, bArrN.length);
        }
        int i13 = this.f946z;
        int i14 = this.f944e;
        int length = i14 - i13;
        this.B += i14;
        this.f946z = 0;
        this.f944e = 0;
        ArrayList arrayListO = O(iR - length);
        byte[] bArr2 = new byte[iR];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        int size = arrayListO.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayListO.get(i15);
            i15++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        g gVar = g.f927c;
        return new g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final double u() {
        return Double.longBitsToDouble(Q());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int v() {
        return R();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int w() {
        return P();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long x() {
        return Q();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final float y() {
        return Float.intBitsToFloat(P());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int z() {
        return R();
    }
}
