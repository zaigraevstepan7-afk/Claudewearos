package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzu implements zzeu {
    final WeakReference zza;
    private final zzq zzb = new zzt(this);

    public zzu(zzr zzrVar) {
        this.zza = new WeakReference(zzrVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        zzr zzrVar = (zzr) this.zza.get();
        boolean zCancel = this.zzb.cancel(z2);
        if (!zCancel || zzrVar == null) {
            return zCancel;
        }
        zzrVar.zza();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzb.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzb.zzc instanceof zzg;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzb.isDone();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza(Object obj) {
        return this.zzb.zzd(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(Runnable runnable, Executor executor) {
        this.zzb.zzb(runnable, executor);
    }

    public final boolean zzc(Throwable th2) {
        zzi zziVar = new zzi(th2);
        zzf zzfVar = zzq.zzb;
        zzq zzqVar = this.zzb;
        if (!zzfVar.zzd(zzqVar, null, zziVar)) {
            return false;
        }
        zzq.zzc(zzqVar);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.zzb.get(j, timeUnit);
    }
}
