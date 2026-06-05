package ra;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f13945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(boolean z2, f1.a1 a1Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f13943a = i10;
        this.f13944b = z2;
        this.f13945c = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f13943a) {
            case 0:
                return new b0(this.f13944b, this.f13945c, cVar, 0);
            case 1:
                return new b0(this.f13944b, this.f13945c, cVar, 1);
            default:
                return new b0(this.f13944b, this.f13945c, cVar, 2);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f13943a) {
            case 0:
                b0 b0Var = (b0) create(zVar, cVar);
                pi.o oVar = pi.o.f13011a;
                b0Var.invokeSuspend(oVar);
                return oVar;
            case 1:
                b0 b0Var2 = (b0) create(zVar, cVar);
                pi.o oVar2 = pi.o.f13011a;
                b0Var2.invokeSuspend(oVar2);
                return oVar2;
            default:
                b0 b0Var3 = (b0) create(zVar, cVar);
                pi.o oVar3 = pi.o.f13011a;
                b0Var3.invokeSuspend(oVar3);
                return oVar3;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f13943a;
        pi.o oVar = pi.o.f13011a;
        f1.a1 a1Var = this.f13945c;
        boolean z2 = this.f13944b;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                if (!z2) {
                    b.v(a1Var, false);
                    break;
                }
                break;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                a1Var.setValue(Integer.valueOf(z2 ? 1 : 0));
                break;
            default:
                ui.a aVar3 = ui.a.f17085a;
                uk.c.R(obj);
                if (!z2) {
                    ua.c cVar = ua.c.f16893a;
                    int i11 = ua.k.f16934e;
                    a1Var.setValue(cVar);
                    break;
                }
                break;
        }
        return oVar;
    }
}
