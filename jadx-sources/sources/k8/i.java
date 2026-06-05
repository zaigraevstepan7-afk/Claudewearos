package k8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h8.j f9476a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9477b;

    public i(h8.j jVar, boolean z2) {
        this.f9476a = jVar;
        this.f9477b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return fj.l.b(this.f9476a, iVar.f9476a) && this.f9477b == iVar.f9477b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9477b) + (this.f9476a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.f9476a + ", isSampled=" + this.f9477b + ')';
    }
}
