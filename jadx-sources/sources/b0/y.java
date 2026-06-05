package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y implements v {

    /* renamed from: a, reason: collision with root package name */
    public final s3.c f1459a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1460b;

    public y(t2.q1 q1Var, long j) {
        this.f1459a = q1Var;
        this.f1460b = j;
    }

    @Override // b0.v
    public final v1.o a() {
        return new n(v1.b.f17551e, true);
    }

    public final float b() {
        long j = this.f1460b;
        if (!s3.a.c(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f1459a.h0(s3.a.g(j));
    }

    public final float c() {
        long j = this.f1460b;
        if (!s3.a.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f1459a.h0(s3.a.h(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return fj.l.b(this.f1459a, yVar.f1459a) && s3.a.b(this.f1460b, yVar.f1460b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1460b) + (this.f1459a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f1459a + ", constraints=" + ((Object) s3.a.l(this.f1460b)) + ')';
    }
}
