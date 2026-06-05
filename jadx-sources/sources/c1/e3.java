package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.q2 f2050c;

    public /* synthetic */ e3(long j, f1.q2 q2Var, int i10) {
        this.f2048a = i10;
        this.f2049b = j;
        this.f2050c = q2Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f2048a) {
            case 0:
                e2.d.c1((e2.d) obj, this.f2049b, 0L, 0L, cg.b.o(((Number) this.f2050c.getValue()).floatValue(), 0.0f, 1.0f), null, 0, 118);
                break;
            default:
                v2.h0 h0Var = (v2.h0) obj;
                fj.l.f(h0Var, "$this$drawWithContent");
                e2.b bVar = h0Var.f17669a;
                h0Var.f();
                f1.q2 q2Var = this.f2050c;
                if (((Number) q2Var.getValue()).floatValue() > 0.001f) {
                    float fMin = Math.min(Float.intBitsToFloat((int) (bVar.a() >> 32)), Float.intBitsToFloat((int) (bVar.a() & 4294967295L)));
                    if (fMin > 0.0f) {
                        float f10 = 0.07f * fMin;
                        float f11 = 0.038f * fMin;
                        float f12 = f11 < 1.0f ? 1.0f : f11;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.a() >> 32)) / 2.0f;
                        e2.d.V0(h0Var, c2.w.c(this.f2049b, ((Number) q2Var.getValue()).floatValue()), ((fMin / 2.0f) + f10) - (f12 / 2.0f), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.a() & 4294967295L)) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), new e2.h(1, 0, f12, 0.0f, 26), 104);
                    }
                }
                break;
        }
        return pi.o.f13011a;
    }
}
