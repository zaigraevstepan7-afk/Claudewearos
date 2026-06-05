package ja;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements tj.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tj.n f8765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f8766c;

    public /* synthetic */ d(tj.n nVar, h hVar, int i10) {
        this.f8764a = i10;
        this.f8765b = nVar;
        this.f8766c = hVar;
    }

    @Override // tj.e
    public final Object c(tj.f fVar, ti.c cVar) throws Throwable {
        switch (this.f8764a) {
            case 0:
                Object objC = this.f8765b.c(new c(fVar, this.f8766c, 0), cVar);
                if (objC != ui.a.f17085a) {
                    break;
                }
                break;
            default:
                Object objC2 = this.f8765b.c(new c(fVar, this.f8766c, 1), cVar);
                if (objC2 != ui.a.f17085a) {
                    break;
                }
                break;
        }
        return pi.o.f13011a;
    }
}
