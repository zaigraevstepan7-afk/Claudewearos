package com.google.android.gms.internal.ads;

import q.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdiv {
    zzbho zza;
    zzbhl zzb;
    zzbib zzc;
    zzbhy zzd;
    zzbmw zze;
    final p0 zzf = new p0(0);
    final p0 zzg = new p0(0);

    public final zzdiv zza(zzbhl zzbhlVar) {
        this.zzb = zzbhlVar;
        return this;
    }

    public final zzdiv zzb(zzbho zzbhoVar) {
        this.zza = zzbhoVar;
        return this;
    }

    public final zzdiv zzc(String str, zzbhu zzbhuVar, zzbhr zzbhrVar) {
        this.zzf.put(str, zzbhuVar);
        if (zzbhrVar != null) {
            this.zzg.put(str, zzbhrVar);
        }
        return this;
    }

    public final zzdiv zzd(zzbmw zzbmwVar) {
        this.zze = zzbmwVar;
        return this;
    }

    public final zzdiv zze(zzbhy zzbhyVar) {
        this.zzd = zzbhyVar;
        return this;
    }

    public final zzdiv zzf(zzbib zzbibVar) {
        this.zzc = zzbibVar;
        return this;
    }

    public final zzdix zzg() {
        return new zzdix(this);
    }
}
