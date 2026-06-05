package rg;

import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n extends zg.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hj.a f14449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashMap f14450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yh.c f14451d;

    public n(hj.a aVar, HashMap map, yh.c cVar) {
        this.f14449b = aVar;
        this.f14450c = map;
        this.f14451d = cVar;
    }

    @Override // zg.e
    public final void c0(zg.c cVar, zg.r rVar) {
        zg.r rVarJ = cg.b.J(rVar, this.f14449b.v(cVar), this.f14450c);
        if (rVarJ != rVar) {
            h hVar = new h(cVar.f20592a);
            yh.c cVar2 = this.f14451d;
            cVar2.f20314b = ((zg.r) cVar2.f20314b).k(hVar, rVarJ);
        }
    }
}
