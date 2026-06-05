package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.e0;
import ig.b;
import ig.d;
import org.json.JSONException;
import org.json.JSONObject;
import qd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class zzaeo implements zzacr {
    private static final String zza = "zzaeo";
    private static final a zzb = new a(zza, new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzaeo(d dVar, String str, String str2) {
        String str3 = dVar.f8529a;
        e0.e(str3);
        this.zzc = str3;
        String str4 = dVar.f8531c;
        e0.e(str4);
        this.zzd = str4;
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        b bVar;
        String str = this.zzd;
        int i10 = b.f8516c;
        e0.e(str);
        try {
            bVar = new b(str);
        } catch (IllegalArgumentException unused) {
            bVar = null;
        }
        String str2 = bVar != null ? bVar.f8517a : null;
        String str3 = bVar != null ? bVar.f8518b : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzahe.zza(jSONObject, "captchaResp", str5);
        } else {
            zzahe.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
