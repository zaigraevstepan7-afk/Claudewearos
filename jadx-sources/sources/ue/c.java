package ue;

import android.graphics.Outline;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17000a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17001b;

    public c() {
        this.f17000a = 1;
        this.f17001b = new Path();
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f17000a) {
            case 0:
                f fVar = ((Chip) this.f17001b).f3835e;
                if (fVar == null) {
                    outline.setAlpha(0.0f);
                    break;
                } else {
                    fVar.getOutline(outline);
                    break;
                }
            default:
                Path path = (Path) this.f17001b;
                l.f(view, "view");
                l.f(outline, "outline");
                int width = view.getWidth();
                int height = view.getHeight();
                if (width <= 0 || height <= 0) {
                    outline.setEmpty();
                    break;
                } else {
                    path.rewind();
                    xa.c.a(path, width, height);
                    try {
                        outline.setConvexPath(path);
                        break;
                    } catch (Throwable unused) {
                        outline.setRect(0, 0, width, height);
                        return;
                    }
                }
        }
    }

    public c(Chip chip) {
        this.f17000a = 0;
        this.f17001b = chip;
    }
}
