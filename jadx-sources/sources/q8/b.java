package q8;

import fj.l;
import h8.j;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final j f13295a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f13296b;

    public b(j jVar, Map map) {
        this.f13295a = jVar;
        this.f13296b = u0.c.p(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.b(this.f13295a, bVar.f13295a) && l.b(this.f13296b, bVar.f13296b);
    }

    public final int hashCode() {
        return this.f13296b.hashCode() + (this.f13295a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.f13295a + ", extras=" + this.f13296b + ')';
    }
}
