package pi;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m implements e, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public ej.a f13007a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f13008b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13009c;

    public m(ej.a aVar) {
        fj.l.f(aVar, "initializer");
        this.f13007a = aVar;
        this.f13008b = n.f13010a;
        this.f13009c = this;
    }

    @Override // pi.e
    public final Object getValue() {
        Object objA;
        Object obj = this.f13008b;
        n nVar = n.f13010a;
        if (obj != nVar) {
            return obj;
        }
        synchronized (this.f13009c) {
            objA = this.f13008b;
            if (objA == nVar) {
                ej.a aVar = this.f13007a;
                fj.l.c(aVar);
                objA = aVar.a();
                this.f13008b = objA;
                this.f13007a = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f13008b != n.f13010a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
