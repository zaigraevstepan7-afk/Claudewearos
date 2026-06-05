package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class zzeg extends zzcf implements Future {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        return zzc().cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return zzc().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zzc().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zzc().isDone();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    public abstract Future zzc();

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return zzc().get(j, timeUnit);
    }
}
