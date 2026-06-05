package s;

import f1.q2;
import t.p1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class z0 {
    static {
        t.d.s(0.0f, 0.0f, null, 7);
    }

    public static final q2 a(long j, t.z zVar, String str, f1.i0 i0Var, int i10, int i11) {
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zF = i0Var.f(c2.w.g(j));
        Object objQ = i0Var.Q();
        if (zF || objQ == f1.m.f6385a) {
            p1 p1Var = new p1(c.f14568e, new c2.x0(c2.w.g(j), 14));
            i0Var.l0(p1Var);
            objQ = p1Var;
        }
        return t.e.c(new c2.w(j), (p1) objQ, zVar, null, str2, null, i0Var, ((i10 << 3) & 896) | ((i10 << 6) & 57344), 8);
    }
}
