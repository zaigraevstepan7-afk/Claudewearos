package d;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends cg.b {

    /* renamed from: d, reason: collision with root package name */
    public final Object f4323d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4324e;

    public d(Object obj, long j) {
        this.f4323d = obj;
        this.f4324e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.b(this.f4323d, dVar.f4323d) && this.f4324e == dVar.f4324e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4324e) + (this.f4323d.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f4323d + ", compositeKey=" + this.f4324e + ')';
    }
}
