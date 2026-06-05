package com.google.android.gms.internal.ads;

import android.content.Context;
import nc.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdpc {
    private final Context zza;
    private final zzavs zzb;
    private final zzbej zzc;
    private final rc.a zzd;
    private final mc.a zze;
    private final zzbca zzf;
    private final zzcyo zzg;
    private final zzecd zzh;
    private final zzfcs zzi;
    private final zzdsc zzj;

    public zzdpc(zzcfr zzcfrVar, Context context, zzavs zzavsVar, zzbej zzbejVar, rc.a aVar, mc.a aVar2, zzbca zzbcaVar, zzcyo zzcyoVar, zzecd zzecdVar, zzfcs zzfcsVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = zzavsVar;
        this.zzc = zzbejVar;
        this.zzd = aVar;
        this.zze = aVar2;
        this.zzf = zzbcaVar;
        this.zzg = zzcyoVar;
        this.zzh = zzecdVar;
        this.zzi = zzfcsVar;
        this.zzj = zzdscVar;
    }

    public final zzcfe zza(s3 s3Var, zzfbt zzfbtVar, zzfbw zzfbwVar) {
        zzcgy zzcgyVarZzc = zzcgy.zzc(s3Var);
        String str = s3Var.f12220a;
        zzdor zzdorVar = new zzdor(this);
        zzecd zzecdVar = this.zzh;
        zzfcs zzfcsVar = this.zzi;
        zzdsc zzdscVar = this.zzj;
        mc.a aVar = this.zze;
        zzbca zzbcaVar = this.zzf;
        return zzcfr.zza(this.zza, zzcgyVarZzc, str, false, false, this.zzb, this.zzc, this.zzd, null, zzdorVar, aVar, zzbcaVar, zzfbtVar, zzfbwVar, zzecdVar, zzfcsVar, zzdscVar);
    }
}
