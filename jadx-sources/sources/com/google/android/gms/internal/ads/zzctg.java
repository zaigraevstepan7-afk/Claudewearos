package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import xc.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzctg implements zzcyt, zzdei {
    private zzbvi zza;
    private final Context zzc;
    private final zzfhp zzd;
    private final rc.a zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    public zzctg(Context context, zzfhp zzfhpVar, rc.a aVar, Executor executor) {
        this.zzc = context;
        this.zzd = zzfhpVar;
        this.zze = aVar;
        this.zzf = executor;
    }

    public static /* synthetic */ void zzc(zzctg zzctgVar) {
        zzbcm.zze(zzctgVar.zzc);
        zzctgVar.zzh = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zzb
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto La7
        Lb:
            com.google.android.gms.internal.ads.zzbem r0 = com.google.android.gms.internal.ads.zzbfc.zzj
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 2
            if (r0 == 0) goto L1c
        L1a:
            r3 = r2
            goto L6a
        L1c:
            com.google.android.gms.internal.ads.zzbem r0 = com.google.android.gms.internal.ads.zzbfc.zzk
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 3
            if (r0 == 0) goto L2c
            goto L6a
        L2c:
            com.google.android.gms.internal.ads.zzbem r0 = com.google.android.gms.internal.ads.zzbfc.zzi
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r3 = r1
            goto L6a
        L3c:
            mc.n r0 = mc.n.D
            com.google.android.gms.internal.ads.zzbzq r0 = r0.f11582h
            qc.n0 r0 = r0.zzi()
            qc.o0 r0 = (qc.o0) r0
            com.google.android.gms.internal.ads.zzbzk r0 = r0.n()
            java.lang.String r0 = r0.zzc()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L62
            goto L1a
        L62:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L6a:
            int r3 = r3 + (-1)
            if (r3 == r1) goto L82
            if (r3 == r2) goto L71
            goto La7
        L71:
            android.content.Context r0 = r5.zzc
            com.google.android.gms.internal.ads.zzfhp r2 = r5.zzd
            mc.n r3 = mc.n.D
            com.google.android.gms.internal.ads.zzbol r3 = r3.f11591r
            rc.a r4 = rc.a.b()
            com.google.android.gms.internal.ads.zzbou r0 = r3.zzb(r0, r4, r2)
            goto L92
        L82:
            android.content.Context r0 = r5.zzc
            com.google.android.gms.internal.ads.zzfhp r2 = r5.zzd
            mc.n r3 = mc.n.D
            com.google.android.gms.internal.ads.zzbol r3 = r3.f11591r
            rc.a r4 = rc.a.b()
            com.google.android.gms.internal.ads.zzbou r0 = r3.zza(r0, r4, r2)
        L92:
            java.lang.String r2 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.zzboo r3 = com.google.android.gms.internal.ads.zzbor.zza
            com.google.android.gms.internal.ads.zzbok r0 = r0.zza(r2, r3, r3)
            android.content.Context r2 = r5.zzc
            rc.a r3 = r5.zze
            com.google.android.gms.internal.ads.zzbvk r4 = new com.google.android.gms.internal.ads.zzbvk
            r4.<init>(r2, r0, r3)
            r5.zza = r4
            r5.zzg = r1
        La7:
            boolean r0 = r5.zzg
            if (r0 != 0) goto Lac
            goto Ld5
        Lac:
            com.google.android.gms.internal.ads.zzbvi r0 = r5.zza
            if (r0 == 0) goto Ld5
            mf.a r0 = r0.zza()
            boolean r1 = r5.zzh
            if (r1 != 0) goto Ld0
            com.google.android.gms.internal.ads.zzbem r1 = com.google.android.gms.internal.ads.zzbeu.zzi
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Ld0
            com.google.android.gms.internal.ads.zzctf r1 = new com.google.android.gms.internal.ads.zzctf
            r1.<init>()
            java.util.concurrent.Executor r2 = r5.zzf
            r0.addListener(r1, r2)
        Ld0:
            java.lang.String r1 = "persistFlagsClient"
            com.google.android.gms.internal.ads.zzcag.zza(r0, r1)
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzctg.zzd():void");
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zze(v vVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzf(String str) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
    }
}
