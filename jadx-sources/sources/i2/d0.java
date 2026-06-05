package i2;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f8206b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i10) {
        super(1);
        this.f8205a = i10;
        this.f8206b = e0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [ej.a, fj.m] */
    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f8205a) {
            case 0:
                e0 e0Var = this.f8206b;
                e0Var.f8219d = true;
                e0Var.f8221f.a();
                return pi.o.f13011a;
            default:
                e2.d dVar = (e2.d) obj;
                e0 e0Var2 = this.f8206b;
                c cVar = e0Var2.f8217b;
                float f10 = e0Var2.f8225k;
                float f11 = e0Var2.f8226l;
                ac.d dVarC0 = dVar.C0();
                long jY = dVarC0.y();
                dVarC0.h().f();
                try {
                    ((ld.i) dVarC0.f373b).S(f10, f11, 0L);
                    cVar.a(dVar);
                    m1.r(dVarC0, jY);
                    return pi.o.f13011a;
                } catch (Throwable th2) {
                    m1.r(dVarC0, jY);
                    throw th2;
                }
        }
    }
}
