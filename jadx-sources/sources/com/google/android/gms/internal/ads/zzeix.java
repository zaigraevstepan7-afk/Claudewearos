package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeix implements zzede {
    private final zzbdx zza;
    private final zzgdm zzb;
    private final zzfgs zzc;
    private final zzejg zzd;

    public zzeix(zzfgs zzfgsVar, zzgdm zzgdmVar, zzbdx zzbdxVar, zzejg zzejgVar) {
        this.zzc = zzfgsVar;
        this.zzb = zzgdmVar;
        this.zza = zzbdxVar;
        this.zzd = zzejgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final mf.a zza(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzcai zzcaiVar = new zzcai();
        zzejc zzejcVar = new zzejc();
        zzejcVar.zzd(new zzeiw(this, zzcaiVar, zzfcfVar, zzfbtVar, zzejcVar));
        zzfby zzfbyVar = zzfbtVar.zzs;
        final zzbds zzbdsVar = new zzbds(zzejcVar, zzfbyVar.zzb, zzfbyVar.zza);
        zzfgm zzfgmVar = zzfgm.CUSTOM_RENDER_SYN;
        return zzfgc.zzd(new zzffx() { // from class: com.google.android.gms.internal.ads.zzeiv
            @Override // com.google.android.gms.internal.ads.zzffx
            public final void zza() {
                this.zza.zza.zze(zzbdsVar);
            }
        }, this.zzb, zzfgmVar, this.zzc).zzb(zzfgm.CUSTOM_RENDER_ACK).zzd(zzcaiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzfby zzfbyVar;
        return (this.zza == null || (zzfbyVar = zzfbtVar.zzs) == null || zzfbyVar.zza == null) ? false : true;
    }
}
