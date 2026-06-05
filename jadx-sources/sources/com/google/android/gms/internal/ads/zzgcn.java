package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzgcn extends zzgdj {
    private final Executor zza;
    final /* synthetic */ zzgco zzb;

    public zzgcn(zzgco zzgcoVar, Executor executor) {
        this.zzb = zzgcoVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zzd(Throwable th2) {
        zzgco zzgcoVar = this.zzb;
        zzgcoVar.zza = null;
        if (th2 instanceof ExecutionException) {
            zzgcoVar.zzd(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            zzgcoVar.cancel(false);
        } else {
            zzgcoVar.zzd(th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzd(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
