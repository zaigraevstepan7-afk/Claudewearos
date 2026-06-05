package mi;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11758a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f11759b;

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f11758a) {
            case 0:
                c cVar = (c) obj;
                fj.l.f(cVar, "area");
                return Boolean.valueOf(this.f11759b == null || cVar.f11739c.g() < 0.0f);
            default:
                ((Long) obj).longValue();
                Iterator it = this.f11759b.H.f11741e.iterator();
                while (true) {
                    t1.d0 d0Var = (t1.d0) it;
                    if (!d0Var.hasNext()) {
                        return pi.o.f13011a;
                    }
                    v2.n.m(((h) d0Var.next()).f11760a);
                }
        }
    }

    public /* synthetic */ g(o oVar) {
        this.f11759b = oVar;
    }
}
