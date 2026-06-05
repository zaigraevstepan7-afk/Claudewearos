package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends t4.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f3993d;

    public c(ClockFaceView clockFaceView) {
        this.f3993d = clockFaceView;
    }

    @Override // t4.b
    public final void d(View view, u4.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16615a;
        this.f15694a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f3993d.S.get(iIntValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        eVar.b(u4.c.f16600e);
    }

    @Override // t4.b
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.g(view, i10, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f3993d;
        view.getHitRect(clockFaceView.P);
        float fCenterX = clockFaceView.P.centerX();
        float fCenterY = clockFaceView.P.centerY();
        clockFaceView.O.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.O.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
