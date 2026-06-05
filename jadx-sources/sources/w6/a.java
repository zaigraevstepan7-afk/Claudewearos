package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements ti.f {

    /* renamed from: a, reason: collision with root package name */
    public final ti.g f18788a;

    /* renamed from: b, reason: collision with root package name */
    public final y f18789b;

    public a(ti.g gVar, y yVar) {
        fj.l.f(yVar, "connectionWrapper");
        this.f18788a = gVar;
        this.f18789b = yVar;
    }

    @Override // ti.h
    public final ti.f C(ti.g gVar) {
        return yd.f.w(this, gVar);
    }

    @Override // ti.h
    public final Object F(ej.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // ti.h
    public final ti.h V(ti.h hVar) {
        return yd.f.W(this, hVar);
    }

    @Override // ti.f
    public final ti.g getKey() {
        return this.f18788a;
    }

    @Override // ti.h
    public final ti.h s(ti.g gVar) {
        return yd.f.N(this, gVar);
    }
}
