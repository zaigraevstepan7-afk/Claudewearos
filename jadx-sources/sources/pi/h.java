package pi;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13000a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13001b;

    public h(Object obj, Object obj2) {
        this.f13000a = obj;
        this.f13001b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return fj.l.b(this.f13000a, hVar.f13000a) && fj.l.b(this.f13001b, hVar.f13001b);
    }

    public final int hashCode() {
        Object obj = this.f13000a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f13001b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f13000a + ", " + this.f13001b + ')';
    }
}
