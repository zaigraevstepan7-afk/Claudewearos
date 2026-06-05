package com.google.android.gms.internal.ads;

import java.util.Map;
import nc.s;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzbjb implements zzbkd {
    public final /* synthetic */ zzddw zza;
    public final /* synthetic */ zzcml zzb;

    public /* synthetic */ zzbjb(zzddw zzddwVar, zzcml zzcmlVar) {
        this.zza = zzddwVar;
        this.zzb = zzcmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        zzbkc.zzc(map, this.zza);
        final String str = (String) map.get("u");
        if (str == null) {
            int i10 = l0.f13401b;
            k.g("URL missing from click GMSG.");
            return;
        }
        final zzcml zzcmlVar = this.zzb;
        zzgcs zzgcsVarZzw = zzgcs.zzw(zzbkc.zza(zzcfeVar, str));
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzbje
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj2) {
                zzcml zzcmlVar2;
                String str2 = (String) obj2;
                zzbkd zzbkdVar = zzbkc.zza;
                return (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkn)).booleanValue() && (zzcmlVar2 = zzcmlVar) != null && zzcml.zzj(str)) ? zzcmlVar2.zze(str2, s.f12202f.f12207e) : zzgdb.zzh(str2);
            }
        };
        zzgdm zzgdmVar = zzcad.zza;
        zzgdb.zzr((zzgcs) zzgdb.zzn(zzgcsVarZzw, zzgciVar, zzgdmVar), new zzbjr(zzcfeVar), zzgdmVar);
    }
}
