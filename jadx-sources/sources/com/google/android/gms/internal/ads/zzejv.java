package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzejv implements zzelf {
    final /* synthetic */ zzejw zza;

    public zzejv(zzejw zzejwVar) {
        this.zza = zzejwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zza() {
        zzejw zzejwVar = this.zza;
        synchronized (zzejwVar) {
            zzejwVar.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzejw zzejwVar = this.zza;
        zzcon zzconVar = (zzcon) obj;
        synchronized (zzejwVar) {
            try {
                if (zzejwVar.zzi != null) {
                    zzejwVar.zzi.zzb();
                }
                zzejwVar.zzi = zzconVar;
                zzejwVar.zzi.zzk();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
