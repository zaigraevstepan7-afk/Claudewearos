package oe;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d4.g;
import java.lang.reflect.Field;
import t4.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a extends f4.a {

    /* renamed from: a, reason: collision with root package name */
    public g f12447a;

    @Override // f4.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        r(coordinatorLayout, view, i10);
        if (this.f12447a == null) {
            this.f12447a = new g(view);
        }
        g gVar = this.f12447a;
        View view2 = (View) gVar.f4872c;
        gVar.f4870a = view2.getTop();
        gVar.f4871b = view2.getLeft();
        g gVar2 = this.f12447a;
        View view3 = (View) gVar2.f4872c;
        int top = 0 - (view3.getTop() - gVar2.f4870a);
        Field field = l0.f15744a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - gVar2.f4871b));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.q(view, i10);
    }
}
