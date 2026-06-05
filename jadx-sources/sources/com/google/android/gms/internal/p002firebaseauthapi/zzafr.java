package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzafr {
    private String zza;
    private String zzb;
    private String zzc;
    private Long zzd;
    private Long zze;
    private boolean zzf;

    public static zzafr zza(String str) throws UnsupportedEncodingException {
        try {
            zzafr zzafrVar = new zzafr();
            JSONObject jSONObject = new JSONObject(str);
            zzafrVar.zza = jSONObject.optString("iss");
            zzafrVar.zzb = jSONObject.optString("aud");
            zzafrVar.zzc = jSONObject.optString("sub");
            zzafrVar.zzd = Long.valueOf(jSONObject.optLong("iat"));
            zzafrVar.zze = Long.valueOf(jSONObject.optLong("exp"));
            zzafrVar.zzf = jSONObject.optBoolean("is_anonymous");
            return zzafrVar;
        } catch (JSONException e10) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. ".concat(String.valueOf(e10)));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(String.valueOf(e10)));
        }
    }

    public final Long zzb() {
        return this.zzd;
    }

    public final Long zza() {
        return this.zze;
    }
}
