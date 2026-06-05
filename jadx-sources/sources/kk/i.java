package kk;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class i implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final i f9700d = new i(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9701a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f9702b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f9703c;

    public i(byte[] bArr) {
        fj.l.f(bArr, "data");
        this.f9701a = bArr;
    }

    public static /* synthetic */ i B(i iVar, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = -1234567890;
        }
        return iVar.A(i10, i11);
    }

    public static final i b(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (lk.b.a(str.charAt(i11 + 1)) + (lk.b.a(str.charAt(i11)) << 4));
        }
        return new i(bArr);
    }

    public static int o(i iVar, i iVar2) {
        iVar.getClass();
        fj.l.f(iVar2, "other");
        return iVar.i(0, iVar2.p());
    }

    public static int x(i iVar, i iVar2) {
        iVar.getClass();
        fj.l.f(iVar2, "other");
        return iVar.w(iVar2.p());
    }

    public i A(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = e();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f9701a;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException(m6.a.g(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i11 - i10 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i10 == 0 && i11 == bArr.length) {
            return this;
        }
        x8.a.r(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        fj.l.e(bArrCopyOfRange, "copyOfRange(...)");
        return new i(bArrCopyOfRange);
    }

    public i C() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f9701a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                fj.l.e(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new i(bArrCopyOf);
            }
            i10++;
        }
    }

    public final String D() {
        String str = this.f9703c;
        if (str != null) {
            return str;
        }
        byte[] bArrP = p();
        fj.l.f(bArrP, "<this>");
        String str2 = new String(bArrP, nj.a.f12342a);
        this.f9703c = str2;
        return str2;
    }

    public void E(f fVar, int i10) {
        fVar.Q(i10, this.f9701a);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        fj.l.f(iVar, "other");
        int iE = e();
        int iE2 = iVar.e();
        int iMin = Math.min(iE, iE2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iR = r(i10) & 255;
            int iR2 = iVar.r(i10) & 255;
            if (iR != iR2) {
                return iR < iR2 ? -1 : 1;
            }
        }
        if (iE == iE2) {
            return 0;
        }
        return iE < iE2 ? -1 : 1;
    }

    public int e() {
        return this.f9701a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int iE = iVar.e();
            byte[] bArr = this.f9701a;
            if (iE == bArr.length && iVar.z(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.f9701a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = lk.b.f11001a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public int hashCode() {
        int i10 = this.f9702b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f9701a);
        this.f9702b = iHashCode;
        return iHashCode;
    }

    public int i(int i10, byte[] bArr) {
        fj.l.f(bArr, "other");
        byte[] bArr2 = this.f9701a;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!hj.a.k(bArr2, iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] p() {
        return this.f9701a;
    }

    public byte r(int i10) {
        return this.f9701a[i10];
    }

    public String toString() {
        i iVar;
        byte b10;
        int i10;
        byte[] bArr = this.f9701a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            if (i11 >= length) {
                break;
            }
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                int i14 = i13 + 1;
                if (i13 == 64) {
                    break;
                }
                if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (Byte.MAX_VALUE <= b11 && b11 < 160))) || b11 == 65533) {
                    break;
                }
                i12 += b11 < 65536 ? 1 : 2;
                i11++;
                while (true) {
                    i13 = i14;
                    if (i11 < length && (b10 = bArr[i11]) >= 0) {
                        i11++;
                        i14 = i13 + 1;
                        if (i13 == 64) {
                            break loop0;
                        }
                        if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (Byte.MAX_VALUE <= b10 && b10 < 160))) || b10 == 65533) {
                            break loop0;
                        }
                        i12 += b10 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b11 >> 5) == -2) {
                int i15 = i11 + 1;
                if (length > i15) {
                    byte b12 = bArr[i15];
                    if ((b12 & 192) == 128) {
                        int i16 = (b12 ^ 3968) ^ (b11 << 6);
                        if (i16 >= 128) {
                            i10 = i13 + 1;
                            if (i13 == 64) {
                                break;
                            }
                            if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                break;
                            }
                            i12 += i16 < 65536 ? 1 : 2;
                            i11 += 2;
                            i13 = i10;
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if ((b11 >> 4) == -2) {
                int i17 = i11 + 2;
                if (length > i17) {
                    byte b13 = bArr[i11 + 1];
                    if ((b13 & 192) == 128) {
                        byte b14 = bArr[i17];
                        if ((b14 & 192) == 128) {
                            int i18 = ((b14 ^ (-123008)) ^ (b13 << 6)) ^ (b11 << 12);
                            if (i18 < 2048) {
                                if (i13 != 64) {
                                    break;
                                }
                            } else if (55296 > i18 || i18 >= 57344) {
                                i10 = i13 + 1;
                                if (i13 == 64) {
                                    break;
                                }
                                if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                    break;
                                }
                                i12 += i18 < 65536 ? 1 : 2;
                                i11 += 3;
                                i13 = i10;
                            } else if (i13 != 64) {
                                break;
                            }
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if ((b11 >> 3) == -2) {
                int i19 = i11 + 3;
                if (length > i19) {
                    byte b15 = bArr[i11 + 1];
                    if ((b15 & 192) == 128) {
                        byte b16 = bArr[i11 + 2];
                        if ((b16 & 192) == 128) {
                            byte b17 = bArr[i19];
                            if ((b17 & 192) == 128) {
                                int i20 = (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12)) ^ (b11 << 18);
                                if (i20 > 1114111) {
                                    if (i13 != 64) {
                                        break;
                                    }
                                } else if (55296 > i20 || i20 >= 57344) {
                                    if (i20 >= 65536) {
                                        i10 = i13 + 1;
                                        if (i13 == 64) {
                                            break;
                                        }
                                        if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                                            break;
                                        }
                                        i12 += i20 < 65536 ? 1 : 2;
                                        i11 += 4;
                                        i13 = i10;
                                    } else if (i13 != 64) {
                                        break;
                                    }
                                } else if (i13 != 64) {
                                    break;
                                }
                            } else if (i13 != 64) {
                                break;
                            }
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if (i13 != 64) {
                break;
            }
        }
        i12 = -1;
        if (i12 != -1) {
            String strD = D();
            String strSubstring = strD.substring(0, i12);
            fj.l.e(strSubstring, "substring(...)");
            String strZ0 = nj.l.z0(nj.l.z0(nj.l.z0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i12 >= strD.length()) {
                return "[text=" + strZ0 + ']';
            }
            return "[size=" + bArr.length + " text=" + strZ0 + "\u2026]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + f() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(bArr.length);
        sb2.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(m6.a.g(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (64 == bArr.length) {
            iVar = this;
        } else {
            x8.a.r(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            fj.l.e(bArrCopyOfRange, "copyOfRange(...)");
            iVar = new i(bArrCopyOfRange);
        }
        sb2.append(iVar.f());
        sb2.append("\u2026]");
        return sb2.toString();
    }

    public int w(byte[] bArr) {
        fj.l.f(bArr, "other");
        int iE = e();
        byte[] bArr2 = this.f9701a;
        for (int iMin = Math.min(iE, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (hj.a.k(bArr2, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean y(int i10, i iVar, int i11) {
        fj.l.f(iVar, "other");
        return iVar.z(0, this.f9701a, i10, i11);
    }

    public boolean z(int i10, byte[] bArr, int i11, int i12) {
        fj.l.f(bArr, "other");
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.f9701a;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && hj.a.k(bArr2, i10, bArr, i11, i12);
    }
}
