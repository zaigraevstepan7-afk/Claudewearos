package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.e0;
import nc.i2;
import nc.q0;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfbq extends zzbwc {
    private final zzfbg zza;
    private final zzfaw zzb;
    private final zzfcg zzc;
    private zzdog zzd;
    private boolean zze = false;

    public zzfbq(zzfbg zzfbgVar, zzfaw zzfawVar, zzfcg zzfcgVar) {
        this.zza = zzfbgVar;
        this.zzb = zzfawVar;
        this.zzc = zzfcgVar;
    }

    private final synchronized boolean zzy() {
        zzdog zzdogVar = this.zzd;
        if (zzdogVar != null) {
            if (!zzdogVar.zze()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final Bundle zzb() {
        e0.d("getAdMetadata can only be called from the UI thread.");
        zzdog zzdogVar = this.zzd;
        return zzdogVar != null ? zzdogVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final synchronized i2 zzc() {
        zzdog zzdogVar;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgR)).booleanValue() && (zzdogVar = this.zzd) != null) {
            return zzdogVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final synchronized String zzd() {
        zzdog zzdogVar = this.zzd;
        if (zzdogVar == null || zzdogVar.zzl() == null) {
            return null;
        }
        return zzdogVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zze() {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final synchronized void zzf(xd.a aVar) {
        e0.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (aVar != null) {
                context = (Context) xd.b.u(aVar);
            }
            this.zzd.zzm().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) nc.t.f12227d.f12230c.zzb(com.google.android.gms.internal.ads.zzbdc.zzfI)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzbwd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzbwh r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.e0.d(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zzfG     // Catch: java.lang.Throwable -> L20
            nc.t r2 = nc.t.f12227d     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbda r2 = r2.f12230c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L62
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            mc.n r2 = mc.n.D     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbzq r2 = r2.f11582h     // Catch: java.lang.Throwable -> L20
            r2.zzw(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzfI     // Catch: java.lang.Throwable -> L20
            nc.t r1 = nc.t.f12227d     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbda r1 = r1.f12230c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.zzfay r0 = new com.google.android.gms.internal.ads.zzfay     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.zzd = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfbg r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L20
            nc.q3 r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfbo r3 = new com.google.android.gms.internal.ads.zzfbo     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.zzb(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbq.zzg(com.google.android.gms.internal.ads.zzbwh):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final synchronized void zzi(xd.a aVar) {
        e0.d("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(aVar == null ? null : (Context) xd.b.u(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final synchronized void zzk(xd.a aVar) {
        e0.d("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(aVar == null ? null : (Context) xd.b.u(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzl(q0 q0Var) {
        e0.d("setAdMetadataListener can only be called from the UI thread.");
        if (q0Var == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfbp(this, q0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final synchronized void zzm(String str) {
        e0.d("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final synchronized void zzn(boolean z2) {
        e0.d("setImmersiveMode must be called on the main UI thread.");
        this.zze = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzo(zzbwg zzbwgVar) {
        e0.d("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbwgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final synchronized void zzp(String str) {
        e0.d("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final synchronized void zzq() {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final synchronized void zzr(xd.a aVar) {
        try {
            e0.d("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object objU = xd.b.u(aVar);
                    if (objU instanceof Activity) {
                        activity = (Activity) objU;
                    }
                }
                this.zzd.zzh(this.zze, activity);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final boolean zzs() {
        e0.d("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final boolean zzt() {
        zzdog zzdogVar = this.zzd;
        return zzdogVar != null && zzdogVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzu(zzbwb zzbwbVar) {
        e0.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbwbVar);
    }
}
