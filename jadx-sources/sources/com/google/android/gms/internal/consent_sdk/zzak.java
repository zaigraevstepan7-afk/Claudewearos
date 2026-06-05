package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzak implements zzax {
    final zzdr zza;
    final zzdr zzb;
    final zzdr zzc;
    final zzdr zzd;
    final zzdr zze;
    private final zzah zzf;

    public zzak(zzah zzahVar, zzbq zzbqVar) {
        this.zzf = zzahVar;
        zzdr zzdrVarZzb = zzdn.zzb(new zzby(zzahVar.zza));
        this.zza = zzdrVarZzb;
        zzdo zzdoVarZzb = zzdp.zzb(zzbqVar);
        this.zzb = zzdoVarZzb;
        zzdm zzdmVar = new zzdm();
        this.zzc = zzdmVar;
        zzdr zzdrVar = zzahVar.zza;
        zzat zzatVar = zzas.zza;
        zzav zzavVar = zzau.zza;
        zzdr zzdrVar2 = zzahVar.zzg;
        zzdr zzdrVar3 = zzahVar.zzj;
        zzdr zzdrVar4 = zzahVar.zzb;
        zzcc zzccVar = new zzcc(zzdrVar, zzdrVarZzb, zzatVar, zzavVar, zzdrVar2, zzdrVar3, zzdmVar, zzdrVar4);
        this.zzd = zzccVar;
        zzbw zzbwVar = new zzbw(zzdrVarZzb, zzatVar, zzccVar);
        this.zze = zzbwVar;
        zzdm.zzb(zzdmVar, zzdn.zzb(new zzbd(zzdrVar, zzahVar.zzc, zzdrVarZzb, zzdrVar4, zzdoVarZzb, zzbwVar)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzax
    public final zzbc zza() {
        return (zzbc) this.zzc.zza();
    }
}
