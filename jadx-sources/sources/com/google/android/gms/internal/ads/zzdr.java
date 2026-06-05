package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.os.Build;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdr {
    public static void zza(boolean z2, String str) throws zzdq {
        if (!z2) {
            throw new zzdq(str);
        }
    }

    public static boolean zzb() {
        return Build.VERSION.SDK_INT >= 33 && zzf("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean zzc(int i10) {
        if (i10 == 6) {
            return zzb();
        }
        if (i10 == 7) {
            return zzf("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    public static boolean zzd(Context context) {
        return zzf("EGL_EXT_protected_content");
    }

    public static boolean zze() {
        return zzf("EGL_KHR_surfaceless_context");
    }

    private static boolean zzf(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }
}
