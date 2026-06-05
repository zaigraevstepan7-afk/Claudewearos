package lb;

import android.view.Choreographer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10414a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i10, ti.c cVar, int i11) {
        super(i10, cVar);
        this.f10414a = i11;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f10414a) {
            case 0:
                return new k0(2, cVar, 0);
            case 1:
                return new k0(2, cVar, 1);
            case 2:
                return new k0(2, cVar, 2);
            default:
                return new k0(2, cVar, 3);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10414a) {
            case 0:
                k0 k0Var = (k0) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar = pi.o.f13011a;
                k0Var.invokeSuspend(oVar);
                return oVar;
            case 1:
                k0 k0Var2 = (k0) create((tj.f) obj, (ti.c) obj2);
                pi.o oVar2 = pi.o.f13011a;
                k0Var2.invokeSuspend(oVar2);
                return oVar2;
            case 2:
                return ((k0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                k0 k0Var3 = (k0) create((x.s1) obj, (ti.c) obj2);
                pi.o oVar3 = pi.o.f13011a;
                k0Var3.invokeSuspend(oVar3);
                return oVar3;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f10414a;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                nb.o oVar2 = nb.o.f12026a;
                nb.o.f12027b.c();
                tj.r0 r0Var = nb.o.f12033h;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.k(null, bool);
                w8.a aVar2 = nb.o.f12050z;
                if (aVar2 != null) {
                    aVar2.b();
                }
                nb.o.f12050z = null;
                return oVar;
            case 1:
                ui.a aVar3 = ui.a.f17085a;
                uk.c.R(obj);
                return oVar;
            case 2:
                ui.a aVar4 = ui.a.f17085a;
                uk.c.R(obj);
                return Choreographer.getInstance();
            default:
                ui.a aVar5 = ui.a.f17085a;
                uk.c.R(obj);
                return oVar;
        }
    }
}
