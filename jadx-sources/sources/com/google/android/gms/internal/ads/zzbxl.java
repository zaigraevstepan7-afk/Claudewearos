package com.google.android.gms.internal.ads;

import fc.l;
import fc.r;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxl extends zzbwv {
    private l zza;
    private r zzb;

    public final void zzb(l lVar) {
        this.zza = lVar;
    }

    public final void zzc(r rVar) {
        this.zzb = rVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg() {
        l lVar = this.zza;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzi(h2 h2Var) {
        l lVar = this.zza;
        if (lVar != null) {
            lVar.b(h2Var.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzj() {
        l lVar = this.zza;
        if (lVar != null) {
            lVar.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzk(zzbwq zzbwqVar) {
        r rVar = this.zzb;
        if (rVar != null) {
            rVar.onUserEarnedReward(new zzbxd(zzbwqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzh(int i10) {
    }
}
