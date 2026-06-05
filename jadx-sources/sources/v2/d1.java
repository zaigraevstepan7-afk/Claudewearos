package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d1 implements e1 {
    public static final int g(int i10, long j) {
        int i11 = c2.f17594b;
        return ((int) (j >> (i10 * 15))) & 32767;
    }

    public static long h(int i10, int i11, int i12, int i13) {
        return ((i11 & 32767) << 15) | (i10 & 32767) | ((i12 & 32767) << 30) | ((i13 & 32767) << 45) | Long.MIN_VALUE;
    }

    @Override // v2.e1
    public int a() {
        return 8;
    }

    @Override // v2.e1
    public boolean b(q qVar, f0 f0Var) {
        return false;
    }

    @Override // v2.e1
    public boolean c(f0 f0Var) {
        d3.n nVarW = f0Var.w();
        boolean z2 = false;
        if (nVarW != null && nVarW.f4761d) {
            z2 = true;
        }
        return !z2;
    }

    @Override // v2.e1
    public boolean d(v1.n nVar) {
        return d3.u.h(d3.u.a(n.y(nVar), false));
    }

    @Override // v2.e1
    public boolean e(v1.n nVar) {
        return false;
    }

    @Override // v2.e1
    public void f(f0 f0Var, long j, q qVar, int i10, boolean z2) {
        b1 b1Var = f0Var.Y;
        i1 i1Var = b1Var.f17584d;
        c2.t0 t0Var = i1.f17679f0;
        b1Var.f17584d.B1(i1.f17683j0, i1Var.t1(j), qVar, 1, z2);
    }
}
