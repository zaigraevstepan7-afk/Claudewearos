package com.google.android.gms.internal.ads;

import nc.h2;
import nc.t;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzewy implements zzgcx {
    final /* synthetic */ zzelf zza;
    final /* synthetic */ zzfhm zzb;
    final /* synthetic */ zzfhb zzc;
    final /* synthetic */ zzewz zzd;
    final /* synthetic */ zzexb zze;

    public zzewy(zzexb zzexbVar, zzelf zzelfVar, zzfhm zzfhmVar, zzfhb zzfhbVar, zzewz zzewzVar) {
        this.zza = zzelfVar;
        this.zzb = zzfhmVar;
        this.zzc = zzfhbVar;
        this.zzd = zzewzVar;
        this.zze = zzexbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        zzfhm zzfhmVar;
        zzbct zzbctVar = zzbdc.zzfV;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            l0.l("App open ad failed to load", th2);
        }
        zzexb zzexbVar = this.zze;
        zzcnx zzcnxVar = (zzcnx) zzexbVar.zze.zzd();
        final h2 h2VarZzb = zzcnxVar == null ? zzfdp.zzb(th2, null) : zzcnxVar.zzb().zza(th2);
        synchronized (zzexbVar) {
            try {
                zzexbVar.zzj = null;
                if (zzcnxVar != null) {
                    zzcnxVar.zzc().zzdD(h2VarZzb);
                    if (((Boolean) tVar.f12230c.zzb(zzbdc.zzit)).booleanValue()) {
                        zzexbVar.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewx
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zze.zzd.zzdD(h2VarZzb);
                            }
                        });
                    }
                } else {
                    zzexbVar.zzd.zzdD(h2VarZzb);
                    ((zzcnx) zzexbVar.zzm(this.zzd).zzh()).zzb().zzc().zzh();
                }
                zzfdl.zzb(h2VarZzb.f12114a, th2, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzexbVar.zzh;
                    zzfhb zzfhbVar = this.zzc;
                    zzfhbVar.zza(h2VarZzb);
                    zzfhbVar.zzh(th2);
                    zzfhbVar.zzg(false);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzc(h2VarZzb);
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
        zzcqv zzcqvVar = (zzcqv) obj;
        zzexb zzexbVar = this.zze;
        synchronized (zzexbVar) {
            try {
                zzexbVar.zzj = null;
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzit)).booleanValue()) {
                    zzcqvVar.zzn().zzb(zzexbVar.zzd);
                }
                this.zza.zzb(zzcqvVar);
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzexbVar.zzh;
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
