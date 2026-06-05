package c;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f1811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f1812b;

    public /* synthetic */ e(b0 b0Var, m mVar) {
        this.f1811a = b0Var;
        this.f1812b = mVar;
    }

    @Override // androidx.lifecycle.r
    public final void e(androidx.lifecycle.t tVar, androidx.lifecycle.n nVar) {
        if (nVar == androidx.lifecycle.n.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1812b.getOnBackInvokedDispatcher();
            fj.l.e(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            this.f1811a.b(onBackInvokedDispatcher);
        }
    }
}
