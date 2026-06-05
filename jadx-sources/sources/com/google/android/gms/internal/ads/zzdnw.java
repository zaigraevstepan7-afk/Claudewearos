package com.google.android.gms.internal.ads;

import java.util.Objects;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdnw {
    private final zzcvp zza;
    private final zzcwy zzb;
    private final zzcxl zzc;
    private final zzcxx zzd;
    private final zzdas zze;
    private final zzddu zzf;
    private final zzdsc zzg;
    private final zzfjq zzh;
    private final zzebs zzi;
    private final zzcml zzj;

    public zzdnw(zzcvp zzcvpVar, zzcwy zzcwyVar, zzcxl zzcxlVar, zzcxx zzcxxVar, zzdas zzdasVar, zzddu zzdduVar, zzdsc zzdscVar, zzfjq zzfjqVar, zzebs zzebsVar, zzcml zzcmlVar) {
        this.zza = zzcvpVar;
        this.zzb = zzcwyVar;
        this.zzc = zzcxlVar;
        this.zzd = zzcxxVar;
        this.zze = zzdasVar;
        this.zzf = zzdduVar;
        this.zzg = zzdscVar;
        this.zzh = zzfjqVar;
        this.zzi = zzebsVar;
        this.zzj = zzcmlVar;
    }

    public final void zza(zzdnx zzdnxVar, zzcfe zzcfeVar) throws Throwable {
        zzdnu zzdnuVar = zzdnxVar.zza;
        final zzcwy zzcwyVar = this.zzb;
        Objects.requireNonNull(zzcwyVar);
        zzdnuVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new pc.c() { // from class: com.google.android.gms.internal.ads.zzdnv
            @Override // pc.c
            public final void zzg() {
                zzcwyVar.zzb();
            }
        }, this.zzf);
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkt)).booleanValue() || zzcfeVar == null || zzcfeVar.zzN() == null) {
            return;
        }
        zzcgw zzcgwVarZzN = zzcfeVar.zzN();
        zzcml zzcmlVar = this.zzj;
        zzebs zzebsVar = this.zzi;
        zzcgwVarZzN.zzM(zzcmlVar, zzebsVar, this.zzh);
        zzcgwVarZzN.zzO(zzcmlVar, zzebsVar, this.zzg);
    }
}
