package kg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p implements oh.b {

    /* renamed from: c, reason: collision with root package name */
    public static final b0.b f9641c = new b0.b(24);

    /* renamed from: d, reason: collision with root package name */
    public static final f f9642d = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public oh.a f9643a;

    /* renamed from: b, reason: collision with root package name */
    public volatile oh.b f9644b;

    public p(b0.b bVar, oh.b bVar2) {
        this.f9643a = bVar;
        this.f9644b = bVar2;
    }

    public final void a(oh.a aVar) {
        oh.b bVar;
        oh.b bVar2;
        oh.b bVar3 = this.f9644b;
        f fVar = f9642d;
        if (bVar3 != fVar) {
            aVar.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f9644b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f9643a = new ac.l(11, this.f9643a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.a(bVar);
        }
    }

    @Override // oh.b
    public final Object get() {
        return this.f9644b.get();
    }
}
