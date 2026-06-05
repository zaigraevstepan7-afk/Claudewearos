package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzgby extends zzgcr implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    mf.a zza;
    Object zzb;

    public zzgby(mf.a aVar, Object obj) {
        aVar.getClass();
        this.zza = aVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mf.a aVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (aVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (aVar.isCancelled()) {
            zzn(aVar);
            return;
        }
        try {
            try {
                Object objZze = zze(obj, zzgdb.zzp(aVar));
                this.zzb = null;
                zzf(objZze);
            } catch (Throwable th2) {
                try {
                    zzgdu.zza(th2);
                    zzd(th2);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e10) {
            zzd(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            zzd(e11.getCause());
        } catch (Exception e12) {
            zzd(e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final String zza() {
        mf.a aVar = this.zza;
        Object obj = this.zzb;
        String strZza = super.zza();
        String strJ = aVar != null ? m1.j("inputFuture=[", aVar.toString(), "], ") : "";
        if (obj != null) {
            return gk.b.n(strJ, "function=[", obj.toString(), "]");
        }
        if (strZza != null) {
            return strJ.concat(strZza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void zzb() {
        zzl(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zze(Object obj, Object obj2);

    public abstract void zzf(Object obj);
}
