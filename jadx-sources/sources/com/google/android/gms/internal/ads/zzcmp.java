package com.google.android.gms.internal.ads;

import java.util.List;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcmp implements zzcvu {
    private final zzfbw zza;
    private final zzfcf zzb;
    private final zzfjm zzc;
    private final zzfjq zzd;

    public zzcmp(zzfcf zzfcfVar, zzfjq zzfjqVar, zzfjm zzfjmVar) {
        this.zzb = zzfcfVar;
        this.zzd = zzfjqVar;
        this.zzc = zzfjmVar;
        this.zza = zzfcfVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(h2 h2Var) {
        List list = this.zza.zza;
        this.zzd.zze(this.zzc.zzd(this.zzb, null, list), null);
    }
}
