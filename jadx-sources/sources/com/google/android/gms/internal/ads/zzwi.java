package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzwi implements zzwz {
    final /* synthetic */ zzwl zza;
    private final int zzb;

    public zzwi(zzwl zzwlVar, int i10) {
        this.zza = zzwlVar;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zza(zzkv zzkvVar, zzhs zzhsVar, int i10) {
        return this.zza.zzi(this.zzb, zzkvVar, zzhsVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zzb(long j) {
        return this.zza.zzk(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzd() {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final boolean zze() {
        return this.zza.zzQ(this.zzb);
    }
}
