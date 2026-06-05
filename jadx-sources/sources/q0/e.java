package q0;

import v0.m0;
import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class e extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final m0 f13159b;

    public e(m0 m0Var) {
        this.f13159b = m0Var;
    }

    @Override // v2.x0
    public final n d() {
        return new g(this.f13159b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f13159b == ((e) obj).f13159b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(n nVar) {
        ((g) nVar).J = this.f13159b;
    }

    public final int hashCode() {
        return this.f13159b.hashCode();
    }
}
