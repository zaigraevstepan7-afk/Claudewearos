package com.google.android.gms.internal.ads;

import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbap extends zzbaw {
    private final hc.a zza;
    private final String zzb;

    public zzbap(hc.a aVar, String str) {
        this.zza = aVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzc(h2 h2Var) {
        hc.a aVar = this.zza;
        if (aVar != null) {
            aVar.onAdFailedToLoad(h2Var.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzd(zzbau zzbauVar) {
        hc.a aVar = this.zza;
        if (aVar != null) {
            aVar.onAdLoaded(new zzbaq(zzbauVar, this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzb(int i10) {
    }
}
