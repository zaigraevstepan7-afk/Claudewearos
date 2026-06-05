package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;
import pc.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzecc extends TimerTask {
    final /* synthetic */ AlertDialog zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ i zzc;

    public zzecc(zzecd zzecdVar, AlertDialog alertDialog, Timer timer, i iVar) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = iVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        i iVar = this.zzc;
        if (iVar != null) {
            iVar.zzb();
        }
    }
}
