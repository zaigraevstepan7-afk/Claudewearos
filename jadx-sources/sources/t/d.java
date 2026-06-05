package t;

import c1.h3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final l f15128a = new l(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final m f15129b = new m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final n f15130c = new n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final o f15131d = new o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final l f15132e = new l(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final m f15133f = new m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final n f15134g = new n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final o f15135h = new o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f15136i = new float[91];
    public static final p1 j = new p1(new ra.p0(8), new ra.p0(25));

    /* renamed from: k, reason: collision with root package name */
    public static final p1 f15137k = new p1(new ra.p0(9), new ra.p0(10));

    /* renamed from: l, reason: collision with root package name */
    public static final p1 f15138l = new p1(new ra.p0(11), new ra.p0(12));

    /* renamed from: m, reason: collision with root package name */
    public static final p1 f15139m = new p1(new ra.p0(13), new ra.p0(14));

    /* renamed from: n, reason: collision with root package name */
    public static final p1 f15140n = new p1(new ra.p0(15), new ra.p0(16));

    /* renamed from: o, reason: collision with root package name */
    public static final p1 f15141o = new p1(new ra.p0(17), new ra.p0(18));

    /* renamed from: p, reason: collision with root package name */
    public static final p1 f15142p = new p1(new ra.p0(19), new ra.p0(20));

    /* renamed from: q, reason: collision with root package name */
    public static final p1 f15143q = new p1(new ra.p0(21), new ra.p0(22));

    /* renamed from: r, reason: collision with root package name */
    public static final p1 f15144r = new p1(new ra.p0(23), new ra.p0(24));

    public static final c a(float f10, float f11) {
        return new c(Float.valueOf(f10), j, Float.valueOf(f11), 8);
    }

    public static k b(float f10, float f11, int i10) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return new k(j, Float.valueOf(f10), new l(f11), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void c(final j1 j1Var, final i1 i1Var, final Object obj, final Object obj2, final z zVar, f1.i0 i0Var, final int i10) {
        int i11;
        i0Var.c0(867041821);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(j1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.f(i1Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? i0Var.f(obj) : i0Var.h(obj) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? i0Var.f(obj2) : i0Var.h(obj2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? i0Var.f(zVar) : i0Var.h(zVar) ? 16384 : 8192;
        }
        if (!i0Var.T(i11 & 1, (i11 & 9363) != 9362)) {
            i0Var.W();
        } else if (j1Var.g()) {
            i1Var.f(obj, obj2, zVar);
        } else {
            i1Var.g(obj2, zVar);
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: t.k1
                @Override // ej.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    d.c(j1Var, i1Var, obj, obj2, zVar, (f1.i0) obj3, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final Object d(float f10, float f11, float f12, j jVar, ej.e eVar, vi.i iVar) {
        Float f13 = new Float(f10);
        Float f14 = new Float(f11);
        Float f15 = new Float(f12);
        p1 p1Var = j;
        ej.c cVar = p1Var.f15249a;
        p pVarC = (p) cVar.invoke(f15);
        if (pVarC == null) {
            pVarC = ((p) cVar.invoke(f13)).c();
        }
        p pVar = pVarC;
        Object objE = e(new k(p1Var, f13, pVar, 56), new c1(jVar, p1Var, f13, f14, pVar), Long.MIN_VALUE, new a1(0, eVar), iVar);
        ui.a aVar = ui.a.f17085a;
        pi.o oVar = pi.o.f13011a;
        if (objE != aVar) {
            objE = oVar;
        }
        return objE == aVar ? objE : oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(t.k r23, t.f r24, long r25, final ej.c r27, vi.c r28) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d.e(t.k, t.f, long, ej.c, vi.c):java.lang.Object");
    }

    public static final Object f(k kVar, u uVar, boolean z2, ej.c cVar, vi.c cVar2) {
        Object objE = e(kVar, new t(uVar, kVar.f15210a, kVar.f15211b.getValue(), kVar.f15212c), z2 ? kVar.f15213d : Long.MIN_VALUE, cVar, cVar2);
        return objE == ui.a.f17085a ? objE : pi.o.f13011a;
    }

    public static final f0 g(h0 h0Var, float f10, float f11, e0 e0Var, f1.i0 i0Var) {
        Float fValueOf = Float.valueOf(f10);
        Float fValueOf2 = Float.valueOf(f11);
        Object objQ = i0Var.Q();
        f1.f fVar = f1.m.f6385a;
        if (objQ == fVar) {
            objQ = new f0(h0Var, fValueOf, fValueOf2, e0Var);
            i0Var.l0(objQ);
        }
        f0 f0Var = (f0) objQ;
        boolean zH = i0Var.h(e0Var);
        Object objQ2 = i0Var.Q();
        if (zH || objQ2 == fVar) {
            objQ2 = new h3(fValueOf, f0Var, fValueOf2, e0Var, 7);
            i0Var.l0(objQ2);
        }
        f1.s.j((ej.a) objQ2, i0Var);
        boolean zH2 = i0Var.h(h0Var);
        Object objQ3 = i0Var.Q();
        if (zH2 || objQ3 == fVar) {
            objQ3 = new k0.t1(17, h0Var, f0Var);
            i0Var.l0(objQ3);
        }
        f1.s.c(f0Var, (ej.c) objQ3, i0Var);
        return f0Var;
    }

    public static final Object h(k kVar, Float f10, j jVar, boolean z2, ej.c cVar, vi.c cVar2) {
        Object objE = e(kVar, new c1(jVar, kVar.f15210a, kVar.f15211b.getValue(), f10, kVar.f15212c), z2 ? kVar.f15213d : Long.MIN_VALUE, cVar, cVar2);
        return objE == ui.a.f17085a ? objE : pi.o.f13011a;
    }

    public static final float i(u uVar, float f10, float f11) {
        b0 b0Var = uVar.f15291a;
        l lVar = new l(0.0f);
        int iB = lVar.b();
        int i10 = 0;
        while (i10 < iB) {
            lVar.e(b0Var.n(i10 == 0 ? f10 : 0.0f, i10 == 0 ? f11 : 0.0f), i10);
            i10++;
        }
        return lVar.f15223a;
    }

    public static final p j(p pVar) {
        p pVarC = pVar.c();
        int iB = pVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            pVarC.e(pVar.a(i10), i10);
        }
        return pVarC;
    }

    public static k k(k kVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) kVar.f15211b.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((l) kVar.f15212c).f15223a;
        }
        return new k(kVar.f15210a, Float.valueOf(f10), new l(f11), kVar.f15213d, kVar.f15214e, kVar.f15215f);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ej.c, fj.m] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ej.c, fj.m] */
    public static final f1 l(j1 j1Var, p1 p1Var, String str, f1.i0 i0Var, int i10, int i11) {
        e1 e1Var;
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = i0Var.f(j1Var);
        Object objQ = i0Var.Q();
        Object obj = f1.m.f6385a;
        if (zF || objQ == obj) {
            objQ = new f1(j1Var, p1Var, str);
            i0Var.l0(objQ);
        }
        f1 f1Var = (f1) objQ;
        boolean zF2 = i0Var.f(j1Var) | i0Var.h(f1Var);
        Object objQ2 = i0Var.Q();
        if (zF2 || objQ2 == obj) {
            objQ2 = new k0.t1(20, j1Var, f1Var);
            i0Var.l0(objQ2);
        }
        f1.s.c(f1Var, (ej.c) objQ2, i0Var);
        if (j1Var.g() && (e1Var = (e1) f1Var.f15166b.getValue()) != null) {
            j1 j1Var2 = f1Var.f15167c;
            e1Var.f15154a.f(e1Var.f15156c.invoke(j1Var2.f().b()), e1Var.f15156c.invoke(j1Var2.f().c()), (z) e1Var.f15155b.invoke(j1Var2.f()));
        }
        return f1Var;
    }

    public static final i1 m(j1 j1Var, Object obj, Object obj2, z zVar, p1 p1Var, f1.i0 i0Var, int i10) {
        boolean zF = i0Var.f(j1Var);
        Object objQ = i0Var.Q();
        Object obj3 = f1.m.f6385a;
        if (zF || objQ == obj3) {
            t1.g gVarF = t1.r.f();
            ej.c cVarE = gVarF != null ? gVarF.e() : null;
            t1.g gVarK = t1.r.k(gVarF);
            try {
                p pVar = (p) p1Var.f15249a.invoke(obj2);
                pVar.d();
                objQ = new i1(j1Var, obj, pVar, p1Var);
                t1.r.n(gVarF, gVarK, cVarE);
                i0Var.l0(objQ);
            } catch (Throwable th2) {
                t1.r.n(gVarF, gVarK, cVarE);
                throw th2;
            }
        }
        i1 i1Var = (i1) objQ;
        c(j1Var, i1Var, obj, obj2, zVar, i0Var, 0);
        boolean zF2 = i0Var.f(j1Var) | i0Var.f(i1Var);
        Object objQ2 = i0Var.Q();
        if (zF2 || objQ2 == obj3) {
            objQ2 = new k0.t1(21, j1Var, i1Var);
            i0Var.l0(objQ2);
        }
        f1.s.c(i1Var, (ej.c) objQ2, i0Var);
        return i1Var;
    }

    public static final void n(i iVar, long j4, float f10, f fVar, k kVar, ej.c cVar) {
        long jB = f10 == 0.0f ? fVar.b() : (long) ((j4 - iVar.f15182c) / f10);
        iVar.f15186g = j4;
        iVar.f15184e.setValue(fVar.f(jB));
        iVar.f15185f = fVar.d(jB);
        if (fVar.e(jB)) {
            iVar.f15187h = iVar.f15186g;
            iVar.f15188i.setValue(Boolean.FALSE);
        }
        u(iVar, kVar);
        cVar.invoke(iVar);
    }

    public static u o() {
        return new u(new q5.e(2));
    }

    public static final float p(ti.h hVar) {
        v1.p pVar = (v1.p) hVar.C(v1.b.H);
        float fD = pVar != null ? pVar.D() : 1.0f;
        if (fD >= 0.0f) {
            return fD;
        }
        q0.b("negative scale factor");
        return fD;
    }

    public static e0 q(v vVar) {
        r0 r0Var = r0.f15268a;
        return new e0(vVar, 0);
    }

    public static s0 r() {
        return new s0(0);
    }

    public static u0 s(float f10, float f11, Object obj, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new u0(f10, f11, obj);
    }

    public static o1 t(int i10, int i11, w wVar, int i12) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            wVar = y.f15326a;
        }
        return new o1(i10, i11, wVar);
    }

    public static final void u(i iVar, k kVar) {
        kVar.f15211b.setValue(iVar.f15184e.getValue());
        p pVar = kVar.f15212c;
        p pVar2 = iVar.f15185f;
        int iB = pVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            pVar.e(pVar2.a(i10), i10);
        }
        kVar.f15214e = iVar.f15187h;
        kVar.f15213d = iVar.f15186g;
        kVar.f15215f = ((Boolean) iVar.f15188i.getValue()).booleanValue();
    }

    public static final j1 v(Object obj, String str, f1.i0 i0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        Object objQ = i0Var.Q();
        f1.f fVar = f1.m.f6385a;
        if (objQ == fVar) {
            objQ = new j1(new l0(obj), null, str);
            i0Var.l0(objQ);
        }
        j1 j1Var = (j1) objQ;
        j1Var.a(obj, i0Var, (i10 & 8) | 48 | (i10 & 14));
        Object objQ2 = i0Var.Q();
        if (objQ2 == fVar) {
            objQ2 = new l1(j1Var, 1);
            i0Var.l0(objQ2);
        }
        f1.s.c(j1Var, (ej.c) objQ2, i0Var);
        return j1Var;
    }
}
