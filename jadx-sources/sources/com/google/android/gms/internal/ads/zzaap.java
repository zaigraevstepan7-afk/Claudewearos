package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaap {
    final /* synthetic */ zzaar zza;
    private zzz zzb;

    public /* synthetic */ zzaap(zzaar zzaarVar, zzaaq zzaaqVar) {
        this.zza = zzaarVar;
    }

    public final void zza(final zzcd zzcdVar) {
        zzx zzxVar = new zzx();
        zzxVar.zzam(zzcdVar.zzb);
        zzxVar.zzQ(zzcdVar.zzc);
        zzxVar.zzah("video/raw");
        this.zzb = zzxVar.zzan();
        this.zza.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaao
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zzg.zzd(zzcdVar);
            }
        });
    }

    public final void zzb(long j, long j4, boolean z2) {
        if (z2) {
            zzaar zzaarVar = this.zza;
            if (zzaarVar.zzd != null) {
                zzaarVar.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaam
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zza.zzg.zza();
                    }
                });
            }
        }
        zzz zzzVarZzan = this.zzb;
        if (zzzVarZzan == null) {
            zzzVarZzan = new zzx().zzan();
        }
        zzz zzzVar = zzzVarZzan;
        zzaar zzaarVar2 = this.zza;
        zzaarVar2.zzi.zzcT(j4, j, zzzVar, null);
        ((zzacl) zzaarVar2.zzc.remove()).zza(j);
    }
}
