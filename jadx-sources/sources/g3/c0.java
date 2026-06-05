package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 implements s1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ej.e f7043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f7044b;

    public c0(ej.e eVar, ej.c cVar) {
        this.f7043a = eVar;
        this.f7044b = cVar;
    }

    @Override // s1.j
    public final Object c(Object obj) {
        return this.f7044b.invoke(obj);
    }

    @Override // s1.j
    public final Object d(s1.a aVar, Object obj) {
        return this.f7043a.invoke(aVar, obj);
    }
}
