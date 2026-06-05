package r8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final h8.j f13828a;

    /* renamed from: b, reason: collision with root package name */
    public final g f13829b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f13830c;

    public c(h8.j jVar, g gVar, Throwable th2) {
        this.f13828a = jVar;
        this.f13829b = gVar;
        this.f13830c = th2;
    }

    @Override // r8.j
    public final h8.j a() {
        return this.f13828a;
    }

    @Override // r8.j
    public final g b() {
        return this.f13829b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return fj.l.b(this.f13828a, cVar.f13828a) && fj.l.b(this.f13829b, cVar.f13829b) && fj.l.b(this.f13830c, cVar.f13830c);
    }

    public final int hashCode() {
        h8.j jVar = this.f13828a;
        return this.f13830c.hashCode() + ((this.f13829b.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.f13828a + ", request=" + this.f13829b + ", throwable=" + this.f13830c + ')';
    }
}
