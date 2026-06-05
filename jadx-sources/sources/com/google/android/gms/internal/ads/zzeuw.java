package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeuw implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;
    private final zzhgh zze;

    public zzeuw(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5, zzhgh zzhghVar6, zzhgh zzhghVar7) {
        this.zza = zzhghVar2;
        this.zzb = zzhghVar3;
        this.zzc = zzhghVar5;
        this.zzd = zzhghVar6;
        this.zze = zzhghVar7;
    }

    public static zzeuu zza(zzbzh zzbzhVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z2, boolean z10) {
        return new zzeuu(zzbzhVar, context, scheduledExecutorService, executor, i10, z2, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeuu(zzcku.zza(), ((zzchg) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzffm.zzc(), ((zzewc) this.zzc).zzb().intValue(), ((zzewd) this.zzd).zzb().booleanValue(), ((zzewf) this.zze).zzb().booleanValue());
    }
}
