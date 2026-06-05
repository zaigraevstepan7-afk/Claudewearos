package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1.e f1310a;

    public f0(v1.e eVar) {
        this.f1310a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && fj.l.b(this.f1310a, ((f0) obj).f1310a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1310a.f17555a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f1310a + ')';
    }
}
