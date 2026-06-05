package g1;

import fj.l;
import java.util.NoSuchElementException;
import q.b0;
import q.g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f7014a;

    public static final Object a(g0 g0Var) {
        Object objG = g0Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof b0)) {
            g0Var.k(null);
            return objG;
        }
        b0 b0Var = (b0) objG;
        if (b0Var.h()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i10 = b0Var.f13034b - 1;
        Object objF = b0Var.f(i10);
        b0Var.k(i10);
        l.d(objF, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (b0Var.h()) {
            g0Var.k(null);
        }
        if (b0Var.f13034b == 1) {
            g0Var.m(null, b0Var.e());
        }
        return objF;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final q.b0 b(q.g0 r14) {
        /*
            boolean r0 = r14.i()
            if (r0 == 0) goto Le
            q.b0 r14 = q.l0.f13104b
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            fj.l.d(r14, r0)
            return r14
        Le:
            q.b0 r0 = new q.b0
            r0.<init>()
            java.lang.Object[] r1 = r14.f13075c
            long[] r14 = r14.f13073a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L65
            r3 = 0
            r4 = r3
        L1e:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L60
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L38:
            if (r9 >= r7) goto L5e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L5a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof q.b0
            if (r11 == 0) goto L52
            q.b0 r10 = (q.b0) r10
            r0.c(r10)
            goto L5a
        L52:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            fj.l.d(r10, r11)
            r0.a(r10)
        L5a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L38
        L5e:
            if (r7 != r8) goto L65
        L60:
            if (r4 == r2) goto L65
            int r4 = r4 + 1
            goto L1e
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.a.b(q.g0):q.b0");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return l.b(this.f7014a, ((a) obj).f7014a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7014a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f7014a + ')';
    }
}
