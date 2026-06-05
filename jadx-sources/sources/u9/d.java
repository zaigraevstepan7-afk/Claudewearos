package u9;

import fj.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f16874a;

    public d(String str) {
        this.f16874a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && l.b(this.f16874a, ((d) obj).f16874a);
    }

    public final int hashCode() {
        return this.f16874a.hashCode();
    }

    public final String toString() {
        return m1.j("Internal(id=", this.f16874a, ")");
    }
}
