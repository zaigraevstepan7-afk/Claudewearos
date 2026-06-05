package q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends k {

    /* renamed from: f, reason: collision with root package name */
    public int f13138f;

    public v(int i10) {
        this.f13096a = n0.f13108a;
        this.f13097b = m.f13105a;
        this.f13098c = r.a.f13650c;
        if (i10 >= 0) {
            f(n0.d(i10));
        } else {
            r.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f13100e = 0;
        long[] jArr = this.f13096a;
        if (jArr != n0.f13108a) {
            qi.k.n0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f13096a;
            int i10 = this.f13099d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        qi.k.m0(0, this.f13099d, null, this.f13098c);
        this.f13138f = n0.a(this.f13099d) - this.f13100e;
    }

    public final int d(int i10) {
        long j;
        long j4;
        int i11;
        long j10;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i12;
        int i13 = -862048943;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f13099d;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr3 = this.f13096a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            long j11 = ((jArr3[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr3[i20] >>> i21);
            long j12 = i16;
            int i23 = i19;
            int i24 = 0;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j14) >> 3)) & i17;
                int i25 = i13;
                int i26 = i24;
                if (this.f13097b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i13 = i25;
                i24 = i26;
            }
            int i27 = i13;
            int i28 = i24;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iE = e(i15);
                long j15 = 255;
                if (this.f13138f != 0 || ((this.f13096a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j4 = j12;
                    i11 = 1;
                    j10 = 128;
                } else {
                    int i29 = this.f13099d;
                    if (i29 > 8) {
                        j10 = 128;
                        if (Long.compareUnsigned(this.f13100e * 32, i29 * 25) <= 0) {
                            long[] jArr4 = this.f13096a;
                            int i30 = this.f13099d;
                            int[] iArr2 = this.f13097b;
                            Object[] objArr2 = this.f13098c;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = i28;
                            while (i32 < i31) {
                                long j16 = j15;
                                long j17 = jArr4[i32] & (-9187201950435737472L);
                                jArr4[i32] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i32++;
                                j12 = j12;
                                j15 = j16;
                            }
                            j = j15;
                            j4 = j12;
                            int iQ0 = qi.k.q0(jArr4);
                            int i33 = iQ0 - 1;
                            long j18 = 72057594037927935L;
                            jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iQ0] = jArr4[i28];
                            int i34 = i28;
                            while (i34 != i30) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j19 = (jArr4[i35] >> i36) & j;
                                if (j19 != 128 && j19 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i34]) * i27;
                                    int i37 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iE2 = e(i37);
                                    int i38 = i37 & i30;
                                    if (((iE2 - i38) & i30) / 8 == ((i34 - i38) & i30) / 8) {
                                        long j20 = j18;
                                        jArr4[i35] = ((r8 & 127) << i36) | ((~(j << i36)) & jArr4[i35]);
                                        jArr4[jArr4.length - i22] = (jArr4[i28] & j20) | Long.MIN_VALUE;
                                        i34++;
                                        j18 = j20;
                                    } else {
                                        long j21 = j18;
                                        int i39 = iE2 >> 3;
                                        long j22 = jArr4[i39];
                                        int i40 = (iE2 & 7) << 3;
                                        if (((j22 >> i40) & j) == 128) {
                                            i12 = i22;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i39] = ((~(j << i40)) & j22) | ((r8 & 127) << i40);
                                            jArr4[i35] = (jArr4[i35] & (~(j << i36))) | (128 << i36);
                                            iArr[iE2] = iArr[i34];
                                            iArr[i34] = i28;
                                            objArr[iE2] = objArr[i34];
                                            objArr[i34] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i12 = i22;
                                            jArr4[i39] = ((r8 & 127) << i40) | ((~(j << i40)) & j22);
                                            int i41 = iArr[iE2];
                                            iArr[iE2] = iArr[i34];
                                            iArr[i34] = i41;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i34];
                                            objArr[i34] = obj;
                                            i34--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i28] & j21) | Long.MIN_VALUE;
                                        i34++;
                                        j18 = j21;
                                        i22 = i12;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i34++;
                                }
                            }
                            i11 = i22;
                            this.f13138f = n0.a(this.f13099d) - this.f13100e;
                        }
                        iE = e(i15);
                    } else {
                        j10 = 128;
                    }
                    j = 255;
                    j4 = j12;
                    i11 = 1;
                    int iB = n0.b(this.f13099d);
                    long[] jArr5 = this.f13096a;
                    int[] iArr3 = this.f13097b;
                    Object[] objArr3 = this.f13098c;
                    int i42 = this.f13099d;
                    f(iB);
                    long[] jArr6 = this.f13096a;
                    int[] iArr4 = this.f13097b;
                    Object[] objArr4 = this.f13098c;
                    int i43 = this.f13099d;
                    int i44 = i28;
                    while (i44 < i42) {
                        if (((jArr5[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j10) {
                            int i45 = iArr3[i44];
                            int iHashCode3 = Integer.hashCode(i45) * i27;
                            int i46 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i46 >>> 7);
                            long j23 = i46 & 127;
                            int i47 = iE3 >> 3;
                            int i48 = (iE3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j24 = (jArr6[i47] & (~(255 << i48))) | (j23 << i48);
                            jArr[i47] = j24;
                            jArr[(((iE3 - 7) & i43) + (i43 & 7)) >> 3] = j24;
                            iArr4[iE3] = i45;
                            objArr4[iE3] = objArr3[i44];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i44++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iE = e(i15);
                }
                this.f13100e++;
                int i49 = this.f13138f;
                long[] jArr7 = this.f13096a;
                int i50 = iE >> 3;
                long j25 = jArr7[i50];
                int i51 = (iE & 7) << 3;
                if (((j25 >> i51) & j) != j10) {
                    i11 = i28;
                }
                this.f13138f = i49 - i11;
                int i52 = this.f13099d;
                long j26 = (j25 & (~(j << i51))) | (j4 << i51);
                jArr7[i50] = j26;
                jArr7[(((iE - 7) & i52) + (i52 & 7)) >> 3] = j26;
                return iE;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i27;
        }
    }

    public final int e(int i10) {
        int i11 = this.f13099d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f13096a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j4 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j4 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j4) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, n0.c(i10)) : 0;
        this.f13099d = iMax;
        if (iMax == 0) {
            jArr = n0.f13108a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qi.k.n0(jArr, -9187201950435737472L);
        }
        this.f13096a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f13138f = n0.a(this.f13099d) - this.f13100e;
        this.f13097b = new int[iMax];
        this.f13098c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f13099d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f13096a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f13097b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object r14 = r13.h(r10)
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: q.v.g(int):java.lang.Object");
    }

    public final Object h(int i10) {
        this.f13100e--;
        long[] jArr = this.f13096a;
        int i11 = this.f13099d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
        Object[] objArr = this.f13098c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void i(int i10, Object obj) {
        int iD = d(i10);
        this.f13097b[iD] = i10;
        this.f13098c[iD] = obj;
    }

    public /* synthetic */ v() {
        this(6);
    }
}
