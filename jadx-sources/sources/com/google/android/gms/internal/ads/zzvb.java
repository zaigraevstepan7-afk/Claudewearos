package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzvb extends zzbl {
    private final zzap zzb;

    public zzvb(zzap zzapVar) {
        this.zzb = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zza(Object obj) {
        return obj == zzva.zzc ? 0 : -1;
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
        zzbjVar.zzi(z2 ? 0 : null, z2 ? zzva.zzc : null, 0, -9223372036854775807L, 0L, zzb.zza, true);
        return zzbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbk zze(int i10, zzbk zzbkVar, long j) {
        zzbkVar.zza(zzbk.zza, this.zzb, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzbkVar.zzk = true;
        return zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final Object zzf(int i10) {
        return zzva.zzc;
    }
}
