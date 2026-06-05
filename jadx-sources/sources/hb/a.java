package hb;

import pi.o;
import qj.z;
import t.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7775a;

    /* renamed from: b, reason: collision with root package name */
    public int f7776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f7777c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f7778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(h hVar, float f10, ti.c cVar, int i10) {
        super(2, cVar);
        this.f7775a = i10;
        this.f7777c = hVar;
        this.f7778d = f10;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f7775a) {
            case 0:
                return new a(this.f7777c, this.f7778d, cVar, 0);
            case 1:
                return new a(this.f7777c, this.f7778d, cVar, 1);
            default:
                return new a(this.f7777c, this.f7778d, cVar, 2);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f7775a) {
        }
        return ((a) create(zVar, cVar)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7775a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f7776b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    h hVar = this.f7777c;
                    t.c cVar = hVar.f7807l;
                    Float f10 = new Float(this.f7778d);
                    u0 u0Var = hVar.f7803g;
                    this.f7776b = 1;
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
                int i11 = this.f7776b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    h hVar2 = this.f7777c;
                    t.c cVar2 = hVar2.f7807l;
                    Float f11 = new Float(this.f7778d);
                    u0 u0Var2 = hVar2.f7803g;
                    gb.h hVar3 = new gb.h(hVar2, 6);
                    this.f7776b = 1;
                    if (t.c.d(cVar2, f11, u0Var2, null, hVar3, this, 4) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            default:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f7776b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    h hVar4 = this.f7777c;
                    t.c cVar3 = hVar4.f7808m;
                    Float f12 = new Float(this.f7778d);
                    u0 u0Var3 = hVar4.f7804h;
                    this.f7776b = 1;
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
        }
    }
}
