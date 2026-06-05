package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzabs {
    public static void zza(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            zzea.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
