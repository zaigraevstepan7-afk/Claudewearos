package fb;

import c2.e0;
import c2.f0;
import fj.l;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f6665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f6666c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.c f6667d;

    public /* synthetic */ d(t.c cVar, t.c cVar2, t.c cVar3, int i10) {
        this.f6664a = i10;
        this.f6665b = cVar;
        this.f6666c = cVar2;
        this.f6667d = cVar3;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        switch (this.f6664a) {
            case 0:
                l.f(f0Var, "$this$drawBackdrop");
                long j = ((b2.b) this.f6665b.e()).f1500a;
                float fFloatValue = ((Number) this.f6666c.e()).floatValue();
                float fFloatValue2 = ((Number) this.f6667d.e()).floatValue();
                f0Var.s(Float.intBitsToFloat((int) (j >> 32)));
                f0Var.h(Float.intBitsToFloat((int) (j & 4294967295L)));
                f0Var.p(fFloatValue);
                f0Var.j(fFloatValue);
                f0Var.g(fFloatValue2);
                break;
            default:
                l.f(f0Var, "$this$graphicsLayer");
                t.c cVar = this.f6665b;
                f0Var.p(((Number) cVar.e()).floatValue());
                f0Var.j(((Number) cVar.e()).floatValue());
                f0Var.s(((Number) this.f6666c.e()).floatValue());
                f0Var.h(((Number) this.f6667d.e()).floatValue());
                f0Var.J0(e0.h(0.5f, 0.0f));
                break;
        }
        return o.f13011a;
    }
}
