package hb;

import pi.o;
import qj.b0;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f7795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, float f10, ti.c cVar) {
        super(2, cVar);
        this.f7795b = hVar;
        this.f7796c = f10;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        g gVar = new g(this.f7795b, this.f7796c, cVar);
        gVar.f7794a = obj;
        return gVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) create((z) obj, (ti.c) obj2);
        o oVar = o.f13011a;
        gVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        z zVar = (z) this.f7794a;
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        b0.w(zVar, null, new a(this.f7795b, this.f7796c, null, 1), 3);
        return o.f13011a;
    }
}
