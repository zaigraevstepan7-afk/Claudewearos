package wa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final xa.f f19130a;

    /* renamed from: b, reason: collision with root package name */
    public final ca.a f19131b;

    /* renamed from: c, reason: collision with root package name */
    public final ca.b f19132c;

    public o0(xa.f fVar, ca.a aVar, ca.b bVar) {
        fj.l.f(fVar, "displayableItem");
        this.f19130a = fVar;
        this.f19131b = aVar;
        this.f19132c = bVar;
    }

    public static o0 a(o0 o0Var, xa.f fVar) {
        ca.a aVar = o0Var.f19131b;
        ca.b bVar = o0Var.f19132c;
        fj.l.f(fVar, "displayableItem");
        return new o0(fVar, aVar, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return fj.l.b(this.f19130a, o0Var.f19130a) && fj.l.b(this.f19131b, o0Var.f19131b) && fj.l.b(this.f19132c, o0Var.f19132c);
    }

    public final int hashCode() {
        return this.f19132c.hashCode() + ((this.f19131b.hashCode() + (this.f19130a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "GridDisplayableItem(displayableItem=" + this.f19130a + ", cellPosition=" + this.f19131b + ", cellSize=" + this.f19132c + ")";
    }
}
