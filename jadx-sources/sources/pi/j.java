package pi;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f13002a;

    public j(Throwable th2) {
        fj.l.f(th2, "exception");
        this.f13002a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return fj.l.b(this.f13002a, ((j) obj).f13002a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13002a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13002a + ')';
    }
}
