package com.google.android.gms.internal.ads;

import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbnw implements zzcak {
    final /* synthetic */ zzbof zza;
    final /* synthetic */ zzfhb zzb;
    final /* synthetic */ zzbog zzc;

    public zzbnw(zzbog zzbogVar, zzbof zzbofVar, zzfhb zzfhbVar) {
        this.zza = zzbofVar;
        this.zzb = zzfhbVar;
        this.zzc = zzbogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcak
    public final void zza() {
        l0.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbog zzbogVar = this.zzc;
        synchronized (zzbogVar.zza) {
            try {
                l0.k("loadNewJavascriptEngine (failure): Lock acquired");
                zzbogVar.zzi = 1;
                l0.k("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzb();
                if (((Boolean) zzbev.zzd.zze()).booleanValue() && zzbogVar.zze != null) {
                    zzfhp zzfhpVar = zzbogVar.zze;
                    zzfhb zzfhbVar = this.zzb;
                    zzfhbVar.zzc("Failed loading new engine");
                    zzfhbVar.zzg(false);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l0.k("loadNewJavascriptEngine (failure): Lock released");
    }
}
