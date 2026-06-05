package k0;

import b0.g2;
import x.w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9078a;

    /* renamed from: b, reason: collision with root package name */
    public int f9079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2.a0 f9080c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f9081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(p2.a0 a0Var, b1 b1Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f9078a = i10;
        this.f9080c = a0Var;
        this.f9081d = b1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f9078a) {
            case 0:
                return new f0(this.f9080c, this.f9081d, cVar, 0);
            case 1:
                return new f0(this.f9080c, this.f9081d, cVar, 1);
            default:
                return new f0(this.f9080c, this.f9081d, cVar, 2);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f9078a) {
        }
        return ((f0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9078a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f9079b;
                pi.o oVar = pi.o.f13011a;
                if (i10 == 0) {
                    uk.c.R(obj);
                    this.f9079b = 1;
                    Object objH = qj.b0.h(new ab.p(this.f9080c, this.f9081d, null, 2), this);
                    if (objH != aVar) {
                        objH = oVar;
                    }
                    if (objH == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return oVar;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f9079b;
                pi.o oVar2 = pi.o.f13011a;
                if (i11 == 0) {
                    uk.c.R(obj);
                    this.f9079b = 1;
                    Object objE = w2.e(this.f9080c, new x0(this.f9081d, (ti.c) null, 0), this);
                    if (objE != aVar2) {
                        objE = oVar2;
                    }
                    if (objE == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return oVar2;
            default:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f9079b;
                pi.o oVar3 = pi.o.f13011a;
                if (i12 == 0) {
                    uk.c.R(obj);
                    this.f9079b = 1;
                    final int i13 = 0;
                    final b1 b1Var = this.f9081d;
                    v0 v0Var = new v0(b1Var, 0);
                    ej.a aVar4 = new ej.a() { // from class: k0.w0
                        @Override // ej.a
                        public final Object a() {
                            switch (i13) {
                                case 0:
                                    b1Var.b();
                                    break;
                                default:
                                    b1Var.onCancel();
                                    break;
                            }
                            return pi.o.f13011a;
                        }
                    };
                    final int i14 = 1;
                    Object objE2 = x.g0.e(this.f9080c, v0Var, aVar4, new ej.a() { // from class: k0.w0
                        @Override // ej.a
                        public final Object a() {
                            switch (i14) {
                                case 0:
                                    b1Var.b();
                                    break;
                                default:
                                    b1Var.onCancel();
                                    break;
                            }
                            return pi.o.f13011a;
                        }
                    }, new g2(b1Var, 15), this);
                    if (objE2 != aVar3) {
                        objE2 = oVar3;
                    }
                    if (objE2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return oVar3;
        }
    }
}
