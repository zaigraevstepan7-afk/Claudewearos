package ha;

import c1.c6;
import f1.i0;
import f1.r2;
import f1.s;
import f1.t1;
import u6.v;
import v.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final r2 f7768a = new r2(new fa.a(18));

    static {
        v.Q(new fa.a(19));
    }

    public static final void a(boolean z2, p1.e eVar, i0 i0Var, int i10) {
        i0Var.c0(-233690153);
        int i11 = i10 | 2;
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                z2 = n.r(i0Var);
            } else {
                i0Var.W();
            }
            i0Var.q();
            s.a(f7768a.a(z2 ? c.f7767b : c.f7766a), eVar, i0Var, 56);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new c6(z2, eVar, i10);
        }
    }
}
