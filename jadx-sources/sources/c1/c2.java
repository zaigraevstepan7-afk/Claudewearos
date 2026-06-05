package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c2 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1959a;

    /* renamed from: b, reason: collision with root package name */
    public int f1960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d2 f1961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(d2 d2Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f1959a = i10;
        this.f1961c = d2Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f1959a) {
            case 0:
                return new c2(this.f1961c, cVar, 0);
            case 1:
                return new c2(this.f1961c, cVar, 1);
            case 2:
                return new c2(this.f1961c, cVar, 2);
            default:
                return new c2(this.f1961c, cVar, 3);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f1959a) {
        }
        return ((c2) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.f1959a;
        d2 d2Var = this.f1961c;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i11 = this.f1960b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    t.c cVar = d2Var.Q;
                    if (cVar == null) {
                        return oVar;
                    }
                    g7 g7VarD = d2Var.P;
                    if (g7VarD == null) {
                        k7 k7Var = k7.f2344a;
                        g7VarD = k7.d((w0) v2.n.h(d2Var, x0.f2845a), (v0.a1) v2.n.h(d2Var, v0.b1.f17363a));
                    }
                    c2.w wVar = new c2.w(g7VarD.c(d2Var.J, false, d2Var.N));
                    t.j jVarK = d2Var.J ? z4.k((b4) v2.n.h(d2Var, u2.f2738a), e1.u.f5672d) : t.d.r();
                    this.f1960b = 1;
                    obj = t.c.d(cVar, wVar, jVarK, null, null, this, 12);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return oVar;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i12 = this.f1960b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                t.c cVar2 = d2Var.S;
                s3.f fVar = new s3.f((d2Var.N && d2Var.J) ? d2Var.L : d2Var.M);
                t.j jVarK2 = d2Var.J ? z4.k((b4) v2.n.h(d2Var, u2.f2738a), e1.u.f5670b) : t.d.r();
                this.f1960b = 1;
                return t.c.d(cVar2, fVar, jVarK2, null, null, this, 12) == aVar2 ? aVar2 : oVar;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                int i13 = this.f1960b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                this.f1960b = 1;
                d2.t1(d2Var, this);
                return aVar3;
            default:
                ui.a aVar4 = ui.a.f17085a;
                int i14 = this.f1960b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                this.f1960b = 1;
                d2.t1(d2Var, this);
                return aVar4;
        }
    }
}
