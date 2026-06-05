package f1;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6440a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f6441b = new b0();

    /* renamed from: c, reason: collision with root package name */
    public static final bk.b f6442c = new bk.b(3);

    public static j1 A(Object obj) {
        return new j1(obj, f.f6293z);
    }

    public static final Object B(ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    public static final a1 C(c2.g gVar, Uri uri, String str, Integer num, ej.e eVar, i0 i0Var) {
        Object objQ = i0Var.Q();
        f fVar = m.f6385a;
        if (objQ == fVar) {
            objQ = A(gVar);
            i0Var.l0(objQ);
        }
        a1 a1Var = (a1) objQ;
        boolean zH = i0Var.h(eVar);
        Object objQ2 = i0Var.Q();
        if (zH || objQ2 == fVar) {
            objQ2 = new p2(eVar, a1Var, null, 3);
            i0Var.l0(objQ2);
        }
        h(uri, str, num, (ej.e) objQ2, i0Var);
        return a1Var;
    }

    public static final a1 D(c2.g gVar, Object obj, ej.e eVar, i0 i0Var, int i10) {
        Object objQ = i0Var.Q();
        f fVar = m.f6385a;
        if (objQ == fVar) {
            objQ = A(gVar);
            i0Var.l0(objQ);
        }
        a1 a1Var = (a1) objQ;
        boolean zH = i0Var.h(eVar);
        Object objQ2 = i0Var.Q();
        if (zH || objQ2 == fVar) {
            objQ2 = new p2(eVar, a1Var, null, 1);
            i0Var.l0(objQ2);
        }
        f((ej.e) objQ2, i0Var, obj);
        return a1Var;
    }

    public static final a1 E(ej.e eVar, i0 i0Var, Object obj) {
        Object objQ = i0Var.Q();
        f fVar = m.f6385a;
        if (objQ == fVar) {
            objQ = A(obj);
            i0Var.l0(objQ);
        }
        a1 a1Var = (a1) objQ;
        boolean zH = i0Var.h(eVar);
        Object objQ2 = i0Var.Q();
        if (zH || objQ2 == fVar) {
            objQ2 = new p2(eVar, a1Var, null, 0);
            i0Var.l0(objQ2);
        }
        f((ej.e) objQ2, i0Var, pi.o.f13011a);
        return a1Var;
    }

    public static final a1 F(Object obj, Object obj2, Object obj3, ej.e eVar, i0 i0Var, int i10) {
        Object objQ = i0Var.Q();
        f fVar = m.f6385a;
        if (objQ == fVar) {
            objQ = A(obj);
            i0Var.l0(objQ);
        }
        a1 a1Var = (a1) objQ;
        boolean zH = i0Var.h(eVar);
        Object objQ2 = i0Var.Q();
        if (zH || objQ2 == fVar) {
            objQ2 = new p2(eVar, a1Var, null, 2);
            i0Var.l0(objQ2);
        }
        g(obj2, obj3, (ej.e) objQ2, i0Var);
        return a1Var;
    }

    public static final a1 G(Object obj, Object[] objArr, ej.e eVar, i0 i0Var) {
        Object objQ = i0Var.Q();
        f fVar = m.f6385a;
        if (objQ == fVar) {
            objQ = A(obj);
            i0Var.l0(objQ);
        }
        a1 a1Var = (a1) objQ;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zH = i0Var.h(eVar);
        Object objQ2 = i0Var.Q();
        if (zH || objQ2 == fVar) {
            objQ2 = new p2(eVar, a1Var, null, 4);
            i0Var.l0(objQ2);
        }
        i(objArrCopyOf, (ej.e) objQ2, i0Var);
        return a1Var;
    }

    public static final Object H(n1 n1Var, q1 q1Var) {
        fj.l.d(q1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objB = n1Var.get(q1Var);
        if (objB == null) {
            objB = q1Var.b();
        }
        return ((u2) objB).a(n1Var);
    }

    public static final void I(ej.c cVar, i0 i0Var) {
        i0Var.b(new t2(cVar, 0), pi.o.f13011a);
    }

    public static final g0 J(i0 i0Var) {
        i0 i0Var2;
        i0Var.Z(206, n.f6399e);
        if (i0Var.S) {
            i1.k.z(i0Var.I);
        }
        Object objI = i0Var.I();
        d2 g2Var = objI instanceof d2 ? (d2) objI : null;
        if (g2Var == null) {
            i0Var2 = i0Var;
            g2Var = new g2(new f0(new g0(i0Var2, i0Var.T, i0Var.f6328q, i0Var.C, i0Var.f6320h.M)), -1);
            i0Var2.m0(g2Var);
        } else {
            i0Var2 = i0Var;
        }
        c2 c2VarA = g2Var.a();
        fj.l.d(c2VarA, "null cannot be cast to non-null type androidx.compose.runtime.GapComposer.CompositionContextHolder");
        g0 g0Var = ((f0) c2VarA).f6295a;
        g0Var.f6306f.setValue(i0Var2.l());
        i0Var2.p(false);
        return g0Var;
    }

    public static final a1 K(Object obj, i0 i0Var) {
        Object objQ = i0Var.Q();
        if (objQ == m.f6385a) {
            objQ = A(obj);
            i0Var.l0(objQ);
        }
        a1 a1Var = (a1) objQ;
        a1Var.setValue(obj);
        return a1Var;
    }

    public static final void L(i1.k kVar, int i10, Object obj) {
        int iH = kVar.h(i10);
        Object[] objArr = kVar.f8138c;
        Object obj2 = objArr[iH];
        objArr[iH] = m.f6385a;
        if (obj == obj2) {
            return;
        }
        n.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void M(ej.e eVar, i0 i0Var, Object obj) {
        if (i0Var.S || !fj.l.b(i0Var.Q(), obj)) {
            i0Var.l0(obj);
            i0Var.b(eVar, obj);
        }
    }

    public static final m5.n N(ej.a aVar) {
        return new m5.n(new b6.c(aVar, (ti.c) null, 3));
    }

    public static final int O(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }

    public static final p1.i P(r1[] r1VarArr, n1 n1Var, n1 n1Var2) {
        p1.h hVarA = p1.i.f12646d.a();
        for (r1 r1Var : r1VarArr) {
            q1 q1Var = (q1) r1Var.f6437d;
            if (r1Var.f6436c || !n1Var.containsKey(q1Var)) {
                hVarA.put(q1Var, q1Var.d(r1Var, (u2) n1Var2.get(q1Var)));
            }
        }
        return hVarA.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(f1.r1 r11, ej.e r12, f1.i0 r13, int r14) {
        /*
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.c0(r0)
            f1.n0 r0 = r13.f6335x
            f1.n1 r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            f1.d1 r3 = f1.n.f6396b
            r13.Z(r2, r3)
            java.lang.Object r2 = r13.Q()
            f1.f r3 = f1.m.f6385a
            boolean r3 = fj.l.b(r2, r3)
            r4 = 0
            if (r3 == 0) goto L22
            r2 = r4
            goto L29
        L22:
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"
            fj.l.d(r2, r3)
            f1.u2 r2 = (f1.u2) r2
        L29:
            java.lang.Object r3 = r11.f6437d
            f1.q1 r3 = (f1.q1) r3
            f1.u2 r5 = r3.d(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3a
            r13.l0(r5)
        L3a:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L54
            boolean r2 = r11.f6436c
            if (r2 != 0) goto L4a
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L50
        L4a:
            p1.i r1 = (p1.i) r1
            p1.i r1 = r1.d(r3, r5)
        L50:
            r13.J = r7
        L52:
            r2 = r8
            goto L93
        L54:
            i1.g r6 = r13.G
            int r9 = r6.f8119g
            int[] r10 = r6.f8114b
            java.lang.Object r6 = r6.b(r10, r9)
            java.lang.String r9 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            fj.l.d(r6, r9)
            f1.n1 r6 = (f1.n1) r6
            boolean r9 = r13.F()
            if (r9 == 0) goto L6d
            if (r2 != 0) goto L78
        L6d:
            boolean r9 = r11.f6436c
            if (r9 != 0) goto L86
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L78
            goto L86
        L78:
            if (r2 == 0) goto L7f
            boolean r2 = r13.f6334w
            if (r2 != 0) goto L7f
            goto L84
        L7f:
            boolean r2 = r13.f6334w
            if (r2 == 0) goto L84
            goto L8c
        L84:
            r1 = r6
            goto L8c
        L86:
            p1.i r1 = (p1.i) r1
            p1.i r1 = r1.d(r3, r5)
        L8c:
            boolean r2 = r13.f6336y
            if (r2 != 0) goto L92
            if (r6 == r1) goto L52
        L92:
            r2 = r7
        L93:
            if (r2 == 0) goto L9c
            boolean r3 = r13.S
            if (r3 != 0) goto L9c
            r13.O(r1)
        L9c:
            boolean r3 = r13.f6334w
            r0.d(r3)
            r13.f6334w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            f1.d1 r3 = f1.n.f6397c
            r13.X(r3, r2, r8, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r13, r1)
            r13.p(r8)
            r13.p(r8)
            int r0 = r0.c()
            if (r0 == 0) goto Lc4
            goto Lc5
        Lc4:
            r7 = r8
        Lc5:
            r13.f6334w = r7
            r13.K = r4
            f1.t1 r13 = r13.u()
            if (r13 == 0) goto Ld7
            d0.j r0 = new d0.j
            r1 = 3
            r0.<init>(r11, r14, r1, r12)
            r13.f6456d = r0
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.s.a(f1.r1, ej.e, f1.i0, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [f1.n1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(f1.r1[] r8, ej.e r9, f1.i0 r10, int r11) {
        /*
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r10.c0(r0)
            f1.n0 r0 = r10.f6335x
            f1.n1 r1 = r10.l()
            r2 = 201(0xc9, float:2.82E-43)
            f1.d1 r3 = f1.n.f6396b
            r10.Z(r2, r3)
            boolean r2 = r10.S
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            p1.i r2 = p1.i.f12646d
            p1.i r2 = P(r8, r1, r2)
            p1.i r1 = r10.k0(r1, r2)
            r10.J = r3
        L25:
            r2 = r4
            goto L74
        L27:
            i1.g r2 = r10.G
            int r5 = r2.f8119g
            java.lang.Object r2 = r2.h(r5, r4)
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            fj.l.d(r2, r5)
            f1.n1 r2 = (f1.n1) r2
            i1.g r6 = r10.G
            int r7 = r6.f8119g
            java.lang.Object r6 = r6.h(r7, r3)
            fj.l.d(r6, r5)
            f1.n1 r6 = (f1.n1) r6
            p1.i r5 = P(r8, r1, r6)
            boolean r7 = r10.F()
            if (r7 == 0) goto L65
            boolean r7 = r10.f6336y
            if (r7 != 0) goto L65
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L58
            goto L65
        L58:
            int r1 = r10.f6323l
            i1.g r5 = r10.G
            int r5 = r5.s()
            int r5 = r5 + r1
            r10.f6323l = r5
            r1 = r2
            goto L25
        L65:
            p1.i r1 = r10.k0(r1, r5)
            boolean r5 = r10.f6336y
            if (r5 != 0) goto L73
            boolean r2 = fj.l.b(r1, r2)
            if (r2 != 0) goto L25
        L73:
            r2 = r3
        L74:
            if (r2 == 0) goto L7d
            boolean r5 = r10.S
            if (r5 != 0) goto L7d
            r10.O(r1)
        L7d:
            boolean r5 = r10.f6334w
            r0.d(r5)
            r10.f6334w = r2
            r10.K = r1
            r2 = 202(0xca, float:2.83E-43)
            f1.d1 r5 = f1.n.f6397c
            r10.X(r5, r2, r4, r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.invoke(r10, r1)
            r10.p(r4)
            r10.p(r4)
            int r0 = r0.c()
            if (r0 == 0) goto La5
            goto La6
        La5:
            r3 = r4
        La6:
            r10.f6334w = r3
            r0 = 0
            r10.K = r0
            f1.t1 r10 = r10.u()
            if (r10 == 0) goto Lb9
            d0.j r0 = new d0.j
            r1 = 4
            r0.<init>(r8, r11, r1, r9)
            r10.f6456d = r0
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.s.b(f1.r1[], ej.e, f1.i0, int):void");
    }

    public static final void c(Object obj, ej.c cVar, i0 i0Var) {
        boolean zF = i0Var.f(obj);
        Object objQ = i0Var.Q();
        if (zF || objQ == m.f6385a) {
            objQ = new z(cVar);
            i0Var.l0(objQ);
        }
    }

    public static final void d(Object obj, Object obj2, ej.c cVar, i0 i0Var) {
        boolean zF = i0Var.f(obj) | i0Var.f(obj2);
        Object objQ = i0Var.Q();
        if (zF || objQ == m.f6385a) {
            objQ = new z(cVar);
            i0Var.l0(objQ);
        }
    }

    public static final void e(Object[] objArr, ej.c cVar, i0 i0Var) {
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= i0Var.f(obj);
        }
        Object objQ = i0Var.Q();
        if (zF || objQ == m.f6385a) {
            i0Var.l0(new z(cVar));
        }
    }

    public static final void f(ej.e eVar, i0 i0Var, Object obj) {
        ti.h hVar = i0Var.R;
        boolean zF = i0Var.f(obj);
        Object objQ = i0Var.Q();
        if (zF || objQ == m.f6385a) {
            objQ = new r0(hVar, eVar);
            i0Var.l0(objQ);
        }
    }

    public static final void g(Object obj, Object obj2, ej.e eVar, i0 i0Var) {
        ti.h hVar = i0Var.R;
        boolean zF = i0Var.f(obj) | i0Var.f(obj2);
        Object objQ = i0Var.Q();
        if (zF || objQ == m.f6385a) {
            objQ = new r0(hVar, eVar);
            i0Var.l0(objQ);
        }
    }

    public static final void h(Object obj, Object obj2, Object obj3, ej.e eVar, i0 i0Var) {
        ti.h hVar = i0Var.R;
        boolean zF = i0Var.f(obj) | i0Var.f(obj2) | i0Var.f(obj3);
        Object objQ = i0Var.Q();
        if (zF || objQ == m.f6385a) {
            objQ = new r0(hVar, eVar);
            i0Var.l0(objQ);
        }
    }

    public static final void i(Object[] objArr, ej.e eVar, i0 i0Var) {
        ti.h hVar = i0Var.R;
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= i0Var.f(obj);
        }
        Object objQ = i0Var.Q();
        if (zF || objQ == m.f6385a) {
            i0Var.l0(new r0(hVar, eVar));
        }
    }

    public static final void j(ej.a aVar, i0 i0Var) {
        j1.l0 l0Var = i0Var.M.f8609b.f8606d;
        l0Var.f0(j1.b0.f8619c);
        wd.a.O(l0Var, 0, aVar);
    }

    public static final void k(int i10, int i11, List list) {
        int iS = s(i10, list);
        if (iS < 0) {
            iS = -(iS + 1);
        }
        while (iS < list.size() && ((o0) list.get(iS)).f6403b < i11) {
        }
    }

    public static void l(i1.k kVar, List list, r rVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iC = kVar.c((i1.b) list.get(i10));
            int iN = kVar.N(kVar.f8137b, kVar.r(iC));
            Object obj = iN < kVar.g(kVar.f8137b, kVar.r(iC + 1)) ? kVar.f8138c[kVar.h(iN)] : m.f6385a;
            t1 t1Var = obj instanceof t1 ? (t1) obj : null;
            if (t1Var != null) {
                t1Var.f6453a = rVar;
            }
        }
    }

    public static final a1 m(tj.p0 p0Var, i0 i0Var) {
        Object value = p0Var.getValue();
        ti.i iVar = ti.i.f16336a;
        boolean zH = i0Var.h(iVar) | i0Var.h(p0Var);
        Object objQ = i0Var.Q();
        if (zH || objQ == m.f6385a) {
            objQ = new ab.s(iVar, p0Var, null, 8);
            i0Var.l0(objQ);
        }
        return F(value, p0Var, iVar, (ej.e) objQ, i0Var, 0);
    }

    public static final void n(i1.g gVar, ArrayList arrayList, int i10) {
        boolean zL = gVar.l(i10);
        int[] iArr = gVar.f8114b;
        if (zL) {
            arrayList.add(gVar.n(i10));
            return;
        }
        int i11 = iArr[(i10 * 5) + 3] + i10;
        for (int i12 = i10 + 1; i12 < i11; i12 += iArr[(i12 * 5) + 3]) {
            n(gVar, arrayList, i12);
        }
    }

    public static final qj.z o(i0 i0Var) {
        return new f2(i0Var.R);
    }

    public static final g1.e p() {
        p1.l lVar = o2.f6406b;
        g1.e eVar = (g1.e) lVar.get();
        if (eVar != null) {
            return eVar;
        }
        g1.e eVar2 = new g1.e(new h0[0]);
        lVar.C(eVar2);
        return eVar2;
    }

    public static final y q(ej.a aVar) {
        p1.l lVar = o2.f6405a;
        return new y(aVar, null);
    }

    public static final y r(ej.a aVar, n2 n2Var) {
        p1.l lVar = o2.f6405a;
        return new y(aVar, n2Var);
    }

    public static final int s(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iH = fj.l.h(((o0) list.get(i12)).f6403b, i10);
            if (iH < 0) {
                i11 = i12 + 1;
            } else {
                if (iH <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int t(i0 i0Var) {
        return Long.hashCode(i0Var.T);
    }

    public static final long u(i0 i0Var) {
        return i0Var.T;
    }

    public static final e v(ti.h hVar) {
        e eVar = (e) hVar.C(f.f6289c);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void w(i0 i0Var, Integer num, ej.e eVar) {
        if (i0Var.S) {
            i0Var.b(eVar, num);
        }
    }

    public static final boolean x(ArrayList arrayList) {
        return !arrayList.isEmpty();
    }

    public static final f1 y(float f10) {
        return new f1(f10);
    }

    public static final t1.q z() {
        return new t1.q();
    }
}
