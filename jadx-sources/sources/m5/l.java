package m5;

import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends vi.i implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11328a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f11329b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11330c;

    public /* synthetic */ l(int i10, ti.c cVar) {
        super(i10, cVar);
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f11328a) {
            case 0:
                return new l((z) this.f11330c, (ti.c) obj3).invokeSuspend(pi.o.f13011a);
            default:
                ((Boolean) obj2).getClass();
                l lVar = new l(3, (ti.c) obj3);
                lVar.f11330c = (c0) obj;
                return lVar.invokeSuspend(pi.o.f13011a);
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws IOException {
        switch (this.f11328a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f11329b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    z zVar = (z) this.f11330c;
                    this.f11329b = 1;
                    if (z.a(zVar, this) == aVar) {
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
                int i11 = this.f11329b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return obj;
                }
                uk.c.R(obj);
                c0 c0Var = (c0) this.f11330c;
                this.f11329b = 1;
                if (c0Var.f11272b.get()) {
                    throw new IllegalStateException("This scope has already been closed.");
                }
                Object objE = a.a.e(c0Var.f11271a, new d1.l(c0Var, (ti.c) null, 2), this);
                return objE == aVar2 ? aVar2 : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z zVar, ti.c cVar) {
        super(3, cVar);
        this.f11330c = zVar;
    }
}
