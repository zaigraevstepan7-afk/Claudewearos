package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcax implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcbd zzc;

    public zzcax(zzcbd zzcbdVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcbdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbd zzcbdVar = this.zzc;
        if (zzcbdVar.zzr != null) {
            zzcbdVar.zzr.zzb(this.zza, this.zzb);
        }
    }
}
