package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 implements t2.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final p1 f9193b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9194c;

    /* renamed from: d, reason: collision with root package name */
    public final l3.a0 f9195d;

    /* renamed from: e, reason: collision with root package name */
    public final ej.a f9196e;

    public o0(p1 p1Var, int i10, l3.a0 a0Var, ej.a aVar) {
        this.f9193b = p1Var;
        this.f9194c = i10;
        this.f9195d = a0Var;
        this.f9196e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return fj.l.b(this.f9193b, o0Var.f9193b) && this.f9194c == o0Var.f9194c && fj.l.b(this.f9195d, o0Var.f9195d) && fj.l.b(this.f9196e, o0Var.f9196e);
    }

    public final int hashCode() {
        return this.f9196e.hashCode() + ((this.f9195d.hashCode() + gk.b.g(this.f9194c, this.f9193b.hashCode() * 31, 31)) * 31);
    }

    @Override // t2.b0
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        long j4;
        if (p0Var.V(s3.a.g(j)) < s3.a.h(j)) {
            j4 = j;
        } else {
            j4 = j;
            j = s3.a.a(j4, 0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, 0, 13);
        }
        t2.f1 f1VarY = p0Var.Y(j);
        int iMin = Math.min(f1VarY.f15550a, s3.a.h(j4));
        return s0Var.B(iMin, f1VarY.f15551b, qi.t.f13521a, new b0.p1(this, s0Var, f1VarY, iMin, 3));
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f9193b + ", cursorOffset=" + this.f9194c + ", transformedText=" + this.f9195d + ", textLayoutResultProvider=" + this.f9196e + ')';
    }
}
