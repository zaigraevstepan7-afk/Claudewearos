package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import mc.n;
import nc.s;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbsr extends zzbss implements zzbkd {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcfe zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbck zzk;
    private float zzl;
    private int zzm;

    public zzbsr(zzcfe zzcfeVar, Context context, zzbck zzbckVar) {
        super(zzcfeVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcfeVar;
        this.zzi = context;
        this.zzk = zzbckVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        rc.e eVar = s.f12202f.f12203a;
        this.zzb = Math.round(r11.widthPixels / this.zza.density);
        this.zzc = Math.round(r11.heightPixels / this.zza.density);
        zzcfe zzcfeVar = this.zzh;
        Activity activityZzi = zzcfeVar.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            r0 r0Var = n.D.f11577c;
            int[] iArrN = r0.n(activityZzi);
            this.zzd = Math.round(iArrN[0] / this.zza.density);
            this.zze = Math.round(iArrN[1] / this.zza.density);
        }
        if (zzcfeVar.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzcfeVar.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbsq zzbsqVar = new zzbsq();
        zzbck zzbckVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbsqVar.zze(zzbckVar.zza(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbsqVar.zzc(zzbckVar.zza(intent2));
        zzbsqVar.zza(zzbckVar.zzb());
        zzbsqVar.zzd(zzbckVar.zzc());
        zzbsqVar.zzb(true);
        boolean z2 = zzbsqVar.zza;
        boolean z10 = zzbsqVar.zzb;
        boolean z11 = zzbsqVar.zzc;
        try {
            jSONObjectPut = new JSONObject().put("sms", z2).put("tel", z10).put("calendar", z11).put("storePicture", zzbsqVar.zzd).put("inlineVideo", zzbsqVar.zze);
        } catch (JSONException e10) {
            int i10 = l0.f13401b;
            k.e("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObjectPut = null;
        }
        zzcfeVar.zze("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        zzcfeVar.getLocationOnScreen(iArr);
        Context context = this.zzi;
        s sVar = s.f12202f;
        zzb(sVar.f12203a.h(context, iArr[0]), sVar.f12203a.h(context, iArr[1]));
        if (k.j(2)) {
            k.f("Dispatching Ready Event.");
        }
        zzi(zzcfeVar.zzm().f14321a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[PHI: r4
      0x0061: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x0040, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.zzi
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L15
            mc.n r1 = mc.n.D
            qc.r0 r1 = r1.f11577c
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            int[] r1 = qc.r0.o(r1)
            r1 = r1[r2]
            goto L16
        L15:
            r1 = r2
        L16:
            com.google.android.gms.internal.ads.zzcfe r3 = r8.zzh
            com.google.android.gms.internal.ads.zzcgy r4 = r3.zzO()
            if (r4 == 0) goto L28
            com.google.android.gms.internal.ads.zzcgy r4 = r3.zzO()
            boolean r4 = r4.zzi()
            if (r4 != 0) goto L74
        L28:
            int r4 = r3.getWidth()
            int r5 = r3.getHeight()
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.internal.ads.zzbdc.zzag
            nc.t r7 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r7 = r7.f12230c
            java.lang.Object r6 = r7.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L61
            if (r4 != 0) goto L52
            com.google.android.gms.internal.ads.zzcgy r4 = r3.zzO()
            if (r4 == 0) goto L51
            com.google.android.gms.internal.ads.zzcgy r4 = r3.zzO()
            int r4 = r4.zzb
            goto L52
        L51:
            r4 = r2
        L52:
            if (r5 != 0) goto L61
            com.google.android.gms.internal.ads.zzcgy r5 = r3.zzO()
            if (r5 == 0) goto L62
            com.google.android.gms.internal.ads.zzcgy r2 = r3.zzO()
            int r2 = r2.zza
            goto L62
        L61:
            r2 = r5
        L62:
            nc.s r5 = nc.s.f12202f
            rc.e r6 = r5.f12203a
            int r4 = r6.h(r0, r4)
            r8.zzf = r4
            rc.e r4 = r5.f12203a
            int r0 = r4.h(r0, r2)
            r8.zzg = r0
        L74:
            int r0 = r10 - r1
            int r1 = r8.zzf
            int r2 = r8.zzg
            r8.zzg(r9, r0, r1, r2)
            com.google.android.gms.internal.ads.zzcgw r0 = r3.zzN()
            r0.zzE(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsr.zzb(int, int):void");
    }
}
