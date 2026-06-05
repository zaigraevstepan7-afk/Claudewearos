package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzehg implements zzedk {
    private final Context zza;
    private final Executor zzb;
    private final zzdol zzc;

    public zzehg(Context context, Executor executor, zzdol zzdolVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) {
        zzdoh zzdohVarZzd = this.zzc.zzd(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdoi(new zzehf(this, zzedhVar, zzfbtVar)));
        zzdohVarZzd.zzd().zzo(new zzcmb((zzfdm) zzedhVar.zzb), this.zzb);
        ((zzeev) zzedhVar.zzc).zzc(zzdohVarZzd.zzn());
        return zzdohVarZzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) {
        try {
            zzfco zzfcoVar = zzfcfVar.zza.zza;
            if (zzfcoVar.zzo.zza == 3) {
                ((zzfdm) zzedhVar.zzb).zzr(this.zza, zzfcoVar.zzd, zzfbtVar.zzv.toString(), (zzbpu) zzedhVar.zzc);
            } else {
                ((zzfdm) zzedhVar.zzb).zzq(this.zza, zzfcoVar.zzd, zzfbtVar.zzv.toString(), (zzbpu) zzedhVar.zzc);
            }
        } catch (Exception e10) {
            String str = zzedhVar.zza;
            int i10 = l0.f13401b;
            k.h("Fail to load ad from adapter ".concat(String.valueOf(str)), e10);
        }
    }
}
