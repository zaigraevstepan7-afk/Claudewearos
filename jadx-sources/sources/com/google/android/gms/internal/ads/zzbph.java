package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mc.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbph {
    public final List zza;
    public final String zzb;
    public final String zzc;

    public zzbph(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        n nVar = n.D;
        zzbpj zzbpjVar = nVar.f11596w;
        zzbpj.zza(jSONObject, "clickurl");
        zzbpj zzbpjVar2 = nVar.f11596w;
        zzbpj.zza(jSONObject, "imp_urls");
        zzbpj zzbpjVar3 = nVar.f11596w;
        zzbpj.zza(jSONObject, "downloaded_imp_urls");
        zzbpj zzbpjVar4 = nVar.f11596w;
        zzbpj.zza(jSONObject, "fill_urls");
        zzbpj zzbpjVar5 = nVar.f11596w;
        zzbpj.zza(jSONObject, "video_start_urls");
        zzbpj zzbpjVar6 = nVar.f11596w;
        zzbpj.zza(jSONObject, "video_complete_urls");
        zzbpj zzbpjVar7 = nVar.f11596w;
        zzbpj.zza(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            zzbpj zzbpjVar8 = nVar.f11596w;
            zzbpj.zza(jSONObjectOptJSONObject, "manual_impression_urls");
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.zzb = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        zzbpj zzbpjVar9 = nVar.f11596w;
        zzbpj.zza(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.zzc = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
