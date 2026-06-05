package q6;

import fj.l;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f13279a;

    public b(List list) {
        l.f(list, "topics");
        this.f13279a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        List list = this.f13279a;
        int size = list.size();
        List list2 = ((b) obj).f13279a;
        if (size != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    public final int hashCode() {
        return Objects.hash(this.f13279a);
    }

    public final String toString() {
        return "Topics=" + this.f13279a;
    }
}
