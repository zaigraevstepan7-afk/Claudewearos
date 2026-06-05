package hb;

import pi.o;
import qj.z;
import t.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7779a;

    /* renamed from: b, reason: collision with root package name */
    public int f7780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f7781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(h hVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f7779a = i10;
        this.f7781c = hVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f7779a) {
            case 0:
                return new b(this.f7781c, cVar, 0);
            case 1:
                return new b(this.f7781c, cVar, 1);
            case 2:
                return new b(this.f7781c, cVar, 2);
            case 3:
                return new b(this.f7781c, cVar, 3);
            case 4:
                return new b(this.f7781c, cVar, 4);
            case 5:
                return new b(this.f7781c, cVar, 5);
            default:
                return new b(this.f7781c, cVar, 6);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f7779a) {
        }
        return ((b) create(zVar, cVar)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7779a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f7780b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    h hVar = this.f7781c;
                    t.c cVar = hVar.f7808m;
                    Float f10 = new Float(0.0f);
                    u0 u0Var = hVar.f7804h;
                    this.f7780b = 1;
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
                int i11 = this.f7780b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    h hVar2 = this.f7781c;
                    t.c cVar2 = hVar2.f7809n;
                    Float f11 = new Float(1.0f);
                    u0 u0Var2 = hVar2.f7805i;
                    this.f7780b = 1;
                    if (t.c.d(cVar2, f11, u0Var2, null, null, this, 12) == aVar2) {
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
                int i12 = this.f7780b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    h hVar3 = this.f7781c;
                    t.c cVar3 = hVar3.f7810o;
                    Float f12 = new Float(hVar3.f7799c);
                    u0 u0Var3 = hVar3.j;
                    this.f7780b = 1;
                    if (t.c.d(cVar3, f12, u0Var3, null, null, this, 12) == aVar3) {
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
                int i13 = this.f7780b;
                if (i13 == 0) {
                    uk.c.R(obj);
                    h hVar4 = this.f7781c;
                    t.c cVar4 = hVar4.f7811p;
                    Float f13 = new Float(hVar4.f7799c);
                    u0 u0Var4 = hVar4.f7806k;
                    this.f7780b = 1;
                    if (t.c.d(cVar4, f13, u0Var4, null, null, this, 12) == aVar4) {
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
                int i14 = this.f7780b;
                if (i14 == 0) {
                    uk.c.R(obj);
                    h hVar5 = this.f7781c;
                    t.c cVar5 = hVar5.f7809n;
                    Float f14 = new Float(0.0f);
                    u0 u0Var5 = hVar5.f7805i;
                    this.f7780b = 1;
                    if (t.c.d(cVar5, f14, u0Var5, null, null, this, 12) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            case 5:
                ui.a aVar6 = ui.a.f17085a;
                int i15 = this.f7780b;
                if (i15 == 0) {
                    uk.c.R(obj);
                    h hVar6 = this.f7781c;
                    t.c cVar6 = hVar6.f7810o;
                    Float f15 = new Float(1.0f);
                    u0 u0Var6 = hVar6.j;
                    this.f7780b = 1;
                    if (t.c.d(cVar6, f15, u0Var6, null, null, this, 12) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            default:
                ui.a aVar7 = ui.a.f17085a;
                int i16 = this.f7780b;
                if (i16 == 0) {
                    uk.c.R(obj);
                    h hVar7 = this.f7781c;
                    t.c cVar7 = hVar7.f7811p;
                    Float f16 = new Float(1.0f);
                    u0 u0Var7 = hVar7.f7806k;
                    this.f7780b = 1;
                    if (t.c.d(cVar7, f16, u0Var7, null, null, this, 12) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
        }
    }
}
