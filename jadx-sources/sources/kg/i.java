package kg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r f9628a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9629b;

    public i(r rVar, boolean z2) {
        this.f9628a = rVar;
        this.f9629b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f9628a.equals(this.f9628a) && iVar.f9629b == this.f9629b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9628a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f9629b).hashCode();
    }
}
