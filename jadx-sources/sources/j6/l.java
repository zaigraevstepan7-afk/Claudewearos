package j6;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8729b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f8728a = i10;
        this.f8729b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f8728a) {
            case 0:
                ((k) this.f8729b).a();
                break;
            case 1:
                ((Runnable) this.f8729b).run();
                break;
            default:
                ej.a aVar = (ej.a) this.f8729b;
                if (aVar != null) {
                    aVar.a();
                    break;
                }
                break;
        }
    }
}
