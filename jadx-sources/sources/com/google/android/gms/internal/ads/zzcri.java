package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcri implements zzgcx {
    final /* synthetic */ zzgcx zza;
    final /* synthetic */ zzcrk zzb;

    public zzcri(zzcrk zzcrkVar, zzgcx zzgcxVar) {
        this.zza = zzgcxVar;
        this.zzb = zzcrkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        this.zza.zza(th2);
        zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcre
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd = false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrk.zzc(this.zzb, ((zzcrd) obj).zza, this.zza);
    }
}
