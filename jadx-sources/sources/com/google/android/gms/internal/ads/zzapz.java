package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzapz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzaqb zzc;

    public zzapz(zzaqb zzaqbVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzaqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqb zzaqbVar = this.zzc;
        zzaqbVar.zza.zza(this.zza, this.zzb);
        zzaqbVar.zza.zzb(zzaqbVar.toString());
    }
}
