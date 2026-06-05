package d3;

import java.util.Iterator;
import q.g0;
import q.n0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n implements z, Iterable, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f4758a;

    /* renamed from: b, reason: collision with root package name */
    public q.s f4759b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4760c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4761d;

    public n() {
        long[] jArr = n0.f13108a;
        this.f4758a = new g0();
    }

    @Override // d3.z
    public final void b(y yVar, Object obj) {
        boolean z2 = obj instanceof a;
        g0 g0Var = this.f4758a;
        if (z2 && g0Var.c(yVar)) {
            Object objG = g0Var.g(yVar);
            fj.l.d(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) objG;
            a aVar2 = (a) obj;
            String str = aVar2.f4703a;
            if (str == null) {
                str = aVar.f4703a;
            }
            pi.c cVar = aVar2.f4704b;
            if (cVar == null) {
                cVar = aVar.f4704b;
            }
            g0Var.m(yVar, new a(str, cVar));
        } else {
            g0Var.m(yVar, obj);
        }
        yVar.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d3.n e() {
        /*
            r18 = this;
            r0 = r18
            d3.n r1 = new d3.n
            r1.<init>()
            boolean r2 = r0.f4760c
            r1.f4760c = r2
            boolean r2 = r0.f4761d
            r1.f4761d = r2
            q.g0 r2 = r1.f4758a
            r2.getClass()
            java.lang.String r3 = "from"
            q.g0 r4 = r0.f4758a
            fj.l.f(r4, r3)
            java.lang.Object[] r3 = r4.f13074b
            java.lang.Object[] r5 = r4.f13075c
            long[] r4 = r4.f13073a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L62
            r7 = 0
            r8 = r7
        L28:
            r9 = r4[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L42:
            if (r13 >= r11) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L57
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            r2.m(r15, r14)
        L57:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L42
        L5b:
            if (r11 != r12) goto L62
        L5d:
            if (r8 == r6) goto L62
            int r8 = r8 + 1
            goto L28
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.n.e():d3.n");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return fj.l.b(this.f4758a, nVar.f4758a) && this.f4760c == nVar.f4760c && this.f4761d == nVar.f4761d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4761d) + gk.b.i(this.f4758a.hashCode() * 31, 31, this.f4760c);
    }

    public final Object i(y yVar) {
        Object objG = this.f4758a.g(yVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + yVar + " - consider getOrElse or getOrNull");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        q.s sVar = this.f4759b;
        if (sVar == null) {
            g0 g0Var = this.f4758a;
            g0Var.getClass();
            q.s sVar2 = new q.s(g0Var);
            this.f4759b = sVar2;
            sVar = sVar2;
        }
        return ((q.h) sVar.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f4760c
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f4761d
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            q.g0 r4 = r0.f4758a
            java.lang.Object[] r5 = r4.f13074b
            java.lang.Object[] r6 = r4.f13075c
            long[] r4 = r4.f13073a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            d3.y r8 = (d3.y) r8
            r1.append(r2)
            java.lang.String r2 = r8.f4804a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = w2.f0.t(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.n.toString():java.lang.String");
    }

    public final void w(n nVar) {
        g0 g0Var = nVar.f4758a;
        Object[] objArr = g0Var.f13074b;
        Object[] objArr2 = g0Var.f13075c;
        long[] jArr = g0Var.f13073a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        y yVar = (y) obj;
                        g0 g0Var2 = this.f4758a;
                        Object objG = g0Var2.g(yVar);
                        fj.l.d(yVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = yVar.f4805b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            g0Var2.m(yVar, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }
}
