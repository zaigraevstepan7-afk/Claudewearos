package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzepz implements zzhfy {
    private final zzhgh zza;

    public zzepz(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        return new zzesg(zzeqw.zza(), ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzmw)).intValue(), (ScheduledExecutorService) this.zza.zzb());
    }
}
