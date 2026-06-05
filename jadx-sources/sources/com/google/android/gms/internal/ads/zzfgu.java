package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfgu implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;

    public zzfgu(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3) {
        this.zza = zzhghVar2;
        this.zzb = zzhghVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfgs(zzffm.zzc(), (ScheduledExecutorService) this.zza.zzb(), ((zzfgv) this.zzb).zzb());
    }
}
