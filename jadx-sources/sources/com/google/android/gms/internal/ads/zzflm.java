package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzflm extends TimerTask {
    final /* synthetic */ Timer zza;
    final /* synthetic */ zzflo zzb;
    final /* synthetic */ zzcfv zzc;

    public zzflm(zzflo zzfloVar, zzcfv zzcfvVar, Timer timer) {
        this.zzc = zzcfvVar;
        this.zza = timer;
        this.zzb = zzfloVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzb.zzh();
        zzcfw.zzaI(this.zzc.zza, true);
        this.zza.cancel();
    }
}
