package kg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n implements oh.b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9636c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f9637a = f9636c;

    /* renamed from: b, reason: collision with root package name */
    public volatile oh.b f9638b;

    public n(oh.b bVar) {
        this.f9638b = bVar;
    }

    @Override // oh.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f9637a;
        Object obj3 = f9636c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f9637a;
                if (obj == obj3) {
                    obj = this.f9638b.get();
                    this.f9637a = obj;
                    this.f9638b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
