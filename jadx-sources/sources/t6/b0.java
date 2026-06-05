package t6;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c1.u1;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public d8.e f15832a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f15833b;

    /* renamed from: c, reason: collision with root package name */
    public long f15834c;

    /* renamed from: d, reason: collision with root package name */
    public long f15835d;

    /* renamed from: e, reason: collision with root package name */
    public long f15836e;

    /* renamed from: f, reason: collision with root package name */
    public long f15837f;

    public static void b(t0 t0Var) {
        RecyclerView recyclerView;
        int i10 = t0Var.j;
        if (t0Var.f() || (i10 & 4) != 0 || (recyclerView = t0Var.f16062r) == null) {
            return;
        }
        recyclerView.E(t0Var);
    }

    public abstract boolean a(t0 t0Var, t0 t0Var2, u1 u1Var, u1 u1Var2);

    public final void c(t0 t0Var) {
        d8.e eVar = this.f15832a;
        if (eVar != null) {
            RecyclerView recyclerView = (RecyclerView) eVar.f5001a;
            boolean z2 = true;
            t0Var.n(true);
            View view = t0Var.f16046a;
            if (t0Var.f16053h != null && t0Var.f16054i == null) {
                t0Var.f16053h = null;
            }
            t0Var.f16054i = null;
            if ((t0Var.j & 16) != 0) {
                return;
            }
            k0 k0Var = recyclerView.f1175b;
            recyclerView.a0();
            p1.l lVar = recyclerView.f1181e;
            mc.e eVar2 = (mc.e) lVar.f12661c;
            p7.k kVar = (p7.k) lVar.f12660b;
            int iIndexOfChild = ((RecyclerView) kVar.f12813b).indexOfChild(view);
            if (iIndexOfChild == -1) {
                lVar.H(view);
            } else if (eVar2.d(iIndexOfChild)) {
                eVar2.h(iIndexOfChild);
                lVar.H(view);
                kVar.l(iIndexOfChild);
            } else {
                z2 = false;
            }
            if (z2) {
                t0 t0VarH = RecyclerView.H(view);
                k0Var.k(t0VarH);
                k0Var.h(t0VarH);
            }
            recyclerView.b0(!z2);
            if (z2 || !t0Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(t0 t0Var);

    public abstract void e();

    public abstract boolean f();
}
