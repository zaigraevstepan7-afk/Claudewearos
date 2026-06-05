package wa;

import f1.f1;
import f1.g1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 extends vi.i implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public int f19106a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ float f19107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0.d f19108c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f19109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(g0.d dVar, float f10, ti.c cVar) {
        super(3, cVar);
        this.f19108c = dVar;
        this.f19109d = f10;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        i0 i0Var = new i0(this.f19108c, this.f19109d, (ti.c) obj3);
        i0Var.f19107b = fFloatValue;
        return i0Var.invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int iG;
        int iG2;
        int iG3;
        g0.d dVar = this.f19108c;
        com.google.android.gms.common.api.internal.i0 i0Var = dVar.f6893d;
        float f10 = this.f19107b;
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f19106a;
        if (i10 == 0) {
            uk.c.R(obj);
            float fG = ((f1) i0Var.f3554d).g();
            float f11 = this.f19109d * f10;
            if (Math.abs(f11) > 500.0f) {
                if (f11 > 0.0f) {
                    iG3 = ((g1) i0Var.f3553c).g();
                    iG = iG3 + 1;
                } else {
                    iG2 = ((g1) i0Var.f3553c).g();
                    iG = iG2 - 1;
                }
            } else if (Math.abs(fG) <= 0.3f) {
                iG = ((g1) i0Var.f3553c).g();
            } else if (fG > 0.0f) {
                iG3 = ((g1) i0Var.f3553c).g();
                iG = iG3 + 1;
            } else {
                iG2 = ((g1) i0Var.f3553c).g();
                iG = iG2 - 1;
            }
            int iP = cg.b.p(iG, 0, dVar.l() - 1);
            this.f19107b = f10;
            this.f19106a = 1;
            if (g0.h0.g(dVar, iP, null, this, 6) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uk.c.R(obj);
        }
        return pi.o.f13011a;
    }
}
