package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzapm implements Runnable {
    final /* synthetic */ zzaqb zza;
    final /* synthetic */ zzapn zzb;

    public zzapm(zzapn zzapnVar, zzaqb zzaqbVar) {
        this.zza = zzaqbVar;
        this.zzb = zzapnVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
