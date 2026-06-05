package com.anonlab.voidlauncher.feature.home.presentation.components.icons;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.os.Build;
import android.util.AttributeSet;
import b3.e;
import fj.l;
import lb.b;
import m.u;
import xa.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class MaskedIconImageView extends u {
    public boolean A;
    public float B;
    public float C;
    public b D;

    /* renamed from: d, reason: collision with root package name */
    public final RuntimeShader f3422d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f3423e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f3424f;

    /* renamed from: z, reason: collision with root package name */
    public final Path f3425z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedIconImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        int i10 = Build.VERSION.SDK_INT;
        this.f3422d = i10 >= 33 ? c.b.f() : null;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.argb(128, 255, 255, 255));
        paint.setStrokeWidth(((float) Math.ceil(getResources().getDisplayMetrics().density * 1.0f)) * 2.0f);
        paint.setMaskFilter(new BlurMaskFilter(getResources().getDisplayMetrics().density * 0.5f, BlurMaskFilter.Blur.NORMAL));
        if (i10 >= 29) {
            paint.setBlendMode(BlendMode.PLUS);
        }
        this.f3423e = paint;
        this.f3424f = new RectF();
        this.f3425z = new Path();
        this.B = 45.0f;
        this.D = b.f10142b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.A || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        RectF rectF = this.f3424f;
        rectF.set(0.0f, 0.0f, getWidth() - 0.0f, getHeight() - 0.0f);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.f3423e;
        if (i10 >= 33) {
            RuntimeShader runtimeShader = this.f3422d;
            if (runtimeShader != null) {
                runtimeShader.setFloatUniform("size", getWidth(), getHeight());
            }
            RuntimeShader runtimeShader2 = this.f3422d;
            if (runtimeShader2 != null) {
                float f10 = this.C;
                runtimeShader2.setFloatUniform("cornerRadii", new float[]{f10, f10, f10, f10});
            }
            RuntimeShader runtimeShader3 = this.f3422d;
            if (runtimeShader3 != null) {
                runtimeShader3.setColorUniform("color", Color.argb(255, 255, 255, 255));
            }
            RuntimeShader runtimeShader4 = this.f3422d;
            if (runtimeShader4 != null) {
                runtimeShader4.setFloatUniform("angle", this.B * 0.017453292f);
            }
            RuntimeShader runtimeShader5 = this.f3422d;
            if (runtimeShader5 != null) {
                runtimeShader5.setFloatUniform("falloff", 2.0f);
            }
            paint.setShader(this.f3422d);
        } else {
            paint.setShader(null);
        }
        int iOrdinal = this.D.ordinal();
        Path path = this.f3425z;
        if (iOrdinal == 0) {
            path.rewind();
            cg.b.z(path, getWidth(), getHeight(), this.C);
            canvas.drawPath(path, paint);
        } else if (iOrdinal == 1) {
            canvas.drawOval(rectF, paint);
        } else if (iOrdinal == 2) {
            path.rewind();
            c.a(path, getWidth(), getHeight());
            canvas.drawPath(path, paint);
        } else {
            if (iOrdinal != 3) {
                throw new e();
            }
            canvas.drawRect(rectF, paint);
        }
        paint.setShader(null);
    }
}
