package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhv extends BroadcastReceiver {
    private final zzdt zza;

    public zzhv(zzhx zzhxVar, zzdt zzdtVar, zzhw zzhwVar) {
        this.zza = zzdtVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.zzi(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzhu
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
