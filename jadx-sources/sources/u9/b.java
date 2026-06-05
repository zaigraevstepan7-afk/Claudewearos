package u9;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final x9.a f16872a;

    public b(x9.a aVar) {
        this.f16872a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && l.b(this.f16872a, ((b) obj).f16872a);
    }

    public final int hashCode() {
        return this.f16872a.f19847a.hashCode();
    }

    public final String toString() {
        return "Rendered(icon=" + this.f16872a + ")";
    }
}
