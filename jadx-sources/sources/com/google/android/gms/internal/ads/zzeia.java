package com.google.android.gms.internal.ads;

import android.content.Context;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzeia implements zzdgg {
    final /* synthetic */ zzedh zza;
    final /* synthetic */ zzfbt zzb;

    public zzeia(zzeic zzeicVar, zzedh zzedhVar, zzfbt zzfbtVar) {
        this.zza = zzedhVar;
        this.zzb = zzfbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final zzfbt zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzb(boolean z2, Context context, zzcwe zzcweVar) throws zzdgf {
        try {
            zzfdm zzfdmVar = (zzfdm) this.zza.zzb;
            zzfdmVar.zzv(z2);
            zzfdmVar.zzA();
        } catch (zzfcv e10) {
            int i10 = l0.f13401b;
            k.h("Cannot show rewarded video.", e10);
            throw new zzdgf(e10.getCause());
        }
    }
}
