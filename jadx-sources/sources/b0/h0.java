package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final d2 f1347a;

    /* renamed from: b, reason: collision with root package name */
    public final d2 f1348b;

    public h0(d2 d2Var, d2 d2Var2) {
        this.f1347a = d2Var;
        this.f1348b = d2Var2;
    }

    @Override // b0.d2
    public final int a(s3.c cVar, s3.m mVar) {
        int iA = this.f1347a.a(cVar, mVar) - this.f1348b.a(cVar, mVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // b0.d2
    public final int b(s3.c cVar) {
        int iB = this.f1347a.b(cVar) - this.f1348b.b(cVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // b0.d2
    public final int c(s3.c cVar, s3.m mVar) {
        int iC = this.f1347a.c(cVar, mVar) - this.f1348b.c(cVar, mVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // b0.d2
    public final int d(s3.c cVar) {
        int iD = this.f1347a.d(cVar) - this.f1348b.d(cVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return fj.l.b(h0Var.f1347a, this.f1347a) && fj.l.b(h0Var.f1348b, this.f1348b);
    }

    public final int hashCode() {
        return this.f1348b.hashCode() + (this.f1347a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f1347a + " - " + this.f1348b + ')';
    }
}
