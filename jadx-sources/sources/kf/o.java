package kf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o implements r {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9594c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile r f9595a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f9596b;

    /* JADX WARN: Multi-variable type inference failed */
    public static o b(p pVar) {
        if (pVar instanceof o) {
            return (o) pVar;
        }
        o oVar = new o();
        oVar.f9596b = f9594c;
        oVar.f9595a = pVar;
        return oVar;
    }

    @Override // kf.s
    public final Object a() {
        Object objA;
        Object obj = this.f9596b;
        Object obj2 = f9594c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f9596b;
                if (objA == obj2) {
                    objA = this.f9595a.a();
                    Object obj3 = this.f9596b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f9596b = objA;
                    this.f9595a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objA;
    }
}
