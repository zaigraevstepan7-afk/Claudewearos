package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f3992a;

    public b(ClockFaceView clockFaceView) {
        this.f3992a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f3992a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.O.f3987d) - clockFaceView.W;
        if (height != clockFaceView.M) {
            clockFaceView.M = height;
            clockFaceView.m();
            ClockHandView clockHandView = clockFaceView.O;
            clockHandView.E = clockFaceView.M;
            clockHandView.invalidate();
        }
        return true;
    }
}
