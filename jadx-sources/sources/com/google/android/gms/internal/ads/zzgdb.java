package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgdb extends zzgdd {
    public static zzgcz zza(Iterable iterable) {
        return new zzgcz(false, zzfyf.zzk(iterable), null);
    }

    public static zzgcz zzb(Iterable iterable) {
        return new zzgcz(true, zzfyf.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgcz zzc(mf.a... aVarArr) {
        return new zzgcz(true, zzfyf.zzm(aVarArr), null);
    }

    public static mf.a zzd(Iterable iterable) {
        return new zzgcj(zzfyf.zzk(iterable), true);
    }

    public static mf.a zze(mf.a aVar, Class cls, zzfut zzfutVar, Executor executor) {
        int i10 = zzgbo.zzd;
        zzgbn zzgbnVar = new zzgbn(aVar, cls, zzfutVar);
        aVar.addListener(zzgbnVar, zzgdt.zzd(executor, zzgbnVar));
        return zzgbnVar;
    }

    public static mf.a zzf(mf.a aVar, Class cls, zzgci zzgciVar, Executor executor) {
        int i10 = zzgbo.zzd;
        zzgbm zzgbmVar = new zzgbm(aVar, cls, zzgciVar);
        aVar.addListener(zzgbmVar, zzgdt.zzd(executor, zzgbmVar));
        return zzgbmVar;
    }

    public static mf.a zzg(Throwable th2) {
        th2.getClass();
        return new zzgde(th2);
    }

    public static mf.a zzh(Object obj) {
        return obj == null ? zzgdf.zza : new zzgdf(obj);
    }

    public static mf.a zzi() {
        return zzgdf.zza;
    }

    public static mf.a zzj(Callable callable, Executor executor) {
        zzgec zzgecVar = new zzgec(callable);
        executor.execute(zzgecVar);
        return zzgecVar;
    }

    public static mf.a zzk(zzgch zzgchVar, Executor executor) {
        zzgec zzgecVar = new zzgec(zzgchVar);
        executor.execute(zzgecVar);
        return zzgecVar;
    }

    @SafeVarargs
    public static mf.a zzl(mf.a... aVarArr) {
        return new zzgcj(zzfyf.zzm(aVarArr), false);
    }

    public static mf.a zzm(mf.a aVar, zzfut zzfutVar, Executor executor) {
        int i10 = zzgby.zzc;
        zzgbx zzgbxVar = new zzgbx(aVar, zzfutVar);
        aVar.addListener(zzgbxVar, zzgdt.zzd(executor, zzgbxVar));
        return zzgbxVar;
    }

    public static mf.a zzn(mf.a aVar, zzgci zzgciVar, Executor executor) {
        int i10 = zzgby.zzc;
        zzgbw zzgbwVar = new zzgbw(aVar, zzgciVar);
        aVar.addListener(zzgbwVar, zzgdt.zzd(executor, zzgbwVar));
        return zzgbwVar;
    }

    public static mf.a zzo(mf.a aVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return aVar.isDone() ? aVar : zzgdz.zzf(aVar, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) {
        if (future.isDone()) {
            return zzgee.zza(future);
        }
        throw new IllegalStateException(zzfvv.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgee.zza(future);
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof Error) {
                throw new zzgcq((Error) e10.getCause());
            }
            throw new zzged(e10.getCause());
        }
    }

    public static void zzr(mf.a aVar, zzgcx zzgcxVar, Executor executor) {
        zzgcxVar.getClass();
        aVar.addListener(new zzgcy(aVar, zzgcxVar), executor);
    }
}
