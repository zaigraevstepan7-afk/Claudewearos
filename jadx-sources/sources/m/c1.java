package m;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c1 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f11074a;

    public c1(f1 f1Var) {
        this.f11074a = f1Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        f1 f1Var = this.f11074a;
        if (f1Var.O.isShowing()) {
            f1Var.e();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f11074a.dismiss();
    }
}
