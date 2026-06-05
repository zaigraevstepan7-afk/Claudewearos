package j6;

import c.b0;
import tj.r0;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public s f8707a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8708b;

    public final void a() {
        s sVar = this.f8707a;
        if (sVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f8708b) {
            sVar.g(this, null);
        }
        g gVar = (g) sVar.f19380b;
        ac.h hVar = (ac.h) sVar.f19379a;
        gVar.getClass();
        if (equals(gVar.f8716h) && -1 == gVar.f8715g) {
            d dVarC = gVar.f8714f;
            if (dVarC == null) {
                dVarC = gVar.c(-1);
            }
            gVar.f8714f = null;
            gVar.f8715g = 0;
            gVar.f8716h = null;
            if (dVarC == null) {
                ((b0) hVar.f388b).f1802a.run();
            } else {
                dVarC.b();
            }
            r0 r0Var = gVar.f8709a;
            r0Var.getClass();
            r0Var.k(null, h.f8722f);
        }
        this.f8708b = false;
    }

    public void b(boolean z2) {
    }
}
