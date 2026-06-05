package com.google.android.gms.internal.ads;

import nc.h2;
import nc.t;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzezv implements zzgcx {
    final /* synthetic */ zzelf zza;
    final /* synthetic */ zzfhm zzb;
    final /* synthetic */ zzfhb zzc;
    final /* synthetic */ zzdfy zzd;
    final /* synthetic */ zzezw zze;

    public zzezv(zzezw zzezwVar, zzelf zzelfVar, zzfhm zzfhmVar, zzfhb zzfhbVar, zzdfy zzdfyVar) {
        this.zza = zzelfVar;
        this.zzb = zzfhmVar;
        this.zzc = zzfhbVar;
        this.zzd = zzdfyVar;
        this.zze = zzezwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        zzfhm zzfhmVar;
        zzbct zzbctVar = zzbdc.zzfV;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            l0.l("Interstitial ad failed to load", th2);
        }
        zzdfy zzdfyVar = this.zzd;
        final h2 h2VarZza = zzdfyVar.zza().zza(th2);
        zzezw zzezwVar = this.zze;
        synchronized (zzezwVar) {
            try {
                zzezwVar.zzi = null;
                zzdfyVar.zzb().zzdD(h2VarZza);
                if (((Boolean) tVar.f12230c.zzb(zzbdc.zziu)).booleanValue()) {
                    zzezwVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezr
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdD(h2VarZza);
                        }
                    });
                    zzezwVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezs
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zze.zzdD(h2VarZza);
                        }
                    });
                }
                zzfdl.zzb(h2VarZza.f12114a, th2, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzezwVar.zzg;
                    zzfhb zzfhbVar = this.zzc;
                    zzfhbVar.zza(h2VarZza);
                    zzfhbVar.zzh(th2);
                    zzfhbVar.zzg(false);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzc(h2VarZza);
                    zzfhb zzfhbVar2 = this.zzc;
                    zzfhbVar2.zzh(th2);
                    zzfhbVar2.zzg(false);
                    zzfhmVar.zza(zzfhbVar2);
                    zzfhmVar.zzh();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
        zzfhm zzfhmVar;
        zzdeu zzdeuVar = (zzdeu) obj;
        zzezw zzezwVar = this.zze;
        synchronized (zzezwVar) {
            try {
                zzezwVar.zzi = null;
                zzbct zzbctVar = zzbdc.zziu;
                t tVar = t.f12227d;
                if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                    zzdac zzdacVarZzn = zzdeuVar.zzn();
                    zzdacVarZzn.zza(zzezwVar.zzd);
                    zzdacVarZzn.zzd(zzezwVar.zze);
                }
                this.zza.zzb(zzdeuVar);
                if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                    zzezwVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezt
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzt();
                        }
                    });
                    zzezwVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezu
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zze.zzt();
                        }
                    });
                }
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzezwVar.zzg;
                    zzfhb zzfhbVar = this.zzc;
                    zzfhbVar.zzb(zzdeuVar.zzp().zzb);
                    zzfhbVar.zzd(zzdeuVar.zzl().zzg());
                    zzfhbVar.zzg(true);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzg(zzdeuVar.zzp().zzb);
                    zzfhmVar.zze(zzdeuVar.zzl().zzg());
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
