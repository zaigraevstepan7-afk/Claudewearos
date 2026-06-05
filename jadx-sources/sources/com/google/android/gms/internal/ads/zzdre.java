package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdre implements zzfgt {
    private final Map zza;
    private final zzbca zzb;

    public zzdre(zzbca zzbcaVar, Map map) {
        this.zza = map;
        this.zzb = zzbcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzd(zzfgm zzfgmVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfgmVar)) {
            this.zzb.zzc(((zzdrd) map.get(zzfgmVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdF(zzfgm zzfgmVar, String str, Throwable th2) {
        Map map = this.zza;
        if (map.containsKey(zzfgmVar)) {
            this.zzb.zzc(((zzdrd) map.get(zzfgmVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdG(zzfgm zzfgmVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfgmVar)) {
            this.zzb.zzc(((zzdrd) map.get(zzfgmVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdE(zzfgm zzfgmVar, String str) {
    }
}
