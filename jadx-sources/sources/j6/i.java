package j6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends hj.a {

    /* renamed from: f, reason: collision with root package name */
    public final b f8723f;

    public i(b bVar) {
        fj.l.f(bVar, "latestEvent");
        this.f8723f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i.class == obj.getClass() && fj.l.b(this.f8723f, ((i) obj).f8723f);
    }

    public final int hashCode() {
        return this.f8723f.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f8723f + ", direction=-1)";
    }
}
