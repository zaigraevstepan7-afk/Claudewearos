package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgys implements zzgyj {
    final int zza;
    final zzhby zzb;
    final boolean zzc;
    final boolean zzd;

    public zzgys(zzgza zzgzaVar, int i10, zzhby zzhbyVar, boolean z2, boolean z10) {
        this.zza = i10;
        this.zzb = zzhbyVar;
        this.zzc = z2;
        this.zzd = z10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzgys) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final zzhby zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final zzhbz zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final boolean zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final boolean zze() {
        return this.zzc;
    }
}
