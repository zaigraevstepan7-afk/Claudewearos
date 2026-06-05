package h4;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import f0.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f7629b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f7630c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7631d;

    @Override // f0.i0
    public final void c(a8.j jVar) {
        Bitmap bitmap;
        Notification.Builder builder = (Notification.Builder) jVar.f216b;
        Context context = (Context) jVar.f215a;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.f7629b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                h.a(bigContentTitle, iconCompat.e(context));
            } else if (iconCompat.c() == 1) {
                IconCompat iconCompat2 = this.f7629b;
                int i10 = iconCompat2.f870a;
                if (i10 == -1) {
                    Object obj = iconCompat2.f871b;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i10 == 1) {
                    bitmap = (Bitmap) iconCompat2.f871b;
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    Bitmap bitmap2 = (Bitmap) iconCompat2.f871b;
                    int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(3);
                    float f10 = iMin;
                    float f11 = 0.5f * f10;
                    float f12 = 0.9166667f * f11;
                    float f13 = 0.010416667f * f10;
                    paint.setColor(0);
                    paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
                    canvas.drawCircle(f11, f11, f12, paint);
                    paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
                    canvas.drawCircle(f11, f11, f12, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f11, f11, f12, paint);
                    canvas.setBitmap(null);
                    bitmap = bitmapCreateBitmap;
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.f7631d) {
            IconCompat iconCompat3 = this.f7630c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                g.a(bigContentTitle, iconCompat3.e(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            h.c(bigContentTitle, false);
            h.b(bigContentTitle, null);
        }
    }

    @Override // f0.i0
    public final String h() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
