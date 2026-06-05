package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzwr implements zzzg {
    public long zza;
    public long zzb;
    public zzzf zzc;
    public zzwr zzd;

    public zzwr(long j, int i10) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j4 = j - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j4;
    }

    public final zzwr zzb() {
        this.zzc = null;
        zzwr zzwrVar = this.zzd;
        this.zzd = null;
        return zzwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final zzzf zzc() {
        zzzf zzzfVar = this.zzc;
        zzzfVar.getClass();
        return zzzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final zzzg zzd() {
        zzwr zzwrVar = this.zzd;
        if (zzwrVar == null || zzwrVar.zzc == null) {
            return null;
        }
        return zzwrVar;
    }

    public final void zze(long j, int i10) {
        zzdd.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }
}
