package com.google.android.gms.internal.ads;

import android.content.Context;
import nc.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcit implements zzeyi {
    final zzhgh zza;
    final zzhgh zzb;
    final zzhgh zzc;
    final zzhgh zzd;
    final zzhgh zze;
    final zzhgh zzf;
    private final Context zzg;
    private final s3 zzh;
    private final String zzi;
    private final zzcij zzj;

    public zzcit(zzcij zzcijVar, Context context, String str, s3 s3Var) {
        this.zzj = zzcijVar;
        this.zzg = context;
        this.zzh = s3Var;
        this.zzi = str;
        zzhfy zzhfyVarZza = zzhfz.zza(context);
        this.zza = zzhfyVarZza;
        zzhfy zzhfyVarZza2 = zzhfz.zza(s3Var);
        this.zzb = zzhfyVarZza2;
        zzhgh zzhghVarZzc = zzhfx.zzc(new zzekr(zzcijVar.zzK));
        this.zzc = zzhghVarZzc;
        zzhgh zzhghVarZzc2 = zzhfx.zzc(zzekw.zza());
        this.zzd = zzhghVarZzc2;
        zzhgh zzhghVarZzc3 = zzhfx.zzc(zzdaw.zza());
        this.zze = zzhghVarZzc3;
        this.zzf = zzhfx.zzc(new zzeyg(zzhfyVarZza, zzcijVar.zza, zzhfyVarZza2, zzcijVar.zzR, zzhghVarZzc, zzhghVarZzc2, zzfcq.zza(), zzhghVarZzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzeyi
    public final zzejw zza() {
        zzeyf zzeyfVar = (zzeyf) this.zzf.zzb();
        zzekq zzekqVar = (zzekq) this.zzc.zzb();
        zzcij zzcijVar = this.zzj;
        return new zzejw(this.zzg, this.zzh, this.zzi, zzeyfVar, zzekqVar, zzchu.zzc(zzcijVar.zzbo), (zzdsc) zzcijVar.zzK.zzb());
    }
}
