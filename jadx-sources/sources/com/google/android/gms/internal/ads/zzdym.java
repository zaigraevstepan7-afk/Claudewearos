package com.google.android.gms.internal.ads;

import java.util.Map;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdym implements zzdyo {
    private final Map zza;
    private final zzgdm zzb;
    private final zzcyr zzc;

    public zzdym(Map map, zzgdm zzgdmVar, zzcyr zzcyrVar) {
        this.zza = map;
        this.zzb = zzgdmVar;
        this.zzc = zzcyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyo
    public final mf.a zzc(final zzbvo zzbvoVar) {
        this.zzc.zzdn(zzbvoVar);
        mf.a aVarZzg = zzgdb.zzg(new zzdwe(3));
        for (String str : ((String) t.f12227d.f12230c.zzb(zzbdc.zziv)).split(",")) {
            final zzhgn zzhgnVar = (zzhgn) this.zza.get(str.trim());
            if (zzhgnVar != null) {
                aVarZzg = zzgdb.zzf(aVarZzg, zzdwe.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdyk
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final mf.a zza(Object obj) {
                        return ((zzdyo) zzhgnVar.zzb()).zzc(zzbvoVar);
                    }
                }, this.zzb);
            }
        }
        zzgdb.zzr(aVarZzg, new zzdyl(this), zzcad.zzg);
        return aVarZzg;
    }
}
