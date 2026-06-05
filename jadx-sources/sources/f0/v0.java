package f0;

import t.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6197a;

    /* renamed from: b, reason: collision with root package name */
    public int f6198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6199c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(int i10, f1.a1 a1Var, ti.c cVar) {
        super(2, cVar);
        this.f6197a = 2;
        this.f6199c = i10;
        this.f6200d = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f6197a) {
            case 0:
                return new v0((w0) this.f6200d, this.f6199c, cVar, 0);
            case 1:
                return new v0((g0.h0) this.f6200d, this.f6199c, cVar, 1);
            case 2:
                return new v0(this.f6199c, (f1.a1) this.f6200d, cVar);
            case 3:
                return new v0((t.c) this.f6200d, this.f6199c, cVar, 3);
            default:
                return new v0((g0.d) this.f6200d, this.f6199c, cVar, 4);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6197a) {
        }
        return ((v0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f6197a;
        pi.o oVar = pi.o.f13011a;
        int i11 = this.f6199c;
        Object obj2 = this.f6200d;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i12 = this.f6198b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                r0 r0Var = ((w0) obj2).I;
                this.f6198b = 1;
                return r0Var.f(i11, this) == aVar ? aVar : oVar;
            case 1:
                g0.h0 h0Var = (g0.h0) obj2;
                ui.a aVar2 = ui.a.f17085a;
                int i13 = this.f6198b;
                if (i13 == 0) {
                    uk.c.R(obj);
                    this.f6198b = 1;
                    if (h0Var.i(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                double d10 = 0.0f;
                if (-0.5d > d10 || d10 > 0.5d) {
                    a0.a.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
                }
                h0Var.s(h0Var.j(i11), 0.0f, true);
                return oVar;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                int i14 = this.f6198b;
                if (i14 == 0) {
                    uk.c.R(obj);
                    this.f6198b = 1;
                    if (qj.b0.i(i11 * 30, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                o1 o1Var = va.m.f17955a;
                ((f1.a1) obj2).setValue(Boolean.TRUE);
                return oVar;
            case 3:
                ui.a aVar4 = ui.a.f17085a;
                int i15 = this.f6198b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                Float f10 = new Float(1.0f);
                o1 o1VarT = t.d.t(i11, 0, t.y.f15327b, 2);
                this.f6198b = 1;
                return t.c.d((t.c) obj2, f10, o1VarT, null, null, this, 12) == aVar4 ? aVar4 : oVar;
            default:
                ui.a aVar5 = ui.a.f17085a;
                int i16 = this.f6198b;
                if (i16 == 0) {
                    uk.c.R(obj);
                    this.f6198b = 1;
                    return g0.h0.g((g0.d) obj2, i11, null, this, 6) == aVar5 ? aVar5 : oVar;
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uk.c.R(obj);
                return oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(Object obj, int i10, ti.c cVar, int i11) {
        super(2, cVar);
        this.f6197a = i11;
        this.f6200d = obj;
        this.f6199c = i10;
    }
}
