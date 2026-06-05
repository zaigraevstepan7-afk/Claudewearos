package com.google.android.gms.internal.ads;

import android.os.Bundle;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzegp extends zzegi {
    private final zzcgz zza;
    private final zzcuy zzb;
    private final zzdbp zzc;
    private final zzegt zzd;
    private final zzfcg zze;
    private final zzedj zzf;

    public zzegp(zzcgz zzcgzVar, zzcuy zzcuyVar, zzdbp zzdbpVar, zzfcg zzfcgVar, zzegt zzegtVar, zzedj zzedjVar) {
        this.zza = zzcgzVar;
        this.zzb = zzcuyVar;
        this.zzc = zzdbpVar;
        this.zze = zzfcgVar;
        this.zzd = zzegtVar;
        this.zzf = zzedjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegi
    public final mf.a zzc(zzfco zzfcoVar, Bundle bundle, zzfbt zzfbtVar, zzfcf zzfcfVar) {
        zzfcg zzfcgVar;
        zzcuy zzcuyVar = this.zzb;
        zzcuyVar.zzk(zzfcoVar);
        zzcuyVar.zzg(bundle);
        zzcuyVar.zzh(new zzcur(zzfcfVar, zzfbtVar, this.zzd));
        zzbct zzbctVar = zzbdc.zzdO;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && (zzfcgVar = this.zze) != null) {
            zzcuyVar.zzj(zzfcgVar);
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzdP)).booleanValue()) {
            zzcuyVar.zze(this.zzf);
        }
        zzdok zzdokVarZzh = this.zza.zzh();
        zzdokVarZzh.zzd(zzcuyVar.zzl());
        zzdokVarZzh.zzc(this.zzc);
        zzcrz zzcrzVarZzb = zzdokVarZzh.zze().zzb();
        return zzcrzVarZzb.zzh(zzcrzVarZzb.zzi());
    }
}
