package com.google.android.gms.internal.ads;

import android.content.Context;
import nc.q3;
import nc.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdtp implements zzdtd {
    private final long zza;
    private final zzeky zzb;

    public zzdtp(long j, Context context, zzdti zzdtiVar, zzcgz zzcgzVar, String str) {
        this.zza = j;
        zzezy zzezyVarZzu = zzcgzVar.zzu();
        zzezyVarZzu.zzc(context);
        zzezyVarZzu.zza(new s3());
        zzezyVarZzu.zzb(str);
        zzeky zzekyVarZza = zzezyVarZzu.zzd().zza();
        this.zzb = zzekyVarZza;
        zzekyVarZza.zzD(new zzdto(this, zzdtiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdtd
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdtd
    public final void zzb(q3 q3Var) {
        this.zzb.zzab(q3Var);
    }

    @Override // com.google.android.gms.internal.ads.zzdtd
    public final void zzc() {
        this.zzb.zzW(new xd.b(null));
    }
}
