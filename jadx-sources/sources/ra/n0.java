package ra;

import java.time.LocalDateTime;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f14094b;

    /* renamed from: c, reason: collision with root package name */
    public int f14095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(r0 r0Var, int i10, ti.c cVar, int i11) {
        super(2, cVar);
        this.f14093a = i11;
        this.f14094b = r0Var;
        this.f14095c = i10;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f14093a) {
            case 0:
                return new n0(this.f14094b, this.f14095c, cVar, 0);
            case 1:
                return new n0(this.f14094b, this.f14095c, cVar, 1);
            case 2:
                return new n0(this.f14094b, cVar, 2);
            case 3:
                return new n0(this.f14094b, cVar, 3);
            case 4:
                return new n0(this.f14094b, cVar, 4);
            default:
                return new n0(this.f14094b, cVar, 5);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f14093a) {
            case 0:
                n0 n0Var = (n0) create(zVar, cVar);
                pi.o oVar = pi.o.f13011a;
                n0Var.invokeSuspend(oVar);
                break;
            case 1:
                n0 n0Var2 = (n0) create(zVar, cVar);
                pi.o oVar2 = pi.o.f13011a;
                n0Var2.invokeSuspend(oVar2);
                break;
        }
        return ((n0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i10 = this.f14093a;
        ti.c cVar = null;
        int i11 = 1;
        r0 r0Var = this.f14094b;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                r0.e(r0Var, ib.h.f8432a);
                r0Var.n(new d0.r(this.f14095c));
                return oVar;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                r0.e(r0Var, new ib.i(this.f14095c));
                return oVar;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f14095c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                qa.c cVar2 = r0Var.f14150g;
                f6.a aVarH = androidx.lifecycle.r0.h(r0Var);
                cVar2.getClass();
                cVar2.a(aVarH);
                tj.e eVarH = tj.i0.h(new tj.c0(cVar2.f13327d));
                q0 q0Var = new q0(r0Var, cVar, 0);
                this.f14095c = 1;
                return tj.i0.g(eVarH, q0Var, this) == aVar3 ? aVar3 : oVar;
            case 3:
                ui.a aVar4 = ui.a.f17085a;
                int i13 = this.f14095c;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                qa.c cVar3 = r0Var.f14150g;
                f6.a aVarH2 = androidx.lifecycle.r0.h(r0Var);
                cVar3.getClass();
                cVar3.a(aVarH2);
                tj.e eVarH2 = tj.i0.h(new tj.c0(cVar3.f13326c));
                q0 q0Var2 = new q0(r0Var, cVar, i11);
                this.f14095c = 1;
                return tj.i0.g(eVarH2, q0Var2, this) == aVar4 ? aVar4 : oVar;
            case 4:
                ui.a aVar5 = ui.a.f17085a;
                int i14 = this.f14095c;
                if (i14 == 0) {
                    uk.c.R(obj);
                    this.f14095c = 1;
                    if (qj.b0.i(600L, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                tj.r0 r0Var2 = r0Var.f14145b;
                do {
                    value = r0Var2.getValue();
                } while (!r0Var2.i(value, ib.v0.a((ib.v0) value, null, null, null, 0, null, null, null, null, null, null, 0.0f, null, 0, null, null, null, null, false, null, false, false, false, 7340031)));
                return oVar;
            default:
                ui.a aVar6 = ui.a.f17085a;
                int i15 = this.f14095c;
                if (i15 != 0 && i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uk.c.R(obj);
                while (qj.b0.s(androidx.lifecycle.r0.h(r0Var))) {
                    r0Var.f14161s.j(LocalDateTime.now());
                    oj.f fVar = oj.a.f12531b;
                    long jJ0 = yd.f.j0(1, oj.c.f12539e);
                    this.f14095c = 1;
                    Object objI = qj.b0.i(qj.b0.D(jJ0), this);
                    if (objI != ui.a.f17085a) {
                        objI = oVar;
                    }
                    if (objI == aVar6) {
                        return aVar6;
                    }
                }
                return oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(r0 r0Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f14093a = i10;
        this.f14094b = r0Var;
    }
}
