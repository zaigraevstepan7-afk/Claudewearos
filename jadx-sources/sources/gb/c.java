package gb;

import c2.f0;
import c2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hb.h f7273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7274c;

    public /* synthetic */ c(int i10, hb.h hVar, boolean z2) {
        this.f7272a = i10;
        this.f7273b = hVar;
        this.f7274c = z2;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f7272a) {
            case 0:
                f0 f0Var = (f0) obj;
                fj.l.f(f0Var, "$this$drawBackdrop");
                hb.h hVar = this.f7273b;
                f0Var.p(((Number) hVar.f7810o.e()).floatValue());
                f0Var.j(((Number) hVar.f7811p.e()).floatValue());
                if (this.f7274c) {
                    float fFloatValue = ((Number) hVar.f7808m.e()).floatValue() / 10.0f;
                    float fC = f0Var.c();
                    float f10 = 0.75f * fFloatValue;
                    if (f10 < -0.2f) {
                        f10 = -0.2f;
                    }
                    if (f10 > 0.2f) {
                        f10 = 0.2f;
                    }
                    f0Var.p(fC / (1.0f - f10));
                    float fV = f0Var.v();
                    float f11 = fFloatValue * 0.25f;
                    float f12 = f11 >= -0.2f ? f11 : -0.2f;
                    f0Var.j((1.0f - (f12 <= 0.2f ? f12 : 0.2f)) * fV);
                }
                break;
            case 1:
                e2.d dVar = (e2.d) obj;
                fj.l.f(dVar, "$this$drawBackdrop");
                float fA = this.f7273b.a();
                e2.d.c1(dVar, this.f7274c ? w.c(w.f3052b, 0.1f) : w.c(w.f3054d, 0.1f), 0L, 0L, 1.0f - fA, null, 0, 118);
                e2.d.c1(dVar, w.c(w.f3052b, fA * 0.03f), 0L, 0L, 0.0f, null, 0, 126);
                break;
            case 2:
                fi.e eVar = (fi.e) obj;
                fj.l.f(eVar, "$this$drawBackdrop");
                float fA2 = this.f7273b.a();
                if (this.f7274c) {
                    float f13 = eVar.f6754a;
                    a.a.J(eVar, 10.0f * f13 * fA2, f13 * 14.0f * fA2, false, (12 & 8) == 0);
                }
                break;
            default:
                f0 f0Var2 = (f0) obj;
                fj.l.f(f0Var2, "$this$drawBackdrop");
                hb.h hVar2 = this.f7273b;
                f0Var2.p(((Number) hVar2.f7810o.e()).floatValue());
                f0Var2.j(((Number) hVar2.f7811p.e()).floatValue());
                if (this.f7274c) {
                    float fFloatValue2 = ((Number) hVar2.f7808m.e()).floatValue() / 10.0f;
                    float fC2 = f0Var2.c();
                    float f14 = 0.75f * fFloatValue2;
                    if (f14 < -0.2f) {
                        f14 = -0.2f;
                    }
                    if (f14 > 0.2f) {
                        f14 = 0.2f;
                    }
                    f0Var2.p(fC2 / (1.0f - f14));
                    float fV2 = f0Var2.v();
                    float f15 = fFloatValue2 * 0.25f;
                    float f16 = f15 >= -0.2f ? f15 : -0.2f;
                    f0Var2.j((1.0f - (f16 <= 0.2f ? f16 : 0.2f)) * fV2);
                }
                break;
        }
        return pi.o.f13011a;
    }
}
