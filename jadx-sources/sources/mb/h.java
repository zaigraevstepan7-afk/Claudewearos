package mb;

import f1.a1;
import nb.a0;
import nb.w;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f11459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f11460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(a1 a1Var, a1 a1Var2, ti.c cVar, int i10) {
        super(2, cVar);
        this.f11458a = i10;
        this.f11459b = a1Var;
        this.f11460c = a1Var2;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f11458a) {
            case 0:
                return new h(this.f11459b, this.f11460c, cVar, 0);
            default:
                return new h(this.f11459b, this.f11460c, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f11458a) {
            case 0:
                h hVar = (h) create(zVar, cVar);
                pi.o oVar = pi.o.f13011a;
                hVar.invokeSuspend(oVar);
                return oVar;
            default:
                h hVar2 = (h) create(zVar, cVar);
                pi.o oVar2 = pi.o.f13011a;
                hVar2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f11458a;
        pi.o oVar = pi.o.f13011a;
        a1 a1Var = this.f11460c;
        a1 a1Var2 = this.f11459b;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                if (((Boolean) a1Var2.getValue()).booleanValue() && ((Boolean) a1Var.getValue()).booleanValue()) {
                    a1Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
            default:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                float f10 = nb.v.j;
                a0 a0Var = (a0) a1Var2.getValue();
                if (a0Var instanceof w) {
                    a1Var.setValue(((w) a0Var).f12085a);
                    break;
                }
                break;
        }
        return oVar;
    }
}
