package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfet implements zzgcx {
    final /* synthetic */ zzfew zza;
    final /* synthetic */ zzfex zzb;

    public zzfet(zzfex zzfexVar, zzfew zzfewVar) {
        this.zza = zzfewVar;
        this.zzb = zzfexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        zzfex zzfexVar = this.zzb;
        synchronized (zzfexVar) {
            zzfexVar.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfex zzfexVar = this.zzb;
        synchronized (zzfexVar) {
            try {
                zzfexVar.zze = null;
                zzfexVar.zzd.addFirst(this.zza);
                if (zzfexVar.zzf == 1) {
                    zzfexVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
