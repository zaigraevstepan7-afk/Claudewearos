package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j1 extends fj.m implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f18304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mh.g f18305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(boolean z2, mh.g gVar, String str) {
        super(0);
        this.f18304a = z2;
        this.f18305b = gVar;
        this.f18306c = str;
    }

    @Override // ej.a
    public final Object a() {
        if (this.f18304a) {
            mh.g gVar = this.f18305b;
            String str = this.f18306c;
            c7.b bVar = (c7.b) gVar.f11707b;
            synchronized (bVar.f3102c) {
            }
        }
        return pi.o.f13011a;
    }
}
