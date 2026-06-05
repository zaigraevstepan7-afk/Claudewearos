package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcav implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcbd zzb;

    public zzcav(zzcbd zzcbdVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcbdVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzcbd zzcbdVar = this.zzb;
        zzcbd.zzm(zzcbdVar, this.zza);
        if (zzcbdVar.zzr != null) {
            zzcbdVar.zzr.zzf();
        }
    }
}
