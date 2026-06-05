package com.anonlab.voidlauncher.feature.home.presentation.components.icons;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import ej.a;
import ej.c;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class EditModeCornerIndicator extends View {
    public boolean A;
    public float B;
    public float C;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3415a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3416b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f3417c;

    /* renamed from: d, reason: collision with root package name */
    public float f3418d;

    /* renamed from: e, reason: collision with root package name */
    public a f3419e;

    /* renamed from: f, reason: collision with root package name */
    public c f3420f;

    /* renamed from: z, reason: collision with root package name */
    public c f3421z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditModeCornerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(-419430401);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDisplayMetrics().density * 3.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f3415a = paint;
        this.f3416b = new Path();
        this.f3417c = new RectF();
        this.f3418d = 0.225f;
    }

    public final float getCornerRadiusPercent() {
        return this.f3418d;
    }

    public final c getOnResizeEnd() {
        return this.f3421z;
    }

    public final c getOnResizeMove() {
        return this.f3420f;
    }

    public final a getOnResizeStart() {
        return this.f3419e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        float fMin = Math.min(getWidth(), getHeight()) * this.f3418d;
        Paint paint = this.f3415a;
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f10 = fMin * 2;
        float width = (getWidth() - f10) + strokeWidth;
        float height = (getHeight() - f10) + strokeWidth;
        float width2 = getWidth() + strokeWidth;
        float height2 = getHeight() + strokeWidth;
        RectF rectF = this.f3417c;
        rectF.set(width, height, width2, height2);
        Path path = this.f3416b;
        path.reset();
        path.arcTo(rectF, 0.0f, 90.0f, false);
        canvas.drawPath(path, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.f(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                    }
                } else if (this.A) {
                    float rawX = motionEvent.getRawX() - this.B;
                    this.C = rawX;
                    Log.d("ResizeDebug", "EditModeCornerIndicator ACTION_MOVE: deltaX=" + rawX);
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    c cVar = this.f3420f;
                    if (cVar != null) {
                        cVar.invoke(Float.valueOf(rawX));
                        return true;
                    }
                }
                return false;
            }
            if (this.A) {
                Log.d("ResizeDebug", "EditModeCornerIndicator ACTION_UP: totalDeltaX=" + this.C);
                this.A = false;
                c cVar2 = this.f3421z;
                if (cVar2 != null) {
                    cVar2.invoke(Float.valueOf(this.C));
                }
                this.C = 0.0f;
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                    return true;
                }
            }
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        Log.d("ResizeDebug", "EditModeCornerIndicator ACTION_DOWN: touchX=" + x2 + ", touchY=" + y2 + ", width=" + getWidth() + ", height=" + getHeight());
        float width = ((float) getWidth()) * 0.5f;
        float height = ((float) getHeight()) * 0.5f;
        Log.d("ResizeDebug", "Touch area: width=" + width + ", height=" + height + ", minX=" + (((float) getWidth()) - width) + ", minY=" + (((float) getHeight()) - height));
        if (x2 < getWidth() - width || y2 < getHeight() - height) {
            Log.d("ResizeDebug", "Touch is NOT in resize area");
            return false;
        }
        Log.d("ResizeDebug", "Touch is in resize area! Starting resize...");
        this.A = true;
        this.B = motionEvent.getRawX();
        motionEvent.getRawY();
        this.C = 0.0f;
        a aVar = this.f3419e;
        if (aVar != null) {
            aVar.a();
        }
        ViewParent parent3 = getParent();
        if (parent3 != null) {
            parent3.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public final void setCornerRadiusPercent(float f10) {
        this.f3418d = f10;
        invalidate();
    }

    public final void setOnResizeEnd(c cVar) {
        this.f3421z = cVar;
    }

    public final void setOnResizeMove(c cVar) {
        this.f3420f = cVar;
    }

    public final void setOnResizeStart(a aVar) {
        this.f3419e = aVar;
    }
}
