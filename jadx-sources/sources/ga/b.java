package ga;

import android.graphics.Outline;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final float f7265a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f7266b = new Path();

    public b(float f10) {
        this.f7265a = f10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Path path = this.f7266b;
        l.f(view, "view");
        l.f(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        if (width > 0 && height > 0) {
            float f10 = this.f7265a;
            if (f10 > 0.0f) {
                try {
                    cg.b.z(path, width, height, f10);
                    outline.setConvexPath(path);
                    return;
                } catch (Throwable unused) {
                    outline.setRoundRect(0, 0, width, height, this.f7265a);
                    return;
                }
            }
        }
        outline.setRect(0, 0, width, height);
    }
}
