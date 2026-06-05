package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class zzaek implements zzacu<zzaek> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzaek";
    private String zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacu
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaek zza(String str) throws zzaah {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            this.zzc = jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e10) {
            Log.e(zza, "Failed to parse error for string [" + str + "] with exception: " + e10.getMessage());
            throw new zzaah(m1.j("Failed to parse error for string [", str, "]"), e10);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
