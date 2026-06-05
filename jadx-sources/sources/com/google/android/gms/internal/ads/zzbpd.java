package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbpd {
    private final zzbog zza;
    private mf.a zzb;

    public zzbpd(zzbog zzbogVar) {
        this.zza = zzbogVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcai zzcaiVar = new zzcai();
            this.zzb = zzcaiVar;
            this.zza.zzb(null).zzj(new zzcam() { // from class: com.google.android.gms.internal.ads.zzbpa
                @Override // com.google.android.gms.internal.ads.zzcam
                public final void zza(Object obj) {
                    zzcaiVar.zzc((zzboh) obj);
                }
            }, new zzcak() { // from class: com.google.android.gms.internal.ads.zzbpb
                @Override // com.google.android.gms.internal.ads.zzcak
                public final void zza() {
                    zzcaiVar.zzd(new zzboj("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbpg zza(String str, zzbon zzbonVar, zzbom zzbomVar) {
        zzd();
        return new zzbpg(this.zzb, "google.afma.activeView.handleUpdate", zzbonVar, zzbomVar);
    }

    public final void zzb(final String str, final zzbkd zzbkdVar) {
        zzd();
        this.zzb = zzgdb.zzn(this.zzb, new zzgci() { // from class: com.google.android.gms.internal.ads.zzbpc
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                zzboh zzbohVar = (zzboh) obj;
                zzbohVar.zzq(str, zzbkdVar);
                return zzgdb.zzh(zzbohVar);
            }
        }, zzcad.zzg);
    }

    public final void zzc(final String str, final zzbkd zzbkdVar) {
        this.zzb = zzgdb.zzm(this.zzb, new zzfut() { // from class: com.google.android.gms.internal.ads.zzboz
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                zzboh zzbohVar = (zzboh) obj;
                zzbohVar.zzr(str, zzbkdVar);
                return zzbohVar;
            }
        }, zzcad.zzg);
    }
}
