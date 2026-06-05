package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzej extends BroadcastReceiver {
    final /* synthetic */ zzel zza;

    public /* synthetic */ zzej(zzel zzelVar, zzek zzekVar) {
        this.zza = zzelVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzei
            @Override // java.lang.Runnable
            public final void run() {
                zzel.zzd(this.zza.zza, context);
            }
        });
    }
}
