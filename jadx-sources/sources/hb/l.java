package hb;

import pi.o;
import qj.z;
import t.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7823a;

    /* renamed from: b, reason: collision with root package name */
    public int f7824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f7825c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f7823a = i10;
        this.f7825c = nVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f7823a) {
            case 0:
                return new l(this.f7825c, cVar, 0);
            case 1:
                return new l(this.f7825c, cVar, 1);
            case 2:
                return new l(this.f7825c, cVar, 2);
            case 3:
                return new l(this.f7825c, cVar, 3);
            case 4:
                return new l(this.f7825c, cVar, 4);
            default:
                return new l(this.f7825c, cVar, 5);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f7823a) {
        }
        return ((l) create(zVar, cVar)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7823a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f7824b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    n nVar = this.f7825c;
                    t.c cVar = nVar.f7833e;
                    Float f10 = new Float(1.0f);
                    u0 u0Var = nVar.f7831c;
                    this.f7824b = 1;
                    if (t.c.d(cVar, f10, u0Var, null, null, this, 12) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f7824b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    n nVar2 = this.f7825c;
                    t.c cVar2 = nVar2.f7834f;
                    b2.b bVar = new b2.b(nVar2.f7835g);
                    this.f7824b = 1;
                    if (cVar2.f(bVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f7824b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    n nVar3 = this.f7825c;
                    t.c cVar3 = nVar3.f7833e;
                    Float f11 = new Float(0.0f);
                    u0 u0Var2 = nVar3.f7831c;
                    this.f7824b = 1;
                    if (t.c.d(cVar3, f11, u0Var2, null, null, this, 12) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            case 3:
                ui.a aVar4 = ui.a.f17085a;
                int i13 = this.f7824b;
                if (i13 == 0) {
                    uk.c.R(obj);
                    n nVar4 = this.f7825c;
                    t.c cVar4 = nVar4.f7834f;
                    b2.b bVar2 = new b2.b(nVar4.f7835g);
                    u0 u0Var3 = nVar4.f7832d;
                    this.f7824b = 1;
                    if (t.c.d(cVar4, bVar2, u0Var3, null, null, this, 12) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            case 4:
                ui.a aVar5 = ui.a.f17085a;
                int i14 = this.f7824b;
                if (i14 == 0) {
                    uk.c.R(obj);
                    n nVar5 = this.f7825c;
                    t.c cVar5 = nVar5.f7833e;
                    Float f12 = new Float(0.0f);
                    u0 u0Var4 = nVar5.f7831c;
                    this.f7824b = 1;
                    if (t.c.d(cVar5, f12, u0Var4, null, null, this, 12) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            default:
                ui.a aVar6 = ui.a.f17085a;
                int i15 = this.f7824b;
                if (i15 == 0) {
                    uk.c.R(obj);
                    n nVar6 = this.f7825c;
                    t.c cVar6 = nVar6.f7834f;
                    b2.b bVar3 = new b2.b(nVar6.f7835g);
                    u0 u0Var5 = nVar6.f7832d;
                    this.f7824b = 1;
                    if (t.c.d(cVar6, bVar3, u0Var5, null, null, this, 12) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
        }
    }
}
