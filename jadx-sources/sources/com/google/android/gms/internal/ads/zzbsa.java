package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import fc.h;
import java.util.Iterator;
import nc.l2;
import nc.q3;
import nc.s;
import nc.s3;
import org.json.JSONException;
import org.json.JSONObject;
import tc.f;
import tc.g;
import tc.k;
import tc.l;
import tc.n;
import tc.p;
import tc.q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbsa extends zzbrm {
    private final RtbAdapter zza;
    private k zzb;
    private p zzc;
    private f zzd;
    private String zze = "";

    public zzbsa(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(q3 q3Var) {
        Bundle bundle;
        Bundle bundle2 = q3Var.F;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzw(String str) throws RemoteException {
        rc.k.g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e10) {
            rc.k.e("", e10);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(q3 q3Var) {
        if (q3Var.f12195f) {
            return true;
        }
        rc.e eVar = s.f12202f.f12203a;
        return rc.e.n();
    }

    private static final String zzy(String str, q3 q3Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return q3Var.N;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final l2 zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final zzbsc zzf() {
        this.zza.getVersionInfo();
        return zzbsc.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final zzbsc zzg() {
        this.zza.getSDKVersionInfo();
        return zzbsc.zza(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (((java.lang.Boolean) nc.t.f12227d.f12230c.zzb(com.google.android.gms.internal.ads.zzbdc.zzmc)).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r4.equals("app_open") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r4.equals("interstitial") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r4.equals("rewarded") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r4.equals("native") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r4.equals("banner") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        new java.util.ArrayList().add(new lh.e());
        r8 = (android.content.Context) xd.b.u(r3);
        new fc.h(r7.f12224e, r7.f12221b, r7.f12220a);
        r6.collectSignals(new vc.a(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r4.equals("rewarded_interstitial") != false) goto L29;
     */
    @Override // com.google.android.gms.internal.ads.zzbrn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(xd.a r3, java.lang.String r4, android.os.Bundle r5, android.os.Bundle r6, nc.s3 r7, com.google.android.gms.internal.ads.zzbrq r8) throws android.os.RemoteException {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.zzbry r5 = new com.google.android.gms.internal.ads.zzbry     // Catch: java.lang.Throwable -> L36
            r5.<init>(r2, r8)     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r6 = r2.zza     // Catch: java.lang.Throwable -> L36
            lh.e r8 = new lh.e     // Catch: java.lang.Throwable -> L36
            int r0 = r4.hashCode()     // Catch: java.lang.Throwable -> L36
            switch(r0) {
                case -1396342996: goto L5c;
                case -1052618729: goto L53;
                case -239580146: goto L4a;
                case 604727084: goto L41;
                case 1167692200: goto L38;
                case 1778294298: goto L1b;
                case 1911491517: goto L12;
                default: goto L10;
            }
        L10:
            goto L89
        L12:
            java.lang.String r0 = "rewarded_interstitial"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L89
            goto L64
        L1b:
            java.lang.String r0 = "app_open_ad"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L89
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.internal.ads.zzbdc.zzmc     // Catch: java.lang.Throwable -> L36
            nc.t r0 = nc.t.f12227d     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbda r0 = r0.f12230c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r0.zzb(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L36
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L89
            goto L64
        L36:
            r4 = move-exception
            goto L91
        L38:
            java.lang.String r0 = "app_open"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L89
            goto L64
        L41:
            java.lang.String r0 = "interstitial"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L89
            goto L64
        L4a:
            java.lang.String r0 = "rewarded"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L89
            goto L64
        L53:
            java.lang.String r0 = "native"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L89
            goto L64
        L5c:
            java.lang.String r0 = "banner"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L89
        L64:
            r8.<init>()     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L36
            r4.add(r8)     // Catch: java.lang.Throwable -> L36
            vc.a r4 = new vc.a     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = xd.b.u(r3)     // Catch: java.lang.Throwable -> L36
            android.content.Context r8 = (android.content.Context) r8     // Catch: java.lang.Throwable -> L36
            int r8 = r7.f12224e     // Catch: java.lang.Throwable -> L36
            int r0 = r7.f12221b     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = r7.f12220a     // Catch: java.lang.Throwable -> L36
            fc.h r1 = new fc.h     // Catch: java.lang.Throwable -> L36
            r1.<init>(r8, r0, r7)     // Catch: java.lang.Throwable -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L36
            r6.collectSignals(r4, r5)     // Catch: java.lang.Throwable -> L36
            return
        L89:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "Internal Error"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L36
            throw r4     // Catch: java.lang.Throwable -> L36
        L91:
            java.lang.String r5 = "Error generating signals for RTB"
            rc.k.e(r5, r4)
            java.lang.String r5 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.zzbpl.zza(r3, r4, r5)
            android.os.RemoteException r3 = new android.os.RemoteException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsa.zzh(xd.a, java.lang.String, android.os.Bundle, android.os.Bundle, nc.s3, com.google.android.gms.internal.ads.zzbrq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzi(String str, String str2, q3 q3Var, xd.a aVar, zzbqy zzbqyVar, zzbpu zzbpuVar) throws RemoteException {
        try {
            zzbrx zzbrxVar = new zzbrx(this, zzbqyVar, zzbpuVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(q3Var);
            zzx(q3Var);
            Location location = q3Var.D;
            zzy(str2, q3Var);
            rtbAdapter.loadRtbAppOpenAd(new g(), zzbrxVar);
        } catch (Throwable th2) {
            rc.k.e("Adapter failed to render app open ad.", th2);
            zzbpl.zza(aVar, th2, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzj(String str, String str2, q3 q3Var, xd.a aVar, zzbrb zzbrbVar, zzbpu zzbpuVar, s3 s3Var) throws RemoteException {
        try {
            zzbrs zzbrsVar = new zzbrs(this, zzbrbVar, zzbpuVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(q3Var);
            zzx(q3Var);
            Location location = q3Var.D;
            zzy(str2, q3Var);
            new h(s3Var.f12224e, s3Var.f12221b, s3Var.f12220a);
            rtbAdapter.loadRtbBannerAd(new tc.h(), zzbrsVar);
        } catch (Throwable th2) {
            rc.k.e("Adapter failed to render banner ad.", th2);
            zzbpl.zza(aVar, th2, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzk(String str, String str2, q3 q3Var, xd.a aVar, zzbrb zzbrbVar, zzbpu zzbpuVar, s3 s3Var) throws RemoteException {
        try {
            zzbrt zzbrtVar = new zzbrt(this, zzbrbVar, zzbpuVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(q3Var);
            zzx(q3Var);
            Location location = q3Var.D;
            zzy(str2, q3Var);
            new h(s3Var.f12224e, s3Var.f12221b, s3Var.f12220a);
            zzbrtVar.onFailure(new fc.a(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Throwable th2) {
            rc.k.e("Adapter failed to render interscroller ad.", th2);
            zzbpl.zza(aVar, th2, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzl(String str, String str2, q3 q3Var, xd.a aVar, zzbre zzbreVar, zzbpu zzbpuVar) throws RemoteException {
        try {
            zzbru zzbruVar = new zzbru(this, zzbreVar, zzbpuVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(q3Var);
            zzx(q3Var);
            Location location = q3Var.D;
            zzy(str2, q3Var);
            rtbAdapter.loadRtbInterstitialAd(new l(), zzbruVar);
        } catch (Throwable th2) {
            rc.k.e("Adapter failed to render interstitial ad.", th2);
            zzbpl.zza(aVar, th2, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzm(String str, String str2, q3 q3Var, xd.a aVar, zzbrh zzbrhVar, zzbpu zzbpuVar) throws RemoteException {
        zzn(str, str2, q3Var, aVar, zzbrhVar, zzbpuVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzn(String str, String str2, q3 q3Var, xd.a aVar, zzbrh zzbrhVar, zzbpu zzbpuVar, zzbgc zzbgcVar) throws RemoteException {
        try {
            zzbrv zzbrvVar = new zzbrv(this, zzbrhVar, zzbpuVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(q3Var);
            zzx(q3Var);
            Location location = q3Var.D;
            zzy(str2, q3Var);
            rtbAdapter.loadRtbNativeAdMapper(new n(), zzbrvVar);
        } catch (Throwable th2) {
            rc.k.e("Adapter failed to render native ad.", th2);
            zzbpl.zza(aVar, th2, "adapter.loadRtbNativeAdMapper");
            String message = th2.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                zzbrw zzbrwVar = new zzbrw(this, zzbrhVar, zzbpuVar);
                RtbAdapter rtbAdapter2 = this.zza;
                zzw(str2);
                zzv(q3Var);
                zzx(q3Var);
                Location location2 = q3Var.D;
                zzy(str2, q3Var);
                rtbAdapter2.loadRtbNativeAd(new n(), zzbrwVar);
            } catch (Throwable th3) {
                rc.k.e("Adapter failed to render native ad.", th3);
                zzbpl.zza(aVar, th3, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzo(String str, String str2, q3 q3Var, xd.a aVar, zzbrk zzbrkVar, zzbpu zzbpuVar) throws RemoteException {
        try {
            zzbrz zzbrzVar = new zzbrz(this, zzbrkVar, zzbpuVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(q3Var);
            zzx(q3Var);
            Location location = q3Var.D;
            zzy(str2, q3Var);
            rtbAdapter.loadRtbRewardedInterstitialAd(new q(), zzbrzVar);
        } catch (Throwable th2) {
            rc.k.e("Adapter failed to render rewarded interstitial ad.", th2);
            zzbpl.zza(aVar, th2, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzp(String str, String str2, q3 q3Var, xd.a aVar, zzbrk zzbrkVar, zzbpu zzbpuVar) throws RemoteException {
        try {
            zzbrz zzbrzVar = new zzbrz(this, zzbrkVar, zzbpuVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(q3Var);
            zzx(q3Var);
            Location location = q3Var.D;
            zzy(str2, q3Var);
            rtbAdapter.loadRtbRewardedAd(new q(), zzbrzVar);
        } catch (Throwable th2) {
            rc.k.e("Adapter failed to render rewarded ad.", th2);
            zzbpl.zza(aVar, th2, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzq(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzr(xd.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzs(xd.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzt(xd.a aVar) {
        return false;
    }
}
