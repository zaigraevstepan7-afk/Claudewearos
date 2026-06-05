package d6;

import fj.l;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4977a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.b(this.f4977a, ((b) obj).f4977a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4977a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f4977a + ')';
    }
}
