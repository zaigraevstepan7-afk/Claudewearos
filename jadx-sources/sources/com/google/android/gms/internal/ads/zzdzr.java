package com.google.android.gms.internal.ads;

import nc.s;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdzr implements zzbon {
    @Override // com.google.android.gms.internal.ads.zzbon
    public final JSONObject zzb(Object obj) throws JSONException {
        zzdzs zzdzsVar = (zzdzs) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjz)).booleanValue()) {
            zzbvq zzbvqVar = zzdzsVar.zzd;
            jSONObject2.put("ad_request_url", zzbvqVar.zzg());
            jSONObject2.put("ad_request_post_body", zzbvqVar.zzf());
        }
        zzbvq zzbvqVar2 = zzdzsVar.zzd;
        jSONObject2.put("base_url", zzbvqVar2.zzd());
        jSONObject2.put("signals", zzdzsVar.zzc);
        zzdzw zzdzwVar = zzdzsVar.zzb;
        jSONObject3.put("body", zzdzwVar.zzc);
        jSONObject3.put("headers", s.f12202f.f12203a.k(zzdzwVar.zzb));
        jSONObject3.put("response_code", zzdzwVar.zza);
        jSONObject3.put("latency", zzdzwVar.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzbvqVar2.zzi());
        return jSONObject;
    }
}
