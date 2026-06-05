package v;

import w2.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17154a;

    /* renamed from: b, reason: collision with root package name */
    public int f17155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f17156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f17154a = i10;
        this.f17156c = d0Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17154a) {
            case 0:
                return new c0(this.f17156c, cVar, 0);
            case 1:
                return new c0(this.f17156c, cVar, 1);
            default:
                return new c0(this.f17156c, cVar, 2);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f17154a) {
        }
        return ((c0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17154a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f17155b;
                d0 d0Var = this.f17156c;
                if (i10 == 0) {
                    uk.c.R(obj);
                    long jB = ((h2) v2.n.h(d0Var, w2.f1.f18273t)).b();
                    this.f17155b = 1;
                    if (qj.b0.i(jB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                ej.a aVar2 = d0Var.f17164f0;
                if (aVar2 != null) {
                    aVar2.a();
                }
                if (d0Var.f17165g0) {
                    ((k2.c) ((k2.a) v2.n.h(d0Var, w2.f1.f18265l))).a(0);
                }
                d0Var.f17172n0 = true;
                qj.s1 s1Var = d0Var.f17170l0;
                if (s1Var != null) {
                    s1Var.e(null);
                }
                d0Var.f17170l0 = null;
                d0Var.f17169k0 = null;
                return pi.o.f13011a;
            case 1:
                ui.a aVar3 = ui.a.f17085a;
                int i11 = this.f17155b;
                d0 d0Var2 = this.f17156c;
                if (i11 == 0) {
                    uk.c.R(obj);
                    long jB2 = ((h2) v2.n.h(d0Var2, w2.f1.f18273t)).b();
                    this.f17155b = 1;
                    if (qj.b0.i(jB2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                ej.a aVar4 = d0Var2.f17164f0;
                if (aVar4 != null) {
                    aVar4.a();
                }
                if (d0Var2.f17165g0) {
                    ((k2.c) ((k2.a) v2.n.h(d0Var2, w2.f1.f18265l))).a(0);
                }
                d0Var2.f17179u0 = true;
                qj.s1 s1Var2 = d0Var2.f17177s0;
                if (s1Var2 != null) {
                    s1Var2.e(null);
                }
                d0Var2.f17177s0 = null;
                d0Var2.f17176r0 = null;
                return pi.o.f13011a;
            default:
                ui.a aVar5 = ui.a.f17085a;
                int i12 = this.f17155b;
                d0 d0Var3 = this.f17156c;
                if (i12 == 0) {
                    uk.c.R(obj);
                    long jB3 = ((h2) v2.n.h(d0Var3, w2.f1.f18273t)).b();
                    this.f17155b = 1;
                    if (qj.b0.i(jB3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                ej.a aVar6 = d0Var3.f17164f0;
                if (aVar6 != null) {
                    aVar6.a();
                }
                return pi.o.f13011a;
        }
    }
}
