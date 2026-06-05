package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q7 {

    /* renamed from: a, reason: collision with root package name */
    public final v1.e f2616a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.e f2617b;

    public q7() {
        v1.e eVar = v1.b.E;
        this.f2616a = eVar;
        this.f2617b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        return fj.l.b(this.f2616a, q7Var.f2616a) && fj.l.b(this.f2617b, q7Var.f2617b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2617b.f17555a) + gk.b.f(this.f2616a.f17555a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.f2616a + ", expandedAlignment=" + this.f2617b + ')';
    }
}
