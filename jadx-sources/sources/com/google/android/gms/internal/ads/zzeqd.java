package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeqd implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;

    public zzeqd(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        return new zzesg(((zzerp) this.zza).zzb(), ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzmv)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
