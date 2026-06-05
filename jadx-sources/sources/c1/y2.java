package c1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y2 extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2903a;

    public /* synthetic */ y2(int i10) {
        this.f2903a = i10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f2903a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                if (!(view instanceof f2.l) || (outline2 = ((f2.l) view).f6615e) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            case 2:
                fj.l.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                m6.a.q(view);
                throw null;
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 4:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 5:
                fj.l.f(view, "view");
                fj.l.f(outline, "outline");
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            default:
                fj.l.f(view, "view");
                fj.l.f(outline, "outline");
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                return;
        }
    }
}
