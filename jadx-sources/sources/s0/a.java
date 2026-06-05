package s0;

import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class a extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.a f14711b;

    public a(ej.a aVar) {
        this.f14711b = aVar;
    }

    @Override // v2.x0
    public final n d() {
        return new c(this.f14711b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f14711b == ((a) obj).f14711b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(n nVar) {
        ((c) nVar).J = this.f14711b;
    }

    public final int hashCode() {
        return this.f14711b.hashCode();
    }
}
