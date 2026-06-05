package d1;

import c1.j8;
import v.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4578a;

    /* renamed from: b, reason: collision with root package name */
    public int f4579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j8 f4580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(j8 j8Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f4578a = i10;
        this.f4580c = j8Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f4578a) {
            case 0:
                return new u(this.f4580c, cVar, 0);
            default:
                return new u(this.f4580c, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f4578a) {
        }
        return ((u) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4578a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f4579b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    this.f4579b = 1;
                    if (this.f4580c.c(f1.f17189a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            default:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f4579b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    f1 f1Var = f1.f17190b;
                    this.f4579b = 1;
                    if (this.f4580c.c(f1Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
        }
    }
}
