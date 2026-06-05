package c2;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.media.MediaCodecInfo;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ BlendModeColorFilter d(int i10, BlendMode blendMode) {
        return new BlendModeColorFilter(i10, blendMode);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint h(int i10, int i11, int i12) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, i12);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint i(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void x() {
    }
}
