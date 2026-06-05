package v2;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class o0 extends n0 implements t2.p0 {
    public final i1 H;
    public LinkedHashMap J;
    public t2.r0 L;
    public final q.a0 M;
    public long I = 0;
    public final t2.o0 K = new t2.o0(this);

    public o0(i1 i1Var) {
        this.H = i1Var;
        q.a0 a0Var = q.k0.f13101a;
        this.M = new q.a0();
    }

    public static final void l1(o0 o0Var, t2.r0 r0Var) {
        LinkedHashMap linkedHashMap;
        if (r0Var != null) {
            o0Var.M0((r0Var.getHeight() & 4294967295L) | (r0Var.getWidth() << 32));
        } else {
            o0Var.M0(0L);
        }
        if (!fj.l.b(o0Var.L, r0Var) && r0Var != null && ((((linkedHashMap = o0Var.J) != null && !linkedHashMap.isEmpty()) || !r0Var.f().isEmpty()) && !fj.l.b(r0Var.f(), o0Var.J))) {
            r0 r0Var2 = o0Var.H.H.Z.f17704q;
            fj.l.c(r0Var2);
            r0Var2.K.f();
            LinkedHashMap linkedHashMap2 = o0Var.J;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                o0Var.J = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(r0Var.f());
        }
        o0Var.L = r0Var;
    }

    @Override // t2.f1
    public final void G0(long j, float f10, ej.c cVar) {
        n1(j);
        if (this.C) {
            return;
        }
        m1();
    }

    @Override // v2.n0
    public final n0 X0() {
        i1 i1Var = this.H.I;
        if (i1Var != null) {
            return i1Var.u1();
        }
        return null;
    }

    @Override // v2.n0
    public final t2.w Z0() {
        return this.K;
    }

    @Override // v2.n0
    public final boolean b1() {
        return this.L != null;
    }

    @Override // t2.f1, t2.p0
    public final Object c0() {
        return this.H.c0();
    }

    @Override // v2.n0
    public final f0 d1() {
        return this.H.H;
    }

    @Override // s3.c
    public final float e() {
        return this.H.e();
    }

    @Override // v2.n0
    public final t2.r0 e1() {
        t2.r0 r0Var = this.L;
        if (r0Var != null) {
            return r0Var;
        }
        throw t.m1.e("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // v2.n0
    public final n0 f1() {
        i1 i1Var = this.H.J;
        if (i1Var != null) {
            return i1Var.u1();
        }
        return null;
    }

    @Override // v2.n0
    public final long g1() {
        return this.I;
    }

    @Override // t2.r
    public final s3.m getLayoutDirection() {
        return this.H.H.S;
    }

    @Override // v2.n0
    public final void k1() {
        G0(this.I, 0.0f, null);
    }

    public void m1() {
        e1().g();
    }

    public final void n1(long j) {
        if (!s3.j.a(this.I, j)) {
            this.I = j;
            i1 i1Var = this.H;
            r0 r0Var = i1Var.H.Z.f17704q;
            if (r0Var != null) {
                r0Var.U0();
            }
            n0.i1(i1Var);
        }
        if (this.D) {
            return;
        }
        U0(e1());
    }

    public final long o1(o0 o0Var, boolean z2) {
        long jC = 0;
        o0 o0VarU1 = this;
        while (!o0VarU1.equals(o0Var)) {
            if (!o0VarU1.B || !z2) {
                jC = s3.j.c(jC, o0VarU1.I);
            }
            i1 i1Var = o0VarU1.H.J;
            fj.l.c(i1Var);
            o0VarU1 = i1Var.u1();
            fj.l.c(o0VarU1);
        }
        return jC;
    }

    @Override // s3.c
    public final float r0() {
        return this.H.r0();
    }

    @Override // v2.n0, t2.r
    public final boolean t0() {
        return true;
    }
}
