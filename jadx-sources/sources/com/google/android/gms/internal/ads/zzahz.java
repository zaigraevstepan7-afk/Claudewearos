package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzahz extends zzadi implements zzaie {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzahz(long j, long j4, int i10, int i11, boolean z2) {
        super(j, j4, i10, i11, false);
        this.zza = j4;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j != -1 ? j : -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zze(long j) {
        return zzb(j);
    }

    public final zzahz zzf(long j) {
        return new zzahz(j, this.zza, this.zzb, this.zzc, false);
    }
}
