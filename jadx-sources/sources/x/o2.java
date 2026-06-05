package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o2 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f19668b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(r1 r1Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f19667a = i10;
        this.f19668b = r1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f19667a) {
            case 0:
                return new o2(this.f19668b, cVar, 0);
            case 1:
                return new o2(this.f19668b, cVar, 1);
            case 2:
                return new o2(this.f19668b, cVar, 2);
            case 3:
                return new o2(this.f19668b, cVar, 3);
            case 4:
                return new o2(this.f19668b, cVar, 4);
            case 5:
                return new o2(this.f19668b, cVar, 5);
            case 6:
                return new o2(this.f19668b, cVar, 6);
            default:
                return new o2(this.f19668b, cVar, 7);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f19667a) {
            case 0:
                o2 o2Var = (o2) create(zVar, cVar);
                pi.o oVar = pi.o.f13011a;
                o2Var.invokeSuspend(oVar);
                return oVar;
            case 1:
                o2 o2Var2 = (o2) create(zVar, cVar);
                pi.o oVar2 = pi.o.f13011a;
                o2Var2.invokeSuspend(oVar2);
                return oVar2;
            case 2:
                o2 o2Var3 = (o2) create(zVar, cVar);
                pi.o oVar3 = pi.o.f13011a;
                o2Var3.invokeSuspend(oVar3);
                return oVar3;
            case 3:
                o2 o2Var4 = (o2) create(zVar, cVar);
                pi.o oVar4 = pi.o.f13011a;
                o2Var4.invokeSuspend(oVar4);
                return oVar4;
            case 4:
                o2 o2Var5 = (o2) create(zVar, cVar);
                pi.o oVar5 = pi.o.f13011a;
                o2Var5.invokeSuspend(oVar5);
                return oVar5;
            case 5:
                o2 o2Var6 = (o2) create(zVar, cVar);
                pi.o oVar6 = pi.o.f13011a;
                o2Var6.invokeSuspend(oVar6);
                return oVar6;
            case 6:
                o2 o2Var7 = (o2) create(zVar, cVar);
                pi.o oVar7 = pi.o.f13011a;
                o2Var7.invokeSuspend(oVar7);
                return oVar7;
            default:
                o2 o2Var8 = (o2) create(zVar, cVar);
                pi.o oVar8 = pi.o.f13011a;
                o2Var8.invokeSuspend(oVar8);
                return oVar8;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f19667a;
        pi.o oVar = pi.o.f13011a;
        r1 r1Var = this.f19668b;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                r1Var.f();
                break;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                r1Var.l();
                break;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                uk.c.R(obj);
                r1Var.l();
                break;
            case 3:
                ui.a aVar4 = ui.a.f17085a;
                uk.c.R(obj);
                r1Var.f();
                break;
            case 4:
                ui.a aVar5 = ui.a.f17085a;
                uk.c.R(obj);
                r1Var.l();
                break;
            case 5:
                ui.a aVar6 = ui.a.f17085a;
                uk.c.R(obj);
                r1Var.l();
                break;
            case 6:
                ui.a aVar7 = ui.a.f17085a;
                uk.c.R(obj);
                r1Var.f();
                break;
            default:
                ui.a aVar8 = ui.a.f17085a;
                uk.c.R(obj);
                r1Var.l();
                break;
        }
        return oVar;
    }
}
