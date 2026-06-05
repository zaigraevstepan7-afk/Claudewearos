package mg;

import java.util.List;
import rg.e0;
import rg.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f11684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f11685c;

    public /* synthetic */ j(d dVar, e0 e0Var, int i10) {
        this.f11683a = i10;
        this.f11685c = dVar;
        this.f11684b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listJ;
        switch (this.f11683a) {
            case 0:
                rg.k kVar = this.f11685c.f11673a;
                kVar.getClass();
                zg.c cVar = rg.c.f14384a;
                e0 e0Var = this.f11684b;
                wg.h hVar = e0Var.f14407f;
                if (cVar.equals(hVar.f19305a.z())) {
                    z zVar = kVar.f14442m;
                    zVar.getClass();
                    listJ = zVar.j(hVar, e0Var, null, false);
                } else {
                    z zVar2 = kVar.f14443n;
                    zVar2.getClass();
                    listJ = zVar2.j(hVar, e0Var, null, false);
                }
                kVar.g(listJ);
                break;
            default:
                rg.k kVar2 = this.f11685c.f11673a;
                kVar2.getClass();
                e0 e0Var2 = this.f11684b;
                zg.c cVarZ = e0Var2.f14407f.f19305a.z();
                kVar2.g((cVarZ == null || !cVarZ.equals(rg.c.f14384a)) ? kVar2.f14443n.c(e0Var2, false) : kVar2.f14442m.c(e0Var2, false));
                break;
        }
    }
}
