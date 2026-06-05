package c;

import android.os.Build;
import android.view.View;
import android.view.Window;
import t4.n1;
import t4.o1;
import t4.p1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class s extends r {
    @Override // c.q
    public void b(e0 e0Var, e0 e0Var2, Window window, View view, boolean z2, boolean z10) {
        fj.l.f(e0Var, "statusBarStyle");
        fj.l.f(e0Var2, "navigationBarStyle");
        fj.l.f(window, "window");
        fj.l.f(view, "view");
        wd.a.N(window, false);
        window.setStatusBarColor(e0Var.a(z2));
        window.setNavigationBarColor(e0Var2.a(z10));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(e0Var2.f1815c == 0);
        p7.k kVar = new p7.k(view);
        int i10 = Build.VERSION.SDK_INT;
        yd.f p1Var = i10 >= 35 ? new p1(window, kVar) : i10 >= 30 ? new o1(window, kVar) : new n1(window, kVar);
        p1Var.f0(!z2);
        p1Var.e0(!z10);
    }
}
