package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzduf extends zzbme {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfhb zzd;
    final /* synthetic */ zzcai zze;
    final /* synthetic */ zzdug zzf;

    public zzduf(zzdug zzdugVar, Object obj, String str, long j, zzfhb zzfhbVar, zzcai zzcaiVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfhbVar;
        this.zze = zzcaiVar;
        this.zzf = zzdugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zze(String str) {
        synchronized (this.zza) {
            zzdug zzdugVar = this.zzf;
            String str2 = this.zzb;
            n.D.f11584k.getClass();
            zzdugVar.zzv(str2, false, str, (int) (SystemClock.elapsedRealtime() - this.zzc));
            zzdugVar.zzl.zzb(str2, "error");
            zzdugVar.zzo.zzb(str2, "error");
            zzfhp zzfhpVar = zzdugVar.zzp;
            zzfhb zzfhbVar = this.zzd;
            zzfhbVar.zzc(str);
            zzfhbVar.zzg(false);
            zzfhpVar.zzc(zzfhbVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zzf() {
        synchronized (this.zza) {
            zzdug zzdugVar = this.zzf;
            String str = this.zzb;
            n.D.f11584k.getClass();
            zzdugVar.zzv(str, true, "", (int) (SystemClock.elapsedRealtime() - this.zzc));
            zzdugVar.zzl.zzd(str);
            zzdugVar.zzo.zzd(str);
            zzfhp zzfhpVar = zzdugVar.zzp;
            zzfhb zzfhbVar = this.zzd;
            zzfhbVar.zzg(true);
            zzfhpVar.zzc(zzfhbVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
