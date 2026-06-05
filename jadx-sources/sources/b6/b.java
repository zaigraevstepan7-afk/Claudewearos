package b6;

import f1.p1;
import pi.o;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1577a;

    /* renamed from: b, reason: collision with root package name */
    public int f1578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tj.e f1579c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f1580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(tj.e eVar, p1 p1Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f1577a = i10;
        this.f1579c = eVar;
        this.f1580d = p1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f1577a) {
            case 0:
                return new b(this.f1579c, this.f1580d, cVar, 0);
            default:
                return new b(this.f1579c, this.f1580d, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f1577a) {
        }
        return ((b) create(zVar, cVar)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1577a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f1578b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    a aVar2 = new a(this.f1580d, 1);
                    this.f1578b = 1;
                    if (this.f1579c.c(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            default:
                ui.a aVar3 = ui.a.f17085a;
                int i11 = this.f1578b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    a aVar4 = new a(this.f1580d, 3);
                    this.f1578b = 1;
                    if (this.f1579c.c(aVar4, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
        }
    }
}
