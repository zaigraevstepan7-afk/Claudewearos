package com.google.android.gms.internal.ads;

import ic.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbil extends zzbhq {
    final /* synthetic */ zzbio zza;

    public /* synthetic */ zzbil(zzbio zzbioVar, zzbin zzbinVar) {
        this.zza = zzbioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhr
    public final void zze(zzbhh zzbhhVar, String str) {
        zzbio zzbioVar = this.zza;
        if (zzbioVar.zzb == null) {
            return;
        }
        j jVar = zzbioVar.zzb;
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) jVar;
        eVar.f3434b.zze(eVar.f3433a, zzbioVar.zzf(zzbhhVar), str);
    }
}
