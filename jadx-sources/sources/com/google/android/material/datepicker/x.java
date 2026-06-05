package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class x extends t6.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3903q = 0;

    public /* synthetic */ x(Context context) {
        super(context);
    }

    @Override // t6.t
    public int b(View view, int i10) {
        switch (this.f3903q) {
            case 1:
                return 0;
            default:
                return super.b(view, i10);
        }
    }

    @Override // t6.t
    public int c(View view, int i10) {
        switch (this.f3903q) {
            case 1:
                return 0;
            default:
                return super.c(view, i10);
        }
    }

    @Override // t6.t
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f3903q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // t6.t
    public PointF f(int i10) {
        switch (this.f3903q) {
            case 1:
                return null;
            default:
                return super.f(i10);
        }
    }

    public x(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
