package h8;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f7698a;

    public e(Drawable drawable) {
        this.f7698a = drawable;
    }

    @Override // h8.j
    public final boolean a() {
        return false;
    }

    @Override // h8.j
    public final void b(Canvas canvas) {
        this.f7698a.draw(canvas);
    }

    @Override // h8.j
    public final long c() {
        Drawable drawable = this.f7698a;
        long jB = v8.m.b(drawable) * 4 * v8.m.a(drawable);
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && fj.l.b(this.f7698a, ((e) obj).f7698a);
    }

    @Override // h8.j
    public final int getHeight() {
        return v8.m.a(this.f7698a);
    }

    @Override // h8.j
    public final int getWidth() {
        return v8.m.b(this.f7698a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f7698a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.f7698a + ", shareable=false)";
    }
}
