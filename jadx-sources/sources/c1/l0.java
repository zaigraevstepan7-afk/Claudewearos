package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements ej.c {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2357a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2359c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2362f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2363z;

    public /* synthetic */ l0(f1.q2 q2Var, f1.q2 q2Var2, e2.h hVar, f1.q2 q2Var3, t.i1 i1Var, t.i1 i1Var2, e2.h hVar2, h0 h0Var) {
        this.f2358b = q2Var;
        this.f2359c = q2Var2;
        this.f2363z = hVar;
        this.f2360d = q2Var3;
        this.f2361e = i1Var;
        this.f2362f = i1Var2;
        this.A = hVar2;
        this.B = h0Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        e2.d dVar;
        f1.q2 q2Var;
        h0 h0Var;
        float f10;
        String strValueOf;
        switch (this.f2357a) {
            case 0:
                f1.q2 q2Var2 = (f1.q2) this.f2358b;
                f1.q2 q2Var3 = (f1.q2) this.f2359c;
                e2.h hVar = (e2.h) this.f2363z;
                f1.q2 q2Var4 = (f1.q2) this.f2360d;
                f1.q2 q2Var5 = (f1.q2) this.f2361e;
                f1.q2 q2Var6 = (f1.q2) this.f2362f;
                e2.h hVar2 = (e2.h) this.A;
                h0 h0Var2 = (h0) this.B;
                e2.d dVar2 = (e2.d) obj;
                long j = ((c2.w) q2Var2.getValue()).f3060a;
                long j4 = ((c2.w) q2Var3.getValue()).f3060a;
                float fW0 = dVar2.w0(n0.f2461c);
                float f11 = hVar.f5744a;
                float f12 = f11 / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.a() >> 32));
                boolean zD = c2.w.d(j, j4);
                e2.g gVar = e2.g.f5743a;
                if (zD) {
                    dVar = dVar2;
                    dVar.f0(j, (224 & 2) != 0 ? 0L : 0L, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(fW0) << 32) | (Float.floatToRawIntBits(fW0) & 4294967295L), gVar);
                    h0Var = h0Var2;
                    q2Var = q2Var5;
                    f10 = 0.0f;
                } else {
                    dVar = dVar2;
                    q2Var = q2Var5;
                    float f13 = fIntBitsToFloat - (2 * f11);
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
                    float fMax = Math.max(0.0f, fW0 - f11);
                    dVar.f0(j, (224 & 2) != 0 ? 0L : (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), jFloatToRawIntBits, (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L), gVar);
                    float f14 = fIntBitsToFloat - f11;
                    float f15 = fW0 - f12;
                    h0Var = h0Var2;
                    f10 = 0.0f;
                    dVar.f0(j4, (224 & 2) != 0 ? 0L : (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32), (Float.floatToRawIntBits(f15) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32), hVar);
                }
                long j10 = ((c2.w) q2Var4.getValue()).f3060a;
                float fFloatValue = ((Number) q2Var.getValue()).floatValue();
                float fFloatValue2 = ((Number) q2Var6.getValue()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.a() >> 32));
                float fL = u3.c.l(0.4f, 0.5f, fFloatValue2);
                float fL2 = u3.c.l(0.7f, 0.5f, fFloatValue2);
                float fL3 = u3.c.l(0.5f, 0.5f, fFloatValue2);
                float fL4 = u3.c.l(0.3f, 0.5f, fFloatValue2);
                h0Var.f2174a.k();
                c2.j jVar = h0Var.f2174a;
                jVar.h(0.2f * fIntBitsToFloat2, fL3 * fIntBitsToFloat2);
                jVar.g(fL * fIntBitsToFloat2, fL2 * fIntBitsToFloat2);
                jVar.g(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fL4);
                c2.k kVar = h0Var.f2175b;
                kVar.f3014a.setPath(jVar != null ? jVar.f3006a : null, false);
                c2.j jVar2 = h0Var.f2176c;
                jVar2.k();
                kVar.a(f10, kVar.f3014a.getLength() * fFloatValue, jVar2);
                e2.d.F(dVar, h0Var.f2176c, j10, hVar2, 52);
                break;
            default:
                k2.a aVar = (k2.a) this.f2358b;
                t1.t tVar = (t1.t) this.f2359c;
                mg.d dVar3 = (mg.d) this.f2360d;
                ra.c cVar = (ra.c) this.f2361e;
                String str = (String) this.f2362f;
                f1.a1 a1Var = (f1.a1) this.f2363z;
                f1.a1 a1Var2 = (f1.a1) this.A;
                f1.a1 a1Var3 = (f1.a1) this.B;
                String str2 = (String) obj;
                fj.l.f(str2, "new");
                Character chValueOf = str2.length() == 0 ? null : Character.valueOf(str2.charAt(str2.length() - 1));
                if (chValueOf == null || (strValueOf = String.valueOf(chValueOf.charValue())) == null) {
                    strValueOf = "";
                }
                if (nj.e.K0(strValueOf)) {
                    a1Var3.setValue(str2);
                } else {
                    ra.o1.b(aVar, tVar, dVar3, cVar, str, a1Var, strValueOf);
                    a1Var2.setValue(Boolean.FALSE);
                    a1Var3.setValue("");
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ l0(k2.a aVar, t1.t tVar, mg.d dVar, ra.c cVar, String str, f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3) {
        this.f2358b = aVar;
        this.f2359c = tVar;
        this.f2360d = dVar;
        this.f2361e = cVar;
        this.f2362f = str;
        this.f2363z = a1Var;
        this.A = a1Var2;
        this.B = a1Var3;
    }
}
