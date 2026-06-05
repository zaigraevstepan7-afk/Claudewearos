package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdeu extends zzcqv {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdda zze;
    private final zzdgg zzf;
    private final zzcrq zzg;
    private final zzfok zzh;
    private final zzcwe zzi;
    private final zzbzu zzj;
    private boolean zzk;

    public zzdeu(zzcqu zzcquVar, Context context, zzcfe zzcfeVar, zzdda zzddaVar, zzdgg zzdggVar, zzcrq zzcrqVar, zzfok zzfokVar, zzcwe zzcweVar, zzbzu zzbzuVar) {
        super(zzcquVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcfeVar);
        this.zze = zzddaVar;
        this.zzf = zzdggVar;
        this.zzg = zzcrqVar;
        this.zzh = zzfokVar;
        this.zzi = zzcweVar;
        this.zzj = zzbzuVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfe zzcfeVar = (zzcfe) this.zzd.get();
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgP)).booleanValue()) {
                if (!this.zzk && zzcfeVar != null) {
                    zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdet
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfeVar.destroy();
                        }
                    });
                }
            } else if (zzcfeVar != null) {
                zzcfeVar.destroy();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(boolean r8, android.app.Activity r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzdda r0 = r7.zze
            r0.zzb()
            mc.n r1 = mc.n.D
            qc.r0 r2 = r1.f11577c
            com.google.android.gms.internal.ads.zzdgg r2 = r7.zzf
            com.google.android.gms.internal.ads.zzfbt r3 = r2.zza()
            boolean r3 = qc.r0.k(r3)
            r4 = 0
            if (r3 != 0) goto L5d
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.internal.ads.zzbdc.zzaO
            nc.t r5 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r6 = r5.f12230c
            java.lang.Object r3 = r6.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L5d
            qc.r0 r1 = r1.f11577c
            android.content.Context r1 = r7.zzc
            boolean r1 = qc.r0.f(r1)
            if (r1 == 0) goto L5d
            int r8 = qc.l0.f13401b
            java.lang.String r8 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies"
            rc.k.g(r8)
            com.google.android.gms.internal.ads.zzcwe r8 = r7.zzi
            r8.zzd()
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.internal.ads.zzbdc.zzaP
            com.google.android.gms.internal.ads.zzbda r9 = r5.f12230c
            java.lang.Object r8 = r9.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Ld3
            com.google.android.gms.internal.ads.zzfok r8 = r7.zzh
            com.google.android.gms.internal.ads.zzfcf r9 = r7.zza
            com.google.android.gms.internal.ads.zzfce r9 = r9.zzb
            com.google.android.gms.internal.ads.zzfbw r9 = r9.zzb
            java.lang.String r9 = r9.zzb
            r8.zza(r9)
            goto Ld3
        L5d:
            java.lang.ref.WeakReference r1 = r7.zzd
            java.lang.Object r1 = r1.get()
            com.google.android.gms.internal.ads.zzcfe r1 = (com.google.android.gms.internal.ads.zzcfe) r1
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.internal.ads.zzbdc.zzmf
            nc.t r5 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r5 = r5.f12230c
            java.lang.Object r3 = r5.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r5 = 0
            if (r3 == 0) goto La3
            if (r1 == 0) goto La3
            com.google.android.gms.internal.ads.zzfbt r1 = r1.zzD()
            if (r1 == 0) goto La3
            boolean r3 = r1.zzar
            if (r3 == 0) goto La3
            int r1 = r1.zzas
            com.google.android.gms.internal.ads.zzbzu r3 = r7.zzj
            int r3 = r3.zzb()
            if (r1 == r3) goto La3
            int r8 = qc.l0.f13401b
            java.lang.String r8 = "The interstitial consent form has been shown."
            rc.k.g(r8)
            com.google.android.gms.internal.ads.zzcwe r8 = r7.zzi
            r9 = 12
            java.lang.String r0 = "The consent form has already been shown."
            nc.h2 r9 = com.google.android.gms.internal.ads.zzfdp.zzd(r9, r0, r5)
            r8.zzc(r9)
            goto Ld3
        La3:
            boolean r1 = r7.zzk
            if (r1 == 0) goto Lb9
            int r1 = qc.l0.f13401b
            java.lang.String r1 = "The interstitial ad has been shown."
            rc.k.g(r1)
            com.google.android.gms.internal.ads.zzcwe r1 = r7.zzi
            r3 = 10
            nc.h2 r3 = com.google.android.gms.internal.ads.zzfdp.zzd(r3, r5, r5)
            r1.zzc(r3)
        Lb9:
            boolean r1 = r7.zzk
            if (r1 != 0) goto Ld3
            if (r9 != 0) goto Lc1
            android.content.Context r9 = r7.zzc
        Lc1:
            com.google.android.gms.internal.ads.zzcwe r1 = r7.zzi     // Catch: com.google.android.gms.internal.ads.zzdgf -> Lcd
            r2.zzb(r8, r9, r1)     // Catch: com.google.android.gms.internal.ads.zzdgf -> Lcd
            r0.zza()     // Catch: com.google.android.gms.internal.ads.zzdgf -> Lcd
            r8 = 1
            r7.zzk = r8
            return r8
        Lcd:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzcwe r9 = r7.zzi
            r9.zze(r8)
        Ld3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdeu.zzc(boolean, android.app.Activity):boolean");
    }
}
