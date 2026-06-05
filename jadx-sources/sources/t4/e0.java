package t4;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class e0 {
    public static m1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        m1 m1VarD = m1.d(null, rootWindowInsets);
        j1 j1Var = m1VarD.f15751a;
        j1Var.t(m1VarD);
        j1Var.d(view.getRootView());
        return m1VarD;
    }
}
