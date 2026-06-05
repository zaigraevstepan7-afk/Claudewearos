package bb;

import qj.z;
import t.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1684a;

    /* renamed from: b, reason: collision with root package name */
    public int f1685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f1686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f1687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(t.c cVar, float f10, ti.c cVar2, int i10) {
        super(2, cVar2);
        this.f1684a = i10;
        this.f1686c = cVar;
        this.f1687d = f10;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f1684a) {
            case 0:
                return new i(this.f1686c, this.f1687d, cVar, 0);
            case 1:
                return new i(this.f1686c, this.f1687d, cVar, 1);
            case 2:
                return new i(this.f1686c, this.f1687d, cVar, 2);
            case 3:
                return new i(this.f1686c, this.f1687d, cVar, 3);
            default:
                return new i(this.f1686c, this.f1687d, cVar, 4);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f1684a) {
        }
        return ((i) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1684a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f1685b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    Float f10 = new Float(this.f1687d);
                    this.f1685b = 1;
                    if (this.f1686c.f(f10, this) == aVar) {
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
                int i11 = this.f1685b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    Float f11 = new Float(this.f1687d);
                    this.f1685b = 1;
                    if (this.f1686c.f(f11, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f1685b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    Float f12 = new Float(this.f1687d);
                    u0 u0Var = va.f.f17933b;
                    this.f1685b = 1;
                    if (t.c.d(this.f1686c, f12, u0Var, null, null, this, 12) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 3:
                ui.a aVar4 = ui.a.f17085a;
                int i13 = this.f1685b;
                if (i13 == 0) {
                    uk.c.R(obj);
                    Float f13 = new Float(this.f1687d);
                    u0 u0Var2 = va.f.f17933b;
                    this.f1685b = 1;
                    if (t.c.d(this.f1686c, f13, u0Var2, null, null, this, 12) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            default:
                ui.a aVar5 = ui.a.f17085a;
                int i14 = this.f1685b;
                if (i14 == 0) {
                    uk.c.R(obj);
                    Float f14 = new Float(this.f1687d);
                    u0 u0Var3 = va.f.f17933b;
                    this.f1685b = 1;
                    if (t.c.d(this.f1686c, f14, u0Var3, null, null, this, 12) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
        }
    }
}
