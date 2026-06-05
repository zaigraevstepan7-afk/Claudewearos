package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzpm extends BroadcastReceiver {
    final /* synthetic */ zzpo zza;

    public /* synthetic */ zzpm(zzpo zzpoVar, zzpn zzpnVar) {
        this.zza = zzpoVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzpo zzpoVar = this.zza;
        zzpoVar.zzj(zzpj.zzd(context, intent, zzpoVar.zzh, zzpoVar.zzg));
    }
}
