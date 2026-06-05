package com.google.android.gms.internal.ads;

import nc.t;
import rc.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcmk implements zzgcx {
    final /* synthetic */ zzfjq zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ p zzc;
    final /* synthetic */ zzcml zzd;

    public zzcmk(zzcml zzcmlVar, zzfjq zzfjqVar, String str, p pVar) {
        this.zza = zzfjqVar;
        this.zzb = str;
        this.zzc = pVar;
        this.zzd = zzcmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(final Throwable th2) {
        zzgdm zzgdmVar = this.zzd.zzg;
        final zzfjq zzfjqVar = this.zza;
        final String str = this.zzb;
        final p pVar = this.zzc;
        zzgdmVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmi
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkB)).booleanValue();
                zzcmk zzcmkVar = this.zza;
                Throwable th3 = th2;
                if (zBooleanValue) {
                    zzcml zzcmlVar = zzcmkVar.zzd;
                    zzbun zzbunVarZzc = zzbul.zzc(zzcmlVar.zzc);
                    zzcmlVar.zzb = zzbunVarZzc;
                    zzbunVarZzc.zzh(th3, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcml zzcmlVar2 = zzcmkVar.zzd;
                    zzbun zzbunVarZza = zzbul.zza(zzcmlVar2.zzc);
                    zzcmlVar2.zza = zzbunVarZza;
                    zzbunVarZza.zzh(th3, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                p pVar2 = pVar;
                zzfjqVar.zzd(str, pVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfjq zzfjqVar = this.zza;
        final String str = (String) obj;
        zzgdm zzgdmVar = this.zzd.zzg;
        final p pVar = this.zzc;
        zzgdmVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmj
            @Override // java.lang.Runnable
            public final void run() {
                zzfjqVar.zzd(str, pVar, null, null);
            }
        });
    }
}
