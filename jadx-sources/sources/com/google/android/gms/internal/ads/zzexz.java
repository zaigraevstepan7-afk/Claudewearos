package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.e0;
import java.util.concurrent.atomic.AtomicBoolean;
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
import nc.v3;
import nc.w;
import nc.z;
import pc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzexz extends l0 implements m, zzbao {
    protected zzcoh zza;
    private final zzcgz zzb;
    private final Context zzc;
    private final String zze;
    private final zzext zzf;
    private final zzexr zzg;
    private final rc.a zzh;
    private final zzdsc zzi;
    private zzcnu zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzexz(zzcgz zzcgzVar, Context context, String str, zzext zzextVar, zzexr zzexrVar, rc.a aVar, zzdsc zzdscVar) {
        this.zzb = zzcgzVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzextVar;
        this.zzg = zzexrVar;
        this.zzh = aVar;
        this.zzi = zzdscVar;
        zzexrVar.zzm(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzq(int i10) {
        try {
            if (this.zzd.compareAndSet(false, true)) {
                this.zzg.zzj();
                zzcnu zzcnuVar = this.zzk;
                if (zzcnuVar != null) {
                    n.D.f11581g.zze(zzcnuVar);
                }
                if (this.zza != null) {
                    long jElapsedRealtime = -1;
                    if (this.zzj != -1) {
                        n.D.f11584k.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzj;
                    }
                    this.zza.zze(jElapsedRealtime, i10);
                }
                zzx();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // nc.m0
    public final synchronized void zzA() {
    }

    @Override // nc.m0
    public final synchronized void zzB() {
        e0.d("resume must be called on the main UI thread.");
    }

    @Override // nc.m0
    public final synchronized void zzF(s3 s3Var) {
        e0.d("setAdSize must be called on the main UI thread.");
    }

    @Override // nc.m0
    public final void zzH(zzbax zzbaxVar) {
        this.zzg.zzo(zzbaxVar);
    }

    @Override // nc.m0
    public final void zzI(v3 v3Var) {
        this.zzf.zzl(v3Var);
    }

    @Override // nc.m0
    public final synchronized void zzN(boolean z2) {
    }

    @Override // nc.m0
    public final synchronized void zzO(zzbdx zzbdxVar) {
    }

    @Override // nc.m0
    public final synchronized void zzU(n3 n3Var) {
    }

    @Override // nc.m0
    public final synchronized void zzX() {
    }

    @Override // nc.m0
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // nc.m0
    public final synchronized boolean zzZ() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zza() {
        zzq(3);
    }

    @Override // nc.m0
    public final boolean zzaa() {
        return false;
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
            com.google.android.gms.internal.ads.zzbem r0 = com.google.android.gms.internal.ads.zzbfa.zzd     // Catch: java.lang.Throwable -> L2d
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
            goto L94
        L2f:
            rc.a r2 = r5.zzh     // Catch: java.lang.Throwable -> L2d
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
            android.content.Context r0 = r5.zzc     // Catch: java.lang.Throwable -> L2d
            boolean r0 = qc.r0.g(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L71
            nc.p0 r0 = r6.L     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L5d
            goto L71
        L5d:
            int r6 = qc.l0.f13401b     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            rc.k.d(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzexr r6 = r5.zzg     // Catch: java.lang.Throwable -> L2d
            r0 = 4
            r2 = 0
            nc.h2 r0 = com.google.android.gms.internal.ads.zzfdp.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.zzdD(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r1
        L71:
            boolean r0 = r5.zzZ()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L79
            monitor-exit(r5)
            return r1
        L79:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r5.zzd = r0     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzexx r0 = new com.google.android.gms.internal.ads.zzexx     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzext r1 = r5.zzf     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.zze     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzexy r3 = new com.google.android.gms.internal.ads.zzexy     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r1.zzb(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L94:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexz.zzab(nc.q3):boolean");
    }

    @Override // nc.m0
    public final synchronized void zzac(e1 e1Var) {
    }

    @Override // nc.m0
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // pc.m
    public final synchronized void zzdt() {
        if (this.zza != null) {
            n nVar = n.D;
            nVar.f11584k.getClass();
            this.zzj = SystemClock.elapsedRealtime();
            int iZza = this.zza.zza();
            if (iZza > 0) {
                zzcnu zzcnuVar = new zzcnu(this.zzb.zzB(), nVar.f11584k);
                this.zzk = zzcnuVar;
                zzcnuVar.zzd(iZza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzexw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzexz zzexzVar = this.zza;
                        zzexzVar.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexv
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzq(5);
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // pc.m
    public final synchronized void zzdv() {
        zzcoh zzcohVar = this.zza;
        if (zzcohVar != null) {
            n.D.f11584k.getClass();
            zzcohVar.zze(SystemClock.elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // pc.m
    public final void zzdw(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            zzq(2);
            return;
        }
        if (i11 == 1) {
            zzq(4);
        } else if (i11 != 2) {
            zzq(6);
        } else {
            zzq(3);
        }
    }

    @Override // nc.m0
    public final synchronized s3 zzg() {
        return null;
    }

    @Override // nc.m0
    public final z zzi() {
        return null;
    }

    @Override // nc.m0
    public final b1 zzj() {
        return null;
    }

    @Override // nc.m0
    public final synchronized i2 zzk() {
        return null;
    }

    @Override // nc.m0
    public final synchronized l2 zzl() {
        return null;
    }

    @Override // nc.m0
    public final xd.a zzn() {
        return null;
    }

    @Override // nc.m0
    public final synchronized String zzr() {
        return this.zze;
    }

    @Override // nc.m0
    public final synchronized String zzs() {
        return null;
    }

    @Override // nc.m0
    public final synchronized String zzt() {
        return null;
    }

    @Override // nc.m0
    public final synchronized void zzx() {
        e0.d("destroy must be called on the main UI thread.");
        zzcoh zzcohVar = this.zza;
        if (zzcohVar != null) {
            zzcohVar.zzb();
        }
    }

    @Override // nc.m0
    public final synchronized void zzz() {
        e0.d("pause must be called on the main UI thread.");
    }

    @Override // pc.m
    public final void zzdH() {
    }

    @Override // pc.m
    public final void zzdk() {
    }

    @Override // pc.m
    public final void zzds() {
    }

    @Override // nc.m0
    public final void zzC(w wVar) {
    }

    @Override // nc.m0
    public final void zzD(z zVar) {
    }

    @Override // nc.m0
    public final void zzE(q0 q0Var) {
    }

    @Override // nc.m0
    public final void zzG(b1 b1Var) {
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
    public final void zzP(a2 a2Var) {
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
