package d3;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import java.util.List;
import v2.f0;
import v2.i1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final b2.c f4775a = new b2.c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final d3.r a(v2.f0 r8, boolean r9) {
        /*
            v2.b1 r0 = r8.Y
            v1.n r0 = r0.f17586f
            int r1 = r0.f17568d
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L64
        Lb:
            if (r0 == 0) goto L64
            int r1 = r0.f17567c
            r1 = r1 & 8
            if (r1 == 0) goto L5b
            r1 = r0
            r3 = r2
        L15:
            if (r1 == 0) goto L5b
            boolean r4 = r1 instanceof v2.z1
            if (r4 == 0) goto L1d
            r2 = r1
            goto L64
        L1d:
            int r4 = r1.f17567c
            r4 = r4 & 8
            if (r4 == 0) goto L56
            boolean r4 = r1 instanceof v2.k
            if (r4 == 0) goto L56
            r4 = r1
            v2.k r4 = (v2.k) r4
            v1.n r4 = r4.I
            r5 = 0
        L2d:
            r6 = 1
            if (r4 == 0) goto L53
            int r7 = r4.f17567c
            r7 = r7 & 8
            if (r7 == 0) goto L50
            int r5 = r5 + 1
            if (r5 != r6) goto L3c
            r1 = r4
            goto L50
        L3c:
            if (r3 != 0) goto L47
            g1.e r3 = new g1.e
            r6 = 16
            v1.n[] r6 = new v1.n[r6]
            r3.<init>(r6)
        L47:
            if (r1 == 0) goto L4d
            r3.b(r1)
            r1 = r2
        L4d:
            r3.b(r4)
        L50:
            v1.n r4 = r4.f17570f
            goto L2d
        L53:
            if (r5 != r6) goto L56
            goto L15
        L56:
            v1.n r1 = v2.n.e(r3)
            goto L15
        L5b:
            int r1 = r0.f17568d
            r1 = r1 & 8
            if (r1 == 0) goto L64
            v1.n r0 = r0.f17570f
            goto Lb
        L64:
            fj.l.c(r2)
            v2.z1 r2 = (v2.z1) r2
            v1.n r2 = (v1.n) r2
            v1.n r0 = r2.f17565a
            d3.n r1 = r8.w()
            if (r1 != 0) goto L78
            d3.n r1 = new d3.n
            r1.<init>()
        L78:
            d3.r r2 = new d3.r
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.u.a(v2.f0, boolean):d3.r");
    }

    public static final q.v b(t tVar, ej.c cVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            r rVarA = tVar.a();
            f0 f0Var = rVarA.f4765c;
            if (f0Var.H() && f0Var.G()) {
                b2.c cVarG = rVarA.g();
                q.v vVar = new q.v(48);
                ld.i iVar = new ld.i(5);
                iVar.T(a.a.S(cVarG));
                e(rVarA, rVarA, cVar, new ld.i(5), iVar, vVar);
                return vVar;
            }
            q.v vVar2 = q.l.f13102a;
            fj.l.d(vVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return vVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(r rVar, r rVar2, ej.c cVar, ld.i iVar, ld.i iVar2, q.v vVar) {
        ld.i iVar3 = iVar;
        Region region = (Region) iVar3.f10924b;
        ld.i iVar4 = iVar2;
        Region region2 = (Region) iVar4.f10924b;
        f0 f0Var = rVar2.f4765c;
        f0 f0Var2 = rVar2.f4765c;
        if (!f0Var.H() || !f0Var2.G() || region2.isEmpty()) {
            if (rVar2.o()) {
                d(vVar, rVar, rVar2);
                return;
            }
            return;
        }
        b2.c cVarM = rVar2.m();
        if (cVarM.f()) {
            Object objF = rVar2.f();
            if (objF == null) {
                v2.s sVar = f0Var2.Y.f17583c;
                cVarM = t2.z.h(sVar).z(sVar, false);
            } else {
                v1.n nVar = ((v1.n) objF).f17565a;
                Object objG = rVar2.f4766d.f4758a.g(m.f4734b);
                if (objG == null) {
                    objG = null;
                }
                cVarM = v2.n.i(nVar, objG != null, false);
            }
        }
        s3.k kVarS = a.a.S(cVarM);
        iVar3.T(kVarS);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i10 = rVar2.f4768f;
            if (i10 == rVar.f4768f) {
                i10 = -1;
            }
            Rect bounds = region.getBounds();
            vVar.i(i10, new s(rVar2, new s3.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List listJ = r.j(4, rVar2);
            int size = listJ.size() - 1;
            while (-1 < size) {
                if (!((Boolean) cVar.invoke(listJ.get(size))).booleanValue()) {
                    c(rVar, (r) listJ.get(size), cVar, iVar3, iVar4, vVar);
                }
                size--;
                iVar3 = iVar;
                iVar4 = iVar2;
            }
            if (h(rVar2)) {
                region2.op(kVarS.f14747a, kVarS.f14748b, kVarS.f14749c, kVarS.f14750d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void d(q.v vVar, r rVar, r rVar2) {
        f0 f0Var;
        r rVarL = rVar2.l();
        b2.c cVarG = (rVarL == null || (f0Var = rVarL.f4765c) == null || !f0Var.H()) ? f4775a : rVarL.g();
        int i10 = rVar2.f4768f;
        if (i10 == rVar.f4768f) {
            i10 = -1;
        }
        vVar.i(i10, new s(rVar2, a.a.S(cVarG)));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(d3.r r17, d3.r r18, ej.c r19, ld.i r20, ld.i r21, q.v r22) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.u.e(d3.r, d3.r, ej.c, ld.i, ld.i, q.v):void");
    }

    public static final Object f(n nVar, y yVar) {
        Object objG = nVar.f4758a.g(yVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final boolean g(r rVar) {
        i1 i1VarD = rVar.d();
        n nVar = rVar.f4766d;
        if (i1VarD != null ? i1VarD.E1() : false) {
            return true;
        }
        y yVar = v.f4776a;
        if (nVar.f4758a.c(v.f4791q)) {
            return true;
        }
        return nVar.f4758a.c(v.f4790p);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean h(d3.r r14) {
        /*
            boolean r0 = g(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            d3.n r14 = r14.f4766d
            boolean r0 = r14.f4760c
            if (r0 != 0) goto L59
            q.g0 r14 = r14.f4758a
            java.lang.Object[] r0 = r14.f13074b
            java.lang.Object[] r2 = r14.f13075c
            long[] r14 = r14.f13073a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            d3.y r11 = (d3.y) r11
            boolean r10 = r11.f4806c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.u.h(d3.r):boolean");
    }
}
