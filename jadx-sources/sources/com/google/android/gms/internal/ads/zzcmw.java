package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcmw implements zzgcx {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcmx zzb;

    public zzcmw(zzcmx zzcmxVar, String str) {
        this.zza = str;
        this.zzb = zzcmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        String str = this.zza;
        zzcmx zzcmxVar = this.zzb;
        zzcmxVar.zzh.zza(zzcmxVar.zzg.zze(zzcmxVar.zze, zzcmxVar.zzf, false, str, null, zzcmxVar.zzw()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcmx zzcmxVar = this.zzb;
        zzcmxVar.zzh.zza(zzcmxVar.zzg.zze(zzcmxVar.zze, zzcmxVar.zzf, false, this.zza, (String) obj, zzcmxVar.zzw()), zzcmxVar.zzn);
    }
}
