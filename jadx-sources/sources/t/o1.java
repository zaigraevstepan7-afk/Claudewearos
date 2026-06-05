package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o1 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f15244a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15245b;

    /* renamed from: c, reason: collision with root package name */
    public final w f15246c;

    public o1(int i10, int i11, w wVar) {
        this.f15244a = i10;
        this.f15245b = i11;
        this.f15246c = wVar;
    }

    @Override // t.j
    public final q1 a(p1 p1Var) {
        return new d4.g(this.f15244a, this.f15245b, this.f15246c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (o1Var.f15244a == this.f15244a && o1Var.f15245b == this.f15245b && fj.l.b(o1Var.f15246c, this.f15246c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15246c.hashCode() + (this.f15244a * 31)) * 31) + this.f15245b;
    }

    @Override // t.v, t.j
    public final s1 a(p1 p1Var) {
        return new d4.g(this.f15244a, this.f15245b, this.f15246c);
    }
}
