package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgec extends zzgcr implements RunnableFuture {
    private volatile zzgdj zza;

    public zzgec(zzgch zzgchVar) {
        this.zza = new zzgea(this, zzgchVar);
    }

    public static zzgec zze(Runnable runnable, Object obj) {
        return new zzgec(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgdj zzgdjVar = this.zza;
        if (zzgdjVar != null) {
            zzgdjVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final String zza() {
        zzgdj zzgdjVar = this.zza;
        return zzgdjVar != null ? m1.j("task=[", zzgdjVar.toString(), "]") : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void zzb() {
        zzgdj zzgdjVar;
        if (zzo() && (zzgdjVar = this.zza) != null) {
            zzgdjVar.zzh();
        }
        this.zza = null;
    }

    public zzgec(Callable callable) {
        this.zza = new zzgeb(this, callable);
    }
}
