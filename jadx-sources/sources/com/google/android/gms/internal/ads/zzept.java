package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzept implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;

    public zzept(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
        this.zzd = zzhghVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        zzenw zzenwVarZzb = ((zzeny) this.zza).zzb();
        zzeom zzeomVar = (zzeom) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("13")) {
            return new zzesg(zzeomVar, ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzmA)).intValue(), scheduledExecutorService);
        }
        return new zzesg(zzenwVarZzb, ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzmA)).intValue(), scheduledExecutorService);
    }
}
