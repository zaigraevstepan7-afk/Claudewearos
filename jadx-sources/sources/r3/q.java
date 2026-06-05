package r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f13694c = new q(hj.a.x(0), hj.a.x(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f13695a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13696b;

    public q(long j, long j4) {
        this.f13695a = j;
        this.f13696b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return s3.o.a(this.f13695a, qVar.f13695a) && s3.o.a(this.f13696b, qVar.f13696b);
    }

    public final int hashCode() {
        s3.p[] pVarArr = s3.o.f14756b;
        return Long.hashCode(this.f13696b) + (Long.hashCode(this.f13695a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) s3.o.d(this.f13695a)) + ", restLine=" + ((Object) s3.o.d(this.f13696b)) + ')';
    }
}
