package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbka implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        if (map.keySet().contains("start")) {
            zzcfeVar.zzN().zzp();
        } else if (map.keySet().contains("stop")) {
            zzcfeVar.zzN().zzq();
        } else if (map.keySet().contains("cancel")) {
            zzcfeVar.zzN().zzo();
        }
    }
}
