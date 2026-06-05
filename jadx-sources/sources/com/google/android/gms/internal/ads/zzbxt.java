package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import nd.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import qc.w;
import qc.y;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxt implements zzbxy {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhcu zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbxv zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxt(Context context, rc.a aVar, zzbxv zzbxvVar, String str, zzbxu zzbxuVar) {
        e0.j(zzbxvVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbxvVar;
        Iterator it = zzbxvVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhcu zzhcuVarZzc = zzhet.zzc();
        zzhcuVarZzc.zzn(9);
        if (str != null) {
            zzhcuVarZzc.zzj(str);
            zzhcuVarZzc.zzh(str);
        }
        zzhcv zzhcvVarZzc = zzhcw.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzhcvVarZzc.zza(str2);
        }
        zzhcuVarZzc.zzg((zzhcw) zzhcvVarZzc.zzbr());
        zzhek zzhekVarZzc = zzhel.zzc();
        zzhekVarZzc.zzc(wd.b.a(this.zzh).f());
        String str3 = aVar.f14321a;
        if (str3 != null) {
            zzhekVarZzc.zza(str3);
        }
        f fVar = f.f12280b;
        Context context2 = this.zzh;
        fVar.getClass();
        long jA = f.a(context2);
        if (jA > 0) {
            zzhekVarZzc.zzb(jA);
        }
        zzhcuVarZzc.zzf((zzhel) zzhekVarZzc.zzbr());
        this.zzd = zzhcuVarZzc;
    }

    public static /* synthetic */ mf.a zzb(zzbxt zzbxtVar, Map map) {
        int length;
        zzhei zzheiVar;
        mf.a aVarZzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        Object obj = zzbxtVar.zzj;
                        synchronized (obj) {
                            try {
                                length = jSONArrayOptJSONArray.length();
                                synchronized (obj) {
                                    zzheiVar = (zzhei) zzbxtVar.zze.get(str);
                                }
                            } finally {
                            }
                        }
                        if (zzheiVar == null) {
                            zzbxx.zza("Cannot find the corresponding resource object for " + str);
                        } else {
                            for (int i10 = 0; i10 < length; i10++) {
                                zzheiVar.zza(jSONArrayOptJSONArray.getJSONObject(i10).getString("threat_type"));
                            }
                            zzbxtVar.zza = (length > 0) | zzbxtVar.zza;
                        }
                    }
                }
            } catch (JSONException e10) {
                if (((Boolean) zzbfk.zza.zze()).booleanValue()) {
                    int i11 = l0.f13401b;
                    k.c("Failed to get SafeBrowsing metadata", e10);
                }
                return zzgdb.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (zzbxtVar.zza) {
            synchronized (zzbxtVar.zzj) {
                zzbxtVar.zzd.zzn(10);
            }
        }
        boolean z2 = zzbxtVar.zza;
        if (!(z2 && zzbxtVar.zzi.zzg) && (!(zzbxtVar.zzm && zzbxtVar.zzi.zzf) && (z2 || !zzbxtVar.zzi.zzd))) {
            return zzgdb.zzh(null);
        }
        synchronized (zzbxtVar.zzj) {
            try {
                Iterator it = zzbxtVar.zze.values().iterator();
                while (it.hasNext()) {
                    zzbxtVar.zzd.zzc((zzhej) ((zzhei) it.next()).zzbr());
                }
                zzhcu zzhcuVar = zzbxtVar.zzd;
                zzhcuVar.zza(zzbxtVar.zzf);
                zzhcuVar.zzb(zzbxtVar.zzg);
                if (zzbxx.zzb()) {
                    StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + zzhcuVar.zzl() + "\n  clickUrl: " + zzhcuVar.zzk() + "\n  resources: \n");
                    for (zzhej zzhejVar : zzhcuVar.zzm()) {
                        sb2.append("    [");
                        sb2.append(zzhejVar.zzc());
                        sb2.append("] ");
                        sb2.append(zzhejVar.zzg());
                    }
                    zzbxx.zza(sb2.toString());
                }
                byte[] bArrZzaV = ((zzhet) zzhcuVar.zzbr()).zzaV();
                String str2 = zzbxtVar.zzi.zzb;
                new y(zzbxtVar.zzh);
                w wVarA = y.a(1, str2, null, bArrZzaV);
                if (zzbxx.zzb()) {
                    wVarA.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxq
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = zzbxt.zzb;
                            zzbxx.zza("Pinged SB successfully.");
                        }
                    }, zzcad.zza);
                }
                aVarZzm = zzgdb.zzm(wVarA, new zzfut() { // from class: com.google.android.gms.internal.ads.zzbxr
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj2) {
                        int i12 = zzbxt.zzb;
                        return null;
                    }
                }, zzcad.zzg);
            } finally {
            }
        }
        return aVarZzm;
    }

    public static /* synthetic */ void zzd(zzbxt zzbxtVar, Bitmap bitmap) {
        zzgxl zzgxlVarZzt = zzgxn.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzgxlVarZzt);
        synchronized (zzbxtVar.zzj) {
            zzhcu zzhcuVar = zzbxtVar.zzd;
            zzhec zzhecVarZzc = zzhee.zzc();
            zzhecVarZzc.zza(zzgxlVarZzt.zzb());
            zzhecVarZzc.zzb("image/png");
            zzhecVarZzc.zzc(2);
            zzhcuVar.zzi((zzhee) zzhecVarZzc.zzbr());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final zzbxv zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zze(String str, Map map, int i10) {
        synchronized (this.zzj) {
            if (i10 == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i10 == 3) {
                    ((zzhei) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzhei zzheiVarZzd = zzhej.zzd();
            int iZza = zzheh.zza(i10);
            if (iZza != 0) {
                zzheiVarZzd.zze(iZza);
            }
            zzheiVarZzd.zzb(linkedHashMap.size());
            zzheiVarZzd.zzd(str);
            zzhdh zzhdhVarZzc = zzhdk.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhdf zzhdfVarZzc = zzhdg.zzc();
                        zzhdfVarZzc.zza(zzgxn.zzw(str2));
                        zzhdfVarZzc.zzb(zzgxn.zzw(str3));
                        zzhdhVarZzc.zza((zzhdg) zzhdfVarZzc.zzbr());
                    }
                }
            }
            zzheiVarZzd.zzc((zzhdk) zzhdhVarZzc.zzbr());
            linkedHashMap.put(str, zzheiVarZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            mf.a aVarZzh = zzgdb.zzh(Collections.EMPTY_MAP);
            zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzbxo
                @Override // com.google.android.gms.internal.ads.zzgci
                public final mf.a zza(Object obj) {
                    return zzbxt.zzb(this.zza, (Map) obj);
                }
            };
            zzgdm zzgdmVar = zzcad.zzg;
            mf.a aVarZzn = zzgdb.zzn(aVarZzh, zzgciVar, zzgdmVar);
            mf.a aVarZzo = zzgdb.zzo(aVarZzn, 10L, TimeUnit.SECONDS, zzcad.zzd);
            zzgdb.zzr(aVarZzn, new zzbxs(this, aVarZzo), zzgdmVar);
            zzc.add(aVarZzo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbxv r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L9d
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L9d
            mc.n r0 = mc.n.D
            qc.r0 r0 = r0.f11577c
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L16
            goto L77
        L16:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L28
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L28
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L28
            if (r3 == 0) goto L2a
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L28
            goto L2b
        L28:
            r2 = move-exception
            goto L31
        L2a:
            r3 = r1
        L2b:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2f
            goto L39
        L2f:
            r2 = move-exception
            goto L32
        L31:
            r3 = r1
        L32:
            int r4 = qc.l0.f13401b
            java.lang.String r4 = "Fail to capture the web view"
            rc.k.e(r4, r2)
        L39:
            if (r3 != 0) goto L76
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L64
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L64
            if (r2 == 0) goto L66
            if (r3 != 0) goto L48
            goto L66
        L48:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L64
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L64
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L64
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L64
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L64
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L64
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L64
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L64
            r1 = r4
            goto L77
        L64:
            r8 = move-exception
            goto L6e
        L66:
            java.lang.String r8 = "Width or height of view is zero"
            int r2 = qc.l0.f13401b     // Catch: java.lang.RuntimeException -> L64
            rc.k.g(r8)     // Catch: java.lang.RuntimeException -> L64
            goto L77
        L6e:
            int r2 = qc.l0.f13401b
            java.lang.String r2 = "Fail to capture the webview"
            rc.k.e(r2, r8)
            goto L77
        L76:
            r1 = r3
        L77:
            if (r1 != 0) goto L7f
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbxx.zza(r8)
            return
        L7f:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbxp r8 = new com.google.android.gms.internal.ads.zzbxp
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L98
            r8.run()
            goto L9d
        L98:
            com.google.android.gms.internal.ads.zzgdm r0 = com.google.android.gms.internal.ads.zzcad.zza
            r0.execute(r8)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxt.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzh(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzd();
                } else {
                    this.zzd.zze(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final boolean zzi() {
        return this.zzi.zzc && !this.zzl;
    }
}
