package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdxm implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;
    private final zzhgh zze;
    private final zzhgh zzf;

    public zzdxm(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5, zzhgh zzhghVar6, zzhgh zzhghVar7) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
        this.zzd = zzhghVar5;
        this.zze = zzhghVar6;
        this.zzf = zzhghVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdxl(((zzchg) this.zza).zza(), ((zzcvi) this.zzb).zza(), ((zzdwn) this.zzc).zzb(), zzffm.zzc(), (ScheduledExecutorService) this.zzd.zzb(), (zzeao) this.zze.zzb(), (zzfhm) this.zzf.zzb());
    }
}
