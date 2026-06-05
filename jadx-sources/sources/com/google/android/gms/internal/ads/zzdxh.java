package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdxh implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;

    public zzdxh(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar4;
        this.zzc = zzhghVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdxg zzb() {
        return new zzdxg((ScheduledExecutorService) this.zza.zzb(), zzffm.zzc(), zzffs.zzc(), ((zzdyd) this.zzb).zzb(), zzhfx.zza(this.zzc));
    }
}
