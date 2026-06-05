package mi;

import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class z extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11806a;

    /* renamed from: b, reason: collision with root package name */
    public int f11807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f11808c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2.b f11809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fj.s f11810e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(b0 b0Var, f2.b bVar, fj.s sVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f11806a = i10;
        this.f11808c = b0Var;
        this.f11809d = bVar;
        this.f11810e = sVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f11806a) {
            case 0:
                return new z(this.f11808c, this.f11809d, this.f11810e, cVar, 0);
            default:
                return new z(this.f11808c, this.f11809d, this.f11810e, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f11806a) {
        }
        return ((z) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f11806a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f11807b;
                f2.b bVar = this.f11809d;
                b0 b0Var = this.f11808c;
                if (i10 == 0) {
                    uk.c.R(obj);
                    float f10 = this.f11810e.f6804a;
                    this.f11807b = 1;
                    if (b0.c(b0Var, bVar, f10, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                ((c2.b0) v2.n.h(b0Var.f11730a, f1.f18261g)).a(bVar);
                return pi.o.f13011a;
            default:
                b0 b0Var2 = this.f11808c;
                i iVar = b0Var2.f11730a;
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f11807b;
                f2.b bVar2 = this.f11809d;
                if (i11 == 0) {
                    uk.c.R(obj);
                    float f11 = this.f11810e.f6804a;
                    this.f11807b = 1;
                    if (b0.c(b0Var2, bVar2, f11, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                ((c2.b0) v2.n.h(iVar, f1.f18261g)).a(bVar2);
                if (b0Var2.f11735f) {
                    v2.n.m(iVar);
                }
                return pi.o.f13011a;
        }
    }
}
