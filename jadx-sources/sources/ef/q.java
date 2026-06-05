package ef;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class q extends v {

    /* renamed from: c, reason: collision with root package name */
    public final s f6043c;

    public q(s sVar) {
        this.f6043c = sVar;
    }

    @Override // ef.v
    public final void a(Matrix matrix, df.a aVar, int i10, Canvas canvas) {
        float f10;
        s sVar = this.f6043c;
        float f11 = sVar.f6052f;
        float f12 = sVar.f6053g;
        RectF rectF = new RectF(sVar.f6048b, sVar.f6049c, sVar.f6050d, sVar.f6051e);
        Paint paint = aVar.f5115b;
        boolean z2 = f12 < 0.0f;
        Path path = aVar.f5120g;
        int[] iArr = df.a.f5112k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = aVar.f5119f;
            iArr[2] = aVar.f5118e;
            iArr[3] = aVar.f5117d;
            f10 = 0.0f;
        } else {
            path.rewind();
            f10 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f11, f12);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            iArr[0] = 0;
            iArr[1] = aVar.f5117d;
            iArr[2] = aVar.f5118e;
            iArr[3] = aVar.f5119f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f10) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = df.a.f5113l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f5121h);
        }
        canvas.drawArc(rectF, f11, f12, true, paint);
        canvas.restore();
    }
}
