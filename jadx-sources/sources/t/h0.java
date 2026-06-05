package t;

import b0.g2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final g1.e f15174a = new g1.e(new f0[16]);

    /* renamed from: b, reason: collision with root package name */
    public final f1.j1 f15175b = f1.s.A(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public long f15176c = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final f1.j1 f15177d = f1.s.A(Boolean.TRUE);

    public final void a(int i10, f1.i0 i0Var) {
        i0Var.c0(-318043801);
        int i11 = (i0Var.h(this) ? 4 : 2) | i10;
        if (i0Var.T(i11 & 1, (i11 & 3) != 2)) {
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                objQ = f1.s.A(null);
                i0Var.l0(objQ);
            }
            f1.a1 a1Var = (f1.a1) objQ;
            if (((Boolean) this.f15177d.getValue()).booleanValue() || ((Boolean) this.f15175b.getValue()).booleanValue()) {
                i0Var.b0(-144841960);
                boolean zH = i0Var.h(this);
                Object objQ2 = i0Var.Q();
                if (zH || objQ2 == fVar) {
                    objQ2 = new ab.q(a1Var, this, (ti.c) null);
                    i0Var.l0(objQ2);
                }
                f1.s.f((ej.e) objQ2, i0Var, this);
                i0Var.p(false);
            } else {
                i0Var.b0(-143455237);
                i0Var.p(false);
            }
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new g2(i10, 28, this);
        }
    }
}
