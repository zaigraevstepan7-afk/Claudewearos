package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1266a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1267b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.j1 f1268c = f1.s.A(l4.b.f9966e);

    /* renamed from: d, reason: collision with root package name */
    public final f1.j1 f1269d = f1.s.A(Boolean.TRUE);

    public a(int i10, String str) {
        this.f1266a = i10;
        this.f1267b = str;
    }

    @Override // b0.d2
    public final int a(s3.c cVar, s3.m mVar) {
        return e().f9969c;
    }

    @Override // b0.d2
    public final int b(s3.c cVar) {
        return e().f9970d;
    }

    @Override // b0.d2
    public final int c(s3.c cVar, s3.m mVar) {
        return e().f9967a;
    }

    @Override // b0.d2
    public final int d(s3.c cVar) {
        return e().f9968b;
    }

    public final l4.b e() {
        return (l4.b) this.f1268c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f1266a == ((a) obj).f1266a;
        }
        return false;
    }

    public final void f(boolean z2) {
        this.f1269d.setValue(Boolean.valueOf(z2));
    }

    public final void g(t4.m1 m1Var, int i10) {
        int i11 = this.f1266a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f1268c.setValue(m1Var.f15751a.g(i11));
            f(m1Var.f15751a.q(i11));
        }
    }

    public final int hashCode() {
        return this.f1266a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1267b);
        sb2.append('(');
        sb2.append(e().f9967a);
        sb2.append(", ");
        sb2.append(e().f9968b);
        sb2.append(", ");
        sb2.append(e().f9969c);
        sb2.append(", ");
        return m6.a.g(sb2, e().f9970d, ')');
    }
}
