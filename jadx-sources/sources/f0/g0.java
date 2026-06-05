package f0;

import java.util.List;
import java.util.Map;
import t2.q1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 implements t2.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f6141a;

    /* renamed from: b, reason: collision with root package name */
    public final q1 f6142b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f6143c;

    /* renamed from: d, reason: collision with root package name */
    public final q.v f6144d;

    public g0(a0 a0Var, q1 q1Var) {
        this.f6141a = a0Var;
        this.f6142b = q1Var;
        this.f6143c = (b0) a0Var.f6102b.a();
        q.l.a();
        this.f6144d = new q.v();
    }

    @Override // t2.s0
    public final t2.r0 B(int i10, int i11, Map map, ej.c cVar) {
        return this.f6142b.B(i10, i11, map, cVar);
    }

    @Override // t2.s0
    public final t2.r0 D0(int i10, int i11, Map map, ej.c cVar, ej.c cVar2) {
        return this.f6142b.D0(i10, i11, map, cVar, cVar2);
    }

    @Override // s3.c
    public final int E0(long j) {
        return this.f6142b.E0(j);
    }

    @Override // s3.c
    public final int I0(float f10) {
        return this.f6142b.I0(f10);
    }

    @Override // s3.c
    public final long J(float f10) {
        return this.f6142b.J(f10);
    }

    @Override // s3.c
    public final long K(long j) {
        return this.f6142b.K(j);
    }

    @Override // s3.c
    public final float N(long j) {
        return this.f6142b.N(j);
    }

    @Override // s3.c
    public final long Q0(long j) {
        return this.f6142b.Q0(j);
    }

    @Override // s3.c
    public final float W0(long j) {
        return this.f6142b.W0(j);
    }

    @Override // s3.c
    public final long Z(float f10) {
        return this.f6142b.Z(f10);
    }

    @Override // s3.c
    public final float e() {
        return this.f6142b.e();
    }

    public final List f(int i10) {
        q.v vVar = this.f6144d;
        List list = (List) vVar.b(i10);
        if (list != null) {
            return list;
        }
        b0 b0Var = this.f6143c;
        Object objB = b0Var.b(i10);
        List listL = this.f6142b.L(this.f6141a.a(i10, objB, b0Var.c(i10)), objB);
        vVar.i(i10, listL);
        return listL;
    }

    @Override // t2.r
    public final s3.m getLayoutDirection() {
        return this.f6142b.getLayoutDirection();
    }

    @Override // s3.c
    public final float h0(int i10) {
        return this.f6142b.h0(i10);
    }

    @Override // s3.c
    public final float l0(float f10) {
        return this.f6142b.l0(f10);
    }

    @Override // s3.c
    public final float r0() {
        return this.f6142b.r0();
    }

    @Override // t2.r
    public final boolean t0() {
        return this.f6142b.t0();
    }

    @Override // s3.c
    public final float w0(float f10) {
        return this.f6142b.w0(f10);
    }
}
