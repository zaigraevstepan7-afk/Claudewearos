package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f10238b;

    public /* synthetic */ d3(float f10, int i10) {
        this.f10237a = i10;
        this.f10238b = f10;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f10237a) {
            case 0:
                e2.d dVar = (e2.d) obj;
                fj.l.f(dVar, "$this$Canvas");
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.a() >> 32)) / 2.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.a() & 4294967295L)) / 2.0f;
                float fMin = (Math.min(Float.intBitsToFloat((int) (dVar.a() >> 32)), Float.intBitsToFloat((int) (dVar.a() & 4294967295L))) / 2.0f) - dVar.w0(3);
                e2.d.V0(dVar, c2.e0.d(4293256682L), fMin, 0L, new e2.h(0, 0, dVar.w0(1), 0.0f, 30), 108);
                double d10 = (float) ((this.f10238b * 3.141592653589793d) / 180.0d);
                float fCos = (float) Math.cos(d10);
                float fSin = (((float) Math.sin(d10)) * fMin * 0.35f) + fIntBitsToFloat2;
                dVar.k0(new c2.p0(qi.k.c0(new c2.w[]{new c2.w(c2.w.c(c2.e0.d(4294967295L), 0.9f)), new c2.w(c2.w.c(c2.e0.d(4294111991L), 0.5f))}), (Float.floatToRawIntBits(fSin) & 4294967295L) | (Float.floatToRawIntBits(((fCos * fMin) * 0.35f) + fIntBitsToFloat) << 32), 1.1f * fMin), fMin - dVar.w0((float) 0.5d), dVar.L0());
                float f10 = fMin * 0.52f;
                float fCos2 = (((float) Math.cos(d10)) * f10) + fIntBitsToFloat;
                float fSin2 = (((float) Math.sin(d10)) * f10) + fIntBitsToFloat2;
                float f11 = 2;
                dVar.R(c2.e0.d(4278221567L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(fCos2) << 32) | (Float.floatToRawIntBits(fSin2) & 4294967295L), dVar.w0(f11), (480 & 16) != 0 ? 0 : 1);
                float fW0 = dVar.w0(8);
                double d11 = d10 + 3.141592653589793d;
                float f12 = (float) (d11 - 0.6108652381980153d);
                float f13 = (float) (d11 + 0.6108652381980153d);
                double d12 = f12;
                float fCos3 = (((float) Math.cos(d12)) * fW0) + fCos2;
                float fSin3 = (((float) Math.sin(d12)) * fW0) + fSin2;
                dVar.R(c2.e0.d(4278221567L), (Float.floatToRawIntBits(fCos2) << 32) | (Float.floatToRawIntBits(fSin2) & 4294967295L), (Float.floatToRawIntBits(fSin3) & 4294967295L) | (Float.floatToRawIntBits(fCos3) << 32), dVar.w0(f11), (480 & 16) != 0 ? 0 : 1);
                double d13 = f13;
                float fCos4 = (((float) Math.cos(d13)) * fW0) + fCos2;
                float fSin4 = (((float) Math.sin(d13)) * fW0) + fSin2;
                dVar.R(c2.e0.d(4278221567L), (Float.floatToRawIntBits(fCos2) << 32) | (Float.floatToRawIntBits(fSin2) & 4294967295L), (Float.floatToRawIntBits(fCos4) << 32) | (Float.floatToRawIntBits(fSin4) & 4294967295L), dVar.w0(f11), (480 & 16) != 0 ? 0 : 1);
                e2.d.V0(dVar, c2.e0.d(4278221567L), dVar.w0((float) 2.5d), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), null, 120);
                break;
            case 1:
                c2.f0 f0Var = (c2.f0) obj;
                fj.l.f(f0Var, "$this$graphicsLayer");
                float f14 = this.f10238b;
                f0Var.p(f14);
                f0Var.j(f14);
                break;
            default:
                c2.f0 f0Var2 = (c2.f0) obj;
                fj.l.f(f0Var2, "$this$graphicsLayer");
                f0Var2.g(this.f10238b);
                break;
        }
        return pi.o.f13011a;
    }
}
