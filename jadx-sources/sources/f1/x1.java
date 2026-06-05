package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x1 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6485a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(int i10, ti.c cVar, int i11) {
        super(i10, cVar);
        this.f6485a = i11;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f6485a) {
            case 0:
                x1 x1Var = new x1(2, cVar, 0);
                x1Var.f6486b = obj;
                return x1Var;
            case 1:
                x1 x1Var2 = new x1(2, cVar, 1);
                x1Var2.f6486b = obj;
                return x1Var2;
            default:
                x1 x1Var3 = new x1(2, cVar, 2);
                x1Var3.f6486b = obj;
                return x1Var3;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6485a) {
            case 0:
                return ((x1) create((w1) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 1:
                return ((x1) create((m5.p0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                return ((x1) create((tj.k0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6485a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                return Boolean.valueOf(((w1) this.f6486b) == w1.f6471a);
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                return Boolean.valueOf(!(((m5.p0) this.f6486b) instanceof m5.j0));
            default:
                ui.a aVar3 = ui.a.f17085a;
                uk.c.R(obj);
                return Boolean.valueOf(((tj.k0) this.f6486b) != tj.k0.f16393a);
        }
    }
}
