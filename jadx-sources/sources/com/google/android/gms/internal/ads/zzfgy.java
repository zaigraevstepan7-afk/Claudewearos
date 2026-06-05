package com.google.android.gms.internal.ads;

import android.content.Context;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfgy implements zzddb, zzcwh, zzddf {
    private final zzfhm zza;
    private final zzfhb zzb;

    public zzfgy(Context context, zzfhm zzfhmVar) {
        this.zza = zzfhmVar;
        this.zzb = zzfha.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzddf
    public final void zzb() {
        if (((Boolean) zzbev.zzd.zze()).booleanValue()) {
            zzfhm zzfhmVar = this.zza;
            zzfhb zzfhbVar = this.zzb;
            zzfhbVar.zzg(true);
            zzfhmVar.zza(zzfhbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzj() {
        if (((Boolean) zzbev.zzd.zze()).booleanValue()) {
            this.zzb.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzr(h2 h2Var) {
        if (((Boolean) zzbev.zzd.zze()).booleanValue()) {
            zzfhm zzfhmVar = this.zza;
            zzfhb zzfhbVar = this.zzb;
            zzfhbVar.zzc(h2Var.b().toString());
            zzfhbVar.zzg(false);
            zzfhmVar.zza(zzfhbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddf
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzi() {
    }
}
