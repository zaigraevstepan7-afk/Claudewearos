package com.google.android.gms.internal.ads;

import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfbo implements zzelf {
    final /* synthetic */ zzfbq zza;

    public zzfbo(zzfbq zzfbqVar) {
        this.zza = zzfbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zza() {
        zzfbq zzfbqVar = this.zza;
        synchronized (zzfbqVar) {
            zzfbqVar.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zzb(Object obj) {
        zzfbq zzfbqVar = this.zza;
        zzdog zzdogVar = (zzdog) obj;
        synchronized (zzfbqVar) {
            try {
                zzfbqVar.zzd = zzdogVar;
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdN)).booleanValue()) {
                    zzdogVar.zzd().zza = zzfbqVar.zzc;
                }
                zzfbqVar.zzd.zzk();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
