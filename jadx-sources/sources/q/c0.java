package q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f13040a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f13041b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f13042c;

    /* renamed from: d, reason: collision with root package name */
    public int f13043d;

    /* renamed from: e, reason: collision with root package name */
    public int f13044e;

    /* renamed from: f, reason: collision with root package name */
    public int f13045f;

    public final int a(int i10) {
        int i11 = this.f13043d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f13040a;
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

    public final int b(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f13043d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f13040a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j4 = (i12 * 72340172838076673L) ^ j;
            for (long j10 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i15) & i13;
                if (fj.l.b(this.f13041b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final void c(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, n0.c(i10)) : 0;
        this.f13043d = iMax;
        if (iMax == 0) {
            jArr = n0.f13108a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qi.k.n0(jArr, -9187201950435737472L);
        }
        this.f13040a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f13045f = n0.a(this.f13043d) - this.f13044e;
        this.f13041b = new Object[iMax];
        this.f13042c = new long[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof q.c0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            q.c0 r1 = (q.c0) r1
            int r3 = r1.f13044e
            int r5 = r0.f13044e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f13041b
            long[] r5 = r0.f13042c
            long[] r6 = r0.f13040a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L69
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L64
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L62
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5e
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r16 = r5[r14]
            int r14 = r1.b(r15)
            if (r14 < 0) goto L5d
            long[] r15 = r1.f13042c
            r14 = r15[r14]
            int r14 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r14 == 0) goto L5e
        L5d:
            return r4
        L5e:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L62:
            if (r11 != r12) goto L69
        L64:
            if (r8 == r7) goto L69
            int r8 = r8 + 1
            goto L23
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q.c0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.f13041b;
        long[] jArr = this.f13042c;
        long[] jArr2 = this.f13040a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i13]);
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final String toString() {
        int i10;
        int i11;
        if (this.f13044e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f13041b;
        long[] jArr = this.f13042c;
        long[] jArr2 = this.f13040a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j = jArr2[i12];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j) < 128) {
                            int i16 = (i12 << 3) + i15;
                            Object obj = objArr[i16];
                            i11 = i12;
                            long j4 = jArr[i16];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(j4);
                            i13++;
                            if (i13 < this.f13044e) {
                                sb2.append(", ");
                            }
                        } else {
                            i11 = i12;
                        }
                        j >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i17 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i17;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        fj.l.e(string, "toString(...)");
        return string;
    }
}
