package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdy {
    public final Object zza;
    private zzt zzb = new zzt();
    private boolean zzc;
    private boolean zzd;

    public zzdy(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdy.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzdy) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i10, zzdw zzdwVar) {
        if (this.zzd) {
            return;
        }
        if (i10 != -1) {
            this.zzb.zza(i10);
        }
        this.zzc = true;
        zzdwVar.zza(this.zza);
    }

    public final void zzb(zzdx zzdxVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzv zzvVarZzb = this.zzb.zzb();
        this.zzb = new zzt();
        this.zzc = false;
        zzdxVar.zza(this.zza, zzvVarZzb);
    }

    public final void zzc(zzdx zzdxVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdxVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
