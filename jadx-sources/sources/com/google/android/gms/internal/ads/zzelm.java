package com.google.android.gms.internal.ads;

import nc.h2;
import nc.t;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzelm implements zzgcx {
    final /* synthetic */ zzelf zza;
    final /* synthetic */ zzfhm zzb;
    final /* synthetic */ zzfhb zzc;
    final /* synthetic */ zzdgu zzd;
    final /* synthetic */ zzeln zze;

    public zzelm(zzeln zzelnVar, zzelf zzelfVar, zzfhm zzfhmVar, zzfhb zzfhbVar, zzdgu zzdguVar) {
        this.zza = zzelfVar;
        this.zzb = zzfhmVar;
        this.zzc = zzfhbVar;
        this.zzd = zzdguVar;
        this.zze = zzelnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        zzfhm zzfhmVar;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfV)).booleanValue()) {
            l0.l("Native ad failed to load", th2);
        }
        zzdgu zzdguVar = this.zzd;
        final h2 h2VarZza = zzdguVar.zza().zza(th2);
        zzdguVar.zzb().zzdD(h2VarZza);
        zzeln zzelnVar = this.zze;
        zzelnVar.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzell
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze.zzd.zza().zzdD(h2VarZza);
            }
        });
        zzfdl.zzb(h2VarZza.f12114a, th2, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
            zzfhp zzfhpVar = zzelnVar.zze;
            zzfhb zzfhbVar = this.zzc;
            zzfhbVar.zza(h2VarZza);
            zzfhbVar.zzh(th2);
            zzfhbVar.zzg(false);
            zzfhpVar.zzc(zzfhbVar.zzm());
            return;
        }
        zzfhmVar.zzc(h2VarZza);
        zzfhb zzfhbVar2 = this.zzc;
        zzfhbVar2.zzh(th2);
        zzfhbVar2.zzg(false);
        zzfhmVar.zza(zzfhbVar2);
        zzfhmVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhm zzfhmVar;
        zzeln zzelnVar = this.zze;
        zzcqv zzcqvVar = (zzcqv) obj;
        synchronized (zzelnVar) {
            try {
                zzcqvVar.zzn().zza(zzelnVar.zzd.zzd());
                this.zza.zzb(zzcqvVar);
                zzelnVar.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzb().zzt();
                    }
                });
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzelnVar.zze;
                    zzfhb zzfhbVar = this.zzc;
                    zzfhbVar.zzb(zzcqvVar.zzp().zzb);
                    zzfhbVar.zzd(zzcqvVar.zzl().zzg());
                    zzfhbVar.zzg(true);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzg(zzcqvVar.zzp().zzb);
                    zzfhmVar.zze(zzcqvVar.zzl().zzg());
                    zzfhb zzfhbVar2 = this.zzc;
                    zzfhbVar2.zzg(true);
                    zzfhmVar.zza(zzfhbVar2);
                    zzfhmVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
