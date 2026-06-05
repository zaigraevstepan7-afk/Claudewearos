package zk;

import fj.f;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f20648a;

    public c(f fVar) {
        this.f20648a = dl.a.a(fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && l.b(this.f20648a, ((c) obj).f20648a);
    }

    @Override // zk.a
    public final String getValue() {
        return this.f20648a;
    }

    public final int hashCode() {
        return this.f20648a.hashCode();
    }

    public final String toString() {
        return this.f20648a;
    }
}
