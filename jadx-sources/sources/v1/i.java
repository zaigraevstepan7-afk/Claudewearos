package v1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements o {

    /* renamed from: b, reason: collision with root package name */
    public final o f17560b;

    /* renamed from: c, reason: collision with root package name */
    public final o f17561c;

    public i(o oVar, o oVar2) {
        this.f17560b = oVar;
        this.f17561c = oVar2;
    }

    @Override // v1.o
    public final boolean a(ej.c cVar) {
        return this.f17560b.a(cVar) && this.f17561c.a(cVar);
    }

    @Override // v1.o
    public final Object b(ej.e eVar, Object obj) {
        return this.f17561c.b(eVar, this.f17560b.b(eVar, obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return fj.l.b(this.f17560b, iVar.f17560b) && fj.l.b(this.f17561c, iVar.f17561c);
    }

    public final int hashCode() {
        return (this.f17561c.hashCode() * 31) + this.f17560b.hashCode();
    }

    public final String toString() {
        return m6.a.i(new StringBuilder("["), (String) b(h.f17559a, ""), ']');
    }
}
