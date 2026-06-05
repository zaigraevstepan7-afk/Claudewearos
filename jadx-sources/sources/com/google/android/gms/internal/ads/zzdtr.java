package com.google.android.gms.internal.ads;

import nc.h2;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdtr extends zzbwz {
    final /* synthetic */ zzdtt zza;

    public zzdtr(zzdtt zzdttVar) {
        this.zza = zzdttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zze(int i10) throws JSONException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzm(zzdttVar.zza, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzf(h2 h2Var) throws JSONException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzm(zzdttVar.zza, h2Var.f12114a);
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzg() throws JSONException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzp(zzdttVar.zza);
    }
}
