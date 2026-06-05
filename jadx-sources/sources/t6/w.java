package t6;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f16070a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f16071b = new w0(this);

    /* renamed from: c, reason: collision with root package name */
    public u f16072c;

    /* renamed from: d, reason: collision with root package name */
    public u f16073d;

    public static int b(View view, r5.g gVar) {
        return ((gVar.e(view) / 2) + gVar.g(view)) - ((gVar.n() / 2) + gVar.m());
    }

    public static View c(e0 e0Var, r5.g gVar) {
        int iV = e0Var.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iN = (gVar.n() / 2) + gVar.m();
        int i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = e0Var.u(i11);
            int iAbs = Math.abs(((gVar.e(viewU) / 2) + gVar.g(viewU)) - iN);
            if (iAbs < i10) {
                view = viewU;
                i10 = iAbs;
            }
        }
        return view;
    }

    public final int[] a(e0 e0Var, View view) {
        int[] iArr = new int[2];
        if (e0Var.d()) {
            iArr[0] = b(view, d(e0Var));
        } else {
            iArr[0] = 0;
        }
        if (e0Var.e()) {
            iArr[1] = b(view, e(e0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final r5.g d(e0 e0Var) {
        u uVar = this.f16073d;
        if (uVar == null || ((e0) uVar.f13731b) != e0Var) {
            this.f16073d = new u(e0Var, 0);
        }
        return this.f16073d;
    }

    public final r5.g e(e0 e0Var) {
        u uVar = this.f16072c;
        if (uVar == null || ((e0) uVar.f13731b) != e0Var) {
            this.f16072c = new u(e0Var, 1);
        }
        return this.f16072c;
    }

    public final void f() {
        e0 layoutManager;
        RecyclerView recyclerView = this.f16070a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewC = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (viewC == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewC);
        int i10 = iArrA[0];
        if (i10 == 0 && iArrA[1] == 0) {
            return;
        }
        this.f16070a.Z(i10, iArrA[1], false);
    }
}
