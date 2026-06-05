package nj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qi.m;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class f extends yd.f {
    public static String s0(String str) {
        fj.l.f(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        c cVar = new c(str);
        int i10 = 0;
        while (cVar.hasNext()) {
            String strV = (String) cVar.next();
            fj.l.f(strV, "it");
            if (!e.K0(strV)) {
                strV = m1.v("    ", strV);
            } else if (strV.length() < 4) {
                strV = "    ";
            }
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) "\n");
            }
            yd.f.f(sb2, strV, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static String t0(String str) {
        fj.l.f(str, "<this>");
        List listN0 = e.N0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN0) {
            if (!e.K0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.s0(arrayList));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!x8.a.O(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Integer num = (Integer) qi.l.H0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listN0.size();
        int iB = yd.f.B(listN0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listN0.iterator();
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length3);
                qi.l.D0(arrayList3, sb2, "\n", null, 124);
                return sb2.toString();
            }
            Object next = it.next();
            int i12 = i10 + 1;
            if (i10 < 0) {
                yd.f.i0();
                throw null;
            }
            String str3 = (String) next;
            if ((i10 != 0 && i10 != iB) || !e.K0(str3)) {
                fj.l.f(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(m6.a.e(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                fj.l.e(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            i10 = i12;
        }
    }

    public static String u0(String str) {
        fj.l.f(str, "<this>");
        if (e.K0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listN0 = e.N0(str);
        int length = str.length();
        listN0.size();
        int iB = yd.f.B(listN0);
        ArrayList arrayList = new ArrayList();
        Iterator it = listN0.iterator();
        int i10 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length);
                qi.l.D0(arrayList, sb2, "\n", null, 124);
                return sb2.toString();
            }
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                yd.f.i0();
                throw null;
            }
            String str2 = (String) next;
            if ((i10 != 0 && i10 != iB) || !e.K0(str2)) {
                int length2 = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!x8.a.O(str2.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && str2.startsWith("|", i12)) {
                    strSubstring = str2.substring("|".length() + i12);
                    fj.l.e(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i10 = i11;
        }
    }
}
