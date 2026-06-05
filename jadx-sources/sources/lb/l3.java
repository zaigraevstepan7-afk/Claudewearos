package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l3 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10453a = 0;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10455c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10458f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f10459z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(g gVar, f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3, f1.a1 a1Var4, f1.a1 a1Var5, ti.c cVar) {
        super(2, cVar);
        this.f10454b = gVar;
        this.f10455c = a1Var;
        this.f10456d = a1Var2;
        this.f10457e = a1Var3;
        this.f10458f = a1Var4;
        this.f10459z = a1Var5;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f10453a) {
            case 0:
                return new l3((g) this.f10454b, (f1.a1) this.f10455c, (f1.a1) this.f10456d, (f1.a1) this.f10457e, (f1.a1) this.f10458f, (f1.a1) this.f10459z, cVar);
            default:
                l3 l3Var = new l3((t.c) this.f10455c, (t.c) this.f10456d, (t.c) this.f10457e, (t.c) this.f10458f, (t.c) this.f10459z, cVar);
                l3Var.f10454b = obj;
                return l3Var;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f10453a) {
            case 0:
                l3 l3Var = (l3) create(zVar, cVar);
                pi.o oVar = pi.o.f13011a;
                l3Var.invokeSuspend(oVar);
                return oVar;
            default:
                return ((l3) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f10453a;
        Object obj2 = this.f10459z;
        Object obj3 = this.f10458f;
        Object obj4 = this.f10457e;
        Object obj5 = this.f10456d;
        Object obj6 = this.f10455c;
        switch (i10) {
            case 0:
                f1.a1 a1Var = (f1.a1) obj3;
                f1.a1 a1Var2 = (f1.a1) obj4;
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                f1.a1 a1Var3 = (f1.a1) obj6;
                float f10 = q3.f10603g;
                nb.a0 a0Var = (nb.a0) a1Var3.getValue();
                if (fj.l.b(a0Var, nb.x.f12087b)) {
                    ((f1.a1) obj5).setValue(Boolean.TRUE);
                    ((g) this.f10454b).y(true);
                    q3.E(a1Var2, false);
                    a1Var.setValue(null);
                    q3.D((f1.a1) obj2, false);
                } else if (fj.l.b(a0Var, nb.y.f12088a) || fj.l.b(a0Var, nb.z.f12089a)) {
                    q3.E(a1Var2, true);
                } else if (a0Var instanceof nb.w) {
                    q3.E(a1Var2, false);
                    nb.a0 a0Var2 = (nb.a0) a1Var3.getValue();
                    fj.l.d(a0Var2, "null cannot be cast to non-null type com.anonlab.voidlauncher.feature.home.pro.PurchaseState.Error");
                    a1Var.setValue(((nb.w) a0Var2).f12085a);
                } else {
                    if (!fj.l.b(a0Var, nb.x.f12086a)) {
                        throw new b3.e();
                    }
                    q3.E(a1Var2, false);
                }
                return pi.o.f13011a;
            default:
                qj.z zVar = (qj.z) this.f10454b;
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                qj.b0.w(zVar, null, new ab.o((t.c) obj6, null, 8), 3);
                qj.b0.w(zVar, null, new ab.o((t.c) obj5, null, 9), 3);
                qj.b0.w(zVar, null, new ab.o((t.c) obj4, null, 10), 3);
                qj.b0.w(zVar, null, new ab.o((t.c) obj3, null, 11), 3);
                return qj.b0.w(zVar, null, new ab.o((t.c) obj2, null, 12), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(t.c cVar, t.c cVar2, t.c cVar3, t.c cVar4, t.c cVar5, ti.c cVar6) {
        super(2, cVar6);
        this.f10455c = cVar;
        this.f10456d = cVar2;
        this.f10457e = cVar3;
        this.f10458f = cVar4;
        this.f10459z = cVar5;
    }
}
