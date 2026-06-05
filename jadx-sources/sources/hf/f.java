package hf;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f extends ef.g {

    /* renamed from: r, reason: collision with root package name */
    public final RectF f7910r;

    public f(ef.m mVar, RectF rectF) {
        super(mVar);
        this.f7910r = rectF;
    }

    @Override // ef.g, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.Z = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f7910r = fVar.f7910r;
    }
}
