package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f17448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(u0 u0Var, boolean z2, ti.c cVar) {
        super(2, cVar);
        this.f17448b = u0Var;
        this.f17449c = z2;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new o0(this.f17448b, this.f17449c, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        g3.f fVarT;
        w2.w0 w0Var;
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f17447a;
        pi.o oVar = pi.o.f13011a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uk.c.R(obj);
            return oVar;
        }
        uk.c.R(obj);
        u0 u0Var = this.f17448b;
        if (g3.m0.c(u0Var.n().f9938b)) {
            fVarT = null;
        } else {
            fVarT = mk.b.t(u0Var.n());
            if (this.f17449c) {
                int iE = g3.m0.e(u0Var.n().f9938b);
                u0Var.f17488c.invoke(u0.e(u0Var.n().f9937a, g3.e0.b(iE, iE)));
                u0Var.q(k0.k0.f9150a);
            }
        }
        if (fVarT != null && (w0Var = u0Var.f17492g) != null) {
            w2.v0 v0VarA = a0.c.a(fVarT);
            this.f17447a = 1;
            ((w2.h) w0Var).a(v0VarA);
            if (oVar == aVar) {
                return aVar;
            }
        }
        return oVar;
    }
}
