package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f1384a = new q1(j.f1359a, v1.b.C);

    public static final q1 a(g gVar, v1.f fVar, f1.i0 i0Var, int i10) {
        if (fj.l.b(gVar, j.f1359a) && fj.l.b(fVar, v1.b.C)) {
            i0Var.b0(-1073830487);
            i0Var.p(false);
            return f1384a;
        }
        i0Var.b0(-1073779616);
        boolean z2 = true;
        boolean z10 = (((i10 & 14) ^ 6) > 4 && i0Var.f(gVar)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !i0Var.f(fVar)) && (i10 & 48) != 32) {
            z2 = false;
        }
        boolean z11 = z10 | z2;
        Object objQ = i0Var.Q();
        if (z11 || objQ == f1.m.f6385a) {
            objQ = new q1(gVar, fVar);
            i0Var.l0(objQ);
        }
        q1 q1Var = (q1) objQ;
        i0Var.p(false);
        return q1Var;
    }
}
