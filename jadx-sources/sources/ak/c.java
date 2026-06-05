package ak;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f591a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f592b;

    /* renamed from: c, reason: collision with root package name */
    public final int f593c;

    /* renamed from: d, reason: collision with root package name */
    public final int f594d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f595e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f596f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f597g;

    /* renamed from: h, reason: collision with root package name */
    public final int f598h;

    /* renamed from: i, reason: collision with root package name */
    public final int f599i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f600k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f601l;

    /* renamed from: m, reason: collision with root package name */
    public String f602m;

    static {
        TimeUnit.SECONDS.toSeconds(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public c(boolean z2, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, String str) {
        this.f591a = z2;
        this.f592b = z10;
        this.f593c = i10;
        this.f594d = i11;
        this.f595e = z11;
        this.f596f = z12;
        this.f597g = z13;
        this.f598h = i12;
        this.f599i = i13;
        this.j = z14;
        this.f600k = z15;
        this.f601l = z16;
        this.f602m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ak.c a(ak.l r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.c.a(ak.l):ak.c");
    }

    public final String toString() {
        String string;
        String str = this.f602m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f591a) {
            sb2.append("no-cache, ");
        }
        if (this.f592b) {
            sb2.append("no-store, ");
        }
        int i10 = this.f593c;
        if (i10 != -1) {
            sb2.append("max-age=");
            sb2.append(i10);
            sb2.append(", ");
        }
        int i11 = this.f594d;
        if (i11 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i11);
            sb2.append(", ");
        }
        if (this.f595e) {
            sb2.append("private, ");
        }
        if (this.f596f) {
            sb2.append("public, ");
        }
        if (this.f597g) {
            sb2.append("must-revalidate, ");
        }
        int i12 = this.f598h;
        if (i12 != -1) {
            sb2.append("max-stale=");
            sb2.append(i12);
            sb2.append(", ");
        }
        int i13 = this.f599i;
        if (i13 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i13);
            sb2.append(", ");
        }
        if (this.j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f600k) {
            sb2.append("no-transform, ");
        }
        if (this.f601l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            string = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            string = sb2.toString();
        }
        this.f602m = string;
        return string;
    }
}
