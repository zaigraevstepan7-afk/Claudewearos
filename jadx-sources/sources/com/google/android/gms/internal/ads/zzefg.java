package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzefg implements zzedk {
    private final Context zza;
    private final zzdfy zzb;
    private final rc.a zzc;
    private final Executor zzd;

    public zzefg(Context context, rc.a aVar, zzdfy zzdfyVar, Executor executor) {
        this.zza = context;
        this.zzc = aVar;
        this.zzb = zzdfyVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) {
        zzdev zzdevVarZzd = this.zzb.zzd(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdey(new zzeff(this, zzedhVar, zzfbtVar), null));
        zzdevVarZzd.zzd().zzo(new zzcmb((zzfdm) zzedhVar.zzb), this.zzd);
        ((zzeev) zzedhVar.zzc).zzc(zzdevVarZzd.zzk());
        return zzdevVarZzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws JSONException, zzfcv, IOException {
        zzfdm zzfdmVar = (zzfdm) zzedhVar.zzb;
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        String string = zzfbtVar.zzv.toString();
        String strB0 = hj.a.b0(zzfbtVar.zzs);
        zzfdmVar.zzo(this.zza, zzfcoVar.zzd, string, strB0, (zzbpu) zzedhVar.zzc);
    }
}
