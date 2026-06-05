package com.google.android.gms.internal.ads;

import android.content.Context;
import qc.n0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbyg extends zzbyn {
    final zzhgh zza;
    final zzhgh zzb;
    final zzhgh zzc;
    final zzhgh zzd;
    final zzhgh zze;
    final zzhgh zzf;
    final zzhgh zzg;
    final zzhgh zzh;
    private final ud.a zzj;

    public zzbyg(Context context, ud.a aVar, n0 n0Var, zzbym zzbymVar) {
        this.zzj = aVar;
        zzhfy zzhfyVarZza = zzhfz.zza(context);
        this.zza = zzhfyVarZza;
        zzhfy zzhfyVarZza2 = zzhfz.zza(n0Var);
        this.zzb = zzhfyVarZza2;
        this.zzc = zzhfx.zzc(new zzbya(zzhfyVarZza, zzhfyVarZza2));
        zzhfy zzhfyVarZza3 = zzhfz.zza(aVar);
        this.zzd = zzhfyVarZza3;
        zzhfy zzhfyVarZza4 = zzhfz.zza(zzbymVar);
        this.zze = zzhfyVarZza4;
        zzhgh zzhghVarZzc = zzhfx.zzc(new zzbyc(zzhfyVarZza3, zzhfyVarZza2, zzhfyVarZza4));
        this.zzf = zzhghVarZzc;
        zzbye zzbyeVar = new zzbye(zzhfyVarZza3, zzhghVarZzc);
        this.zzg = zzbyeVar;
        this.zzh = zzhfx.zzc(new zzbys(zzhfyVarZza, zzbyeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final zzbyd zza() {
        return new zzbyd(this.zzj, (zzbyb) this.zzf.zzb());
    }
}
