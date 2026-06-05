package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class i0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final z.k f17226b;

    public i0(z.k kVar) {
        this.f17226b = kVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new j0(this.f17226b, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return fj.l.b(this.f17226b, ((i0) obj).f17226b);
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((j0) nVar).u1(this.f17226b);
    }

    public final int hashCode() {
        z.k kVar = this.f17226b;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }
}
