package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.e0;
import nc.a2;
import nc.b1;
import nc.c0;
import nc.e1;
import nc.g1;
import nc.i2;
import nc.l0;
import nc.l2;
import nc.n3;
import nc.o2;
import nc.q0;
import nc.q3;
import nc.s3;
import nc.t;
import nc.v3;
import nc.w;
import nc.z;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeky extends l0 {
    private final s3 zza;
    private final Context zzb;
    private final zzezw zzc;
    private final String zzd;
    private final rc.a zze;
    private final zzekq zzf;
    private final zzfaw zzg;
    private final zzavs zzh;
    private final zzdsc zzi;
    private zzdeu zzj;
    private boolean zzk = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzaQ)).booleanValue();

    public zzeky(Context context, s3 s3Var, String str, zzezw zzezwVar, zzekq zzekqVar, zzfaw zzfawVar, rc.a aVar, zzavs zzavsVar, zzdsc zzdscVar) {
        this.zza = s3Var;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzezwVar;
        this.zzf = zzekqVar;
        this.zzg = zzfawVar;
        this.zze = aVar;
        this.zzh = zzavsVar;
        this.zzi = zzdscVar;
    }

    private final synchronized boolean zze() {
        zzdeu zzdeuVar = this.zzj;
        if (zzdeuVar != null) {
            if (!zzdeuVar.zza()) {
                return true;
            }
        }
        return false;
    }

    @Override // nc.m0
    public final synchronized void zzB() {
        e0.d("resume must be called on the main UI thread.");
        zzdeu zzdeuVar = this.zzj;
        if (zzdeuVar != null) {
            zzdeuVar.zzm().zzc(null);
        }
    }

    @Override // nc.m0
    public final void zzD(z zVar) {
        e0.d("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zVar);
    }

    @Override // nc.m0
    public final void zzE(q0 q0Var) {
        e0.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // nc.m0
    public final void zzG(b1 b1Var) {
        e0.d("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(b1Var);
    }

    @Override // nc.m0
    public final void zzJ(g1 g1Var) {
        this.zzf.zzn(g1Var);
    }

    @Override // nc.m0
    public final synchronized void zzL(boolean z2) {
        e0.d("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z2;
    }

    @Override // nc.m0
    public final synchronized void zzO(zzbdx zzbdxVar) {
        e0.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbdxVar);
    }

    @Override // nc.m0
    public final void zzP(a2 a2Var) {
        e0.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!a2Var.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e10) {
            int i10 = qc.l0.f13401b;
            k.c("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzf.zzl(a2Var);
    }

    @Override // nc.m0
    public final void zzS(zzbwg zzbwgVar) {
        this.zzg.zzm(zzbwgVar);
    }

    @Override // nc.m0
    public final synchronized void zzW(xd.a aVar) {
        if (this.zzj == null) {
            int i10 = qc.l0.f13401b;
            k.g("Interstitial can not be shown before loaded.");
            this.zzf.zzr(zzfdp.zzd(9, null, null));
        } else {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdb)).booleanValue()) {
                this.zzh.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, (Activity) xd.b.u(aVar));
        }
    }

    @Override // nc.m0
    public final synchronized void zzX() {
        e0.d("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            int i10 = qc.l0.f13401b;
            k.g("Interstitial can not be shown before loaded.");
            this.zzf.zzr(zzfdp.zzd(9, null, null));
        } else {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdb)).booleanValue()) {
                this.zzh.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, null);
        }
    }

    @Override // nc.m0
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // nc.m0
    public final synchronized boolean zzZ() {
        return this.zzc.zza();
    }

    @Override // nc.m0
    public final synchronized boolean zzaa() {
        e0.d("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // nc.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zzab(nc.q3 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.c()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.zzbem r0 = com.google.android.gms.internal.ads.zzbfa.zzi     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzlu     // Catch: java.lang.Throwable -> L2d
            nc.t r2 = nc.t.f12227d     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbda r2 = r2.f12230c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r2.zzb(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2f
        L2b:
            r0 = r1
            goto L2f
        L2d:
            r6 = move-exception
            goto L96
        L2f:
            rc.a r2 = r5.zze     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.f14323c     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.internal.ads.zzbdc.zzlv     // Catch: java.lang.Throwable -> L2d
            nc.t r4 = nc.t.f12227d     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbda r4 = r4.f12230c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.zzb(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L47
            if (r0 != 0) goto L4c
        L47:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.e0.d(r0)     // Catch: java.lang.Throwable -> L2d
        L4c:
            mc.n r0 = mc.n.D     // Catch: java.lang.Throwable -> L2d
            qc.r0 r0 = r0.f11577c     // Catch: java.lang.Throwable -> L2d
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L2d
            boolean r2 = qc.r0.g(r0)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            if (r2 == 0) goto L71
            nc.p0 r2 = r6.L     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L71
            int r6 = qc.l0.f13401b     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            rc.k.d(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzekq r6 = r5.zzf     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L94
            r0 = 4
            nc.h2 r0 = com.google.android.gms.internal.ads.zzfdp.zzd(r0, r3, r3)     // Catch: java.lang.Throwable -> L2d
            r6.zzdD(r0)     // Catch: java.lang.Throwable -> L2d
            goto L94
        L71:
            boolean r2 = r5.zze()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L94
            boolean r1 = r6.f12195f     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfdl.zza(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r5.zzj = r3     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzezw r0 = r5.zzc     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r5.zzd     // Catch: java.lang.Throwable -> L2d
            nc.s3 r2 = r5.zza     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzezp r3 = new com.google.android.gms.internal.ads.zzezp     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzekx r2 = new com.google.android.gms.internal.ads.zzekx     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r0.zzb(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L94:
            monitor-exit(r5)
            return r1
        L96:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeky.zzab(nc.q3):boolean");
    }

    @Override // nc.m0
    public final Bundle zzd() {
        e0.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // nc.m0
    public final s3 zzg() {
        return null;
    }

    @Override // nc.m0
    public final z zzi() {
        return this.zzf.zzg();
    }

    @Override // nc.m0
    public final b1 zzj() {
        return this.zzf.zzi();
    }

    @Override // nc.m0
    public final synchronized i2 zzk() {
        zzdeu zzdeuVar;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgR)).booleanValue() && (zzdeuVar = this.zzj) != null) {
            return zzdeuVar.zzl();
        }
        return null;
    }

    @Override // nc.m0
    public final l2 zzl() {
        return null;
    }

    @Override // nc.m0
    public final xd.a zzn() {
        return null;
    }

    @Override // nc.m0
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // nc.m0
    public final synchronized String zzs() {
        zzdeu zzdeuVar = this.zzj;
        if (zzdeuVar == null || zzdeuVar.zzl() == null) {
            return null;
        }
        return zzdeuVar.zzl().zzg();
    }

    @Override // nc.m0
    public final synchronized String zzt() {
        zzdeu zzdeuVar = this.zzj;
        if (zzdeuVar == null || zzdeuVar.zzl() == null) {
            return null;
        }
        return zzdeuVar.zzl().zzg();
    }

    @Override // nc.m0
    public final synchronized void zzx() {
        e0.d("destroy must be called on the main UI thread.");
        zzdeu zzdeuVar = this.zzj;
        if (zzdeuVar != null) {
            zzdeuVar.zzm().zza(null);
        }
    }

    @Override // nc.m0
    public final void zzy(q3 q3Var, c0 c0Var) {
        this.zzf.zzk(c0Var);
        zzab(q3Var);
    }

    @Override // nc.m0
    public final synchronized void zzz() {
        e0.d("pause must be called on the main UI thread.");
        zzdeu zzdeuVar = this.zzj;
        if (zzdeuVar != null) {
            zzdeuVar.zzm().zzb(null);
        }
    }

    @Override // nc.m0
    public final void zzA() {
    }

    @Override // nc.m0
    public final void zzC(w wVar) {
    }

    @Override // nc.m0
    public final void zzF(s3 s3Var) {
    }

    @Override // nc.m0
    public final void zzH(zzbax zzbaxVar) {
    }

    @Override // nc.m0
    public final void zzI(v3 v3Var) {
    }

    @Override // nc.m0
    public final void zzK(o2 o2Var) {
    }

    @Override // nc.m0
    public final void zzM(zzbtx zzbtxVar) {
    }

    @Override // nc.m0
    public final void zzN(boolean z2) {
    }

    @Override // nc.m0
    public final void zzR(String str) {
    }

    @Override // nc.m0
    public final void zzT(String str) {
    }

    @Override // nc.m0
    public final void zzU(n3 n3Var) {
    }

    @Override // nc.m0
    public final void zzac(e1 e1Var) {
    }

    @Override // nc.m0
    public final void zzQ(zzbua zzbuaVar, String str) {
    }
}
