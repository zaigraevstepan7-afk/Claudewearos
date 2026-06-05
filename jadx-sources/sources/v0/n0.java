package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 extends vi.i implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f17439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(u0 u0Var, ti.c cVar, int i10) {
        super(1, cVar);
        this.f17438a = i10;
        this.f17439b = u0Var;
    }

    @Override // vi.a
    public final ti.c create(ti.c cVar) {
        switch (this.f17438a) {
            case 0:
                return new n0(this.f17439b, cVar, 0);
            case 1:
                return new n0(this.f17439b, cVar, 1);
            case 2:
                return new n0(this.f17439b, cVar, 2);
            default:
                return new n0(this.f17439b, cVar, 3);
        }
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        ti.c cVar = (ti.c) obj;
        switch (this.f17438a) {
            case 0:
                n0 n0Var = (n0) create(cVar);
                pi.o oVar = pi.o.f13011a;
                n0Var.invokeSuspend(oVar);
                return oVar;
            case 1:
                n0 n0Var2 = (n0) create(cVar);
                pi.o oVar2 = pi.o.f13011a;
                n0Var2.invokeSuspend(oVar2);
                return oVar2;
            case 2:
                n0 n0Var3 = (n0) create(cVar);
                pi.o oVar3 = pi.o.f13011a;
                n0Var3.invokeSuspend(oVar3);
                return oVar3;
            default:
                n0 n0Var4 = (n0) create(cVar);
                pi.o oVar4 = pi.o.f13011a;
                n0Var4.invokeSuspend(oVar4);
                return oVar4;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f17438a;
        pi.o oVar = pi.o.f13011a;
        u0 u0Var = this.f17439b;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                u0Var.A = false;
                break;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                u0Var.f();
                break;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                uk.c.R(obj);
                u0Var.d(u0Var.A);
                break;
            default:
                ui.a aVar4 = ui.a.f17085a;
                uk.c.R(obj);
                u0Var.p();
                break;
        }
        return oVar;
    }
}
