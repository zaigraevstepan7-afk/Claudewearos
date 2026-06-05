package b0;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w1 extends s0 {
    public ej.c K;
    public f2 L;

    @Override // b0.o0, v1.n
    public final void i1() {
        View viewA = v2.n.A(this);
        WeakHashMap weakHashMap = f2.f1311w;
        f2 f2VarF = c.f(viewA);
        f2VarF.a(viewA);
        d2 d2Var = (d2) this.K.invoke(f2VarF);
        if (!fj.l.b(d2Var, this.J)) {
            this.J = d2Var;
            r1();
        }
        this.L = f2VarF;
        super.i1();
    }

    @Override // b0.o0, v1.n
    public final void j1() {
        View viewA = v2.n.A(this);
        f2 f2Var = this.L;
        if (f2Var != null) {
            int i10 = f2Var.f1331u - 1;
            f2Var.f1331u = i10;
            if (i10 == 0) {
                Field field = t4.l0.f15744a;
                t4.d0.i(viewA, null);
                t4.l0.n(viewA, null);
                viewA.removeOnAttachStateChangeListener(f2Var.f1332v);
            }
        }
        super.j1();
    }
}
