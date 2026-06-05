package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzekx implements zzelf {
    final /* synthetic */ zzeky zza;

    public zzekx(zzeky zzekyVar) {
        this.zza = zzekyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zza() {
        zzeky zzekyVar = this.zza;
        synchronized (zzekyVar) {
            zzekyVar.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeky zzekyVar = this.zza;
        zzdeu zzdeuVar = (zzdeu) obj;
        synchronized (zzekyVar) {
            zzekyVar.zzj = zzdeuVar;
            zzekyVar.zzj.zzk();
        }
    }
}
