package q;

import c2.x0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f13047a = n0.f13108a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f13048b = r.a.f13650c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f13049c = q.f13119b;

    /* renamed from: d, reason: collision with root package name */
    public int f13050d = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: e, reason: collision with root package name */
    public int f13051e = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: f, reason: collision with root package name */
    public int f13052f;

    /* renamed from: g, reason: collision with root package name */
    public int f13053g;

    /* renamed from: h, reason: collision with root package name */
    public int f13054h;

    public d0(int i10) {
        if (i10 >= 0) {
            f(n0.d(i10));
        } else {
            r.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i10 = this.f13053g;
        int iD = d(obj);
        this.f13048b[iD] = obj;
        long[] jArr = this.f13049c;
        int i11 = this.f13050d;
        jArr[iD] = (i11 & 2147483647L) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((iD & 2147483647L) << 31) | (jArr[i11] & (-4611686016279904257L));
        }
        this.f13050d = iD;
        if (this.f13051e == Integer.MAX_VALUE) {
            this.f13051e = iD;
        }
        return this.f13053g != i10;
    }

    public final void b() {
        this.f13053g = 0;
        long[] jArr = this.f13047a;
        if (jArr != n0.f13108a) {
            qi.k.n0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f13047a;
            int i10 = this.f13052f;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        qi.k.m0(0, this.f13052f, null, this.f13048b);
        qi.k.n0(this.f13049c, 4611686018427387903L);
        this.f13050d = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f13051e = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f13054h = n0.a(this.f13052f) - this.f13053g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f13052f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f13047a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f13048b
            r15 = r15[r11]
            boolean r15 = fj.l.b(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d0.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        int i10;
        long j;
        long j4;
        long j10;
        char c6;
        long[] jArr;
        long[] jArr2;
        long j11;
        int i11 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f13052f;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f13047a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j12 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j13 = i14;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                int i20 = i11;
                if (fj.l.b(this.f13048b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i11 = i20;
            }
            int i21 = i11;
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i13);
                long j16 = 255;
                if (this.f13054h != 0 || ((this.f13047a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i10 = 0;
                    j = j13;
                    j4 = 255;
                    j10 = 128;
                } else {
                    int i22 = this.f13052f;
                    if (i22 > 8) {
                        c6 = 31;
                        j10 = 128;
                        if (Long.compareUnsigned(this.f13053g * 32, i22 * 25) <= 0) {
                            long[] jArr4 = this.f13047a;
                            if (jArr4 == null) {
                                i10 = 0;
                                j = j13;
                                j4 = 255;
                            } else {
                                int i23 = this.f13052f;
                                Object[] objArr = this.f13048b;
                                long[] jArr5 = this.f13049c;
                                long[] jArr6 = new long[i23];
                                Arrays.fill(jArr6, 0, i23, 9223372034707292159L);
                                i10 = 0;
                                int i24 = (i23 + 7) >> 3;
                                int i25 = 0;
                                while (i25 < i24) {
                                    long j17 = j16;
                                    long j18 = jArr4[i25] & (-9187201950435737472L);
                                    int i26 = i25;
                                    jArr4[i26] = ((~j18) + (j18 >>> 7)) & (-72340172838076674L);
                                    i25 = i26 + 1;
                                    j16 = j17;
                                }
                                j4 = j16;
                                int length = jArr4.length;
                                int i27 = length - 1;
                                int i28 = length - 2;
                                jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i27] = jArr4[0];
                                int i29 = 0;
                                while (i29 != i23) {
                                    int i30 = i29 >> 3;
                                    int i31 = (i29 & 7) << 3;
                                    long j19 = (jArr4[i30] >> i31) & j4;
                                    if (j19 != 128 && j19 == 254) {
                                        Object obj2 = objArr[i29];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                        int i32 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                        int iE2 = e(i32);
                                        int i33 = i32 & i23;
                                        if (((iE2 - i33) & i23) / 8 == ((i29 - i33) & i23) / 8) {
                                            int i34 = i23;
                                            Object[] objArr2 = objArr;
                                            jArr4[i30] = (jArr4[i30] & (~(j4 << i31))) | ((r17 & 127) << i31);
                                            if (jArr6[i29] == 9223372034707292159L) {
                                                long j20 = i29;
                                                jArr6[i29] = j20 | (j20 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i29++;
                                            i23 = i34;
                                            objArr = objArr2;
                                        } else {
                                            int i35 = i23;
                                            Object[] objArr3 = objArr;
                                            int i36 = iE2 >> 3;
                                            long j21 = jArr4[i36];
                                            int i37 = (iE2 & 7) << 3;
                                            if (((j21 >> i37) & j4) == 128) {
                                                jArr4[i36] = (j21 & (~(j4 << i37))) | ((r17 & 127) << i37);
                                                jArr4[i30] = (jArr4[i30] & (~(j4 << i31))) | (128 << i31);
                                                objArr3[iE2] = objArr3[i29];
                                                objArr3[i29] = null;
                                                jArr5[iE2] = jArr5[i29];
                                                jArr5[i29] = 4611686018427387903L;
                                                int i38 = (int) ((jArr6[i29] >> 32) & 4294967295L);
                                                int i39 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                                                if (i38 != Integer.MAX_VALUE) {
                                                    j11 = j13;
                                                    jArr6[i38] = iE2 | (jArr6[i38] & (-4294967296L));
                                                    jArr6[i29] = (jArr6[i29] & 4294967295L) | (-4294967296L);
                                                    i39 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                                                } else {
                                                    j11 = j13;
                                                    jArr6[i29] = (com.google.android.gms.common.api.f.API_PRIORITY_OTHER << 32) | iE2;
                                                }
                                                jArr6[iE2] = (i29 << 32) | i39;
                                            } else {
                                                j11 = j13;
                                                jArr4[i36] = ((r17 & 127) << i37) | (j21 & (~(j4 << i37)));
                                                Object obj3 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i29];
                                                objArr3[i29] = obj3;
                                                long j22 = jArr5[iE2];
                                                jArr5[iE2] = jArr5[i29];
                                                jArr5[i29] = j22;
                                                int i40 = (int) ((jArr6[i29] >> 32) & 4294967295L);
                                                if (i40 != Integer.MAX_VALUE) {
                                                    long j23 = iE2;
                                                    jArr6[i40] = (jArr6[i40] & (-4294967296L)) | j23;
                                                    jArr6[i29] = (jArr6[i29] & 4294967295L) | (j23 << 32);
                                                } else {
                                                    long j24 = iE2;
                                                    jArr6[i29] = j24 | (j24 << 32);
                                                    i40 = i29;
                                                }
                                                jArr6[iE2] = (i40 << 32) | i29;
                                                i29--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i29++;
                                            i23 = i35;
                                            objArr = objArr3;
                                            j13 = j11;
                                        }
                                    } else {
                                        i29++;
                                    }
                                }
                                j = j13;
                                this.f13054h = n0.a(this.f13052f) - this.f13053g;
                                long[] jArr7 = this.f13049c;
                                int length2 = jArr7.length;
                                for (int i41 = 0; i41 < length2; i41++) {
                                    long j25 = jArr7[i41];
                                    jArr7[i41] = (((j25 & (-4611686018427387904L)) | (((int) ((j25 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j25 & 2147483647L)) == Integer.MAX_VALUE ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i42 = this.f13050d;
                                if (i42 != Integer.MAX_VALUE) {
                                    this.f13050d = (int) (jArr6[i42] & 4294967295L);
                                }
                                int i43 = this.f13051e;
                                if (i43 != Integer.MAX_VALUE) {
                                    this.f13051e = (int) (jArr6[i43] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i13);
                    } else {
                        c6 = 31;
                        j10 = 128;
                    }
                    i10 = 0;
                    j = j13;
                    j4 = 255;
                    int iB = n0.b(this.f13052f);
                    long[] jArr8 = this.f13047a;
                    Object[] objArr4 = this.f13048b;
                    long[] jArr9 = this.f13049c;
                    int i44 = this.f13052f;
                    int[] iArr = new int[i44];
                    f(iB);
                    long[] jArr10 = this.f13047a;
                    Object[] objArr5 = this.f13048b;
                    long[] jArr11 = this.f13049c;
                    int i45 = this.f13052f;
                    int i46 = 0;
                    while (i46 < i44) {
                        if (((jArr8[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < j10) {
                            Object obj4 = objArr4[i46];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i47 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i47 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j26 = i47 & 127;
                            int i48 = iE3 >> 3;
                            int i49 = (iE3 & 7) << 3;
                            long j27 = (jArr[i48] & (~(255 << i49))) | (j26 << i49);
                            jArr[i48] = j27;
                            jArr[(((iE3 - 7) & i45) + (i45 & 7)) >> 3] = j27;
                            objArr5[iE3] = obj4;
                            jArr11[iE3] = jArr9[i46];
                            iArr[i46] = iE3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i46++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f13049c;
                    int length3 = jArr12.length;
                    for (int i50 = 0; i50 < length3; i50++) {
                        long j28 = jArr12[i50];
                        jArr12[i50] = (((j28 & (-4611686018427387904L)) | (((int) ((j28 >> c6) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c6) | (((int) (j28 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i51 = this.f13050d;
                    if (i51 != Integer.MAX_VALUE) {
                        this.f13050d = iArr[i51];
                    }
                    int i52 = this.f13051e;
                    if (i52 != Integer.MAX_VALUE) {
                        this.f13051e = iArr[i52];
                    }
                    iE = e(i13);
                }
                this.f13053g++;
                int i53 = this.f13054h;
                long[] jArr13 = this.f13047a;
                int i54 = iE >> 3;
                long j29 = jArr13[i54];
                int i55 = (iE & 7) << 3;
                if (((j29 >> i55) & j4) == j10) {
                    i10 = 1;
                }
                this.f13054h = i53 - i10;
                int i56 = this.f13052f;
                long j30 = (j29 & (~(j4 << i55))) | (j << i55);
                jArr13[i54] = j30;
                jArr13[(((iE - 7) & i56) + (i56 & 7)) >> 3] = j30;
                return iE;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i11 = i21;
        }
    }

    public final int e(int i10) {
        int i11 = this.f13052f;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f13047a;
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof q.d0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            q.d0 r1 = (q.d0) r1
            int r3 = r1.f13053g
            int r5 = r0.f13053g
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f13048b
            long[] r5 = r0.f13047a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.c(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d0.equals(java.lang.Object):boolean");
    }

    public final void f(int i10) {
        long[] jArr;
        long[] jArr2;
        int iMax = i10 > 0 ? Math.max(7, n0.c(i10)) : 0;
        this.f13052f = iMax;
        if (iMax == 0) {
            jArr = n0.f13108a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qi.k.n0(jArr, -9187201950435737472L);
        }
        this.f13047a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f13054h = n0.a(this.f13052f) - this.f13053g;
        this.f13048b = iMax == 0 ? r.a.f13650c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = q.f13119b;
        } else {
            jArr2 = new long[iMax];
            qi.k.n0(jArr2, 4611686018427387903L);
        }
        this.f13049c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f13052f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f13047a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f13048b
            r15 = r15[r11]
            boolean r15 = fj.l.b(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d0.g(java.lang.Object):boolean");
    }

    public final void h(int i10) {
        this.f13053g--;
        long[] jArr = this.f13047a;
        int i11 = this.f13052f;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
        this.f13048b[i10] = null;
        long[] jArr2 = this.f13049c;
        long j4 = jArr2[i10];
        int i14 = (int) ((j4 >> 31) & 2147483647L);
        int i15 = (int) (j4 & 2147483647L);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & (-2147483648L)) | (i15 & 2147483647L);
        } else {
            this.f13050d = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((i14 & 2147483647L) << 31) | (jArr2[i15] & (-4611686016279904257L));
        } else {
            this.f13051e = i14;
        }
        jArr2[i10] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f13052f * 31) + this.f13053g;
        Object[] objArr = this.f13048b;
        long[] jArr = this.f13047a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!fj.l.b(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        return iHashCode;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.util.Collection r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            fj.l.f(r1, r2)
            java.lang.Object[] r2 = r0.f13048b
            int r3 = r0.f13053g
            long[] r4 = r0.f13047a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = qi.l.w0(r14, r15)
            if (r14 != 0) goto L4c
            r0.h(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0.f13053g
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d0.i(java.util.Collection):boolean");
    }

    public final String toString() {
        x0 x0Var = new x0(this, 10);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f13048b;
        long[] jArr = this.f13049c;
        int i10 = this.f13051e;
        int i11 = 0;
        while (true) {
            if (i10 == Integer.MAX_VALUE) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj = objArr[i10];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) x0Var.invoke(obj));
            i11++;
            i10 = i12;
        }
        String string = sb2.toString();
        fj.l.e(string, "toString(...)");
        return string;
    }
}
