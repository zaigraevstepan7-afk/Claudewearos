package s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final t.z f14685a;

    public u0(t.z zVar) {
        this.f14685a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            return Float.compare(0.0f, 0.0f) == 0 && fj.l.b(this.f14685a, ((u0) obj).f14685a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14685a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f14685a + ')';
    }
}
