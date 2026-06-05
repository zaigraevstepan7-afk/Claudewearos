package ja;

import f1.s;
import qj.b0;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8767a;

    /* renamed from: b, reason: collision with root package name */
    public int f8768b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, ti.c cVar, int i11) {
        super(i10, cVar);
        this.f8767a = i11;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f8767a) {
            case 0:
                e eVar = new e(2, cVar, 0);
                eVar.f8769c = obj;
                return eVar;
            case 1:
                e eVar2 = new e(2, cVar, 1);
                eVar2.f8769c = obj;
                return eVar2;
            default:
                e eVar3 = new e(2, cVar, 2);
                eVar3.f8769c = obj;
                return eVar3;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8767a) {
            case 0:
                return ((e) create((tj.f) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 1:
                return ((e) create((tj.f) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                return ((e) create((z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        z zVar;
        switch (this.f8767a) {
            case 0:
                tj.f fVar = (tj.f) this.f8769c;
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f8768b;
                pi.o oVar = pi.o.f13011a;
                if (i10 == 0) {
                    uk.c.R(obj);
                    this.f8769c = null;
                    this.f8768b = 1;
                    if (fVar.b(oVar, this) == aVar) {
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
                tj.f fVar2 = (tj.f) this.f8769c;
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f8768b;
                pi.o oVar2 = pi.o.f13011a;
                if (i11 == 0) {
                    uk.c.R(obj);
                    this.f8769c = null;
                    this.f8768b = 1;
                    if (fVar2.b(oVar2, this) == aVar2) {
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
                int i12 = this.f8768b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    zVar = (z) this.f8769c;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = (z) this.f8769c;
                    uk.c.R(obj);
                }
                while (b0.t(zVar.Q())) {
                    ta.n nVar = new ta.n(16);
                    this.f8769c = zVar;
                    this.f8768b = 1;
                    if (s.v(getContext()).a(nVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                return pi.o.f13011a;
        }
    }
}
