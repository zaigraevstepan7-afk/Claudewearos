package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzld {
    public final zzvh zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;

    public zzld(zzvh zzvhVar, long j, long j4, long j10, long j11, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        zzdd.zzd(!z13 || z11);
        if (z12 && !z11) {
            z14 = false;
        }
        zzdd.zzd(z14);
        this.zza = zzvhVar;
        this.zzb = j;
        this.zzc = j4;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = false;
        this.zzg = false;
        this.zzh = z11;
        this.zzi = z12;
        this.zzj = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzld.class == obj.getClass()) {
            zzld zzldVar = (zzld) obj;
            if (this.zzb == zzldVar.zzb && this.zzc == zzldVar.zzc && this.zzd == zzldVar.zzd && this.zze == zzldVar.zze && this.zzh == zzldVar.zzh && this.zzi == zzldVar.zzi && this.zzj == zzldVar.zzj && Objects.equals(this.zza, zzldVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        long j = this.zze;
        long j4 = this.zzd;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j4)) * 31) + ((int) j)) * 29791) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0);
    }

    public final zzld zza(long j) {
        return j == this.zzc ? this : new zzld(this.zza, this.zzb, j, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    public final zzld zzb(long j) {
        return j == this.zzb ? this : new zzld(this.zza, j, this.zzc, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }
}
