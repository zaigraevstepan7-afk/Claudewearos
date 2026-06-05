package i1;

import f1.n;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j {
    public static final int a(ArrayList arrayList, int i10, int i11) {
        int iE = e(arrayList, i10, i11);
        return iE >= 0 ? iE : -(iE + 1);
    }

    public static final int b(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return Integer.bitCount(iArr[i11 + 1] >> 28) + iArr[i11 + 4];
    }

    public static final void c(int[] iArr, int i10, int i11) {
        if (i11 >= 0) {
        }
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    public static final h d(h hVar) {
        if (!(hVar instanceof h)) {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        n.b("Inconsistent composition");
        throw new b3.e();
    }

    public static final int e(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int i14 = ((b) arrayList.get(i13)).f8101a;
            if (i14 < 0) {
                i14 += i11;
            }
            int iH = fj.l.h(i14, i10);
            if (iH < 0) {
                i12 = i13 + 1;
            } else {
                if (iH <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
