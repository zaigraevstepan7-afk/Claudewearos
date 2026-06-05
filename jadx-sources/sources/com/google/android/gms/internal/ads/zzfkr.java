package com.google.android.gms.internal.ads;

import nc.i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfkr implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ i2 zzb;
    final /* synthetic */ zzfkv zzc;

    public zzfkr(zzfkv zzfkvVar, long j, i2 i2Var) {
        this.zza = j;
        this.zzb = i2Var;
        this.zzc = zzfkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfkv zzfkvVar = this.zzc;
        if (zzfkvVar.zzp != null) {
            zzfkvVar.zzp.zzi(this.zza, zzfkv.zzO(this.zzb), zzfkvVar.zzr, zzfkvVar.zze.f12132d, zzfkvVar.zzd(), zzfkvVar.zzD());
        }
    }
}
