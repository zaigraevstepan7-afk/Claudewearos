package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfh implements zzau {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfh(long j, long j4, long j10) {
        this.zza = j;
        this.zzb = j4;
        this.zzc = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfh)) {
            return false;
        }
        zzfh zzfhVar = (zzfh) obj;
        return this.zza == zzfhVar.zza && this.zzb == zzfhVar.zzb && this.zzc == zzfhVar.zzc;
    }

    public final int hashCode() {
        long j = this.zza;
        int i10 = (int) (j ^ (j >>> 32));
        long j4 = this.zzb;
        return ((((i10 + 527) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
