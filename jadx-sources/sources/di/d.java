package di;

import java.util.HashSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f5142a;

    public d(HashSet hashSet) {
        this.f5142a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f5142a.equals(((d) obj).f5142a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5142a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f5142a + "}";
    }
}
