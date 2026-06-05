package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l1 extends a.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f967c;

    public /* synthetic */ l1(int i10) {
        this.f967c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String t(int r11, byte[] r12, int r13) throws androidx.datastore.preferences.protobuf.a0 {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.l1.t(int, byte[], int):java.lang.String");
    }

    @Override // a.a
    public final int z(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        long j;
        char c6;
        long j4;
        long j10;
        char c10;
        int i14;
        char cCharAt2;
        switch (this.f967c) {
            case 0:
                int length = str.length();
                int i15 = i11 + i10;
                int i16 = 0;
                while (i16 < length && (i13 = i16 + i10) < i15 && (cCharAt = str.charAt(i16)) < '\u0080') {
                    bArr[i13] = (byte) cCharAt;
                    i16++;
                }
                if (i16 == length) {
                    return i10 + length;
                }
                int i17 = i10 + i16;
                while (i16 < length) {
                    char cCharAt3 = str.charAt(i16);
                    if (cCharAt3 < '\u0080' && i17 < i15) {
                        bArr[i17] = (byte) cCharAt3;
                        i17++;
                    } else if (cCharAt3 < '\u0800' && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt3 >>> 6) | 960);
                        i17 += 2;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= '\ud800' && '\udfff' >= cCharAt3) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if ('\ud800' <= cCharAt3 && cCharAt3 <= '\udfff' && ((i12 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i12)))) {
                                    throw new m1(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != str.length()) {
                                char cCharAt4 = str.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i20 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i17 += 4;
                                    bArr[i20] = (byte) ((codePoint & 63) | 128);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new m1(i16 - 1, length);
                        }
                        bArr[i17] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i21 = i17 + 2;
                        bArr[i17 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i17 += 3;
                        bArr[i21] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i16++;
                }
                return i17;
            default:
                long j11 = i10;
                long j12 = i11 + j11;
                int length2 = str.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i22 = 0;
                while (true) {
                    j = 1;
                    c6 = '\u0080';
                    if (i22 < length2 && (cCharAt2 = str.charAt(i22)) < '\u0080') {
                        k1.j(bArr, j11, (byte) cCharAt2);
                        i22++;
                        j11 = 1 + j11;
                    }
                }
                if (i22 == length2) {
                    return (int) j11;
                }
                while (i22 < length2) {
                    char cCharAt5 = str.charAt(i22);
                    if (cCharAt5 < c6 && j11 < j12) {
                        k1.j(bArr, j11, (byte) cCharAt5);
                        c10 = c6;
                        j4 = j;
                        j10 = j11 + j;
                    } else if (cCharAt5 >= '\u0800' || j11 > j12 - 2) {
                        j4 = j;
                        if ((cCharAt5 >= '\ud800' && '\udfff' >= cCharAt5) || j11 > j12 - 3) {
                            long j13 = j11;
                            if (j13 > j12 - 4) {
                                if ('\ud800' <= cCharAt5 && cCharAt5 <= '\udfff' && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                    throw new m1(i22, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j13);
                            }
                            int i23 = i22 + 1;
                            if (i23 != length2) {
                                char cCharAt6 = str.charAt(i23);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    k1.j(bArr, j13, (byte) ((codePoint2 >>> 18) | 240));
                                    c10 = '\u0080';
                                    k1.j(bArr, j13 + j4, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    k1.j(bArr, j13 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    k1.j(bArr, j13 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j10 = j13 + 4;
                                    i22 = i23;
                                } else {
                                    i22 = i23;
                                }
                            }
                            throw new m1(i22 - 1, length2);
                        }
                        k1.j(bArr, j11, (byte) ((cCharAt5 >>> '\f') | 480));
                        long j14 = j11;
                        k1.j(bArr, j11 + j4, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j10 = j14 + 3;
                        k1.j(bArr, j14 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c10 = '\u0080';
                    } else {
                        j4 = j;
                        k1.j(bArr, j11, (byte) ((cCharAt5 >>> 6) | 960));
                        k1.j(bArr, j11 + j4, (byte) ((cCharAt5 & '?') | c6));
                        j10 = j11 + 2;
                        c10 = c6;
                    }
                    i22++;
                    c6 = c10;
                    j11 = j10;
                    j = j4;
                }
                return (int) j11;
        }
    }
}
