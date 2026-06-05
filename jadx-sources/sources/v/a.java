package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f17142b;

    public /* synthetic */ a(g gVar, int i10) {
        this.f17141a = i10;
        this.f17142b = gVar;
    }

    @Override // ej.a
    public final Object a() {
        v2.j jVar;
        switch (this.f17141a) {
            case 0:
                f1.v vVar = x0.f17331a;
                g gVar = this.f17142b;
                a1 a1Var = (a1) v2.n.h(gVar, vVar);
                if (a1Var == null) {
                    a0.a.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + a1Var);
                }
                a1 a1Var2 = gVar.R;
                gVar.R = a1Var;
                if (a1Var2 != null && !fj.l.b(a1Var, a1Var2) && ((jVar = gVar.U) != null || !gVar.f17195b0)) {
                    if (jVar != null) {
                        gVar.r1(jVar);
                    }
                    gVar.U = null;
                    gVar.B1();
                }
                return pi.o.f13011a;
            default:
                this.f17142b.P.a();
                return Boolean.TRUE;
        }
    }
}
