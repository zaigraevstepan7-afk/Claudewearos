package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzahb implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzahb() {
    }

    public static zzahb zza(String str, String str2, boolean z2) {
        zzahb zzahbVar = new zzahb();
        e0.e(str);
        zzahbVar.zzb = str;
        e0.e(str2);
        zzahbVar.zzc = str2;
        zzahbVar.zzf = z2;
        return zzahbVar;
    }

    public static zzahb zzb(String str, String str2, boolean z2) {
        zzahb zzahbVar = new zzahb();
        e0.e(str);
        zzahbVar.zza = str;
        e0.e(str2);
        zzahbVar.zzd = str2;
        zzahbVar.zzf = z2;
        return zzahbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
