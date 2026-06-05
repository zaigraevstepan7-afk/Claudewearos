package com.google.android.gms.internal.ads;

import nc.h2;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfky extends zzbwz {
    final /* synthetic */ zzgdv zza;
    final /* synthetic */ zzbwt zzb;
    final /* synthetic */ zzfkz zzc;

    public zzfky(zzfkz zzfkzVar, zzgdv zzgdvVar, zzbwt zzbwtVar) {
        this.zza = zzgdvVar;
        this.zzb = zzbwtVar;
        this.zzc = zzfkzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzf(h2 h2Var) {
        String string = h2Var.c().toString();
        zzfkz zzfkzVar = this.zzc;
        k.g("Failed to load rewarded ad with error: " + string + ", adUnitId: " + zzfkzVar.zze.f12129a);
        zzfkzVar.zzL(h2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzg() {
        zzfjt.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zze(int i10) {
    }
}
