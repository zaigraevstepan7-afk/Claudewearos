package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i8 extends vi.i implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2250a;

    /* renamed from: b, reason: collision with root package name */
    public int f2251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8(Object obj, ti.c cVar, int i10) {
        super(1, cVar);
        this.f2250a = i10;
        this.f2252c = obj;
    }

    @Override // vi.a
    public final ti.c create(ti.c cVar) {
        switch (this.f2250a) {
            case 0:
                return new i8((j8) this.f2252c, cVar, 0);
            case 1:
                return new i8((m5.w) this.f2252c, cVar, 1);
            default:
                return new i8((v0.u0) this.f2252c, cVar, 2);
        }
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        ti.c cVar = (ti.c) obj;
        switch (this.f2250a) {
        }
        return ((i8) create(cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2250a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f2251b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    j8 j8Var = (j8) this.f2252c;
                    this.f2251b = 1;
                    qj.l lVar = new qj.l(1, u3.a.g(this));
                    lVar.p();
                    j8Var.f2301b.f15226c.setValue(Boolean.TRUE);
                    j8Var.f2302c = lVar;
                    if (lVar.o() == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f2251b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return obj;
                }
                uk.c.R(obj);
                m5.w wVar = (m5.w) this.f2252c;
                this.f2251b = 1;
                Object objInvoke = wVar.invoke(this);
                return objInvoke == aVar2 ? aVar2 : objInvoke;
            default:
                v0.u0 u0Var = (v0.u0) this.f2252c;
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f2251b;
                pi.o oVar = pi.o.f13011a;
                if (i12 == 0) {
                    uk.c.R(obj);
                    this.f2251b = 1;
                    if (u0Var.s(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uk.c.R(obj);
                        u0Var.A = true;
                        return oVar;
                    }
                    uk.c.R(obj);
                }
                pi.h hVarA = v0.u0.a(u0Var);
                if (hVarA != null) {
                    String str = (String) hVarA.f13000a;
                    long j = ((g3.m0) hVarA.f13001b).f7145a;
                    v0.p pVar = u0Var.f17494i;
                    if (pVar != null) {
                        this.f2251b = 2;
                        Object objG = (str.length() == 0 || g3.m0.c(j)) ? oVar : qj.b0.G(pVar.f17450a, new ab.q(pVar, new k0.j1(j, str, null, pVar), (ti.c) null), this);
                        if (objG != aVar3) {
                            objG = oVar;
                        }
                        if (objG == aVar3) {
                            return aVar3;
                        }
                    }
                }
                u0Var.A = true;
                return oVar;
        }
    }
}
