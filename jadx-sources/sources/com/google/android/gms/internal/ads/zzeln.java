package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;
import mc.n;
import nc.b1;
import nc.q3;
import nc.t;
import org.json.JSONException;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeln implements zzelg {
    private final zzfcm zza;
    private final zzcgz zzb;
    private final Context zzc;
    private final zzeld zzd;
    private final zzfhp zze;
    private zzcrk zzf;

    public zzeln(zzcgz zzcgzVar, Context context, zzeld zzeldVar, zzfcm zzfcmVar) {
        this.zzb = zzcgzVar;
        this.zzc = context;
        this.zzd = zzeldVar;
        this.zza = zzfcmVar;
        this.zze = zzcgzVar.zzy();
        zzfcmVar.zzv(zzeldVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza() {
        zzcrk zzcrkVar = this.zzf;
        return zzcrkVar != null && zzcrkVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zzb(q3 q3Var, String str, zzele zzeleVar, zzelf zzelfVar) throws JSONException {
        n nVar = n.D;
        r0 r0Var = nVar.f11577c;
        Context context = this.zzc;
        if (r0.g(context) && q3Var.L == null) {
            int i10 = l0.f13401b;
            k.d("Failed to load the ad because app ID is missing.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeli
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zza().zzdD(zzfdp.zzd(4, null, null));
                }
            });
            return false;
        }
        if (str == null) {
            int i11 = l0.f13401b;
            k.d("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zza().zzdD(zzfdp.zzd(6, null, null));
                }
            });
            return false;
        }
        boolean z2 = q3Var.f12195f;
        zzfdl.zza(context, z2);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjg)).booleanValue() && z2) {
            this.zzb.zzk().zzo(true);
        }
        int i12 = ((zzelh) zzeleVar).zza;
        nVar.f11584k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzdrk.PUBLIC_API_CALL.zza();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Bundle bundleZza = zzdrm.zza(new Pair(strZza, lValueOf), new Pair(zzdrk.DYNAMITE_ENTER.zza(), lValueOf));
        zzfcm zzfcmVar = this.zza;
        zzfcmVar.zzH(q3Var);
        zzfcmVar.zzA(bundleZza);
        zzfcmVar.zzC(i12);
        zzfco zzfcoVarZzJ = zzfcmVar.zzJ();
        zzfhb zzfhbVarZzb = zzfha.zzb(context, zzfhl.zzf(zzfcoVarZzJ), 8, q3Var);
        b1 b1Var = zzfcoVarZzJ.zzn;
        if (b1Var != null) {
            this.zzd.zzd().zzm(b1Var);
        }
        zzcgz zzcgzVar = this.zzb;
        zzdgt zzdgtVarZzg = zzcgzVar.zzg();
        zzcuy zzcuyVar = new zzcuy();
        zzcuyVar.zzf(context);
        zzcuyVar.zzk(zzfcoVarZzJ);
        zzdgtVarZzg.zzf(zzcuyVar.zzl());
        zzdbn zzdbnVar = new zzdbn();
        zzeld zzeldVar = this.zzd;
        zzdbnVar.zzk(zzeldVar.zzd(), zzcgzVar.zzA());
        zzdgtVarZzg.zze(zzdbnVar.zzn());
        zzdgtVarZzg.zzd(zzeldVar.zzc());
        zzfhm zzfhmVarZzf = null;
        zzdgtVarZzg.zzc(new zzcok(null));
        zzdgu zzdguVarZzg = zzdgtVarZzg.zzg();
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            zzfhmVarZzf = zzdguVarZzg.zzf();
            zzfhmVarZzf.zzi(8);
            zzfhmVarZzf.zzb(q3Var.I);
            zzfhmVarZzf.zzf(q3Var.F);
        }
        zzcgzVar.zzx().zzc(1);
        zzgdm zzgdmVarZzc = zzffm.zzc();
        ScheduledExecutorService scheduledExecutorServiceZzB = zzcgzVar.zzB();
        zzcrz zzcrzVarZza = zzdguVarZzg.zza();
        zzcrk zzcrkVar = new zzcrk(zzgdmVarZzc, scheduledExecutorServiceZzB, zzcrzVarZza.zzh(zzcrzVarZza.zzi()));
        this.zzf = zzcrkVar;
        zzcrkVar.zze(new zzelm(this, zzelfVar, zzfhmVarZzf, zzfhbVarZzb, zzdguVarZzg));
        return true;
    }
}
