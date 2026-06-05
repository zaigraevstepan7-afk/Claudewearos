package f0;

import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends v1.n implements v2.w, v2.j {
    public static final p K = new p();
    public s H;
    public d8.e I;
    public o1 J;

    public final boolean q1(m mVar, int i10) {
        if (i10 == 5 || i10 == 6) {
            if (this.J == o1.f19665b) {
                return false;
            }
        } else if (i10 == 3 || i10 == 4) {
            if (this.J == o1.f19664a) {
                return false;
            }
        } else if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (r1(i10)) {
            if (mVar.f6168b >= this.H.a() - 1) {
                return false;
            }
        } else if (mVar.f6167a <= 0) {
            return false;
        }
        return true;
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        t2.f1 f1VarY = p0Var.Y(j);
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, new b0.l(f1VarY, 7));
    }

    public final boolean r1(int i10) {
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 5) {
            return false;
        }
        if (i10 == 6) {
            return true;
        }
        if (i10 == 3) {
            int iOrdinal = v2.n.y(this).S.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new b3.e();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = v2.n.y(this).S.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new b3.e();
    }
}
