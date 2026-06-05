package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.anonlab.voidlauncher.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int G = 0;
    public final int A;
    public float B;
    public boolean C;
    public double D;
    public int E;
    public int F;

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f3984a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3985b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3986c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3987d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3988e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f3989f;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f3990z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f3984a = valueAnimator;
        this.f3986c = new ArrayList();
        Paint paint = new Paint();
        this.f3989f = paint;
        this.f3990z = new RectF();
        this.F = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, me.a.f11646e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        yd.f.b0(context, R.attr.motionDurationLong2, 200);
        yd.f.c0(context, R.attr.motionEasingEmphasizedInterpolator, ne.a.f12302b);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3987d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.A = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f3988e = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10 = ClockHandView.G;
                this.f3994a.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i10) {
        return i10 == 2 ? Math.round(this.E * 0.66f) : this.E;
    }

    public final void b(float f10) {
        this.f3984a.cancel();
        c(f10);
    }

    public final void c(float f10) {
        float f11 = f10 % 360.0f;
        this.B = f11;
        this.D = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.F);
        float fCos = (((float) Math.cos(this.D)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.D))) + height;
        float f12 = this.f3987d;
        this.f3990z.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        ArrayList arrayList = this.f3986c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.f3982e0 - f11) > 0.001f) {
                clockFaceView.f3982e0 = f11;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fA = a(this.F);
        float fCos = (((float) Math.cos(this.D)) * fA) + f10;
        float f11 = height;
        float fSin = (fA * ((float) Math.sin(this.D))) + f11;
        Paint paint = this.f3989f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f3987d, paint);
        double dSin = Math.sin(this.D);
        paint.setStrokeWidth(this.A);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.D) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f10, f11, this.f3988e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        super.onLayout(z2, i10, i11, i12, i13);
        if (this.f3984a.isRunning()) {
            return;
        }
        b(this.B);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z11 = false;
        if (actionMasked == 0) {
            this.C = false;
            z2 = true;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z10 = this.C;
            if (this.f3985b) {
                this.F = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z2 = false;
        } else {
            z10 = false;
            z2 = false;
        }
        boolean z12 = this.C;
        int degrees = (int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f10 = i10;
        boolean z13 = this.B != f10;
        if (z2 && z13) {
            z11 = true;
        } else if (z13 || z10) {
            b(f10);
            z11 = true;
        }
        this.C = z12 | z11;
        return true;
    }
}
