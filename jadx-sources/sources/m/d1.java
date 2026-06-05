package m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d1 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f11076a;

    public d1(f1 f1Var) {
        this.f11076a = f1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        f1 f1Var = this.f11076a;
        b1 b1Var = f1Var.G;
        v vVar = f1Var.O;
        if (i10 != 1 || vVar.getInputMethodMode() == 2 || vVar.getContentView() == null) {
            return;
        }
        f1Var.K.removeCallbacks(b1Var);
        b1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
