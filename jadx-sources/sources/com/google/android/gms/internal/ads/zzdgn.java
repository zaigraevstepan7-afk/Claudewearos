package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdgn implements zzcqy {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhgn zzd;
    private final zzdix zze;

    public zzdgn(Map map, Map map2, Map map3, zzhgn zzhgnVar, zzdix zzdixVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhgnVar;
        this.zze = zzdixVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final zzede zza(int i10, String str) {
        zzede zzedeVarZza;
        zzede zzedeVar = (zzede) this.zza.get(str);
        if (zzedeVar != null) {
            return zzedeVar;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            zzefn zzefnVar = (zzefn) this.zzc.get(str);
            if (zzefnVar != null) {
                return new zzedf(zzefnVar, new zzfut() { // from class: com.google.android.gms.internal.ads.zzcra
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj) {
                        return new zzcrd((List) obj);
                    }
                });
            }
            zzedeVarZza = (zzede) this.zzb.get(str);
            if (zzedeVarZza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zzedeVarZza = ((zzcqy) this.zzd.zzb()).zza(i10, str)) == null) {
            return null;
        }
        return new zzedf(zzedeVarZza, new zzfut() { // from class: com.google.android.gms.internal.ads.zzcrb
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return new zzcrd((zzcqv) obj);
            }
        });
    }
}
