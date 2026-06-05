package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final h1 f2177a = new h1();

    public final void a(wh.s sVar, f1.i0 i0Var, int i10) {
        f1.i0 i0Var2;
        i0Var.c0(1565826668);
        int i11 = (i0Var.f(sVar) ? 4 : 2) | i10;
        if (i0Var.T(i11 & 1, (i11 & 3) != 2)) {
            i0Var2 = i0Var;
            u0.c.a((ej.a) sVar.f19379a, (w3.u) sVar.f19381c, p1.j.d(1163527043, new g0(sVar, 1), i0Var), i0Var2, 384, 0);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ab.g(this, i10, 3, sVar);
        }
    }
}
