package com.google.android.gms.internal.ads;

import org.json.JSONException;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdti {
    private final zzblc zza;

    public zzdti(zzblc zzblcVar) {
        this.zza = zzblcVar;
    }

    private final void zzs(zzdtg zzdtgVar) throws JSONException {
        String strZza = zzdtg.zza(zzdtgVar);
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i10 = l0.f13401b;
        k.f(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() {
        zzs(new zzdtg("initialize", null));
    }

    public final void zzb(long j) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("interstitial", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onAdClicked";
        this.zza.zzb(zzdtg.zza(zzdtgVar));
    }

    public final void zzc(long j) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("interstitial", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onAdClosed";
        zzs(zzdtgVar);
    }

    public final void zzd(long j, int i10) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("interstitial", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onAdFailedToLoad";
        zzdtgVar.zzd = Integer.valueOf(i10);
        zzs(zzdtgVar);
    }

    public final void zze(long j) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("interstitial", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onAdLoaded";
        zzs(zzdtgVar);
    }

    public final void zzf(long j) {
        zzdtg zzdtgVar = new zzdtg("interstitial", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtgVar);
    }

    public final void zzg(long j) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("interstitial", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onAdOpened";
        zzs(zzdtgVar);
    }

    public final void zzh(long j) {
        zzdtg zzdtgVar = new zzdtg("creation", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "nativeObjectCreated";
        zzs(zzdtgVar);
    }

    public final void zzi(long j) {
        zzdtg zzdtgVar = new zzdtg("creation", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "nativeObjectNotCreated";
        zzs(zzdtgVar);
    }

    public final void zzj(long j) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("rewarded", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onAdClicked";
        zzs(zzdtgVar);
    }

    public final void zzk(long j) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("rewarded", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onRewardedAdClosed";
        zzs(zzdtgVar);
    }

    public final void zzl(long j, zzbwq zzbwqVar) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("rewarded", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onUserEarnedReward";
        zzdtgVar.zze = zzbwqVar.zzf();
        zzdtgVar.zzf = Integer.valueOf(zzbwqVar.zze());
        zzs(zzdtgVar);
    }

    public final void zzm(long j, int i10) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("rewarded", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onRewardedAdFailedToLoad";
        zzdtgVar.zzd = Integer.valueOf(i10);
        zzs(zzdtgVar);
    }

    public final void zzn(long j, int i10) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("rewarded", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onRewardedAdFailedToShow";
        zzdtgVar.zzd = Integer.valueOf(i10);
        zzs(zzdtgVar);
    }

    public final void zzo(long j) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("rewarded", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onAdImpression";
        zzs(zzdtgVar);
    }

    public final void zzp(long j) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("rewarded", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onRewardedAdLoaded";
        zzs(zzdtgVar);
    }

    public final void zzq(long j) {
        zzdtg zzdtgVar = new zzdtg("rewarded", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtgVar);
    }

    public final void zzr(long j) throws JSONException {
        zzdtg zzdtgVar = new zzdtg("rewarded", null);
        zzdtgVar.zza = Long.valueOf(j);
        zzdtgVar.zzc = "onRewardedAdOpened";
        zzs(zzdtgVar);
    }
}
