package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;
import mc.n;
import nc.t;
import qc.r0;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbyo {
    public static Uri zza(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i10 = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(str.substring(0, i10));
        m1.s(sb2, str2, "=", str3, "&");
        sb2.append(str.substring(i10));
        return Uri.parse(sb2.toString());
    }

    public static String zzb(Uri uri, Context context, Map map) {
        n nVar = n.D;
        if (!nVar.f11599z.zzp(context)) {
            return uri.toString();
        }
        String strZzb = nVar.f11599z.zzb(context);
        if (strZzb == null) {
            return uri.toString();
        }
        zzbct zzbctVar = zzbdc.zzaw;
        t tVar = t.f12227d;
        String str = (String) tVar.f12230c.zzb(zzbctVar);
        String string = uri.toString();
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzav)).booleanValue() && string.contains(str)) {
            nVar.f11599z.zzj(context, strZzb, (Map) map.get("_ac"));
            return zzd(string, context).replace(str, strZzb);
        }
        if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzau)).booleanValue()) {
                String string2 = zza(zzd(string, context), "fbs_aeid", strZzb).toString();
                nVar.f11599z.zzj(context, strZzb, (Map) map.get("_ac"));
                return string2;
            }
        }
        return string;
    }

    public static String zzc(String str, Context context, boolean z2, Map map) {
        String strZzb;
        zzbct zzbctVar = zzbdc.zzaD;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue() && !z2) {
            return str;
        }
        n nVar = n.D;
        zzbym zzbymVar = nVar.f11599z;
        r0 r0Var = nVar.f11577c;
        zzbym zzbymVar2 = nVar.f11599z;
        if (!zzbymVar.zzp(context) || TextUtils.isEmpty(str) || (strZzb = zzbymVar2.zzb(context)) == null) {
            return str;
        }
        String str2 = (String) zzbdaVar2.zzb(zzbdc.zzaw);
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzav)).booleanValue() && str.contains(str2)) {
            r0Var.getClass();
            if (r0.w(str, r0Var.f13446a, (String) tVar.f12230c.zzb(zzbdc.zzas))) {
                zzbymVar2.zzj(context, strZzb, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, strZzb);
            }
            r0Var.getClass();
            if (!r0.w(str, r0Var.f13447b, (String) tVar.f12230c.zzb(zzbdc.zzat))) {
                return str;
            }
            zzbymVar2.zzk(context, strZzb, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, strZzb);
        }
        if (str.contains("fbs_aeid") || ((Boolean) zzbdaVar2.zzb(zzbdc.zzau)).booleanValue()) {
            return str;
        }
        r0Var.getClass();
        if (r0.w(str, r0Var.f13446a, (String) tVar.f12230c.zzb(zzbdc.zzas))) {
            zzbymVar2.zzj(context, strZzb, (Map) map.get("_ac"));
            return zza(zzd(str, context), "fbs_aeid", strZzb).toString();
        }
        r0Var.getClass();
        if (!r0.w(str, r0Var.f13447b, (String) tVar.f12230c.zzb(zzbdc.zzat))) {
            return str;
        }
        zzbymVar2.zzk(context, strZzb, (Map) map.get("_ai"));
        return zza(zzd(str, context), "fbs_aeid", strZzb).toString();
    }

    private static String zzd(String str, Context context) {
        n nVar = n.D;
        String strZze = nVar.f11599z.zze(context);
        String strZzc = nVar.f11599z.zzc(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZze)) {
            str = zza(str, "gmp_app_id", strZze).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzc)) ? str : zza(str, "fbs_aiid", strZzc).toString();
    }
}
