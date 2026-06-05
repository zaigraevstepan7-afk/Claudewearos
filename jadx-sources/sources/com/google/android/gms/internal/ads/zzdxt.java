package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import mc.n;
import nc.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdxt {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcgz zzb;
    private final Context zzc;
    private final rc.a zzd;
    private final zzfco zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfhm zzi;
    private final zzdrw zzj;
    private final zzfjq zzk;
    private final zzcyr zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzbvw zzq;

    public zzdxt(zzcgz zzcgzVar, Context context, rc.a aVar, zzfco zzfcoVar, Executor executor, String str, zzfhm zzfhmVar, zzdrw zzdrwVar, zzbvw zzbvwVar, zzdzy zzdzyVar, ScheduledExecutorService scheduledExecutorService, zzfjq zzfjqVar, zzcyr zzcyrVar) {
        this.zzb = zzcgzVar;
        this.zzc = context;
        this.zzd = aVar;
        this.zze = zzfcoVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfhmVar;
        zzcgzVar.zzw();
        this.zzj = zzdrwVar;
        this.zzq = zzbvwVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfjqVar;
        this.zzl = zzcyrVar;
    }

    public static mf.a zzb(zzdxt zzdxtVar, List list, Exception exc) {
        zzegx zzegxVar;
        n.D.f11582h.zzv(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzegxVar = new zzegx(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzegx) {
            zzegxVar = (zzegx) exc;
        } else {
            zzegxVar = new zzegx(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzegxVar.getMessage() == null ? "" : zzegxVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List listZzf = zzfvt.zzb(zzfup.zzc(':')).zzf(message);
                    if (listZzf.size() == 2) {
                        message = (String) listZzf.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfjm.zzc(zzfjm.zzc((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            zzdxtVar.zzk.zze(arrayList, null);
        }
        return zzgdb.zzg(zzegxVar);
    }

    public static /* synthetic */ mf.a zzc(zzdxt zzdxtVar, JSONObject jSONObject) {
        zzfcc zzfccVar = new zzfcc(zzdxtVar.zze);
        String string = jSONObject.toString();
        return zzgdb.zzh(new zzfcf(zzfccVar, zzfce.zza(new StringReader(string), zzdxtVar.zzp)));
    }

    public static mf.a zzd(zzdxt zzdxtVar, zzbok zzbokVar, JSONObject jSONObject) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcq)).booleanValue()) {
            m1.u(n.D.f11584k, zzdxtVar.zzj.zza(), zzdrk.SCAR_PRELOADER_PROCESSING_DONE.zza());
        }
        return zzbokVar.zzb(jSONObject);
    }

    public static String zzf(zzdxt zzdxtVar, zzdzv zzdzvVar) throws zzegx {
        zzdxtVar.zzi(zzdrk.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i10 = 0;
        int i11 = -1;
        while (true) {
            try {
                zzbct zzbctVar = zzbdc.zzhn;
                t tVar = t.f12227d;
                if (i10 >= ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue()) {
                    throw new zzegx(1, "Received HTTP error code from ad server:" + i11);
                }
                zzdzw zzdzwVarZzb = new zzdzx(zzdxtVar.zzc, zzdxtVar.zzd.f14321a, zzdxtVar.zzq, Binder.getCallingUid()).zza(zzdzvVar);
                int i12 = zzdzwVarZzb.zza;
                if (((Boolean) tVar.f12230c.zzb(zzbdc.zzho)).booleanValue()) {
                    zzdxtVar.zzj.zzd("fr", String.valueOf(i10));
                }
                if (i12 == 200) {
                    zzdxtVar.zzi(zzdrk.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzdzwVarZzb.zzc;
                }
                i10++;
                i11 = i12;
            } catch (Exception e10) {
                throw new zzegx(1, e10.getMessage() == null ? "Fetch failed." : e10.getMessage(), e10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final mf.a zzg(java.lang.String r18, final java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxt.zzg(java.lang.String, java.lang.String):mf.a");
    }

    private final String zzh(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            String strConcat = "Failed to update the ad types for rendering. ".concat(e10.toString());
            int i10 = l0.f13401b;
            k.g(strConcat);
            return str;
        }
    }

    private final void zzi(zzdrk zzdrkVar) {
        Bundle bundleZza = this.zzj.zza();
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzho)).booleanValue()) {
            m1.u(n.D.f11584k, bundleZza, zzdrkVar.zza());
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x024c A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #1 {all -> 0x00e1, blocks: (B:21:0x007a, B:23:0x0096, B:25:0x009c, B:27:0x00b1, B:29:0x00b9, B:37:0x00f4, B:39:0x00fc, B:41:0x0102, B:45:0x010b, B:56:0x0145, B:48:0x011d, B:55:0x012e, B:58:0x014a, B:34:0x00e4, B:59:0x0160, B:66:0x0179, B:69:0x0181, B:73:0x01a5, B:75:0x01ba, B:79:0x01dd, B:81:0x01f2, B:84:0x0206, B:89:0x0219, B:90:0x021a, B:91:0x0227, B:95:0x022b, B:96:0x022c, B:101:0x0242, B:114:0x0253, B:105:0x0246, B:108:0x0249, B:110:0x024b, B:111:0x024c, B:113:0x0252, B:122:0x0266, B:80:0x01e7, B:76:0x01cd, B:72:0x018f, B:63:0x0169, B:64:0x016e, B:112:0x024d, B:97:0x022d, B:99:0x0237, B:85:0x0207, B:87:0x0211), top: B:150:0x007a, inners: #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #1 {all -> 0x00e1, blocks: (B:21:0x007a, B:23:0x0096, B:25:0x009c, B:27:0x00b1, B:29:0x00b9, B:37:0x00f4, B:39:0x00fc, B:41:0x0102, B:45:0x010b, B:56:0x0145, B:48:0x011d, B:55:0x012e, B:58:0x014a, B:34:0x00e4, B:59:0x0160, B:66:0x0179, B:69:0x0181, B:73:0x01a5, B:75:0x01ba, B:79:0x01dd, B:81:0x01f2, B:84:0x0206, B:89:0x0219, B:90:0x021a, B:91:0x0227, B:95:0x022b, B:96:0x022c, B:101:0x0242, B:114:0x0253, B:105:0x0246, B:108:0x0249, B:110:0x024b, B:111:0x024c, B:113:0x0252, B:122:0x0266, B:80:0x01e7, B:76:0x01cd, B:72:0x018f, B:63:0x0169, B:64:0x016e, B:112:0x024d, B:97:0x022d, B:99:0x0237, B:85:0x0207, B:87:0x0211), top: B:150:0x007a, inners: #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01dd A[Catch: all -> 0x00e1, TryCatch #1 {all -> 0x00e1, blocks: (B:21:0x007a, B:23:0x0096, B:25:0x009c, B:27:0x00b1, B:29:0x00b9, B:37:0x00f4, B:39:0x00fc, B:41:0x0102, B:45:0x010b, B:56:0x0145, B:48:0x011d, B:55:0x012e, B:58:0x014a, B:34:0x00e4, B:59:0x0160, B:66:0x0179, B:69:0x0181, B:73:0x01a5, B:75:0x01ba, B:79:0x01dd, B:81:0x01f2, B:84:0x0206, B:89:0x0219, B:90:0x021a, B:91:0x0227, B:95:0x022b, B:96:0x022c, B:101:0x0242, B:114:0x0253, B:105:0x0246, B:108:0x0249, B:110:0x024b, B:111:0x024c, B:113:0x0252, B:122:0x0266, B:80:0x01e7, B:76:0x01cd, B:72:0x018f, B:63:0x0169, B:64:0x016e, B:112:0x024d, B:97:0x022d, B:99:0x0237, B:85:0x0207, B:87:0x0211), top: B:150:0x007a, inners: #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7 A[Catch: all -> 0x00e1, TryCatch #1 {all -> 0x00e1, blocks: (B:21:0x007a, B:23:0x0096, B:25:0x009c, B:27:0x00b1, B:29:0x00b9, B:37:0x00f4, B:39:0x00fc, B:41:0x0102, B:45:0x010b, B:56:0x0145, B:48:0x011d, B:55:0x012e, B:58:0x014a, B:34:0x00e4, B:59:0x0160, B:66:0x0179, B:69:0x0181, B:73:0x01a5, B:75:0x01ba, B:79:0x01dd, B:81:0x01f2, B:84:0x0206, B:89:0x0219, B:90:0x021a, B:91:0x0227, B:95:0x022b, B:96:0x022c, B:101:0x0242, B:114:0x0253, B:105:0x0246, B:108:0x0249, B:110:0x024b, B:111:0x024c, B:113:0x0252, B:122:0x0266, B:80:0x01e7, B:76:0x01cd, B:72:0x018f, B:63:0x0169, B:64:0x016e, B:112:0x024d, B:97:0x022d, B:99:0x0237, B:85:0x0207, B:87:0x0211), top: B:150:0x007a, inners: #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0204 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final mf.a zze() {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxt.zze():mf.a");
    }
}
