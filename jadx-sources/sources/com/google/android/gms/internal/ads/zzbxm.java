package com.google.android.gms.internal.ads;

import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxm extends zzbwz {
    private final bd.b zza;
    private final zzbxn zzb;

    public zzbxm(bd.b bVar, zzbxn zzbxnVar) {
        this.zza = bVar;
        this.zzb = zzbxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzf(h2 h2Var) {
        bd.b bVar = this.zza;
        if (bVar != null) {
            bVar.onAdFailedToLoad(h2Var.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzg() {
        zzbxn zzbxnVar;
        bd.b bVar = this.zza;
        if (bVar == null || (zzbxnVar = this.zzb) == null) {
            return;
        }
        bVar.onAdLoaded(zzbxnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zze(int i10) {
    }
}
