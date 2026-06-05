package d;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.r0;
import c.m;
import w2.a1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f4330a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(m mVar, p1.e eVar) {
        View childAt = ((ViewGroup) mVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        a1 a1Var = childAt instanceof a1 ? (a1) childAt : null;
        if (a1Var != null) {
            a1Var.setParentCompositionContext(null);
            a1Var.setContent(eVar);
            return;
        }
        a1 a1Var2 = new a1(mVar);
        a1Var2.setParentCompositionContext(null);
        a1Var2.setContent(eVar);
        View decorView = mVar.getWindow().getDecorView();
        if (r0.e(decorView) == null) {
            r0.i(decorView, mVar);
        }
        if (r0.f(decorView) == null) {
            r0.j(decorView, mVar);
        }
        if (uk.c.C(decorView) == null) {
            uk.c.P(decorView, mVar);
        }
        mVar.setContentView(a1Var2, f4330a);
    }
}
