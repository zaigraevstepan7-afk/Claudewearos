package gb;

import f1.a1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ float f7345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hb.h f7346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f7347c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f7348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hb.h hVar, a1 a1Var, a1 a1Var2, ti.c cVar) {
        super(2, cVar);
        this.f7346b = hVar;
        this.f7347c = a1Var;
        this.f7348d = a1Var2;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        s sVar = new s(this.f7346b, this.f7347c, this.f7348d, cVar);
        sVar.f7345a = ((Number) obj).floatValue();
        return sVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        s sVar = (s) create(Float.valueOf(((Number) obj).floatValue()), (ti.c) obj2);
        pi.o oVar = pi.o.f13011a;
        sVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        float f10 = this.f7345a;
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        if (!((Boolean) this.f7347c.getValue()).booleanValue()) {
            this.f7348d.setValue(Float.valueOf(f10));
            this.f7346b.d(f10);
        }
        return pi.o.f13011a;
    }
}
