package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import mc.n;
import nc.h2;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdtb implements gc.e, zzcyt, nc.a, zzcvr, zzcwl, zzcwm, zzcxf, zzcvu, zzfgt {
    private final List zza;
    private final zzdsp zzb;
    private long zzc;

    public zzdtb(zzdsp zzdspVar, zzcgz zzcgzVar) {
        this.zzb = zzdspVar;
        this.zza = Collections.singletonList(zzcgzVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) throws IOException {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // nc.a
    public final void onAdClicked() throws IOException {
        zzg(nc.a.class, "onAdClicked", new Object[0]);
    }

    @Override // gc.e
    public final void onAppEvent(String str, String str2) throws IOException {
        zzg(gc.e.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zza() throws IOException {
        zzg(zzcvr.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzb() throws IOException {
        zzg(zzcvr.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzc() throws IOException {
        zzg(zzcvr.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzd(zzfgm zzfgmVar, String str) throws IOException {
        zzg(zzfgl.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(h2 h2Var) throws IOException {
        zzg(zzcvu.class, "onAdFailedToLoad", Integer.valueOf(h2Var.f12114a), h2Var.f12115b, h2Var.f12116c);
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdE(zzfgm zzfgmVar, String str) throws IOException {
        zzg(zzfgl.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdF(zzfgm zzfgmVar, String str, Throwable th2) throws IOException {
        zzg(zzfgl.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdG(zzfgm zzfgmVar, String str) throws IOException {
        zzg(zzfgl.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdj(Context context) throws IOException {
        zzg(zzcwm.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdl(Context context) throws IOException {
        zzg(zzcwm.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdm(Context context) throws IOException {
        zzg(zzcwm.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) throws IOException {
        n.D.f11584k.getClass();
        this.zzc = SystemClock.elapsedRealtime();
        zzg(zzcyt.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzdu(zzbwa zzbwaVar, String str, String str2) throws IOException {
        zzg(zzcvr.class, "onRewarded", zzbwaVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zze() throws IOException {
        zzg(zzcvr.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzf() throws IOException {
        zzg(zzcvr.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() throws IOException {
        zzg(zzcwl.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() throws IOException {
        n.D.f11584k.getClass();
        l0.k("Ad Request Latency : " + (SystemClock.elapsedRealtime() - this.zzc));
        zzg(zzcxf.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
    }
}
