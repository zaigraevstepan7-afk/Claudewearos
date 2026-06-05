package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfof extends zzfob {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    public /* synthetic */ zzfof(String str, boolean z2, boolean z10, boolean z11, long j, boolean z12, long j4, zzfoe zzfoeVar) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = z10;
        this.zzd = j;
        this.zze = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfob) {
            zzfob zzfobVar = (zzfob) obj;
            if (this.zza.equals(zzfobVar.zzd()) && this.zzb == zzfobVar.zzh() && this.zzc == zzfobVar.zzg()) {
                zzfobVar.zzf();
                if (this.zzd == zzfobVar.zzb()) {
                    zzfobVar.zze();
                    if (this.zze == zzfobVar.zza()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.zzd + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.zze + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final boolean zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final boolean zzh() {
        return this.zzb;
    }
}
