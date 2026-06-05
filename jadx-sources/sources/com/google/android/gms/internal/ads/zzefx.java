package com.google.android.gms.internal.ads;

import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzefx extends zzbrg {
    final /* synthetic */ zzefz zza;
    private final zzedh zzb;

    public /* synthetic */ zzefx(zzefz zzefzVar, zzedh zzedhVar, zzefy zzefyVar) {
        this.zza = zzefzVar;
        this.zzb = zzedhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zze(String str) {
        ((zzeev) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzf(h2 h2Var) {
        ((zzeev) this.zzb.zzc).zzh(h2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzg(zzbqd zzbqdVar) {
        this.zza.zzc = zzbqdVar;
        ((zzeev) this.zzb.zzc).zzo();
    }
}
