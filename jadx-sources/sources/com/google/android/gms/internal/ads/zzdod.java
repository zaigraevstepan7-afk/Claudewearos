package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdod implements zzbku {
    private final zzcwy zza;
    private final zzbwm zzb;
    private final String zzc;
    private final String zzd;

    public zzdod(zzcwy zzcwyVar, zzfbt zzfbtVar) {
        this.zza = zzcwyVar;
        this.zzb = zzfbtVar.zzl;
        this.zzc = zzfbtVar.zzj;
        this.zzd = zzfbtVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbku
    public final void zza(zzbwm zzbwmVar) {
        int i10;
        String str;
        zzbwm zzbwmVar2 = this.zzb;
        if (zzbwmVar2 != null) {
            zzbwmVar = zzbwmVar2;
        }
        if (zzbwmVar != null) {
            str = zzbwmVar.zza;
            i10 = zzbwmVar.zzb;
        } else {
            i10 = 1;
            str = "";
        }
        this.zza.zzd(new zzbvx(str, i10), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbku
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbku
    public final void zzc() {
        this.zza.zzf();
    }
}
