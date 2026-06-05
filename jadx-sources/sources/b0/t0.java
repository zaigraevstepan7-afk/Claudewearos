package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final d2 f1429a;

    /* renamed from: b, reason: collision with root package name */
    public final s3.c f1430b;

    public t0(d2 d2Var, s3.c cVar) {
        this.f1429a = d2Var;
        this.f1430b = cVar;
    }

    @Override // b0.i1
    public final float a() {
        d2 d2Var = this.f1429a;
        s3.c cVar = this.f1430b;
        return cVar.h0(d2Var.b(cVar));
    }

    @Override // b0.i1
    public final float b(s3.m mVar) {
        d2 d2Var = this.f1429a;
        s3.c cVar = this.f1430b;
        return cVar.h0(d2Var.c(cVar, mVar));
    }

    @Override // b0.i1
    public final float c(s3.m mVar) {
        d2 d2Var = this.f1429a;
        s3.c cVar = this.f1430b;
        return cVar.h0(d2Var.a(cVar, mVar));
    }

    @Override // b0.i1
    public final float d() {
        d2 d2Var = this.f1429a;
        s3.c cVar = this.f1430b;
        return cVar.h0(d2Var.d(cVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return fj.l.b(this.f1429a, t0Var.f1429a) && fj.l.b(this.f1430b, t0Var.f1430b);
    }

    public final int hashCode() {
        return this.f1430b.hashCode() + (this.f1429a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f1429a + ", density=" + this.f1430b + ')';
    }
}
