package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y1 implements t2.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final p1 f9339b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9340c;

    /* renamed from: d, reason: collision with root package name */
    public final l3.a0 f9341d;

    /* renamed from: e, reason: collision with root package name */
    public final ej.a f9342e;

    public y1(p1 p1Var, int i10, l3.a0 a0Var, ej.a aVar) {
        this.f9339b = p1Var;
        this.f9340c = i10;
        this.f9341d = a0Var;
        this.f9342e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return fj.l.b(this.f9339b, y1Var.f9339b) && this.f9340c == y1Var.f9340c && fj.l.b(this.f9341d, y1Var.f9341d) && fj.l.b(this.f9342e, y1Var.f9342e);
    }

    public final int hashCode() {
        return this.f9342e.hashCode() + ((this.f9341d.hashCode() + gk.b.g(this.f9340c, this.f9339b.hashCode() * 31, 31)) * 31);
    }

    @Override // t2.b0
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        t2.f1 f1VarY = p0Var.Y(s3.a.a(j, 0, 0, 0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 7));
        int iMin = Math.min(f1VarY.f15551b, s3.a.g(j));
        return s0Var.B(f1VarY.f15550a, iMin, qi.t.f13521a, new f1.s1(this, f1VarY, iMin));
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f9339b + ", cursorOffset=" + this.f9340c + ", transformedText=" + this.f9341d + ", textLayoutResultProvider=" + this.f9342e + ')';
    }
}
