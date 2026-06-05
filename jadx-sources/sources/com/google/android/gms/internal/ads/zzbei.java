package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import xc.b0;
import xc.g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbei implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;

    public zzbei(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
        this.zzd = zzhghVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbeh zzb() {
        return new zzbeh((ScheduledExecutorService) this.zza.zzb(), (g0) this.zzb.zzb(), (b0) this.zzc.zzb(), (zzdsh) this.zzd.zzb());
    }
}
