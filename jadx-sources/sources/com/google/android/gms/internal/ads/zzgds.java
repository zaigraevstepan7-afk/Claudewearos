package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgds extends zzgdp implements AutoCloseable, zzgdn {
    final ScheduledExecutorService zza;

    public zzgds(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgbv, java.lang.AutoCloseable, com.google.android.gms.internal.ads.zzgdm
    public final /* synthetic */ void close() throws InterruptedException {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        boolean zAwaitTermination = false;
        boolean z2 = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z2) {
                    shutdownNow();
                }
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgec zzgecVarZze = zzgec.zze(runnable, null);
        return new zzgdq(zzgecVarZze, scheduledExecutorService.schedule(zzgecVarZze, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j4, TimeUnit timeUnit) {
        zzgdr zzgdrVar = new zzgdr(runnable);
        return new zzgdq(zzgdrVar, this.zza.scheduleAtFixedRate(zzgdrVar, j, j4, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j4, TimeUnit timeUnit) {
        zzgdr zzgdrVar = new zzgdr(runnable);
        return new zzgdq(zzgdrVar, this.zza.scheduleWithFixedDelay(zzgdrVar, j, j4, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzgdl schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzgec zzgecVar = new zzgec(callable);
        return new zzgdq(zzgecVar, this.zza.schedule(zzgecVar, j, timeUnit));
    }
}
