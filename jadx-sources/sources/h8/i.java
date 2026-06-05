package h8;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f7702b = new i(u0.c.p(new LinkedHashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f7703a;

    public i(Map map) {
        this.f7703a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && fj.l.b(this.f7703a, ((i) obj).f7703a);
    }

    public final int hashCode() {
        return this.f7703a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.f7703a + ')';
    }
}
