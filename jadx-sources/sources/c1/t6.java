package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t6 extends vi.i implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ long f2718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x6 f2719b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(x6 x6Var, ti.c cVar) {
        super(3, cVar);
        this.f2719b = x6Var;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j = ((b2.b) obj2).f1500a;
        t6 t6Var = new t6(this.f2719b, (ti.c) obj3);
        t6Var.f2718a = j;
        pi.o oVar = pi.o.f13011a;
        t6Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        long j = this.f2718a;
        x6 x6Var = this.f2719b;
        x6Var.f2883o.h((x6Var.f2879k == x.o1.f19664a ? Float.intBitsToFloat((int) (j & 4294967295L)) : x6Var.f2877h ? x6Var.f2875f.g() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32))) - x6Var.f2882n.g());
        return pi.o.f13011a;
    }
}
