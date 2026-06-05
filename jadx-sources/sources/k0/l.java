package k0;

import b0.e2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f9160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.c f9161c;

    public /* synthetic */ l(u1 u1Var, ej.c cVar, int i10) {
        this.f9159a = i10;
        this.f9160b = u1Var;
        this.f9161c = cVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f9159a) {
            case 0:
                g3.k0 k0Var = (g3.k0) obj;
                u1 u1Var = this.f9160b;
                if (u1Var != null) {
                    u1Var.f9300a.setValue(k0Var);
                }
                ej.c cVar = this.f9161c;
                if (cVar != null) {
                    cVar.invoke(k0Var);
                }
                return pi.o.f13011a;
            default:
                u1 u1Var2 = this.f9160b;
                t1.q qVar = u1Var2.f9302c;
                ej.c cVar2 = this.f9161c;
                qVar.add(cVar2);
                return new e2(4, u1Var2, cVar2);
        }
    }
}
