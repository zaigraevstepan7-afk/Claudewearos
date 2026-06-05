package com.google.android.gms.internal.ads;

import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxg extends zzbwz {
    private final ad.d zza;
    private final ad.c zzb;

    public zzbxg(ad.d dVar, ad.c cVar) {
        this.zza = dVar;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzf(h2 h2Var) {
        ad.d dVar = this.zza;
        if (dVar != null) {
            dVar.onAdFailedToLoad(h2Var.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzg() {
        ad.d dVar = this.zza;
        if (dVar != null) {
            dVar.onAdLoaded(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zze(int i10) {
    }
}
