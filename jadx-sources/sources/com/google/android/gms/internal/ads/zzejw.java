package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.e0;
import java.util.Collections;
import mc.n;
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
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzejw extends l0 implements zzcyi {
    private final Context zza;
    private final zzeyf zzb;
    private final String zzc;
    private final zzekq zzd;
    private s3 zze;
    private final zzfcm zzf;
    private final rc.a zzg;
    private final zzdsc zzh;
    private zzcon zzi;

    public zzejw(Context context, s3 s3Var, String str, zzeyf zzeyfVar, zzekq zzekqVar, rc.a aVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = zzeyfVar;
        this.zze = s3Var;
        this.zzc = str;
        this.zzd = zzekqVar;
        this.zzf = zzeyfVar.zzf();
        this.zzg = aVar;
        this.zzh = zzdscVar;
        zzeyfVar.zzo(this);
    }

    private final synchronized void zzf(s3 s3Var) {
        zzfcm zzfcmVar = this.zzf;
        zzfcmVar.zzs(s3Var);
        zzfcmVar.zzy(this.zze.G);
    }

    private final synchronized boolean zzh(q3 q3Var) {
        try {
            if (zzm()) {
                e0.d("loadAd must be called on the main UI thread.");
            }
            r0 r0Var = n.D.f11577c;
            Context context = this.zza;
            if (!r0.g(context) || q3Var.L != null) {
                zzfdl.zza(context, q3Var.f12195f);
                return this.zzb.zzb(q3Var, this.zzc, null, new zzejv(this));
            }
            int i10 = qc.l0.f13401b;
            k.d("Failed to load the ad because app ID is missing.");
            zzekq zzekqVar = this.zzd;
            if (zzekqVar != null) {
                zzekqVar.zzdD(zzfdp.zzd(4, null, null));
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzm() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbem r0 = com.google.android.gms.internal.ads.zzbfa.zzf
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzlu
            nc.t r3 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r3 = r3.f12230c
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            rc.a r3 = r6.zzg
            int r3 = r3.f14323c
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.internal.ads.zzbdc.zzlv
            nc.t r5 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r5 = r5.f12230c
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejw.zzm():boolean");
    }

    @Override // nc.m0
    public final synchronized void zzA() {
        e0.d("recordManualImpression must be called on the main UI thread.");
        zzcon zzconVar = this.zzi;
        if (zzconVar != null) {
            zzconVar.zzh();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // nc.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbem r0 = com.google.android.gms.internal.ads.zzbfa.zzh     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzlq     // Catch: java.lang.Throwable -> L36
            nc.t r1 = nc.t.f12227d     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbda r2 = r1.f12230c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.zzb(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            rc.a r0 = r3.zzg     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f14323c     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.internal.ads.zzbdc.zzlw     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbda r1 = r1.f12230c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.zzb(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L4d
        L38:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.e0.d(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.zzcon r0 = r3.zzi     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L4b
            com.google.android.gms.internal.ads.zzcwq r0 = r0.zzm()     // Catch: java.lang.Throwable -> L36
            r1 = 0
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            return
        L4b:
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejw.zzB():void");
    }

    @Override // nc.m0
    public final void zzC(w wVar) {
        if (zzm()) {
            e0.d("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzn(wVar);
    }

    @Override // nc.m0
    public final void zzD(z zVar) {
        if (zzm()) {
            e0.d("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zVar);
    }

    @Override // nc.m0
    public final void zzE(q0 q0Var) {
        e0.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // nc.m0
    public final synchronized void zzF(s3 s3Var) {
        e0.d("setAdSize must be called on the main UI thread.");
        this.zzf.zzs(s3Var);
        this.zze = s3Var;
        zzcon zzconVar = this.zzi;
        if (zzconVar != null) {
            zzconVar.zzi(this.zzb.zzc(), s3Var);
        }
    }

    @Override // nc.m0
    public final void zzG(b1 b1Var) {
        if (zzm()) {
            e0.d("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(b1Var);
    }

    @Override // nc.m0
    public final synchronized void zzN(boolean z2) {
        try {
            if (zzm()) {
                e0.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzB(z2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // nc.m0
    public final synchronized void zzO(zzbdx zzbdxVar) {
        e0.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzp(zzbdxVar);
    }

    @Override // nc.m0
    public final void zzP(a2 a2Var) {
        if (zzm()) {
            e0.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!a2Var.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e10) {
            int i10 = qc.l0.f13401b;
            k.c("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzd.zzl(a2Var);
    }

    @Override // nc.m0
    public final synchronized void zzU(n3 n3Var) {
        try {
            if (zzm()) {
                e0.d("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzI(n3Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // nc.m0
    public final synchronized boolean zzY() {
        zzcon zzconVar = this.zzi;
        if (zzconVar != null) {
            if (zzconVar.zzr()) {
                return true;
            }
        }
        return false;
    }

    @Override // nc.m0
    public final synchronized boolean zzZ() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcyi
    public final synchronized void zza() {
        try {
            if (!this.zzb.zzs()) {
                this.zzb.zzl();
                return;
            }
            zzfcm zzfcmVar = this.zzf;
            s3 s3VarZzh = zzfcmVar.zzh();
            if (this.zzi != null && zzfcmVar.zzT()) {
                s3VarZzh = zzfcu.zza(this.zza, Collections.singletonList(this.zzi.zzg()));
            }
            zzf(s3VarZzh);
            zzfcmVar.zzx(true);
            try {
                zzh(zzfcmVar.zzf());
            } catch (RemoteException unused) {
                int i10 = qc.l0.f13401b;
                k.g("Failed to refresh the banner ad.");
            }
            this.zzf.zzx(false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // nc.m0
    public final boolean zzaa() {
        return false;
    }

    @Override // nc.m0
    public final synchronized boolean zzab(q3 q3Var) {
        zzf(this.zze);
        return zzh(q3Var);
    }

    @Override // nc.m0
    public final synchronized void zzac(e1 e1Var) {
        e0.d("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzV(e1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcyi
    public final synchronized void zzb() {
        zzeyf zzeyfVar = this.zzb;
        if (zzeyfVar.zzs()) {
            zzeyfVar.zzq();
        } else {
            zzeyfVar.zzm();
        }
    }

    @Override // nc.m0
    public final Bundle zzd() {
        e0.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // nc.m0
    public final synchronized s3 zzg() {
        e0.d("getAdSize must be called on the main UI thread.");
        zzcon zzconVar = this.zzi;
        if (zzconVar != null) {
            return zzfcu.zza(this.zza, Collections.singletonList(zzconVar.zzf()));
        }
        return this.zzf.zzh();
    }

    @Override // nc.m0
    public final z zzi() {
        return this.zzd.zzg();
    }

    @Override // nc.m0
    public final b1 zzj() {
        return this.zzd.zzi();
    }

    @Override // nc.m0
    public final synchronized i2 zzk() {
        zzcon zzconVar;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgR)).booleanValue() && (zzconVar = this.zzi) != null) {
            return zzconVar.zzl();
        }
        return null;
    }

    @Override // nc.m0
    public final synchronized l2 zzl() {
        e0.d("getVideoController must be called from the main thread.");
        zzcon zzconVar = this.zzi;
        if (zzconVar == null) {
            return null;
        }
        return zzconVar.zze();
    }

    @Override // nc.m0
    public final xd.a zzn() {
        if (zzm()) {
            e0.d("getAdFrame must be called on the main UI thread.");
        }
        return new xd.b(this.zzb.zzc());
    }

    @Override // nc.m0
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // nc.m0
    public final synchronized String zzs() {
        zzcon zzconVar = this.zzi;
        if (zzconVar == null || zzconVar.zzl() == null) {
            return null;
        }
        return zzconVar.zzl().zzg();
    }

    @Override // nc.m0
    public final synchronized String zzt() {
        zzcon zzconVar = this.zzi;
        if (zzconVar == null || zzconVar.zzl() == null) {
            return null;
        }
        return zzconVar.zzl().zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // nc.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbem r0 = com.google.android.gms.internal.ads.zzbfa.zze     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzlr     // Catch: java.lang.Throwable -> L36
            nc.t r1 = nc.t.f12227d     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbda r2 = r1.f12230c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.zzb(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            rc.a r0 = r3.zzg     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f14323c     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.internal.ads.zzbdc.zzlw     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbda r1 = r1.f12230c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.zzb(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L48
        L38:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.e0.d(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.zzcon r0 = r3.zzi     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L46
            r0.zzb()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            return
        L46:
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejw.zzx():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // nc.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbem r0 = com.google.android.gms.internal.ads.zzbfa.zzg     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzls     // Catch: java.lang.Throwable -> L36
            nc.t r1 = nc.t.f12227d     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbda r2 = r1.f12230c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.zzb(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            rc.a r0 = r3.zzg     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f14323c     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.internal.ads.zzbdc.zzlw     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbda r1 = r1.f12230c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.zzb(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L4d
        L38:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.e0.d(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.zzcon r0 = r3.zzi     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L4b
            com.google.android.gms.internal.ads.zzcwq r0 = r0.zzm()     // Catch: java.lang.Throwable -> L36
            r1 = 0
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            return
        L4b:
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejw.zzz():void");
    }

    @Override // nc.m0
    public final void zzX() {
    }

    @Override // nc.m0
    public final void zzH(zzbax zzbaxVar) {
    }

    @Override // nc.m0
    public final void zzI(v3 v3Var) {
    }

    @Override // nc.m0
    public final void zzJ(g1 g1Var) {
    }

    @Override // nc.m0
    public final void zzK(o2 o2Var) {
    }

    @Override // nc.m0
    public final void zzL(boolean z2) {
    }

    @Override // nc.m0
    public final void zzM(zzbtx zzbtxVar) {
    }

    @Override // nc.m0
    public final void zzR(String str) {
    }

    @Override // nc.m0
    public final void zzS(zzbwg zzbwgVar) {
    }

    @Override // nc.m0
    public final void zzT(String str) {
    }

    @Override // nc.m0
    public final void zzW(xd.a aVar) {
    }

    @Override // nc.m0
    public final void zzQ(zzbua zzbuaVar, String str) {
    }

    @Override // nc.m0
    public final void zzy(q3 q3Var, c0 c0Var) {
    }
}
