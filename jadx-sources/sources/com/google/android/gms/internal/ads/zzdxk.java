package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdxk implements zzgcx {
    final /* synthetic */ zzdxl zza;

    public zzdxk(zzdxl zzdxlVar) {
        this.zza = zzdxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgq)).booleanValue()) {
            Matcher matcher = zzdxl.zza.matcher(th2.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
        zzfcf zzfcfVar = (zzfcf) obj;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgq)).booleanValue()) {
            zzdxl zzdxlVar = this.zza;
            zzeao zzeaoVar = zzdxlVar.zzf;
            zzfbw zzfbwVar = zzfcfVar.zzb.zzb;
            zzeaoVar.zzi(zzfbwVar.zzf);
            zzdxlVar.zzf.zzj(zzfbwVar.zzg);
        }
    }
}
