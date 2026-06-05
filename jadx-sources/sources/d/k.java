package d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends cg.b {

    /* renamed from: d, reason: collision with root package name */
    public final a f4336d;

    public k(a aVar) {
        this.f4336d = aVar;
    }

    public final void a0(Object obj) {
        g.f fVar = this.f4336d.f4315a;
        if (fVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        fVar.a0(obj);
    }
}
