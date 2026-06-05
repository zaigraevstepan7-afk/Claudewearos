package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzajv implements zzaka {
    private final zzaee zza;
    private final zzaed zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzajv(zzaee zzaeeVar, zzaed zzaedVar) {
        this.zza = zzaeeVar;
        this.zzb = zzaedVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final long zzd(zzadu zzaduVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final zzaes zze() {
        zzdd.zzf(this.zzc != -1);
        return new zzaec(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzex.zzd(jArr, j, true, true)];
    }
}
