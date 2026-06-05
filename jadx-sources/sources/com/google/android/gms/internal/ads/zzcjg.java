package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcjg implements zzfbn {
    final zzhgh zza;
    final zzhgh zzb;
    final zzhgh zzc;
    final zzhgh zzd;
    final zzhgh zze;
    final zzhgh zzf;
    final zzhgh zzg;
    final zzhgh zzh;
    private final zzcij zzi;

    public zzcjg(zzcij zzcijVar, Context context, String str) {
        this.zzi = zzcijVar;
        zzhfy zzhfyVarZza = zzhfz.zza(context);
        this.zza = zzhfyVarZza;
        zzhgh zzhghVar = zzcijVar.zzbg;
        zzezn zzeznVar = new zzezn(zzhfyVarZza, zzhghVar, zzcijVar.zzbh);
        this.zzb = zzeznVar;
        zzhgh zzhghVarZzc = zzhfx.zzc(new zzfax(zzhghVar));
        this.zzc = zzhghVarZzc;
        zzhgh zzhghVarZzc2 = zzhfx.zzc(zzfcl.zza());
        this.zzd = zzhghVarZzc2;
        zzhgh zzhghVarZzc3 = zzhfx.zzc(new zzfbh(zzhfyVarZza, zzcijVar.zza, zzcijVar.zzR, zzeznVar, zzhghVarZzc, zzfcq.zza(), zzhghVarZzc2));
        this.zze = zzhghVarZzc3;
        this.zzf = zzhfx.zzc(new zzfbr(zzhghVarZzc3, zzhghVarZzc, zzhghVarZzc2));
        zzhfy zzhfyVarZzc = zzhfz.zzc(str);
        this.zzg = zzhfyVarZzc;
        this.zzh = zzhfx.zzc(new zzfbl(zzhfyVarZzc, zzhghVarZzc3, zzhfyVarZza, zzhghVarZzc, zzhghVarZzc2, zzcijVar.zzj, zzcijVar.zzT, zzcijVar.zzK));
    }

    @Override // com.google.android.gms.internal.ads.zzfbn
    public final zzfbk zza() {
        return (zzfbk) this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfbn
    public final zzfbq zzb() {
        return (zzfbq) this.zzf.zzb();
    }
}
