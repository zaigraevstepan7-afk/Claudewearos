package va;

import qj.b0;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends vi.i implements ej.e {
    public final /* synthetic */ t.c A;
    public final /* synthetic */ t.c B;

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f17919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f17920c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.c f17921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f17922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t.c f17923f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f17924z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t.c cVar, float f10, t.c cVar2, float f11, t.c cVar3, float f12, t.c cVar4, t.c cVar5, ti.c cVar6) {
        super(2, cVar6);
        this.f17919b = cVar;
        this.f17920c = f10;
        this.f17921d = cVar2;
        this.f17922e = f11;
        this.f17923f = cVar3;
        this.f17924z = f12;
        this.A = cVar4;
        this.B = cVar5;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        d dVar = new d(this.f17919b, this.f17920c, this.f17921d, this.f17922e, this.f17923f, this.f17924z, this.A, this.B, cVar);
        dVar.f17918a = obj;
        return dVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        z zVar = (z) this.f17918a;
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        b0.w(zVar, null, new bb.i(this.f17919b, this.f17920c, null, 2), 3);
        b0.w(zVar, null, new bb.i(this.f17921d, this.f17922e, null, 3), 3);
        b0.w(zVar, null, new bb.i(this.f17923f, this.f17924z, null, 4), 3);
        b0.w(zVar, null, new ab.o(this.A, null, 13), 3);
        return b0.w(zVar, null, new ab.o(this.B, null, 14), 3);
    }
}
