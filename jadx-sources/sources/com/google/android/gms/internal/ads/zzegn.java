package com.google.android.gms.internal.ads;

import android.os.Bundle;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzegn extends zzegi {
    private final zzcgz zza;
    private final zzcuy zzb;
    private final zzeiz zzc;
    private final zzdbp zzd;
    private final zzegt zze;
    private final zzedj zzf;

    public zzegn(zzcgz zzcgzVar, zzcuy zzcuyVar, zzeiz zzeizVar, zzdbp zzdbpVar, zzegt zzegtVar, zzedj zzedjVar) {
        this.zza = zzcgzVar;
        this.zzb = zzcuyVar;
        this.zzc = zzeizVar;
        this.zzd = zzdbpVar;
        this.zze = zzegtVar;
        this.zzf = zzedjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegi
    public final mf.a zzc(zzfco zzfcoVar, Bundle bundle, zzfbt zzfbtVar, zzfcf zzfcfVar) {
        zzcuy zzcuyVar = this.zzb;
        zzcuyVar.zzk(zzfcoVar);
        zzcuyVar.zzg(bundle);
        zzcuyVar.zzh(new zzcur(zzfcfVar, zzfbtVar, this.zze));
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdP)).booleanValue()) {
            zzcuyVar.zze(this.zzf);
        }
        zzdfx zzdfxVarZzf = this.zza.zzf();
        zzdfxVarZzf.zze(zzcuyVar.zzl());
        zzdfxVarZzf.zzd(this.zzd);
        zzdfxVarZzf.zzc(this.zzc);
        zzcrz zzcrzVarZza = zzdfxVarZzf.zzf().zza();
        return zzcrzVarZza.zzh(zzcrzVarZza.zzi());
    }
}
