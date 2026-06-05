package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f17283b;

    /* renamed from: c, reason: collision with root package name */
    public final c2.s f17284c;

    /* renamed from: d, reason: collision with root package name */
    public final c2.w0 f17285d;

    public t(float f10, c2.s sVar, c2.w0 w0Var) {
        this.f17283b = f10;
        this.f17284c = sVar;
        this.f17285d = w0Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new s(this.f17283b, this.f17284c, this.f17285d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return s3.f.e(this.f17283b, tVar.f17283b) && fj.l.b(this.f17284c, tVar.f17284c) && fj.l.b(this.f17285d, tVar.f17285d);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        s sVar = (s) nVar;
        float f10 = sVar.K;
        z1.c cVar = sVar.N;
        float f11 = this.f17283b;
        if (!s3.f.e(f10, f11)) {
            sVar.K = f11;
            cVar.q1();
        }
        c2.s sVar2 = sVar.L;
        c2.s sVar3 = this.f17284c;
        if (!fj.l.b(sVar2, sVar3)) {
            sVar.L = sVar3;
            cVar.q1();
        }
        c2.w0 w0Var = sVar.M;
        c2.w0 w0Var2 = this.f17285d;
        if (fj.l.b(w0Var, w0Var2)) {
            return;
        }
        sVar.M = w0Var2;
        cVar.q1();
        v2.n.o(sVar);
    }

    public final int hashCode() {
        return this.f17285d.hashCode() + ((this.f17284c.hashCode() + (Float.hashCode(this.f17283b) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) s3.f.f(this.f17283b)) + ", brush=" + this.f17284c + ", shape=" + this.f17285d + ')';
    }
}
