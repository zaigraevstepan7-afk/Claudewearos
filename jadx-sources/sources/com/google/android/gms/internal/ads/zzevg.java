package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzevg implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;

    public zzevg(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar3;
        this.zzc = zzhghVar4;
    }

    public static zzeve zza(String str, zzbbd zzbbdVar, zzbzq zzbzqVar, ScheduledExecutorService scheduledExecutorService, zzgdm zzgdmVar) {
        return new zzeve(str, zzbbdVar, zzbzqVar, scheduledExecutorService, zzgdmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeve(((zzewb) this.zza).zza(), zzckm.zza(), (zzbzq) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzffm.zzc());
    }
}
