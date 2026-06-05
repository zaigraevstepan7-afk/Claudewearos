package nj;

import b0.g2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import qi.m;

/* loaded from: classes2.dex */
public abstract class e extends l {
    public static boolean C0(CharSequence charSequence, String str, boolean z2) {
        fj.l.f(charSequence, "<this>");
        fj.l.f(str, "other");
        return I0(charSequence, str, 0, z2, 2) >= 0;
    }

    public static boolean D0(CharSequence charSequence, char c6) {
        fj.l.f(charSequence, "<this>");
        return H0(charSequence, c6, 0, 2) >= 0;
    }

    public static boolean E0(String str, char c6) {
        return str.length() > 0 && x8.a.v(str.charAt(F0(str)), c6, false);
    }

    public static final int F0(CharSequence charSequence) {
        fj.l.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int G0(CharSequence charSequence, String str, int i10, boolean z2) {
        fj.l.f(charSequence, "<this>");
        fj.l.f(str, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        int length = charSequence.length();
        if (i10 < 0) {
            i10 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        kj.h hVar = new kj.h(i10, length, 1);
        boolean z10 = charSequence instanceof String;
        int i11 = hVar.f9667c;
        int i12 = hVar.f9666b;
        int i13 = hVar.f9665a;
        if (!z10 || !(str instanceof String)) {
            boolean z11 = z2;
            if ((i11 <= 0 || i13 > i12) && (i11 >= 0 || i12 > i13)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z12 = z11;
                z11 = z12;
                if (Q0(str, 0, charSequence2, i13, str.length(), z12)) {
                    return i13;
                }
                if (i13 == i12) {
                    return -1;
                }
                i13 += i11;
                charSequence = charSequence2;
            }
        } else {
            if ((i11 <= 0 || i13 > i12) && (i11 >= 0 || i12 > i13)) {
                return -1;
            }
            int i14 = i13;
            while (true) {
                String str2 = str;
                boolean z13 = z2;
                if (l.x0(0, i14, str.length(), str2, (String) charSequence, z13)) {
                    return i14;
                }
                if (i14 == i12) {
                    return -1;
                }
                i14 += i11;
                str = str2;
                z2 = z13;
            }
        }
    }

    public static int H0(CharSequence charSequence, char c6, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        fj.l.f(charSequence, "<this>");
        return !(charSequence instanceof String) ? J0(charSequence, new char[]{c6}, i10, false) : ((String) charSequence).indexOf(c6, i10);
    }

    public static /* synthetic */ int I0(CharSequence charSequence, String str, int i10, boolean z2, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z2 = false;
        }
        return G0(charSequence, str, i10, z2);
    }

    public static final int J0(CharSequence charSequence, char[] cArr, int i10, boolean z2) {
        fj.l.f(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iF0 = F0(charSequence);
        if (i10 > iF0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i10);
            for (char c6 : cArr) {
                if (x8.a.v(c6, cCharAt, z2)) {
                    return i10;
                }
            }
            if (i10 == iF0) {
                return -1;
            }
            i10++;
        }
    }

    public static boolean K0(CharSequence charSequence) {
        fj.l.f(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!x8.a.O(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static int L0(int i10, String str, String str2) {
        int iF0 = (i10 & 2) != 0 ? F0(str) : 0;
        fj.l.f(str, "<this>");
        fj.l.f(str2, "string");
        return str.lastIndexOf(str2, iF0);
    }

    public static int M0(String str, char c6) {
        int iF0 = F0(str);
        fj.l.f(str, "<this>");
        return str.lastIndexOf(c6, iF0);
    }

    public static List N0(String str) {
        fj.l.f(str, "<this>");
        return mj.h.V(new mj.i(str, 2));
    }

    public static String O0(int i10, String str) {
        CharSequence charSequenceSubSequence;
        fj.l.f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(m6.a.e(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append((CharSequence) str);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(' ');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static String P0(int i10, String str) {
        CharSequence charSequenceSubSequence;
        fj.l.f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(m6.a.e(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean Q0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z2) {
        fj.l.f(charSequence, "<this>");
        fj.l.f(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!x8.a.v(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String R0(String str, String str2) {
        fj.l.f(str, "<this>");
        fj.l.f(str2, "prefix");
        if (!l.A0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        fj.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static StringBuilder S0(CharSequence charSequence, int i10, int i11, CharSequence charSequence2) {
        fj.l.f(charSequence, "<this>");
        fj.l.f(charSequence2, "replacement");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(m6.a.f("End index (", i11, ") is less than start index (", i10, ")."));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i10);
        sb2.append(charSequence2);
        sb2.append(charSequence, i11, charSequence.length());
        return sb2;
    }

    public static final List T0(CharSequence charSequence, String str) {
        int iG0 = G0(charSequence, str, 0, false);
        if (iG0 == -1) {
            return yd.f.K(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iG0).toString());
            length = str.length() + iG0;
            iG0 = G0(charSequence, str, length, false);
        } while (iG0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List U0(String str, char[] cArr) {
        fj.l.f(str, "<this>");
        if (cArr.length == 1) {
            return T0(str, String.valueOf(cArr[0]));
        }
        mj.k kVar = new mj.k(new mj.d(str, new g2(cArr, 21)));
        ArrayList arrayList = new ArrayList(m.s0(kVar));
        Iterator it = kVar.iterator();
        while (true) {
            i1.l lVar = (i1.l) it;
            if (!lVar.hasNext()) {
                return arrayList;
            }
            kj.h hVar = (kj.h) lVar.next();
            fj.l.f(hVar, "range");
            arrayList.add(str.subSequence(hVar.f9665a, hVar.f9666b + 1).toString());
        }
    }

    public static String V0(String str, String str2, String str3) {
        fj.l.f(str2, "delimiter");
        int iI0 = I0(str, str2, 0, false, 6);
        if (iI0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iI0, str.length());
        fj.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String W0(char c6, String str, String str2) {
        fj.l.f(str, "<this>");
        fj.l.f(str2, "missingDelimiterValue");
        int iM0 = M0(str, c6);
        if (iM0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM0 + 1, str.length());
        fj.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String X0(String str, String str2) {
        int iI0 = I0(str, str2, 0, false, 6);
        if (iI0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iI0);
        fj.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Y0(String str, char c6) {
        fj.l.f(str, "<this>");
        fj.l.f(str, "missingDelimiterValue");
        int iM0 = M0(str, c6);
        if (iM0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iM0);
        fj.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Z0(int i10, String str) {
        fj.l.f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(m6.a.e(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        fj.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence a1(String str) {
        fj.l.f(str, "<this>");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z2 = false;
        while (i10 <= length) {
            boolean zO = x8.a.O(str.charAt(!z2 ? i10 : length));
            if (z2) {
                if (!zO) {
                    break;
                }
                length--;
            } else if (zO) {
                i10++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i10, length + 1);
    }

    public static CharSequence b1(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!x8.a.O(str.charAt(i10))) {
                return str.subSequence(i10, str.length());
            }
        }
        return "";
    }
}
