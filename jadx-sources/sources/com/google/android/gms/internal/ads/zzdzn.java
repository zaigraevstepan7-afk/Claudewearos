package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import nc.h2;
import qc.l0;
import qc.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdzn implements zzgcx {
    final /* synthetic */ zzbuy zza;
    final /* synthetic */ zzbvh zzb;

    public zzdzn(zzdzt zzdztVar, zzbvh zzbvhVar, zzbuy zzbuyVar) {
        this.zzb = zzbvhVar;
        this.zza = zzbuyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        try {
            zzbvh zzbvhVar = this.zzb;
            h2 h2VarZza = zzfdp.zza(th2);
            zzbvhVar.zze(new r(zzfvv.zzd(th2.getMessage()) ? h2VarZza.f12115b : th2.getMessage(), h2VarZza.f12114a));
        } catch (RemoteException e10) {
            l0.l("Service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zzf((String) obj, this.zza);
        } catch (RemoteException e10) {
            l0.l("Service can't call client", e10);
        }
    }
}
