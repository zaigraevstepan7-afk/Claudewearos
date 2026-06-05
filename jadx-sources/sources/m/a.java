package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f11047b;

    public /* synthetic */ a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f11046a = i10;
        this.f11047b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11046a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f11047b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.M = actionBarOverlayLayout.f793c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11047b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.f793c.animate().translationY(-actionBarOverlayLayout2.f793c.getHeight()).setListener(actionBarOverlayLayout2.N);
                break;
        }
    }
}
