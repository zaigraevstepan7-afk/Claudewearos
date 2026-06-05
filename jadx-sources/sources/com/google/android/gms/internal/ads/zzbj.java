package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbj {
    public Object zza;
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzb zzg = zzb.zza;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbj.class.equals(obj.getClass())) {
            zzbj zzbjVar = (zzbj) obj;
            if (Objects.equals(this.zza, zzbjVar.zza) && Objects.equals(this.zzb, zzbjVar.zzb) && this.zzc == zzbjVar.zzc && this.zzd == zzbjVar.zzd && this.zzf == zzbjVar.zzf && Objects.equals(this.zzg, zzbjVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j = this.zzd;
        return this.zzg.hashCode() + (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31);
    }

    public final int zza(int i10) {
        return this.zzg.zza(i10).zzb;
    }

    public final int zzb() {
        int i10 = this.zzg.zzb;
        return 0;
    }

    public final int zzc(long j) {
        return -1;
    }

    public final int zzd(long j) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zze(int i10) {
        return this.zzg.zza(i10).zza(-1);
    }

    public final long zzf(int i10, int i11) {
        zza zzaVarZza = this.zzg.zza(i10);
        if (zzaVarZza.zzb != -1) {
            return zzaVarZza.zzf[i11];
        }
        return -9223372036854775807L;
    }

    public final long zzg(int i10) {
        long j = this.zzg.zza(i10).zza;
        return 0L;
    }

    public final long zzh() {
        long j = this.zzg.zzc;
        return 0L;
    }

    public final zzbj zzi(Object obj, Object obj2, int i10, long j, long j4, zzb zzbVar, boolean z2) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i10;
        this.zzd = j;
        this.zze = 0L;
        this.zzg = zzbVar;
        this.zzf = z2;
        return this;
    }

    public final boolean zzj(int i10) {
        zzb();
        if (i10 != -1) {
            return false;
        }
        this.zzg.zzb(-1);
        return false;
    }

    public final boolean zzk(int i10) {
        boolean z2 = this.zzg.zza(i10).zzi;
        return false;
    }
}
