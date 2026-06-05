package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j extends androidx.datastore.preferences.protobuf.j {
    public int A;
    public int B = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4177c;

    /* renamed from: d, reason: collision with root package name */
    public int f4178d;

    /* renamed from: e, reason: collision with root package name */
    public int f4179e;

    /* renamed from: f, reason: collision with root package name */
    public int f4180f;

    /* renamed from: z, reason: collision with root package name */
    public final int f4181z;

    public j(byte[] bArr, int i10, int i11, boolean z2) {
        this.f4177c = bArr;
        this.f4178d = i11 + i10;
        this.f4180f = i10;
        this.f4181z = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long A() {
        return P();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int B() {
        return M();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long C() {
        return N();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int D() {
        return androidx.datastore.preferences.protobuf.j.d(O());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long E() {
        return androidx.datastore.preferences.protobuf.j.e(P());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String F() throws c0 {
        int iO = O();
        if (iO > 0) {
            int i10 = this.f4178d;
            int i11 = this.f4180f;
            if (iO <= i10 - i11) {
                String str = new String(this.f4177c, i11, iO, a0.f4133a);
                this.f4180f += iO;
                return str;
            }
        }
        if (iO == 0) {
            return "";
        }
        if (iO < 0) {
            throw c0.e();
        }
        throw c0.g();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String G() throws c0 {
        int iO = O();
        if (iO > 0) {
            int i10 = this.f4178d;
            int i11 = this.f4180f;
            if (iO <= i10 - i11) {
                String strB = q1.f4215a.B(i11, this.f4177c, iO);
                this.f4180f += iO;
                return strB;
            }
        }
        if (iO == 0) {
            return "";
        }
        if (iO <= 0) {
            throw c0.e();
        }
        throw c0.g();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int H() throws c0 {
        if (g()) {
            this.A = 0;
            return 0;
        }
        int iO = O();
        this.A = iO;
        if ((iO >>> 3) != 0) {
            return iO;
        }
        throw c0.a();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int I() {
        return O();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long J() {
        return P();
    }

    public final int M() throws c0 {
        int i10 = this.f4180f;
        if (this.f4178d - i10 < 4) {
            throw c0.g();
        }
        this.f4180f = i10 + 4;
        byte[] bArr = this.f4177c;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long N() throws c0 {
        int i10 = this.f4180f;
        if (this.f4178d - i10 < 8) {
            throw c0.g();
        }
        this.f4180f = i10 + 8;
        byte[] bArr = this.f4177c;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final int O() {
        int i10;
        int i11 = this.f4180f;
        int i12 = this.f4178d;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f4177c;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f4180f = i13;
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
                this.f4180f = i14;
                return i10;
            }
        }
        return (int) Q();
    }

    public final long P() {
        long j;
        long j4;
        long j10;
        long j11;
        int i10 = this.f4180f;
        int i11 = this.f4178d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f4177c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f4180f = i12;
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
                this.f4180f = i13;
                return j;
            }
        }
        return Q();
    }

    public final long Q() throws c0 {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f4180f;
            if (i11 == this.f4178d) {
                throw c0.g();
            }
            this.f4180f = i11 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i10;
            if ((this.f4177c[i11] & 128) == 0) {
                return j;
            }
        }
        throw c0.d();
    }

    public final void R() {
        int i10 = this.f4178d + this.f4179e;
        this.f4178d = i10;
        int i11 = i10 - this.f4181z;
        int i12 = this.B;
        if (i11 <= i12) {
            this.f4179e = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f4179e = i13;
        this.f4178d = i10 - i13;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void b(int i10) throws c0 {
        if (this.A != i10) {
            throw new c0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int f() {
        return this.f4180f - this.f4181z;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean g() {
        return this.f4180f == this.f4178d;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void o(int i10) {
        this.B = i10;
        R();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int q(int i10) {
        if (i10 < 0) {
            throw c0.e();
        }
        int iF = f() + i10;
        if (iF < 0) {
            throw c0.f();
        }
        int i11 = this.B;
        if (iF > i11) {
            throw c0.g();
        }
        this.B = iF;
        R();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean r() {
        return P() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // androidx.datastore.preferences.protobuf.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.crypto.tink.shaded.protobuf.h t() throws com.google.crypto.tink.shaded.protobuf.c0 {
        /*
            r4 = this;
            int r0 = r4.O()
            byte[] r1 = r4.f4177c
            if (r0 <= 0) goto L19
            int r2 = r4.f4178d
            int r3 = r4.f4180f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.i.i(r3, r1, r0)
            int r2 = r4.f4180f
            int r2 = r2 + r0
            r4.f4180f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.crypto.tink.shaded.protobuf.h r0 = com.google.crypto.tink.shaded.protobuf.i.f4171b
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f4178d
            int r3 = r4.f4180f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f4180f = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = com.google.crypto.tink.shaded.protobuf.a0.f4134b
        L35:
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.i.f4171b
            com.google.crypto.tink.shaded.protobuf.h r1 = new com.google.crypto.tink.shaded.protobuf.h
            r1.<init>(r0)
            return r1
        L3d:
            com.google.crypto.tink.shaded.protobuf.c0 r0 = com.google.crypto.tink.shaded.protobuf.c0.e()
            throw r0
        L42:
            com.google.crypto.tink.shaded.protobuf.c0 r0 = com.google.crypto.tink.shaded.protobuf.c0.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.j.t():com.google.crypto.tink.shaded.protobuf.h");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final double u() {
        return Double.longBitsToDouble(N());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int v() {
        return O();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int w() {
        return M();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long x() {
        return N();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final float y() {
        return Float.intBitsToFloat(M());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int z() {
        return O();
    }
}
