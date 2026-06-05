package wb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements oi.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f19248c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f19249a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f19250b;

    public static oi.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f19250b = f19248c;
        aVar.f19249a = bVar;
        return aVar;
    }

    @Override // oi.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f19250b;
        Object obj3 = f19248c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f19250b;
                if (obj == obj3) {
                    obj = this.f19249a.get();
                    Object obj4 = this.f19250b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f19250b = obj;
                    this.f19249a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
