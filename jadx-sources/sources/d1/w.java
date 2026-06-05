package d1;

import c1.j8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4589a = 0;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f4590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(j8 j8Var, ti.c cVar) {
        super(2, cVar);
        this.f4591c = j8Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f4589a) {
            case 0:
                w wVar = new w((j8) this.f4591c, cVar);
                wVar.f4590b = ((Boolean) obj).booleanValue();
                return wVar;
            default:
                return new w((ej.c) this.f4591c, this.f4590b, cVar);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4589a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                w wVar = (w) create(bool, (ti.c) obj2);
                pi.o oVar = pi.o.f13011a;
                wVar.invokeSuspend(oVar);
                return oVar;
            default:
                w wVar2 = (w) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar2 = pi.o.f13011a;
                wVar2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f4589a;
        pi.o oVar = pi.o.f13011a;
        Object obj2 = this.f4591c;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                if (!this.f4590b) {
                    ((j8) obj2).a();
                    break;
                }
                break;
            default:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                ((ej.c) obj2).invoke(Boolean.valueOf(this.f4590b));
                break;
        }
        return oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ej.c cVar, boolean z2, ti.c cVar2) {
        super(2, cVar2);
        this.f4591c = cVar;
        this.f4590b = z2;
    }
}
