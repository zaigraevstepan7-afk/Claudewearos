package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface w extends j {
    default int C(n0 n0Var, t2.p0 p0Var, int i10) {
        return r(new t2.v(n0Var, n0Var.getLayoutDirection()), new t2.j(p0Var, k1.f17710a, l1.f17722b, 2), s3.b.b(0, i10, 0, 0, 13)).getHeight();
    }

    default int O(n0 n0Var, t2.p0 p0Var, int i10) {
        return r(new t2.v(n0Var, n0Var.getLayoutDirection()), new t2.j(p0Var, k1.f17711b, l1.f17722b, 2), s3.b.b(0, i10, 0, 0, 13)).getHeight();
    }

    default int R0(n0 n0Var, t2.p0 p0Var, int i10) {
        return r(new t2.v(n0Var, n0Var.getLayoutDirection()), new t2.j(p0Var, k1.f17711b, l1.f17721a, 2), s3.b.b(0, 0, 0, i10, 7)).getWidth();
    }

    default int b1(n0 n0Var, t2.p0 p0Var, int i10) {
        return r(new t2.v(n0Var, n0Var.getLayoutDirection()), new t2.j(p0Var, k1.f17710a, l1.f17721a, 2), s3.b.b(0, 0, 0, i10, 7)).getWidth();
    }

    t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j);
}
