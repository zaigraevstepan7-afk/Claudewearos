package com.google.android.gms.internal.ads;

import java.util.Map;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzfcw implements zzbkd {
    public final /* synthetic */ zzddw zza;
    public final /* synthetic */ zzcml zzb;
    public final /* synthetic */ zzfjq zzc;
    public final /* synthetic */ zzebs zzd;

    public /* synthetic */ zzfcw(zzddw zzddwVar, zzcml zzcmlVar, zzfjq zzfjqVar, zzebs zzebsVar) {
        this.zza = zzddwVar;
        this.zzb = zzcmlVar;
        this.zzc = zzfjqVar;
        this.zzd = zzebsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        zzbkc.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            int i10 = l0.f13401b;
            k.g("URL missing from click GMSG.");
        } else {
            zzebs zzebsVar = this.zzd;
            zzfjq zzfjqVar = this.zzc;
            zzgdb.zzr(zzbkc.zza(zzcfeVar, str), new zzfcy(zzcfeVar, this.zzb, zzfjqVar, zzebsVar), zzcad.zza);
        }
    }
}
