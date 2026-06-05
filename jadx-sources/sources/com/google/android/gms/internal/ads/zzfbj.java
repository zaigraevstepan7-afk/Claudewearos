package com.google.android.gms.internal.ads;

import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfbj implements zzelf {
    final /* synthetic */ zzfbk zza;

    public zzfbj(zzfbk zzfbkVar) {
        this.zza = zzfbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zza() {
        zzfbk zzfbkVar = this.zza;
        synchronized (zzfbkVar) {
            zzfbkVar.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zzb(Object obj) {
        zzfbk zzfbkVar = this.zza;
        zzdog zzdogVar = (zzdog) obj;
        synchronized (zzfbkVar) {
            try {
                zzfbkVar.zzi = zzdogVar;
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdN)).booleanValue()) {
                    zzdogVar.zzd().zza = zzfbkVar.zzd;
                }
                zzfbkVar.zzi.zzk();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
