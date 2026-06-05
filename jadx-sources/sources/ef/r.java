package ef;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class r extends v {

    /* renamed from: c, reason: collision with root package name */
    public final t f6044c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6045d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6046e;

    public r(t tVar, float f10, float f11) {
        this.f6044c = tVar;
        this.f6045d = f10;
        this.f6046e = f11;
    }

    @Override // ef.v
    public final void a(Matrix matrix, df.a aVar, int i10, Canvas canvas) {
        t tVar = this.f6044c;
        float f10 = tVar.f6055c;
        float f11 = this.f6046e;
        float f12 = tVar.f6054b;
        float f13 = this.f6045d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
        Matrix matrix2 = this.f6058a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int i11 = aVar.f5119f;
        int[] iArr = df.a.f5111i;
        iArr[0] = i11;
        iArr[1] = aVar.f5118e;
        iArr[2] = aVar.f5117d;
        Paint paint = aVar.f5116c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, df.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        t tVar = this.f6044c;
        return (float) Math.toDegrees(Math.atan((tVar.f6055c - this.f6046e) / (tVar.f6054b - this.f6045d)));
    }
}
