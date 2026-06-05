package ek;

import ak.z;
import kk.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class d {
    static {
        i iVar = i.f9700d;
        mk.b.p("\"\\");
        mk.b.p("\t ,=");
    }

    public static long a(z zVar) {
        String strC = zVar.f762f.c("Content-Length");
        if (strC == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strC);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean b(z zVar) {
        if (zVar.f757a.f736b.equals("HEAD")) {
            return false;
        }
        int i10 = zVar.f759c;
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && a(zVar) == -1 && !"chunked".equalsIgnoreCase(zVar.b("Transfer-Encoding"))) ? false : true;
    }

    public static int c(int i10, String str) throws NumberFormatException {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bc, code lost:
    
        if (r19 == (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c5, code lost:
    
        if (r19 > 9223372036854775L) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c7, code lost:
    
        r30 = r19 * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01cb, code lost:
    
        r30 = r10 + r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01cf, code lost:
    
        if (r30 < r10) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d3, code lost:
    
        if (r30 <= 253402300799999L) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d6, code lost:
    
        r19 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01d9, code lost:
    
        r19 = 253402300799999L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01dc, code lost:
    
        r19 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01de, code lost:
    
        r0 = r35.f676d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e2, code lost:
    
        if (r15 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01e4, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ea, code lost:
    
        if (r0.equals(r15) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01f1, code lost:
    
        if (r0.endsWith(r15) == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0204, code lost:
    
        if (r0.charAt((r0.length() - r15.length()) - 1) != '.') goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0210, code lost:
    
        if (bk.d.f1794k.matcher(r0).matches() != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x021a, code lost:
    
        if (r0.length() == r15.length()) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x021c, code lost:
    
        r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f12555h;
        r6.getClass();
        r9 = java.net.IDN.toUnicode(r15).split("\\.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0231, code lost:
    
        if (r6.f12556a.get() != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023b, code lost:
    
        if (r6.f12556a.compareAndSet(false, true) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x023d, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0268, code lost:
    
        r6.f12557b.await();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x026e, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b1, code lost:
    
        r36 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b5, code lost:
    
        if (r19 != Long.MIN_VALUE) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b7, code lost:
    
        r19 = Long.MIN_VALUE;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x033d A[LOOP:10: B:209:0x033a->B:211:0x033d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(ak.j r34, ak.n r35, ak.l r36) throws java.lang.InterruptedException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.d.d(ak.j, ak.n, ak.l):void");
    }

    public static int e(int i10, String str, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }
}
