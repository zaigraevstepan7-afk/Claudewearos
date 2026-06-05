package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 implements w {

    /* renamed from: a, reason: collision with root package name */
    public final v2.o0 f15613a;

    public o0(v2.o0 o0Var) {
        this.f15613a = o0Var;
    }

    @Override // t2.w
    public final long C(w wVar, long j) {
        boolean z2 = wVar instanceof o0;
        v2.o0 o0Var = this.f15613a;
        if (!z2) {
            v2.o0 o0VarJ = z.j(o0Var);
            v2.i1 i1Var = o0VarJ.H;
            long jC = C(o0VarJ.K, j);
            long j4 = o0VarJ.I;
            long jE = b2.b.e(jC, (4294967295L & Float.floatToRawIntBits((int) (j4 & 4294967295L))) | (Float.floatToRawIntBits((int) (j4 >> 32)) << 32));
            if (!i1Var.w1().G) {
                s2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            i1Var.F1();
            v2.i1 i1Var2 = i1Var.J;
            if (i1Var2 != null) {
                i1Var = i1Var2;
            }
            return b2.b.f(jE, i1Var.C(wVar, 0L));
        }
        v2.o0 o0Var2 = ((o0) wVar).f15613a;
        v2.i1 i1Var3 = o0Var2.H;
        i1Var3.F1();
        v2.o0 o0VarU1 = o0Var.H.s1(i1Var3).u1();
        if (o0VarU1 != null) {
            long jB = s3.j.b(s3.j.c(o0Var2.o1(o0VarU1, false), yd.f.d0(j)), o0Var.o1(o0VarU1, false));
            return (Float.floatToRawIntBits((int) (jB >> 32)) << 32) | (Float.floatToRawIntBits((int) (jB & 4294967295L)) & 4294967295L);
        }
        v2.o0 o0VarJ2 = z.j(o0Var2);
        long jC2 = s3.j.c(s3.j.c(o0Var2.o1(o0VarJ2, false), o0VarJ2.I), yd.f.d0(j));
        v2.o0 o0VarJ3 = z.j(o0Var);
        long jB2 = s3.j.b(jC2, s3.j.c(o0Var.o1(o0VarJ3, false), o0VarJ3.I));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits((int) (jB2 & 4294967295L)) & 4294967295L;
        v2.i1 i1Var4 = o0VarJ3.H.J;
        fj.l.c(i1Var4);
        v2.i1 i1Var5 = o0VarJ2.H.J;
        fj.l.c(i1Var5);
        return i1Var4.C(i1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // t2.w
    public final boolean E() {
        return this.f15613a.H.w1().G;
    }

    @Override // t2.w
    public final void G(float[] fArr) {
        this.f15613a.H.G(fArr);
    }

    @Override // t2.w
    public final long I() {
        v2.o0 o0Var = this.f15613a;
        return (o0Var.f15550a << 32) | (o0Var.f15551b & 4294967295L);
    }

    @Override // t2.w
    public final long X(long j) {
        return this.f15613a.H.X(b2.b.f(0L, a()));
    }

    public final long a() {
        v2.o0 o0Var = this.f15613a;
        v2.o0 o0VarJ = z.j(o0Var);
        return b2.b.e(C(o0VarJ.K, 0L), o0Var.H.C(o0VarJ.H, 0L));
    }

    @Override // t2.w
    public final long a0(long j) {
        return b2.b.f(this.f15613a.H.a0(j), a());
    }

    @Override // t2.w
    public final w d0() {
        v2.o0 o0VarU1;
        if (!E()) {
            s2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        v2.i1 i1Var = this.f15613a.H.H.Y.f17584d.J;
        if (i1Var == null || (o0VarU1 = i1Var.u1()) == null) {
            return null;
        }
        return o0VarU1.K;
    }

    @Override // t2.w
    public final long i0(w wVar, long j) {
        return C(wVar, j);
    }

    @Override // t2.w
    public final long o0(long j) {
        return b2.b.f(this.f15613a.H.o0(j), a());
    }

    @Override // t2.w
    public final void p0(w wVar, float[] fArr) {
        this.f15613a.H.p0(wVar, fArr);
    }

    @Override // t2.w
    public final long q0(long j) {
        return this.f15613a.H.q0(b2.b.f(j, a()));
    }

    @Override // t2.w
    public final long x(long j) {
        return this.f15613a.H.x(b2.b.f(j, a()));
    }

    @Override // t2.w
    public final b2.c z(w wVar, boolean z2) {
        return this.f15613a.H.z(wVar, z2);
    }
}
