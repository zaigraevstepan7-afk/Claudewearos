package c2;

import android.content.pm.ApkChecksum;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.metrics.PlaybackMetrics;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class s0 {
    public static /* bridge */ /* synthetic */ ApkChecksum b(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder h(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession m(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget n(w2.t tVar, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(tVar, rect, point, scrollCaptureCallback);
    }
}
