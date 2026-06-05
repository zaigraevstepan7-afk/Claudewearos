package hf;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g extends ef.i {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f7911a0 = 0;
    public f Z;

    @Override // ef.i
    public final void f(Canvas canvas) {
        if (this.Z.f7910r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.Z.f7910r);
        super.f(canvas);
        canvas.restore();
    }

    @Override // ef.i, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.Z = new f(this.Z);
        return this;
    }

    public final void t(float f10, float f11, float f12, float f13) {
        RectF rectF = this.Z.f7910r;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}
