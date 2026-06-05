package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcom implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;

    public zzcom(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
    }

    public static zzcyo zzc(ScheduledExecutorService scheduledExecutorService, ud.a aVar) {
        return new zzcyo(scheduledExecutorService, aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcyo zzb() {
        return zzc((ScheduledExecutorService) this.zza.zzb(), (ud.a) this.zzb.zzb());
    }
}
