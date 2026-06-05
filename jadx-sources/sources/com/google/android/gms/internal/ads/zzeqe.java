package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeqe implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;

    public zzeqe(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4) {
        this.zza = zzhghVar2;
        this.zzb = zzhghVar3;
        this.zzc = zzhghVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        zzerr zzerrVarZza = zzert.zza();
        zzeom zzeomVar = (zzeom) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            return new zzesg(zzeomVar, ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzmu)).intValue(), scheduledExecutorService);
        }
        return new zzesg(zzerrVarZza, ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzmu)).intValue(), scheduledExecutorService);
    }
}
