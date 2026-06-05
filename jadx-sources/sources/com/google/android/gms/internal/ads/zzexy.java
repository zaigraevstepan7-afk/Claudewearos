package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzexy implements zzelf {
    final /* synthetic */ zzexz zza;

    public zzexy(zzexz zzexzVar) {
        this.zza = zzexzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zza() {
        zzexz zzexzVar = this.zza;
        synchronized (zzexzVar) {
            zzexzVar.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcoh zzcohVar = (zzcoh) obj;
        zzexz zzexzVar = this.zza;
        synchronized (zzexzVar) {
            try {
                zzcoh zzcohVar2 = zzexzVar.zza;
                if (zzcohVar2 != null) {
                    zzcohVar2.zzb();
                }
                zzexzVar.zza = zzcohVar;
                zzcohVar.zzc(zzexzVar);
                zzexzVar.zzg.zzk(new zzcoi(zzcohVar, zzexzVar, zzexzVar.zzg, zzexzVar.zzi));
                zzcohVar.zzk();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
