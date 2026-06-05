package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import mc.n;
import nc.h2;
import nc.q3;
import nc.s3;
import nc.t;
import nc.w;
import org.json.JSONException;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeyf implements zzelg {
    private final Context zza;
    private final Executor zzb;
    private final zzcgz zzc;
    private final zzekq zzd;
    private final zzeku zze;
    private final ViewGroup zzf;
    private zzbdx zzg;
    private final zzcyo zzh;
    private final zzfhp zzi;
    private final zzdau zzj;
    private final zzfcm zzk;
    private mf.a zzl;
    private boolean zzm;
    private h2 zzn;
    private zzelf zzo;

    public zzeyf(Context context, Executor executor, s3 s3Var, zzcgz zzcgzVar, zzekq zzekqVar, zzeku zzekuVar, zzfcm zzfcmVar, zzdau zzdauVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgzVar;
        this.zzd = zzekqVar;
        this.zze = zzekuVar;
        this.zzk = zzfcmVar;
        this.zzh = zzcgzVar.zze();
        this.zzi = zzcgzVar.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdauVar;
        zzfcmVar.zzs(s3Var);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzt() {
        this.zzl = null;
        final h2 h2Var = this.zzn;
        this.zzn = null;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzis)).booleanValue() && h2Var != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zzdD(h2Var);
                }
            });
        }
        zzelf zzelfVar = this.zzo;
        if (zzelfVar != null) {
            zzelfVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza() {
        mf.a aVar = this.zzl;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zzb(q3 q3Var, String str, zzele zzeleVar, zzelf zzelfVar) throws JSONException {
        zzcps zzcpsVarZzk;
        if (str == null) {
            int i10 = l0.f13401b;
            k.d("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zzdD(zzfdp.zzd(6, null, null));
                }
            });
            return false;
        }
        if (!zza()) {
            zzbct zzbctVar = zzbdc.zzjg;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && q3Var.f12195f) {
                this.zzc.zzk().zzo(true);
            }
            Pair pair = new Pair(zzdrk.PUBLIC_API_CALL.zza(), Long.valueOf(q3Var.S));
            String strZza = zzdrk.DYNAMITE_ENTER.zza();
            n.D.f11584k.getClass();
            Bundle bundleZza = zzdrm.zza(pair, new Pair(strZza, Long.valueOf(System.currentTimeMillis())));
            zzfcm zzfcmVar = this.zzk;
            zzfcmVar.zzt(str);
            zzfcmVar.zzH(q3Var);
            zzfcmVar.zzA(bundleZza);
            Context context = this.zza;
            zzfco zzfcoVarZzJ = zzfcmVar.zzJ();
            zzfhb zzfhbVarZzb = zzfha.zzb(context, zzfhl.zzf(zzfcoVarZzJ), 3, q3Var);
            zzfhm zzfhmVarZzh = null;
            if (!((Boolean) zzbfi.zzd.zze()).booleanValue() || !zzfcmVar.zzh().D) {
                if (((Boolean) tVar.f12230c.zzb(zzbdc.zzis)).booleanValue()) {
                    zzcpr zzcprVarZzd = this.zzc.zzd();
                    zzcuy zzcuyVar = new zzcuy();
                    zzcuyVar.zzf(context);
                    zzcuyVar.zzk(zzfcoVarZzJ);
                    zzcprVarZzd.zzi(zzcuyVar.zzl());
                    zzdbn zzdbnVar = new zzdbn();
                    zzekq zzekqVar = this.zzd;
                    Executor executor = this.zzb;
                    zzdbnVar.zzj(zzekqVar, executor);
                    zzdbnVar.zzk(zzekqVar, executor);
                    zzcprVarZzd.zzf(zzdbnVar.zzn());
                    zzcprVarZzd.zze(new zzeiz(this.zzg));
                    zzcprVarZzd.zzd(new zzdgp(zzdix.zza, null));
                    zzcprVarZzd.zzg(new zzcqn(this.zzh, this.zzj));
                    zzcprVarZzd.zzc(new zzcok(this.zzf));
                    zzcpsVarZzk = zzcprVarZzd.zzh();
                } else {
                    zzcpr zzcprVarZzd2 = this.zzc.zzd();
                    zzcuy zzcuyVar2 = new zzcuy();
                    zzcuyVar2.zzf(context);
                    zzcuyVar2.zzk(zzfcoVarZzJ);
                    zzcprVarZzd2.zzi(zzcuyVar2.zzl());
                    zzdbn zzdbnVar2 = new zzdbn();
                    zzekq zzekqVar2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdbnVar2.zzj(zzekqVar2, executor2);
                    zzdbnVar2.zza(zzekqVar2, executor2);
                    zzdbnVar2.zza(this.zze, executor2);
                    zzdbnVar2.zzl(zzekqVar2, executor2);
                    zzdbnVar2.zzd(zzekqVar2, executor2);
                    zzdbnVar2.zze(zzekqVar2, executor2);
                    zzdbnVar2.zzf(zzekqVar2, executor2);
                    zzdbnVar2.zzb(zzekqVar2, executor2);
                    zzdbnVar2.zzk(zzekqVar2, executor2);
                    zzdbnVar2.zzi(zzekqVar2, executor2);
                    zzcprVarZzd2.zzf(zzdbnVar2.zzn());
                    zzcprVarZzd2.zze(new zzeiz(this.zzg));
                    zzcprVarZzd2.zzd(new zzdgp(zzdix.zza, null));
                    zzcprVarZzd2.zzg(new zzcqn(this.zzh, this.zzj));
                    zzcprVarZzd2.zzc(new zzcok(this.zzf));
                    zzcpsVarZzk = zzcprVarZzd2.zzh();
                }
                if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
                    zzfhmVarZzh = zzcpsVarZzk.zzh();
                    zzfhmVarZzh.zzi(3);
                    zzfhmVarZzh.zzb(q3Var.I);
                    zzfhmVarZzh.zzf(q3Var.F);
                }
                this.zzo = zzelfVar;
                zzcrz zzcrzVarZzc = zzcpsVarZzk.zzc();
                mf.a aVarZzh = zzcrzVarZzc.zzh(zzcrzVarZzc.zzi());
                this.zzl = aVarZzh;
                zzgdb.zzr(aVarZzh, new zzeye(this, zzfhmVarZzh, zzfhbVarZzb, zzcpsVarZzk), this.zzb);
                return true;
            }
            zzekq zzekqVar3 = this.zzd;
            if (zzekqVar3 != null) {
                zzekqVar3.zzdD(zzfdp.zzd(7, null, null));
            }
        } else if (!this.zzk.zzS()) {
            this.zzm = true;
            return false;
        }
        return false;
    }

    public final ViewGroup zzc() {
        return this.zzf;
    }

    public final zzfcm zzf() {
        return this.zzk;
    }

    public final void zzl() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzm() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final void zzn(w wVar) {
        this.zze.zza(wVar);
    }

    public final void zzo(zzcyi zzcyiVar) {
        this.zzh.zzo(zzcyiVar, this.zzb);
    }

    public final void zzp(zzbdx zzbdxVar) {
        this.zzg = zzbdxVar;
    }

    public final void zzq() {
        synchronized (this) {
            try {
                mf.a aVar = this.zzl;
                if (aVar != null && aVar.isDone()) {
                    try {
                        zzcon zzconVar = (zzcon) this.zzl.get();
                        this.zzl = null;
                        ViewGroup viewGroup = this.zzf;
                        viewGroup.removeAllViews();
                        zzconVar.zzd();
                        ViewParent parent = zzconVar.zzd().getParent();
                        if (parent instanceof ViewGroup) {
                            String str = "Banner view provided from " + (zzconVar.zzl() != null ? zzconVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.";
                            int i10 = l0.f13401b;
                            k.g(str);
                            ((ViewGroup) parent).removeView(zzconVar.zzd());
                        }
                        zzbct zzbctVar = zzbdc.zzis;
                        t tVar = t.f12227d;
                        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                            zzdac zzdacVarZzn = zzconVar.zzn();
                            zzdacVarZzn.zza(this.zzd);
                            zzdacVarZzn.zzc(this.zze);
                        }
                        viewGroup.addView(zzconVar.zzd());
                        zzelf zzelfVar = this.zzo;
                        if (zzelfVar != null) {
                            zzelfVar.zzb(zzconVar);
                        }
                        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                            Executor executor = this.zzb;
                            final zzekq zzekqVar = this.zzd;
                            Objects.requireNonNull(zzekqVar);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzekqVar.zzt();
                                }
                            });
                        }
                        if (zzconVar.zza() >= 0) {
                            this.zzm = false;
                            zzcyo zzcyoVar = this.zzh;
                            zzcyoVar.zzd(zzconVar.zza());
                            zzcyoVar.zze(zzconVar.zzc());
                        } else {
                            this.zzm = true;
                            this.zzh.zzd(zzconVar.zzc());
                        }
                    } catch (InterruptedException e10) {
                        e = e10;
                        zzt();
                        l0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zza();
                    } catch (ExecutionException e11) {
                        e = e11;
                        zzt();
                        l0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zza();
                    }
                } else if (this.zzl != null) {
                    l0.k("Show timer went off but there is an ongoing ad request.");
                    this.zzm = true;
                } else {
                    l0.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.zzm = true;
                    this.zzh.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzs() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        r0 r0Var = n.D.f11577c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return r0.p(view, powerManager, keyguardManager);
    }
}
