package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f18291a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18292b;

    public h1(long j, long j4) {
        this.f18291a = j;
        this.f18292b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h1) {
            h1 h1Var = (h1) obj;
            return s3.l.b(this.f18291a, h1Var.f18291a) && this.f18292b == h1Var.f18292b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18292b) + (Long.hashCode(this.f18291a) * 31);
    }
}
