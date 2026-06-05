package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f14736a;

    public /* synthetic */ a(long j) {
        this.f14736a = j;
    }

    public static long a(long j, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i10 = j(j);
        }
        if ((i14 & 2) != 0) {
            i11 = h(j);
        }
        if ((i14 & 4) != 0) {
            i12 = i(j);
        }
        if ((i14 & 8) != 0) {
            i13 = g(j);
        }
        if (i11 < i10 || i13 < i12 || i10 < 0 || i12 < 0) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.h(i10, i11, i12, i13);
    }

    public static final boolean b(long j, long j4) {
        return j == j4;
    }

    public static final boolean c(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    public static final boolean d(long j) {
        int i10 = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j >> (i11 + 15))) & i12;
        int i14 = ((int) (j >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i14 - 1);
    }

    public static final boolean f(long j) {
        int i10 = (int) (3 & j);
        int i11 = (1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1;
        int i12 = ((int) (j >> 2)) & i11;
        int i13 = ((int) (j >> 33)) & i11;
        return i12 == (i13 == 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i13 - 1);
    }

    public static final int g(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = ((int) (j >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        return i12 == 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i12 - 1;
    }

    public static final int h(long j) {
        int i10 = (int) (3 & j);
        int i11 = ((int) (j >> 33)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
        return i11 == 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i11 - 1;
    }

    public static final int i(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((int) (j >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int j(long j) {
        int i10 = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
    }

    public static final boolean k(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i11 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) - 1 == 0);
    }

    public static String l(long j) {
        int iH = h(j);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(j(j));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(i(j));
        sb2.append(", maxHeight = ");
        return m6.a.i(sb2, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f14736a == ((a) obj).f14736a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14736a);
    }

    public final String toString() {
        return l(this.f14736a);
    }
}
