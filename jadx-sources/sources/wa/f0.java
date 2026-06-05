package wa;

import t.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19070a;

    /* renamed from: b, reason: collision with root package name */
    public int f19071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f19072c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f19073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(t.c cVar, float f10, int i10, ti.c cVar2, int i11) {
        super(2, cVar2);
        this.f19070a = i11;
        this.f19072c = cVar;
        this.f19073d = f10;
        this.f19074e = i10;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f19070a) {
            case 0:
                return new f0(this.f19072c, this.f19073d, this.f19074e, cVar, 0);
            default:
                return new f0(this.f19072c, this.f19073d, this.f19074e, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f19070a) {
        }
        return ((f0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19070a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f19071b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    Float f10 = new Float(this.f19073d);
                    o1 o1VarT = t.d.t(this.f19074e, 0, t.y.f15327b, 2);
                    this.f19071b = 1;
                    if (t.c.d(this.f19072c, f10, o1VarT, null, null, this, 12) == aVar) {
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
                int i11 = this.f19071b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    Float f11 = new Float(this.f19073d);
                    o1 o1VarT2 = t.d.t(this.f19074e, 0, t.y.f15327b, 2);
                    this.f19071b = 1;
                    if (t.c.d(this.f19072c, f11, o1VarT2, null, null, this, 12) == aVar2) {
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
