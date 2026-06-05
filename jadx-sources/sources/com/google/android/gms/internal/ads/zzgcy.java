package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgcy implements Runnable {
    final Future zza;
    final zzgcx zzb;

    public zzgcy(Future future, zzgcx zzgcxVar) {
        this.zza = future;
        this.zzb = zzgcxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Future future = this.zza;
        if ((future instanceof zzgef) && (thZza = zzgeg.zza((zzgef) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzgdb.zzp(future));
        } catch (ExecutionException e10) {
            this.zzb.zza(e10.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzfuy zzfuyVarZza = zzfva.zza(this);
        zzfuyVarZza.zza(this.zzb);
        return zzfuyVarZza.toString();
    }
}
