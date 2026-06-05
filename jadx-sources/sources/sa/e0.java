package sa;

import f1.a1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f14840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f14841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qj.z f14842e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(boolean z2, float f10, t.c cVar, a1 a1Var, qj.z zVar, ti.c cVar2) {
        super(2, cVar2);
        this.f14838a = z2;
        this.f14839b = f10;
        this.f14840c = cVar;
        this.f14841d = a1Var;
        this.f14842e = zVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new e0(this.f14838a, this.f14839b, this.f14840c, this.f14841d, this.f14842e, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        e0 e0Var = (e0) create((qj.z) obj, (ti.c) obj2);
        pi.o oVar = pi.o.f13011a;
        e0Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        float f10 = this.f14838a ? this.f14839b : 0.0f;
        t.c cVar = this.f14840c;
        if (((Number) cVar.e()).floatValue() != f10 && !((Boolean) this.f14841d.getValue()).booleanValue()) {
            qj.b0.w(this.f14842e, null, new i0(cVar, f10, new b6.j(19), this.f14841d, null), 3);
        }
        return pi.o.f13011a;
    }
}
