package b1;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import c2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends RippleDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1492a;

    /* renamed from: b, reason: collision with root package name */
    public w f1493b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f1494c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1495d;

    public j(boolean z2) {
        super(ColorStateList.valueOf(-16777216), null, z2 ? new ColorDrawable(-1) : null);
        this.f1492a = z2;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f1492a) {
            this.f1495d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f1495d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f1495d;
    }
}
