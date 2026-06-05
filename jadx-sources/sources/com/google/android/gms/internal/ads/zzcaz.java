package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcaz implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcbd zzc;

    public zzcaz(zzcbd zzcbdVar, int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzcbdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbd zzcbdVar = this.zzc;
        if (zzcbdVar.zzr != null) {
            zzcbdVar.zzr.zzj(this.zza, this.zzb);
        }
    }
}
