package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import fc.h;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import nc.l2;
import nc.q3;
import nc.s;
import nc.s3;
import org.json.JSONException;
import org.json.JSONObject;
import tc.f;
import tc.g;
import tc.j;
import tc.k;
import tc.l;
import tc.n;
import tc.p;
import tc.q;
import tc.r;
import tc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbqp extends zzbpq {
    private final Object zza;
    private zzbqr zzb;
    private zzbwl zzc;
    private xd.a zzd;
    private View zze;
    private k zzf;
    private t zzg;
    private r zzh;
    private p zzi;
    private j zzj;
    private f zzk;
    private final String zzl = "";

    public zzbqp(tc.a aVar) {
        this.zza = aVar;
    }

    private final Bundle zzV(q3 q3Var) {
        Bundle bundle;
        Bundle bundle2 = q3Var.F;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle zzW(String str, q3 q3Var, String str2) throws RemoteException {
        rc.k.b("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (q3Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", q3Var.f12196z);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th2) {
            rc.k.e("", th2);
            throw new RemoteException();
        }
    }

    private static final boolean zzX(q3 q3Var) {
        if (q3Var.f12195f) {
            return true;
        }
        rc.e eVar = s.f12202f.f12203a;
        return rc.e.n();
    }

    private static final String zzY(String str, q3 q3Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return q3Var.N;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzA(xd.a aVar, q3 q3Var, String str, zzbpu zzbpuVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof tc.a)) {
            rc.k.g(tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        rc.k.b("Requesting rewarded ad from adapter.");
        try {
            zzbqn zzbqnVar = new zzbqn(this, zzbpuVar);
            zzW(str, q3Var, null);
            zzV(q3Var);
            zzX(q3Var);
            Location location = q3Var.D;
            zzY(str, q3Var);
            ((tc.a) obj).loadRewardedAd(new q(), zzbqnVar);
        } catch (Exception e10) {
            rc.k.e("", e10);
            zzbpl.zza(aVar, e10, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzB(q3 q3Var, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof tc.a) {
            zzA(this.zzd, q3Var, str, new zzbqs((tc.a) obj, this.zzc));
            return;
        }
        rc.k.g(tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzC(xd.a aVar, q3 q3Var, String str, zzbpu zzbpuVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof tc.a)) {
            rc.k.g(tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        rc.k.b("Requesting rewarded interstitial ad from adapter.");
        try {
            zzbqn zzbqnVar = new zzbqn(this, zzbpuVar);
            zzW(str, q3Var, null);
            zzV(q3Var);
            zzX(q3Var);
            Location location = q3Var.D;
            zzY(str, q3Var);
            ((tc.a) obj).loadRewardedInterstitialAd(new q(), zzbqnVar);
        } catch (Exception e10) {
            zzbpl.zza(aVar, e10, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzD(xd.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof tc.e) {
            try {
                ((tc.e) obj).onPause();
            } catch (Throwable th2) {
                rc.k.e("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof tc.e) {
            try {
                ((tc.e) obj).onResume();
            } catch (Throwable th2) {
                rc.k.e("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzG(boolean z2) {
        Object obj = this.zza;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z2);
                return;
            } catch (Throwable th2) {
                rc.k.e("", th2);
                return;
            }
        }
        rc.k.b(AbstractAdViewAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzH(xd.a aVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof tc.a) {
            rc.k.b("Show app open ad from adapter.");
            rc.k.d("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        rc.k.g(tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzI() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            rc.k.b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th2) {
                rc.k.e("", th2);
                throw new RemoteException();
            }
        }
        rc.k.g(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzJ(xd.a aVar) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof tc.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzI();
                return;
            } else {
                rc.k.b("Show interstitial ad from adapter.");
                rc.k.d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        rc.k.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzK(xd.a aVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof tc.a) {
            rc.k.b("Show rewarded ad from adapter.");
            rc.k.d("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        rc.k.g(tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzL() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof tc.a) {
            rc.k.d("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        rc.k.g(tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final boolean zzN() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof tc.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        rc.k.g(tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbpz zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbqa zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final l2 zzh() {
        Object obj = this.zza;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th2) {
                rc.k.e("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbhh zzi() {
        zzbhi zzbhiVarZzc;
        zzbqr zzbqrVar = this.zzb;
        if (zzbqrVar == null || (zzbhiVarZzc = zzbqrVar.zzc()) == null) {
            return null;
        }
        return zzbhiVarZzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbpx zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbqd zzk() {
        t tVar;
        t tVarZza;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof tc.a) || (tVar = this.zzg) == null) {
                return null;
            }
            return new zzbqv(tVar);
        }
        zzbqr zzbqrVar = this.zzb;
        if (zzbqrVar == null || (tVarZza = zzbqrVar.zza()) == null) {
            return null;
        }
        return new zzbqv(tVarZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbsc zzl() {
        Object obj = this.zza;
        if (!(obj instanceof tc.a)) {
            return null;
        }
        ((tc.a) obj).getVersionInfo();
        return zzbsc.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbsc zzm() {
        Object obj = this.zza;
        if (!(obj instanceof tc.a)) {
            return null;
        }
        ((tc.a) obj).getSDKVersionInfo();
        return zzbsc.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final xd.a zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new xd.b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th2) {
                rc.k.e("", th2);
                throw new RemoteException();
            }
        }
        if (obj instanceof tc.a) {
            return new xd.b(this.zze);
        }
        rc.k.g(MediationBannerAdapter.class.getCanonicalName() + " or " + tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof tc.e) {
            try {
                ((tc.e) obj).onDestroy();
            } catch (Throwable th2) {
                rc.k.e("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzp(xd.a aVar, q3 q3Var, String str, zzbwl zzbwlVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof tc.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = aVar;
            this.zzc = zzbwlVar;
            zzbwlVar.zzl(new xd.b(obj));
            return;
        }
        rc.k.g(tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    @Override // com.google.android.gms.internal.ads.zzbpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzq(xd.a r7, com.google.android.gms.internal.ads.zzbmf r8, java.util.List r9) throws android.os.RemoteException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zza
            boolean r1 = r0 instanceof tc.a
            if (r1 == 0) goto L9f
            com.google.android.gms.internal.ads.zzbqi r1 = new com.google.android.gms.internal.ads.zzbqi
            r1.<init>(r6, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L14:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r9.next()
            com.google.android.gms.internal.ads.zzbml r2 = (com.google.android.gms.internal.ads.zzbml) r2
            java.lang.String r2 = r2.zza
            int r3 = r2.hashCode()
            r4 = 0
            fc.b r5 = fc.b.APP_OPEN_AD
            switch(r3) {
                case -1396342996: goto L7e;
                case -1052618729: goto L73;
                case -239580146: goto L68;
                case 604727084: goto L5d;
                case 1167692200: goto L54;
                case 1778294298: goto L38;
                case 1911491517: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L88
        L2d:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L88
            fc.b r4 = fc.b.REWARDED_INTERSTITIAL
            goto L88
        L38:
            java.lang.String r3 = "app_open_ad"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L88
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.internal.ads.zzbdc.zzmc
            nc.t r3 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r3 = r3.f12230c
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L88
        L52:
            r4 = r5
            goto L88
        L54:
            java.lang.String r3 = "app_open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L88
            goto L52
        L5d:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L88
            fc.b r4 = fc.b.INTERSTITIAL
            goto L88
        L68:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L88
            fc.b r4 = fc.b.REWARDED
            goto L88
        L73:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L88
            fc.b r4 = fc.b.NATIVE
            goto L88
        L7e:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L88
            fc.b r4 = fc.b.BANNER
        L88:
            if (r4 == 0) goto L14
            lh.e r2 = new lh.e
            r2.<init>()
            r8.add(r2)
            goto L14
        L93:
            tc.a r0 = (tc.a) r0
            java.lang.Object r7 = xd.b.u(r7)
            android.content.Context r7 = (android.content.Context) r7
            r0.initialize(r7, r1, r8)
            return
        L9f:
            android.os.RemoteException r7 = new android.os.RemoteException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqp.zzq(xd.a, com.google.android.gms.internal.ads.zzbmf, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzr(xd.a aVar, zzbwl zzbwlVar, List list) throws RemoteException {
        rc.k.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzs(q3 q3Var, String str) throws RemoteException {
        zzB(q3Var, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzt(xd.a aVar, q3 q3Var, String str, zzbpu zzbpuVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof tc.a)) {
            rc.k.g(tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        rc.k.b("Requesting app open ad from adapter.");
        try {
            zzbqo zzbqoVar = new zzbqo(this, zzbpuVar);
            zzW(str, q3Var, null);
            zzV(q3Var);
            zzX(q3Var);
            Location location = q3Var.D;
            zzY(str, q3Var);
            ((tc.a) obj).loadAppOpenAd(new g(), zzbqoVar);
        } catch (Exception e10) {
            rc.k.e("", e10);
            zzbpl.zza(aVar, e10, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzu(xd.a aVar, s3 s3Var, q3 q3Var, String str, zzbpu zzbpuVar) throws RemoteException {
        zzv(aVar, s3Var, q3Var, str, null, zzbpuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzv(xd.a aVar, s3 s3Var, q3 q3Var, String str, String str2, zzbpu zzbpuVar) throws RemoteException {
        h hVar;
        Object obj = this.zza;
        boolean z2 = obj instanceof MediationBannerAdapter;
        if (!z2 && !(obj instanceof tc.a)) {
            rc.k.g(MediationBannerAdapter.class.getCanonicalName() + " or " + tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        rc.k.b("Requesting banner ad from adapter.");
        boolean z10 = s3Var.G;
        int i10 = s3Var.f12221b;
        int i11 = s3Var.f12224e;
        if (z10) {
            h hVar2 = new h(i11, i10);
            hVar2.f6702e = true;
            hVar2.f6703f = i10;
            hVar = hVar2;
        } else {
            hVar = new h(i11, i10, s3Var.f12220a);
        }
        if (z2) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
                List list = q3Var.f12194e;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j = q3Var.f12191b;
                zzbqg zzbqgVar = new zzbqg(j == -1 ? null : new Date(j), q3Var.f12193d, hashSet, q3Var.D, zzX(q3Var), q3Var.f12196z, q3Var.K, q3Var.M, zzY(str, q3Var));
                Bundle bundle = q3Var.F;
                mediationBannerAdapter.requestBannerAd((Context) xd.b.u(aVar), new zzbqr(zzbpuVar), zzW(str, q3Var, str2), hVar, zzbqgVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th2) {
                rc.k.e("", th2);
                zzbpl.zza(aVar, th2, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof tc.a) {
            try {
                zzbqj zzbqjVar = new zzbqj(this, zzbpuVar);
                zzW(str, q3Var, str2);
                zzV(q3Var);
                zzX(q3Var);
                Location location = q3Var.D;
                zzY(str, q3Var);
                ((tc.a) obj2).loadBannerAd(new tc.h(), zzbqjVar);
            } catch (Throwable th3) {
                rc.k.e("", th3);
                zzbpl.zza(aVar, th3, "adapter.loadBannerAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzw(xd.a aVar, s3 s3Var, q3 q3Var, String str, String str2, zzbpu zzbpuVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof tc.a)) {
            rc.k.g(tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        rc.k.b("Requesting interscroller ad from adapter.");
        try {
            tc.a aVar2 = (tc.a) obj;
            zzbqh zzbqhVar = new zzbqh(this, zzbpuVar, aVar2);
            zzW(str, q3Var, str2);
            zzV(q3Var);
            zzX(q3Var);
            Location location = q3Var.D;
            zzY(str, q3Var);
            int i10 = s3Var.f12224e;
            int i11 = s3Var.f12221b;
            h hVar = new h(i10, i11);
            hVar.f6704g = true;
            hVar.f6705h = i11;
            zzbqhVar.onFailure(new fc.a(7, aVar2.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Exception e10) {
            rc.k.e("", e10);
            zzbpl.zza(aVar, e10, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzx(xd.a aVar, q3 q3Var, String str, zzbpu zzbpuVar) throws RemoteException {
        zzy(aVar, q3Var, str, null, zzbpuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzy(xd.a aVar, q3 q3Var, String str, String str2, zzbpu zzbpuVar) throws RemoteException {
        Object obj = this.zza;
        boolean z2 = obj instanceof MediationInterstitialAdapter;
        if (!z2 && !(obj instanceof tc.a)) {
            rc.k.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        rc.k.b("Requesting interstitial ad from adapter.");
        if (z2) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
                List list = q3Var.f12194e;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j = q3Var.f12191b;
                zzbqg zzbqgVar = new zzbqg(j == -1 ? null : new Date(j), q3Var.f12193d, hashSet, q3Var.D, zzX(q3Var), q3Var.f12196z, q3Var.K, q3Var.M, zzY(str, q3Var));
                Bundle bundle = q3Var.F;
                mediationInterstitialAdapter.requestInterstitialAd((Context) xd.b.u(aVar), new zzbqr(zzbpuVar), zzW(str, q3Var, str2), zzbqgVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th2) {
                rc.k.e("", th2);
                zzbpl.zza(aVar, th2, "adapter.requestInterstitialAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof tc.a) {
            try {
                zzbqk zzbqkVar = new zzbqk(this, zzbpuVar);
                zzW(str, q3Var, str2);
                zzV(q3Var);
                zzX(q3Var);
                Location location = q3Var.D;
                zzY(str, q3Var);
                ((tc.a) obj2).loadInterstitialAd(new l(), zzbqkVar);
            } catch (Throwable th3) {
                rc.k.e("", th3);
                zzbpl.zza(aVar, th3, "adapter.loadInterstitialAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzz(xd.a aVar, q3 q3Var, String str, String str2, zzbpu zzbpuVar, zzbgc zzbgcVar, List list) throws RemoteException {
        Object obj = this.zza;
        boolean z2 = obj instanceof MediationNativeAdapter;
        if (!z2 && !(obj instanceof tc.a)) {
            rc.k.g(MediationNativeAdapter.class.getCanonicalName() + " or " + tc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        rc.k.b("Requesting native ad from adapter.");
        if (z2) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list2 = q3Var.f12194e;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j = q3Var.f12191b;
                zzbqu zzbquVar = new zzbqu(j == -1 ? null : new Date(j), q3Var.f12193d, hashSet, q3Var.D, zzX(q3Var), q3Var.f12196z, zzbgcVar, list, q3Var.K, q3Var.M, zzY(str, q3Var));
                Bundle bundle = q3Var.F;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbqr(zzbpuVar);
                mediationNativeAdapter.requestNativeAd((Context) xd.b.u(aVar), this.zzb, zzW(str, q3Var, str2), zzbquVar, bundle2);
                return;
            } catch (Throwable th2) {
                rc.k.e("", th2);
                zzbpl.zza(aVar, th2, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof tc.a) {
            try {
                zzbqm zzbqmVar = new zzbqm(this, zzbpuVar);
                zzW(str, q3Var, str2);
                zzV(q3Var);
                zzX(q3Var);
                Location location = q3Var.D;
                zzY(str, q3Var);
                ((tc.a) obj2).loadNativeAdMapper(new n(), zzbqmVar);
            } catch (Throwable th3) {
                rc.k.e("", th3);
                zzbpl.zza(aVar, th3, "adapter.loadNativeAdMapper");
                String message = th3.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    tc.a aVar2 = (tc.a) this.zza;
                    zzbql zzbqlVar = new zzbql(this, zzbpuVar);
                    zzW(str, q3Var, str2);
                    zzV(q3Var);
                    zzX(q3Var);
                    Location location2 = q3Var.D;
                    zzY(str, q3Var);
                    aVar2.loadNativeAd(new n(), zzbqlVar);
                } catch (Throwable th4) {
                    rc.k.e("", th4);
                    zzbpl.zza(aVar, th4, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    public zzbqp(tc.e eVar) {
        this.zza = eVar;
    }
}
