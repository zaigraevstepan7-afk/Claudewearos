package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzc {
    public final AudioAttributes zza;

    public /* synthetic */ zzc(zze zzeVar, zzd zzdVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i10 >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.zza = usage.build();
    }
}
