package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 extends vi.i implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19663a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i10, ti.c cVar, int i11) {
        super(i10, cVar);
        this.f19663a = i11;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f19663a) {
            case 0:
                long j = ((b2.b) obj2).f1500a;
                o0 o0Var = new o0(3, (ti.c) obj3, 0);
                pi.o oVar = pi.o.f13011a;
                o0Var.invokeSuspend(oVar);
                return oVar;
            case 1:
                ((Number) obj2).floatValue();
                o0 o0Var2 = new o0(3, (ti.c) obj3, 1);
                pi.o oVar2 = pi.o.f13011a;
                o0Var2.invokeSuspend(oVar2);
                return oVar2;
            default:
                long j4 = ((b2.b) obj2).f1500a;
                o0 o0Var3 = new o0(3, (ti.c) obj3, 2);
                pi.o oVar3 = pi.o.f13011a;
                o0Var3.invokeSuspend(oVar3);
                return oVar3;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f19663a;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                break;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                break;
            default:
                ui.a aVar3 = ui.a.f17085a;
                uk.c.R(obj);
                break;
        }
        return oVar;
    }
}
