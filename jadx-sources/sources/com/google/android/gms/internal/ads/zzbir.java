package com.google.android.gms.internal.ads;

import android.os.Bundle;
import ic.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbir extends zzbia {
    private final l zza;

    public zzbir(l lVar) {
        this.zza = lVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbib
    public final void zze(zzbih zzbihVar) {
        zzbii zzbiiVar = new zzbii(zzbihVar);
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) this.zza;
        eVar.getClass();
        com.google.ads.mediation.a aVar = new com.google.ads.mediation.a();
        aVar.f16313l = new Bundle();
        aVar.f16303a = zzbiiVar.zzh();
        aVar.f16304b = zzbiiVar.zzk();
        aVar.f16305c = zzbiiVar.zzf();
        aVar.f16306d = zzbiiVar.zzb();
        aVar.f16307e = zzbiiVar.zzg();
        aVar.f16308f = zzbiiVar.zze();
        aVar.f16309g = zzbiiVar.zzc();
        aVar.f16310h = zzbiiVar.zzj();
        aVar.f16311i = zzbiiVar.zzi();
        aVar.f16312k = zzbiiVar.zzd();
        aVar.f16314m = true;
        aVar.f16315n = true;
        aVar.j = zzbiiVar.zza();
        eVar.f3434b.onAdLoaded(eVar.f3433a, aVar);
    }
}
