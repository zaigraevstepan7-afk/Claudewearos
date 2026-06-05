package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeic implements zzedk {
    private final Context zza;
    private final Executor zzb;
    private final zzdol zzc;

    public zzeic(Context context, Executor executor, zzdol zzdolVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdolVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) {
        try {
            ((zzfdm) zzedhVar.zzb).zzk(zzfcfVar.zza.zza.zzd, zzfbtVar.zzv.toString());
        } catch (Exception e10) {
            String str = zzedhVar.zza;
            int i10 = l0.f13401b;
            k.h("Fail to load ad from adapter ".concat(String.valueOf(str)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) {
        zzdoh zzdohVarZzd = this.zzc.zzd(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdoi(new zzeia(this, zzedhVar, zzfbtVar)));
        zzdohVarZzd.zzd().zzo(new zzcmb((zzfdm) zzedhVar.zzb), this.zzb);
        zzcwy zzcwyVarZze = zzdohVarZzd.zze();
        zzcvp zzcvpVarZzb = zzdohVarZzd.zzb();
        ((zzeew) zzedhVar.zzc).zzc(new zzeib(this, zzdohVarZzd.zza(), zzcvpVarZzb, zzcwyVarZze, zzdohVarZzd.zzg()));
        return zzdohVarZzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        zzfdm zzfdmVar = (zzfdm) zzedhVar.zzb;
        if (zzfdmVar.zzC()) {
            zze(zzfcfVar, zzfbtVar, zzedhVar);
            return;
        }
        zzehz zzehzVar = new zzehz(this, zzfcfVar, zzfbtVar, zzedhVar);
        zzcxb zzcxbVar = zzedhVar.zzc;
        ((zzeew) zzcxbVar).zzd(zzehzVar);
        Context context = this.zza;
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        String string = zzfbtVar.zzv.toString();
        zzfdmVar.zzh(context, zzfcoVar.zzd, null, (zzbwl) zzcxbVar, string);
    }
}
