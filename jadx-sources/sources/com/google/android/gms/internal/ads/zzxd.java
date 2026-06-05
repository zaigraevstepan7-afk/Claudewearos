package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzxd extends zzbl {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final zzap zzf;
    private final zzaj zzg;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zza("SinglePeriodTimeline");
        zzadVar.zzb(Uri.EMPTY);
        zzadVar.zzc();
    }

    public zzxd(long j, long j4, long j10, long j11, long j12, long j13, long j14, boolean z2, boolean z10, boolean z11, Object obj, zzap zzapVar, zzaj zzajVar) {
        this.zzc = j11;
        this.zzd = j12;
        this.zze = z2;
        zzapVar.getClass();
        this.zzf = zzapVar;
        this.zzg = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbj zzd(int i10, zzbj zzbjVar, boolean z2) {
        zzdd.zza(i10, 0, 1);
        zzbjVar.zzi(null, z2 ? zzb : null, 0, this.zzc, 0L, zzb.zza, false);
        return zzbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbk zze(int i10, zzbk zzbkVar, long j) {
        zzdd.zza(i10, 0, 1);
        Object obj = zzbk.zza;
        zzap zzapVar = this.zzf;
        long j4 = this.zzd;
        zzbkVar.zza(obj, zzapVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zze, false, this.zzg, 0L, j4, 0, 0, 0L);
        return zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final Object zzf(int i10) {
        zzdd.zza(i10, 0, 1);
        return zzb;
    }
}
