package pi;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13003a;

    public static final Throwable a(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).f13002a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return fj.l.b(this.f13003a, ((k) obj).f13003a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13003a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f13003a;
        if (obj instanceof j) {
            return ((j) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
