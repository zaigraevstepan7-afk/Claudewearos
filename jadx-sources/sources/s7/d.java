package s7;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements b, g {

    /* renamed from: b, reason: collision with root package name */
    public static final d f14774b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final d f14775c = new d();

    @Override // s7.g
    public r7.a a(ContextWrapper contextWrapper, e eVar) {
        l.f(eVar, "densityCompatHelper");
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f10 = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        l.e(bounds, "getBounds(...)");
        return new r7.a(bounds, f10);
    }

    @Override // s7.b
    public Rect b(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        l.e(bounds, "getBounds(...)");
        return bounds;
    }
}
