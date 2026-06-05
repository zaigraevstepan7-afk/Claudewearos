package com.google.android.gms.internal.ads;

import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdie implements zzazb {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdih zzb;

    public zzdie(zzdih zzdihVar, String str) {
        this.zza = str;
        this.zzb = zzdihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final void zzdr(zzaza zzazaVar) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbT)).booleanValue()) {
            if (zzazaVar.zzj) {
                zzdih zzdihVar = this.zzb;
                if (zzdihVar.zzo != null) {
                    zzdihVar.zzz.put(this.zza, Boolean.TRUE);
                    if (zzdihVar.zzo == null) {
                        return;
                    }
                    zzdihVar.zzB(zzdihVar.zzo.zzf(), zzdihVar.zzo.zzl(), zzdihVar.zzo.zzm(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (zzazaVar.zzj) {
                    zzdih zzdihVar2 = this.zzb;
                    if (zzdihVar2.zzo != null) {
                        zzdihVar2.zzz.put(this.zza, Boolean.TRUE);
                        if (zzdihVar2.zzo == null) {
                        } else {
                            zzdihVar2.zzB(zzdihVar2.zzo.zzf(), zzdihVar2.zzo.zzl(), zzdihVar2.zzo.zzm(), true);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
