package com.google.android.gms.internal.ads;

import android.content.Context;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzeff implements zzdgg {
    final /* synthetic */ zzedh zza;
    final /* synthetic */ zzfbt zzb;
    final /* synthetic */ zzefg zzc;

    public zzeff(zzefg zzefgVar, zzedh zzedhVar, zzfbt zzfbtVar) {
        this.zza = zzedhVar;
        this.zzb = zzfbtVar;
        this.zzc = zzefgVar;
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
            if (this.zzc.zzc.f14323c < ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzaU)).intValue()) {
                zzfdmVar.zzx();
            } else {
                zzfdmVar.zzy(context);
            }
        } catch (zzfcv e10) {
            int i10 = l0.f13401b;
            k.f("Cannot show interstitial.");
            throw new zzdgf(e10.getCause());
        }
    }
}
