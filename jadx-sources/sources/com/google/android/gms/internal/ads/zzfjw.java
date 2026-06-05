package com.google.android.gms.internal.ads;

import nc.h2;
import nc.j3;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfjw extends zzbaw {
    final /* synthetic */ zzgdv zza;
    final /* synthetic */ j3 zzb;
    final /* synthetic */ zzfjx zzc;

    public zzfjw(zzfjx zzfjxVar, zzgdv zzgdvVar, j3 j3Var) {
        this.zza = zzgdvVar;
        this.zzb = j3Var;
        this.zzc = zzfjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzc(h2 h2Var) {
        k.g("Failed to load app open ad with error parcel: " + h2Var.c().toString() + " for ad unit: " + this.zzb.f12129a);
        this.zzc.zzL(h2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzd(zzbau zzbauVar) {
        zzfjt.zza(zzbauVar, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzb(int i10) {
    }
}
