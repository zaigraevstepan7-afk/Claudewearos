package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaaw implements zzacl {
    final /* synthetic */ zztf zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzaba zzd;

    public zzaaw(zzaba zzabaVar, zztf zztfVar, int i10, long j) {
        this.zza = zztfVar;
        this.zzb = i10;
        this.zzc = j;
        this.zzd = zzabaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zza(long j) {
        this.zzd.zzaj(this.zza, this.zzb, this.zzc, j);
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzb() {
        this.zzd.zzap(this.zza, this.zzb, this.zzc);
    }
}
