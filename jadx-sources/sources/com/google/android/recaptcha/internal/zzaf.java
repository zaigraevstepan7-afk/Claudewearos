package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import nd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzaf {
    public static final zzaf zza = new zzaf();
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);
    private static final f zzc = f.f12280b;

    private zzaf() {
    }

    public static final String zza(Context context) {
        int iC = zzc.c(context);
        return (iC == 1 || iC == 3 || iC == 9) ? "ANDROID_OFFPLAY" : "ANDROID_ONPLAY";
    }
}
