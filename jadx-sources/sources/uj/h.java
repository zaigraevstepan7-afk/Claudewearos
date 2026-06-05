package uj;

import fj.v;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17110a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f17111b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f17112c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f17113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tj.f f17114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, tj.f fVar, Object obj, ti.c cVar) {
        super(2, cVar);
        this.f17113d = jVar;
        this.f17114e = fVar;
        this.f17112c = obj;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17110a) {
            case 0:
                return new h(this.f17113d, this.f17114e, this.f17112c, cVar);
            default:
                h hVar = new h(this.f17113d, this.f17114e, cVar);
                hVar.f17112c = obj;
                return hVar;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f17110a) {
        }
        return ((h) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [ej.f, vi.i] */
    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17110a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f17111b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    ?? r10 = this.f17113d.f17120e;
                    Object obj2 = this.f17112c;
                    this.f17111b = 1;
                    if (r10.c(this.f17114e, obj2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            default:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f17111b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    z zVar = (z) this.f17112c;
                    v vVar = new v();
                    j jVar = this.f17113d;
                    tj.e eVar = jVar.f17109d;
                    bb.m mVar = new bb.m(vVar, zVar, jVar, this.f17114e, 2);
                    this.f17111b = 1;
                    if (eVar.c(mVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, tj.f fVar, ti.c cVar) {
        super(2, cVar);
        this.f17113d = jVar;
        this.f17114e = fVar;
    }
}
