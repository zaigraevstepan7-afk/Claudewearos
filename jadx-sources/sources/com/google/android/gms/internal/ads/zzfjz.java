package com.google.android.gms.internal.ads;

import nc.b0;
import nc.h2;
import nc.m0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfjz extends b0 {
    final /* synthetic */ zzgdv zza;
    final /* synthetic */ m0 zzb;
    final /* synthetic */ zzfka zzc;

    public zzfjz(zzfka zzfkaVar, zzgdv zzgdvVar, m0 m0Var) {
        this.zza = zzgdvVar;
        this.zzb = m0Var;
        this.zzc = zzfkaVar;
    }

    @Override // nc.c0
    public final void zzb(h2 h2Var) {
        String string = h2Var.c().toString();
        zzfka zzfkaVar = this.zzc;
        k.g("Failed to load interstitial ad with error: " + string + " for ad unit: " + zzfkaVar.zze.f12129a);
        zzfkaVar.zzL(h2Var);
    }

    @Override // nc.c0
    public final void zzc() {
        zzfjt.zza(this.zzb, this.zza);
    }
}
