package com.google.android.gms.internal.ads;

import android.content.Context;
import nc.e0;
import nc.q3;
import nc.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeju extends e0 {
    private final zzelb zza;

    public zzeju(Context context, zzcgz zzcgzVar, zzfcm zzfcmVar, zzdix zzdixVar, z zVar) {
        zzeld zzeldVar = new zzeld(zzdixVar, zzcgzVar.zzi());
        zzeldVar.zze(zVar);
        this.zza = new zzelb(new zzeln(zzcgzVar, context, zzeldVar, zzfcmVar), zzfcmVar.zzL());
    }

    @Override // nc.f0
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // nc.f0
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // nc.f0
    public final void zzg(q3 q3Var) {
        this.zza.zzd(q3Var, 1);
    }

    @Override // nc.f0
    public final synchronized void zzh(q3 q3Var, int i10) {
        this.zza.zzd(q3Var, i10);
    }

    @Override // nc.f0
    public final synchronized boolean zzi() {
        return this.zza.zze();
    }
}
