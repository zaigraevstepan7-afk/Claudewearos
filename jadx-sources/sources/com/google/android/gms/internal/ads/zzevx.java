package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzevx implements zzetu {
    final ScheduledExecutorService zza;

    public zzevx(zzbts zzbtsVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return zzgdb.zzm(zzgdb.zzo(zzgdb.zzh(new Bundle()), ((Long) t.f12227d.f12230c.zzb(zzbdc.zzes)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfut() { // from class: com.google.android.gms.internal.ads.zzevw
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return new zzevy((Bundle) obj);
            }
        }, zzcad.zza);
    }
}
