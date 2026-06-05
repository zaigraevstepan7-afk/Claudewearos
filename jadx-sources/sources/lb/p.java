package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10555a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mi.p f10556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10557c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.c f10558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10560f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f10561z;

    public /* synthetic */ p(ej.a aVar, g gVar, mi.p pVar, boolean z2, ej.c cVar, ej.a aVar2, int i10) {
        this.f10559e = aVar;
        this.f10561z = gVar;
        this.f10556b = pVar;
        this.f10557c = z2;
        this.f10558d = cVar;
        this.f10560f = aVar2;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10555a) {
            case 0:
                ((Integer) obj2).getClass();
                r.a((ej.a) this.f10559e, (g) this.f10561z, this.f10556b, this.f10557c, this.f10558d, (ej.a) this.f10560f, (f1.i0) obj, f1.s.O(196679));
                break;
            case 1:
                ib.g gVar = (ib.g) this.f10559e;
                f1.a1 a1Var = (f1.a1) this.f10560f;
                f1.a1 a1Var2 = (f1.a1) this.f10561z;
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v1.o oVarA = z1.h.a(((Number) t.e.b((gVar.f8428i || ((Boolean) a1Var.getValue()).booleanValue()) ? 0.0f : 1.0f, t.d.t(200, 0, null, 6), "homescreen_topbar_alpha", null, i0Var, 3120, 20).getValue()).floatValue(), v1.l.f17564b);
                    Object objQ = i0Var.Q();
                    if (objQ == f1.m.f6385a) {
                        objQ = new r0.d(a1Var2, 11);
                        i0Var.l0(objQ);
                    }
                    db.a.a(384, (ej.a) objQ, this.f10558d, i0Var, this.f10556b, oVarA, this.f10557c);
                } else {
                    i0Var.W();
                }
                return pi.o.f13011a;
            default:
                ej.a aVar = (ej.a) this.f10559e;
                ej.a aVar2 = (ej.a) this.f10560f;
                v1.o oVar = (v1.o) this.f10561z;
                ((Integer) obj2).getClass();
                u0.b.a(f1.s.O(24961), aVar, aVar2, this.f10558d, (f1.i0) obj, this.f10556b, oVar, this.f10557c);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ p(ib.g gVar, mi.p pVar, boolean z2, ej.c cVar, f1.a1 a1Var, f1.a1 a1Var2) {
        this.f10559e = gVar;
        this.f10556b = pVar;
        this.f10557c = z2;
        this.f10558d = cVar;
        this.f10560f = a1Var;
        this.f10561z = a1Var2;
    }

    public /* synthetic */ p(mi.p pVar, boolean z2, ej.a aVar, ej.c cVar, ej.a aVar2, v1.o oVar, int i10) {
        this.f10556b = pVar;
        this.f10557c = z2;
        this.f10559e = aVar;
        this.f10558d = cVar;
        this.f10560f = aVar2;
        this.f10561z = oVar;
    }
}
