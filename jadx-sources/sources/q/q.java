package q;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f13118a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f13119b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f13120c = new Object();

    public static final void a(f fVar, int i10) {
        fVar.f13064a = new int[i10];
        fVar.f13065b = new Object[i10];
    }

    public static final int b(f fVar, Object obj, int i10) {
        int i11 = fVar.f13066c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = r.a.a(fVar.f13064a, i11, i10);
            if (iA < 0 || fj.l.b(obj, fVar.f13065b[iA])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && fVar.f13064a[i12] == i10) {
                if (fj.l.b(obj, fVar.f13065b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && fVar.f13064a[i13] == i10; i13--) {
                if (fj.l.b(obj, fVar.f13065b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
