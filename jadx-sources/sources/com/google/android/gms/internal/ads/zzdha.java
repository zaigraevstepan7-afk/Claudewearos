package com.google.android.gms.internal.ads;

import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdha implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;
    private final zzhgh zze;
    private final zzhgh zzf;

    public zzdha(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5, zzhgh zzhghVar6) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
        this.zzd = zzhghVar4;
        this.zze = zzhghVar5;
        this.zzf = zzhghVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        zzcgz zzcgzVar = (zzcgz) this.zza.zzb();
        zzcuy zzcuyVarZza = ((zzcvj) this.zzb).zza();
        zzdbp zzdbpVarZza = ((zzdck) this.zzc).zza();
        zzdgp zzdgpVarZza = ((zzdgr) this.zzd).zza();
        zzcyo zzcyoVarZzb = ((zzcom) this.zze).zzb();
        zzegt zzegtVar = (zzegt) this.zzf.zzb();
        zzcpr zzcprVarZzd = zzcgzVar.zzd();
        zzcprVarZzd.zzi(zzcuyVarZza.zzl());
        zzcprVarZzd.zzf(zzdbpVarZza);
        zzcprVarZzd.zzd(zzdgpVarZza);
        zzcprVarZzd.zze(new zzeiz(null));
        zzcprVarZzd.zzg(new zzcqn(zzcyoVarZzb, null));
        zzcprVarZzd.zzc(new zzcok(null));
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdS)).booleanValue()) {
            zzcprVarZzd.zzj(zzehc.zzb(zzegtVar));
        }
        zzcqy zzcqyVarZzb = zzcprVarZzd.zzh().zzb();
        zzhgg.zzb(zzcqyVarZzb);
        return zzcqyVarZzb;
    }
}
