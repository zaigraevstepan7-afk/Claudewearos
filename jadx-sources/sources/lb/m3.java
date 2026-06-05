package lb;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m3 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10480a;

    /* renamed from: b, reason: collision with root package name */
    public f1.p1 f10481b;

    /* renamed from: c, reason: collision with root package name */
    public int f10482c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f10484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(Context context, ti.c cVar, int i10) {
        super(2, cVar);
        this.f10480a = i10;
        this.f10484e = context;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f10480a) {
            case 0:
                m3 m3Var = new m3(this.f10484e, cVar, 0);
                m3Var.f10483d = obj;
                return m3Var;
            default:
                m3 m3Var2 = new m3(this.f10484e, cVar, 1);
                m3Var2.f10483d = obj;
                return m3Var2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.p1 p1Var = (f1.p1) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f10480a) {
        }
        return ((m3) create(p1Var, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.f10480a;
        pi.o oVar = pi.o.f13011a;
        Context context = this.f10484e;
        ti.c cVar = null;
        int i11 = 1;
        switch (i10) {
            case 0:
                f1.p1 p1Var = (f1.p1) this.f10483d;
                ui.a aVar = ui.a.f17085a;
                int i12 = this.f10482c;
                if (i12 == 0) {
                    uk.c.R(obj);
                    xj.e eVar = qj.m0.f13601a;
                    xj.d dVar = xj.d.f20094c;
                    d1.t tVar = new d1.t(context, cVar, i11);
                    this.f10483d = null;
                    this.f10481b = p1Var;
                    this.f10482c = 1;
                    obj = qj.b0.G(dVar, tVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p1Var = this.f10481b;
                    uk.c.R(obj);
                }
                p1Var.setValue(obj);
                return oVar;
            default:
                f1.p1 p1Var2 = (f1.p1) this.f10483d;
                ui.a aVar2 = ui.a.f17085a;
                int i13 = this.f10482c;
                if (i13 == 0) {
                    uk.c.R(obj);
                    xj.e eVar2 = qj.m0.f13601a;
                    xj.d dVar2 = xj.d.f20094c;
                    ab.r rVar = new ab.r(context, cVar, 11);
                    this.f10483d = null;
                    this.f10481b = p1Var2;
                    this.f10482c = 1;
                    obj = qj.b0.G(dVar2, rVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p1Var2 = this.f10481b;
                    uk.c.R(obj);
                }
                p1Var2.setValue(obj);
                return oVar;
        }
    }
}
