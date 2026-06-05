package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzavj implements Runnable {
    final /* synthetic */ zzavk zza;

    public zzavj(zzavk zzavkVar) {
        this.zza = zzavkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzavk zzavkVar = this.zza;
        synchronized (zzavkVar.zzo) {
            if (zzavkVar.zzp) {
                return;
            }
            zzavkVar.zzp = true;
            try {
                zzavk.zzj(zzavkVar);
            } catch (Exception e10) {
                this.zza.zzh.zzc(2023, -1L, e10);
            }
            zzavk zzavkVar2 = this.zza;
            synchronized (zzavkVar2.zzo) {
                zzavkVar2.zzp = false;
            }
        }
    }
}
