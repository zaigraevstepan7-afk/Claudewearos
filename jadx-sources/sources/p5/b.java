package p5;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f12799a;

    public b(String str) {
        this.f12799a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return l.b(this.f12799a, ((b) obj).f12799a);
    }

    public final int hashCode() {
        return this.f12799a.hashCode();
    }

    public final String toString() {
        return this.f12799a;
    }
}
