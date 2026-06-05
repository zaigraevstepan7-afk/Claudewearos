package r;

import fj.l;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f13648a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f13649b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f13650c = new Object[0];

    public static final int a(int[] iArr, int i10, int i11) {
        l.f(iArr, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final int b(long[] jArr, int i10, long j) {
        l.f(jArr, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j4 = jArr[i13];
            if (j4 < j) {
                i12 = i13 + 1;
            } else {
                if (j4 <= j) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final void c(String str) {
        l.f(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        l.f(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        l.f(str, "message");
        throw new NoSuchElementException(str);
    }
}
