package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mc.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbpi {
    public final List zza;

    public zzbpi(JSONObject jSONObject) throws JSONException {
        if (k.j(2)) {
            l0.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i10 = -1;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                zzbph zzbphVar = new zzbph(jSONArray.getJSONObject(i11));
                "banner".equalsIgnoreCase(zzbphVar.zzc);
                arrayList.add(zzbphVar);
                if (i10 < 0) {
                    Iterator it = zzbphVar.zza.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i10 = i11;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            n nVar = n.D;
            zzbpj zzbpjVar = nVar.f11596w;
            zzbpj.zza(jSONObjectOptJSONObject, "click_urls");
            zzbpj zzbpjVar2 = nVar.f11596w;
            zzbpj.zza(jSONObjectOptJSONObject, "imp_urls");
            zzbpj zzbpjVar3 = nVar.f11596w;
            zzbpj.zza(jSONObjectOptJSONObject, "downloaded_imp_urls");
            zzbpj zzbpjVar4 = nVar.f11596w;
            zzbpj.zza(jSONObjectOptJSONObject, "nofill_urls");
            zzbpj zzbpjVar5 = nVar.f11596w;
            zzbpj.zza(jSONObjectOptJSONObject, "remote_ping_urls");
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong("refresh", -1L);
            zzbwm.zza(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
