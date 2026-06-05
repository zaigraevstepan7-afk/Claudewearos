package xf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20046b = new a(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f20047a;

    public a(Map map) {
        this.f20047a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f20047a.equals(((a) obj).f20047a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20047a.hashCode();
    }

    public final String toString() {
        return this.f20047a.toString();
    }
}
