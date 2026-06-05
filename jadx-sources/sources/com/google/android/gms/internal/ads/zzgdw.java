package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgdw implements Runnable {
    zzgdz zza;

    public zzgdw(zzgdz zzgdzVar) {
        this.zza = zzgdzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mf.a aVar;
        zzgdz zzgdzVar = this.zza;
        if (zzgdzVar == null || (aVar = zzgdzVar.zza) == null) {
            return;
        }
        this.zza = null;
        if (aVar.isDone()) {
            zzgdzVar.zzn(aVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzgdzVar.zzb;
            zzgdzVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    zzgdzVar.zzd(new zzgdx(str, null));
                    throw th2;
                }
            }
            zzgdzVar.zzd(new zzgdx(str + ": " + aVar.toString(), null));
        } finally {
            aVar.cancel(true);
        }
    }
}
