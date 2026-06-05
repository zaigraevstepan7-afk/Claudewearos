package g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m implements f0.s {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f6933a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6934b;

    public m(h0 h0Var, int i10) {
        this.f6933a = h0Var;
        this.f6934b = i10;
    }

    @Override // f0.s
    public final int a() {
        return this.f6933a.l();
    }

    @Override // f0.s
    public final int b() {
        return Math.min(r0.l() - 1, ((i) qi.l.F0(this.f6933a.k().f6994a)).f6915a + this.f6934b);
    }

    @Override // f0.s
    public final int c() {
        int i10;
        h0 h0Var = this.f6933a;
        if (h0Var.k().f6994a.size() == 0) {
            return 0;
        }
        int iD = uk.c.D(h0Var.k());
        int i11 = h0Var.k().f6995b + h0Var.k().f6996c;
        if (i11 != 0 && (i10 = iD / i11) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override // f0.s
    public final boolean d() {
        return !this.f6933a.k().f6994a.isEmpty();
    }

    @Override // f0.s
    public final int e() {
        return Math.max(0, this.f6933a.f6894e - this.f6934b);
    }
}
