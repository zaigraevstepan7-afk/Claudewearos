package sa;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends RecyclerView {
    public final int S0;
    public final Paint T0;
    public LinearGradient U0;
    public ValueAnimator V0;
    public float W0;
    public boolean X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, int i10) {
        super(context, null);
        fj.l.f(context, "context");
        this.S0 = i10;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.T0 = paint;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        fj.l.f(canvas, "canvas");
        if (this.W0 <= 0.0f || getWidth() <= 0 || getHeight() <= 0 || (i10 = this.S0) <= 0) {
            super.dispatchDraw(canvas);
            return;
        }
        LinearGradient linearGradient = this.U0;
        Paint paint = this.T0;
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, i10, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.U0 = linearGradient2;
            paint.setShader(linearGradient2);
        }
        int iSaveLayer = canvas.saveLayer(null, null);
        super.dispatchDraw(canvas);
        paint.setAlpha(cg.b.p((int) (this.W0 * 255.0f), 0, 255));
        canvas.drawRect(0.0f, 0.0f, getWidth(), i10, paint);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.U0 = null;
    }
}
