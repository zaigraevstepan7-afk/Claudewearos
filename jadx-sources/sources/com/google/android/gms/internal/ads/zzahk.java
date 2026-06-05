package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzahk implements zzau {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzahk(long j, long j4, long j10, long j11, long j12) {
        this.zza = j;
        this.zzb = j4;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahk.class == obj.getClass()) {
            zzahk zzahkVar = (zzahk) obj;
            if (this.zza == zzahkVar.zza && this.zzb == zzahkVar.zzb && this.zzc == zzahkVar.zzc && this.zzd == zzahkVar.zzd && this.zze == zzahkVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        int i10 = (int) (j ^ (j >>> 32));
        long j4 = this.zze;
        long j10 = this.zzd;
        long j11 = this.zzc;
        long j12 = this.zzb;
        return ((((((((i10 + 527) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
