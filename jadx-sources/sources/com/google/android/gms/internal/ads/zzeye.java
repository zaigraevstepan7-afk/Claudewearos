package com.google.android.gms.internal.ads;

import nc.h2;
import nc.t;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzeye implements zzgcx {
    final /* synthetic */ zzfhm zza;
    final /* synthetic */ zzfhb zzb;
    final /* synthetic */ zzcps zzc;
    final /* synthetic */ zzeyf zzd;

    public zzeye(zzeyf zzeyfVar, zzfhm zzfhmVar, zzfhb zzfhbVar, zzcps zzcpsVar) {
        this.zza = zzfhmVar;
        this.zzb = zzfhbVar;
        this.zzc = zzcpsVar;
        this.zzd = zzeyfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        zzfhm zzfhmVar;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfV)).booleanValue()) {
            l0.l("Banner ad failed to load", th2);
        }
        zzeyf zzeyfVar = this.zzd;
        synchronized (zzeyfVar) {
            try {
                zzcps zzcpsVar = this.zzc;
                h2 h2VarZza = zzcpsVar.zzc().zza(th2);
                zzeyfVar.zzn = h2VarZza;
                zzcpsVar.zze().zzdD(h2VarZza);
                zzfdl.zzb(h2VarZza.f12114a, th2, "BannerAdLoader.onFailure");
                if (zzeyfVar.zzm) {
                    zzeyfVar.zzt();
                    zzeyfVar.zzh.zzd(zzeyfVar.zzj.zzc());
                }
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zza) == null) {
                    zzfhp zzfhpVar = zzeyfVar.zzi;
                    zzfhb zzfhbVar = this.zzb;
                    zzfhbVar.zza(h2VarZza);
                    zzfhbVar.zzh(th2);
                    zzfhbVar.zzg(false);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzc(h2VarZza);
                    zzfhb zzfhbVar2 = this.zzb;
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
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhm zzfhmVar;
        zzeyf zzeyfVar = this.zzd;
        zzcon zzconVar = (zzcon) obj;
        synchronized (zzeyfVar) {
            try {
                if (zzeyfVar.zzm) {
                    zzeyfVar.zzq();
                }
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zza) == null) {
                    zzfhp zzfhpVar = zzeyfVar.zzi;
                    zzfhb zzfhbVar = this.zzb;
                    zzfhbVar.zzb(zzconVar.zzp().zzb);
                    zzfhbVar.zzd(zzconVar.zzl().zzg());
                    zzfhbVar.zzg(true);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzg(zzconVar.zzp().zzb);
                    zzfhmVar.zze(zzconVar.zzl().zzg());
                    zzfhb zzfhbVar2 = this.zzb;
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
