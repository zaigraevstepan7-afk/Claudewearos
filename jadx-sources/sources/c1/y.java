package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2890a;

    /* renamed from: b, reason: collision with root package name */
    public int f2891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z.k f2892c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1.q f2893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z.k kVar, t1.q qVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f2890a = i10;
        this.f2892c = kVar;
        this.f2893d = qVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f2890a) {
            case 0:
                return new y(this.f2892c, this.f2893d, cVar, 0);
            case 1:
                return new y(this.f2892c, this.f2893d, cVar, 1);
            default:
                return new y(this.f2892c, this.f2893d, cVar, 2);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f2890a) {
        }
        return ((y) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f2890a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f2891b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return pi.o.f13011a;
                }
                uk.c.R(obj);
                tj.h0 h0Var = this.f2892c.f20346a;
                x xVar = new x(this.f2893d, 0);
                this.f2891b = 1;
                h0Var.getClass();
                tj.h0.k(h0Var, xVar, this);
                return aVar;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f2891b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return pi.o.f13011a;
                }
                uk.c.R(obj);
                tj.h0 h0Var2 = this.f2892c.f20346a;
                x xVar2 = new x(this.f2893d, 1);
                this.f2891b = 1;
                h0Var2.getClass();
                tj.h0.k(h0Var2, xVar2, this);
                return aVar2;
            default:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f2891b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return pi.o.f13011a;
                }
                uk.c.R(obj);
                tj.h0 h0Var3 = this.f2892c.f20346a;
                x xVar3 = new x(this.f2893d, 2);
                this.f2891b = 1;
                h0Var3.getClass();
                tj.h0.k(h0Var3, xVar3, this);
                return aVar3;
        }
    }
}
