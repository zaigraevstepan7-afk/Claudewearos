package com.google.android.gms.internal.ads;

import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdif implements zzgcx {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdih zzb;

    public zzdif(zzdih zzdihVar, String str, boolean z2) {
        this.zzb = zzdihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfC)).booleanValue()) {
            n.D.f11582h.zzv(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdih zzdihVar = this.zzb;
        zzdihVar.zze.zzT((zzcfe) obj);
        zzcai zzcaiVarZzp = zzdihVar.zze.zzp();
        zzecz zzeczVarZzf = zzdihVar.zzf(this.zza, true);
        if (zzeczVarZzf != null && zzcaiVarZzp != null) {
            zzcaiVarZzp.zzc(zzeczVarZzf);
        } else if (zzcaiVarZzp != null) {
            zzcaiVarZzp.cancel(false);
        }
    }
}
