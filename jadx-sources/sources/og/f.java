package og;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final c f12516a;

    public f(List list, Comparator comparator) {
        Map map = Collections.EMPTY_MAP;
        this.f12516a = list.size() < 25 ? b.C(list, map, comparator) : a8.j.n(list, map, comparator);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f12516a.equals(((f) obj).f12516a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12516a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this.f12516a.iterator(), 0);
    }

    public f(c cVar) {
        this.f12516a = cVar;
    }
}
