package com.google.android.gms.internal.ads;

import android.view.View;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzeen extends zzbra {
    final /* synthetic */ zzeep zza;
    private final zzedh zzb;

    public /* synthetic */ zzeen(zzeep zzeepVar, zzedh zzedhVar, zzeeo zzeeoVar) {
        this.zza = zzeepVar;
        this.zzb = zzedhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zze(String str) {
        ((zzeev) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzf(h2 h2Var) {
        ((zzeev) this.zzb.zzc).zzh(h2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzg(xd.a aVar) {
        this.zza.zzc = (View) xd.b.u(aVar);
        ((zzeev) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzh(zzbpx zzbpxVar) {
        this.zza.zzd = zzbpxVar;
        ((zzeev) this.zzb.zzc).zzo();
    }
}
