package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y7 extends v1.n implements v2.w {
    public z.k H;
    public boolean I;
    public t.u0 J;
    public boolean K;
    public t.c L;
    public t.c M;
    public float N;
    public float O;

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        qj.b0.w(e1(), null, new z2(this, null, 1), 3);
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        float fW0 = s0Var.w0(this.K ? e1.h0.f5420n : ((p0Var.l(s3.a.h(j)) != 0 && p0Var.V(s3.a.g(j)) != 0) || this.I) ? f7.f2107a : f7.f2108b);
        t.c cVar = this.M;
        int iFloatValue = (int) (cVar != null ? ((Number) cVar.e()).floatValue() : fW0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            s3.i.a("width and height must be >= 0");
        }
        t2.f1 f1VarY = p0Var.Y(s3.b.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fW02 = s0Var.w0((f7.f2110d - s0Var.l0(fW0)) / 2.0f);
        float fW03 = s0Var.w0((f7.f2109c - f7.f2107a) - f7.f2111e);
        boolean z2 = this.K;
        if (z2 && this.I) {
            fW02 = fW03 - s0Var.w0(e1.h0.f5427u);
        } else if (z2 && !this.I) {
            fW02 = s0Var.w0(e1.h0.f5427u);
        } else if (this.I) {
            fW02 = fW03;
        }
        t.c cVar2 = this.M;
        ti.c cVar3 = null;
        Float f10 = cVar2 != null ? (Float) cVar2.f15111e.getValue() : null;
        if (f10 == null || f10.floatValue() != fW0) {
            qj.b0.w(e1(), null, new x7(this, fW0, cVar3, 0), 3);
        }
        t.c cVar4 = this.L;
        Float f11 = cVar4 != null ? (Float) cVar4.f15111e.getValue() : null;
        if (f11 == null || f11.floatValue() != fW02) {
            qj.b0.w(e1(), null, new x7(this, fW02, cVar3, 1), 3);
        }
        if (Float.isNaN(this.O) && Float.isNaN(this.N)) {
            this.O = fW0;
            this.N = fW02;
        }
        return s0Var.B(iFloatValue, iFloatValue, qi.t.f13521a, new ab.l(f1VarY, this, fW02));
    }
}
