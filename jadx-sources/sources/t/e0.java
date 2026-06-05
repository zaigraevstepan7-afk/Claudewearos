package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final v f15152a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15153b;

    public e0(v vVar, long j) {
        r0 r0Var = r0.f15268a;
        this.f15152a = vVar;
        this.f15153b = j;
        if (vVar instanceof o1) {
            o1 o1Var = (o1) vVar;
            if (o1Var.f15244a != 0 || o1Var.f15245b != 0) {
                return;
            }
        } else if (vVar instanceof s0) {
            if (((s0) vVar).f15279a != 0) {
                return;
            }
        } else if (!(vVar instanceof k0) || ((k0) vVar).f15216a.f15198a != 0) {
            return;
        }
        throw new IllegalArgumentException("Animation to be infinitely repeated cannot have a 0-duration");
    }

    @Override // t.j
    public final q1 a(p1 p1Var) {
        s1 s1VarA = this.f15152a.a(p1Var);
        r0 r0Var = r0.f15268a;
        return new v1(s1VarA, this.f15153b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (!e0Var.f15152a.equals(this.f15152a)) {
            return false;
        }
        r0 r0Var = r0.f15268a;
        return e0Var.f15153b == this.f15153b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15153b) + ((r0.f15268a.hashCode() + (this.f15152a.hashCode() * 31)) * 31);
    }
}
