package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final q.w f15584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f15585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15586c;

    public k0(m0 m0Var, Object obj) {
        this.f15585b = m0Var;
        this.f15586c = obj;
        int[] iArr = q.m.f13105a;
        this.f15584a = new q.w();
    }

    @Override // t2.n1
    public final void a() {
        m0.c(this.f15585b, this.f15586c);
    }

    @Override // t2.n1
    public final int b() {
        v2.f0 f0Var = (v2.f0) this.f15585b.C.g(this.f15586c);
        if (f0Var != null) {
            return ((g1.e) ((g1.b) f0Var.n()).f7016b).f7026c;
        }
        return 0;
    }

    @Override // t2.n1
    public final long c(int i10) {
        v2.f0 f0Var = (v2.f0) this.f15585b.C.g(this.f15586c);
        if (f0Var == null || !f0Var.G()) {
            return 0L;
        }
        int i11 = ((g1.e) ((g1.b) f0Var.n()).f7016b).f7026c;
        if (i10 < 0 || i10 >= i11) {
            s2.a.d("Index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
        if (!this.f15584a.c(i10)) {
            return 0L;
        }
        return (((v2.f0) ((g1.b) f0Var.n()).get(i10)).Z.f17703p.f15550a << 32) | (((v2.f0) ((g1.b) f0Var.n()).get(i10)).Z.f17703p.f15551b & 4294967295L);
    }

    @Override // t2.n1
    public final void d(int i10, long j) {
        m0 m0Var = this.f15585b;
        v2.f0 f0Var = (v2.f0) m0Var.C.g(this.f15586c);
        if (f0Var == null || !f0Var.G()) {
            return;
        }
        int i11 = ((g1.e) ((g1.b) f0Var.n()).f7016b).f7026c;
        if (i10 < 0 || i10 >= i11) {
            s2.a.d("Index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
        if (f0Var.H()) {
            s2.a.a("Pre-measure called on node that is not placed");
        }
        v2.f0 f0Var2 = m0Var.f15600a;
        f0Var2.J = true;
        ((w2.t) v2.i0.a(f0Var)).y((v2.f0) ((g1.b) f0Var.n()).get(i10), j);
        f0Var2.J = false;
        this.f15584a.a(i10);
    }

    @Override // t2.n1
    public final void e(ab.k kVar) {
        v2.b1 b1Var;
        v2.f0 f0Var = (v2.f0) this.f15585b.C.g(this.f15586c);
        v1.n nVar = (f0Var == null || (b1Var = f0Var.Y) == null) ? null : b1Var.f17586f;
        if (nVar == null || !nVar.G) {
            return;
        }
        v2.n.D(nVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", kVar);
    }
}
