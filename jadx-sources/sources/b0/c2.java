package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c2 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1289a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.j1 f1290b;

    public c2(u0 u0Var, String str) {
        this.f1289a = str;
        this.f1290b = f1.s.A(u0Var);
    }

    @Override // b0.d2
    public final int a(s3.c cVar, s3.m mVar) {
        return e().f1444c;
    }

    @Override // b0.d2
    public final int b(s3.c cVar) {
        return e().f1445d;
    }

    @Override // b0.d2
    public final int c(s3.c cVar, s3.m mVar) {
        return e().f1442a;
    }

    @Override // b0.d2
    public final int d(s3.c cVar) {
        return e().f1443b;
    }

    public final u0 e() {
        return (u0) this.f1290b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            return fj.l.b(e(), ((c2) obj).e());
        }
        return false;
    }

    public final void f(u0 u0Var) {
        this.f1290b.setValue(u0Var);
    }

    public final int hashCode() {
        return this.f1289a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1289a);
        sb2.append("(left=");
        sb2.append(e().f1442a);
        sb2.append(", top=");
        sb2.append(e().f1443b);
        sb2.append(", right=");
        sb2.append(e().f1444c);
        sb2.append(", bottom=");
        return m6.a.g(sb2, e().f1445d, ')');
    }
}
