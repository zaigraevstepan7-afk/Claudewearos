package rg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wg.h f14422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f14423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ag.i f14424c;

    public i(ag.i iVar, wg.h hVar, h0 h0Var) {
        this.f14424c = iVar;
        this.f14422a = hVar;
        this.f14423b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = (k) this.f14424c.f449b;
        yh.c cVar = kVar.f14434d;
        h hVar = this.f14422a.f19305a;
        zg.r rVarL = ((zg.r) cVar.f20314b).l(hVar);
        if (rVarL.isEmpty()) {
            return;
        }
        kVar.g(kVar.f14442m.f(hVar, rVarL));
        this.f14423b.c(null);
    }
}
