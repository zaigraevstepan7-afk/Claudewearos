package com.google.android.gms.internal.ads;

import android.os.Bundle;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzegj extends zzegi {
    private final zzcgz zza;
    private final zzcuy zzb;
    private final zzdbp zzc;
    private final zzegt zzd;
    private final zzedj zze;

    public zzegj(zzcgz zzcgzVar, zzcuy zzcuyVar, zzdbp zzdbpVar, zzegt zzegtVar, zzedj zzedjVar) {
        this.zza = zzcgzVar;
        this.zzb = zzcuyVar;
        this.zzc = zzdbpVar;
        this.zzd = zzegtVar;
        this.zze = zzedjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegi
    public final mf.a zzc(zzfco zzfcoVar, Bundle bundle, zzfbt zzfbtVar, zzfcf zzfcfVar) {
        zzcuy zzcuyVar = this.zzb;
        zzcuyVar.zzk(zzfcoVar);
        zzcuyVar.zzg(bundle);
        zzcuyVar.zzh(new zzcur(zzfcfVar, zzfbtVar, this.zzd));
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdP)).booleanValue()) {
            zzcuyVar.zze(this.zze);
        }
        zzcoa zzcoaVarZzc = this.zza.zzc();
        zzcoaVarZzc.zzd(zzcuyVar.zzl());
        zzcoaVarZzc.zzc(this.zzc);
        zzcrz zzcrzVarZzb = zzcoaVarZzc.zze().zzb();
        return zzcrzVarZzb.zzh(zzcrzVarZzb.zzi());
    }
}
