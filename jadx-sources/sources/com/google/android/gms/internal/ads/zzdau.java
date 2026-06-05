package com.google.android.gms.internal.ads;

import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdau implements zzcyt {
    private int zza;
    private int zzb;

    public zzdau() {
        zzbct zzbctVar = zzbdc.zzbr;
        t tVar = t.f12227d;
        this.zza = ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue();
        this.zzb = ((Integer) tVar.f12230c.zzb(zzbdc.zzna)).intValue();
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final synchronized void zzdo(zzfcf zzfcfVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbs)).booleanValue()) {
            try {
                zzfbw zzfbwVar = zzfcfVar.zzb.zzb;
                this.zza = zzfbwVar.zzc;
                this.zzb = zzfbwVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
    }
}
