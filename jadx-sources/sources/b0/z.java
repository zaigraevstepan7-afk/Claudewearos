package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f1464a = new b0(j.f1361c, v1.b.E);

    public static final b0 a(i iVar, v1.e eVar, f1.i0 i0Var, int i10) {
        if (fj.l.b(iVar, j.f1361c) && eVar.equals(v1.b.E)) {
            i0Var.b0(-1446604504);
            i0Var.p(false);
            return f1464a;
        }
        i0Var.b0(-1446550657);
        boolean z2 = true;
        boolean z10 = (((i10 & 14) ^ 6) > 4 && i0Var.f(iVar)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !i0Var.f(eVar)) && (i10 & 48) != 32) {
            z2 = false;
        }
        boolean z11 = z10 | z2;
        Object objQ = i0Var.Q();
        if (z11 || objQ == f1.m.f6385a) {
            objQ = new b0(iVar, eVar);
            i0Var.l0(objQ);
        }
        b0 b0Var = (b0) objQ;
        i0Var.p(false);
        return b0Var;
    }
}
