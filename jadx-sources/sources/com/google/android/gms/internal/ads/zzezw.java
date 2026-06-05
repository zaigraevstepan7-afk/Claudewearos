package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;
import mc.n;
import nc.q3;
import nc.s3;
import nc.t;
import org.json.JSONException;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzezw implements zzelg {
    private final Context zza;
    private final Executor zzb;
    private final zzcgz zzc;
    private final zzekq zzd;
    private final zzfaw zze;
    private zzbdx zzf;
    private final zzfhp zzg;
    private final zzfcm zzh;
    private mf.a zzi;

    public zzezw(Context context, Executor executor, zzcgz zzcgzVar, zzekq zzekqVar, zzfaw zzfawVar, zzfcm zzfcmVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgzVar;
        this.zzd = zzekqVar;
        this.zzh = zzfcmVar;
        this.zze = zzfawVar;
        this.zzg = zzcgzVar.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza() {
        mf.a aVar = this.zzi;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zzb(q3 q3Var, String str, zzele zzeleVar, zzelf zzelfVar) throws JSONException {
        zzdfy zzdfyVarZzf;
        zzfhm zzfhmVarZze;
        if (str == null) {
            int i10 = l0.f13401b;
            k.d("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zzdD(zzfdp.zzd(6, null, null));
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        zzbct zzbctVar = zzbdc.zzjg;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && q3Var.f12195f) {
            this.zzc.zzk().zzo(true);
        }
        s3 s3Var = ((zzezp) zzeleVar).zza;
        Pair pair = new Pair(zzdrk.PUBLIC_API_CALL.zza(), Long.valueOf(q3Var.S));
        String strZza = zzdrk.DYNAMITE_ENTER.zza();
        n.D.f11584k.getClass();
        Bundle bundleZza = zzdrm.zza(pair, new Pair(strZza, Long.valueOf(System.currentTimeMillis())));
        zzfcm zzfcmVar = this.zzh;
        zzfcmVar.zzt(str);
        zzfcmVar.zzs(s3Var);
        zzfcmVar.zzH(q3Var);
        zzfcmVar.zzA(bundleZza);
        Context context = this.zza;
        zzfco zzfcoVarZzJ = zzfcmVar.zzJ();
        zzfhb zzfhbVarZzb = zzfha.zzb(context, zzfhl.zzf(zzfcoVarZzJ), 4, q3Var);
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zziu)).booleanValue()) {
            zzdfx zzdfxVarZzf = this.zzc.zzf();
            zzcuy zzcuyVar = new zzcuy();
            zzcuyVar.zzf(context);
            zzcuyVar.zzk(zzfcoVarZzJ);
            zzdfxVarZzf.zze(zzcuyVar.zzl());
            zzdbn zzdbnVar = new zzdbn();
            zzekq zzekqVar = this.zzd;
            Executor executor = this.zzb;
            zzdbnVar.zzj(zzekqVar, executor);
            zzdbnVar.zzk(zzekqVar, executor);
            zzdfxVarZzf.zzd(zzdbnVar.zzn());
            zzdfxVarZzf.zzc(new zzeiz(this.zzf));
            zzdfyVarZzf = zzdfxVarZzf.zzh();
        } else {
            zzdbn zzdbnVar2 = new zzdbn();
            zzfaw zzfawVar = this.zze;
            if (zzfawVar != null) {
                Executor executor2 = this.zzb;
                zzdbnVar2.zze(zzfawVar, executor2);
                zzdbnVar2.zzf(zzfawVar, executor2);
                zzdbnVar2.zzb(zzfawVar, executor2);
            }
            zzdfx zzdfxVarZzf2 = this.zzc.zzf();
            zzcuy zzcuyVar2 = new zzcuy();
            zzcuyVar2.zzf(context);
            zzcuyVar2.zzk(zzfcoVarZzJ);
            zzdfxVarZzf2.zze(zzcuyVar2.zzl());
            zzekq zzekqVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdbnVar2.zzj(zzekqVar2, executor3);
            zzdbnVar2.zze(zzekqVar2, executor3);
            zzdbnVar2.zzf(zzekqVar2, executor3);
            zzdbnVar2.zzb(zzekqVar2, executor3);
            zzdbnVar2.zza(zzekqVar2, executor3);
            zzdbnVar2.zzl(zzekqVar2, executor3);
            zzdbnVar2.zzk(zzekqVar2, executor3);
            zzdbnVar2.zzi(zzekqVar2, executor3);
            zzdbnVar2.zzc(zzekqVar2, executor3);
            zzdfxVarZzf2.zzd(zzdbnVar2.zzn());
            zzdfxVarZzf2.zzc(new zzeiz(this.zzf));
            zzdfyVarZzf = zzdfxVarZzf2.zzh();
        }
        zzdfy zzdfyVar = zzdfyVarZzf;
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            zzfhmVarZze = zzdfyVar.zze();
            zzfhmVarZze.zzi(4);
            zzfhmVarZze.zzb(q3Var.I);
            zzfhmVarZze.zzf(q3Var.F);
        } else {
            zzfhmVarZze = null;
        }
        zzfhm zzfhmVar = zzfhmVarZze;
        zzcrz zzcrzVarZza = zzdfyVar.zza();
        mf.a aVarZzh = zzcrzVarZza.zzh(zzcrzVarZza.zzi());
        this.zzi = aVarZzh;
        zzgdb.zzr(aVarZzh, new zzezv(this, zzelfVar, zzfhmVar, zzfhbVarZzb, zzdfyVar), this.zzb);
        return true;
    }

    public final void zzi(zzbdx zzbdxVar) {
        this.zzf = zzbdxVar;
    }
}
