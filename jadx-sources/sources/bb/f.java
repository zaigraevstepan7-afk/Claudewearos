package bb;

import f1.f1;
import qj.z;
import t.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1669a;

    /* renamed from: b, reason: collision with root package name */
    public int f1670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f1671c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f1672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1 f1673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1 f1674f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(t.c cVar, s sVar, f1 f1Var, f1 f1Var2, ti.c cVar2, int i10) {
        super(2, cVar2);
        this.f1669a = i10;
        this.f1671c = cVar;
        this.f1672d = sVar;
        this.f1673e = f1Var;
        this.f1674f = f1Var2;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f1669a) {
            case 0:
                return new f(this.f1671c, this.f1672d, this.f1673e, this.f1674f, cVar, 0);
            default:
                return new f(this.f1671c, this.f1672d, this.f1673e, this.f1674f, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f1669a) {
        }
        return ((f) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1669a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f1670b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    m5.n nVarN = f1.s.N(new d(this.f1671c, 0));
                    e eVar = new e(this.f1672d, this.f1673e, this.f1674f, 0);
                    this.f1670b = 1;
                    if (nVarN.c(eVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            default:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f1670b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    m5.n nVarN2 = f1.s.N(new d(this.f1671c, 2));
                    e eVar2 = new e(this.f1672d, this.f1673e, this.f1674f, 1);
                    this.f1670b = 1;
                    if (nVarN2.c(eVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
        }
    }
}
