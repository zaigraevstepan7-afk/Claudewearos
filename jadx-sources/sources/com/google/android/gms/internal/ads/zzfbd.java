package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import nc.h2;
import nc.t;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfbd implements zzgcx {
    final /* synthetic */ zzelf zza;
    final /* synthetic */ zzfhm zzb;
    final /* synthetic */ zzfhb zzc;
    final /* synthetic */ zzfbe zzd;
    final /* synthetic */ zzfbg zze;

    public zzfbd(zzfbg zzfbgVar, zzelf zzelfVar, zzfhm zzfhmVar, zzfhb zzfhbVar, zzfbe zzfbeVar) {
        this.zza = zzelfVar;
        this.zzb = zzfhmVar;
        this.zzc = zzfhbVar;
        this.zzd = zzfbeVar;
        this.zze = zzfbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        zzfhm zzfhmVar;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfV)).booleanValue()) {
            l0.l("Rewarded ad failed to load", th2);
        }
        zzfbg zzfbgVar = this.zze;
        zzdol zzdolVar = (zzdol) zzfbgVar.zze.zzd();
        final h2 h2VarZzb = zzdolVar == null ? zzfdp.zzb(th2, null) : zzdolVar.zzb().zza(th2);
        synchronized (zzfbgVar) {
            try {
                if (zzdolVar != null) {
                    zzdolVar.zza().zzdD(h2VarZzb);
                    zzfbgVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbb
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdD(h2VarZzb);
                        }
                    });
                } else {
                    zzfbgVar.zzd.zzdD(h2VarZzb);
                    zzfbgVar.zzk(this.zzd).zzh().zzb().zzc().zzh();
                }
                zzfdl.zzb(h2VarZzb.f12114a, th2, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzfbgVar.zzg;
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
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhm zzfhmVar;
        zzfbg zzfbgVar = this.zze;
        zzdog zzdogVar = (zzdog) obj;
        synchronized (zzfbgVar) {
            try {
                zzdogVar.zzn().zzd(zzfbgVar.zzd);
                this.zza.zzb(zzdogVar);
                Executor executor = zzfbgVar.zzb;
                final zzfaw zzfawVar = zzfbgVar.zzd;
                Objects.requireNonNull(zzfawVar);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfawVar.zzt();
                    }
                });
                zzfbgVar.zzd.onAdMetadataChanged();
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzfbgVar.zzg;
                    zzfhb zzfhbVar = this.zzc;
                    zzfhbVar.zzb(zzdogVar.zzp().zzb);
                    zzfhbVar.zzd(zzdogVar.zzl().zzg());
                    zzfhbVar.zzg(true);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzg(zzdogVar.zzp().zzb);
                    zzfhmVar.zze(zzdogVar.zzl().zzg());
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
