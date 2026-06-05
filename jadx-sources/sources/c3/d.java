package c3;

import android.os.CancellationSignal;
import g3.m0;
import k0.t0;
import qj.s1;
import v0.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3084b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f3083a = i10;
        this.f3084b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f3083a) {
            case 0:
                ((s1) this.f3084b).e(null);
                break;
            default:
                u0 u0Var = (u0) this.f3084b;
                if (u0Var != null) {
                    t0 t0Var = u0Var.f17489d;
                    if (t0Var != null) {
                        t0Var.e(m0.f7143b);
                    }
                    t0 t0Var2 = u0Var.f17489d;
                    if (t0Var2 != null) {
                        t0Var2.f(m0.f7143b);
                        break;
                    }
                }
                break;
        }
    }
}
