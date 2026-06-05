package com.google.android.gms.internal.ads;

import android.os.Build;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzrs implements zzql {
    final /* synthetic */ zzru zza;

    public /* synthetic */ zzrs(zzru zzruVar, zzrt zzrtVar) {
        this.zza = zzruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void zza(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            zzru zzruVar = this.zza;
            if (zzruVar.zze != null) {
                zzruVar.zze.zzd(i10);
            }
        }
        this.zza.zzc.zzo(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void zzb(Exception exc) {
        zzea.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzp(exc);
    }
}
