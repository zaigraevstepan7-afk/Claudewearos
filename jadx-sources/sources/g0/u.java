package g0;

import f1.g1;
import v.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6976a;

    /* renamed from: b, reason: collision with root package name */
    public int f6977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f6978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(h0 h0Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f6976a = i10;
        this.f6978c = h0Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f6976a) {
            case 0:
                return new u(this.f6978c, cVar, 0);
            case 1:
                return new u(this.f6978c, cVar, 1);
            default:
                return new u(this.f6978c, cVar, 2);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f6976a) {
        }
        return ((u) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object objG2;
        int i10 = this.f6976a;
        ti.c cVar = null;
        h0 h0Var = this.f6978c;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i11 = this.f6977b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                this.f6977b = 1;
                float f10 = l0.f6930a;
                if (((g1) h0Var.f6893d.f3553c).g() - 1 < 0 || (objG = h0.g(h0Var, ((g1) h0Var.f6893d.f3553c).g() - 1, null, this, 6)) != aVar) {
                    objG = oVar;
                }
                return objG == aVar ? aVar : oVar;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i12 = this.f6977b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                this.f6977b = 1;
                float f11 = l0.f6930a;
                if (((g1) h0Var.f6893d.f3553c).g() + 1 >= h0Var.l() || (objG2 = h0.g(h0Var, ((g1) h0Var.f6893d.f3553c).g() + 1, null, this, 6)) != aVar2) {
                    objG2 = oVar;
                }
                return objG2 == aVar2 ? aVar2 : oVar;
            default:
                ui.a aVar3 = ui.a.f17085a;
                int i13 = this.f6977b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                this.f6977b = 1;
                f1 f1Var = f1.f17189a;
                lb.k0 k0Var = new lb.k0(2, cVar, 3);
                h0Var.getClass();
                Object objR = h0.r(h0Var, f1Var, k0Var, this);
                if (objR != aVar3) {
                    objR = oVar;
                }
                return objR == aVar3 ? aVar3 : oVar;
        }
    }
}
