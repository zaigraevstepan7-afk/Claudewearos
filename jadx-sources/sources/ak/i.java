package ak;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f644k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f645l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f646m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f647a;

    /* renamed from: b, reason: collision with root package name */
    public final String f648b;

    /* renamed from: c, reason: collision with root package name */
    public final long f649c;

    /* renamed from: d, reason: collision with root package name */
    public final String f650d;

    /* renamed from: e, reason: collision with root package name */
    public final String f651e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f652f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f653g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f654h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f655i;

    public i(String str, String str2, long j4, String str3, String str4, boolean z2, boolean z10, boolean z11, boolean z12) {
        this.f647a = str;
        this.f648b = str2;
        this.f649c = j4;
        this.f650d = str3;
        this.f651e = str4;
        this.f652f = z2;
        this.f653g = z10;
        this.f655i = z11;
        this.f654h = z12;
    }

    public static int a(boolean z2, String str, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= '\u007f' || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z2)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long b(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.i.b(int, java.lang.String):long");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f647a.equals(this.f647a) && iVar.f648b.equals(this.f648b) && iVar.f650d.equals(this.f650d) && iVar.f651e.equals(this.f651e) && iVar.f649c == this.f649c && iVar.f652f == this.f652f && iVar.f653g == this.f653g && iVar.f654h == this.f654h && iVar.f655i == this.f655i;
    }

    public final int hashCode() {
        int iC = m1.c(m1.c(m1.c(m1.c(527, 31, this.f647a), 31, this.f648b), 31, this.f650d), 31, this.f651e);
        long j4 = this.f649c;
        return ((((((((iC + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (!this.f652f ? 1 : 0)) * 31) + (!this.f653g ? 1 : 0)) * 31) + (!this.f654h ? 1 : 0)) * 31) + (!this.f655i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f647a);
        sb2.append('=');
        sb2.append(this.f648b);
        if (this.f654h) {
            long j4 = this.f649c;
            if (j4 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(((DateFormat) ek.c.f6084a.get()).format(new Date(j4)));
            }
        }
        if (!this.f655i) {
            sb2.append("; domain=");
            sb2.append(this.f650d);
        }
        sb2.append("; path=");
        sb2.append(this.f651e);
        if (this.f652f) {
            sb2.append("; secure");
        }
        if (this.f653g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }
}
