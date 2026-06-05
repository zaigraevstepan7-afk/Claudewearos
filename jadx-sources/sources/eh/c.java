package eh;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f6080a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f6081b;

    public c(String str, Map map) {
        this.f6080a = str;
        this.f6081b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6080a.equals(cVar.f6080a) && this.f6081b.equals(cVar.f6081b);
    }

    public final int hashCode() {
        return this.f6081b.hashCode() + (this.f6080a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f6080a + ", properties=" + this.f6081b.values() + "}";
    }
}
