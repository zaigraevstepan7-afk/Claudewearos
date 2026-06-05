package h8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f7686a;

    public a(Bitmap bitmap) {
        this.f7686a = bitmap;
    }

    @Override // h8.j
    public final boolean a() {
        return true;
    }

    @Override // h8.j
    public final void b(Canvas canvas) {
        canvas.drawBitmap(this.f7686a, 0.0f, 0.0f, (Paint) null);
    }

    @Override // h8.j
    public final long c() {
        int allocationByteCount;
        Bitmap bitmap = this.f7686a;
        if (!bitmap.isRecycled()) {
            try {
                allocationByteCount = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                allocationByteCount = (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4) * height;
            }
            return allocationByteCount;
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && fj.l.b(this.f7686a, ((a) obj).f7686a);
    }

    @Override // h8.j
    public final int getHeight() {
        return this.f7686a.getHeight();
    }

    @Override // h8.j
    public final int getWidth() {
        return this.f7686a.getWidth();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f7686a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.f7686a + ", shareable=true)";
    }
}
