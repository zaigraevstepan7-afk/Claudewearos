package com.google.android.gms.internal.ads;

import java.util.Map;
import nc.s;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzbmz {
    public static void zza(zzbna zzbnaVar, String str, Map map) {
        try {
            zzbnaVar.zze(str, s.f12202f.f12203a.k(map));
        } catch (JSONException unused) {
            int i10 = l0.f13401b;
            k.g("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbna zzbnaVar, String str, JSONObject jSONObject) {
        StringBuilder sbM = m1.m("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbM.toString();
        int i10 = l0.f13401b;
        k.b("Dispatching AFMA event: ".concat(string));
        zzbnaVar.zza(sbM.toString());
    }

    public static void zzc(zzbna zzbnaVar, String str, String str2) {
        zzbnaVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbna zzbnaVar, String str, JSONObject jSONObject) {
        zzbnaVar.zzb(str, jSONObject.toString());
    }
}
