package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzapr implements Runnable {
    private final zzaqb zza;
    private final zzaqh zzb;
    private final Runnable zzc;

    public zzapr(zzaqb zzaqbVar, zzaqh zzaqhVar, Runnable runnable) {
        this.zza = zzaqbVar;
        this.zzb = zzaqhVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqb zzaqbVar = this.zza;
        zzaqbVar.zzw();
        zzaqh zzaqhVar = this.zzb;
        if (zzaqhVar.zzc()) {
            zzaqbVar.zzo(zzaqhVar.zza);
        } else {
            zzaqbVar.zzn(zzaqhVar.zzc);
        }
        if (zzaqhVar.zzd) {
            zzaqbVar.zzm("intermediate-response");
        } else {
            zzaqbVar.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
