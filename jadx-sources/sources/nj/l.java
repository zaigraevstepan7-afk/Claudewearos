package nj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class l extends k {
    public static boolean A0(String str, String str2) {
        fj.l.f(str, "<this>");
        fj.l.f(str2, "prefix");
        return str.startsWith(str2);
    }

    public static Integer B0(String str) {
        boolean z2;
        int i10;
        int i11;
        x8.a.n(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        if (fj.l.h(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z2 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i13 = Integer.MIN_VALUE;
                z2 = true;
            }
        } else {
            z2 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / 10))) || (i11 = i12 * 10) < i13 + iDigit) {
                return null;
            }
            i12 = i11 - iDigit;
            i10++;
        }
        return z2 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static boolean w0(String str, String str2, boolean z2) {
        fj.l.f(str2, "suffix");
        return !z2 ? str.endsWith(str2) : x0(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static final boolean x0(int i10, int i11, int i12, String str, String str2, boolean z2) {
        fj.l.f(str, "<this>");
        fj.l.f(str2, "other");
        return !z2 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z2, i10, str2, i11, i12);
    }

    public static String y0() {
        char cCharAt = "H".charAt(0);
        char[] cArr = new char[10];
        for (int i10 = 0; i10 < 10; i10++) {
            cArr[i10] = cCharAt;
        }
        return new String(cArr);
    }

    public static String z0(String str, String str2, String str3) {
        fj.l.f(str, "<this>");
        fj.l.f(str2, "oldValue");
        int iG0 = e.G0(str, str2, 0, false);
        if (iG0 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb2.append((CharSequence) str, i11, iG0);
            sb2.append(str3);
            i11 = iG0 + length;
            if (iG0 >= str.length()) {
                break;
            }
            iG0 = e.G0(str, str2, iG0 + i10, false);
        } while (iG0 > 0);
        sb2.append((CharSequence) str, i11, str.length());
        String string = sb2.toString();
        fj.l.e(string, "toString(...)");
        return string;
    }
}
