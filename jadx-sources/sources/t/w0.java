package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w0 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f15305a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15306b;

    public w0(q1 q1Var, long j) {
        this.f15305a = q1Var;
        this.f15306b = j;
    }

    @Override // t.q1
    public final boolean a() {
        return this.f15305a.a();
    }

    @Override // t.q1
    public final long b(p pVar, p pVar2, p pVar3) {
        return this.f15305a.b(pVar, pVar2, pVar3) + this.f15306b;
    }

    @Override // t.q1
    public final p d(long j, p pVar, p pVar2, p pVar3) {
        long j4 = this.f15306b;
        return j < j4 ? pVar : this.f15305a.d(j - j4, pVar, pVar2, pVar3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return w0Var.f15306b == this.f15306b && fj.l.b(w0Var.f15305a, this.f15305a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f15306b) + (this.f15305a.hashCode() * 31);
    }

    @Override // t.q1
    public final p k(long j, p pVar, p pVar2, p pVar3) {
        long j4 = this.f15306b;
        return j < j4 ? pVar3 : this.f15305a.k(j - j4, pVar, pVar2, pVar3);
    }
}
