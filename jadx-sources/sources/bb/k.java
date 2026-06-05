package bb;

import qj.z;
import x.q0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1692a;

    /* renamed from: b, reason: collision with root package name */
    public int f1693b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1694c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f1695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(t.c cVar, o2.a aVar, long j, ti.c cVar2, int i10) {
        super(2, cVar2);
        this.f1692a = i10;
        this.f1694c = cVar;
        this.f1696e = aVar;
        this.f1695d = j;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f1692a) {
            case 0:
                return new k((t.c) this.f1694c, (l) this.f1696e, this.f1695d, cVar, 0);
            case 1:
                return new k((t.c) this.f1694c, (p) this.f1696e, this.f1695d, cVar, 1);
            default:
                k kVar = new k((q0) this.f1696e, this.f1695d, cVar);
                kVar.f1694c = obj;
                return kVar;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f1692a) {
        }
        return ((k) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1692a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f1693b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    t.c cVar = (t.c) this.f1694c;
                    Float f10 = new Float(((l) this.f1696e).a(this.f1695d));
                    this.f1693b = 1;
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
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f1693b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    t.c cVar2 = (t.c) this.f1694c;
                    Float f11 = new Float(((p) this.f1696e).a(this.f1695d));
                    this.f1693b = 1;
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
            default:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f1693b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    z zVar = (z) this.f1694c;
                    ej.f fVar = ((q0) this.f1696e).f19684f0;
                    b2.b bVar = new b2.b(this.f1695d);
                    this.f1693b = 1;
                    if (fVar.c(zVar, bVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q0 q0Var, long j, ti.c cVar) {
        super(2, cVar);
        this.f1692a = 2;
        this.f1696e = q0Var;
        this.f1695d = j;
    }
}
