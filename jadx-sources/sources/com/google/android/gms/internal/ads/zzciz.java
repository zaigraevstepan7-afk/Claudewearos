package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzciz implements zzdtn {
    final zzhgh zza;
    final zzhgh zzb;
    final zzhgh zzc;
    final zzhgh zzd;
    private final Context zze;
    private final zzblc zzf;
    private final zzcij zzg;
    private final zzciz zzh = this;

    public zzciz(zzcij zzcijVar, Context context, zzblc zzblcVar) {
        this.zzg = zzcijVar;
        this.zze = context;
        this.zzf = zzblcVar;
        zzhfy zzhfyVarZza = zzhfz.zza(this);
        this.zza = zzhfyVarZza;
        zzhfy zzhfyVarZza2 = zzhfz.zza(zzblcVar);
        this.zzb = zzhfyVarZza2;
        zzdtj zzdtjVar = new zzdtj(zzhfyVarZza2);
        this.zzc = zzdtjVar;
        this.zzd = zzhfx.zzc(new zzdtl(zzhfyVarZza, zzdtjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final zzdte zzb() {
        return new zzciw(this.zzg, this.zzh, null);
    }

    public final zzdti zzc() {
        return zzdtj.zzc(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final zzdtk zzd() {
        return (zzdtk) this.zzd.zzb();
    }
}
