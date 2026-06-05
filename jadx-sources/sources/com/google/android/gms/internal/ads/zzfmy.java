package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfmy {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfmx(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfmu.zza() != zzflj.CTV) {
            return 2;
        }
        return zza;
    }
}
