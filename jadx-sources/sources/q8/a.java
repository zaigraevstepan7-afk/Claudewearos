package q8;

import fj.l;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13293a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f13294b;

    public a(String str, Map map) {
        this.f13293a = str;
        this.f13294b = u0.c.p(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.b(this.f13293a, aVar.f13293a) && l.b(this.f13294b, aVar.f13294b);
    }

    public final int hashCode() {
        return this.f13294b.hashCode() + (this.f13293a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f13293a + ", extras=" + this.f13294b + ')';
    }
}
