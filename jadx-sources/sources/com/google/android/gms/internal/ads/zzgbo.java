package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzgbo extends zzgcr implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    mf.a zza;
    Class zzb;
    Object zzc;

    public zzgbo(mf.a aVar, Class cls, Object obj) {
        aVar.getClass();
        this.zza = aVar;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        mf.a aVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((aVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = aVar instanceof zzgef ? ((zzgef) aVar).zzi() : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                cause = new NullPointerException(m1.k("Future type ", String.valueOf(aVar.getClass()), " threw ", String.valueOf(e10.getClass()), " without a cause"));
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        Object objZzp = th == null ? zzgdb.zzp(aVar) : null;
        if (th == null) {
            zzc(objZzp);
            return;
        }
        if (!cls.isInstance(th)) {
            zzn(aVar);
            return;
        }
        try {
            Object objZze = zze(obj, th);
            this.zzb = null;
            this.zzc = null;
            zzf(objZze);
        } catch (Throwable th3) {
            try {
                zzgdu.zza(th3);
                zzd(th3);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final String zza() {
        mf.a aVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String strZza = super.zza();
        String strJ = aVar != null ? m1.j("inputFuture=[", aVar.toString(), "], ") : "";
        if (cls == null || obj == null) {
            if (strZza != null) {
                return strJ.concat(strZza);
            }
            return null;
        }
        return strJ + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void zzb() {
        zzl(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zze(Object obj, Throwable th2);

    public abstract void zzf(Object obj);
}
