package com.google.android.gms.internal.ads;

import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdnl implements zzgcx {
    final /* synthetic */ zzfbt zza;
    final /* synthetic */ zzfbw zzb;
    final /* synthetic */ zzcml zzc;
    final /* synthetic */ zzdnr zzd;

    public zzdnl(zzdnr zzdnrVar, zzfbt zzfbtVar, zzfbw zzfbwVar, zzcml zzcmlVar) {
        this.zza = zzfbtVar;
        this.zzb = zzfbwVar;
        this.zzc = zzcmlVar;
        this.zzd = zzdnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
        zzcfe zzcfeVar = (zzcfe) obj;
        zzfbt zzfbtVar = this.zza;
        zzcfeVar.zzW(zzfbtVar, this.zzb);
        zzcgw zzcgwVarZzN = zzcfeVar.zzN();
        zzbct zzbctVar = zzbdc.zzkr;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && zzcgwVarZzN != null) {
            zzcml zzcmlVar = this.zzc;
            zzdnr zzdnrVar = this.zzd;
            zzcgwVarZzN.zzM(zzcmlVar, zzdnrVar.zzi, zzdnrVar.zzj);
            zzcgwVarZzN.zzO(zzcmlVar, zzdnrVar.zzi, zzdnrVar.zzd);
        }
        if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzni)).booleanValue() || zzcgwVarZzN == null) {
            return;
        }
        zzcgwVarZzN.zzP(zzfbtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
    }
}
