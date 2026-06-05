package s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1.c f14589a;

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f14590b;

    /* renamed from: c, reason: collision with root package name */
    public final t.u0 f14591c;

    public e0(v1.c cVar, ej.c cVar2, t.u0 u0Var) {
        this.f14589a = cVar;
        this.f14590b = cVar2;
        this.f14591c = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return fj.l.b(this.f14589a, e0Var.f14589a) && fj.l.b(this.f14590b, e0Var.f14590b) && this.f14591c.equals(e0Var.f14591c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f14591c.hashCode() + ((this.f14590b.hashCode() + (this.f14589a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f14589a + ", size=" + this.f14590b + ", animationSpec=" + this.f14591c + ", clip=true)";
    }
}
