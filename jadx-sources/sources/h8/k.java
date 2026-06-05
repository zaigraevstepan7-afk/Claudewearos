package h8;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7704a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7705b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f7704a = i10;
        this.f7705b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f7704a) {
            case 0:
                ((j) this.f7705b).b(canvas);
                break;
            default:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f7705b;
                if (!actionBarContainer.f783z) {
                    Drawable drawable = actionBarContainer.f780d;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    Drawable drawable2 = actionBarContainer.f781e;
                    if (drawable2 != null && actionBarContainer.A) {
                        drawable2.draw(canvas);
                        break;
                    }
                } else {
                    Drawable drawable3 = actionBarContainer.f782f;
                    if (drawable3 != null) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f7704a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.f7704a) {
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f7705b;
                if (!actionBarContainer.f783z) {
                    Drawable drawable = actionBarContainer.f780d;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                        break;
                    }
                } else if (actionBarContainer.f782f != null) {
                    actionBarContainer.f780d.getOutline(outline);
                    break;
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        int i11 = this.f7704a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f7704a;
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
