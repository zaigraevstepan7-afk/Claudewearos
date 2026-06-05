package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfby {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfby(JsonReader jsonReader) throws JSONException, IOException {
        JSONObject jSONObjectY = hj.a.Y(jsonReader);
        this.zzd = jSONObjectY;
        this.zza = jSONObjectY.optString("ad_html", null);
        this.zzb = jSONObjectY.optString("ad_base_url", null);
        this.zzc = jSONObjectY.optJSONObject("ad_json");
    }
}
