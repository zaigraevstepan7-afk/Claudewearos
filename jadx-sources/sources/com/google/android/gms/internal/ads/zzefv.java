package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzefv implements zzedk {
    private final Context zza;
    private final zzdgu zzb;
    private final Executor zzc;

    public zzefv(Context context, zzdgu zzdguVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdguVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfcf zzfcfVar, int i10) {
        return zzfcfVar.zza.zza.zzg.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzegx, zzfcv {
        zzdim zzdimVarZzah;
        zzfdm zzfdmVar = (zzfdm) zzedhVar.zzb;
        zzbpz zzbpzVarZzD = zzfdmVar.zzD();
        zzbqa zzbqaVarZzE = zzfdmVar.zzE();
        zzbqd zzbqdVarZzd = zzfdmVar.zzd();
        if (zzbqdVarZzd != null && zzc(zzfcfVar, 6)) {
            zzdimVarZzah = zzdim.zzt(zzbqdVarZzd);
        } else if (zzbpzVarZzD != null && zzc(zzfcfVar, 6)) {
            zzdimVarZzah = zzdim.zzai(zzbpzVarZzD);
        } else if (zzbpzVarZzD != null && zzc(zzfcfVar, 2)) {
            zzdimVarZzah = zzdim.zzag(zzbpzVarZzD);
        } else if (zzbqaVarZzE != null && zzc(zzfcfVar, 6)) {
            zzdimVarZzah = zzdim.zzaj(zzbqaVarZzE);
        } else {
            if (zzbqaVarZzE == null || !zzc(zzfcfVar, 1)) {
                throw new zzegx(1, "No native ad mappers");
            }
            zzdimVarZzah = zzdim.zzah(zzbqaVarZzE);
        }
        if (zzdimVarZzah != null) {
            zzfco zzfcoVar = zzfcfVar.zza.zza;
            if (zzfcoVar.zzg.contains(Integer.toString(zzdimVarZzah.zzc()))) {
                zzdio zzdioVarZze = this.zzb.zze(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdiy(zzdimVarZzah), new zzdkr(zzbqaVarZzE, zzbpzVarZzD, zzbqdVarZzd));
                ((zzeev) zzedhVar.zzc).zzc(zzdioVarZze.zzk());
                zzdioVarZze.zzd().zzo(new zzcmb(zzfdmVar), this.zzc);
                return zzdioVarZze.zza();
            }
        }
        throw new zzegx(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws JSONException, zzfcv, IOException {
        zzfdm zzfdmVar = (zzfdm) zzedhVar.zzb;
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        String string = zzfbtVar.zzv.toString();
        String strB0 = hj.a.b0(zzfbtVar.zzs);
        zzfdmVar.zzp(this.zza, zzfcoVar.zzd, string, strB0, (zzbpu) zzedhVar.zzc, zzfcoVar.zzi, zzfcoVar.zzg);
    }
}
