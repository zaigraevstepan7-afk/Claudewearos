package j6;

import java.util.List;
import qi.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f8705a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8706b;

    public e(int i10, List list) {
        this.f8705a = list;
        this.f8706b = i10;
        if (list.isEmpty() && i10 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i10 >= 0 && i10 < size) {
                return;
            }
        }
        StringBuilder sbP = gk.b.p(i10, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        sbP.append(yd.f.A(list));
        sbP.append("'.");
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f8706b == eVar.f8706b && fj.l.b(this.f8705a, eVar.f8705a);
    }

    public final int hashCode() {
        return this.f8705a.hashCode() + (this.f8706b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f8706b + ", mergedHistory=" + this.f8705a + ')';
    }

    public e() {
        this(-1, s.f13520a);
    }
}
