package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzela implements zzelf {
    final /* synthetic */ zzelb zza;

    public zzela(zzelb zzelbVar) {
        this.zza = zzelbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqv zzcqvVar = (zzcqv) obj;
        zzelb zzelbVar = this.zza;
        synchronized (zzelbVar) {
            zzelbVar.zzc = zzcqvVar.zzl();
            zzcqvVar.zzk();
        }
    }
}
