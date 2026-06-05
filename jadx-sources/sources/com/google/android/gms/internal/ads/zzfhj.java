package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfhj implements zzgcx {
    final /* synthetic */ zzfhm zza;
    final /* synthetic */ zzfhb zzb;
    final /* synthetic */ boolean zzc;

    public zzfhj(zzfhm zzfhmVar, zzfhb zzfhbVar, boolean z2) {
        this.zza = zzfhmVar;
        this.zzb = zzfhbVar;
        this.zzc = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        zzfhb zzfhbVar = this.zzb;
        if (zzfhbVar.zzk()) {
            zzfhm zzfhmVar = this.zza;
            zzfhbVar.zzh(th2);
            zzfhbVar.zzg(false);
            zzfhmVar.zza(zzfhbVar);
            if (this.zzc) {
                zzfhmVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
        zzfhb zzfhbVar = this.zzb;
        zzfhbVar.zzg(true);
        zzfhm zzfhmVar = this.zza;
        zzfhmVar.zza(zzfhbVar);
        if (this.zzc) {
            zzfhmVar.zzh();
        }
    }
}
