package uj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17102a;

    /* renamed from: b, reason: collision with root package name */
    public int f17103b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f17104c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f17105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f17102a = i10;
        this.f17105d = fVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17102a) {
            case 0:
                e eVar = new e(this.f17105d, cVar, 0);
                eVar.f17104c = obj;
                return eVar;
            default:
                e eVar2 = new e(this.f17105d, cVar, 1);
                eVar2.f17104c = obj;
                return eVar2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17102a) {
            case 0:
                return ((e) create((sj.p) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                return ((e) create((tj.f) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17102a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f17103b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    sj.p pVar = (sj.p) this.f17104c;
                    this.f17103b = 1;
                    f fVar = this.f17105d;
                    fVar.getClass();
                    Object objE = fVar.e(new s(pVar), this);
                    if (objE != ui.a.f17085a) {
                        objE = pi.o.f13011a;
                    }
                    if (objE == aVar) {
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
                int i11 = this.f17103b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    tj.f fVar2 = (tj.f) this.f17104c;
                    this.f17103b = 1;
                    if (this.f17105d.e(fVar2, this) == aVar2) {
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
