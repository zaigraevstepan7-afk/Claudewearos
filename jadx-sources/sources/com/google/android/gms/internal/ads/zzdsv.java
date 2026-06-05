package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdsv implements zzhfy {
    private final zzdsr zza;
    private final zzhgh zzb;

    public zzdsv(zzdsr zzdsrVar, zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzdsrVar;
        this.zzb = zzhghVar;
    }

    public static Set zza(zzdsr zzdsrVar, zzdtb zzdtbVar, Executor executor) {
        Set setZzd = zzdsr.zzd(zzdtbVar, executor);
        zzhgg.zzb(setZzd);
        return setZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzdtb) this.zzb.zzb(), zzffm.zzc());
    }
}
