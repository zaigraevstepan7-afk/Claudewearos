package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcqn {
    private final zzcyo zza;
    private final zzdau zzb;

    public zzcqn(zzcyo zzcyoVar, zzdau zzdauVar) {
        this.zza = zzcyoVar;
        this.zzb = zzdauVar;
    }

    public final zzcyo zza() {
        return this.zza;
    }

    public final zzdau zzb() {
        return this.zzb;
    }

    public final zzddo zzc() {
        zzdau zzdauVar = this.zzb;
        return zzdauVar != null ? new zzddo(zzdauVar, zzcad.zzg) : new zzddo(new zzcqm(this), zzcad.zzg);
    }
}
