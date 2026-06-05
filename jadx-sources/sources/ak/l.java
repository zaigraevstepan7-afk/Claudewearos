package ak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f663a;

    public l(yh.c cVar) {
        ArrayList arrayList = (ArrayList) cVar.f20314b;
        this.f663a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= ' ' || cCharAt >= '\u007f') {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i10), str};
                byte[] bArr = bk.d.f1785a;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
            }
        }
    }

    public static void b(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(m1.j("value for name ", str2, " == null"));
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= '\u007f') {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i10), str2, str};
                byte[] bArr = bk.d.f1785a;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr));
            }
        }
    }

    public final String c(String str) {
        String[] strArr = this.f663a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String d(int i10) {
        return this.f663a[i10 * 2];
    }

    public final yh.c e() {
        yh.c cVar = new yh.c(2);
        Collections.addAll((ArrayList) cVar.f20314b, this.f663a);
        return cVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && Arrays.equals(((l) obj).f663a, this.f663a);
    }

    public final int f() {
        return this.f663a.length / 2;
    }

    public final String g(int i10) {
        return this.f663a[(i10 * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f663a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int iF = f();
        for (int i10 = 0; i10 < iF; i10++) {
            sb2.append(d(i10));
            sb2.append(": ");
            sb2.append(g(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public l(String[] strArr) {
        this.f663a = strArr;
    }
}
