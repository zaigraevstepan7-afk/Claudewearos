package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class x4 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2859a = 240;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2860b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2861c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2862d;

    /* renamed from: e, reason: collision with root package name */
    public static final t.s f2863e;

    static {
        float f10 = e1.s.f5647a;
        f2860b = e1.s.f5647a;
        f2861c = 6;
        float f11 = e1.j.f5441a;
        f2862d = e1.j.f5441a;
        t.s sVar = e1.v.f5675a;
        f2863e = e1.v.f5677c;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(v1.o r28, long r29, float r31, long r32, int r34, float r35, f1.i0 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.x4.a(v1.o, long, float, long, int, float, f1.i0, int, int):void");
    }

    public static final void b(ej.a aVar, final v1.o oVar, final long j, final long j4, final int i10, float f10, ej.c cVar, f1.i0 i0Var, final int i11) {
        ej.a aVar2;
        final float f11;
        final ej.c cVar2;
        float f12;
        final long j10;
        int i12;
        final ej.c cVar3;
        final float f13;
        i0Var.c0(-339970038);
        int i13 = i11 | (i0Var.f(oVar) ? 32 : 16) | (i0Var.d(i10) ? 16384 : 8192) | 720896;
        if (i0Var.T(i13 & 1, (599187 & i13) != 599186)) {
            i0Var.Y();
            int i14 = i11 & 1;
            Object obj = f1.m.f6385a;
            if (i14 == 0 || i0Var.C()) {
                f12 = r4.f2641d;
                boolean z2 = (i13 & 57344) == 16384;
                Object objQ = i0Var.Q();
                if (z2 || objQ == obj) {
                    j10 = j;
                    objQ = new ej.c() { // from class: c1.u4
                        @Override // ej.c
                        public final Object invoke(Object obj2) {
                            e2.d dVar = (e2.d) obj2;
                            float fMin = Math.min(dVar.w0(r4.f2640c), Float.intBitsToFloat((int) (dVar.a() & 4294967295L)));
                            float fW0 = dVar.w0(x4.f2861c);
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (dVar.a() & 4294967295L)) - fMin) / 2;
                            float f14 = fIntBitsToFloat > fW0 ? fW0 : fIntBitsToFloat;
                            s3.m layoutDirection = dVar.getLayoutDirection();
                            s3.m mVar = s3.m.f14753b;
                            long j11 = j10;
                            int i15 = i10;
                            if (layoutDirection == mVar) {
                                long jL0 = dVar.L0();
                                ac.d dVarC0 = dVar.C0();
                                long jY = dVarC0.y();
                                dVarC0.h().f();
                                try {
                                    ((ld.i) dVarC0.f373b).S(-1.0f, 1.0f, jL0);
                                    r4.a(dVar, i15, j11, fMin, f14);
                                } finally {
                                    t.m1.r(dVarC0, jY);
                                }
                            } else {
                                r4.a(dVar, i15, j11, fMin, f14);
                            }
                            return pi.o.f13011a;
                        }
                    };
                    i0Var.l0(objQ);
                } else {
                    j10 = j;
                }
                i12 = i13 & (-3670017);
                cVar3 = (ej.c) objQ;
            } else {
                i0Var.W();
                i12 = i13 & (-3670017);
                j10 = j;
                f12 = f10;
                cVar3 = cVar;
            }
            i0Var.q();
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj) {
                aVar2 = aVar;
                objQ2 = new d3(2, aVar2);
                i0Var.l0(objQ2);
            } else {
                aVar2 = aVar;
            }
            final ej.a aVar3 = (ej.a) objQ2;
            v1.o oVarC = oVar.c(d1.c.f4481d);
            boolean zF = i0Var.f(aVar3);
            Object objQ3 = i0Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new l(3, aVar3);
                i0Var.l0(objQ3);
            }
            v1.o oVarL = b0.t1.l(d3.p.a(oVarC, true, (ej.c) objQ3), f2859a, f2860b);
            boolean zF2 = i0Var.f(aVar3) | ((i12 & 57344) == 16384) | i0Var.f(cVar3);
            Object objQ4 = i0Var.Q();
            if (zF2 || objQ4 == obj) {
                f13 = f12;
                final long j11 = j10;
                Object obj2 = new ej.c() { // from class: c1.v4
                    @Override // ej.c
                    public final Object invoke(Object obj3) {
                        e2.d dVar = (e2.d) obj3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.a() & 4294967295L));
                        int i15 = i10;
                        float fL0 = f13;
                        if (i15 != 0 && Float.intBitsToFloat((int) (dVar.a() & 4294967295L)) <= Float.intBitsToFloat((int) (dVar.a() >> 32))) {
                            fL0 += dVar.l0(fIntBitsToFloat);
                        }
                        float fL02 = fL0 / dVar.l0(Float.intBitsToFloat((int) (dVar.a() >> 32)));
                        float fFloatValue = ((Number) aVar3.a()).floatValue();
                        float fMin = Math.min(fFloatValue, fL02) + fFloatValue;
                        if (fMin <= 1.0f) {
                            x4.d(dVar, fMin, 1.0f, j4, fIntBitsToFloat, i15);
                        }
                        x4.d(dVar, 0.0f, fFloatValue, j11, fIntBitsToFloat, i15);
                        cVar3.invoke(dVar);
                        return pi.o.f13011a;
                    }
                };
                i0Var.l0(obj2);
                objQ4 = obj2;
            } else {
                f13 = f12;
            }
            v.n.a(oVarL, (ej.c) objQ4, i0Var, 0);
            f11 = f13;
            cVar2 = cVar3;
        } else {
            aVar2 = aVar;
            i0Var.W();
            f11 = f10;
            cVar2 = cVar;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            final ej.a aVar4 = aVar2;
            t1VarU.f6456d = new ej.e(oVar, j, j4, i10, f11, cVar2, i11) { // from class: c1.w4

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v1.o f2825b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f2826c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f2827d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f2828e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f2829f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ ej.c f2830z;

                @Override // ej.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iO = f1.s.O(3463);
                    x4.b(this.f2824a, this.f2825b, this.f2826c, this.f2827d, this.f2828e, this.f2829f, this.f2830z, (f1.i0) obj3, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void c(e2.d dVar, float f10, float f11, long j, e2.h hVar) {
        float f12 = 2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.a() >> 32)) - (f12 * (hVar.f5744a / f12));
        dVar.S(j, f10, f11, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), hVar);
    }

    public static final void d(e2.d dVar, float f10, float f11, long j, float f12, int i10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.a() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.a() & 4294967295L));
        float f13 = 2;
        float f14 = fIntBitsToFloat2 / f13;
        boolean z2 = dVar.getLayoutDirection() == s3.m.f14752a;
        float f15 = (z2 ? f10 : 1.0f - f11) * fIntBitsToFloat;
        float f16 = (z2 ? f11 : 1.0f - f10) * fIntBitsToFloat;
        if (i10 == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            dVar.R(j, (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), (Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), f12, (480 & 16) != 0 ? 0 : 0);
            return;
        }
        float f17 = f12 / f13;
        float f18 = fIntBitsToFloat - f17;
        if (f15 < f17) {
            f15 = f17;
        }
        if (f15 > f18) {
            f15 = f18;
        }
        if (f16 < f17) {
            f16 = f17;
        }
        if (f16 <= f18) {
            f18 = f16;
        }
        if (Math.abs(f11 - f10) > 0.0f) {
            dVar.R(j, (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), f12, (480 & 16) != 0 ? 0 : i10);
        }
    }
}
