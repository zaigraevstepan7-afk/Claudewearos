package ea;

import fj.l;
import java.util.Map;
import qi.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Map f5843a = t.f13521a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && l.b(this.f5843a, ((f) obj).f5843a);
    }

    public final int hashCode() {
        return this.f5843a.hashCode();
    }

    public final String toString() {
        return "OverlayState(overlays=" + this.f5843a + ")";
    }
}
