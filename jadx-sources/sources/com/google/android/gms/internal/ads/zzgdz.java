package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgdz extends zzgcr {
    private mf.a zza;
    private ScheduledFuture zzb;

    private zzgdz(mf.a aVar) {
        aVar.getClass();
        this.zza = aVar;
    }

    public static mf.a zzf(mf.a aVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgdz zzgdzVar = new zzgdz(aVar);
        zzgdw zzgdwVar = new zzgdw(zzgdzVar);
        zzgdzVar.zzb = scheduledExecutorService.schedule(zzgdwVar, j, timeUnit);
        aVar.addListener(zzgdwVar, zzgcp.INSTANCE);
        return zzgdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final String zza() {
        mf.a aVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (aVar == null) {
            return null;
        }
        String strJ = m1.j("inputFuture=[", aVar.toString(), "]");
        if (scheduledFuture == null) {
            return strJ;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strJ;
        }
        return strJ + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void zzb() {
        zzl(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
