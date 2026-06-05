package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x1 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final d2 f1457a;

    /* renamed from: b, reason: collision with root package name */
    public final d2 f1458b;

    public x1(d2 d2Var, d2 d2Var2) {
        this.f1457a = d2Var;
        this.f1458b = d2Var2;
    }

    @Override // b0.d2
    public final int a(s3.c cVar, s3.m mVar) {
        return Math.max(this.f1457a.a(cVar, mVar), this.f1458b.a(cVar, mVar));
    }

    @Override // b0.d2
    public final int b(s3.c cVar) {
        return Math.max(this.f1457a.b(cVar), this.f1458b.b(cVar));
    }

    @Override // b0.d2
    public final int c(s3.c cVar, s3.m mVar) {
        return Math.max(this.f1457a.c(cVar, mVar), this.f1458b.c(cVar, mVar));
    }

    @Override // b0.d2
    public final int d(s3.c cVar) {
        return Math.max(this.f1457a.d(cVar), this.f1458b.d(cVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return fj.l.b(x1Var.f1457a, this.f1457a) && fj.l.b(x1Var.f1458b, this.f1458b);
    }

    public final int hashCode() {
        return (this.f1458b.hashCode() * 31) + this.f1457a.hashCode();
    }

    public final String toString() {
        return "(" + this.f1457a + " \u222a " + this.f1458b + ')';
    }
}
