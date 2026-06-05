package kh;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a implements oi.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9647c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f9648a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f9649b;

    @Override // oi.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f9649b;
        Object obj3 = f9647c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f9649b;
                if (obj == obj3) {
                    obj = this.f9648a.get();
                    Object obj4 = this.f9649b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f9649b = obj;
                    this.f9648a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
