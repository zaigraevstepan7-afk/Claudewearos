package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzflu implements Runnable {
    final /* synthetic */ zzflv zza;

    public zzflu(zzflv zzflvVar) {
        this.zza = zzflvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzflv zzflvVar = this.zza;
        float fZza = zzflv.zza(zzflvVar);
        if (((Float) zzflvVar.zzc.getAndSet(Float.valueOf(fZza))).floatValue() != fZza) {
            zzflvVar.zzd.zze(fZza);
        }
    }
}
