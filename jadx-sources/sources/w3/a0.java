package w3;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 extends y {
    @Override // w3.b0
    public final void a(View view, Rect rect) {
        Object systemService = view.getContext().getSystemService("window");
        fj.l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
