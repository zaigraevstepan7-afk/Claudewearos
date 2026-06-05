package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a3 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1877a;

    /* renamed from: b, reason: collision with root package name */
    public int f1878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3 f1879c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.a f1880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(b3 b3Var, c.a aVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f1877a = i10;
        this.f1879c = b3Var;
        this.f1880d = aVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f1877a) {
            case 0:
                return new a3(this.f1879c, this.f1880d, cVar, 0);
            default:
                return new a3(this.f1879c, this.f1880d, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f1877a) {
        }
        return ((a3) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1877a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f1878b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    t.c cVar = this.f1879c.f1937e;
                    Float f10 = new Float(d1.r.f4567a.c(this.f1880d.f1797c));
                    this.f1878b = 1;
                    if (cVar.f(f10, this) == aVar) {
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
                int i11 = this.f1878b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    t.c cVar2 = this.f1879c.f1937e;
                    Float f11 = new Float(d1.r.f4567a.c(this.f1880d.f1797c));
                    this.f1878b = 1;
                    if (cVar2.f(f11, this) == aVar2) {
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
