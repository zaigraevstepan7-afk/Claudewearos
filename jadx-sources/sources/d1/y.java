package d1;

import c1.j8;
import x.w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4605a;

    /* renamed from: b, reason: collision with root package name */
    public int f4606b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.a0 f4608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j8 f4609e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(p2.a0 a0Var, j8 j8Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f4605a = i10;
        this.f4608d = a0Var;
        this.f4609e = j8Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f4605a) {
            case 0:
                y yVar = new y(this.f4608d, this.f4609e, cVar, 0);
                yVar.f4607c = obj;
                return yVar;
            default:
                y yVar2 = new y(this.f4608d, this.f4609e, cVar, 1);
                yVar2.f4607c = obj;
                return yVar2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f4605a) {
        }
        return ((y) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4605a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f4606b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    x xVar = new x((qj.z) this.f4607c, this.f4609e, null);
                    this.f4606b = 1;
                    if (w2.e(this.f4608d, xVar, this) == aVar) {
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
                int i11 = this.f4606b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    a0 a0Var = new a0((qj.z) this.f4607c, this.f4609e, (ti.c) null);
                    this.f4606b = 1;
                    if (((p2.p0) this.f4608d).q1(a0Var, this) == aVar2) {
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
