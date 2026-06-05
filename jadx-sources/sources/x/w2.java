package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta.n f19747a = new ta.n(28);

    public static final void a(p7.k kVar, m2.b bVar, o1 o1Var, m2.a aVar, k4.d dVar, long j) {
        float fIntBitsToFloat;
        q.b0 b0Var = (q.b0) dVar.f9421b;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.f11261c >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar.f11261c & 4294967295L));
        if (h(bVar)) {
            dVar.f9420a = 0;
            b0Var.d();
        }
        if (!b(bVar) && !h(bVar)) {
            if (b0Var.f13034b == 3) {
                int i10 = dVar.f9420a;
                dVar.f9420a = i10 + 1;
                b0Var.n(i10, bVar);
            } else {
                b0Var.a(bVar);
            }
            if (dVar.f9420a == 3) {
                dVar.f9420a = 0;
            }
            Object[] objArr = b0Var.f13033a;
            int i11 = b0Var.f13034b;
            float fIntBitsToFloat4 = 0.0f;
            for (int i12 = 0; i12 < i11; i12++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((m2.b) objArr[i12]).f11261c >> 32));
            }
            int i13 = b0Var.f13034b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i13;
            Object[] objArr2 = b0Var.f13033a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i14 = 0; i14 < i13; i14++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((m2.b) objArr2[i14]).f11261c & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / b0Var.f13034b;
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L);
        if (o1Var != null) {
            int i15 = aVar.f11258a;
            if (i15 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i15 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = o1Var == o1.f19665b ? (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L) : (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
        }
        ((q2.b) kVar.f12813b).a(bVar.f11260b, b2.b.f(jFloatToRawIntBits, j));
    }

    public static final boolean b(m2.b bVar) {
        return bVar.f11266h && !bVar.f11262d;
    }

    public static final float c(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(p2.o0 r8, p2.o r9, vi.a r10) {
        /*
            boolean r0 = r10 instanceof x.t0
            if (r0 == 0) goto L13
            r0 = r10
            x.t0 r0 = (x.t0) r0
            int r1 = r0.f19720d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19720d = r1
            goto L18
        L13:
            x.t0 r0 = new x.t0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f19719c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19720d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            p2.o r8 = r0.f19718b
            p2.o0 r9 = r0.f19717a
            uk.c.R(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            uk.c.R(r10)
            p2.p0 r10 = r8.f12752f
            p2.n r10 = r10.L
            java.lang.Object r10 = r10.f12734a
            int r2 = r10.size()
            r5 = r3
        L45:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            p2.w r6 = (p2.w) r6
            boolean r6 = r6.f12763d
            if (r6 == 0) goto L77
        L51:
            r0.f19717a = r8
            r0.f19718b = r9
            r0.f19720d = r4
            java.lang.Object r10 = r8.l(r9, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            p2.n r10 = (p2.n) r10
            java.lang.Object r10 = r10.f12734a
            int r2 = r10.size()
            r5 = r3
        L67:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            p2.w r6 = (p2.w) r6
            boolean r6 = r6.f12763d
            if (r6 == 0) goto L74
            goto L51
        L74:
            int r5 = r5 + 1
            goto L67
        L77:
            int r5 = r5 + 1
            goto L45
        L7a:
            pi.o r8 = pi.o.f13011a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x.w2.d(p2.o0, p2.o, vi.a):java.lang.Object");
    }

    public static final Object e(p2.a0 a0Var, ej.e eVar, ti.c cVar) {
        Object objQ1 = ((p2.p0) a0Var).q1(new k0.x0(cVar.getContext(), eVar, (ti.c) null), cVar);
        return objQ1 == ui.a.f17085a ? objQ1 : pi.o.f13011a;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final long f(p2.n nVar, boolean z2) {
        ?? r72 = nVar.f12734a;
        int size = r72.size();
        long jF = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            p2.w wVar = (p2.w) r72.get(i11);
            if (wVar.f12763d && wVar.f12767h) {
                jF = b2.b.f(jF, z2 ? wVar.f12762c : wVar.f12766g);
                i10++;
            }
        }
        if (i10 == 0) {
            return 9205357640488583168L;
        }
        return b2.b.b(jF, i10);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final float g(p2.n nVar, boolean z2) {
        long jF = f(nVar, z2);
        float fD = 0.0f;
        if (b2.b.c(jF, 9205357640488583168L)) {
            return 0.0f;
        }
        ?? r82 = nVar.f12734a;
        int size = r82.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            p2.w wVar = (p2.w) r82.get(i11);
            if (wVar.f12763d && wVar.f12767h) {
                i10++;
                fD = b2.b.d(b2.b.e(z2 ? wVar.f12762c : wVar.f12766g, jF)) + fD;
            }
        }
        return fD / i10;
    }

    public static final boolean h(m2.b bVar) {
        return !bVar.f11266h && bVar.f11262d;
    }

    public static final long i(m2.b bVar, o1 o1Var, m2.a aVar, boolean z2) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j4 = bVar.f11265g;
        if (o1Var != null) {
            int i10 = aVar.f11258a;
            if (i10 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
            } else if (i10 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j4 & 4294967295L));
            }
            if (o1Var == o1.f19665b) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j4 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jE = b2.b.e(j(bVar, o1Var, aVar), j4);
        if (z2 || !bVar.f11267i) {
            return jE;
        }
        return 0L;
    }

    public static final long j(m2.b bVar, o1 o1Var, m2.a aVar) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (o1Var == null) {
            return bVar.f11261c;
        }
        int i10 = aVar.f11258a;
        if (i10 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.f11261c >> 32));
        } else {
            if (i10 != 2) {
                return bVar.f11261c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.f11261c & 4294967295L));
        }
        if (o1Var == o1.f19665b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }
}
