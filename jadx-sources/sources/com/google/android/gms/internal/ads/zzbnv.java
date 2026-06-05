package com.google.android.gms.internal.ads;

import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbnv implements zzcam {
    final /* synthetic */ zzbof zza;
    final /* synthetic */ zzfhb zzb;
    final /* synthetic */ zzbog zzc;

    public zzbnv(zzbog zzbogVar, zzbof zzbofVar, zzfhb zzfhbVar) {
        this.zza = zzbofVar;
        this.zzb = zzfhbVar;
        this.zzc = zzbogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        l0.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbog zzbogVar = this.zzc;
        synchronized (zzbogVar.zza) {
            try {
                l0.k("loadNewJavascriptEngine (success): Lock acquired");
                zzbogVar.zzi = 0;
                if (zzbogVar.zzh != null && this.zza != zzbogVar.zzh) {
                    l0.k("New JS engine is loaded, marking previous one as destroyable.");
                    zzbogVar.zzh.zzb();
                }
                zzbogVar.zzh = this.zza;
                if (((Boolean) zzbev.zzd.zze()).booleanValue() && zzbogVar.zze != null) {
                    zzfhp zzfhpVar = zzbogVar.zze;
                    zzfhb zzfhbVar = this.zzb;
                    zzfhbVar.zzg(true);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l0.k("loadNewJavascriptEngine (success): Lock released");
    }
}
