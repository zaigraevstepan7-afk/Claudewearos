package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfbg implements zzelg {
    private final Context zza;
    private final Executor zzb;
    private final zzcgz zzc;
    private final zzfaw zzd;
    private final zzezk zze;
    private final zzfcg zzf;
    private final zzfhp zzg;
    private final zzfcm zzh;
    private mf.a zzi;

    public zzfbg(Context context, Executor executor, zzcgz zzcgzVar, zzezk zzezkVar, zzfaw zzfawVar, zzfcm zzfcmVar, zzfcg zzfcgVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgzVar;
        this.zze = zzezkVar;
        this.zzd = zzfawVar;
        this.zzh = zzfcmVar;
        this.zzf = zzfcgVar;
        this.zzg = zzcgzVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdok zzk(zzezi zzeziVar) {
        zzdok zzdokVarZzh = this.zzc.zzh();
        zzcuy zzcuyVar = new zzcuy();
        zzcuyVar.zzf(this.zza);
        zzcuyVar.zzk(((zzfbe) zzeziVar).zza);
        zzcuyVar.zzj(this.zzf);
        zzdokVarZzh.zzd(zzcuyVar.zzl());
        zzdokVarZzh.zzc(new zzdbn().zzn());
        return zzdokVarZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    @Override // com.google.android.gms.internal.ads.zzelg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(nc.q3 r27, java.lang.String r28, com.google.android.gms.internal.ads.zzele r29, com.google.android.gms.internal.ads.zzelf r30) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbg.zzb(nc.q3, java.lang.String, com.google.android.gms.internal.ads.zzele, com.google.android.gms.internal.ads.zzelf):boolean");
    }

    public final void zzj(int i10) {
        this.zzh.zzp().zza(i10);
    }
}
