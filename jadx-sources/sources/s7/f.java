package s7;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements e, g {

    /* renamed from: b, reason: collision with root package name */
    public static final f f14776b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final f f14777c = new f();

    @Override // s7.g
    public r7.a a(ContextWrapper contextWrapper, e eVar) {
        l.f(eVar, "densityCompatHelper");
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        l.e(bounds, "getBounds(...)");
        return new r7.a(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // s7.e
    public float c(ContextWrapper contextWrapper) {
        return ((WindowManager) contextWrapper.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
