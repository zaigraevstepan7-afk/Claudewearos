package ak;

import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f673a;

    /* renamed from: b, reason: collision with root package name */
    public final String f674b;

    /* renamed from: c, reason: collision with root package name */
    public final String f675c;

    /* renamed from: d, reason: collision with root package name */
    public final String f676d;

    /* renamed from: e, reason: collision with root package name */
    public final int f677e;

    /* renamed from: f, reason: collision with root package name */
    public final List f678f;

    /* renamed from: g, reason: collision with root package name */
    public final List f679g;

    /* renamed from: h, reason: collision with root package name */
    public final String f680h;

    /* renamed from: i, reason: collision with root package name */
    public final String f681i;

    public n(m mVar) {
        this.f673a = (String) mVar.f666c;
        String str = (String) mVar.f667d;
        this.f674b = g(false, str, 0, str.length());
        String str2 = (String) mVar.f668e;
        this.f675c = g(false, str2, 0, str2.length());
        this.f676d = (String) mVar.f669f;
        int i10 = mVar.f665b;
        this.f677e = i10 == -1 ? b((String) mVar.f666c) : i10;
        this.f678f = h((ArrayList) mVar.f671h, false);
        ArrayList arrayList = (ArrayList) mVar.f672i;
        this.f679g = arrayList != null ? h(arrayList, true) : null;
        String str3 = (String) mVar.f670g;
        this.f680h = str3 != null ? g(false, str3, 0, str3.length()) : null;
        this.f681i = mVar.toString();
    }

    public static String a(String str, int i10, int i11, String str2, boolean z2, boolean z10, boolean z11, boolean z12) throws EOFException {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z12) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z2 || (z10 && !i(iCharCount, i11, str)))) || (iCodePointAt == 43 && z11)))) {
                kk.f fVar = new kk.f();
                fVar.g0(i10, iCharCount, str);
                kk.f fVar2 = null;
                while (iCharCount < i11) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z2 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z11) {
                            fVar.h0(z2 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z12) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z2 || (z10 && !i(iCharCount, i11, str)))))) {
                            if (fVar2 == null) {
                                fVar2 = new kk.f();
                            }
                            fVar2.i0(iCodePointAt2);
                            while (!fVar2.e()) {
                                byte b10 = fVar2.readByte();
                                fVar.W(37);
                                char[] cArr = j;
                                fVar.W(cArr[((b10 & 255) >> 4) & 15]);
                                fVar.W(cArr[b10 & 15]);
                            }
                        } else {
                            fVar.i0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return fVar.F(fVar.f9695b, nj.a.f12342a);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i10, i11);
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String g(boolean r8, java.lang.String r9, int r10, int r11) {
        /*
            r0 = r10
        L1:
            if (r0 >= r11) goto L64
            char r1 = r9.charAt(r0)
            r2 = 43
            r3 = 37
            if (r1 == r3) goto L15
            if (r1 != r2) goto L12
            if (r8 == 0) goto L12
            goto L15
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            kk.f r1 = new kk.f
            r1.<init>()
            r1.g0(r10, r0, r9)
        L1d:
            if (r0 >= r11) goto L5b
            int r10 = r9.codePointAt(r0)
            if (r10 != r3) goto L48
            int r4 = r0 + 2
            if (r4 >= r11) goto L48
            int r5 = r0 + 1
            char r5 = r9.charAt(r5)
            int r5 = bk.d.e(r5)
            char r6 = r9.charAt(r4)
            int r6 = bk.d.e(r6)
            r7 = -1
            if (r5 == r7) goto L52
            if (r6 == r7) goto L52
            int r0 = r5 << 4
            int r0 = r0 + r6
            r1.W(r0)
            r0 = r4
            goto L55
        L48:
            if (r10 != r2) goto L52
            if (r8 == 0) goto L52
            r4 = 32
            r1.W(r4)
            goto L55
        L52:
            r1.i0(r10)
        L55:
            int r10 = java.lang.Character.charCount(r10)
            int r0 = r0 + r10
            goto L1d
        L5b:
            long r8 = r1.f9695b
            java.nio.charset.Charset r10 = nj.a.f12342a
            java.lang.String r8 = r1.F(r8, r10)
            return r8
        L64:
            java.lang.String r8 = r9.substring(r10, r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.n.g(boolean, java.lang.String, int, int):java.lang.String");
    }

    public static List h(ArrayList arrayList, boolean z2) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) arrayList.get(i10);
            arrayList2.add(str != null ? g(z2, str, 0, str.length()) : null);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean i(int i10, int i11, String str) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && bk.d.e(str.charAt(i10 + 1)) != -1 && bk.d.e(str.charAt(i12)) != -1;
    }

    public static ArrayList j(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public final String c() {
        if (this.f675c.isEmpty()) {
            return "";
        }
        int length = this.f673a.length() + 3;
        String str = this.f681i;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    public final ArrayList d() {
        int length = this.f673a.length() + 3;
        String str = this.f681i;
        int iIndexOf = str.indexOf(47, length);
        int iG = bk.d.g(iIndexOf, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iG) {
            int i10 = iIndexOf + 1;
            int iH = bk.d.h(str, i10, iG, '/');
            arrayList.add(str.substring(i10, iH));
            iIndexOf = iH;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f679g == null) {
            return null;
        }
        String str = this.f681i;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, bk.d.h(str, iIndexOf, str.length(), '#'));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && ((n) obj).f681i.equals(this.f681i);
    }

    public final String f() {
        if (this.f674b.isEmpty()) {
            return "";
        }
        int length = this.f673a.length() + 3;
        String str = this.f681i;
        return str.substring(length, bk.d.g(length, str.length(), str, ":@"));
    }

    public final int hashCode() {
        return this.f681i.hashCode();
    }

    public final String k() {
        m mVar;
        try {
            mVar = new m(0);
            mVar.d(this, "/...");
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        mVar.getClass();
        mVar.f667d = a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        mVar.f668e = a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return mVar.b().f681i;
    }

    public final URI l() {
        m mVar = new m(0);
        ArrayList arrayList = (ArrayList) mVar.f671h;
        String str = this.f673a;
        mVar.f666c = str;
        mVar.f667d = f();
        mVar.f668e = c();
        mVar.f669f = this.f676d;
        int iB = b(str);
        int i10 = this.f677e;
        if (i10 == iB) {
            i10 = -1;
        }
        mVar.f665b = i10;
        arrayList.clear();
        arrayList.addAll(d());
        String strE = e();
        String strSubstring = null;
        mVar.f672i = strE != null ? j(a(strE, 0, strE.length(), " \"'<>#", true, false, true, true)) : null;
        if (this.f680h != null) {
            String str2 = this.f681i;
            strSubstring = str2.substring(str2.indexOf(35) + 1);
        }
        mVar.f670g = strSubstring;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str3 = (String) arrayList.get(i11);
            arrayList.set(i11, a(str3, 0, str3.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = (ArrayList) mVar.f672i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str4 = (String) ((ArrayList) mVar.f672i).get(i12);
                if (str4 != null) {
                    ((ArrayList) mVar.f672i).set(i12, a(str4, 0, str4.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str5 = (String) mVar.f670g;
        if (str5 != null) {
            mVar.f670g = a(str5, 0, str5.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String string = mVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final String toString() {
        return this.f681i;
    }
}
