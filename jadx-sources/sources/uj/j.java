package uj;

import qj.b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j extends f {

    /* renamed from: e, reason: collision with root package name */
    public final vi.i f17120e;

    /* JADX WARN: Multi-variable type inference failed */
    public j(ej.f fVar, tj.e eVar, ti.h hVar, int i10, sj.a aVar) {
        super(eVar, hVar, i10, aVar);
        this.f17120e = (vi.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ej.f, vi.i] */
    @Override // uj.f
    public final f b(ti.h hVar, int i10, sj.a aVar) {
        return new j(this.f17120e, this.f17109d, hVar, i10, aVar);
    }

    @Override // uj.f
    public final Object e(tj.f fVar, ti.c cVar) {
        Object objH = b0.h(new h(this, fVar, null), cVar);
        return objH == ui.a.f17085a ? objH : pi.o.f13011a;
    }
}
