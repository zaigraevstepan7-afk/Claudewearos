package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzagk extends zzaef {
    private final long zza;

    public zzagk(zzadu zzaduVar, long j) {
        super(zzaduVar);
        zzdd.zzd(zzaduVar.zzf() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaef, com.google.android.gms.internal.ads.zzadu
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef, com.google.android.gms.internal.ads.zzadu
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef, com.google.android.gms.internal.ads.zzadu
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
