package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzedt implements zzedk {
    private final Context zza;
    private final zzcob zzb;
    private final Executor zzc;

    public zzedt(Context context, zzcob zzcobVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcobVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) {
        zzcny zzcnyVarZza = this.zzb.zza(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdey(new zzeds(this, zzedhVar, zzfbtVar), null), new zzcnz(zzfbtVar.zzaa));
        zzcnyVarZza.zzd().zzo(new zzcmb((zzfdm) zzedhVar.zzb), this.zzc);
        ((zzeev) zzedhVar.zzc).zzc(zzcnyVarZza.zzk());
        return zzcnyVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        zzfdm zzfdmVar = (zzfdm) zzedhVar.zzb;
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        String string = zzfbtVar.zzv.toString();
        zzfdmVar.zzl(this.zza, zzfcoVar.zzd, string, (zzbpu) zzedhVar.zzc);
    }
}
