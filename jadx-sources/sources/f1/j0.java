package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 implements u1.e {

    /* renamed from: a, reason: collision with root package name */
    public final o f6351a;

    public j0(o oVar) {
        this.f6351a = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return fj.l.b(this.f6351a, ((j0) obj).f6351a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6351a.hashCode() * 31;
    }
}
