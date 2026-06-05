package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends j {
    public int A;
    public int B = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f933c;

    /* renamed from: d, reason: collision with root package name */
    public int f934d;

    /* renamed from: e, reason: collision with root package name */
    public int f935e;

    /* renamed from: f, reason: collision with root package name */
    public int f936f;

    /* renamed from: z, reason: collision with root package name */
    public final int f937z;

    public h(byte[] bArr, int i10, int i11, boolean z2) {
        this.f933c = bArr;
        this.f934d = i11 + i10;
        this.f936f = i10;
        this.f937z = i10;
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
        int iO = O();
        return (-(iO & 1)) ^ (iO >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long E() {
        long jP = P();
        return (-(jP & 1)) ^ (jP >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String F() throws a0 {
        int iO = O();
        if (iO > 0) {
            int i10 = this.f934d;
            int i11 = this.f936f;
            if (iO <= i10 - i11) {
                String str = new String(this.f933c, i11, iO, y.f1035a);
                this.f936f += iO;
                return str;
            }
        }
        if (iO == 0) {
            return "";
        }
        if (iO < 0) {
            throw a0.d();
        }
        throw a0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String G() throws a0 {
        int iO = O();
        if (iO > 0) {
            int i10 = this.f934d;
            int i11 = this.f936f;
            if (iO <= i10 - i11) {
                String strT = n1.f976a.t(i11, this.f933c, iO);
                this.f936f += iO;
                return strT;
            }
        }
        if (iO == 0) {
            return "";
        }
        if (iO <= 0) {
            throw a0.d();
        }
        throw a0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int H() throws a0 {
        if (g()) {
            this.A = 0;
            return 0;
        }
        int iO = O();
        this.A = iO;
        if ((iO >>> 3) != 0) {
            return iO;
        }
        throw new a0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int I() {
        return O();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long J() {
        return P();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean K(int i10) throws a0 {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                S(8);
                return true;
            }
            if (i11 == 2) {
                S(O());
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
            S(4);
            return true;
        }
        int i13 = this.f934d - this.f936f;
        byte[] bArr = this.f933c;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f936f;
                this.f936f = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw a0.c();
        }
        while (i12 < 10) {
            int i15 = this.f936f;
            if (i15 == this.f934d) {
                throw a0.e();
            }
            this.f936f = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw a0.c();
        return true;
    }

    public final int M() throws a0 {
        int i10 = this.f936f;
        if (this.f934d - i10 < 4) {
            throw a0.e();
        }
        this.f936f = i10 + 4;
        byte[] bArr = this.f933c;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long N() throws a0 {
        int i10 = this.f936f;
        if (this.f934d - i10 < 8) {
            throw a0.e();
        }
        this.f936f = i10 + 8;
        byte[] bArr = this.f933c;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final int O() {
        int i10;
        int i11 = this.f936f;
        int i12 = this.f934d;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f933c;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f936f = i13;
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
                this.f936f = i14;
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
        int i10 = this.f936f;
        int i11 = this.f934d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f933c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f936f = i12;
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
                this.f936f = i13;
                return j;
            }
        }
        return Q();
    }

    public final long Q() throws a0 {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f936f;
            if (i11 == this.f934d) {
                throw a0.e();
            }
            this.f936f = i11 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i10;
            if ((this.f933c[i11] & 128) == 0) {
                return j;
            }
        }
        throw a0.c();
    }

    public final void R() {
        int i10 = this.f934d + this.f935e;
        this.f934d = i10;
        int i11 = i10 - this.f937z;
        int i12 = this.B;
        if (i11 <= i12) {
            this.f935e = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f935e = i13;
        this.f934d = i10 - i13;
    }

    public final void S(int i10) throws a0 {
        if (i10 >= 0) {
            int i11 = this.f934d;
            int i12 = this.f936f;
            if (i10 <= i11 - i12) {
                this.f936f = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw a0.e();
        }
        throw a0.d();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void b(int i10) throws a0 {
        if (this.A != i10) {
            throw new a0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int f() {
        return this.f936f - this.f937z;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean g() {
        return this.f936f == this.f934d;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void o(int i10) {
        this.B = i10;
        R();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int q(int i10) throws a0 {
        if (i10 < 0) {
            throw a0.d();
        }
        int iF = f() + i10;
        if (iF < 0) {
            throw new a0("Failed to parse the message.");
        }
        int i11 = this.B;
        if (iF > i11) {
            throw a0.e();
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
    public final androidx.datastore.preferences.protobuf.g s() throws androidx.datastore.preferences.protobuf.a0 {
        /*
            r4 = this;
            int r0 = r4.O()
            byte[] r1 = r4.f933c
            if (r0 <= 0) goto L19
            int r2 = r4.f934d
            int r3 = r4.f936f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.g.i(r3, r1, r0)
            int r2 = r4.f936f
            int r2 = r2 + r0
            r4.f936f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            androidx.datastore.preferences.protobuf.g r0 = androidx.datastore.preferences.protobuf.g.f927c
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f934d
            int r3 = r4.f936f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f936f = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = androidx.datastore.preferences.protobuf.y.f1036b
        L35:
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.g.f927c
            androidx.datastore.preferences.protobuf.g r1 = new androidx.datastore.preferences.protobuf.g
            r1.<init>(r0)
            return r1
        L3d:
            androidx.datastore.preferences.protobuf.a0 r0 = androidx.datastore.preferences.protobuf.a0.d()
            throw r0
        L42:
            androidx.datastore.preferences.protobuf.a0 r0 = androidx.datastore.preferences.protobuf.a0.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.s():androidx.datastore.preferences.protobuf.g");
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
