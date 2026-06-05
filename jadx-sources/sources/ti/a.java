package ti;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final g f16332a;

    public a(g gVar) {
        this.f16332a = gVar;
    }

    @Override // ti.h
    public /* bridge */ f C(g gVar) {
        return yd.f.w(this, gVar);
    }

    @Override // ti.h
    public final Object F(ej.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // ti.h
    public final /* bridge */ h V(h hVar) {
        return yd.f.W(this, hVar);
    }

    @Override // ti.f
    public final g getKey() {
        return this.f16332a;
    }

    @Override // ti.h
    public /* bridge */ h s(g gVar) {
        return yd.f.N(this, gVar);
    }
}
