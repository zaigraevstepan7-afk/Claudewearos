package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzcai implements mf.a {
    private final zzgdv zza = zzgdv.zze();

    @Override // mf.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        return this.zza.cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zza.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    public void zza(Object obj) {
        zzc(obj);
    }

    public final boolean zzc(Object obj) {
        boolean zZzc = this.zza.zzc(obj);
        zza(zZzc);
        return zZzc;
    }

    public final boolean zzd(Throwable th2) {
        boolean zZzd = this.zza.zzd(th2);
        zza(zZzd);
        return zZzd;
    }

    private static final boolean zza(boolean z2) {
        if (!z2) {
            n.D.f11582h.zzv(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.zza.get(j, timeUnit);
    }
}
